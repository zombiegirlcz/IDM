package com.revolut.sso.impl.ui.consolidation.we_found_existing_account;

import cli.g;
import cli.y;
import hx7.e;
import iml.b;
import kotlin.jvm.internal.Intrinsics;
import lcc.c;
import lml.f;
import lml.i;
import mra.d;
import oki.h;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends h implements f {
    public final b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f106498p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f106499q;

    public a(b consolidationLearnMoreBottomSheetFactory, WeFoundExistingAccountScreenContract$InputData inputData, i stateMapper) {
        Intrinsics.checkNotNullParameter(consolidationLearnMoreBottomSheetFactory, "consolidationLearnMoreBottomSheetFactory");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = consolidationLearnMoreBottomSheetFactory;
        this.f106498p = d.b(this, new lml.d(inputData.f106496a), stateMapper, null, false, 12);
        this.f106499q = e.a(this, new c(this, 26));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f106499q;
    }

    @Override // cli.z
    public final g getState() {
        return this.f106498p;
    }
}
