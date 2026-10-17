package com.revolut.feature.defi.accounts.impl.ui.creation.flow;

import com.revolut.feature.defi.accounts.impl.ui.creation.flow.DeFiAccountCreationFlowContract$Step;
import cp5.d;
import f01.c;
import f16.b;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import vvc.s;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements w16.a {
    public final b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f71648p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f71649q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f71650r;

    public a(b repository, c uiKitResources) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.o = repository;
        this.f71648p = uiKitResources;
        this.f71649q = j6.a.p("toString(...)");
        s sVar = new s(this, 8);
        this.f71650r = d.a(this, DeFiAccountCreationFlowContract$Step.Disclaimer.f71647a, f0.f322471a, sVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f71650r;
    }
}
