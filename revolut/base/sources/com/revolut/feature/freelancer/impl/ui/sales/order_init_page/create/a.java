package com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create;

import ang.f;
import au6.k2;
import cli.y;
import com.revolut.data.model.Data;
import d27.e0;
import d27.i0;
import d27.o;
import d27.p0;
import d27.r;
import d27.s;
import d27.t;
import d27.u;
import d27.z;
import et6.h1;
import f27.c;
import gr6.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import l80.e;
import mra.d;
import oki.h;
import rp0.g1;
import tqi.g;
import vkm.q;
import vkm.v1;
import vkm.z1;
import w80.b;
import wsg.n;
import yji.l;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements z {
    public final g1 A;
    public final f B;
    public final n C;
    public final z1 D;
    public final y E;
    public final com.revolut.kompot.navigable.vc.modal.a F;
    public final b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f74179p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c70.a f74180q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f74181r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final h1 f74182s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final zq.a f74183t;
    public final OrderInitPageCreateScreenContract$InputData u;
    public final i4b.f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ed1.a f74184w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final c f74185x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final bbd.b f74186y;
    public final g z;

    public a(b amountFormatter, e dateProvider, c70.a clipboard, i freelancerCurrencyInteractor, h1 freelancerInteractor, zq.a freelancerLineItemInteractor, OrderInitPageCreateScreenContract$InputData inputData, i4b.f legalEntityContextProvider, ed1.a litePosFlowProvider, c orderInitPageDialogFactory, bbd.b orderInitPageInteractor, g shareCommandFactory, g1 shotDialogDisplayer, f userInteractor, n walletInteractor, p0 stateMapper) {
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(freelancerCurrencyInteractor, "freelancerCurrencyInteractor");
        Intrinsics.checkNotNullParameter(freelancerInteractor, "freelancerInteractor");
        Intrinsics.checkNotNullParameter(freelancerLineItemInteractor, "freelancerLineItemInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(legalEntityContextProvider, "legalEntityContextProvider");
        Intrinsics.checkNotNullParameter(litePosFlowProvider, "litePosFlowProvider");
        Intrinsics.checkNotNullParameter(orderInitPageDialogFactory, "orderInitPageDialogFactory");
        Intrinsics.checkNotNullParameter(orderInitPageInteractor, "orderInitPageInteractor");
        Intrinsics.checkNotNullParameter(shareCommandFactory, "shareCommandFactory");
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = amountFormatter;
        this.f74179p = dateProvider;
        this.f74180q = clipboard;
        this.f74181r = freelancerCurrencyInteractor;
        this.f74182s = freelancerInteractor;
        this.f74183t = freelancerLineItemInteractor;
        this.u = inputData;
        this.v = legalEntityContextProvider;
        this.f74184w = litePosFlowProvider;
        this.f74185x = orderInitPageDialogFactory;
        this.f74186y = orderInitPageInteractor;
        this.z = shareCommandFactory;
        this.A = shotDialogDisplayer;
        this.B = userInteractor;
        this.C = walletInteractor;
        z1 z1VarB = q.b(0, 6, null);
        z1VarB.k(Unit.f186387a);
        this.D = z1VarB;
        r rVar = new r(2, ((l80.f) dateProvider).e().plusMonths(1L));
        h0 h0Var = h0.f322473a;
        d27.n nVar = new d27.n(0);
        o oVar = new o(0);
        d27.q qVar = new d27.q(0);
        s sVar = u.f110771l;
        Data data = new Data(null, null, true, 3, null);
        t tVar = new t(0);
        m70.a.c(t0.f186434a);
        this.E = d.b(this, new u(h0Var, nVar, oVar, null, qVar, false, rVar, sVar, data, tVar, ""), stateMapper, null, false, 12);
        this.F = hx7.e.a(this, new cwj.h(this, 4));
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x017d, code lost:
    
        if (r1 != r4) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.a r25, gim.c r26) {
        /*
            Method dump skipped, instruction units count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.a.I2(com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.a r24, com.revolut.feature.shared.order_initiation.api.domain.OrderInitiationPage r25, gim.c r26) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.a.J2(com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.a, com.revolut.feature.shared.order_initiation.api.domain.OrderInitiationPage, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.D, new cvi.i(continuation, this, 4)), null, null, new i0(this, continuation, 1), 3);
        l.a1(this, boh.f.e(this.E.B(new d0m.a(29)), new e0(this, 1)), null, null, new i0(this, continuation, 2), 3);
        l.a1(this, mo3.a.g(u0.m(rd0.e.b(((k2) this.f74182s.f129237b).f9557h.f(Unit.f186387a, false)), new v1(new cuc.c(this, continuation, 11))), null, new czh.a(8), 1), null, null, new i0(this, continuation, 0), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.F;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.E;
    }
}
