package com.revolut.oauth.impl.ui.consent.flow;

import ani.b;
import com.revolut.oauth.api.consent.ConsentFlowDestination;
import com.revolut.oauth.impl.ui.consent.flow.ConsentFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends h implements b {
    public final ConsentFlowDestination.InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final eni.b f98490p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f98491q;

    public a(ConsentFlowDestination.InputData inputData, eni.b redirectFactory) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(redirectFactory, "redirectFactory");
        this.o = inputData;
        this.f98490p = redirectFactory;
        anc.b bVar = new anc.b(this, 2);
        this.f98491q = d.a(this, ConsentFlowContract$Step.Consent.f98489a, f0.f322471a, bVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f98491q;
    }
}
