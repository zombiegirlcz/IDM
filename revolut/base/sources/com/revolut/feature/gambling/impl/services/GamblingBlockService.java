package com.revolut.feature.gambling.impl.services;

import efm.d0;
import kotlin.Metadata;
import l67.a;
import l67.c;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PATCH;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H'¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/gambling/impl/services/GamblingBlockService;", "", "Ll67/c;", "request", "Lefm/d0;", "Ll67/a;", "setGamblingBlock", "(Ll67/c;)Lefm/d0;", "getGamblingBlock", "()Lefm/d0;", "feature_gambling_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface GamblingBlockService {
    @GET("/user/current/settings/misc")
    @NotNull
    d0<a> getGamblingBlock();

    @PATCH("/user/current/settings/misc")
    @NotNull
    d0<a> setGamblingBlock(@Body @NotNull c request);
}
