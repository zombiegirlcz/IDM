package com.revolut.feature.card_design.impl.card_design.carousel;

import android.os.Parcelable;
import ce9.m;
import cli.y;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.card_design.api.CardDesignApi$Toggles$VirtualCardsRevPointsUnlockCondition;
import com.revolut.feature.card_design.impl.card_design.carousel.f;
import com.revolut.feature.card_payment_method.api.declaration.SelectedPaymentMethodResultContract$SelectedCardBindingStrategy;
import com.revolut.feature.cards.models.design.CardDesignLockInfo;
import com.revolut.feature.cards_core.R$string;
import com.revolut.feature.checklist_challenges.api.models.ChecklistChallenge;
import com.revolut.feature.pricing_plans.unlock_benefits.api.PricingPlansUnlockBenefitsApi$Toggles$PlanBenefitsUnlock;
import com.revolut.feature.pricing_plans.unlock_benefits.api.navigation.PricingPlansUnlockBenefitsDestination;
import com.revolut.feature.retail.private_banking.api.navigation.DepositAssetsDestination;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.bridge.navigation.KompotFeatureConfig;
import cu8.r0;
import dfj.v;
import e7l.g;
import efm.r;
import ffk.t;
import grl.k9;
import h93.j0;
import h93.l0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import n1g.p;
import nii.y0;
import oki.h;
import om4.m4;
import org.jetbrains.annotations.NotNull;
import qij.s;
import sbb.w;
import ss4.z;
import sx2.b0;
import sx2.c0;
import sx2.e0;
import sx2.g0;
import sx2.i;
import sx2.i0;
import sx2.o;
import sx2.x;
import vkm.j2;
import vkm.q;
import wkm.l;
import wsg.n;
import yhm.j;
import zh9.u0;
import zhm.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends h implements b0 {

    @NotNull
    public static final i Companion = new i();
    public final m4 A;
    public final z43.a B;
    public final ix2.c C;
    public final gte.a D;
    public final l93.f E;
    public final kx2.a F;
    public final al4.b G;
    public final r0 H;
    public final j2 I;
    public final j2 J;
    public final j2 K;
    public final j2 L;
    public final Lazy M;
    public final y N;
    public final com.revolut.kompot.navigable.vc.modal.a O;
    public final CardDesignCarouselScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f64707p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final hy2.f f64708q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ang.f f64709r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final hy2.h f64710s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final fk3.a f64711t;
    public final ha3.c u;
    public final n v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final lg3.a f64712w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final r70.c f64713x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final jla.h f64714y;
    public final hj8.a z;

    public e(cli.n stateMapper, CardDesignCarouselScreenContract$InputData inputData, t pricingPlanInteractor, hy2.f cardDesignInteractor, ang.f userInteractor, hy2.h cardDesignRenderAvailabilityInteractor, fk3.a configurationInteractor, ha3.c cardPromotionsInteractor, n walletInteractor, lg3.a checklistChallengesInteractor, r70.c hapticEngine, jla.h productCatalogueInteractor, hj8.a juniorProfileInteractor, m4 familyCreditCardWalletInteractor, z43.a cardPersonalisationInteractor, ix2.c cardDesignTextureGroupMapper, gte.a featureToggleInteractor, l93.f revolutCardsInteractor, kx2.a multiCurrencyWorkflowInteractor, al4.b comboCardInteractor, r0 kycRequiredActionTransformer) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(cardDesignInteractor, "cardDesignInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(cardDesignRenderAvailabilityInteractor, "cardDesignRenderAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(cardPromotionsInteractor, "cardPromotionsInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(checklistChallengesInteractor, "checklistChallengesInteractor");
        Intrinsics.checkNotNullParameter(hapticEngine, "hapticEngine");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(familyCreditCardWalletInteractor, "familyCreditCardWalletInteractor");
        Intrinsics.checkNotNullParameter(cardPersonalisationInteractor, "cardPersonalisationInteractor");
        Intrinsics.checkNotNullParameter(cardDesignTextureGroupMapper, "cardDesignTextureGroupMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        Intrinsics.checkNotNullParameter(multiCurrencyWorkflowInteractor, "multiCurrencyWorkflowInteractor");
        Intrinsics.checkNotNullParameter(comboCardInteractor, "comboCardInteractor");
        Intrinsics.checkNotNullParameter(kycRequiredActionTransformer, "kycRequiredActionTransformer");
        this.o = inputData;
        this.f64707p = pricingPlanInteractor;
        this.f64708q = cardDesignInteractor;
        this.f64709r = userInteractor;
        this.f64710s = cardDesignRenderAvailabilityInteractor;
        this.f64711t = configurationInteractor;
        this.u = cardPromotionsInteractor;
        this.v = walletInteractor;
        this.f64712w = checklistChallengesInteractor;
        this.f64713x = hapticEngine;
        this.f64714y = productCatalogueInteractor;
        this.z = juniorProfileInteractor;
        this.A = familyCreditCardWalletInteractor;
        this.B = cardPersonalisationInteractor;
        this.C = cardDesignTextureGroupMapper;
        this.D = featureToggleInteractor;
        this.E = revolutCardsInteractor;
        this.F = multiCurrencyWorkflowInteractor;
        this.G = comboCardInteractor;
        this.H = kycRequiredActionTransformer;
        this.I = m72.b.y(null, null, true, 3, null);
        this.J = m72.b.y(null, null, true, 3, null);
        this.K = m72.b.y(null, null, true, 3, null);
        this.L = q.c(inputData.f64690p);
        this.M = j.b(new sii.a(this, 9));
        this.N = mra.d.b(this, new c0(inputData.f64682b, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), null, null, bla.c.NOT_AVAILABLE, false, inputData.f64692r, inputData.u, false), stateMapper, null, false, 12);
        this.O = hx7.e.a(this, new suf.a(this, 5));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.card_design.impl.card_design.carousel.e r5, e93.f r6, gim.c r7) {
        /*
            com.revolut.feature.card_design.impl.card_design.carousel.CardDesignCarouselScreenContract$InputData r0 = r5.o
            boolean r1 = r7 instanceof sx2.m
            if (r1 == 0) goto L15
            r1 = r7
            sx2.m r1 = (sx2.m) r1
            int r2 = r1.f266308w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f266308w = r2
            goto L1a
        L15:
            sx2.m r1 = new sx2.m
            r1.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f266308w
            r4 = 1
            if (r3 == 0) goto L31
            if (r3 != r4) goto L29
            yhm.o.b(r7)
            goto L92
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r7)
            java.lang.String r7 = r0.f64686j
            boolean r6 = ce9.m.w(r6)
            od0.i r3 = od0.i.f224256b
            if (r6 == 0) goto L98
            com.revolut.core.model.account.AccountId r6 = r0.f64685h
            boolean r6 = r6 instanceof com.revolut.core.model.account.AccountId.Joint
            if (r6 != 0) goto L98
            if (r7 != 0) goto L47
            goto L98
        L47:
            wsg.n r6 = r5.v
            efm.r r6 = r6.b0(r7)
            sx2.f r7 = new sx2.f
            r0 = 4
            r7.<init>(r5, r0)
            efm.r r5 = pd.b.r(r6, r7)
            ss4.a0 r6 = new ss4.a0
            r7 = 11
            r6.<init>(r7)
            r7 = 0
            efm.r r5 = m70.a.g(r5, r7, r6, r4)
            sx2.g r6 = new sx2.g
            r7 = 5
            r6.<init>(r7)
            sp5.h r7 = new sp5.h
            r0 = 28
            r7.<init>(r0, r6)
            efm.r r5 = r5.map(r7)
            java.lang.String r6 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            od0.h r6 = od0.i.Companion
            r6.getClass()
            efm.r r5 = ue0.e.E(r5, r3)
            sq5.j r6 = new sq5.j
            r7 = 20
            r6.<init>(r7)
            r1.f266308w = r4
            java.lang.Object r7 = nim.a.d(r5, r6, r1)
            if (r7 != r2) goto L92
            return r2
        L92:
            kotlin.jvm.internal.Intrinsics.h(r7)
            od0.i r7 = (od0.i) r7
            return r7
        L98:
            od0.h r5 = od0.i.Companion
            r5.getClass()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.card_design.impl.card_design.carousel.e.I2(com.revolut.feature.card_design.impl.card_design.carousel.e, e93.f, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.feature.card_design.impl.card_design.carousel.e r4, java.lang.String r5, hha.d r6, h93.l0 r7, java.lang.String r8, gim.c r9) throws sx2.j {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.card_design.impl.card_design.carousel.e.J2(com.revolut.feature.card_design.impl.card_design.carousel.e, java.lang.String, hha.d, h93.l0, java.lang.String, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        int i = 1;
        Continuation continuation = null;
        l2(new sx2.t(i, this, continuation), new yi5.b(26));
        int i2 = 0;
        vkm.d flow1 = rd0.e.b(this.f64709r.k(false));
        t tVar = this.f64707p;
        Flow flow2 = rd0.e.b(tVar.q());
        CardDesignCarouselScreenContract$InputData cardDesignCarouselScreenContract$InputData = this.o;
        int i3 = 3;
        if (cardDesignCarouselScreenContract$InputData.f64681a != null) {
            flow2 = nim.a.v(u0.m(rd0.e.b(nim.a.w(tVar.n(), new sx2.f(this, i2))), flow2), new sx2.g(i3));
        }
        vkm.d flow3 = rd0.e.b(tVar.n());
        ik3.c cVar = (ik3.c) this.f64711t;
        g.b bVar = g.b.f123407a;
        w4l.h hVar = w4l.h.f294642c;
        vkm.d flow4 = rd0.e.b(cVar.l(bVar, hVar));
        Flow flow5 = boh.f.e(cardDesignCarouselScreenContract$InputData.o == j0.FAMILY ? nim.a.v(this.A.a(), new z(29)) : rd0.e.b(nim.a.w(this.v.X(cardDesignCarouselScreenContract$InputData.f64685h, hVar), new sx2.g(i2))), new sx2.f(this, i));
        exe.j flow6 = bla.b.b(this.f64714y, "revolut_card.multi_currency_card");
        o oVar = new o(i, this, continuation);
        j2 j2Var = this.L;
        l flow7 = q.Q(j2Var, oVar);
        Flow flow8 = ((om4.f) this.G).b();
        x transform = new x(null);
        Intrinsics.checkNotNullParameter(flow1, "flow1");
        Intrinsics.checkNotNullParameter(flow2, "flow2");
        Intrinsics.checkNotNullParameter(flow3, "flow3");
        Intrinsics.checkNotNullParameter(flow4, "flow4");
        Intrinsics.checkNotNullParameter(flow5, "flow5");
        Intrinsics.checkNotNullParameter(flow6, "flow6");
        Intrinsics.checkNotNullParameter(flow7, "flow7");
        Intrinsics.checkNotNullParameter(flow8, "flow8");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int i5 = 6;
        yji.l.a1(this, new oi3.g(new Flow[]{flow1, flow2, flow3, flow4, flow5, flow6, flow7, flow8}, transform, i), null, null, new sx2.z(this, null), 3);
        s sVar = new s(this.K, 14);
        pg3.b bVar2 = (pg3.b) this.f64712w;
        yji.l.a1(this, q.Q(q.q(yh5.b.g(sVar, j2Var, q.q(rd0.e.e(new rv6.e(new ay2.f(bVar2.f(), 1), 5), h0.f322473a, new qtb.o(i3, 27, continuation))), L2())), new o(i2, this, continuation)), null, null, new w(this, continuation, 29), 3);
        if (((jte.d) this.D).c(CardDesignApi$Toggles$VirtualCardsRevPointsUnlockCondition.f64538c)) {
            n5b.d dVar = bVar2.d;
            yji.l.a1(this, q.Q(new rv6.e(new p(q.g(((ivb.l) dVar.f212569a.f200357a).f168819b), dVar, i5), 6), new v(this, null)), null, null, null, 7);
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.O;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object K2(h93.l0 r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof sx2.l
            if (r0 == 0) goto L13
            r0 = r6
            sx2.l r0 = (sx2.l) r0
            int r1 = r0.f266303x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f266303x = r1
            goto L18
        L13:
            sx2.l r0 = new sx2.l
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f266303x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            h93.l0 r5 = r0.u
            yhm.o.b(r6)
            goto L49
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            l93.f r6 = r4.E
            efm.r r6 = l93.f.i(r6)
            vkm.d r6 = rd0.e.b(r6)
            r0.u = r5
            r0.f266303x = r3
            java.lang.Object r6 = vkm.q.z(r6, r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            java.util.List r6 = (java.util.List) r6
            r0 = 0
            if (r6 == 0) goto L6c
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L54:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L6a
            java.lang.Object r1 = r6.next()
            r2 = r1
            h93.f0 r2 = (h93.f0) r2
            boolean r3 = r2.d
            if (r3 != 0) goto L54
            h93.l0 r2 = r2.G
            if (r2 != r5) goto L54
            r0 = r1
        L6a:
            h93.f0 r0 = (h93.f0) r0
        L6c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.card_design.impl.card_design.carousel.e.K2(h93.l0, gim.c):java.lang.Object");
    }

    public final Flow L2() {
        String str;
        CardDesignCarouselScreenContract$InputData cardDesignCarouselScreenContract$InputData = this.o;
        AccountId accountId = cardDesignCarouselScreenContract$InputData.f64685h;
        AccountId.Joint joint = accountId instanceof AccountId.Joint ? (AccountId.Joint) accountId : null;
        if (joint == null || (str = joint.f51413b) == null) {
            str = cardDesignCarouselScreenContract$InputData.f64686j;
        }
        if (str != null) {
            od0.i.Companion.getClass();
            return new go.g(od0.h.a(str), 2);
        }
        if (cardDesignCarouselScreenContract$InputData.o == j0.FAMILY) {
            return mo3.a.g(nim.a.v(this.A.a(), new sx2.g(4)), null, null, 3);
        }
        od0.i.Companion.getClass();
        return new go.g(od0.i.f224256b, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0104  */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M2(com.revolut.feature.card_design.impl.card_design.carousel.g r9) {
        /*
            Method dump skipped, instruction units count: 760
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.card_design.impl.card_design.carousel.e.M2(com.revolut.feature.card_design.impl.card_design.carousel.g):void");
    }

    public final void N2(e93.d dVar, hha.d dVar2, List list, SelectedPaymentMethodResultContract$SelectedCardBindingStrategy selectedPaymentMethodResultContract$SelectedCardBindingStrategy) {
        boolean z;
        pi3.h hVar = this.o.f64681a;
        List list2 = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list2) {
            if (hha.s.k((hha.d) obj2)) {
                arrayList.add(obj2);
            }
        }
        if (hha.s.g(dVar2) || arrayList.isEmpty()) {
            z = false;
        } else {
            Iterator it8 = arrayList.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                if (hha.s.g((hha.d) it8.next())) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : list2) {
                        if (hha.s.k((hha.d) obj3)) {
                            arrayList2.add(obj3);
                        }
                    }
                    if (hha.s.i(dVar2) || arrayList2.isEmpty()) {
                        break;
                    }
                    Iterator it9 = arrayList2.iterator();
                    while (it9.hasNext()) {
                        if (hha.s.i((hha.d) it9.next())) {
                            z = true;
                            break;
                        }
                    }
                }
            }
            z = false;
        }
        C2(new e0(dVar, hVar, dVar2, z, selectedPaymentMethodResultContract$SelectedCardBindingStrategy));
    }

    public final r O2(hha.d dVar, l0 l0Var, String str, boolean z) {
        CardDesignCarouselScreenContract$InputData cardDesignCarouselScreenContract$InputData = this.o;
        return this.f64708q.l(cardDesignCarouselScreenContract$InputData.f64682b == c93.e.DISPOSABLE, dVar, cardDesignCarouselScreenContract$InputData.f64683c, cardDesignCarouselScreenContract$InputData.d, cardDesignCarouselScreenContract$InputData.o, l0Var, str, cardDesignCarouselScreenContract$InputData.f64684g, cardDesignCarouselScreenContract$InputData.f64689n, z);
    }

    public final void P2() {
        y yVar = this.N;
        j2 j2Var = (j2) yVar.f22677a;
        j2 j2Var2 = (j2) yVar.f22677a;
        e93.q qVar = (e93.q) ((c0) j2Var.getValue()).f.getContent();
        e93.f fVar = qVar != null ? qVar.f123888b : null;
        if (fVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        if (!(fVar instanceof e93.d)) {
            if (!(fVar instanceof e93.e)) {
                throw new NoWhenBranchMatchedException();
            }
            e93.e eVar = (e93.e) fVar;
            Object content = ((c0) j2Var2.getValue()).e.getContent();
            if (content == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            b93.b bVar = eVar.f123843c;
            List list = ((e7l.f) content).f123377k0;
            if (list != null && d0.T(list, bVar)) {
                Q2(eVar);
                return;
            } else if (m.u(eVar)) {
                C2(new sx2.h0(eVar));
                return;
            } else {
                C2(new sx2.j0(eVar));
                return;
            }
        }
        e93.d dVar = (e93.d) fVar;
        Object content2 = ((c0) j2Var2.getValue()).f266273c.getContent();
        if (content2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        hha.d dVar2 = (hha.d) content2;
        Object content3 = ((c0) j2Var2.getValue()).e.getContent();
        if (content3 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        e7l.f fVar2 = (e7l.f) content3;
        Object content4 = ((c0) j2Var2.getValue()).d.getContent();
        if (content4 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        List list2 = (List) content4;
        boolean zG = this.f64708q.g(dVar, dVar2);
        CardDesignCarouselScreenContract$InputData cardDesignCarouselScreenContract$InputData = this.o;
        if (zG) {
            C2(new i0(dVar2, uj3.b.h(dVar, list2), cardDesignCarouselScreenContract$InputData.f64685h, dVar));
            return;
        }
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        c93.h.Companion.getClass();
        if (m.r(dVar, c93.h.k)) {
            C2(new g0(dVar, cardDesignCarouselScreenContract$InputData.f64681a, dVar2));
            return;
        }
        b93.b bVar2 = dVar.f123827c;
        List list3 = fVar2.f123377k0;
        if (list3 != null && d0.T(list3, bVar2)) {
            Q2(dVar);
            return;
        }
        if (dVar.f123834p != null) {
            C2(f.b.f64716a);
            return;
        }
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        if (dVar.v == l0.CRYPTO) {
            C2(f.d.f64717a);
        } else {
            N2(dVar, dVar2, list2, null);
        }
    }

    public final void Q2(e93.f fVar) {
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.card_out_of_stock_error_title, null, null, 14);
        if (fVar instanceof e93.d) {
            textLocalisedClause = new TextLocalisedClause(R$string.card_out_of_stock_physical_description, null, null, 14);
        } else {
            if (!(fVar instanceof e93.e)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.card_out_of_stock_virtual_description, null, null, 14);
        }
        X1(new y0("ID_CARD_OUT_OF_STICK_OK", new nii.l0(textLocalisedClause2, textLocalisedClause, null, new TextLocalisedClause(com.revolut.kompot.common.R$string.common_action_ok, null, null, 14), null, null, false, null, 1012), false, 4));
    }

    public final void R2(e93.f fVar, CardDesignLockInfo cardDesignLockInfo) {
        boolean z = cardDesignLockInfo instanceof CardDesignLockInfo.Challenge;
        lg3.a aVar = this.f64712w;
        if (z) {
            ChecklistChallenge checklistChallenge = ((CardDesignLockInfo.Challenge) cardDesignLockInfo).f65531b;
            k9 k9Var = k9.Cards;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            KompotFeatureConfig kompotFeatureConfigD = ((pg3.b) aVar).d(checklistChallenge, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var));
            if (kompotFeatureConfigD != null) {
                C1(new BridgeDestination(gc0.c.f(kompotFeatureConfigD)));
                return;
            } else {
                efm.b.n(new IllegalStateException(j6.a.q("Couldn't find active challenge for ", fVar.c().f13615a)));
                return;
            }
        }
        if (cardDesignLockInfo instanceof CardDesignLockInfo.AssetUnderManagement) {
            if (((jte.d) this.D).c(PricingPlansUnlockBenefitsApi$Toggles$PlanBenefitsUnlock.f80963c)) {
                C1(new PricingPlansUnlockBenefitsDestination(false));
                return;
            } else {
                C1(new DepositAssetsDestination(false));
                return;
            }
        }
        if (!(cardDesignLockInfo instanceof CardDesignLockInfo.RevPoints)) {
            throw new NoWhenBranchMatchedException();
        }
        String productId = ((CardDesignLockInfo.RevPoints) cardDesignLockInfo).f65534b;
        pg3.b bVar = (pg3.b) aVar;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(productId, "productId");
        C1(new BridgeDestination(gc0.c.f(bVar.e(productId))));
    }

    @Override // yji.l
    public final void T1(long j2) {
        e93.q qVar;
        od0.i iVar;
        List list;
        Object next;
        Object next2;
        y yVar = this.N;
        j2 j2Var = (j2) yVar.f22677a;
        j2 j2Var2 = (j2) yVar.f22677a;
        String str = ((c0) j2Var.getValue()).f266276j;
        if (str == null || (qVar = (e93.q) ((c0) j2Var2.getValue()).f.getContent()) == null || (iVar = (od0.i) ((c0) j2Var2.getValue()).f266274g.getContent()) == null || (list = (List) iVar.f224257a) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof CardDesignLockInfo.Challenge) {
                arrayList.add(obj2);
            }
        }
        Iterator it8 = arrayList.iterator();
        while (true) {
            if (it8.hasNext()) {
                next = it8.next();
                if (Intrinsics.f(((CardDesignLockInfo.Challenge) next).f65531b.f65775a, str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        CardDesignLockInfo.Challenge challenge = (CardDesignLockInfo.Challenge) next;
        if (challenge == null) {
            return;
        }
        Iterator it9 = qVar.d.iterator();
        while (true) {
            if (it9.hasNext()) {
                next2 = it9.next();
                if (Intrinsics.f(((e93.f) next2).c(), challenge.f65530a)) {
                    break;
                }
            } else {
                next2 = null;
                break;
            }
        }
        e93.f fVar = (e93.f) next2;
        if (fVar == null) {
            fVar = qVar.f123888b;
        }
        e93.q qVarA = e93.q.a(qVar, null, fVar, 1);
        H2(yVar, new sl5.a(qVarA, 29));
        l2(new sx2.n(this, qVarA, challenge, null), new yi5.b(26));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.N;
    }
}
