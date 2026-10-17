package com.revolut.feature.junior.card_request.impl.ui.flow.request_review;

import com.revolut.feature.junior.card_request.impl.ui.flow.request_review.CardRequestReviewFlowContract$Step;
import com.revolut.feature.junior.card_request.impl.ui.screen.request_review.CardRequestReviewScreen;
import com.revolut.feature.junior.card_request.impl.ui.screen.request_review.CardRequestReviewScreenContract$InputData;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import jc8.c;
import k5e.k;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import q78.e;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends g implements k98.b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final CardRequestReviewFlowContract$InputData f76726t;
    public final e u;
    public final CardRequestReviewFlowContract$Step.Review v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final CardRequestReviewFlowContract$State f76727w;

    public b(CardRequestReviewFlowContract$InputData inputData, e juniorAccountDestinationResolver) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(juniorAccountDestinationResolver, "juniorAccountDestinationResolver");
        this.f76726t = inputData;
        this.u = juniorAccountDestinationResolver;
        this.v = CardRequestReviewFlowContract$Step.Review.f76724a;
        this.f76727w = CardRequestReviewFlowContract$State.f76723a;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object O2(com.revolut.feature.junior.card_request.impl.ui.flow.request_review.b r7, gim.c r8) {
        /*
            boolean r0 = r8 instanceof k98.c
            if (r0 == 0) goto L14
            r0 = r8
            k98.c r0 = (k98.c) r0
            int r1 = r0.f182295x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f182295x = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            k98.c r0 = new k98.c
            r0.<init>(r7, r8)
            goto L12
        L1a:
            java.lang.Object r8 = r5.v
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r5.f182295x
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            com.revolut.feature.junior.card_request.impl.ui.flow.request_review.b r7 = r5.u
            yhm.o.b(r8)
            goto L54
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            yhm.o.b(r8)
            com.revolut.feature.junior.card_request.impl.ui.flow.request_review.a$a r8 = com.revolut.feature.junior.card_request.impl.ui.flow.request_review.a.C0510a.f76725a
            r7.G2(r8)
            r7.I2()
            q78.e r1 = r7.u
            com.revolut.feature.junior.card_request.impl.ui.flow.request_review.CardRequestReviewFlowContract$InputData r8 = r7.f76726t
            java.lang.String r8 = r8.f76720a
            r5.u = r7
            r5.f182295x = r2
            r3 = 0
            r4 = 0
            r6 = 14
            r2 = r8
            java.lang.Object r8 = u68.b.c(r1, r2, r3, r4, r5, r6)
            if (r8 != r0) goto L54
            return r0
        L54:
            aii.u r8 = (aii.u) r8
            r7.C1(r8)
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.junior.card_request.impl.ui.flow.request_review.b.O2(com.revolut.feature.junior.card_request.impl.ui.flow.request_review.b, gim.c):java.lang.Object");
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        CardRequestReviewFlowContract$Step step = (CardRequestReviewFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (!Intrinsics.f(step, CardRequestReviewFlowContract$Step.Review.f76724a)) {
            throw new NoWhenBranchMatchedException();
        }
        CardRequestReviewFlowContract$InputData cardRequestReviewFlowContract$InputData = this.f76726t;
        String str = cardRequestReviewFlowContract$InputData.f76720a;
        c cVar = cardRequestReviewFlowContract$InputData.f76722c;
        CardRequestReviewScreen cardRequestReviewScreen = new CardRequestReviewScreen(new CardRequestReviewScreenContract$InputData(cardRequestReviewFlowContract$InputData.f76721b, str, cardRequestReviewFlowContract$InputData.d, cVar));
        k kVar = new k(this, 14);
        Intrinsics.checkNotNullParameter(kVar, "<set-?>");
        cardRequestReviewScreen.H = kVar;
        return cardRequestReviewScreen;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.f76727w;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.v;
    }
}
