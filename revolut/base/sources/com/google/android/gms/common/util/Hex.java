package com.google.android.gms.common.util;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes.dex */
@ShowFirstParty
@KeepForSdk
public class Hex {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final char[] f38301zza = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final char[] f38302zzb = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    @NonNull
    @KeepForSdk
    public static String bytesToStringLowercase(@NonNull byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i = 0;
        for (byte b4 : bArr) {
            int i2 = b4 & UnsignedBytes.MAX_VALUE;
            char[] cArr2 = f38302zzb;
            cArr[i] = cArr2[i2 >>> 4];
            cArr[i + 1] = cArr2[b4 & 15];
            i += 2;
        }
        return new String(cArr);
    }

    @NonNull
    @KeepForSdk
    public static String bytesToStringUppercase(@NonNull byte[] bArr) {
        return bytesToStringUppercase(bArr, false);
    }

    @NonNull
    @KeepForSdk
    public static byte[] stringToBytes(@NonNull String str) throws IllegalArgumentException {
        int length = str.length();
        if ((length & 1) != 0) {
            throw new IllegalArgumentException("Hex string has odd number of characters");
        }
        byte[] bArr = new byte[length >> 1];
        int i = 0;
        while (i < length) {
            int i2 = i + 2;
            bArr[i / 2] = (byte) Integer.parseInt(str.substring(i, i2), 16);
            i = i2;
        }
        return bArr;
    }

    @NonNull
    @KeepForSdk
    public static String bytesToStringUppercase(@NonNull byte[] bArr, boolean z) {
        int length = bArr.length;
        StringBuilder sb6 = new StringBuilder(length + length);
        for (int i = 0; i < length && (!z || i != length - 1 || (bArr[i] & UnsignedBytes.MAX_VALUE) != 0); i++) {
            char[] cArr = f38301zza;
            sb6.append(cArr[(bArr[i] & 240) >>> 4]);
            sb6.append(cArr[bArr[i] & 15]);
        }
        return sb6.toString();
    }
}
