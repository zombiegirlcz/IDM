package com.google.android.gms.internal.mlkit_vision_common;

import androidx.annotation.NonNull;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes16.dex */
final class zzaf extends OutputStream {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private long f42615zza = 0;

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.f42615zza++;
    }

    public final long zza() {
        return this.f42615zza;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f42615zza += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(@NonNull byte[] bArr, int i, int i2) {
        int length;
        int i3;
        if (i >= 0 && i <= (length = bArr.length) && i2 >= 0 && (i3 = i + i2) <= length && i3 >= 0) {
            this.f42615zza += (long) i2;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
