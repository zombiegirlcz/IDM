package mf4;

import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.OfferV2FlowContract$OfferUpdateContext;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public final class g0 extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.g f204854w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ OfferV2FlowContract$OfferUpdateContext f204855x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ oki.g f204856y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.g gVar, OfferV2FlowContract$OfferUpdateContext offerV2FlowContract$OfferUpdateContext, oki.g gVar2, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f204854w = gVar;
        this.f204855x = offerV2FlowContract$OfferUpdateContext;
        this.f204856y = gVar2;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g0(this.f204854w, this.f204855x, this.f204856y, continuation, 0);
            default:
                return new g0(this.f204854w, this.f204855x, this.f204856y, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((g0) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            int r0 = r9.u
            switch(r0) {
                case 0: goto L36;
                default: goto L5;
            }
        L5:
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r9.v
            r2 = 1
            if (r1 == 0) goto L1a
            if (r1 != r2) goto L12
            yhm.o.b(r10)
            goto L33
        L12:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1a:
            yhm.o.b(r10)
            mf4.g0 r3 = new mf4.g0
            r7 = 0
            r8 = 0
            com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.g r4 = r9.f204854w
            com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.OfferV2FlowContract$OfferUpdateContext r5 = r9.f204855x
            oki.g r6 = r9.f204856y
            r3.<init>(r4, r5, r6, r7, r8)
            r9.v = r2
            java.lang.Object r10 = r4.p2(r9, r3)
            if (r10 != r0) goto L33
            goto L35
        L33:
            kotlin.Unit r0 = kotlin.Unit.f186387a
        L35:
            return r0
        L36:
            com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.g r0 = r9.f204854w
            mf4.e r1 = r0.f68151q
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r9.v
            r4 = 3
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L5d
            if (r3 == r6) goto L59
            if (r3 == r5) goto L55
            if (r3 != r4) goto L4d
            yhm.o.b(r10)
            goto L84
        L4d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L55:
            yhm.o.b(r10)
            goto L79
        L59:
            yhm.o.b(r10)
            goto L6e
        L5d:
            yhm.o.b(r10)
            r9.v = r6
            r10 = r1
            mf4.a0 r10 = (mf4.a0) r10
            cv3.b0 r3 = r10.f204836g
            r10.f = r3
            kotlin.Unit r10 = kotlin.Unit.f186387a
            if (r10 != r2) goto L6e
            goto L91
        L6e:
            r9.v = r5
            mf4.a0 r1 = (mf4.a0) r1
            java.lang.Object r10 = r1.s(r9)
            if (r10 != r2) goto L79
            goto L91
        L79:
            it3.d r10 = (it3.d) r10
            r9.v = r4
            java.lang.Object r10 = c84.t.N2(r0, r10, r9, r5)
            if (r10 != r2) goto L84
            goto L91
        L84:
            com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.OfferV2FlowContract$OfferUpdateContext r10 = r9.f204855x
            boolean r10 = r10 instanceof com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.OfferV2FlowContract$OfferUpdateContext.LoanOffer
            if (r10 == 0) goto L8f
            oki.g r10 = r9.f204856y
            r10.pop()
        L8f:
            kotlin.Unit r2 = kotlin.Unit.f186387a
        L91:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: mf4.g0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
