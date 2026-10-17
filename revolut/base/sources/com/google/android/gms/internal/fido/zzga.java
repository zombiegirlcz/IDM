package com.google.android.gms.internal.fido;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes16.dex */
final class zzga extends zzfq implements Serializable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final MessageDigest f39466zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final int f39467zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final boolean f39468zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final String f39469zzd;

    public zzga(String str, String str2) {
        MessageDigest messageDigestZzb = zzb("SHA-256");
        this.f39466zza = messageDigestZzb;
        this.f39467zzb = messageDigestZzb.getDigestLength();
        this.f39469zzd = "Hashing.sha256()";
        this.f39468zzc = zzc(messageDigestZzb);
    }

    private static MessageDigest zzb(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    private static boolean zzc(MessageDigest messageDigest) {
        try {
            messageDigest.clone();
            return true;
        } catch (CloneNotSupportedException unused) {
            return false;
        }
    }

    public final String toString() {
        return this.f39469zzd;
    }

    @Override // com.google.android.gms.internal.fido.zzfu
    public final zzfv zza() {
        zzfy zzfyVar = null;
        if (this.f39468zzc) {
            try {
                return new zzfz((MessageDigest) this.f39466zza.clone(), this.f39467zzb, zzfyVar);
            } catch (CloneNotSupportedException unused) {
            }
        }
        return new zzfz(zzb(this.f39466zza.getAlgorithm()), this.f39467zzb, zzfyVar);
    }
}
