package com.revolut.feature.topup_screen.impl.flows.topup_flows.new_card;

import cue.d;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f91009w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, b bVar, Continuation continuation) {
        super(1, continuation);
        this.v = dVar;
        this.f91009w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, this.f91009w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
    
        if (com.revolut.feature.topup_screen.impl.flows.topup_flows.new_card.b.I2(r5, (cue.d) r7, r6) != r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006b, code lost:
    
        if (r1.a(r4, r3, r6) == r0) goto L28;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.u
            r2 = 3
            r3 = 2
            r4 = 1
            com.revolut.feature.topup_screen.impl.flows.topup_flows.new_card.b r5 = r6.f91009w
            if (r1 == 0) goto L25
            if (r1 == r4) goto L21
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            yhm.o.b(r7)
            goto L6e
        L15:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1d:
            yhm.o.b(r7)
            goto L73
        L21:
            yhm.o.b(r7)
            goto L39
        L25:
            yhm.o.b(r7)
            cue.d r7 = r6.v
            java.lang.String r1 = r7.e
            if (r1 == 0) goto L44
            cze.d r1 = r5.f91011q
            r6.u = r4
            java.io.Serializable r7 = r1.a(r7, r6)
            if (r7 != r0) goto L39
            goto L6d
        L39:
            cue.d r7 = (cue.d) r7
            r6.u = r3
            java.lang.Object r7 = com.revolut.feature.topup_screen.impl.flows.topup_flows.new_card.b.I2(r5, r7, r6)
            if (r7 != r0) goto L73
            goto L6d
        L44:
            boolean r1 = r7.c()
            r3 = 0
            if (r1 == 0) goto L57
            yki.i r0 = r5.f91017y
            com.revolut.feature.topup_screen.impl.flows.topup_flows.new_card.TopupWithNewCardFlowContract$Step$ThreeDs r1 = new com.revolut.feature.topup_screen.impl.flows.topup_flows.new_card.TopupWithNewCardFlowContract$Step$ThreeDs
            r1.<init>(r3, r7)
            r7 = 6
            oki.h.u2(r5, r0, r1, r3, r7)
            goto L73
        L57:
            c0f.d r1 = r5.f91010p
            java.lang.String r4 = r7.f108991a
            java.lang.String r7 = r7.f108992b
            if (r7 == 0) goto L65
            java.lang.String r3 = "id"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r3)
            r3 = r7
        L65:
            r6.u = r2
            java.lang.Object r7 = r1.a(r4, r3, r6)
            if (r7 != r0) goto L6e
        L6d:
            return r0
        L6e:
            ste.x r7 = ste.x.f265578a
            r5.C2(r7)
        L73:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.topup_screen.impl.flows.topup_flows.new_card.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
