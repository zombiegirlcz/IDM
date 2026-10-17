package q2e;

import com.revolut.feature.store.api.model.StoreGiftcardsOffer;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes7.dex */
public final class m0 implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f241601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f241602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ StoreGiftcardsOffer f241603c;

    public /* synthetic */ m0(FlowCollector flowCollector, StoreGiftcardsOffer storeGiftcardsOffer, int i) {
        this.f241601a = i;
        this.f241602b = flowCollector;
        this.f241603c = storeGiftcardsOffer;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            int r0 = r4.f241601a
            switch(r0) {
                case 0: goto L4e;
                default: goto L5;
            }
        L5:
            boolean r0 = r6 instanceof v2e.f0
            if (r0 == 0) goto L18
            r0 = r6
            v2e.f0 r0 = (v2e.f0) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.v = r1
            goto L1d
        L18:
            v2e.f0 r0 = new v2e.f0
            r0.<init>(r4, r6)
        L1d:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r6)
            goto L4b
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            yhm.o.b(r6)
            w4l.k r5 = (w4l.k) r5
            kotlin.Pair r6 = new kotlin.Pair
            com.revolut.feature.store.api.model.StoreGiftcardsOffer r2 = r4.f241603c
            r6.<init>(r2, r5)
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r5 = r4.f241602b
            java.lang.Object r5 = r5.emit(r6, r0)
            if (r5 != r1) goto L4b
            goto L4d
        L4b:
            kotlin.Unit r1 = kotlin.Unit.f186387a
        L4d:
            return r1
        L4e:
            boolean r0 = r6 instanceof q2e.l0
            if (r0 == 0) goto L61
            r0 = r6
            q2e.l0 r0 = (q2e.l0) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L61
            int r1 = r1 - r2
            r0.v = r1
            goto L66
        L61:
            q2e.l0 r0 = new q2e.l0
            r0.<init>(r4, r6)
        L66:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L7d
            if (r2 != r3) goto L75
            yhm.o.b(r6)
            goto L94
        L75:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L7d:
            yhm.o.b(r6)
            w4l.k r5 = (w4l.k) r5
            kotlin.Pair r6 = new kotlin.Pair
            com.revolut.feature.store.api.model.StoreGiftcardsOffer r2 = r4.f241603c
            r6.<init>(r2, r5)
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r5 = r4.f241602b
            java.lang.Object r5 = r5.emit(r6, r0)
            if (r5 != r1) goto L94
            goto L96
        L94:
            kotlin.Unit r1 = kotlin.Unit.f186387a
        L96:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: q2e.m0.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
