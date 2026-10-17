package kkf;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i extends yji.n implements elf.s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f184730l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final vlf.b f184731m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final klf.i f184732n;
    public final klf.m1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final wlf.a f184733p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final od0.i f184734q;

    public i(klf.h0 commonDataSource, vlf.b commonUiMapper, klf.i cardDataSource, klf.m1 juniorDataSource, wlf.a otpTransferMapper) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(commonUiMapper, "commonUiMapper");
        Intrinsics.checkNotNullParameter(cardDataSource, "cardDataSource");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        Intrinsics.checkNotNullParameter(otpTransferMapper, "otpTransferMapper");
        od0.i customCardNavigationProvider = od0.i.f224256b;
        Intrinsics.checkNotNullParameter(customCardNavigationProvider, "customCardNavigationProvider");
        this.f184730l = commonDataSource;
        this.f184731m = commonUiMapper;
        this.f184732n = cardDataSource;
        this.o = juniorDataSource;
        this.f184733p = otpTransferMapper;
        this.f184734q = customCardNavigationProvider;
    }

    public final cmf.p Z2() {
        klf.h0 h0Var = this.f184730l;
        return new cmf.p(ta6.a.h(h0Var.d(), h0Var.c(), vkm.q.Q(this.o.a(), new jy6.l((Continuation) null, this, 14)), new b9k.a(4, this, i.class, "buildBlock", "buildBlock(Lcom/revolut/feature/transactions/models/Transaction;Lcom/revolut/feature/transactions/models/TransactionDetails;Lcom/revolut/feature/cards/models/revolutcard/RevolutCard;)Ljava/util/List;", 4, 3)), new chc.c0(23), zhm.u.c(this), "General");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(java.lang.Object r10, gim.c r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof kkf.h
            if (r0 == 0) goto L13
            r0 = r11
            kkf.h r0 = (kkf.h) r0
            int r1 = r0.f184709x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f184709x = r1
            goto L18
        L13:
            kkf.h r0 = new kkf.h
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f184709x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r10 = r0.u
            yhm.o.b(r11)
            goto L52
        L29:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L31:
            yhm.o.b(r11)
            boolean r11 = r10 instanceof java.lang.String
            if (r11 == 0) goto L3b
            java.lang.String r10 = (java.lang.String) r10
            goto L3c
        L3b:
            r10 = 0
        L3c:
            if (r10 != 0) goto L41
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            return r10
        L41:
            klf.h0 r11 = r9.f184730l
            kotlinx.coroutines.flow.SharedFlow r11 = r11.d()
            r0.u = r10
            r0.f184709x = r3
            java.lang.Object r11 = vkm.q.x(r11, r0)
            if (r11 != r1) goto L52
            return r1
        L52:
            tof.a3 r11 = (tof.a3) r11
            od0.i r0 = r9.f184734q
            java.lang.Object r0 = r0.g()
            if (r0 != 0) goto L77
            com.revolut.feature.card_screen.api.navigation.CardsCarouselFlowDestination r1 = new com.revolut.feature.card_screen.api.navigation.CardsCarouselFlowDestination
            java.lang.String r2 = r11.f272584c
            com.revolut.feature.card_screen.api.models.CardScreenAction$Select r6 = new com.revolut.feature.card_screen.api.models.CardScreenAction$Select
            r11 = 6
            r0 = 0
            r6.<init>(r10, r11, r0, r0)
            r7 = 0
            r8 = 38
            r3 = 0
            r4 = 0
            com.revolut.core.model.account.AccountId$Personal r5 = com.revolut.core.model.account.AccountId.Personal.f51414a
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r9.A2(r1)
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            return r10
        L77:
            java.lang.ClassCastException r10 = new java.lang.ClassCastException
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kkf.i.b3(java.lang.Object, gim.c):java.lang.Object");
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        return Intrinsics.f(str, "ID_EXTRAS_CARD") ? b3(obj2, (gim.c) continuation) : Boolean.FALSE;
    }
}
