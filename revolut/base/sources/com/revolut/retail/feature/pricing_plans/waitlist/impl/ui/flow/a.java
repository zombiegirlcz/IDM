package com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.flow;

import com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.flow.WaitlistControllerFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import plb.g;
import pok.b;
import wli.x;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends h implements b {
    public final WaitlistControllerFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x f103690p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f103691q;

    public a(WaitlistControllerFlowContract$InputData inputData, x deeplinkHandler) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        this.o = inputData;
        this.f103690p = deeplinkHandler;
        g gVar = new g(this, 9);
        this.f103691q = d.a(this, WaitlistControllerFlowContract$Step.Invitation.f103689a, f0.f322471a, gVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f103691q;
    }
}
