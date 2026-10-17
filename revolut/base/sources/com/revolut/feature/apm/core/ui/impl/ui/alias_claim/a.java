package com.revolut.feature.apm.core.ui.impl.ui.alias_claim;

import com.revolut.feature.apm.core.ui.api.navigation.ApmAliasClaimNavigation$InputData;
import com.revolut.feature.apm.core.ui.impl.ui.alias_claim.ApmAliasClaimFlowContract$Step;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import umd.n;
import v12.b;
import v12.d;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends h implements b {

    @NotNull
    public static final d Companion = new d();
    public final ApmAliasClaimNavigation$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f62339p;

    public a(ApmAliasClaimNavigation$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        n nVar = new n(this, 27);
        this.f62339p = cp5.d.a(this, ApmAliasClaimFlowContract$Step.Intro.f62337a, f0.f322471a, nVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f62339p;
    }
}
