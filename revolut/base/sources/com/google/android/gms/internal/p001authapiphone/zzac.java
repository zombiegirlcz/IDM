package com.google.android.gms.internal.p001authapiphone;

import com.google.android.gms.common.Feature;

/* JADX INFO: loaded from: classes16.dex */
public final class zzac {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public static final Feature f38792zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    public static final Feature f38793zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    public static final Feature f38794zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    public static final Feature f38795zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    public static final Feature[] f38796zze;

    static {
        Feature feature = new Feature("sms_code_autofill", 2L);
        f38792zza = feature;
        Feature feature2 = new Feature("sms_code_browser", 2L);
        f38793zzb = feature2;
        Feature feature3 = new Feature("sms_retrieve", 1L);
        f38794zzc = feature3;
        Feature feature4 = new Feature("user_consent", 3L);
        f38795zzd = feature4;
        f38796zze = new Feature[]{feature, feature2, feature3, feature4};
    }
}
