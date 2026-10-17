package com.revolut.feature.credit.card.impl.ui.details;

import al4.n;
import al4.o;
import al4.p;
import al4.q;
import an4.e;
import b9k.f;
import bhi.c;
import bq5.o0;
import br4.b0;
import br4.c0;
import br4.e0;
import br4.f0;
import br4.g;
import br4.i0;
import br4.m;
import br4.r;
import br4.s;
import br4.u;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.card_order_new.api.CardOrderNewFeatureConfig;
import com.revolut.feature.card_order_new.api.SelectedTab;
import com.revolut.feature.credit.card.api.CreditCardApi$Toggles$CreditCardBeDrivenInfoSection;
import com.revolut.feature.credit.card.api.models.credit_limit_increase.CreditLimitIncreaseStatus;
import com.revolut.feature.credit.card.api.models.presentation.CreditCardModelParcel;
import com.revolut.feature.credit.card.api.navigation.CreditCardCancellationDestination;
import com.revolut.feature.credit.card.api.navigation.CreditCardDescriptionDestination;
import com.revolut.feature.credit.card.api.navigation.CreditCardKompotFeatureConfig;
import com.revolut.feature.credit.card.api.navigation.CreditCardLimitCapDestination;
import com.revolut.feature.credit.card.impl.ui.details.CreditCardDetailsScreenContract$ModalStep;
import com.revolut.feature.credit.card.models.CreditCard;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayPayment;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ll4.a0;
import lt4.d;
import n14.k;
import nr4.b;
import oki.h;
import om4.e3;
import om4.h3;
import om4.s3;
import om4.x2;
import om4.y3;
import org.jetbrains.annotations.NotNull;
import skm.a2;
import vkm.j2;
import w4l.i;
import w4l.j;
import xq3.t;
import yhm.m;
import yji.l;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends h implements u {

    @NotNull
    public static final c0 Companion = new c0();
    public final h3 A;
    public final p B;
    public final o C;
    public final d D;
    public final f E;
    public final lal.a F;
    public final b G;
    public final ajk.f H;
    public final vt4.a I;
    public final lb5.b J;
    public a2 K;
    public final y L;
    public final com.revolut.kompot.navigable.vc.modal.a M;
    public final CreditCardDetailsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n f69244p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e3 f69245q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final q f69246r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final mt8.d f69247s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ang.f f69248t;
    public final t u;
    public final e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final pm4.e f69249w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final f15.a f69250x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ra5.b f69251y;
    public final gte.a z;

    public a(CreditCardDetailsScreenContract$InputData inputData, n creditCardInteractor, e3 creditCardLimitsInfoInteractor, q creditCardProductInteractor, mt8.d kycInteractor, ang.f userInteractor, t creditLimitIncreaseApplicationInteractor, e navigationFactory, pm4.e dialogMapper, f15.a getCreditHelpExtension, ra5.b creditPostTerminationPlanInteractor, gte.a featureToggleInteractor, h3 creditCardMsiInteractor, p creditCardProductFeatureToggleInteractor, o creditCardLimitIncreaseInteractor, d creditCardDialogModelMapper, f creditCardDetailsSectionsProvider, lal.a creditCardInfoSectionsInteractor, b creditCardDisplayAmountToggleInteractor, ajk.f pricingPlanNavigationCommandsProvider, vt4.a creditCardBottomSheetMapper, lb5.b autopayInteractor, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditCardInteractor, "creditCardInteractor");
        Intrinsics.checkNotNullParameter(creditCardLimitsInfoInteractor, "creditCardLimitsInfoInteractor");
        Intrinsics.checkNotNullParameter(creditCardProductInteractor, "creditCardProductInteractor");
        Intrinsics.checkNotNullParameter(kycInteractor, "kycInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(creditLimitIncreaseApplicationInteractor, "creditLimitIncreaseApplicationInteractor");
        Intrinsics.checkNotNullParameter(navigationFactory, "navigationFactory");
        Intrinsics.checkNotNullParameter(dialogMapper, "dialogMapper");
        Intrinsics.checkNotNullParameter(getCreditHelpExtension, "getCreditHelpExtension");
        Intrinsics.checkNotNullParameter(creditPostTerminationPlanInteractor, "creditPostTerminationPlanInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(creditCardMsiInteractor, "creditCardMsiInteractor");
        Intrinsics.checkNotNullParameter(creditCardProductFeatureToggleInteractor, "creditCardProductFeatureToggleInteractor");
        Intrinsics.checkNotNullParameter(creditCardLimitIncreaseInteractor, "creditCardLimitIncreaseInteractor");
        Intrinsics.checkNotNullParameter(creditCardDialogModelMapper, "creditCardDialogModelMapper");
        Intrinsics.checkNotNullParameter(creditCardDetailsSectionsProvider, "creditCardDetailsSectionsProvider");
        Intrinsics.checkNotNullParameter(creditCardInfoSectionsInteractor, "creditCardInfoSectionsInteractor");
        Intrinsics.checkNotNullParameter(creditCardDisplayAmountToggleInteractor, "creditCardDisplayAmountToggleInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanNavigationCommandsProvider, "pricingPlanNavigationCommandsProvider");
        Intrinsics.checkNotNullParameter(creditCardBottomSheetMapper, "creditCardBottomSheetMapper");
        Intrinsics.checkNotNullParameter(autopayInteractor, "autopayInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f69244p = creditCardInteractor;
        this.f69245q = creditCardLimitsInfoInteractor;
        this.f69246r = creditCardProductInteractor;
        this.f69247s = kycInteractor;
        this.f69248t = userInteractor;
        this.u = creditLimitIncreaseApplicationInteractor;
        this.v = navigationFactory;
        this.f69249w = dialogMapper;
        this.f69250x = getCreditHelpExtension;
        this.f69251y = creditPostTerminationPlanInteractor;
        this.z = featureToggleInteractor;
        this.A = creditCardMsiInteractor;
        this.B = creditCardProductFeatureToggleInteractor;
        this.C = creditCardLimitIncreaseInteractor;
        this.D = creditCardDialogModelMapper;
        this.E = creditCardDetailsSectionsProvider;
        this.F = creditCardInfoSectionsInteractor;
        this.G = creditCardDisplayAmountToggleInteractor;
        this.H = pricingPlanNavigationCommandsProvider;
        this.I = creditCardBottomSheetMapper;
        this.J = autopayInteractor;
        this.L = mra.d.b(this, new m(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.M = hx7.e.a(this, new c(this, 18));
    }

    @Override // yji.l
    public final void I1() {
        if (!((jte.d) this.z).c(CreditCardApi$Toggles$CreditCardBeDrivenInfoSection.f68676c)) {
            L2();
            return;
        }
        String str = this.o.f69221a;
        x2 x2Var = (x2) this.f69244p;
        w4l.h hVar = w4l.h.f294642c;
        l.a1(this, rd0.e.n(nim.a.v(nim.a.u(new a2c.c(2, 15, null), u0.m(u0.i(x2Var.h(str, hVar), nim.a.v(this.f69248t.j(j.f294644c), i0.f), this.E.r(str, i.f294643c)), u0.m(nim.a.A(nim.a.v(this.F.A(str), new o0(15)), new o0(16)), ((yb5.e) this.J).b(str, hVar)))), new o0(17)), h0.f322473a), null, null, new br4.h0(this, null, 0), 3);
    }

    public final br4.l I2() {
        return (br4.l) zi0.c.I(((m) ((j2) this.L.f22677a).getValue()).f17911a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final boolean J2(Object obj2) {
        Object objA;
        Object objA2;
        boolean z = obj2 instanceof ux4.d;
        e eVar = this.v;
        if (z) {
            ux4.d dVar = (ux4.d) obj2;
            String str = dVar.d;
            String str2 = dVar.f283867c;
            eVar.getClass();
            C1(e.b(str, str2));
            return true;
        }
        if (obj2 instanceof rm4.b) {
            String str3 = ((rm4.b) obj2).f255203a;
            eVar.getClass();
            C1(e.c(str3));
            return true;
        }
        if (obj2 instanceof er4.e) {
            er4.e eVar2 = (er4.e) obj2;
            a0 promotionalPeriod = eVar2.f128535a;
            wi0.b countryCode = eVar2.f128536b;
            eVar.getClass();
            Intrinsics.checkNotNullParameter(promotionalPeriod, "promotionalPeriod");
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            C1(new BridgeDestination(new FeatureCommand(new CreditCardKompotFeatureConfig.Description(new CreditCardDescriptionDestination.DescriptionConfig.Local.PromotionalBalancePeriod(promotionalPeriod.f196502a, promotionalPeriod.f196503b, promotionalPeriod.f196504c, countryCode, (int) promotionalPeriod.f, (int) promotionalPeriod.e, promotionalPeriod.d)))));
            return true;
        }
        boolean z3 = obj2 instanceof br4.c;
        ModalDestination.Style.POPUP popup = ModalDestination.Style.POPUP.f98311a;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        com.revolut.kompot.navigable.vc.modal.a aVar = this.M;
        if (z3) {
            br4.c cVar = (br4.c) obj2;
            if (cVar instanceof br4.a) {
                br4.a aVar2 = (br4.a) cVar;
                h.v2(aVar, new CreditCardDetailsScreenContract$ModalStep.CreditLimitDecrease(aVar2.f17875a, aVar2.f17876b, aVar2.f17877c), popup);
                return true;
            }
            if (!(cVar instanceof br4.b)) {
                throw new NoWhenBranchMatchedException();
            }
            h.v2(aVar, CreditCardDetailsScreenContract$ModalStep.CreditLimitDecreaseIneligible.f69228a, bottom_dialog);
            return true;
        }
        if (obj2 instanceof dl4.a) {
            if (((dl4.a) obj2).f115699b == null) {
                h.v2(aVar, CreditCardDetailsScreenContract$ModalStep.NothingToRepay.f69235a, bottom_dialog);
                return true;
            }
            C2(r.f17920a);
            return true;
        }
        if (obj2 instanceof CreditCardModelParcel.DialogParcel) {
            h.v2(aVar, new CreditCardDetailsScreenContract$ModalStep.Dialog(((CreditCardModelParcel.DialogParcel) obj2).f68855a), bottom_dialog);
            return true;
        }
        if (!(obj2 instanceof dx4.l)) {
            return false;
        }
        dx4.l lVar = (dx4.l) obj2;
        if (lVar instanceof dx4.a) {
            g gVar = br4.h.Companion;
            String str4 = ((dx4.a) lVar).f120542a;
            gVar.getClass();
            br4.h hVar = (br4.h) br4.h.actionById.get(str4);
            if (hVar != null) {
                int i = e0.f17890a[hVar.ordinal()];
                CreditCardDetailsScreenContract$InputData creditCardDetailsScreenContract$InputData = this.o;
                switch (i) {
                    case -1:
                        break;
                    case 0:
                    default:
                        throw new NoWhenBranchMatchedException();
                    case 1:
                        String facilityId = creditCardDetailsScreenContract$InputData.f69221a;
                        pl4.a type = pl4.a.PROMOTIONAL_PERIOD;
                        eVar.getClass();
                        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                        Intrinsics.checkNotNullParameter(type, "type");
                        C1(new BridgeDestination(new FeatureCommand(new CreditCardKompotFeatureConfig.Description(new CreditCardDescriptionDestination.DescriptionConfig.Remote(facilityId, type)))));
                        break;
                    case 2:
                        C2(br4.o.f17917a);
                        break;
                    case 3:
                        N2();
                        break;
                    case 4:
                        C1(new CreditCardCancellationDestination(creditCardDetailsScreenContract$InputData.f69221a));
                        break;
                    case 5:
                        C2(new s(I2().a().f69802q.contains(yw4.f.IN_APP_STATEMENT)));
                        break;
                    case 6:
                        try {
                            m.Companion companion = yhm.m.INSTANCE;
                            List list = ((br4.i) I2()).f17897c.d;
                            ArrayList arrayList = new ArrayList();
                            for (Object obj3 : list) {
                                if (obj3 instanceof CreditCardAutopayPayment.AutoPayment) {
                                    arrayList.add(obj3);
                                }
                            }
                            C2(new br4.n(!arrayList.isEmpty()));
                            objA2 = Unit.f186387a;
                        } catch (CancellationException e) {
                            throw e;
                        } catch (Throwable th10) {
                            m.Companion companion2 = yhm.m.INSTANCE;
                            objA2 = yhm.o.a(th10);
                        }
                        Throwable thA = yhm.m.a(objA2);
                        if (thA != null) {
                            hx7.e.n(thA);
                        }
                        break;
                    case 7:
                        h.v2(aVar, CreditCardDetailsScreenContract$ModalStep.DueDate.f69231a, popup);
                        break;
                    case 8:
                        h.v2(aVar, CreditCardDetailsScreenContract$ModalStep.DisplayAmount.f69230a, popup);
                        break;
                    case 9:
                        C1(u0.b(this.H.b()));
                        break;
                    case 10:
                        try {
                            m.Companion companion3 = yhm.m.INSTANCE;
                            if (((br4.i) I2()).f17896b > 0) {
                                h.v2(aVar, CreditCardDetailsScreenContract$ModalStep.CreditCards.f69224a, bottom_dialog);
                            } else {
                                K2();
                            }
                            objA = Unit.f186387a;
                        } catch (CancellationException e2) {
                            throw e2;
                        } catch (Throwable th11) {
                            m.Companion companion4 = yhm.m.INSTANCE;
                            objA = yhm.o.a(th11);
                        }
                        Throwable thA2 = yhm.m.a(objA);
                        if (thA2 != null) {
                            hx7.e.n(thA2);
                        }
                        break;
                    case 11:
                        C2(br4.q.f17919a);
                        break;
                }
            }
        }
        return true;
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.M;
    }

    public final void K2() {
        C1(u0.c(new CardOrderNewFeatureConfig(SelectedTab.CREDIT, null, null, null, null, false, null, null, null, null, null, null, 16378)));
    }

    public final void L2() {
        a2 a2Var = this.K;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        CreditCardDetailsScreenContract$InputData creditCardDetailsScreenContract$InputData = this.o;
        String str = creditCardDetailsScreenContract$InputData.f69221a;
        String str2 = creditCardDetailsScreenContract$InputData.f69221a;
        x2 x2Var = (x2) this.f69244p;
        w4l.h hVar = w4l.h.f294642c;
        akg.n nVarJ = u0.j(u0.i(x2Var.h(str, hVar), x2Var.d(str2), ((qt8.d) this.f69247s).e(false)), u0.i(this.F.A(str2), nim.a.v(this.f69248t.j(j.f294644c), i0.f), x2Var.E(str2, hVar)), u0.i(nim.a.v(u0.i(rd0.e.b(k.q(this.u.b(), new o0(12))), k.p(x2Var.o(str2, i.f294643c), new o0(11)), boh.f.e(((s3) this.B).u(), new b0(this, 1))), new o0(9)), boh.f.e(((y3) this.f69246r).f(str2, hVar), new b0(this, 3)), this.f69245q.b(str2, hVar)), u0.m(k.p(ngm.n.K(new f0(this, null, 2)), new o0(10)), this.E.r(str2, hVar)));
        int i = 2;
        this.K = l.a1(this, rd0.e.n(nim.a.v(nim.a.u(new a2c.c(i, 16, continuation), nVarJ), new b0(this, i)), h0.f322473a), null, null, new br4.h0(this, null, 1), 3);
    }

    public final void M2() {
        br4.k kVar = (br4.k) I2();
        CreditCard creditCard = kVar.f17900a;
        wi0.b bVar = kVar.e;
        um4.a aVar = kVar.i;
        boolean z = aVar.e;
        e eVar = this.v;
        if (z && !aVar.f281227j) {
            String str = creditCard.f69792a;
            eVar.getClass();
            C1(e.a(aVar, bVar, str));
        } else {
            if (kVar.f17906l) {
                C1(new CreditCardLimitCapDestination(null, this.o.f69221a, false));
                return;
            }
            CreditLimitIncreaseStatus creditLimitIncreaseStatus = kVar.f17908n;
            creditLimitIncreaseStatus.getClass();
            if (creditLimitIncreaseStatus instanceof CreditLimitIncreaseStatus.Unavailable) {
                String str2 = creditCard.f69792a;
                eVar.getClass();
                C1(e.a(aVar, bVar, str2));
            } else {
                h.v2(this.M, CreditCardDetailsScreenContract$ModalStep.CreditCardLimits.f69223a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
            }
        }
    }

    public final void N2() {
        ux4.i iVar = ux4.m.Companion;
        String str = this.o.f69221a;
        wi0.b countryCode = I2().getCountryCode();
        f15.a aVar = this.f69250x;
        ux4.l lVarA1 = aVar.a1(countryCode);
        iVar.getClass();
        aVar.O(ux4.i.a(str, lVarA1));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.L;
    }
}
