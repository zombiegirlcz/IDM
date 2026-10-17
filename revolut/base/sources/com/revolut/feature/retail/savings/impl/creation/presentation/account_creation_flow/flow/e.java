package com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow;

import cli.g;
import cli.y;
import com.revolut.feature.joint.api.JointAccountsApi$Toggles$JointSavingsOnboardingRevamp;
import com.revolut.feature.retail.savings.api.SavingsApi$Toggles;
import com.revolut.feature.retail.savings.api.challenge.model.SavingsChallengeCreationData;
import com.revolut.feature.retail.savings.api.error.SavingsErrorHandlingApi$SavingsProductUnavailableException;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.SavingsOnboardingFlowContract$Step;
import com.revolut.feature.shared.savings.models.product.SavingsProduct;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.revolut.feature.vaults.common.SavingAccountType;
import com.revolut.kompot.common.ModalDestination;
import fmb.a0;
import fmb.b0;
import fmb.c0;
import fmb.d0;
import fmb.e0;
import fmb.z;
import g48.r0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import oki.h;
import vkm.j2;
import w38.t;
import wli.x;
import xge.f;
import xif.k;
import xlb.j;
import xlb.n;
import xlb.u;
import yji.l;
import yki.i;
import zh9.u0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends h implements xlb.c {
    public final t A;
    public final y B;
    public final i C;
    public final SavingsOnboardingFlowContract$Input o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ijb.a f83271p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ffk.t f83272q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final zja.a f83273r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ugc.a f83274s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final wlb.a f83275t;
    public final clb.c u;
    public final xlb.y v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final vlb.e f83276w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final x f83277x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final gte.a f83278y;
    public final r0 z;

    public e(SavingsOnboardingFlowContract$Input inputData, ijb.a savingsProductInteractor, ffk.t pricingPlanInteractor, zja.a productArticleInteractor, ugc.a savingsChallengeInteractor, wlb.a savingsCreationResultDelegate, clb.c savingsErrorHandlingApi, xlb.y navigationResolver, vlb.e revampAvailabilityProvider, x deeplinkHandler, gte.a featureToggleInteractor, r0 jointAccountsInteractor, t jointPendingAccountBottomSheetProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(savingsProductInteractor, "savingsProductInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(productArticleInteractor, "productArticleInteractor");
        Intrinsics.checkNotNullParameter(savingsChallengeInteractor, "savingsChallengeInteractor");
        Intrinsics.checkNotNullParameter(savingsCreationResultDelegate, "savingsCreationResultDelegate");
        Intrinsics.checkNotNullParameter(savingsErrorHandlingApi, "savingsErrorHandlingApi");
        Intrinsics.checkNotNullParameter(navigationResolver, "navigationResolver");
        Intrinsics.checkNotNullParameter(revampAvailabilityProvider, "revampAvailabilityProvider");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(jointPendingAccountBottomSheetProvider, "jointPendingAccountBottomSheetProvider");
        this.o = inputData;
        this.f83271p = savingsProductInteractor;
        this.f83272q = pricingPlanInteractor;
        this.f83273r = productArticleInteractor;
        this.f83274s = savingsChallengeInteractor;
        this.f83275t = savingsCreationResultDelegate;
        this.u = savingsErrorHandlingApi;
        this.v = navigationResolver;
        this.f83276w = revampAvailabilityProvider;
        this.f83277x = deeplinkHandler;
        this.f83278y = featureToggleInteractor;
        this.z = jointAccountsInteractor;
        this.A = jointPendingAccountBottomSheetProvider;
        f0 f0Var = f0.f322471a;
        this.B = mra.d.b(this, new xlb.d(f0Var, f0Var, null, null, null), new j(), null, false, 12);
        this.C = d8l.d.a(this, new k(this, 6));
    }

    public static final void I2(e eVar, fmb.f0 f0Var) {
        eVar.getClass();
        if (f0Var instanceof z) {
            z zVar = (z) f0Var;
            SavingsProductData savingsProductData = zVar.f136318a;
            SavingsChallengeCreationData savingsChallengeCreationData = zVar.f136319b;
            eVar.n2(new f(eVar, savingsProductData, savingsChallengeCreationData, null, 6), new xlb.k(eVar, 0));
            return;
        }
        if (f0Var instanceof a0) {
            a0 a0Var = (a0) f0Var;
            eVar.T2(new SavingsOnboardingFlowContract$Step.Documents(a0Var.f136257a, a0Var.f136258b));
            return;
        }
        if (f0Var instanceof d0) {
            eVar.T2(new SavingsOnboardingFlowContract$Step.ProtectionAndSafety(((d0) f0Var).f136265a));
            return;
        }
        if (f0Var instanceof b0) {
            eVar.T2(new SavingsOnboardingFlowContract$Step.FundInfo(((b0) f0Var).f136262a));
        } else if (f0Var instanceof c0) {
            eVar.T2(new SavingsOnboardingFlowContract$Step.InterestAndFees(((c0) f0Var).f136263a));
        } else {
            if (!(f0Var instanceof e0)) {
                throw new NoWhenBranchMatchedException();
            }
            eVar.T2(new SavingsOnboardingFlowContract$Step.TieredLimits(((e0) f0Var).f136266a));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.e r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof xlb.t
            if (r0 == 0) goto L13
            r0 = r6
            xlb.t r0 = (xlb.t) r0
            int r1 = r0.f307003w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f307003w = r1
            goto L18
        L13:
            xlb.t r0 = new xlb.t
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f307003w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            yhm.o.b(r6)
            goto L55
        L28:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L30:
            yhm.o.b(r6)
            g48.r0 r5 = r5.z
            n38.q r6 = n38.q.PENDING
            java.util.Set r6 = zhm.y0.b(r6)
            w4l.h r2 = w4l.h.f294642c
            cxe.u r5 = r5.e(r6, r2)
            xce.d r6 = new xce.d
            r2 = 29
            r6.<init>(r2)
            jhi.b r5 = mo3.a.g(r5, r3, r6, r4)
            r0.f307003w = r4
            java.lang.Object r6 = vkm.q.z(r5, r0)
            if (r6 != r1) goto L55
            return r1
        L55:
            od0.i r6 = (od0.i) r6
            if (r6 == 0) goto L5e
            java.lang.Object r5 = r6.f224257a
            r3 = r5
            n38.a r3 = (n38.a) r3
        L5e:
            if (r3 == 0) goto L61
            goto L62
        L61:
            r4 = 0
        L62:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.e.J2(com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.e, gim.c):java.lang.Object");
    }

    public static final SavingsProductData K2(String str, Collection collection) {
        Object next;
        Iterator it8 = collection.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((SavingsProductData) next).f86683a.i, str)) {
                break;
            }
        }
        SavingsProductData savingsProductData = (SavingsProductData) next;
        if (savingsProductData != null) {
            return savingsProductData;
        }
        throw new SavingsErrorHandlingApi$SavingsProductUnavailableException(p.a.p("Product for userPricingPlanId == ", str, " - is not found"));
    }

    public static SavingsProductData V2(Collection collection) {
        SavingsProductData savingsProductData = (SavingsProductData) zhm.d0.c0(collection);
        if (savingsProductData != null) {
            return savingsProductData;
        }
        throw new SavingsErrorHandlingApi$SavingsProductUnavailableException(0);
    }

    @Override // yji.l
    public final void I1() {
        if (this.f226127l) {
            l.a1(this, U2(), null, null, new u(this, null, 1), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object L2(gim.c r5, java.util.List r6, boolean r7) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof xlb.p
            if (r0 == 0) goto L13
            r0 = r5
            xlb.p r0 = (xlb.p) r0
            int r1 = r0.f306995x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f306995x = r1
            goto L18
        L13:
            xlb.p r0 = new xlb.p
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f306995x
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.util.List r6 = r0.u
            java.util.List r6 = (java.util.List) r6
            yhm.o.b(r5)
            goto L4b
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            yhm.o.b(r5)
            r5 = r6
            java.util.Collection r5 = (java.util.Collection) r5
            com.revolut.feature.shared.savings.models.product.SavingsProductData r5 = V2(r5)
            r2 = r6
            java.util.List r2 = (java.util.List) r2
            r0.u = r2
            r0.f306995x = r3
            java.lang.Object r5 = r4.Q2(r7, r5, r0)
            if (r5 != r1) goto L4b
            return r1
        L4b:
            com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.SavingsOnboardingFlowContract$Step$Article r5 = (com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.SavingsOnboardingFlowContract$Step.Article) r5
            if (r5 == 0) goto L50
            return r5
        L50:
            com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.SavingsOnboardingFlowContract$Step r5 = r4.P2(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.e.L2(gim.c, java.util.List, boolean):java.lang.Object");
    }

    @Override // yki.j
    public final void M0() {
        l2(new c(this, null), new yi5.b(26));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object M2(com.revolut.feature.retail.savings.api.challenge.model.SavingsChallengeOnboarding.Config.ProductArticle r7, boolean r8, gim.c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof xlb.q
            if (r0 == 0) goto L13
            r0 = r9
            xlb.q r0 = (xlb.q) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            xlb.q r0 = new xlb.q
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f306997x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            boolean r8 = r0.f306996w
            com.revolut.feature.product_article.api.models.ProductArticleParams r7 = r0.v
            com.revolut.feature.retail.savings.api.challenge.model.SavingsChallengeOnboarding$Config$ProductArticle r0 = r0.u
            yhm.o.b(r9)
            goto L64
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            yhm.o.b(r9)
            com.revolut.feature.product_article.api.models.ProductArticleParams r9 = new com.revolut.feature.product_article.api.models.ProductArticleParams
            com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Id r2 = new com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Id
            java.lang.String r4 = r7.f83106a
            r2.<init>(r4)
            java.util.LinkedHashMap r4 = r7.f83107b
            r9.<init>(r2, r4)
            boolean r2 = r7.f83108c
            if (r2 == 0) goto L4b
            goto L6c
        L4b:
            r0.u = r7
            r0.v = r9
            r0.f306996w = r8
            r0.z = r3
            zja.a r2 = r6.f83273r
            kka.h r2 = (kka.h) r2
            com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour$SkipIfWasAlreadyShown r3 = com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a
            java.lang.Object r0 = r2.e(r9, r3, r0)
            if (r0 != r1) goto L60
            return r1
        L60:
            r5 = r0
            r0 = r7
            r7 = r9
            r9 = r5
        L64:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r3 = r9.booleanValue()
            r9 = r7
            r7 = r0
        L6c:
            r0 = 0
            if (r3 != 0) goto L70
            return r0
        L70:
            com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.SavingsOnboardingFlowContract$Step$Article$Type$Challenge r1 = com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.SavingsOnboardingFlowContract.Step.Article.Type.Challenge.f83247a
            if (r8 == 0) goto L7c
            com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.SavingsOnboardingFlowContract$Step$Article$PreFlow r8 = new com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.SavingsOnboardingFlowContract$Step$Article$PreFlow
            boolean r7 = r7.f83108c
            r8.<init>(r1, r9, r7, r0)
            return r8
        L7c:
            com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.SavingsOnboardingFlowContract$Step$Article$InFlow r8 = new com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.SavingsOnboardingFlowContract$Step$Article$InFlow
            boolean r7 = r7.f83108c
            r8.<init>(r1, r9, r7, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.e.M2(com.revolut.feature.retail.savings.api.challenge.model.SavingsChallengeOnboarding$Config$ProductArticle, boolean, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object N2(boolean r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof xlb.r
            if (r0 == 0) goto L13
            r0 = r6
            xlb.r r0 = (xlb.r) r0
            int r1 = r0.f306999w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f306999w = r1
            goto L18
        L13:
            xlb.r r0 = new xlb.r
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f306999w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L51
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            cli.y r6 = r4.B
            java.lang.Object r6 = r6.f22677a
            vkm.j2 r6 = (vkm.j2) r6
            java.lang.Object r6 = r6.getValue()
            xlb.d r6 = (xlb.d) r6
            com.revolut.feature.retail.savings.api.challenge.model.SavingsChallengeOnboarding r6 = r6.f306981c
            if (r6 == 0) goto L5b
            com.revolut.feature.retail.savings.api.challenge.model.SavingsChallengeOnboarding$Config r6 = r6.f83100b
            com.revolut.feature.retail.savings.api.challenge.model.SavingsChallengeOnboarding$Config$ProductArticle r6 = r6.f83101a
            if (r6 == 0) goto L54
            r0.f306999w = r3
            java.lang.Object r6 = r4.M2(r6, r5, r0)
            if (r6 != r1) goto L51
            return r1
        L51:
            com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.SavingsOnboardingFlowContract$Step$Article r6 = (com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.SavingsOnboardingFlowContract$Step.Article) r6
            goto L55
        L54:
            r6 = 0
        L55:
            if (r6 == 0) goto L58
            return r6
        L58:
            com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.SavingsOnboardingFlowContract$Step$ChallengeSetup r5 = com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.SavingsOnboardingFlowContract$Step.ChallengeSetup.f83252a
            return r5
        L5b:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Required value was null."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.e.N2(boolean, gim.c):java.lang.Object");
    }

    public final ArrayList O2(SavingsProductData savingsProductData) {
        List<SavingsProductData> list = ((xlb.d) ((j2) this.B.f22677a).getValue()).f306980b;
        ArrayList arrayList = new ArrayList();
        for (SavingsProductData savingsProductData2 : list) {
            SavingsProduct savingsProduct = savingsProductData2.f86683a;
            String str = savingsProduct.i;
            SavingsProduct savingsProduct2 = savingsProductData.f86683a;
            if (Intrinsics.f(str, savingsProduct2.i) || Intrinsics.f(savingsProduct.f86617a, savingsProduct2.f86617a) || savingsProduct.f86619c != savingsProduct2.f86619c || !Intrinsics.f(savingsProduct.f86618b, savingsProduct2.f86618b)) {
                savingsProductData2 = null;
            }
            if (savingsProductData2 != null) {
                arrayList.add(savingsProductData2);
            }
        }
        return arrayList;
    }

    public final SavingsOnboardingFlowContract$Step P2(List list) {
        SavingAccountType savingAccountType = this.o.f83238b;
        if ((savingAccountType instanceof SavingAccountType.Joint) || (savingAccountType instanceof SavingAccountType.Junior)) {
            return new SavingsOnboardingFlowContract$Step.ProductDetailsReview(V2(list));
        }
        if (!Intrinsics.f(savingAccountType, SavingAccountType.Personal.f94740a)) {
            throw new NoWhenBranchMatchedException();
        }
        boolean zS2 = S2();
        y yVar = this.B;
        if (zS2) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                String str = ((SavingsProductData) obj2).f86683a.i;
                String str2 = ((xlb.d) ((j2) yVar.f22677a).getValue()).d;
                if (str2 == null) {
                    throw new IllegalStateException("User pricing plan must not be null");
                }
                if (Intrinsics.f(str, str2)) {
                    arrayList.add(obj2);
                }
            }
            list = arrayList;
        }
        int i = n.f306992a[V2(list).f86683a.f86619c.ordinal()];
        if (i == 1) {
            return list.size() == 1 ? new SavingsOnboardingFlowContract$Step.ProductDetailsReview(V2(list)) : SavingsOnboardingFlowContract$Step.SelectTerm.f83262a;
        }
        if (i != 2 && i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj3 : list) {
            SavingsProduct savingsProduct = ((SavingsProductData) obj3).f86683a;
            Pair pair = new Pair(savingsProduct.i, savingsProduct.f86618b);
            Object arrayList2 = linkedHashMap.get(pair);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(pair, arrayList2);
            }
            ((List) arrayList2).add(obj3);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            SavingsProductData savingsProductDataC = opg.a.c((List) entry.getValue());
            if (savingsProductDataC != null) {
                linkedHashMap2.put(entry.getKey(), savingsProductDataC);
            }
        }
        Collection collectionValues = linkedHashMap2.values();
        String str3 = ((xlb.d) ((j2) yVar.f22677a).getValue()).d;
        if (str3 == null) {
            throw new IllegalStateException("User pricing plan must not be null");
        }
        SavingsProduct savingsProduct2 = V2(collectionValues).f86683a;
        Collection<SavingsProductData> collection = collectionValues;
        ArrayList arrayList3 = new ArrayList(w.t(collection, 10));
        for (SavingsProductData savingsProductData : collection) {
            xi0.b bVar = savingsProductData.f86683a.f86618b;
            Intrinsics.checkNotNullParameter(savingsProductData, "<this>");
            arrayList3.add(new Pair(bVar, Double.valueOf(ocd.c.b(savingsProductData))));
        }
        if (zhm.d0.i1(arrayList3).size() == 1) {
            return new SavingsOnboardingFlowContract$Step.ProductDetailsReview(K2(str3, collectionValues));
        }
        ArrayList arrayList4 = new ArrayList(w.t(collection, 10));
        Iterator it8 = collection.iterator();
        while (it8.hasNext()) {
            arrayList4.add(((SavingsProductData) it8.next()).f86683a.f86618b);
        }
        if (zhm.d0.i1(arrayList4).size() == 1) {
            return S2() ? new SavingsOnboardingFlowContract$Step.ProductDetailsReview(K2(str3, collectionValues)) : new SavingsOnboardingFlowContract$Step.Upsell(false, savingsProduct2.f86619c);
        }
        ArrayList arrayList5 = new ArrayList(w.t(collection, 10));
        Iterator it9 = collection.iterator();
        while (it9.hasNext()) {
            arrayList5.add(((SavingsProductData) it9.next()).f86683a.f86618b);
        }
        if (zhm.d0.i1(arrayList5).size() > 1) {
            return S2() ? new SavingsOnboardingFlowContract$Step.SelectCurrency(savingsProduct2.f86619c) : new SavingsOnboardingFlowContract$Step.Upsell(true, savingsProduct2.f86619c);
        }
        throw new IllegalStateException("Products don't meet any eligible condition");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Q2(boolean r7, com.revolut.feature.shared.savings.models.product.SavingsProductData r8, gim.c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof xlb.s
            if (r0 == 0) goto L13
            r0 = r9
            xlb.s r0 = (xlb.s) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.B = r1
            goto L18
        L13:
            xlb.s r0 = new xlb.s
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.z
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.B
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            boolean r7 = r0.v
            boolean r8 = r0.u
            com.revolut.feature.product_article.api.models.ProductArticleParams r1 = r0.f307002y
            com.revolut.feature.shared.savings.models.product.ProductGroup$ProductArticle r2 = r0.f307001x
            com.revolut.feature.shared.savings.models.product.SavingsProductData r0 = r0.f307000w
            yhm.o.b(r9)
            r4 = r7
            r7 = r8
            r8 = r0
            goto L73
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            yhm.o.b(r9)
            com.revolut.feature.shared.savings.models.product.ProductGroup r9 = r8.f86684b
            com.revolut.feature.shared.savings.models.product.ProductGroup$ProductArticle r2 = r9.f86526j
            if (r2 == 0) goto La1
            com.revolut.feature.product_article.api.models.ProductArticleParams r9 = new com.revolut.feature.product_article.api.models.ProductArticleParams
            com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Id r4 = new com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Id
            java.lang.String r5 = r2.f86567a
            r4.<init>(r5)
            java.util.LinkedHashMap r5 = r2.f86568b
            r9.<init>(r4, r5)
            boolean r4 = r2.f86569c
            if (r4 == 0) goto L58
            goto L7a
        L58:
            r0.f307000w = r8
            r0.f307001x = r2
            r0.f307002y = r9
            r0.u = r7
            r0.v = r4
            r0.B = r3
            zja.a r3 = r6.f83273r
            kka.h r3 = (kka.h) r3
            com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour$SkipIfWasAlreadyShown r5 = com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a
            java.lang.Object r0 = r3.e(r9, r5, r0)
            if (r0 != r1) goto L71
            return r1
        L71:
            r1 = r9
            r9 = r0
        L73:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r3 = r9.booleanValue()
            r9 = r1
        L7a:
            if (r3 != 0) goto L7d
            goto La1
        L7d:
            if (r7 == 0) goto L90
            com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.SavingsOnboardingFlowContract$Step$Article$PreFlow r7 = new com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.SavingsOnboardingFlowContract$Step$Article$PreFlow
            com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.SavingsOnboardingFlowContract$Step$Article$Type$Product r0 = new com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.SavingsOnboardingFlowContract$Step$Article$Type$Product
            com.revolut.feature.shared.savings.models.product.SavingsProduct r8 = r8.f86683a
            ncd.g r8 = r8.f86619c
            r0.<init>(r8)
            java.lang.String r8 = r2.d
            r7.<init>(r0, r9, r4, r8)
            return r7
        L90:
            com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.SavingsOnboardingFlowContract$Step$Article$InFlow r7 = new com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.SavingsOnboardingFlowContract$Step$Article$InFlow
            com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.SavingsOnboardingFlowContract$Step$Article$Type$Product r0 = new com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.SavingsOnboardingFlowContract$Step$Article$Type$Product
            com.revolut.feature.shared.savings.models.product.SavingsProduct r8 = r8.f86683a
            ncd.g r8 = r8.f86619c
            r0.<init>(r8)
            java.lang.String r8 = r2.d
            r7.<init>(r0, r9, r4, r8)
            return r7
        La1:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.e.Q2(boolean, com.revolut.feature.shared.savings.models.product.SavingsProductData, gim.c):java.lang.Object");
    }

    public final void R2(Throwable th10) {
        l.a1(this, this.u.Z2(th10 instanceof SavingsOnboardingFlowContract$FailResolveFirstStepException ? ((SavingsOnboardingFlowContract$FailResolveFirstStepException) th10).f83236a : th10), null, null, new f(th10, this, null, 5), 3);
    }

    public final boolean S2() {
        SavingAccountType accountType = this.o.f83238b;
        vlb.e eVar = this.f83276w;
        eVar.getClass();
        gte.a aVar = eVar.f290312a;
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        if (accountType instanceof SavingAccountType.Personal) {
            return eVar.b();
        }
        if (accountType instanceof SavingAccountType.Joint) {
            if (eVar.b()) {
                return ((jte.d) aVar).c(JointAccountsApi$Toggles$JointSavingsOnboardingRevamp.f76464c);
            }
            return false;
        }
        if (!(accountType instanceof SavingAccountType.Junior)) {
            throw new NoWhenBranchMatchedException();
        }
        if (eVar.b()) {
            return ((jte.d) aVar).c(SavingsApi$Toggles.YouthSavingsOnboardingRevamp.f83086c);
        }
        return false;
    }

    @Override // yji.l
    public final void T1(long j2) {
        l.b1(this, this.f83275t.f298469a, null, new u(this, null, 2), 3);
    }

    public final void T2(SavingsOnboardingFlowContract$Step savingsOnboardingFlowContract$Step) {
        H2(this.B, new xe7.a(savingsOnboardingFlowContract$Step, 15));
        boolean z = savingsOnboardingFlowContract$Step instanceof SavingsOnboardingFlowContract$Step.Article;
        i iVar = this.C;
        if (z) {
            h.w2(iVar, savingsOnboardingFlowContract$Step, ModalDestination.Style.POPUP.f98311a);
            return;
        }
        if ((savingsOnboardingFlowContract$Step instanceof SavingsOnboardingFlowContract$Step.TieredLimits) || (savingsOnboardingFlowContract$Step instanceof SavingsOnboardingFlowContract$Step.PendingJointAccount)) {
            h.w2(iVar, savingsOnboardingFlowContract$Step, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
            return;
        }
        if (!(savingsOnboardingFlowContract$Step instanceof SavingsOnboardingFlowContract$Step.OptionSelection) && !(savingsOnboardingFlowContract$Step instanceof SavingsOnboardingFlowContract$Step.ProductDetailsReview) && !(savingsOnboardingFlowContract$Step instanceof SavingsOnboardingFlowContract$Step.Upsell) && !(savingsOnboardingFlowContract$Step instanceof SavingsOnboardingFlowContract$Step.Documents) && !(savingsOnboardingFlowContract$Step instanceof SavingsOnboardingFlowContract$Step.ProtectionAndSafety) && !(savingsOnboardingFlowContract$Step instanceof SavingsOnboardingFlowContract$Step.FundInfo) && !(savingsOnboardingFlowContract$Step instanceof SavingsOnboardingFlowContract$Step.InterestAndFees) && !(savingsOnboardingFlowContract$Step instanceof SavingsOnboardingFlowContract$Step.SelectCurrency) && !(savingsOnboardingFlowContract$Step instanceof SavingsOnboardingFlowContract$Step.SelectTerm) && !(savingsOnboardingFlowContract$Step instanceof SavingsOnboardingFlowContract$Step.ChallengeSetup) && !(savingsOnboardingFlowContract$Step instanceof SavingsOnboardingFlowContract$Step.ChallengeReview) && !(savingsOnboardingFlowContract$Step instanceof SavingsOnboardingFlowContract$Step.AccountCreation)) {
            throw new NoWhenBranchMatchedException();
        }
        h.u2(this, iVar, savingsOnboardingFlowContract$Step, null, 6);
    }

    public final jhi.b U2() {
        ncd.h hVar;
        Flow flowI;
        Flow flowI2;
        boolean zC = ((jte.d) this.f83278y).c(SavingsApi$Toggles.SavingsOnboardingForceFetch.f83083c);
        w4l.h hVar2 = w4l.h.f294642c;
        w4l.k kVar = zC ? w4l.i.f294643c : hVar2;
        SavingsOnboardingFlowContract$Input savingsOnboardingFlowContract$Input = this.o;
        SavingAccountType savingAccountType = savingsOnboardingFlowContract$Input.f83238b;
        Intrinsics.checkNotNullParameter(savingAccountType, "<this>");
        if (savingAccountType instanceof SavingAccountType.Junior) {
            hVar = ncd.h.YOUTH;
        } else if (savingAccountType instanceof SavingAccountType.Personal) {
            hVar = ncd.h.PERSONAL;
        } else {
            if (!(savingAccountType instanceof SavingAccountType.Joint)) {
                throw new NoWhenBranchMatchedException();
            }
            hVar = ncd.h.PERSONAL_JOINT;
        }
        akg.n nVarA = ijb.a.a(this.f83271p, hVar, null, null, kVar, 6);
        SavingAccountType savingAccountType2 = savingsOnboardingFlowContract$Input.f83238b;
        boolean zF = Intrinsics.f(savingAccountType2, SavingAccountType.Personal.f94740a);
        od0.i iVar = od0.i.f224256b;
        if (zF) {
            flowI = rd0.e.b(nim.a.w(this.f83272q.q(), new xif.c(26)));
        } else {
            if (!(savingAccountType2 instanceof SavingAccountType.Joint) && !(savingAccountType2 instanceof SavingAccountType.Junior)) {
                throw new NoWhenBranchMatchedException();
            }
            od0.i.Companion.getClass();
            flowI = zi0.c.i(iVar);
        }
        if (S2()) {
            flowI2 = nim.a.A(nim.a.v(this.f83274s.l(hVar2), new xif.c(27)), new xif.c(25));
        } else {
            od0.i.Companion.getClass();
            flowI2 = zi0.c.i(iVar);
        }
        return mo3.a.g(nim.a.v(u0.i(nVarA, flowI, flowI2), new xlb.k(this, 3)), null, new xlb.l(0), 1);
    }

    @Override // cli.z
    public final g getState() {
        return this.B;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.C;
    }
}
