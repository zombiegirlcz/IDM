package com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.partner.give_consent;

import cli.g;
import cli.y;
import com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.partner.give_consent.GiveConsentScreenContract$ModalStep;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowContract$Input;
import com.revolut.kompot.common.ModalDestination;
import dx4.z2;
import hx7.e;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o64.d;
import oki.h;
import org.jetbrains.annotations.NotNull;
import pyd.c;
import q2e.i0;
import q5g.f0;
import q64.l;
import q64.n;
import q64.s;
import q64.t;
import vkm.v1;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends h implements n {

    @NotNull
    public static final s Companion = new s();
    public final PluginFlowContract$Input o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f67235p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f67236q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f67237r;

    public b(PluginFlowContract$Input flowInputData, d interactor, t stateMapper) {
        Intrinsics.checkNotNullParameter(flowInputData, "flowInputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = flowInputData;
        this.f67235p = interactor;
        this.f67236q = mra.d.b(this, new l(0), stateMapper, null, false, 12);
        this.f67237r = e.a(this, new f0(this, 1));
    }

    @Override // yji.l
    public final void I1() {
        I2();
    }

    public final void I2() {
        d dVar = this.f67235p;
        dVar.getClass();
        Continuation continuation = null;
        yji.l.a1(this, c.m(rd0.e.e(new v1(new cn0.d(dVar, continuation, 5)), h0.f322473a, new im2.b(3, 25, continuation))), null, null, new i0(this, continuation, 13), 3);
    }

    public final void J2(z2 z2Var) {
        h.v2(this.f67237r, new GiveConsentScreenContract$ModalStep.Info(z2Var), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f67237r;
    }

    @Override // cli.z
    public final g getState() {
        return this.f67236q;
    }
}
