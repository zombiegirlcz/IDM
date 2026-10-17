package com.revolut.feature.credit.application.plugins.impl.ui.sso.flow;

import aii.m;
import aii.n;
import aii.w;
import c84.a0;
import c84.g;
import com.revolut.feature.credit.application.plugins.impl.ui.sso.flow.SelfieIntroFlowContract$Step;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import cp5.d;
import j54.e;
import j54.f;
import j54.t;
import j54.u;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import rz3.c;
import vi4.b;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends a0 implements vi4.a {

    @NotNull
    private static final b Companion = new b();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f68482p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final sp3.a f68483q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f f68484r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final yki.a f68485s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(g pluginModelExtension, c creditApplicationRouter, sp3.a creditDataMonitoringFacade, f cancellationExtension) {
        super(pluginModelExtension);
        Intrinsics.checkNotNullParameter(pluginModelExtension, "pluginModelExtension");
        Intrinsics.checkNotNullParameter(creditApplicationRouter, "creditApplicationRouter");
        Intrinsics.checkNotNullParameter(creditDataMonitoringFacade, "creditDataMonitoringFacade");
        Intrinsics.checkNotNullParameter(cancellationExtension, "cancellationExtension");
        this.f68482p = creditApplicationRouter;
        this.f68483q = creditDataMonitoringFacade;
        this.f68484r = cancellationExtension;
        vh9.b bVar = new vh9.b(this, 1);
        this.f68485s = d.a(this, SelfieIntroFlowContract$Step.SelfieIntro.f68481a, f0.f322471a, bVar);
    }

    @Override // yji.l
    public final n o2(m event) {
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z = event instanceof e;
        w wVar = w.f5295a;
        if (z) {
            e eVar = (e) event;
            h.w2(this.f68485s, new SelfieIntroFlowContract$Step.ModalStep.Cancellation(eVar.f171504b, eVar.f171505c, eVar.d), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
            return wVar;
        }
        if (!(event instanceof u) && !(event instanceof t.b) && !(event instanceof t.c) && !(event instanceof t.a)) {
            return super.o2(event);
        }
        NaviCommand naviCommandC = this.f68482p.f258504c.c();
        t tVar = (t) event;
        NaviCommand naviCommand = tVar instanceof t.b ? ((t.b) event).f171563b : tVar instanceof t.c ? ((t.c) event).f171565b : tVar instanceof t.a ? ((t.a) event).f171561b : null;
        if (naviCommand != null) {
            naviCommandC = com.revolut.retail.core.navigation.a.c(naviCommandC, naviCommand);
        }
        C1(new BridgeDestination(r6.b.g(null, null, null, 7, naviCommandC)));
        return wVar;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f68485s;
    }
}
