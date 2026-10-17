package qd;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzjt;
import com.google.android.gms.measurement.internal.zzmg;
import com.google.common.collect.ImmutableSet;
import com.google.firebase.abt.AbtException;
import java.text.ParseException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import td.c;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cf.b f244816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f244817b = null;

    public b(cf.b bVar) {
        this.f244816a = bVar;
    }

    public static boolean a(ArrayList arrayList, a aVar) {
        String str = aVar.f244813a;
        String str2 = aVar.f244814b;
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            a aVar2 = (a) it8.next();
            if (aVar2.f244813a.equals(str) && aVar2.f244814b.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public final ArrayList b() {
        c cVar = (c) ((td.b) this.f244816a.get());
        cVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : cVar.f269904a.getConditionalUserProperties("frc", "")) {
            ImmutableSet immutableSet = ud.a.f279055a;
            Preconditions.checkNotNull(bundle);
            td.a aVar = new td.a();
            aVar.f269894a = (String) Preconditions.checkNotNull((String) zzjt.zza(bundle, "origin", String.class, null));
            aVar.f269895b = (String) Preconditions.checkNotNull((String) zzjt.zza(bundle, "name", String.class, null));
            aVar.f269896c = zzjt.zza(bundle, "value", Object.class, null);
            aVar.d = (String) zzjt.zza(bundle, "trigger_event_name", String.class, null);
            aVar.e = ((Long) zzjt.zza(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            aVar.f = (String) zzjt.zza(bundle, "timed_out_event_name", String.class, null);
            aVar.f269897g = (Bundle) zzjt.zza(bundle, "timed_out_event_params", Bundle.class, null);
            aVar.f269898h = (String) zzjt.zza(bundle, "triggered_event_name", String.class, null);
            aVar.i = (Bundle) zzjt.zza(bundle, "triggered_event_params", Bundle.class, null);
            aVar.f269899j = ((Long) zzjt.zza(bundle, "time_to_live", Long.class, 0L)).longValue();
            aVar.k = (String) zzjt.zza(bundle, "expired_event_name", String.class, null);
            aVar.f269900l = (Bundle) zzjt.zza(bundle, "expired_event_params", Bundle.class, null);
            aVar.f269902n = ((Boolean) zzjt.zza(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            aVar.f269901m = ((Long) zzjt.zza(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            aVar.o = ((Long) zzjt.zza(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
            arrayList.add(aVar);
        }
        return arrayList;
    }

    public final void c(ArrayList arrayList) throws AbtException {
        Object obj2;
        String str;
        String str2;
        String str3;
        cf.b bVar = this.f244816a;
        if (bVar.get() == null) {
            throw new AbtException("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
        ArrayList<a> arrayList2 = new ArrayList();
        Iterator it8 = arrayList.iterator();
        while (true) {
            if (!it8.hasNext()) {
                if (arrayList2.isEmpty()) {
                    if (bVar.get() == null) {
                        throw new AbtException("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
                    }
                    Iterator it9 = b().iterator();
                    while (it9.hasNext()) {
                        ((c) ((td.b) bVar.get())).f269904a.clearConditionalUserProperty(((td.a) it9.next()).f269895b, null, null);
                    }
                    return;
                }
                if (bVar.get() == null) {
                    throw new AbtException("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
                }
                ArrayList<td.a> arrayListB = b();
                ArrayList<a> arrayList3 = new ArrayList();
                for (td.a aVar : arrayListB) {
                    String[] strArr = a.f244811g;
                    String str4 = aVar.d;
                    arrayList3.add(new a(aVar.f269895b, String.valueOf(aVar.f269896c), str4 != null ? str4 : "", new Date(aVar.f269901m), aVar.e, aVar.f269899j));
                }
                ArrayList arrayList4 = new ArrayList();
                for (a aVar2 : arrayList3) {
                    if (!a(arrayList2, aVar2)) {
                        arrayList4.add(aVar2.a());
                    }
                }
                Iterator it10 = arrayList4.iterator();
                while (it10.hasNext()) {
                    ((c) ((td.b) bVar.get())).f269904a.clearConditionalUserProperty(((td.a) it10.next()).f269895b, null, null);
                }
                ArrayList<a> arrayList5 = new ArrayList();
                for (a aVar3 : arrayList2) {
                    if (!a(arrayList3, aVar3)) {
                        arrayList5.add(aVar3);
                    }
                }
                ArrayDeque arrayDeque = new ArrayDeque(b());
                if (this.f244817b == null) {
                    this.f244817b = Integer.valueOf(((c) ((td.b) bVar.get())).f269904a.getMaxUserProperties("frc"));
                }
                int iIntValue = this.f244817b.intValue();
                for (a aVar4 : arrayList5) {
                    while (arrayDeque.size() >= iIntValue) {
                        ((c) ((td.b) bVar.get())).f269904a.clearConditionalUserProperty(((td.a) arrayDeque.pollFirst()).f269895b, null, null);
                    }
                    td.a aVarA = aVar4.a();
                    c cVar = (c) ((td.b) bVar.get());
                    cVar.getClass();
                    ImmutableSet immutableSet = ud.a.f279055a;
                    String str5 = aVarA.f269894a;
                    if (str5 != null && !str5.isEmpty() && (((obj2 = aVarA.f269896c) == null || zzmg.zza(obj2) != null) && ud.a.c(str5) && ud.a.d(str5, aVarA.f269895b) && (((str = aVarA.k) == null || (ud.a.b(aVarA.f269900l, str) && ud.a.a(str5, aVarA.k, aVarA.f269900l))) && (((str2 = aVarA.f269898h) == null || (ud.a.b(aVarA.i, str2) && ud.a.a(str5, aVarA.f269898h, aVarA.i))) && ((str3 = aVarA.f) == null || (ud.a.b(aVarA.f269897g, str3) && ud.a.a(str5, aVarA.f, aVarA.f269897g))))))) {
                        AppMeasurementSdk appMeasurementSdk = cVar.f269904a;
                        Bundle bundle = new Bundle();
                        String str6 = aVarA.f269894a;
                        if (str6 != null) {
                            bundle.putString("origin", str6);
                        }
                        String str7 = aVarA.f269895b;
                        if (str7 != null) {
                            bundle.putString("name", str7);
                        }
                        Object obj3 = aVarA.f269896c;
                        if (obj3 != null) {
                            zzjt.zzb(bundle, obj3);
                        }
                        String str8 = aVarA.d;
                        if (str8 != null) {
                            bundle.putString("trigger_event_name", str8);
                        }
                        bundle.putLong("trigger_timeout", aVarA.e);
                        String str9 = aVarA.f;
                        if (str9 != null) {
                            bundle.putString("timed_out_event_name", str9);
                        }
                        Bundle bundle2 = aVarA.f269897g;
                        if (bundle2 != null) {
                            bundle.putBundle("timed_out_event_params", bundle2);
                        }
                        String str10 = aVarA.f269898h;
                        if (str10 != null) {
                            bundle.putString("triggered_event_name", str10);
                        }
                        Bundle bundle3 = aVarA.i;
                        if (bundle3 != null) {
                            bundle.putBundle("triggered_event_params", bundle3);
                        }
                        bundle.putLong("time_to_live", aVarA.f269899j);
                        String str11 = aVarA.k;
                        if (str11 != null) {
                            bundle.putString("expired_event_name", str11);
                        }
                        Bundle bundle4 = aVarA.f269900l;
                        if (bundle4 != null) {
                            bundle.putBundle("expired_event_params", bundle4);
                        }
                        bundle.putLong("creation_timestamp", aVarA.f269901m);
                        bundle.putBoolean("active", aVarA.f269902n);
                        bundle.putLong("triggered_timestamp", aVarA.o);
                        appMeasurementSdk.setConditionalUserProperty(bundle);
                    }
                    arrayDeque.offer(aVarA);
                }
                return;
            }
            Map map = (Map) it8.next();
            String[] strArr2 = a.f244811g;
            ArrayList arrayList6 = new ArrayList();
            String[] strArr3 = a.f244811g;
            for (int i = 0; i < 5; i++) {
                String str12 = strArr3[i];
                if (!map.containsKey(str12)) {
                    arrayList6.add(str12);
                }
            }
            if (!arrayList6.isEmpty()) {
                throw new AbtException(String.format("The following keys are missing from the experiment info map: %s", arrayList6));
            }
            try {
                arrayList2.add(new a((String) map.get("experimentId"), (String) map.get("variantId"), map.containsKey("triggerEvent") ? (String) map.get("triggerEvent") : "", a.f244812h.parse((String) map.get("experimentStartTime")), Long.parseLong((String) map.get("triggerTimeoutMillis")), Long.parseLong((String) map.get("timeToLiveMillis"))));
            } catch (NumberFormatException e) {
                throw new AbtException("Could not process experiment: one of the durations could not be converted into a long.", e);
            } catch (ParseException e2) {
                throw new AbtException("Could not process experiment: parsing experiment start time failed.", e2);
            }
        }
    }
}
