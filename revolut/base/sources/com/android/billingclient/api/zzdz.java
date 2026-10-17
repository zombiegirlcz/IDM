package com.android.billingclient.api;

import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class zzdz {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final List f26001zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final BillingResult f26002zzb;

    public zzdz(BillingResult billingResult, List list) {
        this.f26001zza = list;
        this.f26002zzb = billingResult;
    }

    public final BillingResult zza() {
        return this.f26002zzb;
    }

    public final List zzb() {
        return this.f26001zza;
    }
}
