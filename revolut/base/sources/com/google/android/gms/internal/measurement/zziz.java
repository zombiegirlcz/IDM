package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class zziz extends zzmd implements zzni {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zziz f40292zzb;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private int f40293zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private int f40294zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private zzmj f40295zzf = zzmd.zzcn();

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private String f40296zzg = "";

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private String f40297zzh = "";

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    private boolean f40298zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    private double f40299zzj;

    static {
        zziz zzizVar = new zziz();
        f40292zzb = zzizVar;
        zzmd.zzct(zziz.class, zzizVar);
    }

    private zziz() {
    }

    public final double zza() {
        return this.f40299zzj;
    }

    public final String zzc() {
        return this.f40296zzg;
    }

    public final String zzd() {
        return this.f40297zzh;
    }

    public final List zze() {
        return this.f40295zzf;
    }

    public final boolean zzf() {
        return this.f40298zzi;
    }

    public final boolean zzg() {
        return (this.f40293zzd & 8) != 0;
    }

    public final boolean zzh() {
        return (this.f40293zzd & 16) != 0;
    }

    public final boolean zzi() {
        return (this.f40293zzd & 4) != 0;
    }

    public final int zzj() {
        int iZza = zziy.zza(this.f40294zze);
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
            return zzmd.zzcq(f40292zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zzd", "zze", zzix.f40291zza, "zzf", zziz.class, "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new zziz();
        }
        zzja zzjaVar = null;
        if (i2 == 4) {
            return new zziw(zzjaVar);
        }
        if (i2 == 5) {
            return f40292zzb;
        }
        throw null;
    }
}
