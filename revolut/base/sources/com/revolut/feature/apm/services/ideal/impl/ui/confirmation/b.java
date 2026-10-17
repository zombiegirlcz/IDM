package com.revolut.feature.apm.services.ideal.impl.ui.confirmation;

import cli.g;
import cli.n;
import cli.y;
import id2.e;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import sri.m;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends h implements e {
    public final IDealPaymentConfirmedScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f80.a f62844p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final m f62845q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f62846r;

    public b(IDealPaymentConfirmedScreenContract$InputData inputData, f80.a uriHelper, m navigator, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f62844p = uriHelper;
        this.f62845q = navigator;
        this.f62846r = d.b(this, id2.d.f160412a, stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final g getState() {
        return this.f62846r;
    }
}
