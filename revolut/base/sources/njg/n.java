package njg;

import com.revolut.feature.trusted_merchants.api.model.TrustedMerchant;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
public final class n extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.trusted_merchants.impl.ui.kompot.list.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TrustedMerchant.ToReview f216519w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.revolut.feature.trusted_merchants.impl.ui.kompot.list.a aVar, TrustedMerchant.ToReview toReview, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
        this.f216519w = toReview;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new n(this.v, this.f216519w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        if (skm.e0.o(r2, r20) == r1) goto L15;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.u
            r3 = 1
            r4 = 0
            com.revolut.feature.trusted_merchants.impl.ui.kompot.list.a r5 = r0.v
            r6 = 2
            if (r2 == 0) goto L21
            if (r2 == r3) goto L1d
            if (r2 != r6) goto L15
            yhm.o.b(r21)
            goto L43
        L15:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L1d:
            yhm.o.b(r21)
            goto L34
        L21:
            yhm.o.b(r21)
            njg.k r2 = new njg.k
            com.revolut.feature.trusted_merchants.api.model.TrustedMerchant$ToReview r7 = r0.f216519w
            r2.<init>(r5, r7, r4)
            r0.u = r3
            java.lang.Object r2 = do3.q.t(r5, r2, r0)
            if (r2 != r1) goto L34
            goto L42
        L34:
            njg.m r2 = new njg.m
            r3 = 0
            r2.<init>(r5, r4, r3)
            r0.u = r6
            java.lang.Object r2 = skm.e0.o(r2, r0)
            if (r2 != r1) goto L43
        L42:
            return r1
        L43:
            nii.y0 r1 = new nii.y0
            nii.j0 r7 = new nii.j0
            com.revolut.core.ui_kit.models.TextLocalisedClause r8 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r2 = com.revolut.feature.cards_core.R$string.trusted_merchants_approve_success_title
            r3 = 14
            r8.<init>(r2, r4, r4, r3)
            r18 = 0
            r19 = 4078(0xfee, float:5.714E-42)
            r9 = 0
            r10 = 0
            r11 = 0
            nii.u1$b r12 = nii.u1.b.f216225a
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r2 = 0
            r3 = 5
            r1.<init>(r4, r7, r2, r3)
            kotlinx.coroutines.flow.Flow r1 = r5.X1(r1)
            mqc.p r9 = new mqc.p
            r2 = 11
            r9.<init>(r6, r2, r4)
            r10 = 3
            r7 = 0
            r8 = 0
            r6 = r1
            yji.l.a1(r5, r6, r7, r8, r9, r10)
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: njg.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
