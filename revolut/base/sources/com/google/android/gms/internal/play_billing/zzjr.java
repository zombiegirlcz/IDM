package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes16.dex */
public final class zzjr extends zzfu implements zzhc {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zzjr f46217zzb;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private int f46218zzd;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private int f46222zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    private long f46223zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    private long f46224zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    private boolean f46225zzk;

    /* JADX INFO: renamed from: zzl, reason: collision with root package name */
    private int f46226zzl;
    private int zzm;
    private long zzn;
    private int zzs;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private String f46219zze = "";

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private String f46220zzf = "";

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private String f46221zzg = "";
    private String zzo = "";
    private String zzp = "";
    private String zzq = "";
    private String zzr = "";

    static {
        zzjr zzjrVar = new zzjr();
        f46217zzb = zzjrVar;
        zzfu.zzB(zzjr.class, zzjrVar);
    }

    private zzjr() {
    }

    public static /* synthetic */ void zzG(zzjr zzjrVar, long j2) {
        zzjrVar.f46218zzd |= 512;
        zzjrVar.zzn = 846465066L;
    }

    public static /* synthetic */ void zzH(zzjr zzjrVar, String str) {
        str.getClass();
        zzjrVar.f46218zzd |= 4;
        zzjrVar.f46221zzg = str;
    }

    public static /* synthetic */ void zzI(zzjr zzjrVar, String str) {
        str.getClass();
        zzjrVar.f46218zzd |= 1024;
        zzjrVar.zzo = str;
    }

    public static /* synthetic */ void zzJ(zzjr zzjrVar, String str) {
        str.getClass();
        zzjrVar.f46218zzd |= 8192;
        zzjrVar.zzr = str;
    }

    public static /* synthetic */ void zzK(zzjr zzjrVar, String str) {
        str.getClass();
        zzjrVar.f46218zzd |= 4096;
        zzjrVar.zzq = str;
    }

    public static /* synthetic */ void zzL(zzjr zzjrVar, String str) {
        str.getClass();
        zzjrVar.f46218zzd |= 2048;
        zzjrVar.zzp = str;
    }

    public static /* synthetic */ void zzM(zzjr zzjrVar, int i) {
        zzjrVar.f46218zzd |= 16384;
        zzjrVar.zzs = i;
    }

    public static /* synthetic */ void zzN(zzjr zzjrVar, boolean z) {
        zzjrVar.f46218zzd |= 64;
        zzjrVar.f46225zzk = z;
    }

    public static /* synthetic */ void zzO(zzjr zzjrVar, String str) {
        str.getClass();
        zzjrVar.f46218zzd |= 1;
        zzjrVar.f46219zze = str;
    }

    public static /* synthetic */ void zzP(zzjr zzjrVar, String str) {
        zzjrVar.f46218zzd |= 2;
        zzjrVar.f46220zzf = str;
    }

    public static zzjp zza() {
        return (zzjp) f46217zzb.zzp();
    }

    public static /* synthetic */ void zzc(zzjr zzjrVar, int i) {
        zzjrVar.f46218zzd |= 128;
        zzjrVar.f46226zzl = i;
    }

    public static /* synthetic */ void zze(zzjr zzjrVar, int i) {
        zzjrVar.f46218zzd |= 256;
        zzjrVar.zzm = i;
    }

    public static /* synthetic */ void zzf(zzjr zzjrVar, int i) {
        zzjrVar.f46218zzd |= 8;
        zzjrVar.f46222zzh = i;
    }

    public static /* synthetic */ void zzg(zzjr zzjrVar, long j2) {
        zzjrVar.f46218zzd |= 16;
        zzjrVar.f46223zzi = j2;
    }

    public static /* synthetic */ void zzh(zzjr zzjrVar, long j2) {
        zzjrVar.f46218zzd |= 32;
        zzjrVar.f46224zzj = j2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfu
    public final Object zzd(int i, Object obj2, Object obj3) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzfu.zzy(f46217zzb, "\u0004\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0002\u0003င\u0003\u0004ဂ\u0004\u0005ဈ\u0001\u0006ဂ\u0005\u0007ဇ\u0006\bင\u0007\tင\b\nဂ\t\u000bဈ\n\fဈ\u000b\rဈ\f\u000eဈ\r\u000fင\u000e", new Object[]{"zzd", "zze", "zzg", "zzh", "zzi", "zzf", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs"});
        }
        if (i2 == 3) {
            return new zzjr();
        }
        zzjq zzjqVar = null;
        if (i2 == 4) {
            return new zzjp(zzjqVar);
        }
        if (i2 == 5) {
            return f46217zzb;
        }
        throw null;
    }
}
