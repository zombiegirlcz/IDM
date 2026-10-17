package com.revolut.feature.profile.impl.ui.documents_redesigned.flow;

import aii.m;
import aii.n;
import aii.u;
import aii.v;
import aii.w;
import com.revolut.feature.profile.impl.ui.documents_redesigned.DocumentFlowInternalDestination;
import com.revolut.feature.profile.impl.ui.documents_redesigned.flow.DocumentsFlowContract$Step;
import cp5.d;
import kkf.b4;
import kna.b;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements b {
    public final yki.a o;

    public a(DocumentsFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = d.a(this, inputData.f81419a, f0.f322471a, new b4(17));
    }

    @Override // yji.l
    public final n o2(m event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof v) {
            u uVar = ((v) event).f5294b;
            if (uVar instanceof DocumentFlowInternalDestination) {
                h.t2(this, this.o, new DocumentsFlowContract$Step.DocumentSelector(((DocumentFlowInternalDestination) uVar).f81409a), true, null, false, 12);
                return w.f5295a;
            }
        }
        return super.o2(event);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.o;
    }
}
