package com.revolut.feature.defi.settings.impl.ui.recovery_phrase.flow;

import com.revolut.feature.defi.settings.impl.ui.recovery_phrase.flow.DeFiRecoveryPhraseFlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import d8l.d;
import j2c.n;
import j66.b;
import j66.c;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yki.i;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements b {
    public final DeFiRecoveryPhraseFlowContract$Input o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f71870p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i f71871q;

    public a(DeFiRecoveryPhraseFlowContract$Input input, c warningBottomSheetMapper) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(warningBottomSheetMapper, "warningBottomSheetMapper");
        this.o = input;
        this.f71870p = warningBottomSheetMapper;
        this.f71871q = d.a(this, new n(this, 9));
    }

    @Override // yki.j
    public final void M0() {
        h.w2(this.f71871q, DeFiRecoveryPhraseFlowContract$Step.Warning.f71869a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f71871q;
    }
}
