package com.revolut.feature.statements.impl.ui.documents_hub.flow;

import bw4.t;
import c0e.b;
import com.revolut.feature.statements.impl.ui.documents_hub.DocumentsHubScreenContract$InputData;
import com.revolut.feature.statements.impl.ui.documents_hub.flow.DocumentsHubFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends h implements b {
    public final yki.a o;

    public a(DocumentsHubScreenContract$InputData initialInputData) {
        Intrinsics.checkNotNullParameter(initialInputData, "initialInputData");
        this.o = d.a(this, new DocumentsHubFlowContract$Step.Screen(initialInputData), f0.f322471a, new t(22));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.o;
    }
}
