package com.google.android.gms.internal.p000authapi;

import com.google.android.gms.common.Feature;

/* JADX INFO: loaded from: classes16.dex */
public final class zbas {

    /* JADX INFO: renamed from: zba, reason: collision with root package name */
    public static final Feature f38845zba;

    /* JADX INFO: renamed from: zbb, reason: collision with root package name */
    public static final Feature f38846zbb;
    public static final Feature zbc;

    /* JADX INFO: renamed from: zbd, reason: collision with root package name */
    public static final Feature f38847zbd;

    /* JADX INFO: renamed from: zbe, reason: collision with root package name */
    public static final Feature f38848zbe;

    /* JADX INFO: renamed from: zbf, reason: collision with root package name */
    public static final Feature f38849zbf;

    /* JADX INFO: renamed from: zbg, reason: collision with root package name */
    public static final Feature f38850zbg;

    /* JADX INFO: renamed from: zbh, reason: collision with root package name */
    public static final Feature f38851zbh;

    /* JADX INFO: renamed from: zbi, reason: collision with root package name */
    public static final Feature[] f38852zbi;

    static {
        Feature feature = new Feature("auth_api_credentials_begin_sign_in", 9L);
        f38845zba = feature;
        Feature feature2 = new Feature("auth_api_credentials_sign_out", 2L);
        f38846zbb = feature2;
        Feature feature3 = new Feature("auth_api_credentials_authorize", 1L);
        zbc = feature3;
        Feature feature4 = new Feature("auth_api_credentials_revoke_access", 1L);
        f38847zbd = feature4;
        Feature feature5 = new Feature("auth_api_credentials_save_password", 4L);
        f38848zbe = feature5;
        Feature feature6 = new Feature("auth_api_credentials_get_sign_in_intent", 6L);
        f38849zbf = feature6;
        Feature feature7 = new Feature("auth_api_credentials_save_account_linking_token", 3L);
        f38850zbg = feature7;
        Feature feature8 = new Feature("auth_api_credentials_get_phone_number_hint_intent", 3L);
        f38851zbh = feature8;
        f38852zbi = new Feature[]{feature, feature2, feature3, feature4, feature5, feature6, feature7, feature8};
    }
}
