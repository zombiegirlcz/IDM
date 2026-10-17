package com.google.android.gms.internal.nearby;

import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.nearby.messages.MessageListener;
import com.google.android.gms.nearby.messages.internal.Update;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class zznn extends com.google.android.gms.nearby.messages.internal.zzn {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final ListenerHolder f45520zza;

    public zznn(ListenerHolder listenerHolder) {
        this.f45520zza = listenerHolder;
    }

    public static void zzb(Intent intent, MessageListener messageListener) {
        Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.nearby.messages.UPDATES");
        Iterable parcelableArrayList = bundleExtra == null ? Collections.EMPTY_LIST : bundleExtra.getParcelableArrayList("com.google.android.gms.nearby.messages.UPDATES");
        if (parcelableArrayList == null) {
            return;
        }
        zzc(parcelableArrayList, messageListener);
    }

    public static void zzc(Iterable iterable, MessageListener messageListener) {
        com.google.android.gms.nearby.messages.internal.zza zzaVar;
        com.google.android.gms.nearby.messages.internal.zze zzeVar;
        Iterator it8 = iterable.iterator();
        while (it8.hasNext()) {
            Update update = (Update) it8.next();
            if (update.zza(1)) {
                messageListener.onFound(update.f48079zzc);
            }
            if (update.zza(2)) {
                messageListener.onLost(update.f48079zzc);
            }
            if (update.zza(4) && (zzeVar = update.f48080zzd) != null) {
                messageListener.onDistanceChanged(update.f48079zzc, zzeVar);
            }
            if (update.zza(8) && (zzaVar = update.f48081zze) != null) {
                messageListener.onBleSignalChanged(update.f48079zzc, zzaVar);
            }
            update.zza(16);
        }
    }

    @Override // com.google.android.gms.nearby.messages.internal.zzo
    public final void zzd(List list) throws RemoteException {
        this.f45520zza.notifyListener(new zznm(this, list));
    }
}
