package com.android.billingclient.api;

/* JADX INFO: loaded from: classes16.dex */
enum zzdf {
    GET_BILLING_CONFIG("getBillingConfig", 29),
    IS_BILLING_PROGRAM_AVAILABLE_ASYNC("isIndirectBillingProgramAvailable", 33),
    CREATE_BILLING_PROGRAM_REPORTING_DETAILS_ASYNC("createIndirectBillingReportingDetails", 35);


    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private final String f25991zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private final int f25992zzf;

    zzdf(String str, int i) {
        this.f25991zze = str;
        this.f25992zzf = i;
    }

    public final String zza() {
        return this.f25991zze;
    }

    public final int zzb() {
        return this.f25992zzf;
    }
}
