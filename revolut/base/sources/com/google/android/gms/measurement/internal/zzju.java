package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes16.dex */
public enum zzju {
    UNINITIALIZED("uninitialized"),
    POLICY("eu_consent_policy"),
    DENIED("denied"),
    GRANTED("granted");


    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private final String f47257zzf;

    zzju(String str) {
        this.f47257zzf = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f47257zzf;
    }
}
