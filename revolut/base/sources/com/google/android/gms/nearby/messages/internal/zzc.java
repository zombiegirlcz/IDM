package com.google.android.gms.nearby.messages.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes16.dex */
public class zzc {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final char[] f48171zza = "0123456789abcdef".toCharArray();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final byte[] f48172zzb;

    public zzc(byte[] bArr) {
        this.f48172zzb = bArr;
    }

    public static String zzb(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb6 = new StringBuilder(length + length);
        for (byte b4 : bArr) {
            char[] cArr = f48171zza;
            sb6.append(cArr[(b4 >> 4) & 15]);
            sb6.append(cArr[b4 & 15]);
        }
        return sb6.toString();
    }

    public static byte[] zzd(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i + i;
            bArr[i] = (byte) (Character.digit(str.charAt(i2 + 1), 16) + (Character.digit(str.charAt(i2), 16) << 4));
        }
        return bArr;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == null) {
            return false;
        }
        if (this == obj2) {
            return true;
        }
        if (obj2.getClass().isAssignableFrom(getClass())) {
            return Arrays.equals(this.f48172zzb, ((zzc) obj2).f48172zzb);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f48172zzb);
    }

    public String toString() {
        return zzb(this.f48172zzb);
    }

    public final String zza() {
        return zzb(this.f48172zzb);
    }

    public final byte[] zzc() {
        return this.f48172zzb;
    }
}
