package com.google.android.gms.internal.fido;

import com.google.common.primitives.UnsignedBytes;
import java.io.Serializable;

/* JADX INFO: loaded from: classes16.dex */
final class zzfs extends zzft implements Serializable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final byte[] f39459zza;

    public zzfs(byte[] bArr) {
        bArr.getClass();
        this.f39459zza = bArr;
    }

    @Override // com.google.android.gms.internal.fido.zzft
    public final int zza() {
        byte[] bArr = this.f39459zza;
        int length = bArr.length;
        if (length < 4) {
            throw new IllegalStateException(zzbo.zza("HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", Integer.valueOf(length)));
        }
        int i = bArr[0] & UnsignedBytes.MAX_VALUE;
        int i2 = bArr[1] & UnsignedBytes.MAX_VALUE;
        int i3 = bArr[2] & UnsignedBytes.MAX_VALUE;
        return ((bArr[3] & UnsignedBytes.MAX_VALUE) << 24) | i | (i2 << 8) | (i3 << 16);
    }

    @Override // com.google.android.gms.internal.fido.zzft
    public final int zzb() {
        return this.f39459zza.length * 8;
    }

    @Override // com.google.android.gms.internal.fido.zzft
    public final boolean zzc(zzft zzftVar) {
        if (this.f39459zza.length != zzftVar.zze().length) {
            return false;
        }
        boolean z = true;
        int i = 0;
        while (true) {
            byte[] bArr = this.f39459zza;
            if (i >= bArr.length) {
                return z;
            }
            z &= bArr[i] == zzftVar.zze()[i];
            i++;
        }
    }

    @Override // com.google.android.gms.internal.fido.zzft
    public final byte[] zzd() {
        return (byte[]) this.f39459zza.clone();
    }

    @Override // com.google.android.gms.internal.fido.zzft
    public final byte[] zze() {
        return this.f39459zza;
    }
}
