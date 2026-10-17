package com.google.android.gms.internal.fido;

import java.security.MessageDigest;
import java.util.Arrays;

/* JADX INFO: loaded from: classes16.dex */
final class zzfz extends zzfp {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final MessageDigest f39463zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final int f39464zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private boolean f39465zzc;

    public /* synthetic */ zzfz(MessageDigest messageDigest, int i, zzfy zzfyVar) {
        this.f39463zza = messageDigest;
        this.f39464zzb = i;
    }

    private final void zzd() {
        zzbm.zzf(!this.f39465zzc, "Cannot re-use a Hasher after calling hash() on it");
    }

    @Override // com.google.android.gms.internal.fido.zzfp
    public final void zzb(byte[] bArr, int i, int i2) {
        zzd();
        this.f39463zza.update(bArr, 0, i2);
    }

    @Override // com.google.android.gms.internal.fido.zzfv
    public final zzft zzc() {
        zzd();
        this.f39465zzc = true;
        int i = this.f39464zzb;
        if (i == this.f39463zza.getDigestLength()) {
            byte[] bArrDigest = this.f39463zza.digest();
            int i2 = zzft.f39461zzb;
            return new zzfs(bArrDigest);
        }
        byte[] bArrCopyOf = Arrays.copyOf(this.f39463zza.digest(), i);
        int i3 = zzft.f39461zzb;
        return new zzfs(bArrCopyOf);
    }
}
