package com.android.billingclient.api;

/* JADX INFO: loaded from: classes16.dex */
public final class AccountIdentifiers {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final String f25605zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final String f25606zzb;

    public AccountIdentifiers(String str, String str2) {
        this.f25605zza = str;
        this.f25606zzb = str2;
    }

    public String getObfuscatedAccountId() {
        return this.f25605zza;
    }

    public String getObfuscatedProfileId() {
        return this.f25606zzb;
    }
}
