package tg5;

import android.app.Activity;
import android.content.Context;
import android.text.InputFilter;
import android.view.View;
import c65.v;
import c65.x;
import c65.y;
import com.google.common.collect.ImmutableSet;
import com.revolut.controller_extensions.keyboardsuggestions.KeyboardSuggestionsControllerExtension;
import com.revolut.feature.apm.bills.pagopa.impl.ui.confirmation.PagoPABillConfirmationScreenContract$InputData;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.block.BlockMerchantScreenContract$InputData;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.details.BlockedMerchantDetailsScreenContract$InputData;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.payments_list.page.BlockedPaymentsListScreenContract$Input;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment.SelectPaymentToBlockScreenContract$InputData;
import com.revolut.feature.card_management.impl.ui.kompot.placeholder_settings.DisposableCardSettingsContract$InputData;
import com.revolut.feature.card_management.impl.ui.kompot.replace.flow.CardReplaceFlowContract$InputData;
import com.revolut.feature.card_management.impl.ui.kompot.settings.RevolutCardSettingsScreenContract$InputData;
import com.revolut.feature.card_management.impl.ui.limit.transaction_limit.TransactionLimitControllerContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccountpicker.LoanRepaymentAccountModelExtension;
import com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.amount.AmountInputControllerContract$InputData;
import com.revolut.feature.passcode.PasscodeScreenContract$InputData;
import com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft;
import com.revolut.feature_crypto_order_flow.api.navigation.CryptoExchangeFlowInputData;
import com.revolut.feature_crypto_order_flow.impl.exchange.CryptoExchangeScreen;
import com.revolut.feature_crypto_order_flow.impl.exchange.CryptoExchangeScreenContract$InputData;
import com.revolut.feature_crypto_order_flow.impl.order_summary.OrderSummaryScreen;
import com.revolut.feature_crypto_order_flow.impl.order_summary.OrderSummaryScreenContract$InputData;
import com.revolut.feature_crypto_order_flow.impl.order_summary.extensions.price.screen.OrderPriceScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.network.error.KycNotPassedErrorHandler;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import com.revolut.ui.activity.container.ContainerActivity;
import dw3.d2;
import ffk.t;
import fmc.z;
import g03.b0;
import gs2.a0;
import ip0.v7;
import java.util.Collection;
import java.util.Optional;
import java.util.Set;
import jzh.w0;
import kotlin.jvm.internal.Intrinsics;
import ljl.q0;
import ljl.q1;
import lp.l9;
import lu7.m0;
import mga.f0;
import mga.i0;
import no.j2;
import q03.h0;
import q03.n0;
import rkd.m;
import rp0.g1;
import rp0.l0;
import rp0.x0;
import t33.w;
import tnb.g0;
import tz2.q;
import tz2.r;
import u03.l;
import us6.w3;
import uyh.a1;
import uyh.b1;
import v03.p;
import vc.s;
import yg5.u;
import yji.n;
import yji.o;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f271086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f271087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f271088c;
    public final Object d;

    public /* synthetic */ h(Object obj2, Object obj3, int i, int i2) {
        this.f271086a = i2;
        this.f271087b = obj2;
        this.d = obj3;
        this.f271088c = i;
    }

    private final Object a() {
        tyh.b bVar = (tyh.b) this.f271087b;
        tyh.g gVar = (tyh.g) this.d;
        int i = this.f271088c;
        switch (i) {
            case 0:
                return new tzh.i((tzh.b) gVar.f275627g.get(), (tzh.a) gVar.f275628h.get());
            case 1:
                ViewController view = gVar.f275624a;
                lzh.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(view, "view");
                return (OrderSummaryScreen) view;
            case 2:
                return new tzh.j();
            case 3:
                return new aah.g(gVar.f275625b, (uzh.a) gVar.k.get());
            case 4:
                return new uzh.e((CryptoOrderDraft) gVar.f275629j.get(), ((s41.a) bVar.f275598s).d());
            case 5:
                OrderSummaryScreenContract$InputData inputData = gVar.f275626c;
                lzh.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(inputData, "inputData");
                CryptoOrderDraft cryptoOrderDraft = inputData.f96775a;
                s.k(cryptoOrderDraft);
                return cryptoOrderDraft;
            case 6:
                return new vzh.d(gVar.d, (vzh.a) gVar.f275631m.get());
            case 7:
                sd5.c cVarA = bVar.f275599t.a();
                s.j(cVarA);
                return new vzh.h(cVarA, (CryptoOrderDraft) gVar.f275629j.get());
            case 8:
                return new aah.g((pzh.b) gVar.f275627g.get(), (pzh.a) gVar.o.get());
            case 9:
                CryptoOrderDraft cryptoOrderDraft2 = (CryptoOrderDraft) gVar.f275629j.get();
                ce5.b bVar2 = bVar.f275596q;
                return new pzh.c(cryptoOrderDraft2, new be5.e());
            case 10:
                return nga.c.s(bVar.u.c(), (i0) gVar.f275635r.get(), (f0) gVar.f275637t.get(), (on.a) gVar.u.get());
            case 11:
                o controller = (com.revolut.kompot.navigable.a) gVar.f275634q.get();
                Intrinsics.checkNotNullParameter(controller, "controller");
                i0 i0Var = (i0) controller;
                s.k(i0Var);
                return i0Var;
            case 12:
                return nga.c.u(bVar.u.c(), gVar.f275624a, (wn.a) gVar.f275636s.get());
            case 13:
                return v7.z(bVar.v, "provider");
            case 14:
                os2.g factory = bVar.v.c();
                Intrinsics.checkNotNullParameter(factory, "factory");
                return (sn.a) factory.f229224b;
            case 15:
                Object extension = (mzh.a) gVar.f275639x.get();
                ozh.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                n nVar = (n) extension;
                s.k(nVar);
                return nVar;
            case 16:
                syh.b bVar3 = bVar.f275600w;
                ryh.a aVar = new ryh.a();
                gte.a aVarB = bVar.f275592l.b();
                s.j(aVarB);
                mkd.d dVar = (mkd.d) gVar.f275638w.get();
                v0i.b bVar4 = bVar.d;
                g0 g0Var = new g0(new c1i.g(w3.k(bVar4.f284857a, ((nj0.d) bVar4.f284858b).f()), bVar4.b()));
                tyh.b bVar5 = gVar.f;
                tga.k kVarB = bVar5.f275602y.b();
                gte.a aVarB2 = bVar5.f275592l.b();
                s.j(aVarB2);
                e0i.d dVar2 = new e0i.d(kVarB, aVarB2);
                e0i.b bVar6 = new e0i.b();
                t tVarF = bVar.z.f();
                s.j(tVarF);
                return new mzh.e(aVar, aVarB, dVar, g0Var, dVar2, bVar6, tVarF, (gzh.b) bVar.Q.get());
            case 17:
                mkd.g view2 = gVar.e;
                m factory2 = bVar.f275601x.a();
                s.j(factory2);
                lzh.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(view2, "view");
                Intrinsics.checkNotNullParameter(factory2, "factory");
                return factory2.a(view2);
            case 18:
                qzh.a extension2 = (qzh.a) gVar.z.get();
                ozh.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension2, "extension");
                s.k(extension2);
                return extension2;
            case 19:
                tyh.b bVar7 = gVar.f;
                tyh.b bVar8 = gVar.f;
                m41.c cVar = bVar7.A;
                k61.a aVarE = cVar.e();
                s.j(aVarE);
                rea.m mVarF = bVar7.B.f();
                x0i.f fVarD = bVar7.d.d();
                zjh.f fVar = new zjh.f(bVar8.a());
                k61.a aVarE2 = cVar.e();
                s.j(aVarE2);
                nyb.k kVarC = bVar7.f275593m.c();
                s.j(kVarC);
                c0i.h hVar = new c0i.h(aVarE, mVarF, fVarD, fVar, new c0i.d(aVarE2, kVarC));
                r10.a aVar2 = new r10.a(bVar8.f275590h.b(), bVar8.o.d());
                xvh.c cVarA2 = ((a6d.e) bVar.C).a();
                s.j(cVarA2);
                return new qzh.e(hVar, aVar2, cVarA2, new qzh.g(gVar.b()), gVar.c());
            case 20:
                sd5.c cVarA3 = gVar.f.f275599t.a();
                s.j(cVarA3);
                vzh.h extension3 = new vzh.h(cVarA3, (CryptoOrderDraft) gVar.f275629j.get());
                ozh.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension3, "extension");
                return extension3;
            case 21:
                rzh.c extension4 = (rzh.c) gVar.C.get();
                ozh.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension4, "extension");
                s.k(extension4);
                return extension4;
            case 22:
                p0i.b bVarE = bVar.d.e();
                s.j(bVarE);
                rzh.b bVarC = gVar.c();
                wj0.a aVarI = ((nj0.d) bVar.f).i();
                s.j(aVarI);
                return new rzh.e(bVarE, bVarC, aVarI);
            case 23:
                yzh.a extension5 = (yzh.a) gVar.E.get();
                ozh.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension5, "extension");
                s.k(extension5);
                return extension5;
            case 24:
                rea.m mVarF2 = bVar.B.f();
                xua.a aVarA = bVar.G.a();
                s.j(aVarA);
                return new yzh.d(mVarF2, aVarA, bVar.H.a(), bVar.f275590h.b(), gVar.c());
            case 25:
                szh.a extension6 = (szh.a) gVar.G.get();
                ozh.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension6, "extension");
                s.k(extension6);
                return extension6;
            case 26:
                rea.m mVarF3 = bVar.B.f();
                rzh.b bVarC2 = gVar.c();
                tyh.b bVar9 = gVar.f;
                o8l.c cVarB = bVar.I.b();
                r10.a aVar3 = new r10.a(bVar9.f275590h.b(), bVar9.o.d());
                xvh.c cVarA4 = ((a6d.e) bVar.C).a();
                s.j(cVarA4);
                return new szh.e(mVarF3, bVarC2, cVarB, aVar3, cVarA4, gVar.b(), new zjh.f(bVar9.a()), bVar.J.h(), new v8i.a());
            case 27:
                zzh.a extension7 = (zzh.a) gVar.I.get();
                ozh.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension7, "extension");
                s.k(extension7);
                return extension7;
            case 28:
                p0i.b bVarE2 = bVar.d.e();
                s.j(bVarE2);
                rzh.b bVarC3 = gVar.c();
                wj0.a aVarI2 = ((nj0.d) bVar.f).i();
                s.j(aVarI2);
                return new zzh.c(bVarE2, bVarC3, aVarI2);
            case 29:
                wn.a aVar4 = (wn.a) gVar.f275636s.get();
                n57.a.d(aVar4);
                return aVar4;
            case 30:
                d0i.j jVar = new d0i.j();
                tyh.b bVar10 = gVar.f;
                tyh.b bVar11 = gVar.f;
                j4i.a aVar5 = bVar10.f275588c;
                ite.a aVar6 = bVar10.f275592l;
                d0i.h hVar2 = new d0i.h(new l4i.c(), new d0i.d(new l4i.a(), aVar5.b(), bVar10.c()), new d0i.e(bVar10.o.j()), new q2i.d(), new by5.a(new l4i.a(), 17), new hzh.a());
                a0i.d dVar3 = new a0i.d(aVar5.b());
                r2i.a aVar7 = new r2i.a();
                gte.a aVarB3 = aVar6.b();
                s.j(aVarB3);
                d0i.m mVar = new d0i.m(aVarB3);
                gte.a aVarB4 = aVar6.b();
                s.j(aVarB4);
                w0 w0Var = new w0(jVar, hVar2, dVar3, aVar7, mVar, new d0i.b(aVarB4));
                OrderSummaryScreenContract$InputData orderSummaryScreenContract$InputData = gVar.f275626c;
                sh5.d dVarF = bVar.K.f();
                s.j(dVarF);
                jzh.k kVar = new jzh.k((qzh.a) gVar.z.get(), (rzh.c) gVar.C.get(), (yzh.a) gVar.E.get(), (szh.a) gVar.G.get(), (zzh.a) gVar.I.get(), bVar11.b());
                o7.b bVarA = bVar.f275594n.a();
                gte.a aVarB5 = bVar11.f275592l.b();
                s.j(aVarB5);
                a1 a1Var = new a1(aVarB5, bVar11.c());
                l4i.a aVar8 = new l4i.a();
                ang.f fVarE = bVar.L.e();
                usg.a aVar9 = bVar11.f275590h;
                qud.c cVar2 = bVar11.o;
                tzh.k kVar2 = new tzh.k(aVar9.b(), cVar2.e(), cVar2.d());
                mzh.a aVar10 = (mzh.a) gVar.f275639x.get();
                i4b.f fVar2 = new i4b.f(new l4i.a());
                oyh.a aVar11 = new oyh.a();
                gte.a aVarB6 = bVar11.f275592l.b();
                s.j(aVarB6);
                aoa.k kVar3 = new aoa.k(aVar11, aVarB6);
                gte.a aVarB7 = bVar.f275592l.b();
                s.j(aVarB7);
                pzh.a aVar12 = (pzh.a) gVar.o.get();
                rga.c cVarB2 = bVar.u.b();
                s.j(cVarB2);
                return new com.revolut.feature_crypto_order_flow.impl.order_summary.a(w0Var, orderSummaryScreenContract$InputData, dVarF, kVar, bVarA, a1Var, aVar8, fVarE, kVar2, aVar10, fVar2, kVar3, aVarB7, aVar12, cVarB2);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object b() {
        tz2.g gVar = (tz2.g) this.d;
        tz2.e eVar = (tz2.e) this.f271087b;
        int i = this.f271088c;
        if (i != 0) {
            if (i == 1) {
                return new z03.f();
            }
            if (i == 2) {
                return new z03.e();
            }
            throw new AssertionError(i);
        }
        CardReplaceFlowContract$InputData cardReplaceFlowContract$InputData = gVar.f275775a;
        z6l.s sVarE = eVar.o.e();
        uz2.b bVar = (uz2.b) eVar.f.f275756j.get();
        s.j(bVar);
        return new com.revolut.feature.card_management.impl.ui.kompot.replace.flow.d(cardReplaceFlowContract$InputData, sVarE, bVar, eVar.f275767p.c(), eVar.f275768q.b(), (z03.c) gVar.d.get(), (z03.c) gVar.e.get());
    }

    private final Object c() {
        tz2.e eVar = (tz2.e) this.f271087b;
        tz2.h hVar = (tz2.h) this.d;
        int i = this.f271088c;
        if (i == 0) {
            return new o03.m((cli.n) hVar.f275780c.get(), hVar.f275778a, eVar.o.e(), eVar.f275769r.a());
        }
        if (i != 1) {
            throw new AssertionError(i);
        }
        m93.g gVarI = hVar.f275779b.f275760c.i();
        s.j(gVarI);
        return new i3g.k(new x03.f(gVarI));
    }

    private final Object d() {
        tz2.e eVar = (tz2.e) this.f271087b;
        tz2.m mVar = (tz2.m) this.d;
        int i = this.f271088c;
        switch (i) {
            case 0:
                return kxa.j.k((j60.a) mVar.e.get());
            case 1:
                return ehe.n.s((com.revolut.kompot.navigable.a) mVar.f275793c.get(), (rp0.m) mVar.d.get());
            case 2:
                return new rp0.m();
            case 3:
                fd6.a aVar = (fd6.a) mVar.f275795h.get();
                va.g.t(aVar);
                return aVar;
            case 4:
                return va.g.s(((zc6.a) eVar.f275759b).d(), (xc6.a) mVar.f275794g.get());
            case 5:
                return r6.b.k((zc6.a) eVar.f275759b, "factory");
            case 6:
                return va.g.u((xc6.a) mVar.f275794g.get());
            case 7:
                j60.a aVar2 = (j60.a) mVar.e.get();
                u03.j jVarB = mVar.b();
                l93.f fVarJ = eVar.f275760c.j();
                s.j(fVarJ);
                return new f03.d(aVar2, jVarB, fVarJ);
            case 8:
                return new u03.e();
            case 9:
                l93.f fVarJ2 = eVar.f275760c.j();
                s.j(fVarJ2);
                return new wz2.d(fVarJ2, (j60.a) mVar.e.get(), new w63.a());
            case 10:
                cli.n nVar = (cli.n) mVar.f275799n.get();
                DisposableCardSettingsContract$InputData disposableCardSettingsContract$InputData = mVar.f275791a;
                l93.f fVarJ3 = eVar.f275760c.j();
                s.j(fVarJ3);
                return new com.revolut.feature.card_management.impl.ui.kompot.placeholder_settings.b(nVar, disposableCardSettingsContract$InputData, fVarJ3, new i03.c(mVar.f275792b.d.a(), mVar.b(), new l()), new i03.a(), (j60.a) mVar.e.get(), eVar.d.a(), (f03.a) mVar.f275797l.get(), eVar.f275765m.a(), (wz2.b) mVar.f275798m.get(), (g1) mVar.o.get(), ((zc6.a) eVar.f275759b).b(), eVar.f275766n.e());
            case 11:
                return new b0(((zc6.a) eVar.f275759b).c(), 0);
            case 12:
                com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) mVar.f275793c.get();
                h03.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller, "controller");
                x0 x0Var = g1.Companion;
                View decorView = controller.m2().getWindow().getDecorView();
                Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
                return x0.a(x0Var, decorView);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object e() {
        tz2.n nVar = (tz2.n) this.d;
        tz2.e eVar = (tz2.e) this.f271087b;
        int i = this.f271088c;
        switch (i) {
            case 0:
                return kxa.j.k((j60.a) nVar.f.get());
            case 1:
                return ehe.n.s((com.revolut.kompot.navigable.a) nVar.d.get(), (rp0.m) nVar.e.get());
            case 2:
                return new rp0.m();
            case 3:
                fd6.a aVar = (fd6.a) nVar.i.get();
                va.g.t(aVar);
                return aVar;
            case 4:
                return va.g.s(((zc6.a) eVar.f275759b).d(), (xc6.a) nVar.f275805h.get());
            case 5:
                return r6.b.k((zc6.a) eVar.f275759b, "factory");
            case 6:
                return va.g.u((xc6.a) nVar.f275805h.get());
            case 7:
                l93.f fVarJ = eVar.f275760c.j();
                s.j(fVarJ);
                return new wz2.d(fVarJ, (j60.a) nVar.f.get(), new w63.a());
            case 8:
                j60.a aVar2 = (j60.a) nVar.f.get();
                u03.j jVarB = nVar.b();
                l93.f fVarJ2 = eVar.f275760c.j();
                s.j(fVarJ2);
                return new f03.d(aVar2, jVarB, fVarJ2);
            case 9:
                u03.c cVar = (u03.c) eVar.f.f275757l.get();
                s.j(cVar);
                return new u03.b(cVar);
            case 10:
                cli.n nVar2 = (cli.n) nVar.o.get();
                RevolutCardSettingsScreenContract$InputData revolutCardSettingsScreenContract$InputData = nVar.f275802b;
                j60.a aVar3 = (j60.a) nVar.f.get();
                az2.b bVarA = eVar.f.a();
                s.j(bVarA);
                u03.j jVarB2 = nVar.b();
                n0 n0Var = (n0) nVar.f275810p.get();
                s70.a aVarM = eVar.i.m();
                s.j(aVarM);
                y43.a aVarA = eVar.d.a();
                f03.a aVar4 = (f03.a) nVar.f275809n.get();
                u03.d dVar = new u03.d();
                l93.f fVarJ3 = eVar.f275760c.j();
                s.j(fVarJ3);
                f73.c cVar2 = new f73.c();
                sf0.h hVarB = eVar.f275764l.b();
                s.j(hVarB);
                gte.a aVarB = eVar.f275758a.b();
                s.j(aVarB);
                return new com.revolut.feature.card_management.impl.ui.kompot.settings.b(nVar2, revolutCardSettingsScreenContract$InputData, aVar3, bVarA, jVarB2, n0Var, aVarM, aVarA, aVar4, dVar, fVarJ3, cVar2, hVarB, aVarB, (g1) nVar.f275811q.get(), ((zc6.a) eVar.f275759b).b());
            case 11:
                return new b0(((zc6.a) eVar.f275759b).c(), 1);
            case 12:
                RevolutCardSettingsScreenContract$InputData revolutCardSettingsScreenContract$InputData2 = nVar.f275802b;
                da3.j jVar = eVar.f275760c;
                vtc.t tVar = eVar.e;
                l93.f fVarJ4 = jVar.j();
                s.j(fVarJ4);
                mt8.d dVarB = eVar.f275761g.b();
                s.j(dVarB);
                fk3.a aVarA2 = eVar.f275762h.a();
                s.j(aVarA2);
                ha3.d dVarE = eVar.f275760c.e();
                s.j(dVarE);
                e03.c cVar3 = (e03.c) nVar.f275808m.get();
                l lVar = new l();
                y70.a aVarC = nVar.f275803c.i.c();
                s.j(aVarC);
                u03.n nVar3 = new u03.n(cVar3, lVar, aVarC);
                e03.c cVar4 = (e03.c) nVar.f275808m.get();
                xua.a aVarA3 = eVar.f275763j.a();
                s.j(aVarA3);
                kdh.b bVarD = ((n86.d) eVar.k).d();
                wz2.b bVar = (wz2.b) nVar.f275807l.get();
                wtc.h hVar = (wtc.h) tVar.U.get();
                s.j(hVar);
                ptc.a aVar5 = (ptc.a) tVar.Z.get();
                s.j(aVar5);
                return new h0(revolutCardSettingsScreenContract$InputData2, fVarJ4, dVarB, aVarA2, dVarE, nVar3, cVar4, aVarA3, bVarD, bVar, hVar, aVar5, tVar.c());
            case 13:
                return r03.b.a((com.revolut.kompot.navigable.a) nVar.d.get());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object f() {
        tz2.n nVar = (tz2.n) this.d;
        tz2.e eVar = (tz2.e) this.f271087b;
        int i = this.f271088c;
        switch (i) {
            case 0:
                return kxa.j.k((j60.a) nVar.f.get());
            case 1:
                return ehe.n.s((com.revolut.kompot.navigable.a) nVar.d.get(), (rp0.m) nVar.e.get());
            case 2:
                return new rp0.m();
            case 3:
                fd6.a aVar = (fd6.a) nVar.i.get();
                va.g.t(aVar);
                return aVar;
            case 4:
                return va.g.s(((zc6.a) eVar.f275759b).d(), (xc6.a) nVar.f275805h.get());
            case 5:
                return r6.b.k((zc6.a) eVar.f275759b, "factory");
            case 6:
                return va.g.u((xc6.a) nVar.f275805h.get());
            case 7:
                l93.f fVarJ = eVar.f275760c.j();
                s.j(fVarJ);
                return new wz2.d(fVarJ, (j60.a) nVar.f.get(), new w63.a());
            case 8:
                j60.a aVar2 = (j60.a) nVar.f.get();
                u03.j jVarB = nVar.b();
                l93.f fVarJ2 = eVar.f275760c.j();
                s.j(fVarJ2);
                return new f03.d(aVar2, jVarB, fVarJ2);
            case 9:
                return new u03.e();
            case 10:
                cli.n nVar2 = (cli.n) nVar.o.get();
                RevolutCardSettingsScreenContract$InputData revolutCardSettingsScreenContract$InputData = nVar.f275802b;
                j60.a aVar3 = (j60.a) nVar.f.get();
                az2.b bVarA = eVar.f.a();
                s.j(bVarA);
                u03.j jVarB2 = nVar.b();
                n0 n0Var = (n0) nVar.f275810p.get();
                s70.a aVarM = eVar.i.m();
                s.j(aVarM);
                y43.a aVarA = eVar.d.a();
                f03.a aVar4 = (f03.a) nVar.f275809n.get();
                u03.d dVar = new u03.d();
                l93.f fVarJ3 = eVar.f275760c.j();
                s.j(fVarJ3);
                f73.c cVar = new f73.c();
                sf0.h hVarB = eVar.f275764l.b();
                s.j(hVarB);
                gte.a aVarB = eVar.f275758a.b();
                s.j(aVarB);
                return new com.revolut.feature.card_management.impl.ui.kompot.settings.b(nVar2, revolutCardSettingsScreenContract$InputData, aVar3, bVarA, jVarB2, n0Var, aVarM, aVarA, aVar4, dVar, fVarJ3, cVar, hVarB, aVarB, (g1) nVar.f275811q.get(), ((zc6.a) eVar.f275759b).b());
            case 11:
                return new b0(((zc6.a) eVar.f275759b).c(), 1);
            case 12:
                RevolutCardSettingsScreenContract$InputData revolutCardSettingsScreenContract$InputData2 = nVar.f275802b;
                da3.j jVar = eVar.f275760c;
                vtc.t tVar = eVar.e;
                l93.f fVarJ4 = jVar.j();
                s.j(fVarJ4);
                mt8.d dVarB = eVar.f275761g.b();
                s.j(dVarB);
                fk3.a aVarA2 = eVar.f275762h.a();
                s.j(aVarA2);
                ha3.d dVarE = eVar.f275760c.e();
                s.j(dVarE);
                e03.c cVar2 = (e03.c) nVar.f275808m.get();
                l lVar = new l();
                y70.a aVarC = nVar.f275803c.i.c();
                s.j(aVarC);
                u03.n nVar3 = new u03.n(cVar2, lVar, aVarC);
                e03.c cVar3 = (e03.c) nVar.f275808m.get();
                xua.a aVarA3 = eVar.f275763j.a();
                s.j(aVarA3);
                kdh.b bVarD = ((n86.d) eVar.k).d();
                wz2.b bVar = (wz2.b) nVar.f275807l.get();
                wtc.h hVar = (wtc.h) tVar.U.get();
                s.j(hVar);
                ptc.a aVar5 = (ptc.a) tVar.Z.get();
                s.j(aVar5);
                return new h0(revolutCardSettingsScreenContract$InputData2, fVarJ4, dVarB, aVarA2, dVarE, nVar3, cVar3, aVarA3, bVarD, bVar, hVar, aVar5, tVar.c());
            case 13:
                return r03.b.a((com.revolut.kompot.navigable.a) nVar.d.get());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object g() {
        tz2.e eVar = (tz2.e) this.f271087b;
        q qVar = (q) this.d;
        int i = this.f271088c;
        if (i == 0) {
            n60.a aVar = (n60.a) qVar.f275821c.get();
            o5k.i.l(aVar);
            return aVar;
        }
        if (i == 1) {
            return o5k.i.q((com.revolut.kompot.navigable.a) qVar.f275820b.get());
        }
        if (i != 2) {
            if (i == 3) {
                return new com.revolut.feature.card_order_new.common.setpin.kompot.c(qVar.f275819a);
            }
            throw new AssertionError(i);
        }
        cli.n nVar = (cli.n) qVar.e.get();
        k13.a aVar2 = new k13.a();
        n60.a aVar3 = (n60.a) qVar.f275821c.get();
        ang.f fVarE = eVar.f275766n.e();
        l93.f fVarJ = eVar.f275760c.j();
        s.j(fVarJ);
        return new com.revolut.feature.card_order_new.common.setpin.kompot.a(nVar, aVar2, aVar3, fVarE, fVarJ, qVar.f275819a);
    }

    private final Object h() {
        tz2.e eVar = (tz2.e) this.f271087b;
        l70.e eVar2 = eVar.i;
        r rVar = (r) this.d;
        int i = this.f271088c;
        if (i == 0) {
            cli.n nVar = (cli.n) rVar.f275824c.get();
            TransactionLimitControllerContract$InputData transactionLimitControllerContract$InputData = rVar.f275822a;
            w80.b bVarJ = eVar2.j();
            s.j(bVarJ);
            g1 g1Var = (g1) rVar.e.get();
            l93.f fVarJ = eVar.f275760c.j();
            s.j(fVarJ);
            return new v03.m(nVar, transactionLimitControllerContract$InputData, bVarJ, g1Var, fVarJ);
        }
        if (i == 1) {
            w80.b bVarJ2 = eVar2.j();
            s.j(bVarJ2);
            return new p((InputFilter) rVar.f275823b.get(), new u80.o(), bVarJ2);
        }
        if (i == 2) {
            qd0.b languageProvider = eVar2.n();
            s.j(languageProvider);
            w03.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
            return new rx0.i(0, ((s80.b) languageProvider).b());
        }
        if (i != 3) {
            throw new AssertionError(i);
        }
        com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) rVar.d.get();
        w03.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(controller, "controller");
        x0 x0Var = g1.Companion;
        View decorView = controller.m2().getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        return x0.a(x0Var, decorView);
    }

    private final Object i() {
        u33.b bVar = (u33.b) this.f271087b;
        u33.a aVar = (u33.a) this.d;
        int i = this.f271088c;
        switch (i) {
            case 0:
                aVar.getClass();
                return new cn.d(ImmutableSet.copyOf((Collection) dn.b.a()), (cn.e) bVar.f276766n.get(), bVar.b());
            case 1:
                um.c cVar = (um.c) bVar.o.get();
                aVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(5);
                u33.b bVar2 = aVar.f276742b;
                hn.h hVar = (hn.h) bVar2.f276767p.get();
                t70.g gVarO = bVar2.f276759b.o();
                s.j(gVarO);
                builderBuilderWithExpectedSize.add(new jn.a(hVar, gVarO));
                builderBuilderWithExpectedSize.add(new vm.b(com.google.android.gms.internal.mlkit_vision_face.a.f()));
                builderBuilderWithExpectedSize.add(bVar2.c());
                builderBuilderWithExpectedSize.addAll((Iterable) in.g.a());
                builderBuilderWithExpectedSize.add(new jn.d(e4m.b.a(aVar.d)));
                return new in.e(cVar, builderBuilderWithExpectedSize.build(), bVar.b());
            case 2:
                return bq.i.t(aVar.f276741a);
            case 3:
                aVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize2 = ImmutableSet.builderWithExpectedSize(3);
                builderBuilderWithExpectedSize2.addAll((Iterable) kn.g.a());
                builderBuilderWithExpectedSize2.add(aVar.f.get());
                builderBuilderWithExpectedSize2.add(new kn.h(e4m.b.a(aVar.f276745h)));
                return new kn.e(builderBuilderWithExpectedSize2.build(), (ym.d) bVar.f276769r.get(), bVar.b());
            case 4:
                return new zm.a();
            case 5:
                return new tpi.i((rpi.c) aVar.f276744g.get(), gsi.c.a(aVar.f276741a));
            case 6:
                return new rpi.b(bq.i.b(aVar.f276741a));
            case 7:
                aVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize3 = ImmutableSet.builderWithExpectedSize(2);
                builderBuilderWithExpectedSize3.addAll((Iterable) hn.g.a());
                builderBuilderWithExpectedSize3.add(aVar.f276742b.c());
                return new hn.d(builderBuilderWithExpectedSize3.build(), (hn.h) bVar.f276767p.get(), (npi.f) aVar.f276746j.get());
            case 8:
                Context contextI = bq.i.i(aVar.f276741a);
                BaseDelegatesActivity baseDelegatesActivityF = bq.i.f(aVar.f276741a);
                t70.g gVarO2 = bVar.f276759b.o();
                s.j(gVarO2);
                return new npi.c(contextI, baseDelegatesActivityF, gVarO2);
            case 9:
                return new en.c(ImmutableSet.of((ln.d) aVar.f276742b.f276768q.get()), bq.i.l(aVar.f276741a));
            case 10:
                return new gn.c((lpi.e) aVar.f276748m.get(), (sm.e) bVar.f276774y.get(), ImmutableSet.copyOf((Collection) gn.e.a()), bVar.b());
            case 11:
                return new lpi.b(bq.i.i(aVar.f276741a), bq.i.j(aVar.f276741a));
            case 12:
                aVar.getClass();
                return new in.e(ImmutableSet.copyOf((Collection) pm.b.a()), (om.c) bVar.z.get(), bVar.b());
            case 13:
                return kpi.f.a();
            case 14:
                return new rpi.h(bq.i.b(aVar.f276741a));
            case 15:
                return new iri.g((iri.j) bVar.f276765m.get(), (iri.m) bVar.A.get(), bq.i.f(aVar.f276741a), bq.i.l(aVar.f276741a));
            case 16:
                return new iri.l((iri.m) bVar.A.get(), bq.i.f(aVar.f276741a), (iri.d) aVar.f276753s.get());
            case 17:
                return new iri.d(bq.i.f(aVar.f276741a));
            case 18:
                return new opi.b(bq.i.f(aVar.f276741a));
            case 19:
                aVar.getClass();
                return new xpi.c(xpi.f.f307976c, bq.i.b(aVar.f276741a));
            case 20:
                aVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize4 = ImmutableSet.builderWithExpectedSize(3);
                builderBuilderWithExpectedSize4.addAll((Iterable) g3l.f.a());
                u33.b bVar3 = aVar.f276742b;
                builderBuilderWithExpectedSize4.add(bVar3.C.get());
                return new g3l.c(j6.a.g(bVar3.f276773x, builderBuilderWithExpectedSize4), (g3l.g) bVar.v.get(), (k3l.b) aVar.f276755w.get(), bVar.b());
            case 21:
                return new k3l.d(bq.i.b(aVar.f276741a));
            case 22:
                aVar.getClass();
                xoi.d dVar = aVar.f276741a;
                return new ypi.e(ypi.h.d, bq.i.b(dVar), bq.i.o(dVar), bq.i.g(dVar));
            case 23:
                return new w((t33.d) bVar.D.get(), (t33.c) aVar.z.get(), (xpi.g) aVar.v.get(), (ypi.i) aVar.f276757y.get(), (tpi.j) aVar.f276745h.get(), (f9b.f) aVar.d.get(), bq.i.l(aVar.f276741a), (g3l.a) bVar.v.get(), (t33.f) bVar.E.get(), (kpi.c) aVar.f276750p.get());
            case 24:
                return new t33.l(bq.i.i(aVar.f276741a));
            default:
                throw new AssertionError(i);
        }
    }

    private final Object j() {
        u41.b bVar = (u41.b) this.f271087b;
        u41.a aVar = (u41.a) this.d;
        int i = this.f271088c;
        switch (i) {
            case 0:
                return bq.i.u(aVar.e());
            case 1:
                return bq.i.B(aVar.e());
            case 2:
                return bq.i.q(aVar.e());
            case 3:
                return hsi.b.v(aVar.e());
            case 4:
                return h7d.a.l(aVar.e());
            case 5:
                return bq.i.w(aVar.e());
            case 6:
                return hsi.b.A(aVar.e());
            case 7:
                return l9.c(aVar.f276963a, bVar.f276980a.b());
            case 8:
                j2 settingsTracker = bVar.f276981b.h();
                s.j(settingsTracker);
                m41.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(settingsTracker, "settingsTracker");
                return new mn.g(settingsTracker);
            case 9:
                ContainerActivity containerActivity = aVar.f276963a;
                j2 j2VarH = bVar.f276981b.h();
                s.j(j2VarH);
                return l9.g(containerActivity, j2VarH);
            case 10:
                return l9.b(aVar.e(), bVar.f276980a.b());
            case 11:
                Activity activityE = aVar.e();
                mli.e eVarB = ((j51.a) bVar.f276982c).b();
                s.j(eVarB);
                return l9.l(activityE, eVarB, (aqi.a) aVar.o.get(), new c5l.b());
            case 12:
                return new aqi.d(aVar.e(), new y80.b());
            case 13:
                e86.a aVar2 = bVar.d;
                asi.b bVar2 = bVar.f276982c;
                ao.h hVarA = aVar2.a();
                sri.m mVar = (sri.m) aVar.f276973q.get();
                asi.d dVarC = ((j51.a) bVar2).c();
                s.j(dVarC);
                mli.e eVarA = ((j51.a) bVar2).a();
                s.j(eVarA);
                uil.a aVarA = bVar.e.a();
                s.j(aVarA);
                com.revolut.retail.feature.api.userauth.navigation.a aVarA2 = bVar.f.a();
                s.j(aVarA2);
                return l9.d(hVarA, mVar, dVarC, eVarA, aVarA, aVarA2, (tpi.j) aVar.f276975s.get());
            case 14:
                return bq.i.c(aVar.e(), null);
            case 15:
                return new tpi.i((rpi.c) aVar.f276974r.get(), bq.i.m(aVar.e()));
            case 16:
                return new rpi.b(aVar.e());
            case 17:
                return xhi.f.o(aVar.e(), ((a0b.d) bVar.f276983g).b(), (sri.m) aVar.f276973q.get());
            case 18:
                ContainerActivity containerActivity2 = aVar.f276963a;
                l9.a(containerActivity2);
                asi.b bVar3 = bVar.f276982c;
                an0.c cVar = bVar.f276984h;
                asi.d dVarC2 = ((j51.a) bVar3).c();
                s.j(dVarC2);
                sri.m mVar2 = (sri.m) aVar.f276973q.get();
                om0.b bVarC = cVar.c();
                s.j(bVarC);
                p1b.b bVar4 = (p1b.b) bVar.i.f.get();
                s.j(bVar4);
                zm0.b bVarI = cVar.i();
                s.j(bVarI);
                return new xoi.l(containerActivity2, dVarC2, mVar2, bVarC, bVar4, bVarI);
            case 19:
                yri.a aVarA3 = bVar.i.a();
                s.j(aVarA3);
                return new xoi.c(aVarA3);
            case 20:
                Activity activityE2 = aVar.e();
                b80.c cVarP = bVar.f276985j.p();
                s.j(cVarP);
                return new mpi.d(activityE2, cVarP);
            case 21:
                ContainerActivity containerActivity3 = aVar.f276963a;
                l9.a(containerActivity3);
                ppi.d dVar = (ppi.d) bVar.k.e.get();
                s.j(dVar);
                return new ppi.c(containerActivity3, dVar);
            case 22:
                ContainerActivity containerActivity4 = aVar.f276963a;
                l9.a(containerActivity4);
                bq.i.h(containerActivity4);
                ContainerActivity containerActivity5 = aVar.f276963a;
                l9.a(containerActivity5);
                t70.g gVarO = bVar.f276985j.o();
                s.j(gVarO);
                return new npi.c(containerActivity4, containerActivity5, gVarO);
            case 23:
                ContainerActivity containerActivity6 = aVar.f276963a;
                l9.a(containerActivity6);
                return new opi.b(containerActivity6);
            case 24:
                om0.b bVarC2 = bVar.f276984h.c();
                s.j(bVarC2);
                return new lri.b(bVarC2);
            case 25:
                return new rpi.h(aVar.e());
            case 26:
                return new iri.j();
            case 27:
                nf0.a aVar3 = bVar.f276986l;
                asi.b bVar5 = bVar.f276982c;
                q1 q1Var = bVar.f276990q;
                qf0.c cVarA = aVar3.a();
                s.j(cVarA);
                sri.m mVarD = bVar.o.d();
                s.j(mVarD);
                oe.c cVarM = bq.i.m(aVar.e());
                pak.h hVarA2 = bVar.f276989p.a();
                fkl.h hVar = (fkl.h) ((q0) q1Var).G.get();
                s.j(hVar);
                sf0.h hVarB = bVar.f276986l.b();
                s.j(hVarB);
                yil.b bVar6 = ((q0) q1Var).f196063h.f248575j;
                oad.a aVar4 = (oad.a) bVar.f276991r;
                Optional optionalOf = Optional.of(new rad.a(e4m.b.a(aVar4.k), e4m.b.a(aVar4.f223583l)));
                s.j(optionalOf);
                mli.e eVarB2 = ((j51.a) bVar5).b();
                s.j(eVarB2);
                asi.d dVarC3 = ((j51.a) bVar5).c();
                s.j(dVarC3);
                zm0.c cVarJ = bVar.f276984h.j();
                s.j(cVarJ);
                return new com.revolut.feature.restricted_access.h(cVarA, mVarD, cVarM, hVarA2, hVar, hVarB, bVar6, optionalOf, eVarB2, dVarC3, cVarJ);
            case 28:
                qf0.c cVarA2 = bVar.f276986l.a();
                s.j(cVarA2);
                sri.m mVarD2 = bVar.o.d();
                s.j(mVarD2);
                return new com.revolut.feature.restricted_access.j(cVarA2, mVarD2);
            case 29:
                qf0.c cVarA3 = bVar.f276986l.a();
                s.j(cVarA3);
                sri.m mVarD3 = bVar.o.d();
                s.j(mVarD3);
                return new com.revolut.feature.restricted_access.c(cVarA3, mVarD3, wza.b.a());
            case 30:
                return new k3l.d(aVar.e());
            case 31:
                return hsi.b.B(aVar.e());
            case 32:
                return hsi.b.y(aVar.e());
            case 33:
                return bq.i.y(aVar.e());
            case 34:
                return h7d.a.n(aVar.e());
            case 35:
                return h7d.a.r(aVar.e());
            case 36:
                return h7d.a.g(aVar.e());
            case 37:
                ContainerActivity containerActivity7 = aVar.f276963a;
                l9.a(containerActivity7);
                bq.i.h(containerActivity7);
                return new lpi.b(containerActivity7, (yy0.f) aVar.e.get());
            case 38:
                return new gqi.b(aVar.e());
            case 39:
                f9b.g gVar = (f9b.g) bVar.f276992s.f141525g.get();
                s.j(gVar);
                return m0.q(gVar, aVar.f276963a, (kwl.b) aVar.Q.get(), (Set) aVar.R.get());
            case 40:
                return l9.h(aVar.f276964b, (kwl.a) aVar.P.get());
            case 41:
                w49.a aVar5 = (w49.a) aVar.O.get();
                wsg.n nVarB = bVar.f276994w.b();
                u41.b bVar7 = aVar.f276965c;
                sri.m mVarD4 = bVar7.o.d();
                s.j(mVarD4);
                com.revolut.feature.kyc.impl.e eVar = new com.revolut.feature.kyc.impl.e();
                v60.e eVarA2 = bVar7.f276988n.a();
                s.j(eVarA2);
                mt8.a aVarA4 = bVar7.f276995x.a();
                s.j(aVarA4);
                return new kwl.a(aVar5, nVarB, new KycNotPassedErrorHandler(mVarD4, eVar, eVarA2, aVarA4));
            case 42:
                ContainerActivity containerActivity8 = aVar.f276963a;
                l9.a(containerActivity8);
                jxj.a aVar6 = bVar.f;
                l70.e eVar2 = bVar.f276985j;
                w9k.a aVar7 = bVar.f276993t;
                com.revolut.retail.feature.api.userauth.navigation.a aVarA5 = aVar6.a();
                s.j(aVarA5);
                x9k.a aVarA6 = aVar7.a();
                s.j(aVarA6);
                aa5.a aVar8 = (aa5.a) aVar7.f295756n.get();
                s.j(aVar8);
                t70.g gVarO2 = eVar2.o();
                s.j(gVarO2);
                v60.e eVarA3 = bVar.f276988n.a();
                s.j(eVarA3);
                rqi.c cVarB = bVar.k.b();
                fwj.p pVarA = bVar.u.a();
                s.j(pVarA);
                qd0.b bVarN = eVar2.n();
                s.j(bVarN);
                pwl.d dVar2 = new pwl.d();
                gte.a aVarB = bVar.v.b();
                s.j(aVarB);
                return new cwl.g(containerActivity8, aVarA5, aVarA6, aVar8, gVarO2, eVarA3, cVarB, pVarA, bVarN, dVar2, aVarB);
            case 43:
                return l9.e(aVar.f276964b, (kwl.a) aVar.P.get());
            case 44:
                return new ewl.i((ypi.j) aVar.T.get(), (hqi.n) aVar.U.get());
            case 45:
                return new ypi.a();
            case 46:
                return new hqi.a();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object k() {
        u45.c cVar = (u45.c) this.d;
        u45.h hVar = cVar.f277070b;
        u45.h hVar2 = (u45.h) this.f271087b;
        j35.a aVar = hVar2.f277124a;
        int i = this.f271088c;
        if (i == 0) {
            Object extension = (f15.a) cVar.f277071c.get();
            f85.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(extension, "extension");
            n nVar = (n) extension;
            s.k(nVar);
            return nVar;
        }
        if (i == 1) {
            j15.e provider = hVar2.v.a();
            s.j(provider);
            f85.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(provider, "provider");
            return provider.a();
        }
        if (i == 2) {
            LoanRepaymentAccountModelExtension loanRepaymentAccountModelExtension = (LoanRepaymentAccountModelExtension) cVar.e.get();
            trl.f.n(loanRepaymentAccountModelExtension);
            return loanRepaymentAccountModelExtension;
        }
        if (i == 3) {
            l35.b bVar = (l35.b) hVar2.L.get();
            y45.i iVarI = aVar.i();
            s.j(iVarI);
            h6i.o oVarH = hVar2.z.h();
            l35.h hVarF = hVar.f277124a.f();
            s.j(hVarF);
            return new com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccountpicker.b(bVar, iVarI, oVarH, new c55.f0(hVarF));
        }
        if (i != 4) {
            throw new AssertionError(i);
        }
        AmountInputControllerContract$InputData amountInputControllerContract$InputData = cVar.f277069a;
        w80.b bVarJ = hVar.f277138q.j();
        s.j(bVarJ);
        gte.a aVarB = hVar.f277135m.b();
        s.j(aVarB);
        e85.r rVar = new e85.r(bVarJ, aVarB, new e85.s(), new e85.q());
        w80.b bVarJ2 = hVar2.f277138q.j();
        s.j(bVarJ2);
        y45.i iVarI2 = aVar.i();
        s.j(iVarI2);
        return new com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.amount.a(amountInputControllerContract$InputData, rVar, bVarJ2, iVarI2, (LoanRepaymentAccountModelExtension) cVar.e.get(), new y45.m(), (m35.p) hVar2.V.get(), (m35.f) hVar2.T.get(), (b55.b) hVar2.Y.get(), (f15.a) cVar.f277071c.get(), new e85.s(), new com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.amount.c());
    }

    private final Object l() {
        u45.h hVar = (u45.h) this.f271087b;
        u45.d dVar = (u45.d) this.d;
        int i = this.f271088c;
        switch (i) {
            case 0:
                return kxa.j.k((j60.a) dVar.d.get());
            case 1:
                return ehe.n.s((com.revolut.kompot.navigable.a) dVar.f277094b.get(), (rp0.m) dVar.f277095c.get());
            case 2:
                return new rp0.m();
            case 3:
                Object extension = (f15.a) dVar.f.get();
                d65.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                n nVar = (n) extension;
                s.k(nVar);
                return nVar;
            case 4:
                j15.e provider = hVar.v.a();
                s.j(provider);
                d65.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(provider, "provider");
                return provider.a();
            case 5:
                return new c65.t(dVar.f277093a, (cli.n) dVar.f277097h.get(), (j60.a) dVar.d.get(), (v) dVar.i.get(), (l35.b) hVar.L.get(), (f15.a) dVar.f.get(), (b55.b) hVar.Y.get(), hVar.f277133j.e());
            case 6:
                return new y();
            case 7:
                return new x();
            default:
                throw new AssertionError(i);
        }
    }

    @Override // phm.a
    public final Object get() {
        m60.b bVar;
        Object cVar;
        Object aVar;
        switch (this.f271086a) {
            case 0:
                i iVar = (i) this.d;
                d dVar = (d) this.f271087b;
                int i = this.f271088c;
                if (i == 0) {
                    ii5.a aVarD = dVar.e.d();
                    s.j(aVarD);
                    return w40.c.j(aVarD);
                }
                if (i != 1) {
                    throw new AssertionError(i);
                }
                fk3.a aVarA = dVar.f.a();
                s.j(aVarA);
                nw5.j jVarD = dVar.f271070g.d();
                s.j(jVarD);
                vg5.c cVar2 = new vg5.c(new yzl.a());
                mg5.a aVar2 = (mg5.a) dVar.f271077q.get();
                vh5.a aVar3 = (vh5.a) iVar.f271089a.get();
                wsg.b bVarA = dVar.i.a();
                wli.x xVarD = ((s41.a) dVar.f271072j).d();
                f80.a aVarX = dVar.k.x();
                s.j(aVarX);
                return new u(aVarA, jVarD, cVar2, aVar2, aVar3, bVarA, xVarD, aVarX, new yg5.n());
            case 1:
                k kVar = (k) this.d;
                d dVar2 = (d) this.f271087b;
                int i2 = this.f271088c;
                if (i2 == 0) {
                    ii5.a aVarD2 = dVar2.e.d();
                    s.j(aVarD2);
                    return w40.c.j(aVarD2);
                }
                if (i2 != 1) {
                    throw new AssertionError(i2);
                }
                fk3.a aVarA2 = dVar2.f.a();
                s.j(aVarA2);
                nw5.j jVarD2 = dVar2.f271070g.d();
                s.j(jVarD2);
                kf0.c cVar3 = kVar.f271093a.f271071h;
                vg5.c cVar4 = new vg5.c(new yzl.a());
                mg5.a aVar4 = (mg5.a) dVar2.f271077q.get();
                vh5.a aVar5 = (vh5.a) kVar.f271094b.get();
                wsg.b bVarA2 = dVar2.i.a();
                wli.x xVarD2 = ((s41.a) dVar2.f271072j).d();
                f80.a aVarX2 = dVar2.k.x();
                s.j(aVarX2);
                return new u(aVarA2, jVarD2, cVar4, aVar4, aVar5, bVarA2, xVarD2, aVarX2, new yg5.n());
            case 2:
                th7.b bVar2 = (th7.b) this.f271087b;
                th7.a aVar6 = (th7.a) this.d;
                int i3 = this.f271088c;
                switch (i3) {
                    case 0:
                        return kxa.j.k((j60.a) aVar6.f271305g.get());
                    case 1:
                        return ehe.n.s((com.revolut.kompot.navigable.a) aVar6.e.get(), (rp0.m) aVar6.f.get());
                    case 2:
                        return new rp0.m();
                    case 3:
                        return n57.a.t((o5d.c) aVar6.i.get());
                    case 4:
                        return n57.a.w(bVar2.f271317j.a(), aVar6.f271302a);
                    case 5:
                        return a10.b.f((u8h.b) bVar2.k, "factory");
                    case 6:
                        return n57.a.v((o5d.c) aVar6.i.get());
                    case 7:
                        return n57.a.g((o5d.c) aVar6.i.get());
                    case 8:
                        e4m.e eVar = aVar6.f271305g;
                        th7.b bVar3 = aVar6.d;
                        j60.a aVar7 = (j60.a) eVar.get();
                        z0h.d dVarC = ((u8h.b) bVar3.k).c();
                        s.j(dVarC);
                        hi7.b bVar4 = new hi7.b(dVarC);
                        ii7.b bVar5 = new ii7.b();
                        ybl.i iVarB = bVar3.f271315g.b();
                        s.j(iVarB);
                        tzg.m mVarT = bVar3.d.t();
                        s.j(mVarT);
                        ii7.d dVar3 = new ii7.d(mVarT, iVarB);
                        fi7.l lVar = aVar6.f271304c;
                        twg.c cVarB = bVar2.b();
                        ybl.l lVarF = bVar2.d.f();
                        g9h.c cVar5 = new g9h.c();
                        o5d.a aVar8 = (o5d.a) aVar6.f271310n.get();
                        fi7.t tVar = new fi7.t();
                        h9h.a aVar9 = bVar3.d;
                        return new com.revolut.feature.instruments.trend.collections.impl.ui.collection.a(aVar7, bVar4, bVar5, dVar3, lVar, cVarB, lVarF, cVar5, aVar8, tVar, new bof.r(new ji7.b(new oi7.a(new adh.a(), aVar9.C()), new mi7.a(aVar9.C()), bVar3.c(), new pi7.a(aVar9.C()), new ni7.a(aVar9.C()), aVar9.C()), new z((z0h.q1) aVar6.o.get()), new ii7.b(), new ki7.b(), new t5d.d()));
                    case 9:
                        return n57.a.u((o5d.c) aVar6.i.get());
                    case 10:
                        return a10.b.g((u8h.b) bVar2.k, "factory");
                    default:
                        throw new AssertionError(i3);
                }
            case 3:
                he9.g gVar = (he9.g) this.d;
                tl9.c cVar6 = (tl9.c) this.f271087b;
                he9.e eVar2 = cVar6.f272029h;
                int i5 = this.f271088c;
                if (i5 != 0) {
                    if (i5 == 1) {
                        return new de9.y(new de9.z());
                    }
                    if (i5 == 2) {
                        return new he9.c(this, 6);
                    }
                    throw new AssertionError(i5);
                }
                PasscodeScreenContract$InputData passcodeScreenContract$InputData = gVar.f151618b;
                oe9.a aVarB = eVar2.b();
                s.j(aVarB);
                fe9.h hVar = new fe9.h(((tl9.c) gVar.f).d.a());
                ie9.d dVarA = eVar2.a();
                s.j(dVarA);
                wl0.c cVarA = cVar6.d.a();
                io.c cVarD = cVar6.i.d();
                s.j(cVarD);
                am9.c.Companion.getClass();
                return new de9.x(passcodeScreenContract$InputData, aVarB, hVar, dVarA, cVarA, cVarD, new am9.a(), (jki.p) gVar.d.get());
            case 4:
                tl9.f fVar = (tl9.f) this.d;
                int i6 = this.f271088c;
                if (i6 == 0) {
                    gte.a aVarB2 = fVar.f272038a.e.b();
                    s.j(aVarB2);
                    return new com.revolut.feature.pay_with_smile.impl.ui.settings.a(new cm9.o(aVarB2), (ql9.d) ((tl9.c) this.f271087b).f272033n.get(), (l0) fVar.f272040c.get());
                }
                if (i6 != 1) {
                    throw new AssertionError(i6);
                }
                com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) fVar.f272039b.get();
                dm9.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller, "controller");
                return new l0(controller.m2());
            case 5:
                int i21 = this.f271088c;
                if (i21 != 0) {
                    if (i21 == 1) {
                        return new vq.h();
                    }
                    throw new AssertionError(i21);
                }
                hwl.c cVar7 = (hwl.c) ((tq.a) this.f271087b).f273439a.f156292b.get();
                s.j(cVar7);
                return new vq.g(cVar7, (cli.n) ((tq.b) this.d).f273442a.get());
            case 6:
                tq1.d dVar4 = (tq1.d) this.f271087b;
                tq1.e eVar3 = (tq1.e) this.d;
                int i22 = this.f271088c;
                if (i22 != 0) {
                    if (i22 == 1) {
                        return new yq1.j();
                    }
                    throw new AssertionError(i22);
                }
                jki.p pVar = (jki.p) eVar3.f273488b.get();
                PagoPABillConfirmationScreenContract$InputData pagoPABillConfirmationScreenContract$InputData = eVar3.f273487a;
                uq1.a aVar10 = (uq1.a) dVar4.f273484a.e.get();
                s.j(aVar10);
                return new yq1.i(pVar, pagoPABillConfirmationScreenContract$InputData, aVar10, dVar4.f273486c.b());
            case 7:
                tq1.f fVar2 = (tq1.f) this.d;
                int i32 = this.f271088c;
                if (i32 == 0) {
                    return kxa.j.l((j60.a) fVar2.f273492c.get());
                }
                if (i32 == 1) {
                    return h30.l.p((com.revolut.kompot.navigable.a) fVar2.f273490a.get(), (rp0.m) fVar2.f273491b.get());
                }
                if (i32 == 2) {
                    return new rp0.m();
                }
                if (i32 == 3) {
                    jki.p pVar2 = (jki.p) fVar2.e.get();
                    uq1.a aVar11 = (uq1.a) ((tq1.d) this.f271087b).f273484a.e.get();
                    s.j(aVar11);
                    return new wq1.q(pVar2, aVar11, (j60.a) fVar2.f273492c.get(), (xq1.a) fVar2.f.get());
                }
                if (i32 == 4) {
                    return new wq1.r();
                }
                if (i32 == 5) {
                    return new xq1.b();
                }
                throw new AssertionError(i32);
            case 8:
                tr2.m mVar = (tr2.m) this.f271087b;
                tr2.j jVar = (tr2.j) this.d;
                int i33 = this.f271088c;
                switch (i33) {
                    case 0:
                        return kxa.j.l((j60.a) jVar.f.get());
                    case 1:
                        return h30.l.p((com.revolut.kompot.navigable.a) jVar.d.get(), (rp0.m) jVar.e.get());
                    case 2:
                        return new rp0.m();
                    case 3:
                        jki.p pVar3 = (jki.p) jVar.f273644h.get();
                        BlockMerchantScreenContract$InputData blockMerchantScreenContract$InputData = jVar.f273640a;
                        com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) mVar.f273660l).c();
                        s.j(aVarC);
                        ur2.c cVar8 = (ur2.c) mVar.D.get();
                        t tVarF = mVar.f273661m.f();
                        s.j(tVarF);
                        sf0.h hVarB = mVar.f273662n.b();
                        s.j(hVarB);
                        j60.a aVar12 = (j60.a) jVar.f.get();
                        tr2.m mVar2 = jVar.f273642c;
                        xua.a aVarA3 = mVar2.f273657g.a();
                        s.j(aVarA3);
                        ppg.b bVarB = ((wpg.l) mVar2.o).b();
                        s.j(bVarB);
                        a9e.h hVar2 = (a9e.h) jVar.f273645j.get();
                        hj8.a aVarA4 = mVar2.f273664q.a();
                        s.j(aVarA4);
                        nhf.a aVarA5 = mVar2.f273665r.a();
                        s.j(aVarA5);
                        return new zr2.n(pVar3, blockMerchantScreenContract$InputData, aVarC, cVar8, tVarF, hVarB, aVar12, new oce.e(aVarA3, bVarB, hVar2, aVarA4, aVarA5));
                    case 4:
                        thf.g gVarE = mVar.i.e();
                        s.j(gVarE);
                        return new zr2.q(gVarE);
                    case 5:
                        mae.p factory = mVar.f273663p.e();
                        s.j(factory);
                        f01.a uikitResources = (f01.a) jVar.i.get();
                        t70.b currenciesLocalization = mVar.f.g();
                        s.j(currenciesLocalization);
                        as2.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory, "factory");
                        Intrinsics.checkNotNullParameter(uikitResources, "uikitResources");
                        Intrinsics.checkNotNullParameter(currenciesLocalization, "currenciesLocalization");
                        return factory.d(uikitResources, currenciesLocalization);
                    case 6:
                        BaseScreen screen = jVar.f273641b;
                        as2.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(screen, "screen");
                        return new f01.c(screen.m2());
                    default:
                        throw new AssertionError(i33);
                }
            case 9:
                tr2.m mVar3 = (tr2.m) this.f271087b;
                tr2.k kVar2 = (tr2.k) this.d;
                BlockedMerchantDetailsScreenContract$InputData blockedMerchantDetailsScreenContract$InputData = kVar2.f273646a;
                int i43 = this.f271088c;
                switch (i43) {
                    case 0:
                        return kxa.j.l((j60.a) kVar2.f.get());
                    case 1:
                        return h30.l.p((com.revolut.kompot.navigable.a) kVar2.d.get(), (rp0.m) kVar2.e.get());
                    case 2:
                        return new rp0.m();
                    case 3:
                        jki.p pVar4 = (jki.p) kVar2.f273650h.get();
                        com.revolut.domain.interactors.transactions.a aVarC2 = ((bjf.a) mVar3.f273660l).c();
                        s.j(aVarC2);
                        j60.a aVar13 = (j60.a) kVar2.f.get();
                        ur2.c cVar9 = (ur2.c) mVar3.D.get();
                        nr2.a aVar14 = (nr2.a) mVar3.J.get();
                        tr2.m mVar4 = kVar2.f273648c;
                        xua.a aVarA6 = mVar4.f273657g.a();
                        s.j(aVarA6);
                        ppg.b bVarB2 = ((wpg.l) mVar4.o).b();
                        s.j(bVarB2);
                        a9e.h hVar3 = (a9e.h) kVar2.f273651j.get();
                        nhf.a aVarA7 = mVar4.f273665r.a();
                        s.j(aVarA7);
                        return new ds2.i(pVar4, blockedMerchantDetailsScreenContract$InputData, aVarC2, aVar13, cVar9, aVar14, new oce.h(aVarA6, bVarB2, hVar3, aVarA7));
                    case 4:
                        thf.g gVarE2 = mVar3.i.e();
                        s.j(gVarE2);
                        nr2.d dVar5 = (nr2.d) mVar3.f273666s.f273705a.get();
                        s.j(dVar5);
                        return new ds2.k(blockedMerchantDetailsScreenContract$InputData, gVarE2, dVar5);
                    case 5:
                        mae.p factory2 = mVar3.f273663p.e();
                        s.j(factory2);
                        f01.a uikitResources2 = (f01.a) kVar2.i.get();
                        t70.b currenciesLocalization2 = mVar3.f.g();
                        s.j(currenciesLocalization2);
                        es2.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory2, "factory");
                        Intrinsics.checkNotNullParameter(uikitResources2, "uikitResources");
                        Intrinsics.checkNotNullParameter(currenciesLocalization2, "currenciesLocalization");
                        return factory2.d(uikitResources2, currenciesLocalization2);
                    case 6:
                        BaseScreen screen2 = kVar2.f273647b;
                        es2.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(screen2, "screen");
                        return new f01.c(screen2.m2());
                    default:
                        throw new AssertionError(i43);
                }
            case 10:
                tr2.o oVar = (tr2.o) this.d;
                BlockedPaymentsListScreenContract$Input blockedPaymentsListScreenContract$Input = oVar.f273674a;
                tr2.m mVar5 = (tr2.m) this.f271087b;
                ila.b bVar6 = mVar5.f273658h;
                x9e.a aVar15 = mVar5.f273663p;
                int i59 = this.f271088c;
                switch (i59) {
                    case 0:
                        return kxa.j.l((j60.a) oVar.e.get());
                    case 1:
                        return h30.l.p((com.revolut.kompot.navigable.a) oVar.f273676c.get(), (rp0.m) oVar.d.get());
                    case 2:
                        return new rp0.m();
                    case 3:
                        jki.p pVar5 = (jki.p) oVar.i.get();
                        ur2.c cVar10 = (ur2.c) mVar5.D.get();
                        g9e.a aVarC3 = aVar15.c();
                        s.j(aVarC3);
                        t tVarF2 = mVar5.f273661m.f();
                        s.j(tVarF2);
                        j60.a aVar16 = (j60.a) oVar.e.get();
                        gs2.a aVar17 = new gs2.a();
                        com.revolut.domain.interactors.transactions.a aVarC4 = ((bjf.a) mVar5.f273660l).c();
                        s.j(aVarC4);
                        nr2.a aVar18 = (nr2.a) mVar5.J.get();
                        jla.h hVarA = bVar6.a();
                        gte.a aVarB3 = mVar5.f273659j.b();
                        s.j(aVarB3);
                        v67.b bVarA3 = mVar5.v.a();
                        s.j(bVarA3);
                        nhf.a aVarA8 = mVar5.f273665r.a();
                        s.j(aVarA8);
                        return new gs2.r(pVar5, blockedPaymentsListScreenContract$Input, cVar10, aVarC3, tVarF2, aVar16, aVar17, aVarC4, aVar18, hVarA, aVarB3, bVarA3, aVarA8);
                    case 4:
                        thf.d dVarD = mVar5.i.d();
                        s.j(dVarD);
                        a9e.h hVar4 = (a9e.h) oVar.f273678h.get();
                        jla.h hVarA2 = bVar6.a();
                        uw1.c cVarD2 = ((lz1.m) mVar5.u).d();
                        s.j(cVarD2);
                        return new a0(blockedPaymentsListScreenContract$Input, dVarD, hVar4, hVarA2, cVarD2);
                    case 5:
                        mae.p factory3 = aVar15.e();
                        s.j(factory3);
                        f01.a uikitResources3 = (f01.a) oVar.f273677g.get();
                        t70.b currenciesLocalization3 = mVar5.f.g();
                        s.j(currenciesLocalization3);
                        hs2.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory3, "factory");
                        Intrinsics.checkNotNullParameter(uikitResources3, "uikitResources");
                        Intrinsics.checkNotNullParameter(currenciesLocalization3, "currenciesLocalization");
                        return factory3.d(uikitResources3, currenciesLocalization3);
                    case 6:
                        BaseScreen screen3 = oVar.f273675b;
                        hs2.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(screen3, "screen");
                        return new f01.c(screen3.m2());
                    default:
                        throw new AssertionError(i59);
                }
            case 11:
                tr2.m mVar6 = (tr2.m) this.f271087b;
                ite.a aVar19 = mVar6.f273659j;
                djf.c cVar11 = mVar6.i;
                tr2.q qVar = (tr2.q) this.d;
                SelectPaymentToBlockScreenContract$InputData selectPaymentToBlockScreenContract$InputData = qVar.f273683a;
                tr2.m mVar7 = qVar.f273685c;
                int i66 = this.f271088c;
                switch (i66) {
                    case 0:
                        return kxa.j.l((j60.a) qVar.f.get());
                    case 1:
                        return h30.l.p((com.revolut.kompot.navigable.a) qVar.d.get(), (rp0.m) qVar.e.get());
                    case 2:
                        return new rp0.m();
                    case 3:
                        jki.p pVar6 = (jki.p) qVar.f273687h.get();
                        whf.b bVarA4 = cVar11.a();
                        s.j(bVarA4);
                        thf.m mVarG = mVar7.i.g();
                        s.j(mVarG);
                        is2.x xVar = new is2.x(mVarG);
                        ur2.c cVar12 = (ur2.c) mVar6.D.get();
                        xua.a aVarA9 = mVar6.f273657g.a();
                        s.j(aVarA9);
                        t tVarF3 = mVar6.f273661m.f();
                        s.j(tVarF3);
                        j60.a aVar20 = (j60.a) qVar.f.get();
                        xua.a aVarA10 = mVar7.f273657g.a();
                        s.j(aVarA10);
                        ppg.b bVarB3 = ((wpg.l) mVar7.o).b();
                        s.j(bVarB3);
                        a9e.h hVar5 = (a9e.h) qVar.f273688j.get();
                        hj8.a aVarA11 = mVar7.f273664q.a();
                        s.j(aVarA11);
                        nhf.a aVarA12 = mVar7.f273665r.a();
                        s.j(aVarA12);
                        oce.e eVar4 = new oce.e(aVarA10, bVarB3, hVar5, aVarA11, aVarA12);
                        xua.a aVarA13 = mVar7.f273657g.a();
                        s.j(aVarA13);
                        ppg.b bVarB4 = ((wpg.l) mVar7.o).b();
                        s.j(bVarB4);
                        a9e.h hVar6 = (a9e.h) qVar.f273688j.get();
                        f01.a aVar21 = (f01.a) qVar.i.get();
                        t70.b bVarG = mVar7.f.g();
                        s.j(bVarG);
                        hj8.a aVarA14 = mVar7.f273664q.a();
                        s.j(aVarA14);
                        wsg.n nVarB = mVar7.f273667t.b();
                        nhf.a aVarA15 = mVar7.f273665r.a();
                        s.j(aVarA15);
                        qce.d dVar6 = new qce.d(aVarA13, bVarB4, hVar6, aVar21, bVarG, aVarA14, nVarB, aVarA15);
                        vr2.d dVar7 = (vr2.d) mVar6.F.get();
                        gte.a aVarB4 = aVar19.b();
                        s.j(aVarB4);
                        return new com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment.b(pVar6, bVarA4, xVar, cVar12, aVarA9, tVarF3, selectPaymentToBlockScreenContract$InputData, aVar20, eVar4, dVar6, dVar7, aVarB4);
                    case 4:
                        whf.n nVarB2 = cVar11.b();
                        s.j(nVarB2);
                        gte.a aVarB5 = aVar19.b();
                        s.j(aVarB5);
                        return new com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment.c(nVarB2, selectPaymentToBlockScreenContract$InputData, aVarB5);
                    case 5:
                        mae.p factory4 = mVar6.f273663p.e();
                        s.j(factory4);
                        f01.a uikitResources4 = (f01.a) qVar.i.get();
                        t70.b currenciesLocalization4 = mVar6.f.g();
                        s.j(currenciesLocalization4);
                        js2.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory4, "factory");
                        Intrinsics.checkNotNullParameter(uikitResources4, "uikitResources");
                        Intrinsics.checkNotNullParameter(currenciesLocalization4, "currenciesLocalization");
                        return factory4.d(uikitResources4, currenciesLocalization4);
                    case 6:
                        BaseScreen screen4 = qVar.f273684b;
                        js2.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(screen4, "screen");
                        return new f01.c(screen4.m2());
                    default:
                        throw new AssertionError(i66);
                }
            case 12:
                tyh.c cVar13 = (tyh.c) this.d;
                tyh.b bVar7 = (tyh.b) this.f271087b;
                l70.e eVar5 = bVar7.e;
                nj0.a aVar22 = bVar7.f;
                int i74 = this.f271088c;
                if (i74 == 0) {
                    wj0.a idempotencyKeyHolder = ((nj0.d) aVar22).i();
                    s.j(idempotencyKeyHolder);
                    l80.e dateProvider = eVar5.h();
                    s.j(dateProvider);
                    ezh.a.Companion.getClass();
                    Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
                    Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
                    bVar = new m60.b(idempotencyKeyHolder, dateProvider, "payments_recurring_transfer");
                } else {
                    if (i74 != 1) {
                        if (i74 != 2) {
                            if (i74 != 3) {
                                throw new AssertionError(i74);
                            }
                            com.revolut.kompot.navigable.a controller2 = (com.revolut.kompot.navigable.a) cVar13.f.get();
                            ezh.a.Companion.getClass();
                            Intrinsics.checkNotNullParameter(controller2, "controller");
                            return x0.a(g1.Companion, controller2.C2().D2());
                        }
                        CryptoExchangeFlowInputData cryptoExchangeFlowInputData = cVar13.f275603a;
                        wj0.a aVarI = ((nj0.d) aVar22).i();
                        s.j(aVarI);
                        iva.a aVarA16 = bVar7.f275589g.a();
                        s.j(aVarA16);
                        return new com.revolut.feature_crypto_order_flow.impl.flow.a(cryptoExchangeFlowInputData, aVarI, aVarA16, bVar7.f275590h.b(), (g1) cVar13.f275606g.get(), bVar7.i.b());
                    }
                    wj0.a idempotencyKeyHolder2 = ((nj0.d) aVar22).i();
                    s.j(idempotencyKeyHolder2);
                    l80.e dateProvider2 = eVar5.h();
                    s.j(dateProvider2);
                    ezh.a.Companion.getClass();
                    Intrinsics.checkNotNullParameter(idempotencyKeyHolder2, "idempotencyKeyHolder");
                    Intrinsics.checkNotNullParameter(dateProvider2, "dateProvider");
                    bVar = new m60.b(idempotencyKeyHolder2, dateProvider2, "MOVE_MONEY_IDEMPOTENCY_TAG");
                }
                return bVar;
            case 13:
                tyh.b bVar8 = (tyh.b) this.f271087b;
                tyh.d dVar8 = (tyh.d) this.d;
                int i92 = this.f271088c;
                switch (i92) {
                    case 0:
                        jyh.a extensions = (jyh.a) dVar8.e.get();
                        Intrinsics.checkNotNullParameter(extensions, "extensions");
                        return extensions.f179443a;
                    case 1:
                        bVar8.getClass();
                        return m0.s(new smd.s(new zyh.d(new l4i.a()), new azh.a()), (kyh.c) dVar8.d.get());
                    case 2:
                        ViewController view = dVar8.f275608a;
                        wyh.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(view, "view");
                        return (CryptoExchangeScreen) view;
                    case 3:
                        KeyboardSuggestionsControllerExtension keyboardSuggestionsControllerExtension = (KeyboardSuggestionsControllerExtension) dVar8.f275612h.get();
                        pl1.d.n(keyboardSuggestionsControllerExtension);
                        return keyboardSuggestionsControllerExtension;
                    case 4:
                        return pl1.d.u((com.revolut.kompot.navigable.a) dVar8.f275611g.get());
                    case 5:
                        n60.a aVar23 = (n60.a) dVar8.f275613j.get();
                        o5k.i.l(aVar23);
                        return aVar23;
                    case 6:
                        return o5k.i.q((com.revolut.kompot.navigable.a) dVar8.f275611g.get());
                    case 7:
                        return new vzh.d((xyh.g) dVar8.d.get(), (xyh.c) dVar8.o.get());
                    case 8:
                        CryptoExchangeScreenContract$InputData cryptoExchangeScreenContract$InputData = dVar8.f275609b;
                        xyh.a aVar24 = (xyh.a) dVar8.f275616n.get();
                        jva.a aVar25 = (jva.a) bVar8.f275589g.i.get();
                        s.j(aVar25);
                        czh.l lVar2 = (czh.l) bVar8.P.get();
                        mk0.a aVarA17 = bVar8.d.f284866p.a();
                        s.j(aVarA17);
                        return new xyh.t(cryptoExchangeScreenContract$InputData, aVar24, aVar25, lVar2, new x0i.l(aVarA17));
                    case 9:
                        tyh.b bVar9 = dVar8.f275610c;
                        tyh.b bVar10 = dVar8.f275610c;
                        com.revolut.feature_crypto_order_flow.impl.exchange.mappers.a aVar26 = new com.revolut.feature_crypto_order_flow.impl.exchange.mappers.a(bVar9.d.c(), bVar9.c());
                        bzh.j jVar2 = new bzh.j();
                        q2i.d dVar9 = new q2i.d();
                        l4i.a converter = new l4i.a();
                        fzh.a revPointsAmountFormatter = bVar9.c();
                        Intrinsics.checkNotNullParameter(converter, "converter");
                        Intrinsics.checkNotNullParameter(revPointsAmountFormatter, "revPointsAmountFormatter");
                        uyh.x0 x0Var = new uyh.x0(aVar26, jVar2, dVar9, new bzh.h());
                        CryptoExchangeScreenContract$InputData cryptoExchangeScreenContract$InputData2 = dVar8.f275609b;
                        jk3.c cVar14 = bVar8.f275591j;
                        v0i.b bVar11 = bVar8.d;
                        fk3.a aVarA18 = cVar14.a();
                        s.j(aVarA18);
                        wsg.n nVarB3 = bVar8.f275590h.b();
                        czh.k kVar3 = new czh.k(new zjh.f(bVar10.a()), bVar10.f275590h.b(), dVar8.b());
                        gte.a aVarB6 = bVar10.f275592l.b();
                        s.j(aVarB6);
                        a1 a1Var = new a1(aVarB6, bVar10.c());
                        o7.b bVarA5 = bVar8.f275594n.a();
                        l4i.a aVar27 = new l4i.a();
                        fzh.a aVarC5 = bVar8.c();
                        gte.a aVarB7 = bVar8.f275592l.b();
                        s.j(aVarB7);
                        l2j.a aVar28 = new l2j.a();
                        jx0.a aVar29 = new jx0.a(((n51.a) bVar11.f284862j).b(), bVar11.k.a());
                        b1i.a aVar30 = (b1i.a) bVar11.v.get();
                        s.j(aVar30);
                        gzh.a aVar31 = new gzh.a();
                        czh.b bVarB5 = dVar8.b();
                        o7.b bVar12 = new o7.b(bVar10.o.d());
                        oh5.e eVarA = bVar8.f275595p.a();
                        mk0.a aVarA19 = bVar11.f284866p.a();
                        s.j(aVarA19);
                        x0i.l lVar3 = new x0i.l(aVarA19);
                        zrc.d dVarA2 = bVar8.i.a();
                        eub.a aVarA20 = bVar8.f275593m.a();
                        s.j(aVarA20);
                        czh.k kVar4 = new czh.k(new zjh.f(bVar10.a()), bVar10.f275590h.b(), dVar8.b());
                        gte.a aVarB8 = bVar10.f275592l.b();
                        s.j(aVarB8);
                        return new com.revolut.feature_crypto_order_flow.impl.exchange.d(x0Var, cryptoExchangeScreenContract$InputData2, aVarA18, nVarB3, kVar3, a1Var, bVarA5, aVar27, aVarC5, aVarB7, aVar28, aVar29, aVar30, aVar31, bVarB5, bVar12, eVarA, lVar3, dVarA2, aVarA20, new b1(kVar4, new a1(aVarB8, bVar10.c())), (ae5.a) dVar8.f275615m.get());
                    case 10:
                        ce5.b bVar13 = bVar8.f275596q;
                        be5.b factory5 = new be5.b();
                        ldd.b focusRequesterDelegate = (ldd.b) dVar8.f275614l.get();
                        n60.a keyboardExtension = (n60.a) dVar8.f275613j.get();
                        wyh.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory5, "factory");
                        Intrinsics.checkNotNullParameter(focusRequesterDelegate, "focusRequesterDelegate");
                        Intrinsics.checkNotNullParameter(keyboardExtension, "keyboardExtension");
                        Intrinsics.checkNotNullParameter(focusRequesterDelegate, "focusRequesterDelegate");
                        Intrinsics.checkNotNullParameter(keyboardExtension, "keyboardExtension");
                        return new be5.a();
                    case 11:
                        kdd.b bVar14 = bVar8.f275597r;
                        ldd.a factory6 = new ldd.a();
                        wyh.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory6, "factory");
                        return new ldd.b();
                    case 12:
                        jyh.a extensions2 = (jyh.a) dVar8.e.get();
                        Intrinsics.checkNotNullParameter(extensions2, "extensions");
                        return extensions2.f179444b;
                    default:
                        throw new AssertionError(i92);
                }
            case 14:
                tyh.f fVar3 = (tyh.f) this.d;
                int i96 = this.f271088c;
                if (i96 != 0) {
                    if (i96 == 1) {
                        return new wzh.f();
                    }
                    throw new AssertionError(i96);
                }
                cli.n nVar = (cli.n) fVar3.f275622b.get();
                OrderPriceScreenContract$InputData orderPriceScreenContract$InputData = fVar3.f275621a;
                mre.c cVarB2 = ((tyh.b) this.f271087b).M.b();
                s.j(cVarB2);
                return new wzh.e(nVar, orderPriceScreenContract$InputData, cVarB2);
            case 15:
                return a();
            case 16:
                tyk.b bVar15 = (tyk.b) this.f271087b;
                tyk.a aVar32 = (tyk.a) this.d;
                int i99 = this.f271088c;
                switch (i99) {
                    case 0:
                        return kpi.f.a();
                    case 1:
                        Context contextI = bq.i.i(aVar32.f275684a);
                        BaseDelegatesActivity baseDelegatesActivityF = bq.i.f(aVar32.f275684a);
                        t70.g gVarO = bVar15.f275702b.o();
                        s.j(gVarO);
                        return new npi.c(contextI, baseDelegatesActivityF, gVarO);
                    case 2:
                        return new tpi.i((rpi.c) aVar32.f.get(), gsi.c.a(aVar32.f275684a));
                    case 3:
                        return new rpi.b(bq.i.b(aVar32.f275684a));
                    case 4:
                        return new rpi.h(bq.i.b(aVar32.f275684a));
                    case 5:
                        iri.j jVar3 = (iri.j) bVar15.f275707l.get();
                        e4m.e eVar6 = aVar32.i;
                        xoi.d dVar10 = aVar32.f275684a;
                        return new iri.g(jVar3, (iri.m) eVar6.get(), bq.i.f(dVar10), bq.i.l(dVar10));
                    case 6:
                        return new iri.b();
                    case 7:
                        return new iri.l((iri.m) aVar32.i.get(), bq.i.f(aVar32.f275684a), (iri.d) aVar32.k.get());
                    case 8:
                        return new iri.d(bq.i.f(aVar32.f275684a));
                    case 9:
                        return new opi.b(bq.i.f(aVar32.f275684a));
                    case 10:
                        return new en.c(ImmutableSet.of((ln.d) aVar32.f275686c.f275708m.get()), bq.i.l(aVar32.f275684a));
                    case 11:
                        aVar32.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(2);
                        builderBuilderWithExpectedSize.addAll((Iterable) g3l.f.a());
                        cVar = new g3l.c(j6.a.g(aVar32.f275686c.o, builderBuilderWithExpectedSize), (g3l.g) bVar15.f275709n.get(), (k3l.b) aVar32.o.get(), bVar15.b());
                        break;
                    case 12:
                        return new k3l.d(bq.i.b(aVar32.f275684a));
                    case 13:
                        aVar32.getClass();
                        return new cn.d(ImmutableSet.copyOf((Collection) dn.b.a()), (cn.e) bVar15.f275711q.get(), bVar15.b());
                    case 14:
                        um.c cVar15 = (um.c) bVar15.f275710p.get();
                        aVar32.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize2 = ImmutableSet.builderWithExpectedSize(6);
                        tyk.b bVar16 = aVar32.f275686c;
                        hn.h hVar7 = (hn.h) bVar16.f275712r.get();
                        t70.g gVarO2 = bVar16.f275702b.o();
                        s.j(gVarO2);
                        builderBuilderWithExpectedSize2.add(new jn.a(hVar7, gVarO2));
                        builderBuilderWithExpectedSize2.add(new vm.b(com.google.android.gms.internal.mlkit_vision_face.a.f()));
                        builderBuilderWithExpectedSize2.add(bVar16.d());
                        builderBuilderWithExpectedSize2.add(bVar16.o.get());
                        builderBuilderWithExpectedSize2.addAll((Iterable) in.g.a());
                        builderBuilderWithExpectedSize2.add(new jn.d(e4m.b.a(aVar32.f275695r)));
                        return new in.e(cVar15, builderBuilderWithExpectedSize2.build(), bVar15.b());
                    case 15:
                        return bq.i.t(aVar32.f275684a);
                    case 16:
                        aVar32.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize3 = ImmutableSet.builderWithExpectedSize(3);
                        builderBuilderWithExpectedSize3.addAll((Iterable) kn.g.a());
                        builderBuilderWithExpectedSize3.add(aVar32.f275697t.get());
                        builderBuilderWithExpectedSize3.add(new kn.h(e4m.b.a(aVar32.f275687g)));
                        return new kn.e(builderBuilderWithExpectedSize3.build(), (ym.d) bVar15.f275713s.get(), bVar15.b());
                    case 17:
                        return new zm.a();
                    case 18:
                        aVar32.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize4 = ImmutableSet.builderWithExpectedSize(2);
                        builderBuilderWithExpectedSize4.addAll((Iterable) hn.g.a());
                        builderBuilderWithExpectedSize4.add(aVar32.f275686c.d());
                        cVar = new hn.d(builderBuilderWithExpectedSize4.build(), (hn.h) bVar15.f275712r.get(), (npi.f) aVar32.e.get());
                        break;
                    case 19:
                        return new gn.c((lpi.e) aVar32.f275698w.get(), (sm.e) bVar15.f275715w.get(), ImmutableSet.copyOf((Collection) gn.e.a()), bVar15.b());
                    case 20:
                        return new lpi.b(bq.i.i(aVar32.f275684a), bq.i.j(aVar32.f275684a));
                    case 21:
                        aVar32.getClass();
                        return new in.e(ImmutableSet.copyOf((Collection) pm.b.a()), (om.c) bVar15.f275716x.get(), bVar15.b());
                    default:
                        throw new AssertionError(i99);
                }
                return cVar;
            case 17:
                tz2.f fVar4 = (tz2.f) this.d;
                int i100 = this.f271088c;
                if (i100 == 0) {
                    aVar = new com.revolut.feature.card_management.impl.ui.kompot.replace.expectations.a((cli.n) fVar4.f275774c.get(), fVar4.f275772a, ((tz2.e) this.f271087b).o.e());
                } else {
                    if (i100 != 1) {
                        if (i100 == 2) {
                            return new c03.r();
                        }
                        throw new AssertionError(i100);
                    }
                    aVar = new i3g.k((c03.q) fVar4.f275773b.get());
                }
                return aVar;
            case 18:
                return b();
            case 19:
                return c();
            case 20:
                return d();
            case 21:
                return e();
            case 22:
                return f();
            case 23:
                return g();
            case 24:
                return h();
            case 25:
                return i();
            case 26:
                return j();
            case 27:
                return k();
            case 28:
                return l();
            default:
                u45.h hVar8 = (u45.h) this.f271087b;
                int i101 = this.f271088c;
                if (i101 != 0) {
                    if (i101 == 1) {
                        return new ny4.l();
                    }
                    throw new AssertionError(i101);
                }
                ang.f fVarE = hVar8.f277133j.e();
                wli.x xVarD3 = ((s41.a) hVar8.f277139r).d();
                d2 d2Var = (d2) this.d;
                return new ny4.k(fVarE, xVarD3, d2Var.f118549b, (jki.p) d2Var.f118550c.get());
        }
    }
}
