package com.revolut.feature.pix.impl.flow.pix_area;

import aii.n;
import aii.w;
import com.revolut.feature.pix.impl.flow.pix_area.PixAreaFlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import d8l.d;
import i69.p;
import iaa.b;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import til.m;
import yki.i;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements b {
    public final PixAreaFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final kz9.a f80659p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final m f80660q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f8a.a f80661r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final gte.a f80662s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i f80663t;

    public a(PixAreaFlowContract$InputData inputData, kz9.a chatNavigationProvider, m workflowFlowProvider, f8a.a pixAreaInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(chatNavigationProvider, "chatNavigationProvider");
        Intrinsics.checkNotNullParameter(workflowFlowProvider, "workflowFlowProvider");
        Intrinsics.checkNotNullParameter(pixAreaInteractor, "pixAreaInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.o = inputData;
        this.f80659p = chatNavigationProvider;
        this.f80660q = workflowFlowProvider;
        this.f80661r = pixAreaInteractor;
        this.f80662s = featureToggleInteractor;
        this.f80663t = d.a(this, new p(this, 6));
    }

    @Override // yki.j
    public final void M0() {
        h.t2(this, this.f80663t, PixAreaFlowContract$Step.PixArea.f80649a, true, null, false, 12);
    }

    @Override // yji.l
    public final n o2(aii.m event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!(event instanceof kaa.a)) {
            return super.o2(event);
        }
        h.w2(this.f80663t, new PixAreaFlowContract$Step.ManageAlias(((kaa.a) event).f182452b), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        return w.f5295a;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f80663t;
    }
}
