package rgf;

import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class p extends gim.i implements Function2 {
    public Set u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ t f254167w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(t tVar, Continuation continuation) {
        super(2, continuation);
        this.f254167w = tVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new p(this.f254167w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((p) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a6  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r8.v
            r2 = 2
            rgf.t r3 = r8.f254167w
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L24
            if (r1 == r4) goto L20
            if (r1 != r2) goto L18
            java.util.Set r0 = r8.u
            java.util.Set r0 = (java.util.Set) r0
            yhm.o.b(r9)
            goto La2
        L18:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L20:
            yhm.o.b(r9)
            goto L67
        L24:
            yhm.o.b(r9)
            gte.a r9 = r3.f254170q
            com.revolut.feature.transactions.api.kompot.TransactionListApi$Toggles$HomeTotalWealth2 r1 = com.revolut.feature.transactions.api.kompot.TransactionListApi$Toggles$HomeTotalWealth2.f91962c
            jte.d r9 = (jte.d) r9
            boolean r1 = r9.c(r1)
            if (r1 == 0) goto Lb4
            com.revolut.feature.transactions.api.kompot.TransactionListApi$Toggles$UnifiedTransactionList r1 = com.revolut.feature.transactions.api.kompot.TransactionListApi$Toggles$UnifiedTransactionList.f91964c
            boolean r9 = r9.c(r1)
            if (r9 == 0) goto Lb4
            tzg.m r9 = r3.f254173t
            r1 = 3
            akg.n r9 = tzg.m.c(r9, r5, r5, r1)
            zfd.e r9 = zi0.c.w(r9)
            zhm.h0 r1 = zhm.h0.f322473a
            vkm.q0 r9 = rd0.e.n(r9, r1)
            rd3.k r1 = new rd3.k
            r6 = 20
            r1.<init>(r6)
            jhi.b r9 = mo3.a.g(r9, r5, r1, r4)
            qna.n r1 = new qna.n
            r6 = 13
            r1.<init>(r9, r3, r6)
            r8.v = r4
            java.lang.Object r9 = vkm.q.z(r1, r8)
            if (r9 != r0) goto L67
            goto L9f
        L67:
            java.util.List r9 = (java.util.List) r9
            if (r9 == 0) goto L72
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Set r9 = zhm.d0.i1(r9)
            goto L73
        L72:
            r9 = r5
        L73:
            if (r9 != 0) goto L77
            zhm.h0 r9 = zhm.h0.f322473a
        L77:
            ybl.l r1 = r3.v
            akg.n r1 = ybl.l.d(r1)
            zfd.e r1 = zi0.c.w(r1)
            zhm.h0 r6 = zhm.h0.f322473a
            vkm.q0 r1 = rd0.e.n(r1, r6)
            q34.a r6 = new q34.a
            r7 = 27
            r6.<init>(r7)
            jhi.b r1 = mo3.a.g(r1, r5, r6, r4)
            r4 = r9
            java.util.Set r4 = (java.util.Set) r4
            r8.u = r4
            r8.v = r2
            java.lang.Object r1 = vkm.q.z(r1, r8)
            if (r1 != r0) goto La0
        L9f:
            return r0
        La0:
            r0 = r9
            r9 = r1
        La2:
            com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation r9 = (com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation) r9
            if (r9 == 0) goto La8
            hel.b r5 = r9.f105106a
        La8:
            cli.y r9 = r3.f254174w
            qz9.o r1 = new qz9.o
            r2 = 18
            r1.<init>(r0, r2, r3, r5)
            r3.H2(r9, r1)
        Lb4:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: rgf.p.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
