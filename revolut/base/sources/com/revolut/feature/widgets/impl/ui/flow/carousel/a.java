package com.revolut.feature.widgets.impl.ui.flow.carousel;

import ash.i;
import com.revolut.feature.widgets.impl.ui.flow.carousel.WidgetCarouselFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import plb.g;
import psh.b;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends h implements b {
    public final WidgetCarouselFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i f96366p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f96367q;

    public a(WidgetCarouselFlowContract$InputData inputData, i widgetsInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(widgetsInteractor, "widgetsInteractor");
        this.o = inputData;
        this.f96366p = widgetsInteractor;
        g gVar = new g(this, 26);
        this.f96367q = d.a(this, WidgetCarouselFlowContract$Step.CarouselScreen.f96365a, f0.f322471a, gVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f96367q;
    }
}
