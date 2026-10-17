package n6b;

import c7b.o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r10.f f212765a;

    public h(r10.f subscribeActionHandler) {
        Intrinsics.checkNotNullParameter(subscribeActionHandler, "subscribeActionHandler");
        this.f212765a = subscribeActionHandler;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // c7b.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlan r5, java.lang.String r6, gim.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof n6b.g
            if (r0 == 0) goto L13
            r0 = r7
            n6b.g r0 = (n6b.g) r0
            int r1 = r0.f212764x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f212764x = r1
            goto L18
        L13:
            n6b.g r0 = new n6b.g
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f212764x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlan r5 = r0.u
            yhm.o.b(r7)
            goto L49
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r7)
            r7 = 3
            r2 = 0
            com.revolut.feature.retail.cobranded_cards.impl.presentation.flows.CobrandedCardsCardOrderContext r6 = com.revolut.feature.retail.cobranded_cards.impl.presentation.flows.a.a(r5, r2, r2, r6, r7)
            r0.u = r5
            r0.f212764x = r3
            com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsCardConfiguration r7 = r6.d
            r10.f r2 = r4.f212765a
            java.io.Serializable r7 = r2.x0(r6, r7, r0)
            if (r7 != r1) goto L49
            return r1
        L49:
            e93.f r7 = (e93.f) r7
            c7b.j r6 = new c7b.j
            com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsCardConfiguration r5 = r5.f82308h
            r6.<init>(r7, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: n6b.h.a(com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlan, java.lang.String, gim.c):java.lang.Object");
    }
}
