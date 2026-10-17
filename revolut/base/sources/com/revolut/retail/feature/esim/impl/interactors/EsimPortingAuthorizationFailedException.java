package com.revolut.retail.feature.esim.impl.interactors;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import pfj.g;
import pfj.i;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/interactors/EsimPortingAuthorizationFailedException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EsimPortingAuthorizationFailedException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f100567a;

    /* JADX WARN: Illegal instructions before constructor call */
    public EsimPortingAuthorizationFailedException(i authorizationResponse) {
        Intrinsics.checkNotNullParameter(authorizationResponse, "authorizationResponse");
        g gVar = authorizationResponse.f235615a.f;
        super(gVar != null ? gVar.f235613b : null);
        this.f100567a = authorizationResponse;
    }
}
