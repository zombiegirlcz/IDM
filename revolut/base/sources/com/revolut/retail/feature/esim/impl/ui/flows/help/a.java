package com.revolut.retail.feature.esim.impl.ui.flows.help;

import com.revolut.retail.feature.esim.impl.ui.flows.help.EsimHelpFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import wde.f;
import wfj.b;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends h implements b {
    public final EsimHelpFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final gte.a f100642p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f100643q;

    public a(EsimHelpFlowContract$InputData inputData, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.o = inputData;
        this.f100642p = featureToggleInteractor;
        f fVar = new f(this, 5);
        this.f100643q = d.a(this, EsimHelpFlowContract$Step.Help.f100638a, f0.f322471a, fVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f100643q;
    }
}
