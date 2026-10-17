package com.google.android.gms.internal.fido;

/* JADX INFO: loaded from: classes16.dex */
public final class zzae {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final Object f39268zza = new Object();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zzai f39269zzb = new zzai();

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static volatile zzae f39270zzc = null;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static volatile zzae f39271zzd = null;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private static final zzbp f39272zze = zzbt.zza(new zzbp() { // from class: com.google.android.gms.internal.fido.zzad
        @Override // com.google.android.gms.internal.fido.zzbp
        public final Object zza() {
            throw null;
        }
    });

    public static zzae zza() {
        zzah.zza();
        zzah.zzb();
        zzah.zzd();
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }

    public static boolean zzb() {
        zzah.zzd();
        zzah.zzc();
        return false;
    }
}
