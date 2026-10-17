package com.revolut.feature.card_order_new.impl.kompot;

import c23.d;
import c23.q;
import c93.j;
import ce9.m;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.address.common.api.flow.FieldMode;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.card_design.api.CardDesignCatalogueDestination;
import com.revolut.feature.card_management.api.cardagreements.CardIssuanceAgreementControllerContract$InputData;
import com.revolut.feature.card_order_new.common.setpin.kompot.SetPinController;
import com.revolut.feature.card_order_new.common.setpin.kompot.SetPinScreenContract$InputData;
import com.revolut.feature.card_order_new.impl.kompot.CardOrderFlowContract$InputData;
import com.revolut.feature.card_order_new.impl.kompot.CardOrderFlowContract$Step;
import com.revolut.feature.card_order_new.impl.kompot.screen.address_form.AddressFormController;
import com.revolut.feature.card_order_new.impl.kompot.screen.address_form.AddressFormScreenContract$InputData;
import com.revolut.feature.card_order_new.impl.kompot.screen.address_verification.CardDeliveryAddressVerificationController;
import com.revolut.feature.card_order_new.impl.kompot.screen.address_verification.CardDeliveryAddressVerificationScreenContract$InputData;
import com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.CardPersonalisationController;
import com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.CardPersonalisationControllerContract$InputData;
import com.revolut.feature.card_order_new.impl.kompot.screen.delivery_methods.DeliveryMethodsController;
import com.revolut.feature.card_order_new.impl.kompot.screen.delivery_methods.DeliveryMethodsScreenContract$InputData;
import com.revolut.feature.card_order_new.impl.kompot.screen.extra_security.CardExtraSecurityController;
import com.revolut.feature.card_order_new.impl.kompot.screen.extra_security.CardExtraSecurityControllerContract$InputData;
import com.revolut.feature.cards_core.R$string;
import com.revolut.feature.freelancer.api.ui.controller.contract.FreelancerCashbackUpsellContract$InputData;
import com.revolut.feature.freelancer.impl.ui.cashback.screen.upsell.FreelancerCashbackUpsellScreen;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.tracking.v3.CardsOrderContext;
import dki.g;
import e93.n;
import ffk.t;
import gim.i;
import h93.j0;
import h93.l0;
import hy2.f;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import org.jetbrains.annotations.NotNull;
import s33.e;
import sf0.h;
import wp5.y;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends g implements d {

    @NotNull
    public static final c23.g Companion = new c23.g();
    public final f A;
    public final t B;
    public final e C;
    public final q89.e D;
    public final l33.a E;
    public final h F;
    public final v60.e G;
    public final q13.d H;
    public final l93.e I;
    public final m33.c J;
    public final gte.a K;
    public final jla.h L;
    public final j60.a M;
    public final ang.f N;
    public final CardOrderFlowContract$Step O;
    public final CardOrderFlowContract$State P;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final c23.b f65085t;
    public final qh3.c u;
    public final o13.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final f73.c f65086w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final t13.a f65087x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final gr6.h f65088y;
    public final zt6.b z;

    public c(CardOrderFlowContract$InputData inputData, i90.b uuidUtils, c23.b checkoutParamsProvider, qh3.c checkoutControllerExtension, o13.c deliveryMethodsInteractor, f73.c cardsNavigationFactory, t13.a deliveryInteractor, gr6.h freelancerCashbackInteractor, zt6.b freelancerControllerProvider, f cardDesignInteractor, t pricingPlanInteractor, u13.g deliveryRepository, e pricingRepository, q89.e onboardingInteractor, l33.a planCancellationDialogProvider, h serverErrorParser, v60.e serverErrorsProvider, q13.d deliveryAddressInteractor, l93.e changeAddressAllowanceInteractor, m33.c deliveryMethodsAvailabilityChecker, gte.a featureToggleInteractor, jla.h productCatalogueInteractor, j60.a bottomDialogExtension, ang.f userInteractor) {
        CardOrderFlowContract$Step cardPersonalisation;
        CardOrderFlowContract$State cardOrderFlowContract$State;
        CardOrderFlowContract$State cardOrderFlowContract$State2;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(uuidUtils, "uuidUtils");
        Intrinsics.checkNotNullParameter(checkoutParamsProvider, "checkoutParamsProvider");
        Intrinsics.checkNotNullParameter(checkoutControllerExtension, "checkoutControllerExtension");
        Intrinsics.checkNotNullParameter(deliveryMethodsInteractor, "deliveryMethodsInteractor");
        Intrinsics.checkNotNullParameter(cardsNavigationFactory, "cardsNavigationFactory");
        Intrinsics.checkNotNullParameter(deliveryInteractor, "deliveryInteractor");
        Intrinsics.checkNotNullParameter(freelancerCashbackInteractor, "freelancerCashbackInteractor");
        Intrinsics.checkNotNullParameter(freelancerControllerProvider, "freelancerControllerProvider");
        Intrinsics.checkNotNullParameter(cardDesignInteractor, "cardDesignInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(deliveryRepository, "deliveryRepository");
        Intrinsics.checkNotNullParameter(pricingRepository, "pricingRepository");
        Intrinsics.checkNotNullParameter(onboardingInteractor, "onboardingInteractor");
        Intrinsics.checkNotNullParameter(planCancellationDialogProvider, "planCancellationDialogProvider");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
        Intrinsics.checkNotNullParameter(deliveryAddressInteractor, "deliveryAddressInteractor");
        Intrinsics.checkNotNullParameter(changeAddressAllowanceInteractor, "changeAddressAllowanceInteractor");
        Intrinsics.checkNotNullParameter(deliveryMethodsAvailabilityChecker, "deliveryMethodsAvailabilityChecker");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f65085t = checkoutParamsProvider;
        this.u = checkoutControllerExtension;
        this.v = deliveryMethodsInteractor;
        this.f65086w = cardsNavigationFactory;
        this.f65087x = deliveryInteractor;
        this.f65088y = freelancerCashbackInteractor;
        this.z = freelancerControllerProvider;
        this.A = cardDesignInteractor;
        this.B = pricingPlanInteractor;
        this.C = pricingRepository;
        this.D = onboardingInteractor;
        this.E = planCancellationDialogProvider;
        this.F = serverErrorParser;
        this.G = serverErrorsProvider;
        this.H = deliveryAddressInteractor;
        this.I = changeAddressAllowanceInteractor;
        this.J = deliveryMethodsAvailabilityChecker;
        this.K = featureToggleInteractor;
        this.L = productCatalogueInteractor;
        this.M = bottomDialogExtension;
        this.N = userInteractor;
        boolean z = inputData instanceof CardOrderFlowContract$InputData.CardDelivery;
        if (z) {
            cardPersonalisation = U2(((CardOrderFlowContract$InputData.CardDelivery) inputData).f65027a);
        } else if (inputData instanceof CardOrderFlowContract$InputData.ChangeDeliveryAddress) {
            cardPersonalisation = new CardOrderFlowContract$Step.ChangeDeliveryAddress(((CardOrderFlowContract$InputData.ChangeDeliveryAddress) inputData).f65047a);
        } else {
            if (!(inputData instanceof CardOrderFlowContract$InputData.CardPersonalisation)) {
                throw new NoWhenBranchMatchedException();
            }
            CardOrderFlowContract$InputData.CardPersonalisation cardPersonalisation2 = (CardOrderFlowContract$InputData.CardPersonalisation) inputData;
            cardPersonalisation = new CardOrderFlowContract$Step.CardPersonalisation(cardPersonalisation2.d, cardPersonalisation2.f65038a, cardPersonalisation2.f65039b, cardPersonalisation2.f65040c);
        }
        this.O = cardPersonalisation;
        if (z) {
            CardOrderFlowContract$InputData.CardDelivery cardDelivery = (CardOrderFlowContract$InputData.CardDelivery) inputData;
            cardOrderFlowContract$State2 = new CardOrderFlowContract$State(cardDelivery.f65027a, cardDelivery.f65028b, cardDelivery.f65029c, cardDelivery.d, cardDelivery.e, cardDelivery.f, cardDelivery.f65030g, cardDelivery.f65031h, cardDelivery.i, cardDelivery.f65032j, y.u(uuidUtils, "toString(...)"), cardDelivery.k, cardDelivery.f65033l, cardDelivery.f65034m, cardDelivery.f65035n, cardDelivery.o, cardDelivery.f65036p, cardDelivery.f65037q, 6490112);
        } else {
            if (inputData instanceof CardOrderFlowContract$InputData.ChangeDeliveryAddress) {
                CardOrderFlowContract$InputData.ChangeDeliveryAddress changeDeliveryAddress = (CardOrderFlowContract$InputData.ChangeDeliveryAddress) inputData;
                cardOrderFlowContract$State = new CardOrderFlowContract$State(null, null, null, changeDeliveryAddress.f65048b, null, null, null, null, null, changeDeliveryAddress.f65049c, y.u(uuidUtils, "toString(...)"), null, null, null, null, null, null, null, 16772598);
            } else {
                if (!(inputData instanceof CardOrderFlowContract$InputData.CardPersonalisation)) {
                    throw new NoWhenBranchMatchedException();
                }
                CardOrderFlowContract$InputData.CardPersonalisation cardPersonalisation3 = (CardOrderFlowContract$InputData.CardPersonalisation) inputData;
                cardOrderFlowContract$State = new CardOrderFlowContract$State(cardPersonalisation3.d, null, cardPersonalisation3.e, null, cardPersonalisation3.f, cardPersonalisation3.f65041g, cardPersonalisation3.f65042h, null, cardPersonalisation3.i, cardPersonalisation3.f65043j, y.u(uuidUtils, "toString(...)"), cardPersonalisation3.k, cardPersonalisation3.f65044l, null, cardPersonalisation3.f65045m, null, null, cardPersonalisation3.f65046n, 8095744);
            }
            cardOrderFlowContract$State2 = cardOrderFlowContract$State;
        }
        this.P = cardOrderFlowContract$State2;
    }

    public static final Object O2(c cVar, i iVar) {
        c23.b bVar = cVar.f65085t;
        c93.b bVar2 = ((CardOrderFlowContract$State) cVar.A2().f98429a).f65050a;
        if (bVar2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        e93.f fVar = bVar2.f22270b;
        String str = ((CardOrderFlowContract$State) cVar.A2().f98429a).k;
        if (str == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Address address = ((CardOrderFlowContract$State) cVar.A2().f98429a).d;
        if (address == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        d93.b bVar3 = ((CardOrderFlowContract$State) cVar.A2().f98429a).f65056l;
        if (bVar3 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        j jVar = ((CardOrderFlowContract$State) cVar.A2().f98429a).i;
        j jVar2 = ((CardOrderFlowContract$State) cVar.A2().f98429a).f65054h;
        String str2 = ((CardOrderFlowContract$State) cVar.A2().f98429a).f65052c;
        AccountId accountId = ((CardOrderFlowContract$State) cVar.A2().f98429a).f65055j;
        pi3.h hVar = ((CardOrderFlowContract$State) cVar.A2().f98429a).e;
        String str3 = ((CardOrderFlowContract$State) cVar.A2().f98429a).f65057m;
        String str4 = ((CardOrderFlowContract$State) cVar.A2().f98429a).f65058n;
        String str5 = ((CardOrderFlowContract$State) cVar.A2().f98429a).o;
        Boolean bool = ((CardOrderFlowContract$State) cVar.A2().f98429a).f65061r;
        Boolean bool2 = ((CardOrderFlowContract$State) cVar.A2().f98429a).f65060q;
        c93.b bVar4 = ((CardOrderFlowContract$State) cVar.A2().f98429a).f65050a;
        e93.f fVar2 = bVar4 != null ? bVar4.f22270b : null;
        e93.d dVar = fVar2 instanceof e93.d ? (e93.d) fVar2 : null;
        return bVar.a(fVar, str, address, bVar3, jVar, jVar2, str2, accountId, hVar, str3, str4, str5, bool, bool2, dVar != null ? dVar.B : null, ((CardOrderFlowContract$State) cVar.A2().f98429a).f65063t, ((CardOrderFlowContract$State) cVar.A2().f98429a).u, ((CardOrderFlowContract$State) cVar.A2().f98429a).v, ((CardOrderFlowContract$State) cVar.A2().f98429a).f65064w, iVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0115, code lost:
    
        if (r15 == r1) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object P2(com.revolut.feature.card_order_new.impl.kompot.c r14, gim.c r15) {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.card_order_new.impl.kompot.c.P2(com.revolut.feature.card_order_new.impl.kompot.c, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Q2(com.revolut.feature.card_order_new.impl.kompot.c r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof c23.l
            if (r0 == 0) goto L13
            r0 = r6
            c23.l r0 = (c23.l) r0
            int r1 = r0.f20621w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20621w = r1
            goto L18
        L13:
            c23.l r0 = new c23.l
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f20621w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L78
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            ffk.t r6 = r5.B
            efm.d0 r6 = r6.e()
            c23.f r2 = new c23.f
            r4 = 0
            r2.<init>(r5, r4)
            c03.u r5 = new c03.u
            r4 = 19
            r5.<init>(r4, r2)
            r6.getClass()
            sfm.b r2 = new sfm.b
            r4 = 2
            r2.<init>(r6, r5, r4)
            java.lang.String r5 = "flatMapObservable(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)
            r5 = 3
            r6 = 0
            efm.r r5 = m70.a.g(r2, r6, r6, r5)
            efm.d0 r5 = r5.firstOrError()
            java.lang.String r6 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            c09.a r6 = new c09.a
            r2 = 19
            r6.<init>(r2)
            zhm.h0 r2 = zhm.h0.f322473a
            pfm.z r5 = ue0.e.I(r5, r2, r6)
            r0.f20621w = r3
            java.lang.Object r6 = nim.a.b(r5, r0)
            if (r6 != r1) goto L78
            return r1
        L78:
            java.lang.String r5 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.card_order_new.impl.kompot.c.Q2(com.revolut.feature.card_order_new.impl.kompot.c, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object R2(com.revolut.feature.card_order_new.impl.kompot.c r4, gim.c r5) {
        /*
            boolean r0 = r5 instanceof c23.o
            if (r0 == 0) goto L13
            r0 = r5
            c23.o r0 = (c23.o) r0
            int r1 = r0.f20626w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20626w = r1
            goto L18
        L13:
            c23.o r0 = new c23.o
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f20626w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L3b
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r5)
            r0.f20626w = r3
            java.io.Serializable r5 = r4.X2(r0)
            if (r5 != r1) goto L3b
            return r1
        L3b:
            wi0.b r5 = (wi0.b) r5
            if (r5 == 0) goto L4c
            com.revolut.feature.card_order_new.impl.kompot.CardOrderFlowContract$Step$UserLegalAgreement r0 = new com.revolut.feature.card_order_new.impl.kompot.CardOrderFlowContract$Step$UserLegalAgreement
            c93.e r1 = c93.e.PHYSICAL
            r0.<init>(r5, r1)
            r5 = 0
            r1 = 0
            r4.E2(r0, r3, r1, r5)
            goto L4f
        L4c:
            r4.Y2()
        L4f:
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.card_order_new.impl.kompot.c.R2(com.revolut.feature.card_order_new.impl.kompot.c, gim.c):java.lang.Object");
    }

    public static final void S2(c cVar) {
        cVar.X1(new y0("ADDRESS_NOT_SUPPORTED_DIALOG_ID", new z(new TextLocalisedClause(R$string.card_delivery_alert_unsupported_address_title, null, null, 14), new TextLocalisedClause(R$string.card_delivery_alert_unsupported_address_message, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764), false, 4));
    }

    public final List T2() {
        c93.b bVar = ((CardOrderFlowContract$State) A2().f98429a).f65050a;
        e93.f fVar = bVar != null ? bVar.f22270b : null;
        e93.d dVar = fVar instanceof e93.d ? (e93.d) fVar : null;
        List list = dVar != null ? dVar.A : null;
        return list == null ? f0.f322471a : list;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.feature.card_order_new.impl.kompot.CardOrderFlowContract$Step U2(c93.b r6) {
        /*
            r5 = this;
            e93.f r6 = r6.f22270b
            boolean r0 = r6 instanceof e93.d
            r1 = 0
            if (r0 == 0) goto La
            e93.d r6 = (e93.d) r6
            goto Lb
        La:
            r6 = r1
        Lb:
            if (r6 != 0) goto Le
            goto L4a
        Le:
            c93.g r0 = c93.h.Companion
            r0.getClass()
            c93.h r0 = c93.h.f22285t
            boolean r0 = ce9.m.r(r6, r0)
            e93.x r2 = r6.f123830j
            if (r2 == 0) goto L20
            java.lang.String r2 = r2.d
            goto L21
        L20:
            r2 = r1
        L21:
            jla.h r3 = r5.L
            java.lang.String r4 = "revolut_card.custom_name_on_card"
            bla.c r1 = r3.d(r4, r1)
            bla.c r3 = bla.c.ENABLED
            if (r1 != r3) goto L2f
            r1 = 1
            goto L30
        L2f:
            r1 = 0
        L30:
            boolean r3 = ce9.m.w(r6)
            if (r3 == 0) goto L43
            com.revolut.feature.card_order_new.api.CardOrderFeatureApi$Toggles$YouthNumberlessCard r3 = com.revolut.feature.card_order_new.api.CardOrderFeatureApi$Toggles.YouthNumberlessCard.f64955c
            gte.a r4 = r5.K
            jte.d r4 = (jte.d) r4
            boolean r3 = r4.c(r3)
            if (r3 != 0) goto L43
            goto L4a
        L43:
            if (r0 != 0) goto L4d
            if (r2 == 0) goto L4a
            if (r1 == 0) goto L4a
            goto L4d
        L4a:
            com.revolut.feature.card_order_new.impl.kompot.CardOrderFlowContract$Step$CreatePin r6 = com.revolut.feature.card_order_new.impl.kompot.CardOrderFlowContract$Step.CreatePin.f65075a
            return r6
        L4d:
            com.revolut.feature.card_order_new.impl.kompot.CardOrderFlowContract$Step$ExtraSecurity r0 = new com.revolut.feature.card_order_new.impl.kompot.CardOrderFlowContract$Step$ExtraSecurity
            r0.<init>(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.card_order_new.impl.kompot.c.U2(c93.b):com.revolut.feature.card_order_new.impl.kompot.CardOrderFlowContract$Step");
    }

    public final String V2() {
        String str;
        AccountId accountId = ((CardOrderFlowContract$State) A2().f98429a).f65055j;
        AccountId.Joint joint = accountId instanceof AccountId.Joint ? (AccountId.Joint) accountId : null;
        return (joint == null || (str = joint.f51413b) == null) ? ((CardOrderFlowContract$State) A2().f98429a).f65058n : str;
    }

    public final void W2() {
        E2(new CardOrderFlowContract$Step.AddressVerification(((CardOrderFlowContract$State) A2().f98429a).d), false, null, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable X2(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof c23.m
            if (r0 == 0) goto L13
            r0 = r6
            c23.m r0 = (c23.m) r0
            int r1 = r0.f20622w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20622w = r1
            goto L18
        L13:
            c23.m r0 = new c23.m
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f20622w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r6)
            goto L54
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L30:
            yhm.o.b(r6)
            q89.e r6 = r5.D
            db9.d r6 = (db9.d) r6
            boolean r6 = r6.c()
            if (r6 != 0) goto L3e
            goto L64
        L3e:
            ang.f r6 = r5.N
            w4l.j r2 = w4l.j.f294644c
            akg.n r6 = r6.j(r2)
            r2 = 3
            jhi.b r6 = mo3.a.g(r6, r4, r4, r2)
            r0.f20622w = r3
            java.lang.Object r6 = vkm.q.x(r6, r0)
            if (r6 != r1) goto L54
            return r1
        L54:
            do3.n r6 = (do3.n) r6
            wi0.a r0 = wi0.b.Companion
            r0.getClass()
            wi0.b r0 = wi0.b.M0
            boolean r6 = te0.w.S(r6, r0)
            if (r6 == 0) goto L64
            return r0
        L64:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.card_order_new.impl.kompot.c.X2(gim.c):java.io.Serializable");
    }

    public final void Y2() {
        e93.f fVar;
        c93.b bVar = ((CardOrderFlowContract$State) A2().f98429a).f65050a;
        if (bVar == null || (fVar = bVar.f22270b) == null || !m.w(fVar)) {
            l2(new c23.j(this, null, 1), new yi5.b(26));
        } else {
            a3(false);
        }
    }

    public final void Z2() {
        j0 j0VarQ;
        l0 l0VarR;
        e93.f fVar;
        e93.f fVar2;
        c93.e eVar = c93.e.VIRTUAL;
        c93.b bVar = ((CardOrderFlowContract$State) A2().f98429a).f65050a;
        if (bVar == null || (fVar2 = bVar.f22270b) == null || (j0VarQ = fVar2.q()) == null) {
            j0VarQ = j0.RETAIL;
        }
        j0 j0Var = j0VarQ;
        c93.b bVar2 = ((CardOrderFlowContract$State) A2().f98429a).f65050a;
        if (bVar2 == null || (fVar = bVar2.f22270b) == null || (l0VarR = fVar.r()) == null) {
            l0VarR = l0.DEBIT;
        }
        l0 l0Var = l0VarR;
        AnalyticsProduct analyticsProduct = ((CardOrderFlowContract$State) A2().f98429a).f65062s;
        Set setB = zhm.y0.b(eVar);
        AccountId accountId = ((CardOrderFlowContract$State) A2().f98429a).f65055j;
        if (accountId == null) {
            accountId = AccountId.Personal.f51414a;
        }
        C1(new CardDesignCatalogueDestination(null, eVar, j0Var, l0Var, accountId, null, V2(), null, false, false, null, null, analyticsProduct, null, null, null, null, setB, false, null, ((CardOrderFlowContract$State) A2().f98429a).f65065x, 8122272));
    }

    public final void a3(boolean z) {
        l2(new q(this, z, null, 1), new yi5.b(26));
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0022  */
    @Override // yji.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean o1(java.lang.Throwable r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            java.lang.String r2 = "throwable"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            sf0.h r2 = r0.F
            com.revolut.core.error.data.model.ServerError r1 = r2.a(r1)
            v60.e r2 = r0.G
            if (r1 == 0) goto L22
            int r1 = r1.f51362a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3 = r2
            ao0.a r3 = (ao0.a) r3
            v60.c r1 = r3.b(r1)
            if (r1 != 0) goto L2c
        L22:
            ao0.a r2 = (ao0.a) r2
            r2.getClass()
            v60.b r1 = new v60.b
            r1.<init>()
        L2c:
            tji.f r2 = r0.X()
            nii.y0 r3 = new nii.y0
            nii.z r4 = new nii.z
            com.revolut.core.ui_kit.models.TextLocalisedClause r5 = ofm.q.O(r1)
            r17 = 0
            r18 = 32766(0x7ffe, float:4.5915E-41)
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r1 = 0
            r5 = 4
            java.lang.String r6 = "ERROR_STATUS_DIALOG_ID"
            r3.<init>(r6, r4, r1, r5)
            r2.d(r3)
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.card_order_new.impl.kompot.c.o1(java.lang.Throwable):boolean");
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        e93.f fVar;
        e93.f fVar2;
        CardOrderFlowContract$Step step = (CardOrderFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof CardOrderFlowContract$Step.CardPersonalisation) {
            CardOrderFlowContract$Step.CardPersonalisation cardPersonalisation = (CardOrderFlowContract$Step.CardPersonalisation) step;
            n nVar = cardPersonalisation.f65071b;
            boolean z = cardPersonalisation.f65072c;
            boolean z3 = cardPersonalisation.d;
            c93.b bVar = ((CardOrderFlowContract$State) A2().f98429a).f65050a;
            if (bVar == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            CardPersonalisationController cardPersonalisationController = new CardPersonalisationController(new CardPersonalisationControllerContract$InputData(nVar, z, z3, bVar, ((CardOrderFlowContract$State) A2().f98429a).e, ((CardOrderFlowContract$State) A2().f98429a).f65055j, V2(), ((CardOrderFlowContract$State) A2().f98429a).f65062s));
            c23.e block = new c23.e(step, this);
            Intrinsics.checkNotNullParameter(block, "block");
            cardPersonalisationController.H = block;
            return cardPersonalisationController;
        }
        if (step instanceof CardOrderFlowContract$Step.ExtraSecurity) {
            CardExtraSecurityController cardExtraSecurityController = new CardExtraSecurityController(new CardExtraSecurityControllerContract$InputData(((CardOrderFlowContract$Step.ExtraSecurity) step).f65076a));
            c23.f block2 = new c23.f(this, 1);
            Intrinsics.checkNotNullParameter(block2, "block");
            cardExtraSecurityController.H = block2;
            return cardExtraSecurityController;
        }
        if (step instanceof CardOrderFlowContract$Step.CreatePin) {
            SetPinController setPinController = new SetPinController(new SetPinScreenContract$InputData.CreatePin(((CardOrderFlowContract$State) A2().f98429a).f65062s, 0, ((CardOrderFlowContract$State) A2().f98429a).f65065x, 2));
            c23.f block3 = new c23.f(this, 2);
            Intrinsics.checkNotNullParameter(block3, "block");
            setPinController.H = block3;
            return setPinController;
        }
        if (step instanceof CardOrderFlowContract$Step.ConfirmPin) {
            SetPinController setPinController2 = new SetPinController(new SetPinScreenContract$InputData.ConfirmPin(((CardOrderFlowContract$State) A2().f98429a).f65062s, ((CardOrderFlowContract$Step.ConfirmPin) step).f65074a, ((CardOrderFlowContract$State) A2().f98429a).f65065x));
            c23.f block4 = new c23.f(this, 3);
            Intrinsics.checkNotNullParameter(block4, "block");
            setPinController2.H = block4;
            return setPinController2;
        }
        l0 l0VarR = null;
        if (step instanceof CardOrderFlowContract$Step.AddressVerification) {
            Address address = ((CardOrderFlowContract$Step.AddressVerification) step).f65067a;
            c93.b bVar2 = ((CardOrderFlowContract$State) A2().f98429a).f65050a;
            if (bVar2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            boolean zW = m.w(bVar2.f22270b);
            AnalyticsProduct analyticsProduct = ((CardOrderFlowContract$State) A2().f98429a).f65062s;
            List listT2 = T2();
            c93.b bVar3 = ((CardOrderFlowContract$State) A2().f98429a).f65050a;
            j0 j0VarQ = (bVar3 == null || (fVar2 = bVar3.f22270b) == null) ? null : fVar2.q();
            c93.b bVar4 = ((CardOrderFlowContract$State) A2().f98429a).f65050a;
            if (bVar4 != null && (fVar = bVar4.f22270b) != null) {
                l0VarR = fVar.r();
            }
            l0 l0Var = l0VarR;
            AccountId accountId = ((CardOrderFlowContract$State) A2().f98429a).f65055j;
            if (accountId == null) {
                accountId = AccountId.Personal.f51414a;
            }
            CardDeliveryAddressVerificationController cardDeliveryAddressVerificationController = new CardDeliveryAddressVerificationController(new CardDeliveryAddressVerificationScreenContract$InputData(address, zW, analyticsProduct, listT2, j0VarQ, l0Var, accountId, V2()));
            c23.f block5 = new c23.f(this, 4);
            Intrinsics.checkNotNullParameter(block5, "block");
            cardDeliveryAddressVerificationController.H = block5;
            return cardDeliveryAddressVerificationController;
        }
        if (step instanceof CardOrderFlowContract$Step.CardDeliveryMethods) {
            CardOrderFlowContract$Step.CardDeliveryMethods cardDeliveryMethods = (CardOrderFlowContract$Step.CardDeliveryMethods) step;
            Address address2 = cardDeliveryMethods.f65068a;
            d93.d dVar = cardDeliveryMethods.f65069b;
            String str = ((CardOrderFlowContract$State) A2().f98429a).k;
            c93.b bVar5 = ((CardOrderFlowContract$State) A2().f98429a).f65050a;
            if (bVar5 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            DeliveryMethodsController deliveryMethodsController = new DeliveryMethodsController(new DeliveryMethodsScreenContract$InputData(address2, dVar, str, bVar5, ((CardOrderFlowContract$State) A2().f98429a).i, ((CardOrderFlowContract$State) A2().f98429a).f65054h, ((CardOrderFlowContract$State) A2().f98429a).f65052c, ((CardOrderFlowContract$State) A2().f98429a).e, ((CardOrderFlowContract$State) A2().f98429a).f65055j, ((CardOrderFlowContract$State) A2().f98429a).f65057m, ((CardOrderFlowContract$State) A2().f98429a).f65062s, ((CardOrderFlowContract$State) A2().f98429a).f65063t, ((CardOrderFlowContract$State) A2().f98429a).u));
            c23.f block6 = new c23.f(this, 5);
            Intrinsics.checkNotNullParameter(block6, "block");
            deliveryMethodsController.H = block6;
            return deliveryMethodsController;
        }
        if (step instanceof CardOrderFlowContract$Step.ChangeDeliveryAddress) {
            Address address3 = ((CardOrderFlowContract$State) A2().f98429a).d;
            if (address3 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            AddressFormController addressFormController = new AddressFormController(new AddressFormScreenContract$InputData(address3, true, new TextLocalisedClause(R$string.card_delivery_address_form_title, null, null, 14), new TextLocalisedClause(R$string.card_delivery_address_action_update, null, null, 14), FieldMode.NotEditable.f60955a, ((CardOrderFlowContract$State) A2().f98429a).f65062s, null, false, T2(), 22840));
            c23.e block7 = new c23.e(this, step);
            Intrinsics.checkNotNullParameter(block7, "block");
            addressFormController.H = block7;
            return addressFormController;
        }
        if (!(step instanceof CardOrderFlowContract$Step.AddDeliveryAddress)) {
            if (step instanceof CardOrderFlowContract$Step.FreelancerCashbackUpsell) {
                FreelancerCashbackUpsellContract$InputData inputData = new FreelancerCashbackUpsellContract$InputData(null);
                this.z.getClass();
                Intrinsics.checkNotNullParameter(inputData, "inputData");
                FreelancerCashbackUpsellScreen freelancerCashbackUpsellScreen = new FreelancerCashbackUpsellScreen(inputData);
                c23.f block8 = new c23.f(this, 7);
                Intrinsics.checkNotNullParameter(block8, "block");
                freelancerCashbackUpsellScreen.H = block8;
                return freelancerCashbackUpsellScreen;
            }
            if (!(step instanceof CardOrderFlowContract$Step.UserLegalAgreement)) {
                throw new NoWhenBranchMatchedException();
            }
            CardOrderFlowContract$Step.UserLegalAgreement userLegalAgreement = (CardOrderFlowContract$Step.UserLegalAgreement) step;
            ViewController viewControllerE1 = e1(new xy2.b(new CardIssuanceAgreementControllerContract$InputData(userLegalAgreement.f65078a, userLegalAgreement.f65079b)));
            c23.f block9 = new c23.f(this, 8);
            Intrinsics.checkNotNullParameter(block9, "block");
            viewControllerE1.H = block9;
            return viewControllerE1;
        }
        Address empty = Address.INSTANCE.getEMPTY();
        Address addressCopy = empty.copy((32704 & 1) != 0 ? empty.streetLine1 : null, (32704 & 2) != 0 ? empty.streetLine2 : null, (32704 & 4) != 0 ? empty.region : null, (32704 & 8) != 0 ? empty.city : null, (32704 & 16) != 0 ? empty.postcode : null, (32704 & 32) != 0 ? empty.country : ((CardOrderFlowContract$Step.AddDeliveryAddress) step).f65066a, (32704 & 64) != 0 ? empty.fullAddress : null, (32704 & 128) != 0 ? empty.streetType : null, (32704 & 256) != 0 ? empty.street : null, (32704 & 512) != 0 ? empty.houseNumber : null, (32704 & 1024) != 0 ? empty.flat : null, (32704 & 2048) != 0 ? empty.neighborhood : null, (32704 & 4096) != 0 ? empty.houseName : null, (32704 & 8192) != 0 ? empty.type : null, (32704 & 16384) != 0 ? empty.landmark : null);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.card_delivery_address_form_title, null, null, 14);
        AnalyticsProduct analyticsProduct2 = ((CardOrderFlowContract$State) A2().f98429a).f65062s;
        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
        CardsOrderContext.a aVarNewBuilder = CardsOrderContext.newBuilder();
        aVarNewBuilder.c();
        ((CardsOrderContext) aVarNewBuilder.f49761b).setIsLastAddressUnavailable(true);
        boolean z4 = !((db9.d) this.D).c();
        aVarNewBuilder.c();
        ((CardsOrderContext) aVarNewBuilder.f49761b).setIsOnboarding(z4);
        w0 w0VarA = aVarNewBuilder.a();
        companion.getClass();
        AddressFormController addressFormController2 = new AddressFormController(new AddressFormScreenContract$InputData(addressCopy, false, textLocalisedClause, null, new FieldMode.Editable(true), analyticsProduct2, new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA)), false, T2(), 29048));
        c23.f block10 = new c23.f(this, 6);
        Intrinsics.checkNotNullParameter(block10, "block");
        addressFormController2.H = block10;
        return addressFormController2;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.P;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.O;
    }
}
