package com.revolut.feature.payments.send_from_clipboard.impl.flow;

import com.revolut.feature.payments.send_from_clipboard.api.navigation.SendFromClipboardNavigation$InputData;
import com.revolut.feature.payments.send_from_clipboard.impl.flow.SendFromClipboardFlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import d8l.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import u3a.p;
import wy9.b;
import yki.i;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements b {
    public final i o;

    public a(SendFromClipboardNavigation$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = d.a(this, new p(this, inputData, 17));
    }

    @Override // yki.j
    public final void M0() {
        h.w2(this.o, SendFromClipboardFlowContract$Step.Selection.f79712a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.o;
    }
}
