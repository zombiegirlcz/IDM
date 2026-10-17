package com.revolut.feature.card_management.impl.ui.kompot.replace.flow;

import com.revolut.feature.card_management.api.replace.CardReplaceDestination;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends i implements Function2 {
    public CardReplaceDestination.StartType.SelectReason u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f64893w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Continuation continuation) {
        super(2, continuation);
        this.f64893w = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.f64893w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
    
        if (com.revolut.feature.card_management.impl.ui.kompot.replace.flow.d.I2(r3, r8, r9, r10) == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008b, code lost:
    
        if (com.revolut.feature.card_management.impl.ui.kompot.replace.flow.d.I2(r3, r11, r1, r10) == r0) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008e  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r10.v
            r2 = 6
            com.revolut.feature.card_management.impl.ui.kompot.replace.flow.d r3 = r10.f64893w
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r1 == 0) goto L27
            if (r1 == r6) goto L22
            if (r1 == r5) goto L1c
            if (r1 != r4) goto L14
            goto L22
        L14:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1c:
            com.revolut.feature.card_management.api.replace.CardReplaceDestination$StartType$SelectReason r1 = r10.u
            yhm.o.b(r11)
            goto L75
        L22:
            yhm.o.b(r11)
            goto L9c
        L27:
            yhm.o.b(r11)
            com.revolut.feature.card_management.impl.ui.kompot.replace.flow.CardReplaceFlowContract$InputData r11 = r3.o
            com.revolut.feature.card_management.api.replace.CardReplaceDestination$StartType r1 = r11.f64885a
            boolean r11 = r1 instanceof com.revolut.feature.card_management.api.replace.CardReplaceDestination.StartType.Expectations
            if (r11 == 0) goto L45
            yki.i r11 = r3.v
            com.revolut.feature.card_management.impl.ui.kompot.replace.flow.CardReplaceFlowContract$Step$Expectations r0 = new com.revolut.feature.card_management.impl.ui.kompot.replace.flow.CardReplaceFlowContract$Step$Expectations
            com.revolut.feature.card_management.api.replace.CardReplaceDestination$StartType$Expectations r1 = (com.revolut.feature.card_management.api.replace.CardReplaceDestination.StartType.Expectations) r1
            wy2.d r4 = r1.f64803a
            java.lang.String r5 = r1.f64804b
            com.revolut.retail.core.navigation.NaviCommand r1 = r1.f64805c
            r0.<init>(r4, r5, r1)
            oki.h.u2(r3, r11, r0, r7, r2)
            goto L9c
        L45:
            boolean r11 = r1 instanceof com.revolut.feature.card_management.api.replace.CardReplaceDestination.StartType.SelectReason
            if (r11 == 0) goto L9f
            r11 = r1
            com.revolut.feature.card_management.api.replace.CardReplaceDestination$StartType$SelectReason r11 = (com.revolut.feature.card_management.api.replace.CardReplaceDestination.StartType.SelectReason) r11
            java.lang.String r8 = r11.f64806a
            wy2.d r9 = r11.f64807b
            if (r9 == 0) goto L5d
            r10.u = r7
            r10.v = r6
            java.lang.Object r11 = com.revolut.feature.card_management.impl.ui.kompot.replace.flow.d.I2(r3, r8, r9, r10)
            if (r11 != r0) goto L9c
            goto L8d
        L5d:
            r10.u = r11
            r10.v = r5
            z6l.s r11 = r3.f64894p
            vkm.d r11 = r11.u(r8)
            mmh.e r5 = new mmh.e
            r6 = 11
            r5.<init>(r11, r6)
            java.lang.Object r11 = vkm.q.x(r5, r10)
            if (r11 != r0) goto L75
            goto L8d
        L75:
            h93.f0 r11 = (h93.f0) r11
            h93.c0 r11 = r11.f150123t
            h93.c0 r5 = h93.c0.DAMAGED
            if (r11 != r5) goto L8e
            com.revolut.feature.card_management.api.replace.CardReplaceDestination$StartType$SelectReason r1 = (com.revolut.feature.card_management.api.replace.CardReplaceDestination.StartType.SelectReason) r1
            java.lang.String r11 = r1.f64806a
            wy2.d r1 = wy2.d.DAMAGED
            r10.u = r7
            r10.v = r4
            java.lang.Object r11 = com.revolut.feature.card_management.impl.ui.kompot.replace.flow.d.I2(r3, r11, r1, r10)
            if (r11 != r0) goto L9c
        L8d:
            return r0
        L8e:
            yki.i r11 = r3.v
            com.revolut.feature.card_management.impl.ui.kompot.replace.flow.CardReplaceFlowContract$Step$SelectReason r0 = new com.revolut.feature.card_management.impl.ui.kompot.replace.flow.CardReplaceFlowContract$Step$SelectReason
            com.revolut.feature.card_management.api.replace.CardReplaceDestination$StartType$SelectReason r1 = (com.revolut.feature.card_management.api.replace.CardReplaceDestination.StartType.SelectReason) r1
            java.lang.String r1 = r1.f64806a
            r0.<init>(r1)
            oki.h.u2(r3, r11, r0, r7, r2)
        L9c:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        L9f:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.card_management.impl.ui.kompot.replace.flow.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
