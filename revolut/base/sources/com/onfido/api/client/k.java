package com.onfido.api.client;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes17.dex */
public final class k implements Callback {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f50137c = "OnfidoAPI.".concat(k.class.getSimpleName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f50138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f50139b;

    public k(l lVar, c cVar) {
        this.f50138a = lVar;
        this.f50139b = cVar;
    }

    @Override // retrofit2.Callback
    public final void onFailure(Call call, Throwable th10) {
        this.f50138a.onFailure(th10);
        lmm.d.w1.log(f50137c + "/onFailure:" + String.valueOf(th10));
    }

    @Override // retrofit2.Callback
    public final void onResponse(Call call, Response response) {
        boolean zIsSuccessful = response.isSuccessful();
        l lVar = this.f50138a;
        if (zIsSuccessful) {
            lVar.onSuccess(response.body());
        } else {
            lVar.onError(response.code(), response.message(), this.f50139b.a(response));
        }
    }
}
