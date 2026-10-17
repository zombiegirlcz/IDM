package n6i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final al4.n f212799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final al4.q f212800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cm4.a f212801c;

    public j(al4.n creditCardInteractor, al4.q creditCardProductInteractor, cm4.a creditCardBaseMapper) {
        Intrinsics.checkNotNullParameter(creditCardInteractor, "creditCardInteractor");
        Intrinsics.checkNotNullParameter(creditCardProductInteractor, "creditCardProductInteractor");
        Intrinsics.checkNotNullParameter(creditCardBaseMapper, "creditCardBaseMapper");
        this.f212799a = creditCardInteractor;
        this.f212800b = creditCardProductInteractor;
        this.f212801c = creditCardBaseMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof n6i.i
            if (r0 == 0) goto L13
            r0 = r9
            n6i.i r0 = (n6i.i) r0
            int r1 = r0.f212798w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f212798w = r1
            goto L18
        L13:
            n6i.i r0 = new n6i.i
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f212798w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r9)
            goto L79
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            yhm.o.b(r9)
            al4.n r9 = r7.f212799a
            om4.x2 r9 = (om4.x2) r9
            w4l.j r2 = w4l.j.f294644c
            kotlinx.coroutines.flow.Flow r2 = r9.l(r2)
            mll.h r4 = new mll.h
            r5 = 18
            r4.<init>(r8, r5)
            akg.n r2 = nim.a.v(r2, r4)
            w4l.h r4 = w4l.h.f294642c
            kotlinx.coroutines.flow.Flow r9 = r9.B(r8, r4)
            al4.q r4 = r7.f212800b
            om4.y3 r4 = (om4.y3) r4
            vkm.v1 r8 = r4.g(r8)
            n3j.w r4 = new n3j.w
            r5 = 8
            r6 = 0
            r4.<init>(r7, r6, r5)
            jhi.k r8 = nim.a.u(r4, r8)
            akg.n r8 = zh9.u0.i(r2, r9, r8)
            n33.l0 r9 = new n33.l0
            r2 = 22
            r9.<init>(r2)
            jhi.b r8 = mo3.a.g(r8, r6, r9, r3)
            r0.f212798w = r3
            java.lang.Object r9 = vkm.q.x(r8, r0)
            if (r9 != r1) goto L79
            return r1
        L79:
            yhm.r r9 = (yhm.r) r9
            java.lang.Object r8 = r9.f314201a
            com.revolut.feature.credit.card.models.CreditCard r8 = (com.revolut.feature.credit.card.models.CreditCard) r8
            java.lang.Object r0 = r9.f314202b
            com.revolut.feature.credit.card.api.models.creditcard.CreditCardPaymentDetails r0 = (com.revolut.feature.credit.card.api.models.creditcard.CreditCardPaymentDetails) r0
            java.lang.Object r9 = r9.f314203c
            od0.i r9 = (od0.i) r9
            com.revolut.feature_move_money.api.model.AccountWrapper r1 = new com.revolut.feature_move_money.api.model.AccountWrapper
            j8l.a r2 = j8l.a.CREDIT_CARD
            cm4.a r3 = r7.f212801c
            wq4.a r3 = (wq4.a) r3
            r4 = r3
            com.revolut.core.ui_kit.models.TextLocalisedClause r3 = r4.b()
            ep4.a r4 = r4.f299405a
            com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage r4 = r4.a()
            com.revolut.feature_move_money.api.model.AccountSource$CreditCardSource r5 = new com.revolut.feature_move_money.api.model.AccountSource$CreditCardSource
            java.lang.Object r9 = r9.f224257a
            com.revolut.feature.credit.card.api.models.limits.CreditCardLimits r9 = (com.revolut.feature.credit.card.api.models.limits.CreditCardLimits) r9
            r5.<init>(r8, r0, r9)
            r6 = 0
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: n6i.j.a(java.lang.String, gim.c):java.lang.Object");
    }
}
