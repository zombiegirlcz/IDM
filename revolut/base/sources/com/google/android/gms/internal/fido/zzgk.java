package com.google.android.gms.internal.fido;

import com.google.common.primitives.UnsignedBytes;
import java.util.Comparator;

/* JADX INFO: loaded from: classes16.dex */
enum zzgk implements Comparator {
    INSTANCE;

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj2, Object obj3) {
        byte[] bArr = (byte[]) obj2;
        byte[] bArr2 = (byte[]) obj3;
        int iMin = Math.min(bArr.length, bArr2.length);
        for (int i = 0; i < iMin; i++) {
            int i2 = (bArr[i] & UnsignedBytes.MAX_VALUE) - (bArr2[i] & UnsignedBytes.MAX_VALUE);
            if (i2 != 0) {
                return i2;
            }
        }
        return bArr.length - bArr2.length;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "UnsignedBytes.lexicographicalComparator() (pure Java version)";
    }
}
