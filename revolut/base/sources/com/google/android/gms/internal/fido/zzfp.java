package com.google.android.gms.internal.fido;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes16.dex */
abstract class zzfp extends zzfr {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final ByteBuffer f39458zza = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);

    @Override // com.google.android.gms.internal.fido.zzfr, com.google.android.gms.internal.fido.zzfv
    public final zzfv zza(byte[] bArr) {
        bArr.getClass();
        zzb(bArr, 0, bArr.length);
        return this;
    }

    public void zzb(byte[] bArr, int i, int i2) {
        throw null;
    }
}
