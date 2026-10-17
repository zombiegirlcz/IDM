package iyi;

import android.os.Parcelable;
import b4g.o0;
import bjk.u3;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.model.faq.FaqMetaData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.data.model.Data;
import com.revolut.data.network.models.security.SecuritySettings;
import com.revolut.feature.apm.core.api.R$string;
import com.revolut.feature.apm.core.code.data.ApmCodeData;
import com.revolut.feature.checkout.impl.resume.flow.ResumeCheckoutFlowContract$InputData;
import com.revolut.feature.checkout.models.CheckoutOrder;
import com.revolut.feature.onboarding.impl.qes.waiting_auth.WaitingAuthScreenContract$InputData;
import com.revolut.feature.retail.reverywhere.impl.web_app.ReverywhereWebAppScreen;
import com.revolut.feature.shared.help_centre.api.faq.SharedFaqDestination;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferCreateRequest;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.retail.feature.crypto_deposits.impl.ui.return_deposit.summary.ReturnCryptoDepositSummaryScreenContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.network.PricingPlanOffersService;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.financials.StockFinancialsControllerContract$InputData;
import dwi.a0;
import ft3.h1;
import hw3.b0;
import j2c.r;
import j82.s;
import java.util.List;
import ju4.q;
import klf.y0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kp0.w0;
import l25.u;
import nii.h0;
import nii.j0;
import nii.u1;
import om4.x2;
import pfm.t;
import skm.a2;
import skm.e0;
import skm.p0;
import u09.v;
import vkm.j2;
import zh9.u0;
import zhm.d0;

/* JADX INFO: loaded from: classes10.dex */
public final class j extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f169768w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj2, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f169768w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j((m) this.f169768w, continuation, 0);
            case 1:
                return new j((com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_list_spare_change.a) this.f169768w, continuation, 1);
            case 2:
                return new j((j5g.d) this.f169768w, continuation, 2);
            case 3:
                return new j((s) this.f169768w, continuation, 3);
            case 4:
                return new j((j8k.d) this.f169768w, continuation, 4);
            case 5:
                return new j((com.revolut.feature.credit.application.plugins.impl.ui.illion_bankstatement.b) this.f169768w, continuation, 5);
            case 6:
                return new j((com.revolut.retail.feature.crypto_deposits.impl.ui.return_deposit.summary.a) this.f169768w, continuation, 6);
            case 7:
                return new j((jd3.h) this.f169768w, continuation, 7);
            case 8:
                return new j((com.revolut.retail.feature.plan_rewards.impl.presentation.list.flow.c) this.f169768w, continuation, 8);
            case 9:
                return new j((ufm.n) this.f169768w, continuation, 9);
            case 10:
                return new j((ReverywhereWebAppScreen) this.f169768w, continuation, 10);
            case 11:
                return new j((com.revolut.feature.credit.autopay.ui.screen.amount.input.b) this.f169768w, continuation, 11);
            case 12:
                return new j((q) this.f169768w, continuation, 12);
            case 13:
                return new j((com.revolut.feature.apm.core.code.ui.a) this.f169768w, continuation, 13);
            case 14:
                return new j((k09.g) this.f169768w, continuation, 14);
            case 15:
                return new j((k22.f) this.f169768w, continuation, 15);
            case 16:
                return new j((com.revolut.feature.shared.help_centre.impl.faq.screens.list.b) this.f169768w, continuation, 16);
            case 17:
                return new j((k9e.i) this.f169768w, continuation, 17);
            case 18:
                return new j((ka4.q) this.f169768w, continuation, 18);
            case 19:
                return new j((kaf.g) this.f169768w, continuation, 19);
            case 20:
                return new j((kc9.m) this.f169768w, continuation, 20);
            case 21:
                return new j((ke2.q) this.f169768w, continuation, 21);
            case 22:
                return new j((com.revolut.feature.checkout.impl.resume.flow.a) this.f169768w, continuation, 22);
            case 23:
                return new j((com.revolut.feature.product.lifecycle.flow.a) this.f169768w, continuation, 23);
            case 24:
                return new j((kjk.o) this.f169768w, continuation, 24);
            case 25:
                return new j((kk8.o) this.f169768w, continuation, 25);
            case 26:
                return new j((y0) this.f169768w, continuation, 26);
            case 27:
                return new j((kvk.o) this.f169768w, continuation, 27);
            case 28:
                return new j((u) this.f169768w, continuation, 28);
            default:
                return new j((com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_multiplier_spare_change.a) this.f169768w, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((j) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objJ;
        Object objZ;
        FaqMetaData faqMetaData;
        Object objD;
        Object objB;
        int i = this.u;
        Continuation continuation = null;
        Object obj3 = this.f169768w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    m mVar = (m) obj3;
                    a0 a0Var = mVar.f169770p;
                    String str = mVar.f169771q;
                    this.v = 1;
                    if (a0Var.a(str, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_list_spare_change.a aVar3 = (com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_list_spare_change.a) obj3;
                    r rVar = new r(aVar3, null);
                    this.v = 1;
                    if (u0.b0(aVar3.X(), "SPARE_CHANGE_DEACTIVATE_BUTTON_TAG", rVar, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                j5g.d dVar = (j5g.d) obj3;
                o0 o0Var = dVar.f171630p;
                String str2 = dVar.o.f93285a;
                this.v = 1;
                Object objA = o0Var.a(str2, this);
                return objA == aVar4 ? aVar4 : objA;
            case 3:
                s sVar = (s) obj3;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    zq.a aVar6 = sVar.f172100p;
                    Object content = ((j82.i) ((j2) sVar.f172101q.f22677a).getValue()).f172090a.getContent();
                    if (content == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    this.v = 1;
                    if (aVar6.A((h02.c) content, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i6 != 1) {
                        if (i6 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                Flow flowX1 = sVar.X1(new nii.y0(null, new j0((Clause) new TextLocalisedClause(R$string.apm_payment_confirmation_status_title_rejected, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094), false, 5));
                j82.r rVar2 = new j82.r(sVar);
                this.v = 2;
                if (((rv6.e) flowX1).collect(rVar2, this) == aVar5) {
                    return aVar5;
                }
                return Unit.f186387a;
            case 4:
                j8k.d dVar2 = (j8k.d) obj3;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    t tVarC = ((y21.c) dVar2.o.f322839a).c(SecuritySettings.USERNAME, true);
                    this.v = 1;
                    if (nim.a.a(tVarC, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                dVar2.C2(j8k.b.f172224a);
                return Unit.f186387a;
            case 5:
                com.revolut.feature.credit.application.plugins.impl.ui.illion_bankstatement.b bVar = (com.revolut.feature.credit.application.plugins.impl.ui.illion_bankstatement.b) obj3;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    b0 b0Var = bVar.f67794q;
                    h1 h1VarF = w0.F(bVar.f67793p.f67790a);
                    this.v = 1;
                    n34.b bVar2 = b0Var.f156054a;
                    bVar2.getClass();
                    n34.a aVar9 = new n34.a(bVar2, h1VarF, continuation, 3);
                    p0 p0Var = p0.f264001a;
                    objJ = e0.J(elm.f.f127540b, aVar9, this);
                    if (objJ == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i22 != 1) {
                        if (i22 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                    objJ = obj2;
                }
                this.v = 2;
                if (c84.t.N2(bVar, (it3.d) objJ, this, 2) == aVar8) {
                    return aVar8;
                }
                return Unit.f186387a;
            case 6:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.retail.feature.crypto_deposits.impl.ui.return_deposit.summary.a aVar11 = (com.revolut.retail.feature.crypto_deposits.impl.ui.return_deposit.summary.a) obj3;
                    fbj.a aVar12 = aVar11.f100132r;
                    ReturnCryptoDepositSummaryScreenContract$InputData returnCryptoDepositSummaryScreenContract$InputData = aVar11.f100131q;
                    efm.b bVarG = aVar12.g(returnCryptoDepositSummaryScreenContract$InputData.f100127b.f272581b, returnCryptoDepositSummaryScreenContract$InputData.f100128c.f71059a);
                    this.v = 1;
                    if (nim.a.a(bVarG, this) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 7:
                Object obj4 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    yhm.o.b(obj2);
                    bd3.a aVar13 = ((jd3.h) obj3).f172963s;
                    this.v = 1;
                    gd3.k kVar = (gd3.k) aVar13.f14524b;
                    kVar.getClass();
                    fo1.b0 b0Var2 = new fo1.b0(kVar, continuation, 27);
                    p0 p0Var2 = p0.f264001a;
                    Object objJ2 = e0.J(elm.f.f127540b, b0Var2, this);
                    if (objJ2 != obj4) {
                        objJ2 = Unit.f186387a;
                    }
                    if (objJ2 != obj4) {
                        objJ2 = Unit.f186387a;
                    }
                    if (objJ2 == obj4) {
                        return obj4;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 8:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    yhm.o.b(obj2);
                    gdk.a aVar15 = ((com.revolut.retail.feature.plan_rewards.impl.presentation.list.flow.c) obj3).f102565q;
                    this.v = 1;
                    if (((gdk.c) aVar15).a(this) == aVar14) {
                        return aVar14;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 9:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 != 0) {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                this.v = 1;
                Object objB2 = nim.a.b((ufm.n) obj3, this);
                return objB2 == aVar16 ? aVar16 : objB2;
            case 10:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 != 0) {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                jfb.h0 h0VarF3 = ((ReverywhereWebAppScreen) obj3).f3();
                this.v = 1;
                Object objI2 = ((com.revolut.feature.retail.reverywhere.impl.web_app.d) h0VarF3).I2(this);
                return objI2 == aVar17 ? aVar17 : objI2;
            case 11:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 == 0) {
                    yhm.o.b(obj2);
                    efm.b bVarL0 = ((com.revolut.feature.credit.autopay.ui.screen.amount.input.b) obj3).o.l0(false);
                    this.v = 1;
                    if (nim.a.a(bVarL0, this) == aVar18) {
                        return aVar18;
                    }
                } else {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 12:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 == 0) {
                    yhm.o.b(obj2);
                    q qVar = (q) obj3;
                    al4.n nVar = qVar.f178592p;
                    String str3 = qVar.o.f69594a;
                    this.v = 1;
                    if (((x2) nVar).L(str3, this) == aVar19) {
                        return aVar19;
                    }
                } else {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 13:
                com.revolut.feature.apm.core.code.ui.a aVar20 = (com.revolut.feature.apm.core.code.ui.a) obj3;
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 == 0) {
                    yhm.o.b(obj2);
                    hx1.a aVar22 = aVar20.f61837p;
                    ApmCodeData apmCodeData = aVar20.o.f61836c;
                    this.v = 1;
                    if (aVar22.a(apmCodeData, this) == aVar21) {
                        return aVar21;
                    }
                } else {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                a2 a2Var = aVar20.f61839r;
                if (a2Var != null) {
                    a2Var.f(null);
                }
                aVar20.I2();
                return Unit.f186387a;
            case 14:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 == 0) {
                    yhm.o.b(obj2);
                    g09.i iVar = ((k09.g) obj3).f179993l;
                    v domain = v.CRYPTO;
                    iVar.getClass();
                    Intrinsics.checkNotNullParameter(domain, "domain");
                    pfm.h hVar = new pfm.h(new f0d.m(iVar, domain, 18), 2);
                    Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                    this.v = 1;
                    if (nim.a.a(hVar, this) == aVar23) {
                        return aVar23;
                    }
                } else {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 15:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 != 0) {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                d12.b bVar3 = ((k22.f) obj3).o;
                this.v = 1;
                Object objB3 = bVar3.b(this);
                return objB3 == aVar24 ? aVar24 : objB3;
            case 16:
                com.revolut.feature.shared.help_centre.impl.faq.screens.list.b bVar4 = (com.revolut.feature.shared.help_centre.impl.faq.screens.list.b) obj3;
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 == 0) {
                    yhm.o.b(obj2);
                    String strA2 = com.revolut.feature.shared.help_centre.impl.faq.screens.list.b.A2(bVar4.f86277t);
                    if (strA2 == null) {
                        SharedFaqDestination.StartPoint.Search search = new SharedFaqDestination.StartPoint.Search(null);
                        TransitionAnimation.FADE fade = TransitionAnimation.FADE.f98392a;
                        bVar4.C1(new SharedFaqDestination((SharedFaqDestination.StartPoint) search, (SharedFaqDestination.PassthroughData) null, false, 10));
                        return Unit.f186387a;
                    }
                    zfd.e eVarW = zi0.c.w(bVar4.f86275r.r(strA2));
                    this.v = 1;
                    objZ = vkm.q.z(eVarW, this);
                    if (objZ == aVar25) {
                        return aVar25;
                    }
                } else {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objZ = obj2;
                }
                Data data = (Data) objZ;
                List list = data != null ? (List) data.getContent() : null;
                SharedFaqDestination.StartPoint.Search search2 = new SharedFaqDestination.StartPoint.Search((list == null || (faqMetaData = (FaqMetaData) d0.d0(list)) == null) ? null : faqMetaData.f51419a);
                TransitionAnimation.FADE fade2 = TransitionAnimation.FADE.f98392a;
                bVar4.C1(new SharedFaqDestination((SharedFaqDestination.StartPoint) search2, (SharedFaqDestination.PassthroughData) null, false, 10));
                return Unit.f186387a;
            case 17:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 != 0) {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                k9e.i iVar2 = (k9e.i) obj3;
                k9e.h hVar2 = new k9e.h(iVar2, null);
                this.v = 1;
                Object objP2 = iVar2.p2(this, hVar2);
                return objP2 == aVar26 ? aVar26 : objP2;
            case 18:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 != 0) {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                ka4.q qVar2 = (ka4.q) obj3;
                o7.b bVar5 = qVar2.f182430p;
                h1 h1VarF2 = w0.F(qVar2.o.f67616a);
                this.v = 1;
                gm6.j jVar = new gm6.j((r10.a) bVar5.f222639b, h1VarF2, continuation, 24);
                p0 p0Var3 = p0.f264001a;
                Object objJ3 = e0.J(elm.f.f127540b, jVar, this);
                return objJ3 == aVar27 ? aVar27 : objJ3;
            case 19:
                kaf.g gVar = (kaf.g) obj3;
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 == 0) {
                    yhm.o.b(obj2);
                    kaf.a aVar29 = (kaf.a) ((j2) gVar.f182490r.f22677a).getValue();
                    o9f.c cVar = gVar.f182489q;
                    TransferCreateRequest transferCreateRequest = new TransferCreateRequest(u8f.d.IN, aVar29.f182480a, aVar29.f182481b, aVar29.f182482c);
                    String str4 = gVar.o.d;
                    this.v = 1;
                    if (cVar.a(transferCreateRequest, str4, this) == aVar28) {
                        return aVar28;
                    }
                } else {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 20:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 != 0) {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                kc9.m mVar2 = (kc9.m) obj3;
                o99.a aVar31 = mVar2.o;
                WaitingAuthScreenContract$InputData waitingAuthScreenContract$InputData = mVar2.f182681p;
                ufm.n nVarD = aVar31.d(waitingAuthScreenContract$InputData.f78529b, waitingAuthScreenContract$InputData.f78530c, null);
                this.v = 1;
                Object objB4 = nim.a.b(nVarD, this);
                return objB4 == aVar30 ? aVar30 : objB4;
            case 21:
                ke2.q qVar3 = (ke2.q) obj3;
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.apm.swish.impl.domain.a aVar33 = qVar3.f182965p;
                    this.v = 1;
                    objD = ((iz1.h) aVar33.f62908a).d(dx1.g.f120517a, null, this);
                    if (objD == aVar32) {
                        return aVar32;
                    }
                } else {
                    if (i106 != 1) {
                        if (i106 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                    objD = obj2;
                }
                i02.h hVar3 = (i02.h) objD;
                if (Intrinsics.f(hVar3, i02.f.f157280a)) {
                    qVar3.C2(ke2.f.f182958a);
                } else {
                    if (!Intrinsics.f(hVar3, i02.g.f157281a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.v = 2;
                    if (ke2.q.I2(qVar3, this) == aVar32) {
                        return aVar32;
                    }
                }
                return Unit.f186387a;
            case 22:
                com.revolut.feature.checkout.impl.resume.flow.a aVar34 = (com.revolut.feature.checkout.impl.resume.flow.a) obj3;
                ResumeCheckoutFlowContract$InputData resumeCheckoutFlowContract$InputData = aVar34.o;
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 == 0) {
                    yhm.o.b(obj2);
                    ufm.i iVarB = sh3.a.b(aVar34.f65838p, resumeCheckoutFlowContract$InputData.f65834a.getF65845b(), resumeCheckoutFlowContract$InputData.d);
                    this.v = 1;
                    objB = nim.a.b(iVarB, this);
                    if (objB == aVar35) {
                        return aVar35;
                    }
                } else {
                    if (i107 != 1) {
                        if (i107 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                    objB = obj2;
                }
                CheckoutOrder checkoutOrder = (CheckoutOrder) objB;
                Intrinsics.h(checkoutOrder);
                this.v = 2;
                if (com.revolut.feature.checkout.impl.resume.flow.a.I2(aVar34, checkoutOrder, this) == aVar35) {
                    return aVar35;
                }
                return Unit.f186387a;
            case 23:
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (com.revolut.feature.product.lifecycle.flow.a.I2((com.revolut.feature.product.lifecycle.flow.a) obj3, this) == aVar36) {
                        return aVar36;
                    }
                } else {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 24:
                fim.a aVar37 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 != 0) {
                    if (i109 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                PricingPlanOffersService pricingPlanOffersService = ((kjk.o) obj3).f184459a;
                u3 u3Var = new u3();
                this.v = 1;
                Object objPostPromoOffer = pricingPlanOffersService.postPromoOffer(u3Var, this);
                return objPostPromoOffer == aVar37 ? aVar37 : objPostPromoOffer;
            case 25:
                fim.a aVar38 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 != 0) {
                    if (i110 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                kk8.k kVar2 = ((kk8.o) obj3).f184520a;
                this.v = 1;
                Object objA2 = kVar2.a(this);
                return objA2 == aVar38 ? aVar38 : objA2;
            case 26:
                y0 y0Var = (y0) obj3;
                fim.a aVar39 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 == 0) {
                    yhm.o.b(obj2);
                    y0Var.f185608a.k();
                    fbj.a aVar40 = y0Var.f185609b;
                    this.v = 1;
                    if (aVar40.e(this) == aVar39) {
                        return aVar39;
                    }
                } else {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 27:
                kvk.o oVar = (kvk.o) obj3;
                StockFinancialsControllerContract$InputData stockFinancialsControllerContract$InputData = oVar.o;
                qrk.b bVar6 = oVar.f190152r;
                fim.a aVar41 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 == 0) {
                    yhm.o.b(obj2);
                    String str5 = stockFinancialsControllerContract$InputData.f103960a;
                    uqk.e eVar = uqk.e.QUARTERLY;
                    this.v = 1;
                    if (bVar6.c(str5, eVar, this) == aVar41) {
                        return aVar41;
                    }
                } else {
                    if (i112 != 1) {
                        if (i112 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                String str6 = stockFinancialsControllerContract$InputData.f103960a;
                uqk.e eVar2 = uqk.e.ANNUALLY;
                this.v = 2;
                if (bVar6.c(str6, eVar2, this) == aVar41) {
                    return aVar41;
                }
                return Unit.f186387a;
            case 28:
                fim.a aVar42 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.v;
                if (i113 == 0) {
                    yhm.o.b(obj2);
                    al4.q qVar4 = ((u) obj3).f191653s;
                    this.v = 1;
                    if (al4.q.a(qVar4, this) == aVar42) {
                        return aVar42;
                    }
                } else {
                    if (i113 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar43 = fim.a.COROUTINE_SUSPENDED;
                int i114 = this.v;
                if (i114 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_multiplier_spare_change.a aVar44 = (com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_multiplier_spare_change.a) obj3;
                    l2c.o oVar2 = new l2c.o(aVar44, null);
                    this.v = 1;
                    if (u0.b0(aVar44.X(), "SPARE_CHANGE_FM_DEACTIVATE_BUTTON_TAG", oVar2, this) == aVar43) {
                        return aVar43;
                    }
                } else {
                    if (i114 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
