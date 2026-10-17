package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class zzfv extends zzmd implements zzni {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zzfv f40085zzb;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private int f40086zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private int f40087zze;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private boolean f40089zzg;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private String f40088zzf = "";

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private zzmj f40090zzh = zzmd.zzcn();

    static {
        zzfv zzfvVar = new zzfv();
        f40085zzb = zzfvVar;
        zzmd.zzct(zzfv.class, zzfvVar);
    }

    private zzfv() {
    }

    public static zzfv zzc() {
        return f40085zzb;
    }

    public final int zza() {
        return this.f40090zzh.size();
    }

    public final String zzd() {
        return this.f40088zzf;
    }

    public final List zze() {
        return this.f40090zzh;
    }

    public final boolean zzf() {
        return this.f40089zzg;
    }

    public final boolean zzg() {
        return (this.f40086zzd & 4) != 0;
    }

    public final boolean zzh() {
        return (this.f40086zzd & 2) != 0;
    }

    public final boolean zzi() {
        return (this.f40086zzd & 1) != 0;
    }

    public final int zzj() {
        int iZza = zzfu.zza(this.f40087zze);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    public final Object zzl(int i, Object obj2, Object obj3) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzmd.zzcq(f40085zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzd", "zze", zzft.f40084zza, "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzfv();
        }
        zzfw zzfwVar = null;
        if (i2 == 4) {
            return new zzfs(zzfwVar);
        }
        if (i2 == 5) {
            return f40085zzb;
        }
        throw null;
    }
}
