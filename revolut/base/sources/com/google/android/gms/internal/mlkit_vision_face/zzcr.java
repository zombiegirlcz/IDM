package com.google.android.gms.internal.mlkit_vision_face;

import androidx.annotation.NonNull;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
final class zzcr extends OutputStream {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private long f43541zza = 0;

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.f43541zza++;
    }

    public final long zza() {
        return this.f43541zza;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f43541zza += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(@NonNull byte[] bArr, int i, int i2) {
        int length;
        int i3;
        if (i >= 0 && i <= (length = bArr.length) && i2 >= 0 && (i3 = i + i2) <= length && i3 >= 0) {
            this.f43541zza += (long) i2;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
