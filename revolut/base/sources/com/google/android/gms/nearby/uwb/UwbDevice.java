package com.google.android.gms.nearby.uwb;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes16.dex */
public class UwbDevice {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final UwbAddress f48251zza;

    private UwbDevice(UwbAddress uwbAddress) {
        this.f48251zza = uwbAddress;
    }

    @NonNull
    public static UwbDevice createForAddress(@NonNull String str) {
        return new UwbDevice(new UwbAddress(str));
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof UwbDevice)) {
            return false;
        }
        UwbAddress uwbAddress = this.f48251zza;
        UwbAddress uwbAddress2 = ((UwbDevice) obj2).f48251zza;
        return uwbAddress == uwbAddress2 || uwbAddress.equals(uwbAddress2);
    }

    @NonNull
    public UwbAddress getAddress() {
        return this.f48251zza;
    }

    public int hashCode() {
        return this.f48251zza.hashCode();
    }

    @NonNull
    public String toString() {
        return String.format("UwbDevice {%s}", this.f48251zza);
    }

    @NonNull
    public static UwbDevice createForAddress(@NonNull byte[] bArr) {
        return new UwbDevice(new UwbAddress(bArr));
    }
}
