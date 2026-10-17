package com.revolut.feature.push_to_card.impl.flows.add_card_kompot.flow;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends i implements Function1 {
    public int u;
    public final /* synthetic */ i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f81573w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(Function1 function1, d dVar, Continuation continuation) {
        super(1, continuation);
        this.v = (i) function1;
        this.f81573w = dVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new c(this.v, this.f81573w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((c) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b5, code lost:
    
        if (((zqa.f) r1).Z2(r11, r10) == r0) goto L34;
     */
    /* JADX WARN: Type inference failed for: r11v1, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r10.u
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1d
            if (r1 == r3) goto L19
            if (r1 != r2) goto L11
            yhm.o.b(r11)
            goto Lb8
        L11:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L19:
            yhm.o.b(r11)
            goto L2c
        L1d:
            yhm.o.b(r11)
            r10.u = r3
            gim.i r11 = r10.v
            java.lang.Object r11 = r11.invoke(r10)
            if (r11 != r0) goto L2c
            goto Lb7
        L2c:
            com.revolut.feature.push_to_card.impl.flows.add_card_kompot.flow.CardOwnerCreationFlowContract$CreationProcessState r11 = (com.revolut.feature.push_to_card.impl.flows.add_card_kompot.flow.CardOwnerCreationFlowContract$CreationProcessState) r11
            com.revolut.feature.push_to_card.impl.flows.add_card_kompot.flow.d r3 = r10.f81573w
            xqa.a r1 = r3.o
            r1.getClass()
            java.lang.String r1 = "creationProcessState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r1)
            com.revolut.feature.push_to_card.api.model.CardEligibility r1 = r11.f81566b
            java.util.List r4 = r11.d
            if (r4 != 0) goto L52
            java.util.List r4 = r1.f81514j
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L52
            xqa.e r4 = new xqa.e
            java.util.List r1 = r1.f81514j
            r4.<init>(r1)
            goto L71
        L52:
            com.revolut.feature.address.models.Address r4 = r11.f81567c
            if (r4 != 0) goto L6c
            boolean r4 = r1.f81509a
            if (r4 == 0) goto L6c
            wi0.a r4 = wi0.b.Companion
            java.lang.String r5 = r1.f81511c
            r4.getClass()
            wi0.b r4 = wi0.a.a(r5)
            xqa.f r5 = new xqa.f
            r5.<init>(r4, r1)
            r4 = r5
            goto L71
        L6c:
            xqa.g r4 = new xqa.g
            r4.<init>(r1)
        L71:
            boolean r1 = r4 instanceof xqa.f
            if (r1 == 0) goto L8c
            r5 = r4
            yki.a r4 = r3.f81576r
            r1 = r5
            com.revolut.feature.push_to_card.impl.flows.add_card_kompot.flow.CardOwnerCreationFlowContract$Step$Address r5 = new com.revolut.feature.push_to_card.impl.flows.add_card_kompot.flow.CardOwnerCreationFlowContract$Step$Address
            r0 = r1
            xqa.f r0 = (xqa.f) r0
            wi0.b r0 = r0.f308140a
            r5.<init>(r11, r0)
            r8 = 0
            r9 = 12
            r6 = 1
            r7 = 0
            oki.h.t2(r3, r4, r5, r6, r7, r8, r9)
            goto Lb8
        L8c:
            r1 = r4
            boolean r4 = r1 instanceof xqa.e
            if (r4 == 0) goto La7
            yki.a r4 = r3.f81576r
            com.revolut.feature.push_to_card.impl.flows.add_card_kompot.flow.CardOwnerCreationFlowContract$Step$AdditionalFields r5 = new com.revolut.feature.push_to_card.impl.flows.add_card_kompot.flow.CardOwnerCreationFlowContract$Step$AdditionalFields
            r0 = r1
            xqa.e r0 = (xqa.e) r0
            java.util.List r0 = r0.f308139a
            r5.<init>(r11, r0)
            r8 = 0
            r9 = 12
            r6 = 1
            r7 = 0
            oki.h.t2(r3, r4, r5, r6, r7, r8, r9)
            goto Lb8
        La7:
            boolean r1 = r1 instanceof xqa.g
            if (r1 == 0) goto Lbb
            zqa.a r1 = r3.f81574p
            r10.u = r2
            zqa.f r1 = (zqa.f) r1
            java.lang.Object r11 = r1.Z2(r11, r10)
            if (r11 != r0) goto Lb8
        Lb7:
            return r0
        Lb8:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        Lbb:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.push_to_card.impl.flows.add_card_kompot.flow.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
