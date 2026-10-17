package com.google.android.gms.internal.fido;

/* JADX INFO: loaded from: classes16.dex */
public final class zzaq implements zzbp {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public static final /* synthetic */ int f39285zza = 0;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static volatile zzaj f39286zzb = new zzaj(zzap.f39284zza);

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final String f39288zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private final Object f39289zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private volatile zzao f39290zzf;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private volatile Object f39292zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    private final zzak f39293zzi;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private volatile int f39291zzg = -1;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final String f39287zzc = "com.google.android.gms.fido";

    public zzaq(String str, String str2, Object obj2, zzak zzakVar, boolean z) {
        this.f39288zzd = str2;
        this.f39289zze = obj2;
        this.f39293zzi = zzakVar;
    }

    @Override // com.google.android.gms.internal.fido.zzbp
    public final Object zza() {
        zzae.zza();
        synchronized (this) {
            zzae.zzb();
            int i = zzan.f39282zza;
            throw null;
        }
    }
}
