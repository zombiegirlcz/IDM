package com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product;

import akg.n;
import clb.c;
import cli.y;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.retail.savings.api.challenge.model.SavingsChallengeCreationData;
import com.revolut.feature.retail.savings.api.core.SavingsCoreApi$Toggles$SalaryStudentHys;
import com.revolut.feature.shared.savings.models.product.OnboardingConfig;
import com.revolut.feature.shared.savings.models.product.SavingsProduct;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import ffk.t;
import fgj.g;
import fmb.g0;
import fmb.j0;
import fmb.l0;
import fmb.o0;
import fmb.p0;
import fmb.t0;
import fmb.v0;
import fmb.w;
import fmb.x0;
import fmb.z;
import g48.r0;
import java.util.List;
import jhi.k;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import mra.d;
import od0.i;
import okb.m;
import oki.h;
import r10.r;
import skb.f;
import vkm.j2;
import vkm.q;
import wli.x;
import yji.l;
import ypg.e;
import zh9.u0;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends h implements w {
    public final f A;
    public final f80.a B;
    public final r0 C;
    public final c D;
    public final t E;
    public final r F;
    public final sfk.a G;
    public final yjb.c H;
    public final gte.a I;
    public final fkg.a J;
    public final vii.b K;
    public final y L;
    public final com.revolut.kompot.navigable.vc.modal.a M;
    public final e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ijb.a f83297p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final gnb.b f83298q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ang.f f83299r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j60.a f83300s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final vkb.a f83301t;
    public final vkb.f u;
    public final ReviewProductDetailsScreenContract$InputData v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final m f83302w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final tkb.a f83303x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final mpg.a f83304y;
    public final x z;

    public b(e savingsInteractor, ijb.a savingsProductInteractor, gnb.b savingsDocumentsInteractor, ang.f userInteractor, j60.a bottomDialogExtension, vkb.a taxResidencyConfirmationExtension, vkb.f taxResidencyStateProvider, ReviewProductDetailsScreenContract$InputData inputData, m savingsKycCheckExtension, tkb.a protectionSchemeExtension, mpg.a savingsTermsAcceptanceExtension, x deeplinkHandler, f productSheetsModelProvider, f80.a uriHelper, r0 jointAccountInteractor, c savingsErrorHandlingApi, t pricingPlanInteractor, r infoSheetDeeplinkHandler, sfk.a pricingPlanChangeObservable, yjb.c challengeBottomSheetControllerFactory, gte.a featureToggleInteractor, fkg.a savingsUpgradesInteractor, o0 stateMapper) {
        Intrinsics.checkNotNullParameter(savingsInteractor, "savingsInteractor");
        Intrinsics.checkNotNullParameter(savingsProductInteractor, "savingsProductInteractor");
        Intrinsics.checkNotNullParameter(savingsDocumentsInteractor, "savingsDocumentsInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(taxResidencyConfirmationExtension, "taxResidencyConfirmationExtension");
        Intrinsics.checkNotNullParameter(taxResidencyStateProvider, "taxResidencyStateProvider");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(savingsKycCheckExtension, "savingsKycCheckExtension");
        Intrinsics.checkNotNullParameter(protectionSchemeExtension, "protectionSchemeExtension");
        Intrinsics.checkNotNullParameter(savingsTermsAcceptanceExtension, "savingsTermsAcceptanceExtension");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(productSheetsModelProvider, "productSheetsModelProvider");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        Intrinsics.checkNotNullParameter(jointAccountInteractor, "jointAccountInteractor");
        Intrinsics.checkNotNullParameter(savingsErrorHandlingApi, "savingsErrorHandlingApi");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(infoSheetDeeplinkHandler, "infoSheetDeeplinkHandler");
        Intrinsics.checkNotNullParameter(pricingPlanChangeObservable, "pricingPlanChangeObservable");
        Intrinsics.checkNotNullParameter(challengeBottomSheetControllerFactory, "challengeBottomSheetControllerFactory");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(savingsUpgradesInteractor, "savingsUpgradesInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = savingsInteractor;
        this.f83297p = savingsProductInteractor;
        this.f83298q = savingsDocumentsInteractor;
        this.f83299r = userInteractor;
        this.f83300s = bottomDialogExtension;
        this.f83301t = taxResidencyConfirmationExtension;
        this.u = taxResidencyStateProvider;
        this.v = inputData;
        this.f83302w = savingsKycCheckExtension;
        this.f83303x = protectionSchemeExtension;
        this.f83304y = savingsTermsAcceptanceExtension;
        this.z = deeplinkHandler;
        this.A = productSheetsModelProvider;
        this.B = uriHelper;
        this.C = jointAccountInteractor;
        this.D = savingsErrorHandlingApi;
        this.E = pricingPlanInteractor;
        this.F = infoSheetDeeplinkHandler;
        this.G = pricingPlanChangeObservable;
        this.H = challengeBottomSheetControllerFactory;
        this.I = featureToggleInteractor;
        this.J = savingsUpgradesInteractor;
        this.K = new vii.b();
        this.L = d.b(this, new fmb.r(new Data(null, null, true, 3, null), inputData.f83289c), stateMapper, null, false, 12);
        this.M = hx7.e.a(this, new g(this, 16));
    }

    public static final void I2(b bVar) {
        SavingsProductData savingsProductData = ((fmb.r) ((j2) bVar.L.f22677a).getValue()).c().f214169a;
        ReviewProductDetailsScreenContract$ChallengeInfo reviewProductDetailsScreenContract$ChallengeInfo = bVar.v.d;
        bVar.C2(new z(savingsProductData, reviewProductDetailsScreenContract$ChallengeInfo != null ? new SavingsChallengeCreationData(reviewProductDetailsScreenContract$ChallengeInfo.f83285a, reviewProductDetailsScreenContract$ChallengeInfo.f83286b, null) : null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0069, code lost:
    
        if (lg0.b.x1(r1, r8, null, null, r5, 2) == r0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product.b r7, java.lang.String r8, gim.c r9) {
        /*
            boolean r0 = r9 instanceof fmb.r0
            if (r0 == 0) goto L14
            r0 = r9
            fmb.r0 r0 = (fmb.r0) r0
            int r1 = r0.f136299x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f136299x = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            fmb.r0 r0 = new fmb.r0
            r0.<init>(r7, r9)
            goto L12
        L1a:
            java.lang.Object r9 = r5.v
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r5.f136299x
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3a
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2c
            yhm.o.b(r9)
            goto L6c
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            java.lang.String r8 = r5.u
            yhm.o.b(r9)
            goto L52
        L3a:
            yhm.o.b(r9)
            r10.r r9 = r7.F
            com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product.ReviewProductDetailsScreenContract$InputData r1 = r7.v
            com.revolut.feature.shared.savings.models.product.SavingsProductData r1 = r1.f83287a
            com.revolut.feature.shared.savings.models.product.SavingsProduct r1 = r1.f86683a
            java.lang.String r1 = r1.f86617a
            r5.u = r8
            r5.f136299x = r3
            java.lang.Object r9 = r9.r(r8, r1, r5)
            if (r9 != r0) goto L52
            goto L6b
        L52:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L6f
            wli.x r1 = r7.z
            r7 = 0
            r5.u = r7
            r5.f136299x = r2
            r3 = 0
            r4 = 0
            r6 = 2
            r2 = r8
            java.lang.Object r7 = lg0.b.x1(r1, r2, r3, r4, r5, r6)
            if (r7 != r0) goto L6c
        L6b:
            return r0
        L6c:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L6f:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product.b.J2(com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product.b, java.lang.String, gim.c):java.lang.Object");
    }

    public static final k K2(b bVar, SavingsProductData savingsProductData) {
        Flow gVar;
        Flow flowI;
        Flow flowI2;
        gnb.b bVar2 = bVar.f83298q;
        SavingsProduct savingsProduct = savingsProductData.f86683a;
        String str = savingsProduct.f86617a;
        ncd.g gVar2 = savingsProduct.f86619c;
        Flow flowA = bVar2.a(str);
        n nVarJ = bVar.f83299r.j(w4l.h.f294642c);
        ijb.a aVar = bVar.f83297p;
        Flow flowD = ijb.a.d(aVar, savingsProductData);
        n nVarF = ijb.a.f(aVar);
        ReviewProductDetailsScreenContract$InputData reviewProductDetailsScreenContract$InputData = bVar.v;
        ncd.h hVar = reviewProductDetailsScreenContract$InputData.f83287a.f86683a.f86628r;
        ncd.h hVar2 = ncd.h.PERSONAL_JOINT;
        i iVar = i.f224256b;
        if (hVar == hVar2) {
            gVar = new t0(bVar.C.r(), 0);
        } else {
            i.Companion.getClass();
            gVar = new go.g(new Data(iVar, null, false, 6, null), 2);
        }
        ncd.g gVar3 = ncd.g.SAVINGS_FIXED_TERM;
        if (gVar2 == gVar3) {
            i.Companion.getClass();
            flowI = zi0.c.i(iVar);
        } else {
            List list = reviewProductDetailsScreenContract$InputData.f83288b;
            if (list.isEmpty() || reviewProductDetailsScreenContract$InputData.f83287a.f86683a.f86628r == hVar2) {
                i.Companion.getClass();
                flowI = zi0.c.i(od0.h.a(g0.f136269a));
            } else {
                flowI = nim.a.y(nim.a.v(rd0.e.b(bVar.E.n()), new fg8.y(savingsProductData, list, 20)), new fkh.f(8));
            }
        }
        boolean zA = bVar.I.a(SavingsCoreApi$Toggles$SalaryStudentHys.f83119c);
        if (gVar2 == gVar3 || zA) {
            i.Companion.getClass();
            flowI2 = zi0.c.i(iVar);
        } else {
            flowI2 = nim.a.A(bVar.J.u(savingsProduct.f86617a, w4l.i.f294643c), new fkh.f(7));
        }
        return nim.a.u(new f23.y((Continuation) null, savingsProductData, bVar, 4), u0.i(u0.i(flowA, nVarJ, flowD), u0.i(nVarF, gVar, flowI), flowI2));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.K, new v0(0, this, continuation)), null, null, new f9d.c(this, continuation, 28), 3);
        l.a1(this, q.Q(rd0.e.b(this.G.a()), new v0(1, this, continuation)), null, null, new fjd.g0(this, continuation, 6), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.M;
    }

    public final void L2(InputChecklistDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        y yVar = this.L;
        l0 l0Var = (l0) ((fmb.r) ((j2) yVar.f22677a).getValue()).f136296a.getContent();
        if (l0Var != null) {
            boolean z = !model.f52521c;
            ncd.a availableProduct = l0Var.f136275a;
            wi0.b countryCode = l0Var.f136277c;
            List documentsData = l0Var.d;
            OnboardingConfig.ReviewDetailsScreenConfig reviewDetailsScreenConfig = l0Var.e;
            i partnerInfo = l0Var.f;
            j0 j0Var = l0Var.f136278g;
            ReviewProductDetailsScreenContract$ChallengeInfo reviewProductDetailsScreenContract$ChallengeInfo = l0Var.f136279h;
            pjb.b bVar = l0Var.i;
            Intrinsics.checkNotNullParameter(availableProduct, "availableProduct");
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            Intrinsics.checkNotNullParameter(documentsData, "documentsData");
            Intrinsics.checkNotNullParameter(partnerInfo, "partnerInfo");
            H2(yVar, new fjd.w(new l0(availableProduct, z, countryCode, documentsData, reviewDetailsScreenConfig, partnerInfo, j0Var, reviewProductDetailsScreenContract$ChallengeInfo, bVar), 11));
        }
    }

    public final void M2(Object obj2, String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        l2(new etj.l(this, obj2, listId, (Continuation) null), new p0(this, 1));
    }

    public final void N2() {
        l2(new x0(2, this, null), new p0(this, 0));
    }

    public final Object O2(rp0.y yVar, gim.i iVar) {
        Object objA = nim.a.a(this.f83300s.G(yVar), iVar);
        return objA == fim.a.COROUTINE_SUSPENDED ? objA : Unit.f186387a;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.L;
    }
}
