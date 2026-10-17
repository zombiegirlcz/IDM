package com.revolut.sso.impl.ui.consolidation.continue_with_revolut;

import cli.g;
import cli.k;
import cli.y;
import hx7.e;
import jch.p;
import jml.i;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends h implements i {
    public final iml.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f106493p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f106494q;

    public a(iml.b consolidationLearnMoreBottomSheetFactory, b stateMapper) {
        Intrinsics.checkNotNullParameter(consolidationLearnMoreBottomSheetFactory, "consolidationLearnMoreBottomSheetFactory");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = consolidationLearnMoreBottomSheetFactory;
        this.f106493p = d.b(this, k.f25028a, stateMapper, null, false, 12);
        this.f106494q = e.a(this, new p(this, 28));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f106494q;
    }

    @Override // cli.z
    public final g getState() {
        return this.f106493p;
    }
}
