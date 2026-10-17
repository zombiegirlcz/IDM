package com.revolut.feature.pix.impl.flow.authorisation_request;

import com.revolut.feature.pix.impl.flow.authorisation_request.PixAuthorisationRequestContract$Step;
import com.revolut.feature.pix.impl.flow.authorisation_request.screens.request.PixAuthorisationRequestScreenContract$InputData;
import cp5.d;
import h1c.c;
import h9a.b;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import vkm.j2;
import vkm.q;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements h9a.a {
    public final j2 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f80586p;

    public a(b inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = q.c(new PixAuthorisationRequestScreenContract$InputData(inputData.f150218a, inputData.f150219b));
        c cVar = new c(this, 17);
        this.f80586p = d.a(this, PixAuthorisationRequestContract$Step.AuthorisationRequest.f80584a, f0.f322471a, cVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f80586p;
    }
}
