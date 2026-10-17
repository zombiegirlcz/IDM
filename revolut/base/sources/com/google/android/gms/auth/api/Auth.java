package com.google.android.gms.auth.api;

import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.proxy.ProxyApi;
import com.google.android.gms.auth.api.signin.GoogleSignInApi;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.ShowFirstParty;

/* JADX INFO: loaded from: classes16.dex */
public final class Auth {

    @NonNull
    public static final Api<GoogleSignInOptions> GOOGLE_SIGN_IN_API;

    @NonNull
    public static final GoogleSignInApi GoogleSignInApi;

    @NonNull
    @Deprecated
    @ShowFirstParty
    @KeepForSdk
    public static final Api<AuthProxyOptions> PROXY_API;

    @NonNull
    @Deprecated
    @ShowFirstParty
    @KeepForSdk
    public static final ProxyApi ProxyApi;

    /* JADX INFO: renamed from: zba, reason: collision with root package name */
    @NonNull
    public static final Api.ClientKey f37293zba;

    /* JADX INFO: renamed from: zbb, reason: collision with root package name */
    @NonNull
    public static final Api.ClientKey f37294zbb;

    @NonNull
    public static final Api zbc;

    /* JADX INFO: renamed from: zbd, reason: collision with root package name */
    public static final com.google.android.gms.internal.p000authapi.zbd f37295zbd;

    /* JADX INFO: renamed from: zbe, reason: collision with root package name */
    private static final Api.AbstractClientBuilder f37296zbe;

    /* JADX INFO: renamed from: zbf, reason: collision with root package name */
    private static final Api.AbstractClientBuilder f37297zbf;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        f37293zba = clientKey;
        Api.ClientKey clientKey2 = new Api.ClientKey();
        f37294zbb = clientKey2;
        zba zbaVar = new zba();
        f37296zbe = zbaVar;
        zbb zbbVar = new zbb();
        f37297zbf = zbbVar;
        PROXY_API = AuthProxy.API;
        zbc = new Api("Auth.CREDENTIALS_API", zbaVar, clientKey);
        GOOGLE_SIGN_IN_API = new Api<>("Auth.GOOGLE_SIGN_IN_API", zbbVar, clientKey2);
        ProxyApi = AuthProxy.ProxyApi;
        f37295zbd = new com.google.android.gms.internal.p000authapi.zbd();
        GoogleSignInApi = new com.google.android.gms.auth.api.signin.internal.zbd();
    }

    private Auth() {
    }
}
