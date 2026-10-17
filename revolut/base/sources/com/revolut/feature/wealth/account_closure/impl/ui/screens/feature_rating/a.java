package com.revolut.feature.wealth.account_closure.impl.ui.screens.feature_rating;

import cli.y;
import hx7.e;
import kotlin.jvm.internal.Intrinsics;
import mnl.g;
import mra.d;
import mug.j;
import oki.h;
import zhm.r0;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends h implements mug.h {
    public final AccountClosureFeatureRatingScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f94949p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f94950q;

    public a(j stateMapper, AccountClosureFeatureRatingScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        this.f94949p = e.a(this, new g(this, 19));
        this.f94950q = d.b(this, new mug.e(inputData.f94946a, r0.g()), stateMapper, null, false, 12);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f94949p;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f94950q;
    }
}
