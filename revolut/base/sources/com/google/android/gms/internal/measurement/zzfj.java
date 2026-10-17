package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class zzfj extends zzmd implements zzni {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zzfj f40052zzb;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private int f40053zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private int f40054zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private String f40055zzf = "";

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private zzmj f40056zzg = zzmd.zzcn();

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private boolean f40057zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    private zzfp f40058zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    private boolean f40059zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    private boolean f40060zzk;

    /* JADX INFO: renamed from: zzl, reason: collision with root package name */
    private boolean f40061zzl;

    static {
        zzfj zzfjVar = new zzfj();
        f40052zzb = zzfjVar;
        zzmd.zzct(zzfj.class, zzfjVar);
    }

    private zzfj() {
    }

    public static zzfi zzc() {
        return (zzfi) f40052zzb.zzcg();
    }

    public static /* synthetic */ void zzi(zzfj zzfjVar, String str) {
        zzfjVar.f40053zzd |= 2;
        zzfjVar.f40055zzf = str;
    }

    public static /* synthetic */ void zzj(zzfj zzfjVar, int i, zzfl zzflVar) {
        zzflVar.getClass();
        zzmj zzmjVar = zzfjVar.f40056zzg;
        if (!zzmjVar.zzc()) {
            zzfjVar.f40056zzg = zzmd.zzco(zzmjVar);
        }
        zzfjVar.f40056zzg.set(i, zzflVar);
    }

    public final int zza() {
        return this.f40056zzg.size();
    }

    public final int zzb() {
        return this.f40054zze;
    }

    public final zzfl zze(int i) {
        return (zzfl) this.f40056zzg.get(i);
    }

    public final zzfp zzf() {
        zzfp zzfpVar = this.f40058zzi;
        return zzfpVar == null ? zzfp.zzb() : zzfpVar;
    }

    public final String zzg() {
        return this.f40055zzf;
    }

    public final List zzh() {
        return this.f40056zzg;
    }

    public final boolean zzk() {
        return this.f40059zzj;
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    public final Object zzl(int i, Object obj2, Object obj3) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzmd.zzcq(f40052zzb, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", zzfl.class, "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i2 == 3) {
            return new zzfj();
        }
        zzfw zzfwVar = null;
        if (i2 == 4) {
            return new zzfi(zzfwVar);
        }
        if (i2 == 5) {
            return f40052zzb;
        }
        throw null;
    }

    public final boolean zzm() {
        return this.f40060zzk;
    }

    public final boolean zzn() {
        return this.f40061zzl;
    }

    public final boolean zzo() {
        return (this.f40053zzd & 8) != 0;
    }

    public final boolean zzp() {
        return (this.f40053zzd & 1) != 0;
    }

    public final boolean zzq() {
        return (this.f40053zzd & 64) != 0;
    }
}
