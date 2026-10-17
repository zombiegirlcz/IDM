package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.annotation.NonNull;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
final class zzfd extends OutputStream {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private long f41394zza = 0;

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.f41394zza++;
    }

    public final long zza() {
        return this.f41394zza;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f41394zza += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(@NonNull byte[] bArr, int i, int i2) {
        int length;
        int i3;
        if (i >= 0 && i <= (length = bArr.length) && i2 >= 0 && (i3 = i + i2) <= length && i3 >= 0) {
            this.f41394zza += (long) i2;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
