package com.revolut.feature.wealth_protection.sso.animation.impl.ui.flow;

import com.revolut.feature.wealth_protection.sso.animation.impl.ui.flow.WealthProtectionSsoAnimationFlowContract$Step;
import cp5.d;
import drh.b;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends h implements b {
    public final WealthProtectionSsoAnimationFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f96298p;

    public a(WealthProtectionSsoAnimationFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        dgj.h hVar = new dgj.h(this, 28);
        this.f96298p = d.a(this, WealthProtectionSsoAnimationFlowContract$Step.Animation.f96296a, f0.f322471a, hVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f96298p;
    }
}
