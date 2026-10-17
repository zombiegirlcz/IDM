package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class zzgo extends zzmd implements zzni {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zzgo f40127zzb;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private int f40128zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private long f40129zze;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private int f40131zzg;

    /* JADX INFO: renamed from: zzl, reason: collision with root package name */
    private boolean f40136zzl;
    private zzgi zzq;
    private zzgs zzr;
    private zzgy zzs;
    private zzgu zzt;
    private zzgq zzu;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private String f40130zzf = "";

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private zzmj f40132zzh = zzmd.zzcn();

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    private zzmj f40133zzi = zzmd.zzcn();

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    private zzmj f40134zzj = zzmd.zzcn();

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    private String f40135zzk = "";
    private zzmj zzm = zzmd.zzcn();
    private zzmj zzn = zzmd.zzcn();
    private String zzo = "";
    private String zzp = "";

    static {
        zzgo zzgoVar = new zzgo();
        f40127zzb = zzgoVar;
        zzmd.zzct(zzgo.class, zzgoVar);
    }

    private zzgo() {
    }

    public static zzgn zzf() {
        return (zzgn) f40127zzb.zzcg();
    }

    public static zzgo zzh() {
        return f40127zzb;
    }

    public static /* synthetic */ void zzs(zzgo zzgoVar, int i, zzgm zzgmVar) {
        zzgmVar.getClass();
        zzmj zzmjVar = zzgoVar.f40133zzi;
        if (!zzmjVar.zzc()) {
            zzgoVar.f40133zzi = zzmd.zzco(zzmjVar);
        }
        zzgoVar.f40133zzi.set(i, zzgmVar);
    }

    public final int zza() {
        return this.zzm.size();
    }

    public final int zzb() {
        return this.f40133zzi.size();
    }

    public final long zzc() {
        return this.f40129zze;
    }

    public final zzgi zzd() {
        zzgi zzgiVar = this.zzq;
        return zzgiVar == null ? zzgi.zzb() : zzgiVar;
    }

    public final zzgm zze(int i) {
        return (zzgm) this.f40133zzi.get(i);
    }

    public final zzgy zzi() {
        zzgy zzgyVar = this.zzs;
        return zzgyVar == null ? zzgy.zzc() : zzgyVar;
    }

    public final String zzj() {
        return this.f40130zzf;
    }

    public final String zzk() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    public final Object zzl(int i, Object obj2, Object obj3) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzmd.zzcq(f40127zzb, "\u0004\u0011\u0000\u0001\u0001\u0013\u0011\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\u000eဈ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011ဉ\t\u0012ဉ\n\u0013ဉ\u000b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", zzgw.class, "zzi", zzgm.class, "zzj", zzfh.class, "zzk", "zzl", "zzm", zziv.class, "zzn", zzgk.class, "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu"});
        }
        if (i2 == 3) {
            return new zzgo();
        }
        zzgz zzgzVar = null;
        if (i2 == 4) {
            return new zzgn(zzgzVar);
        }
        if (i2 == 5) {
            return f40127zzb;
        }
        throw null;
    }

    public final List zzm() {
        return this.f40134zzj;
    }

    public final List zzn() {
        return this.zzn;
    }

    public final List zzo() {
        return this.zzm;
    }

    public final List zzp() {
        return this.f40132zzh;
    }

    public final boolean zzt() {
        return (this.f40128zzd & 128) != 0;
    }

    public final boolean zzu() {
        return (this.f40128zzd & 2) != 0;
    }

    public final boolean zzv() {
        return (this.f40128zzd & 512) != 0;
    }

    public final boolean zzw() {
        return (this.f40128zzd & 1) != 0;
    }
}
