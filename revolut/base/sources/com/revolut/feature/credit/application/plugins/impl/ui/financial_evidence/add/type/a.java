package com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.add.type;

import cli.g;
import cli.k;
import cli.y;
import f01.c;
import hx7.e;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import ob4.j;
import ob4.l;
import oki.h;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends h implements j {
    public final EvidenceTypeSelectionScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f67708p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f67709q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f67710r;

    public a(EvidenceTypeSelectionScreenContract$InputData inputData, c uiKitResources, l stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f67708p = uiKitResources;
        this.f67709q = d.b(this, k.f25028a, stateMapper, null, false, 12);
        this.f67710r = e.a(this, new oa4.c(this, 2));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f67710r;
    }

    @Override // cli.z
    public final g getState() {
        return this.f67709q;
    }
}
