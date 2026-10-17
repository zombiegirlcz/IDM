package oi9;

import android.app.Activity;
import com.revolut.core.ui_kit.views.reactionskeyboard.ReactionsKeyboardView;
import com.revolut.feature.card.terminate.impl.ui.flow.screen.CardTerminateScreenContract$InputData;
import com.revolut.feature.junior_transfer.impl.ui.flow.transfer.JuniorTransferFlowContract$InputData;
import com.revolut.feature.junior_transfer.impl.ui.screen.JuniorTransferAmountScreenContract$InputData;
import com.revolut.feature.pay_later.impl.ui.plandetails.PayLaterPlanDetailsScreenContract$InputData;
import com.revolut.feature.pay_later.impl.ui.purchasecalculator.PurchaseCalculatorControllerContract$InputData;
import com.revolut.feature.pay_later.impl.ui.repaymentdetails.PayLaterRepaymentDetailsScreenContract$InputData;
import com.revolut.feature.topup_screen.api.descriptor.CardDetailsScreenDescriptor$InputData;
import com.revolut.feature.topup_screen.api.descriptor.FacadeCardTopupFlowDescriptor$InputData;
import com.revolut.feature.topup_screen.api.descriptor.GooglePayFlowDescriptor$InputData;
import com.revolut.feature.topup_screen.api.descriptor.TopupWithNewCardFlowDescriptor$InputData;
import com.revolut.feature.topup_screen.impl.flows.topup_flows.mandate.MandateTopupFlowContract$InputData;
import com.revolut.feature.topup_screen.impl.google_pay.core.network.PaymentConfigurationService;
import com.revolut.kompot.navigable.vc.ViewController;
import e0f.e1;
import e0f.i0;
import ej9.f0;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;
import v0f.n0;
import vi9.e0;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f225465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f225466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f225467c;
    public final Object d;

    public /* synthetic */ a(Object obj2, Object obj3, int i, int i2) {
        this.f225465a = i2;
        this.f225466b = obj2;
        this.d = obj3;
        this.f225467c = i;
    }

    private final Object a() {
        ove.t tVar = (ove.t) this.f225466b;
        ove.i iVar = (ove.i) this.d;
        int i = this.f225467c;
        switch (i) {
            case 0:
                Object extension = (rpi.j) iVar.f230076c.get();
                Intrinsics.checkNotNullParameter(extension, "extension");
                yji.d dVar = (yji.d) extension;
                vc.s.k(dVar);
                return dVar;
            case 1:
                com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) iVar.f230075b.get();
                Intrinsics.checkNotNullParameter(controller, "controller");
                return new mqi.d(controller);
            case 2:
                return kxa.j.k((j60.a) iVar.f.get());
            case 3:
                return ehe.n.s((com.revolut.kompot.navigable.a) iVar.f230075b.get(), (rp0.m) iVar.e.get());
            case 4:
                return new rp0.m();
            case 5:
                n60.a aVar = (n60.a) iVar.f230078h.get();
                o5k.i.l(aVar);
                return aVar;
            case 6:
                return o5k.i.q((com.revolut.kompot.navigable.a) iVar.f230075b.get());
            case 7:
                CardDetailsScreenDescriptor$InputData cardDetailsScreenDescriptor$InputData = iVar.f230074a;
                ang.f fVarE = tVar.f230126h.e();
                y51.a aVar2 = (y51.a) tVar.U.get();
                wig.a aVar3 = new wig.a();
                j60.a aVar4 = (j60.a) iVar.f.get();
                u53.b bVar = (u53.b) tVar.G.f21600c.get();
                vc.s.j(bVar);
                ni0.f fVar = new ni0.f();
                rpi.j jVar = (rpi.j) iVar.f230076c.get();
                n60.a aVar5 = (n60.a) iVar.f230078h.get();
                w53.b bVar2 = (w53.b) iVar.f230079j.get();
                s70.a aVarM = tVar.o.m();
                vc.s.j(aVarM);
                n8b.a aVarA = tVar.E.a();
                vc.s.j(aVarA);
                l61.a aVarB = tVar.f230126h.b();
                vc.s.j(aVarB);
                owe.d dVar2 = new owe.d();
                owe.a aVar6 = new owe.a();
                gte.a aVarB2 = tVar.f230131m.b();
                vc.s.j(aVarB2);
                Retrofit retrofitI = ((c21.b) tVar.f230122c).i();
                vc.s.j(retrofitI);
                return new com.revolut.feature.topup_screen.impl.screens.card_details.b(cardDetailsScreenDescriptor$InputData, fVarE, aVar2, aVar3, aVar4, bVar, fVar, jVar, aVar5, bVar2, aVarM, aVarA, aVarB, dVar2, aVar6, aVarB2, new rve.h(new o7.d(olc.c.j(retrofitI))), (cli.n) iVar.f230082n.get());
            case 8:
                com.revolut.kompot.navigable.a controller2 = (com.revolut.kompot.navigable.a) iVar.f230075b.get();
                e63.a factory = tVar.G.a();
                vc.s.j(factory);
                w0f.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller2, "controller");
                Intrinsics.checkNotNullParameter(factory, "factory");
                return e63.a.a(controller2.m2());
            case 9:
                return new n0((nwe.b) iVar.f230081m.get(), new v0f.a());
            case 10:
                return new nwe.d((nwe.f) iVar.f230080l.get());
            case 11:
                return new nwe.g((mwe.b) iVar.k.get());
            case 12:
                n8b.a aVarA2 = tVar.E.a();
                vc.s.j(aVarA2);
                return new mwe.b(aVarA2);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object b() {
        ove.l lVar = (ove.l) this.d;
        ove.t tVar = (ove.t) this.f225466b;
        int i = this.f225467c;
        if (i == 0) {
            return new com.revolut.feature.topup_screen.impl.flows.checkout.screen.custom_amount.a(tVar.f230125g.b(), (w80.b) lVar.f230092c.get(), lVar.f230090a, new com.revolut.feature.topup_screen.impl.flows.checkout.screen.custom_amount.b(new u80.o(), (w80.b) lVar.f230092c.get()));
        }
        if (i != 1) {
            throw new AssertionError(i);
        }
        qd0.b languageProvider = tVar.o.n();
        vc.s.j(languageProvider);
        mxe.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        return v80.b.b(languageProvider, false, false, 58);
    }

    private final Object c() {
        ove.n nVar = (ove.n) this.d;
        ove.t tVar = (ove.t) this.f225466b;
        c21.e eVar = tVar.f230122c;
        int i = this.f225467c;
        switch (i) {
            case 0:
                GooglePayFlowDescriptor$InputData googlePayFlowDescriptor$InputData = nVar.f230096a;
                c0f.b bVar = (c0f.b) nVar.f230098c.get();
                d0f.a aVar = (d0f.a) nVar.f230100h.get();
                ni0.g gVar = new ni0.g();
                th0.h.a();
                y51.a aVar2 = (y51.a) tVar.U.get();
                b0f.a aVar3 = (b0f.a) nVar.i.get();
                ove.t tVar2 = nVar.f230097b;
                y51.a aVar4 = (y51.a) tVar2.U.get();
                sf0.h hVarB = tVar2.v.b();
                vc.s.j(hVarB);
                c0f.d dVar = new c0f.d(aVar4, hVarB);
                gte.a aVarB = tVar.f230131m.b();
                vc.s.j(aVarB);
                Retrofit retrofitI = ((c21.b) eVar).i();
                vc.s.j(retrofitI);
                return new com.revolut.feature.topup_screen.impl.google_pay.flow.b(googlePayFlowDescriptor$InputData, bVar, aVar, gVar, aVar2, aVar3, dVar, aVarB, new rve.h(new o7.d(olc.c.j(retrofitI))), (vte.b) tVar.l0.get(), new xye.d(), new aue.d());
            case 1:
                return new c0f.b();
            case 2:
                return new d0f.a((Activity) nVar.e.get(), (yze.d) nVar.f230099g.get(), new ni0.k(), new ni0.d(), new mi0.a(), new ni0.h());
            case 3:
                com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) nVar.d.get();
                a0f.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller, "controller");
                Activity activityM2 = controller.m2();
                vc.s.k(activityM2);
                return activityM2;
            case 4:
                return new yze.d((PaymentConfigurationService) nVar.f.get());
            case 5:
                Retrofit retrofit = ((c21.b) eVar).i();
                vc.s.j(retrofit);
                a0f.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                Object objCreate = retrofit.create(PaymentConfigurationService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                PaymentConfigurationService paymentConfigurationService = (PaymentConfigurationService) objCreate;
                vc.s.k(paymentConfigurationService);
                return paymentConfigurationService;
            case 6:
                return new b0f.b();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object d() {
        ove.p pVar = (ove.p) this.d;
        ove.t tVar = pVar.f230107b;
        int i = this.f225467c;
        if (i == 0) {
            return kxa.j.r((j60.a) pVar.e.get());
        }
        if (i == 1) {
            return kxa.j.p((com.revolut.kompot.navigable.a) pVar.f230108c.get(), (rp0.m) pVar.d.get(), new j60.e());
        }
        if (i == 2) {
            return new rp0.m();
        }
        if (i != 3) {
            if (i != 4) {
                throw new AssertionError(i);
            }
            j60.a extension = (j60.a) pVar.e.get();
            oze.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(extension, "extension");
            vc.s.k(extension);
            return extension;
        }
        MandateTopupFlowContract$InputData mandateTopupFlowContract$InputData = pVar.f230106a;
        xg6.x xVarA = tVar.z.a();
        vc.s.j(xVarA);
        fk3.a aVarA = tVar.f230136q.a();
        vc.s.j(aVarA);
        fye.b bVar = new fye.b(xVarA, aVarA, tVar.f230125g.b());
        xg6.x xVarA2 = tVar.z.a();
        vc.s.j(xVarA2);
        oe6.a aVarA2 = tVar.u.a();
        vc.s.j(aVarA2);
        f80.a aVarX = tVar.o.x();
        vc.s.j(aVarX);
        mp.p pVar2 = new mp.p(xVarA2, aVarA2, aVarX);
        gye.a aVar = new gye.a();
        j60.a aVar2 = (j60.a) pVar.f230109g.get();
        xg6.x xVarA3 = ((ove.t) this.f225466b).z.a();
        vc.s.j(xVarA3);
        return new nze.t(mandateTopupFlowContract$InputData, bVar, pVar2, aVar, aVar2, xVarA3);
    }

    @Override // phm.a
    public final Object get() {
        int i = this.f225465a;
        int i2 = this.f225467c;
        Object obj2 = this.d;
        Object obj3 = this.f225466b;
        switch (i) {
            case 0:
                f fVar = (f) obj3;
                b bVar = (b) obj2;
                switch (i2) {
                    case 0:
                        return kxa.j.k((j60.a) bVar.f225484c.get());
                    case 1:
                        return ehe.n.s((com.revolut.kompot.navigable.a) bVar.f225482a.get(), (rp0.m) bVar.f225483b.get());
                    case 2:
                        return new rp0.m();
                    case 3:
                        Object extension = (di9.c) bVar.e.get();
                        Intrinsics.checkNotNullParameter(extension, "extension");
                        yji.n nVar = (yji.n) extension;
                        vc.s.k(nVar);
                        return nVar;
                    case 4:
                        ij9.a provider = (ij9.a) fVar.H.get();
                        Intrinsics.checkNotNullParameter(provider, "provider");
                        return provider.a();
                    case 5:
                        return new nj9.n((cli.n) bVar.f225485g.get(), (xh9.a) fVar.E.get(), (di9.c) bVar.e.get(), (j60.a) bVar.f225484c.get(), fVar.o());
                    case 6:
                        return new nj9.r();
                    default:
                        throw new AssertionError(i2);
                }
            case 1:
                c cVar = (c) obj2;
                f fVar2 = (f) obj3;
                if (i2 == 0) {
                    return new pk9.k((ti9.l) cVar.f225489b.get(), cVar.f225488a, new pk9.l());
                }
                if (i2 == 1) {
                    return new ti9.n((ci9.b) fVar2.A.get(), (f0) fVar2.J.get());
                }
                throw new AssertionError(i2);
            case 2:
                f fVar3 = (f) obj3;
                e eVar = (e) obj2;
                switch (i2) {
                    case 0:
                        return kxa.j.l((j60.a) eVar.f225494c.get());
                    case 1:
                        return h30.l.p((com.revolut.kompot.navigable.a) eVar.f225492a.get(), (rp0.m) eVar.f225493b.get());
                    case 2:
                        return new rp0.m();
                    case 3:
                        Object extension2 = (f15.a) eVar.e.get();
                        kj9.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension2, "extension");
                        yji.n nVar2 = (yji.n) extension2;
                        vc.s.k(nVar2);
                        return nVar2;
                    case 4:
                        j15.e provider2 = fVar3.u.a();
                        vc.s.j(provider2);
                        kj9.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(provider2, "provider");
                        return provider2.a();
                    case 5:
                        Object extension3 = (di9.b) eVar.f225495g.get();
                        kj9.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension3, "extension");
                        yji.n nVar3 = (yji.n) extension3;
                        vc.s.k(nVar3);
                        return nVar3;
                    case 6:
                        ij9.a provider3 = (ij9.a) fVar3.H.get();
                        f15.a getCreditHelpExtension = (f15.a) eVar.e.get();
                        kj9.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(provider3, "provider");
                        Intrinsics.checkNotNullParameter(getCreditHelpExtension, "getCreditHelpExtension");
                        return provider3.b(getCreditHelpExtension);
                    case 7:
                        Object extension4 = (di9.a) eVar.i.get();
                        Intrinsics.checkNotNullParameter(extension4, "extension");
                        yji.n nVar4 = (yji.n) extension4;
                        vc.s.k(nVar4);
                        return nVar4;
                    case 8:
                        ij9.a provider4 = (ij9.a) fVar3.H.get();
                        Intrinsics.checkNotNullParameter(provider4, "provider");
                        return new oj9.e(provider4.f);
                    case 9:
                        return new jj9.m((xh9.a) fVar3.E.get(), (j60.a) eVar.f225494c.get(), fVar3.q(), new uj9.b(), (di9.b) eVar.f225495g.get(), fVar3.o(), fVar3.f225511s.e(), (di9.a) eVar.i.get(), (jki.p) eVar.k.get());
                    case 10:
                        return new jj9.n(new lj9.c(), new lj9.d(), new lj9.e(), new vi9.j(), new oj9.f());
                    default:
                        throw new AssertionError(i2);
                }
            case 3:
                g gVar = (g) obj2;
                f fVar4 = (f) obj3;
                if (i2 != 0) {
                    if (i2 == 1) {
                        return new pj9.o();
                    }
                    if (i2 == 2) {
                        return new ti9.n((ci9.b) fVar4.A.get(), (f0) fVar4.J.get());
                    }
                    throw new AssertionError(i2);
                }
                cli.n nVar5 = (cli.n) gVar.f225516a.get();
                xh9.a aVar = (xh9.a) fVar4.E.get();
                ti9.l lVar = (ti9.l) gVar.f225517b.get();
                gte.a aVarB = fVar4.f225512t.b();
                vc.s.j(aVarB);
                wj0.a aVarI = ((nj0.d) fVar4.e).i();
                vc.s.j(aVarI);
                return new pj9.l(nVar5, aVar, lVar, aVarB, aVarI);
            case 4:
                f fVar5 = (f) obj3;
                if (i2 != 0) {
                    if (i2 == 1) {
                        return new qee.s(new gk9.b(fVar5.l()));
                    }
                    throw new AssertionError(i2);
                }
                gte.a aVarB2 = fVar5.f225512t.b();
                vc.s.j(aVarB2);
                com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) fVar5.f225504j).c();
                vc.s.j(aVarC);
                h hVar = (h) obj2;
                return new rj9.j(aVarB2, aVarC, (xh9.a) fVar5.E.get(), hVar.f225519a, (cli.n) hVar.f225520b.get());
            case 5:
                f fVar6 = (f) obj3;
                k kVar = (k) obj2;
                switch (i2) {
                    case 0:
                        return kxa.j.l((j60.a) kVar.e.get());
                    case 1:
                        return h30.l.p((com.revolut.kompot.navigable.a) kVar.f225530c.get(), (rp0.m) kVar.d.get());
                    case 2:
                        return new rp0.m();
                    case 3:
                        Object extension5 = (f15.a) kVar.f225531g.get();
                        ek9.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension5, "extension");
                        yji.n nVar6 = (yji.n) extension5;
                        vc.s.k(nVar6);
                        return nVar6;
                    case 4:
                        j15.e provider5 = fVar6.u.a();
                        vc.s.j(provider5);
                        ek9.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(provider5, "provider");
                        return provider5.a();
                    case 5:
                        Object extension6 = (di9.b) kVar.i.get();
                        ek9.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension6, "extension");
                        yji.n nVar7 = (yji.n) extension6;
                        vc.s.k(nVar7);
                        return nVar7;
                    case 6:
                        ij9.a provider6 = (ij9.a) fVar6.H.get();
                        f15.a getCreditHelpExtension2 = (f15.a) kVar.f225531g.get();
                        ek9.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(provider6, "provider");
                        Intrinsics.checkNotNullParameter(getCreditHelpExtension2, "getCreditHelpExtension");
                        return provider6.b(getCreditHelpExtension2);
                    case 7:
                        PayLaterPlanDetailsScreenContract$InputData payLaterPlanDetailsScreenContract$InputData = kVar.f225528a;
                        xh9.a aVar2 = (xh9.a) fVar6.E.get();
                        j60.a aVar3 = (j60.a) kVar.e.get();
                        e0 e0VarQ = fVar6.q();
                        com.revolut.domain.interactors.transactions.a aVarC2 = ((bjf.a) fVar6.f225504j).c();
                        vc.s.j(aVarC2);
                        return new dk9.a0(payLaterPlanDetailsScreenContract$InputData, aVar2, aVar3, e0VarQ, aVarC2, fVar6.p(), (di9.b) kVar.i.get(), (jki.p) kVar.k.get());
                    case 8:
                        dk9.b bVar2 = new dk9.b(kVar.f225529b.l());
                        vi9.z payLaterPlanProgressMapper = new vi9.z();
                        vi9.o payLaterOverLimitTileMapper = new vi9.o();
                        Intrinsics.checkNotNullParameter(payLaterPlanProgressMapper, "payLaterPlanProgressMapper");
                        Intrinsics.checkNotNullParameter(payLaterOverLimitTileMapper, "payLaterOverLimitTileMapper");
                        return new anl.j(bVar2, new dk9.d());
                    default:
                        throw new AssertionError(i2);
                }
            case 6:
                f fVar7 = (f) obj3;
                l lVar2 = (l) obj2;
                if (i2 == 0) {
                    return kxa.j.l((j60.a) lVar2.f225537c.get());
                }
                if (i2 == 1) {
                    return h30.l.p((com.revolut.kompot.navigable.a) lVar2.f225535a.get(), (rp0.m) lVar2.f225536b.get());
                }
                if (i2 == 2) {
                    return new rp0.m();
                }
                if (i2 != 3) {
                    if (i2 == 4) {
                        return new gk9.r(new uj9.a(), new gk9.b(fVar7.l()));
                    }
                    throw new AssertionError(i2);
                }
                j60.a aVar4 = (j60.a) lVar2.f225537c.get();
                xh9.a aVar5 = (xh9.a) fVar7.E.get();
                return new gk9.o(aVar4, (jki.p) lVar2.e.get(), fVar7.o(), fVar7.q(), aVar5);
            case 7:
                f fVar8 = (f) obj3;
                if (i2 == 0) {
                    return new kk9.n((xh9.a) fVar8.E.get(), fVar8.p(), new i90.b(), (jki.p) ((m) obj2).f225539b.get());
                }
                if (i2 != 1) {
                    throw new AssertionError(i2);
                }
                w80.b bVarJ = fVar8.o.j();
                vc.s.j(bVarJ);
                return new kk9.r(bVarJ);
            case 8:
                f fVar9 = (f) obj3;
                n nVar8 = (n) obj2;
                switch (i2) {
                    case 0:
                        return kxa.j.l((j60.a) nVar8.e.get());
                    case 1:
                        return h30.l.p((com.revolut.kompot.navigable.a) nVar8.f225543c.get(), (rp0.m) nVar8.d.get());
                    case 2:
                        return new rp0.m();
                    case 3:
                        Object extension7 = (f15.a) nVar8.f225544g.get();
                        mk9.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension7, "extension");
                        yji.n nVar9 = (yji.n) extension7;
                        vc.s.k(nVar9);
                        return nVar9;
                    case 4:
                        j15.e provider7 = fVar9.u.a();
                        vc.s.j(provider7);
                        mk9.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(provider7, "provider");
                        return provider7.a();
                    case 5:
                        Object extension8 = (di9.b) nVar8.i.get();
                        mk9.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension8, "extension");
                        yji.n nVar10 = (yji.n) extension8;
                        vc.s.k(nVar10);
                        return nVar10;
                    case 6:
                        ij9.a provider8 = (ij9.a) fVar9.H.get();
                        f15.a getCreditHelpExtension3 = (f15.a) nVar8.f225544g.get();
                        mk9.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(provider8, "provider");
                        Intrinsics.checkNotNullParameter(getCreditHelpExtension3, "getCreditHelpExtension");
                        return provider8.b(getCreditHelpExtension3);
                    case 7:
                        Object extension9 = (di9.a) nVar8.k.get();
                        Intrinsics.checkNotNullParameter(extension9, "extension");
                        yji.n nVar11 = (yji.n) extension9;
                        vc.s.k(nVar11);
                        return nVar11;
                    case 8:
                        ij9.a provider9 = (ij9.a) fVar9.H.get();
                        Intrinsics.checkNotNullParameter(provider9, "provider");
                        return new oj9.e(provider9.f);
                    case 9:
                        PayLaterRepaymentDetailsScreenContract$InputData payLaterRepaymentDetailsScreenContract$InputData = nVar8.f225541a;
                        xh9.a aVar6 = (xh9.a) fVar9.E.get();
                        whf.b bVarA = fVar9.k.a();
                        vc.s.j(bVarA);
                        return new lk9.y(payLaterRepaymentDetailsScreenContract$InputData, aVar6, bVarA, fVar9.q(), fVar9.p(), (j60.a) nVar8.e.get(), (di9.b) nVar8.i.get(), (di9.a) nVar8.k.get(), (jki.p) nVar8.f225548m.get());
                    case 10:
                        uj9.a aVar7 = new uj9.a();
                        nVar8.getClass();
                        f fVar10 = nVar8.f225542b;
                        lk9.c cVar2 = new lk9.c(fVar10.l());
                        thf.g gVarE = fVar10.k.e();
                        vc.s.j(gVarE);
                        return new lk9.z(aVar7, cVar2, new lk9.e(gVarE, new vi9.o(), new oj9.f()));
                    default:
                        throw new AssertionError(i2);
                }
            case 9:
                f fVar11 = (f) obj3;
                o oVar = (o) obj2;
                if (i2 == 0) {
                    return kxa.j.l((j60.a) oVar.f225552c.get());
                }
                if (i2 == 1) {
                    return h30.l.p((com.revolut.kompot.navigable.a) oVar.f225550a.get(), (rp0.m) oVar.f225551b.get());
                }
                if (i2 == 2) {
                    return new rp0.m();
                }
                if (i2 != 3) {
                    if (i2 == 4) {
                        return new nk9.q(new uj9.a(), fVar11.m());
                    }
                    throw new AssertionError(i2);
                }
                xh9.a aVar8 = (xh9.a) fVar11.E.get();
                return new nk9.o((j60.a) oVar.f225552c.get(), (jki.p) oVar.e.get(), fVar11.o(), fVar11.q(), aVar8);
            case 10:
                f fVar12 = (f) obj3;
                p pVar = (p) obj2;
                if (i2 == 0) {
                    return kxa.j.l((j60.a) pVar.f225555c.get());
                }
                if (i2 == 1) {
                    return h30.l.p((com.revolut.kompot.navigable.a) pVar.f225553a.get(), (rp0.m) pVar.f225554b.get());
                }
                if (i2 == 2) {
                    return new rp0.m();
                }
                if (i2 == 3) {
                    return new uk9.k((xh9.a) fVar12.E.get(), fVar12.p(), (j60.a) pVar.f225555c.get(), (jki.p) pVar.e.get());
                }
                if (i2 == 4) {
                    return new uk9.n(new gk9.b(fVar12.l()));
                }
                throw new AssertionError(i2);
            case 11:
                f fVar13 = (f) obj3;
                q qVar = (q) obj2;
                if (i2 == 0) {
                    return kxa.j.l((j60.a) qVar.f225558c.get());
                }
                if (i2 == 1) {
                    return h30.l.p((com.revolut.kompot.navigable.a) qVar.f225556a.get(), (rp0.m) qVar.f225557b.get());
                }
                if (i2 == 2) {
                    return new rp0.m();
                }
                if (i2 == 3) {
                    return new tk9.j((xh9.a) fVar13.E.get(), fVar13.p(), (j60.a) qVar.f225558c.get(), (jki.p) qVar.e.get());
                }
                if (i2 == 4) {
                    return new tk9.l(fVar13.m());
                }
                throw new AssertionError(i2);
            case 12:
                t tVar = (t) obj2;
                if (i2 == 0) {
                    return new fk9.f((cli.n) tVar.f225565b.get(), tVar.f225564a, (xh9.a) ((f) obj3).E.get());
                }
                if (i2 == 1) {
                    return new at.r(new vi9.z());
                }
                throw new AssertionError(i2);
            case 13:
                if (i2 == 0) {
                    u uVar = (u) obj2;
                    return new bk9.j(uVar.f225567a, (cli.n) uVar.f225568b.get(), (xh9.a) ((f) obj3).E.get());
                }
                if (i2 == 1) {
                    return new bk9.l();
                }
                throw new AssertionError(i2);
            case 14:
                f fVar14 = (f) obj3;
                v vVar = (v) obj2;
                switch (i2) {
                    case 0:
                        return kxa.j.k((j60.a) vVar.e.get());
                    case 1:
                        return ehe.n.s((com.revolut.kompot.navigable.a) vVar.f225572c.get(), (rp0.m) vVar.d.get());
                    case 2:
                        return new rp0.m();
                    case 3:
                        n60.a aVar9 = (n60.a) vVar.f225573g.get();
                        o5k.i.l(aVar9);
                        return aVar9;
                    case 4:
                        return o5k.i.q((com.revolut.kompot.navigable.a) vVar.f225572c.get());
                    case 5:
                        Object extension10 = (di9.c) vVar.i.get();
                        Intrinsics.checkNotNullParameter(extension10, "extension");
                        yji.n nVar12 = (yji.n) extension10;
                        vc.s.k(nVar12);
                        return nVar12;
                    case 6:
                        ij9.a provider10 = (ij9.a) fVar14.H.get();
                        Intrinsics.checkNotNullParameter(provider10, "provider");
                        return provider10.a();
                    case 7:
                        cli.n nVar13 = (cli.n) vVar.f225576l.get();
                        xh9.a aVar10 = (xh9.a) fVar14.E.get();
                        j60.a aVar11 = (j60.a) vVar.e.get();
                        di9.c cVar3 = (di9.c) vVar.i.get();
                        PurchaseCalculatorControllerContract$InputData purchaseCalculatorControllerContract$InputData = vVar.f225570a;
                        w80.b bVarJ2 = fVar14.o.j();
                        vc.s.j(bVarJ2);
                        return new hk9.q(nVar13, aVar10, aVar11, cVar3, purchaseCalculatorControllerContract$InputData, bVarJ2, new hk9.r(), (n60.a) vVar.f225573g.get(), (ik9.a) fVar14.I.get(), fVar14.o());
                    case 8:
                        w80.b bVarJ3 = fVar14.o.j();
                        vc.s.j(bVarJ3);
                        return new hk9.a0(bVarJ3, (rx0.i) vVar.k.get());
                    case 9:
                        qd0.b languageProvider = fVar14.o.n();
                        vc.s.j(languageProvider);
                        jk9.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
                        return new rx0.i(2, ((s80.b) languageProvider).b());
                    default:
                        throw new AssertionError(i2);
                }
            case 15:
                x xVar = (x) obj2;
                f fVar15 = (f) obj3;
                if (i2 == 0) {
                    return new com.revolut.feature.pay_later.impl.ui.right_to_cancel.summary.a((ti9.l) xVar.f225582b.get(), xVar.f225581a, new rk9.u());
                }
                if (i2 == 1) {
                    return new ti9.n((ci9.b) fVar15.A.get(), (f0) fVar15.J.get());
                }
                throw new AssertionError(i2);
            case 16:
                ok1.d dVar = (ok1.d) obj3;
                ok1.e eVar2 = (ok1.e) obj2;
                if (i2 == 0) {
                    return new com.revolut.feature.alipay.impl.ui.qr.showcode.modal.c(eVar2.f225869a, (pk1.d) dVar.f225868p.get(), new com.revolut.feature.alipay.impl.ui.qr.showcode.modal.e((zk1.c) eVar2.f225871c.get()));
                }
                if (i2 != 1) {
                    throw new AssertionError(i2);
                }
                fkg.a aVarD = dVar.f225861c.d();
                ViewController controller = eVar2.f225870b;
                al1.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller, "controller");
                return new zk1.e(aVarD, new c90.c(controller.m2()));
            case 17:
                if (i2 == 0) {
                    return new com.revolut.feature.alipay.impl.ui.qr.a((cli.n) ((ok1.f) obj2).f225874c.get(), (qk1.f) ((ok1.d) obj3).f225866m.get());
                }
                if (i2 == 1) {
                    return new com.revolut.feature.alipay.impl.ui.qr.b();
                }
                throw new AssertionError(i2);
            case 18:
                ok1.h hVar2 = (ok1.h) obj2;
                ok1.d dVar2 = (ok1.d) obj3;
                if (i2 == 0) {
                    return new com.revolut.feature.alipay.impl.ui.qr.showcode.a((pk1.d) dVar2.f225868p.get(), new zk1.r((zk1.c) hVar2.f225877b.get()));
                }
                if (i2 != 1) {
                    throw new AssertionError(i2);
                }
                fkg.a aVarD2 = dVar2.f225861c.d();
                ViewController controller2 = hVar2.f225876a;
                al1.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller2, "controller");
                return new zk1.e(aVarD2, new c90.c(controller2.m2()));
            case 19:
                oq8.f fVar16 = (oq8.f) obj3;
                oq8.d dVar3 = (oq8.d) obj2;
                switch (i2) {
                    case 0:
                        n60.a aVar12 = (n60.a) dVar3.f227774h.get();
                        o5k.i.k(aVar12);
                        return aVar12;
                    case 1:
                        return o5k.i.p((com.revolut.kompot.navigable.a) dVar3.f227773g.get());
                    case 2:
                        j9i.d extension11 = (j9i.d) dVar3.f227775j.get();
                        Intrinsics.checkNotNullParameter(extension11, "extension");
                        vc.s.k(extension11);
                        return extension11;
                    case 3:
                        o9i.a aVar13 = dVar3.f227770a;
                        oq8.f fVar17 = dVar3.f;
                        o9i.c cVar4 = dVar3.f227772c;
                        o9i.b bVar3 = dVar3.f227771b;
                        Retrofit retrofit = ((nj0.d) fVar17.f227785b).f();
                        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                        q9i.d dVarE = o5k.i.e(aVar13, o5k.i.c(bVar3, o5k.i.y(cVar4, retrofit), new l9i.a(), new p9i.a()));
                        Retrofit retrofit3 = ((nj0.d) fVar17.f227785b).f();
                        Intrinsics.checkNotNullParameter(retrofit3, "retrofit");
                        r9i.e reactionsKeyboardViewModel = new r9i.e(new q9i.b(dVarE, o5k.i.f(aVar13, o5k.i.d(bVar3, o5k.i.y(cVar4, retrofit3), new l9i.a(), new p9i.a()))), new r9i.a());
                        ReactionsKeyboardView reactionsKeyboardView = dVar3.d;
                        j9i.a configuration = hr8.b.a();
                        Intrinsics.checkNotNullParameter(reactionsKeyboardViewModel, "reactionsKeyboardViewModel");
                        Intrinsics.checkNotNullParameter(reactionsKeyboardView, "reactionsKeyboardView");
                        Intrinsics.checkNotNullParameter(configuration, "configuration");
                        return new j9i.d(reactionsKeyboardViewModel, reactionsKeyboardView, configuration);
                    case 4:
                        JuniorTransferAmountScreenContract$InputData juniorTransferAmountScreenContract$InputData = dVar3.e;
                        wsg.n nVarB = fVar16.f.b();
                        hj8.a aVarA = fVar16.f227787g.a();
                        vc.s.j(aVarA);
                        return new fr8.r(juniorTransferAmountScreenContract$InputData, nVarB, aVarA, (w80.b) dVar3.f227776l.get(), (n60.a) dVar3.f227774h.get(), (j9i.d) dVar3.f227775j.get(), (ir8.a) dVar3.f227777m.get(), (jki.p) dVar3.f227779p.get());
                    case 5:
                        qd0.b languageProvider2 = fVar16.f227788h.n();
                        vc.s.j(languageProvider2);
                        hr8.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(languageProvider2, "languageProvider");
                        return v80.b.b(languageProvider2, false, false, 58);
                    case 6:
                        ir8.i positiveAmountValidator = new ir8.i();
                        dVar3.getClass();
                        srf.d amountBalanceValidator = new srf.d();
                        Intrinsics.checkNotNullParameter(amountBalanceValidator, "amountBalanceValidator");
                        ir8.d juniorAmountBalanceTransferValidator = new ir8.d();
                        ir8.e juniorMinAmountTransferValidator = new ir8.e(dVar3.e);
                        hr8.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(positiveAmountValidator, "positiveAmountValidator");
                        Intrinsics.checkNotNullParameter(juniorAmountBalanceTransferValidator, "juniorAmountBalanceTransferValidator");
                        Intrinsics.checkNotNullParameter(juniorMinAmountTransferValidator, "juniorMinAmountTransferValidator");
                        return new ir8.a(zhm.v.k(positiveAmountValidator, juniorAmountBalanceTransferValidator, juniorMinAmountTransferValidator));
                    case 7:
                        JuniorTransferAmountScreenContract$InputData juniorTransferAmountScreenContract$InputData2 = dVar3.e;
                        w80.b bVar4 = (w80.b) dVar3.f227776l.get();
                        u80.o oVar2 = new u80.o();
                        c91.a aVarA2 = dVar3.f.i.a();
                        vc.s.j(aVarA2);
                        return new fr8.t(juniorTransferAmountScreenContract$InputData2, new fr8.c(bVar4, oVar2, aVarA2, (yof.d) dVar3.o.get(), new opf.c0(), dVar3.e));
                    case 8:
                        ppf.a factory = fVar16.f227789j.b();
                        vc.s.j(factory);
                        ldd.b delegate = (ldd.b) dVar3.f227778n.get();
                        hr8.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory, "factory");
                        Intrinsics.checkNotNullParameter(delegate, "delegate");
                        return ppf.a.a(delegate);
                    case 9:
                        kdd.b bVar5 = fVar16.k;
                        ldd.a factory2 = new ldd.a();
                        hr8.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory2, "factory");
                        return new ldd.b();
                    default:
                        throw new AssertionError(i2);
                }
            case 20:
                oq8.f fVar18 = (oq8.f) obj3;
                jd8.b bVar6 = fVar18.d;
                if (i2 == 0) {
                    r10.f factory3 = fVar18.f227784a.a();
                    er8.a.Companion.getClass();
                    Intrinsics.checkNotNullParameter(factory3, "factory");
                    return factory3.d();
                }
                if (i2 != 1) {
                    throw new AssertionError(i2);
                }
                JuniorTransferFlowContract$InputData juniorTransferFlowContract$InputData = ((oq8.e) obj2).f227781a;
                wj0.a aVarI2 = ((nj0.d) fVar18.f227785b).i();
                vc.s.j(aVarI2);
                fmc.z zVar = new fmc.z((is8.a) fVar18.f227786c.i.get());
                kd8.p pVar2 = (kd8.p) bVar6.B.get();
                vc.s.j(pVar2);
                vc8.a aVar14 = (vc8.a) bVar6.f173012s.get();
                vc.s.j(aVar14);
                return new com.revolut.feature.junior_transfer.impl.ui.flow.transfer.a(juniorTransferFlowContract$InputData, aVarI2, zVar, pVar2, aVar14, ((oq8.a) fVar18.e).d());
            case 21:
                ot2.b bVar7 = (ot2.b) obj2;
                if (i2 == 0) {
                    return new pt2.f((Activity) bVar7.f229430b.get(), ((ot2.a) obj3).f229426a.b(), new pt2.g());
                }
                if (i2 != 1) {
                    throw new AssertionError(i2);
                }
                ViewController viewController = bVar7.f229429a;
                qt2.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(viewController, "viewController");
                Activity activityM2 = viewController.m2();
                vc.s.k(activityM2);
                return activityM2;
            case 22:
                ou2.f fVar19 = (ou2.f) obj2;
                if (i2 == 0) {
                    return kxa.j.l((j60.a) fVar19.d.get());
                }
                if (i2 == 1) {
                    return h30.l.p((com.revolut.kompot.navigable.a) fVar19.f229780b.get(), (rp0.m) fVar19.f229781c.get());
                }
                if (i2 == 2) {
                    return new rp0.m();
                }
                if (i2 != 3) {
                    if (i2 == 4) {
                        return new tu2.e();
                    }
                    if (i2 == 5) {
                        return new pu2.e();
                    }
                    throw new AssertionError(i2);
                }
                jki.p pVar3 = (jki.p) fVar19.f.get();
                CardTerminateScreenContract$InputData cardTerminateScreenContract$InputData = fVar19.f229779a;
                l93.f fVarJ = ((ou2.d) obj3).f229774b.j();
                vc.s.j(fVarJ);
                return new tu2.h(pVar3, cardTerminateScreenContract$InputData, fVarJ, (j60.a) fVar19.d.get(), (pu2.d) fVar19.f229782g.get());
            case 23:
                ove.t tVar2 = (ove.t) obj3;
                ove.h hVar3 = (ove.h) obj2;
                ove.t tVar3 = hVar3.f230072b;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new AssertionError(i2);
                    }
                    com.revolut.kompot.navigable.a controller3 = (com.revolut.kompot.navigable.a) hVar3.d.get();
                    ize.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(controller3, "controller");
                    Activity activityM22 = controller3.m2();
                    vc.s.k(activityM22);
                    return activityM22;
                }
                FacadeCardTopupFlowDescriptor$InputData facadeCardTopupFlowDescriptor$InputData = hVar3.f230071a;
                p71.a aVar15 = (p71.a) tVar2.N.get();
                y51.a aVar16 = (y51.a) tVar2.U.get();
                wwh.a aVarB3 = tVar2.i.b();
                vc.s.j(aVarB3);
                y51.a aVar17 = (y51.a) tVar3.U.get();
                sf0.h hVarB = tVar3.v.b();
                vc.s.j(hVarB);
                c0f.d dVar4 = new c0f.d(aVar17, hVarB);
                Activity activity = (Activity) hVar3.e.get();
                wwh.a aVarB4 = tVar3.i.b();
                vc.s.j(aVarB4);
                cze.d dVar5 = new cze.d(activity, aVarB4, hVar3.j());
                agf.b bVarA2 = ((dgf.a) tVar3.A).a();
                vc.s.j(bVarA2);
                e1 e1Var = new e1(bVarA2, (pze.a) tVar3.f230134o0.get());
                agf.b bVarA3 = ((dgf.a) tVar3.A).a();
                vc.s.j(bVarA3);
                i0 i0Var = new i0(bVarA3, (pze.a) tVar3.f230134o0.get());
                rve.d dVarJ = hVar3.j();
                gte.a aVarB5 = tVar2.f230131m.b();
                vc.s.j(aVarB5);
                return new com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv.c(facadeCardTopupFlowDescriptor$InputData, aVar15, aVar16, aVarB3, dVar4, dVar5, e1Var, i0Var, dVarJ, aVarB5);
            case 24:
                return a();
            case 25:
                ove.t tVar4 = (ove.t) obj3;
                ove.j jVar = (ove.j) obj2;
                ove.t tVar5 = jVar.f230085b;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new AssertionError(i2);
                    }
                    com.revolut.kompot.navigable.a controller4 = (com.revolut.kompot.navigable.a) jVar.d.get();
                    gze.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(controller4, "controller");
                    Activity activityM23 = controller4.m2();
                    vc.s.k(activityM23);
                    return activityM23;
                }
                FacadeCardTopupFlowDescriptor$InputData facadeCardTopupFlowDescriptor$InputData2 = jVar.f230084a;
                p71.a aVar18 = (p71.a) tVar4.N.get();
                wwh.a aVarB6 = tVar4.i.b();
                vc.s.j(aVarB6);
                y51.a aVar19 = (y51.a) tVar5.U.get();
                sf0.h hVarB2 = tVar5.v.b();
                vc.s.j(hVarB2);
                c0f.d dVar6 = new c0f.d(aVar19, hVarB2);
                Activity activity2 = (Activity) jVar.e.get();
                wwh.a aVarB7 = tVar5.i.b();
                vc.s.j(aVarB7);
                cze.d dVar7 = new cze.d(activity2, aVarB7, jVar.j());
                agf.b bVarA4 = ((dgf.a) tVar5.A).a();
                vc.s.j(bVarA4);
                i0 i0Var2 = new i0(bVarA4, (pze.a) tVar5.f230134o0.get());
                rve.d dVarJ2 = jVar.j();
                gte.a aVarB8 = tVar4.f230131m.b();
                vc.s.j(aVarB8);
                return new com.revolut.feature.topup_screen.impl.flows.topup_flows.card.b(facadeCardTopupFlowDescriptor$InputData2, aVar18, aVarB6, dVar6, dVar7, i0Var2, dVarJ2, aVarB8);
            case 26:
                return b();
            case 27:
                return c();
            case 28:
                return d();
            default:
                ove.t tVar6 = (ove.t) obj3;
                ove.u uVar2 = (ove.u) obj2;
                ove.t tVar7 = uVar2.f230160b;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new AssertionError(i2);
                    }
                    com.revolut.kompot.navigable.a controller5 = (com.revolut.kompot.navigable.a) uVar2.d.get();
                    qze.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(controller5, "controller");
                    Activity activityM24 = controller5.m2();
                    vc.s.k(activityM24);
                    return activityM24;
                }
                TopupWithNewCardFlowDescriptor$InputData topupWithNewCardFlowDescriptor$InputData = uVar2.f230159a;
                y51.a aVar20 = (y51.a) tVar7.U.get();
                sf0.h hVarB3 = tVar7.v.b();
                vc.s.j(hVarB3);
                c0f.d dVar8 = new c0f.d(aVar20, hVarB3);
                Activity activity3 = (Activity) uVar2.e.get();
                wwh.a aVarB9 = tVar7.i.b();
                vc.s.j(aVarB9);
                cze.d dVar9 = new cze.d(activity3, aVarB9, uVar2.c());
                agf.b bVarA5 = ((dgf.a) tVar7.A).a();
                vc.s.j(bVarA5);
                e1 e1Var2 = new e1(bVarA5, (pze.a) tVar7.f230134o0.get());
                agf.b bVarA6 = ((dgf.a) tVar7.A).a();
                vc.s.j(bVarA6);
                i0 i0Var3 = new i0(bVarA6, (pze.a) tVar7.f230134o0.get());
                p71.a aVar21 = (p71.a) tVar6.N.get();
                wwh.a aVarB10 = tVar6.i.b();
                vc.s.j(aVarB10);
                rve.d dVarC = uVar2.c();
                gte.a aVarB11 = tVar6.f230131m.b();
                vc.s.j(aVarB11);
                return new com.revolut.feature.topup_screen.impl.flows.topup_flows.new_card.b(topupWithNewCardFlowDescriptor$InputData, dVar8, dVar9, e1Var2, i0Var3, aVar21, aVarB10, dVarC, aVarB11, tVar6.f230125g.a());
        }
    }
}
