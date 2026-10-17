package com.google.android.gms.signin;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ShowFirstParty;

/* JADX INFO: loaded from: classes16.dex */
public final class zad {
    public static final Api.ClientKey zaa;

    /* JADX INFO: renamed from: zab, reason: collision with root package name */
    @ShowFirstParty
    public static final Api.ClientKey f48451zab;

    /* JADX INFO: renamed from: zac, reason: collision with root package name */
    public static final Api.AbstractClientBuilder f48452zac;

    /* JADX INFO: renamed from: zad, reason: collision with root package name */
    static final Api.AbstractClientBuilder f48453zad;

    /* JADX INFO: renamed from: zae, reason: collision with root package name */
    public static final Scope f48454zae;

    /* JADX INFO: renamed from: zaf, reason: collision with root package name */
    public static final Scope f48455zaf;

    /* JADX INFO: renamed from: zag, reason: collision with root package name */
    public static final Api f48456zag;

    /* JADX INFO: renamed from: zah, reason: collision with root package name */
    public static final Api f48457zah;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        zaa = clientKey;
        Api.ClientKey clientKey2 = new Api.ClientKey();
        f48451zab = clientKey2;
        zaa zaaVar = new zaa();
        f48452zac = zaaVar;
        zab zabVar = new zab();
        f48453zad = zabVar;
        f48454zae = new Scope("profile");
        f48455zaf = new Scope("email");
        f48456zag = new Api("SignIn.API", zaaVar, clientKey);
        f48457zah = new Api("SignIn.INTERNAL_API", zabVar, clientKey2);
    }
}
