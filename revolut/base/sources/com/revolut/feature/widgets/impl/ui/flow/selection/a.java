package com.revolut.feature.widgets.impl.ui.flow.selection;

import ash.i;
import com.revolut.feature.widgets.impl.ui.flow.selection.WidgetSelectionFlowContact$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import tp8.l;
import tsh.b;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends h implements b {
    public final i o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final WidgetSelectionFlowContact$InputData f96380p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f96381q;

    public a(i widgetsInteractor, WidgetSelectionFlowContact$InputData inputData) {
        Intrinsics.checkNotNullParameter(widgetsInteractor, "widgetsInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = widgetsInteractor;
        this.f96380p = inputData;
        l lVar = new l(this, 7);
        this.f96381q = d.a(this, WidgetSelectionFlowContact$Step.CatalogueScreen.f96379a, f0.f322471a, lVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f96381q;
    }
}
