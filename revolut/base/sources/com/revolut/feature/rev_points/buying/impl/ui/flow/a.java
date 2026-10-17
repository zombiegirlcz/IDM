package com.revolut.feature.rev_points.buying.impl.ui.flow;

import android.os.Parcelable;
import bvb.f;
import bvb.j;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.rev_points.buying.api.R$string;
import com.revolut.feature.rev_points.buying.api.navigation.InputData;
import com.revolut.feature.rev_points.buying.impl.ui.flow.RevPointsBuyingFlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.kompot.navigable.flow.FlowStep;
import hx7.e;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nii.g0;
import nii.h0;
import nii.j0;
import nii.u0;
import nii.u1;
import nii.y;
import nii.y0;
import nii.z;
import oki.h;
import qki.d;
import vkm.j2;
import xif.k;
import xjl.g;
import xng.l;
import xub.b;
import yki.i;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends h implements b {
    public final InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final wsg.b f83563p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d f83564q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f83565r;

    public a(InputData inputData, wsg.b newWalletsInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(newWalletsInteractor, "newWalletsInteractor");
        this.o = inputData;
        this.f83563p = newWalletsInteractor;
        this.f83564q = e.b(this, new RevPointsBuyingFlowContract$FlowState(inputData.f83553a ? RevPointsBuyingFlowContract$Step.RecurringBuy.f83562a : RevPointsBuyingFlowContract$Step.OneOffBuy.f83561a, false, null));
        this.f83565r = d8l.d.a(this, new k(this, 26));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.rev_points.buying.impl.ui.flow.a r5, dj0.d r6, gim.c r7) {
        /*
            r5.getClass()
            boolean r0 = r7 instanceof xub.h
            if (r0 == 0) goto L16
            r0 = r7
            xub.h r0 = (xub.h) r0
            int r1 = r0.f309006x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f309006x = r1
            goto L1b
        L16:
            xub.h r0 = new xub.h
            r0.<init>(r5, r7)
        L1b:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f309006x
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            dj0.d r6 = r0.u
            yhm.o.b(r7)     // Catch: java.lang.Throwable -> L2d
            goto L5f
        L2d:
            r5 = move-exception
            goto La8
        L30:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L38:
            yhm.o.b(r7)
            wsg.b r5 = r5.f83563p     // Catch: java.lang.Throwable -> L2d
            w4l.i r7 = w4l.i.f294643c     // Catch: java.lang.Throwable -> L2d
            kotlinx.coroutines.flow.Flow r5 = r5.e(r7)     // Catch: java.lang.Throwable -> L2d
            vy5.d0 r7 = new vy5.d0     // Catch: java.lang.Throwable -> L2d
            r2 = 25
            r7.<init>(r5, r2)     // Catch: java.lang.Throwable -> L2d
            xti.k r5 = new xti.k     // Catch: java.lang.Throwable -> L2d
            r2 = 1
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L2d
            jhi.b r5 = mo3.a.g(r7, r4, r5, r3)     // Catch: java.lang.Throwable -> L2d
            r0.u = r6     // Catch: java.lang.Throwable -> L2d
            r0.f309006x = r3     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r7 = vkm.q.x(r5, r0)     // Catch: java.lang.Throwable -> L2d
            if (r7 != r1) goto L5f
            return r1
        L5f:
            kotlin.Pair r7 = (kotlin.Pair) r7     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r5 = r7.f186386b     // Catch: java.lang.Throwable -> L2d
            java.lang.Iterable r5 = (java.lang.Iterable) r5     // Catch: java.lang.Throwable -> L2d
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L2d
        L69:
            boolean r7 = r5.hasNext()     // Catch: java.lang.Throwable -> L2d
            if (r7 == 0) goto L9b
            java.lang.Object r7 = r5.next()     // Catch: java.lang.Throwable -> L2d
            r0 = r7
            io3.d r0 = (io3.d) r0     // Catch: java.lang.Throwable -> L2d
            java.lang.String r1 = r0.f163147c     // Catch: java.lang.Throwable -> L2d
            xi0.b r2 = r6.f115083b     // Catch: java.lang.Throwable -> L2d
            java.lang.String r2 = r2.f306286a     // Catch: java.lang.Throwable -> L2d
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r2)     // Catch: java.lang.Throwable -> L2d
            if (r1 == 0) goto L69
            io3.l r1 = r0.e     // Catch: java.lang.Throwable -> L2d
            io3.l r2 = io3.l.CURRENT     // Catch: java.lang.Throwable -> L2d
            if (r1 != r2) goto L69
            io3.k r1 = r0.f     // Catch: java.lang.Throwable -> L2d
            io3.k r2 = io3.k.ACTIVE     // Catch: java.lang.Throwable -> L2d
            if (r1 != r2) goto L69
            io3.i r1 = r0.f163149h     // Catch: java.lang.Throwable -> L2d
            io3.i r2 = io3.i.INTERNAL     // Catch: java.lang.Throwable -> L2d
            if (r1 != r2) goto L69
            io3.j r0 = r0.f163148g     // Catch: java.lang.Throwable -> L2d
            io3.j r1 = io3.j.PERSONAL     // Catch: java.lang.Throwable -> L2d
            if (r0 != r1) goto L69
            goto L9c
        L9b:
            r7 = r4
        L9c:
            io3.d r7 = (io3.d) r7     // Catch: java.lang.Throwable -> L2d
            if (r7 == 0) goto Lac
            long r5 = r7.i     // Catch: java.lang.Throwable -> L2d
            java.lang.Long r7 = new java.lang.Long     // Catch: java.lang.Throwable -> L2d
            r7.<init>(r5)     // Catch: java.lang.Throwable -> L2d
            return r7
        La8:
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException
            if (r6 != 0) goto Lad
        Lac:
            return r4
        Lad:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.rev_points.buying.impl.ui.flow.a.I2(com.revolut.feature.rev_points.buying.impl.ui.flow.a, dj0.d, gim.c):java.lang.Object");
    }

    public static final void J2(a aVar) {
        FlowStep flowStep = aVar.o.f83553a ? RevPointsBuyingFlowContract$Step.RecurringBuy.f83562a : RevPointsBuyingFlowContract$Step.OneOffBuy.f83561a;
        aVar.H2(aVar.f83564q, new l(flowStep, 22));
        h.w2(aVar.f83565r, flowStep, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
    }

    public final void K2(f fVar) {
        H2(this.f83564q, new xrl.a(26));
        yji.l.b1(this, X1(new y0(null, new z(fVar.f18983a, fVar.f18984b, fVar.f18985c, null, null, null, false, null, null, null, fVar.e ? u0.SOFT_FAIL : u0.DEFAULT, new y(1, null, fVar.d), null, 20468), false, 5)), null, new g(this, fVar, null, 27), 3);
    }

    public final void L2(bvb.h hVar) {
        H2(this.f83564q, new xrl.a(27));
        yji.l.b1(this, X1(new y0(null, new z(new TextLocalisedClause(R$string.points_buying_error_insufficient_funds_title, null, null, 14), new TextLocalisedClause(R$string.points_buying_error_insufficient_funds_description, null, null, 14), new TextLocalisedClause(R$string.points_buying_error_insufficient_funds_cta, null, null, 14), null, null, null, false, null, null, null, null, new y(1, null, 25271601), null, 24564), false, 5)), null, new wo2.l(this, hVar, (Continuation) null, 16), 3);
    }

    @Override // yki.j
    public final void M0() {
        h.w2(this.f83565r, ((RevPointsBuyingFlowContract$FlowState) ((j2) this.f83564q.f22677a).getValue()).f83557a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
    }

    public final void M2(bvb.i iVar) {
        H2(this.f83564q, new xrl.a(28));
        yji.l.b1(this, X1(new y0(null, new g0(iVar.f18988a, iVar.f18989b, null, null, null, null, null, null, false, null, false, null, 16380), false, 5)), null, new xub.f(this, null, 0), 3);
    }

    public final void N2(j jVar) {
        H2(this.f83564q, new xrl.a(29));
        yji.l.b1(this, X1(new y0(null, new j0((Clause) jVar.f18990a, jVar.f18991b, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, jVar.f18992c ? h0.CONFETTI : h0.NONE, (ResourceImage) null, 3068), false, 5)), null, new xub.f(this, null, 1), 3);
    }

    @Override // yji.l
    public final void T1(long j2) {
        d dVar = this.f83564q;
        dj0.d dVar2 = ((RevPointsBuyingFlowContract$FlowState) ((j2) dVar.f22677a).getValue()).f83559c;
        if (dVar2 != null) {
            H2(dVar, new xrl.a(24));
            l2(new xnl.f(this, dVar2, null, 13), new yi5.b(26));
        }
    }

    @Override // qki.e
    public final d getState() {
        return this.f83564q;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f83565r;
    }
}
