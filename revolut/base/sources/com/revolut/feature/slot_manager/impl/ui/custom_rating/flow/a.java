package com.revolut.feature.slot_manager.impl.ui.custom_rating.flow;

import com.revolut.feature.slot_manager.impl.ui.custom_rating.flow.CustomRatingFlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import d8l.d;
import dld.b;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yki.i;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends h implements b {
    public final CustomRatingFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i f87359p;

    public a(CustomRatingFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        this.f87359p = d.a(this, new dgj.h(this, 7));
    }

    @Override // yki.j
    public final void M0() {
        h.w2(this.f87359p, CustomRatingFlowContract$Step.BottomDialog.f87358a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f87359p;
    }
}
