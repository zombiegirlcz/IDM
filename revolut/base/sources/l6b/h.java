package l6b;

import c7b.o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r10.f f192381a;

    public h(r10.f subscribeActionHandler) {
        Intrinsics.checkNotNullParameter(subscribeActionHandler, "subscribeActionHandler");
        this.f192381a = subscribeActionHandler;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // c7b.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlan r6, java.lang.String r7, gim.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof l6b.g
            if (r0 == 0) goto L13
            r0 = r8
            l6b.g r0 = (l6b.g) r0
            int r1 = r0.f192380x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f192380x = r1
            goto L18
        L13:
            l6b.g r0 = new l6b.g
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f192380x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlan r6 = r0.u
            yhm.o.b(r8)
            goto L74
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            yhm.o.b(r8)
            r5b.i r8 = r6.f82309j
            r2 = -1
            if (r8 != 0) goto L3b
            r8 = r2
            goto L43
        L3b:
            int[] r4 = l6b.f.f192378a
            int r8 = r8.ordinal()
            r8 = r4[r8]
        L43:
            c7b.k$a r4 = c7b.k.a.f21898a
            if (r8 == r2) goto L7f
            if (r8 == r3) goto L7e
            r2 = 2
            r4 = 3
            if (r8 == r2) goto L60
            if (r8 == r4) goto L60
            r7 = 4
            if (r8 != r7) goto L5a
            c7b.l r7 = new c7b.l
            com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsCardConfiguration r8 = r6.f82308h
            r7.<init>(r6, r8)
            return r7
        L5a:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L60:
            r8 = 0
            com.revolut.feature.retail.cobranded_cards.impl.presentation.flows.CobrandedCardsCardOrderContext r7 = com.revolut.feature.retail.cobranded_cards.impl.presentation.flows.a.a(r6, r8, r8, r7, r4)
            r0.u = r6
            r0.f192380x = r3
            com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsCardConfiguration r8 = r7.d
            r10.f r2 = r5.f192381a
            java.io.Serializable r8 = r2.x0(r7, r8, r0)
            if (r8 != r1) goto L74
            return r1
        L74:
            e93.f r8 = (e93.f) r8
            c7b.j r7 = new c7b.j
            com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsCardConfiguration r6 = r6.f82308h
            r7.<init>(r8, r6)
            return r7
        L7e:
            return r4
        L7f:
            java.lang.String r6 = "plan.action must not be null on PlanSwitch screen"
            r6.b.D(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: l6b.h.a(com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlan, java.lang.String, gim.c):java.lang.Object");
    }
}
