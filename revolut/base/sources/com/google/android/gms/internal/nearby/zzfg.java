package com.google.android.gms.internal.nearby;

import androidx.collection.ArrayMap;
import androidx.collection.ArraySet;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes16.dex */
public final class zzfg {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final Map f45157zza = new ArrayMap();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final Map f45158zzb = new ArrayMap();

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final Set f45159zzc = new ArraySet();

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final Map f45160zzd = new ArrayMap();

    private zzfg() {
    }

    public static synchronized zzfg zzd(GoogleApi googleApi, Api.ApiOptions apiOptions) {
        zzff zzffVar;
        Map map;
        try {
            zzffVar = new zzff(googleApi, null);
            map = f45157zza;
            if (!map.containsKey(zzffVar)) {
                map.put(zzffVar, new zzfg());
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return (zzfg) map.get(zzffVar);
    }

    private final Object zzi(String str) {
        if (!this.f45160zzd.containsKey(str)) {
            this.f45160zzd.put(str, new Object());
        }
        return this.f45160zzd.get(str);
    }

    public final synchronized ListenerHolder.ListenerKey zza(String str, String str2) {
        return ListenerHolders.createListenerKey(zzi(str), "connection");
    }

    public final synchronized ListenerHolder zzb(GoogleApi googleApi, Object obj2, String str) {
        ListenerHolder listenerHolderRegisterListener;
        try {
            Preconditions.checkNotNull(obj2);
            listenerHolderRegisterListener = googleApi.registerListener(obj2, str);
            ListenerHolder.ListenerKey listenerKey = (ListenerHolder.ListenerKey) Preconditions.checkNotNull(listenerHolderRegisterListener.getListenerKey(), "Key must not be null");
            Set arraySet = (Set) this.f45158zzb.get(str);
            if (arraySet == null) {
                arraySet = new ArraySet();
                this.f45158zzb.put(str, arraySet);
            }
            arraySet.add(listenerKey);
        } catch (Throwable th10) {
            throw th10;
        }
        return listenerHolderRegisterListener;
    }

    public final synchronized ListenerHolder zzc(GoogleApi googleApi, String str, String str2) {
        return zzb(googleApi, zzi(str), "connection");
    }

    public final synchronized Task zze(GoogleApi googleApi, RegistrationMethods registrationMethods) {
        ListenerHolder.ListenerKey listenerKey;
        listenerKey = (ListenerHolder.ListenerKey) Preconditions.checkNotNull(registrationMethods.register.getListenerKey(), "Key must not be null");
        return googleApi.doRegisterEventListener(registrationMethods).addOnFailureListener(new zzfe(this, googleApi, listenerKey, this.f45159zzc.add(listenerKey)));
    }

    public final synchronized Task zzf(GoogleApi googleApi, String str) {
        ArraySet arraySet = new ArraySet();
        Set set = (Set) this.f45158zzb.get(str);
        if (set == null) {
            return Tasks.whenAll(arraySet);
        }
        for (ListenerHolder.ListenerKey listenerKey : new ArraySet(set)) {
            if (this.f45159zzc.contains(listenerKey)) {
                arraySet.add(zzg(googleApi, listenerKey));
            }
        }
        this.f45158zzb.remove(str);
        return Tasks.whenAll(arraySet);
    }

    public final synchronized Task zzg(GoogleApi googleApi, ListenerHolder.ListenerKey listenerKey) {
        String str;
        try {
            this.f45159zzc.remove(listenerKey);
            Iterator it8 = this.f45158zzb.keySet().iterator();
            while (true) {
                if (!it8.hasNext()) {
                    str = null;
                    break;
                }
                str = (String) it8.next();
                Set set = (Set) this.f45158zzb.get(str);
                if (set.contains(listenerKey)) {
                    set.remove(listenerKey);
                    break;
                }
            }
            if (str != null) {
                Iterator it9 = this.f45160zzd.entrySet().iterator();
                while (true) {
                    if (!it9.hasNext()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it9.next();
                    if (ListenerHolders.createListenerKey(entry.getValue(), str).equals(listenerKey)) {
                        this.f45160zzd.remove(entry.getKey());
                        break;
                    }
                }
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return googleApi.doUnregisterEventListener(listenerKey);
    }
}
