package com.revolut.feature.slot_manager.impl.ui.screen.prompt.flow;

import com.revolut.feature.slot_manager.impl.ui.screen.prompt.flow.SlotManagerPromptFlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import d8l.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import sld.b;
import yki.i;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends h implements b {
    public final SlotManagerPromptFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i f87382p;

    public a(SlotManagerPromptFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        this.f87382p = d.a(this, new scl.h(this, 16));
    }

    @Override // yki.j
    public final void M0() {
        h.w2(this.f87382p, SlotManagerPromptFlowContract$Step.PromptBottomSheet.f87381a, ModalDestination.Style.POPUP.f98311a);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f87382p;
    }
}
