package com.google.android.gms.nearby.connection;

import androidx.annotation.NonNull;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
public final class ConnectionInfo {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final String f47787zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final String f47788zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final byte[] f47789zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final boolean f47790zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private final boolean f47791zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private final byte[] f47792zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private final int f47793zzg;

    private ConnectionInfo(String str, String str2, byte[] bArr, boolean z, boolean z3, byte[] bArr2, int i) {
        this.f47787zza = str;
        this.f47788zzb = str2;
        this.f47789zzc = bArr;
        this.f47790zzd = z;
        this.f47791zze = z3;
        this.f47792zzf = bArr2;
        this.f47793zzg = i;
    }

    @NonNull
    public String getAuthenticationDigits() {
        int i = 1;
        int i2 = 0;
        for (byte b4 : this.f47789zzc) {
            int i3 = (b4 * i) + i2;
            i = (i * 31) % 9973;
            i2 = i3 % 9973;
        }
        return String.format(Locale.US, "%04d", Integer.valueOf(Math.abs(i2)));
    }

    public int getAuthenticationStatus() {
        return this.f47793zzg;
    }

    @NonNull
    @Deprecated
    public String getAuthenticationToken() {
        return this.f47788zzb;
    }

    @NonNull
    public byte[] getEndpointInfo() {
        return this.f47792zzf;
    }

    @NonNull
    public String getEndpointName() {
        return this.f47787zza;
    }

    @NonNull
    public byte[] getRawAuthenticationToken() {
        return this.f47789zzc;
    }

    @Deprecated
    public boolean isConnectionVerified() {
        return this.f47791zze;
    }

    public boolean isIncomingConnection() {
        return this.f47790zzd;
    }

    @Deprecated
    public ConnectionInfo(@NonNull String str, @NonNull String str2, boolean z) {
        this(str, str2, str2.getBytes(), z, false, str.getBytes(), 0);
    }
}
