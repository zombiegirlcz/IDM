package com.revolut.feature.wealth_discovery.impl.screener.flows.screener;

import com.revolut.feature.wealth_discovery.impl.screener.flows.screener.ScreenerRedesignFlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import d8l.d;
import dph.b;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yki.i;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends h implements b {
    public final ScreenerRedesignFlowContract$Input o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i f96188p;

    public a(ScreenerRedesignFlowContract$Input input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.o = input;
        this.f96188p = d.a(this, new dgj.h(this, 24));
    }

    @Override // yki.j
    public final void M0() {
        h.w2(this.f96188p, ScreenerRedesignFlowContract$Step.Filters.f96185a, ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f96188p;
    }
}
