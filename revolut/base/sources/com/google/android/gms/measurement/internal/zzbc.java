package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import j6.a;
import java.util.Iterator;

/* JADX INFO: loaded from: classes16.dex */
public final class zzbc {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final String f46931zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final String f46932zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final String f46933zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    final long f46934zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    final long f46935zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    final zzbf f46936zzf;

    public zzbc(zzio zzioVar, String str, String str2, String str3, long j2, long j3, Bundle bundle) {
        zzbf zzbfVar;
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        this.f46931zza = str2;
        this.f46932zzb = str3;
        this.f46933zzc = true == TextUtils.isEmpty(str) ? null : str;
        this.f46934zzd = j2;
        this.f46935zze = j3;
        if (j3 != 0 && j3 > j2) {
            zzioVar.zzaW().zzk().zzb("Event created with reverse previous/current timestamps. appId", zzhe.zzn(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            zzbfVar = new zzbf(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it8 = bundle2.keySet().iterator();
            while (it8.hasNext()) {
                String next = it8.next();
                if (next == null) {
                    zzioVar.zzaW().zze().zza("Param name can't be null");
                    it8.remove();
                } else {
                    Object objZzD = zzioVar.zzw().zzD(next, bundle2.get(next));
                    if (objZzD == null) {
                        zzioVar.zzaW().zzk().zzb("Param value can't be null", zzioVar.zzj().zze(next));
                        it8.remove();
                    } else {
                        zzioVar.zzw().zzS(bundle2, next, objZzD);
                    }
                }
            }
            zzbfVar = new zzbf(bundle2);
        }
        this.f46936zzf = zzbfVar;
    }

    public final String toString() {
        String string = this.f46936zzf.toString();
        StringBuilder sb6 = new StringBuilder("Event{appId='");
        sb6.append(this.f46931zza);
        sb6.append("', name='");
        return a.w(sb6, this.f46932zzb, "', params=", string, "}");
    }

    public final zzbc zza(zzio zzioVar, long j2) {
        return new zzbc(zzioVar, this.f46933zzc, this.f46931zza, this.f46932zzb, this.f46934zzd, j2, this.f46936zzf);
    }

    private zzbc(zzio zzioVar, String str, String str2, String str3, long j2, long j3, zzbf zzbfVar) {
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        Preconditions.checkNotNull(zzbfVar);
        this.f46931zza = str2;
        this.f46932zzb = str3;
        this.f46933zzc = true == TextUtils.isEmpty(str) ? null : str;
        this.f46934zzd = j2;
        this.f46935zze = j3;
        if (j3 != 0 && j3 > j2) {
            zzioVar.zzaW().zzk().zzc("Event created with reverse previous/current timestamps. appId, name", zzhe.zzn(str2), zzhe.zzn(str3));
        }
        this.f46936zzf = zzbfVar;
    }
}
