package com.revolut.feature.wealth.impl.ui.screens.composite_add_money;

import dj0.d;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f95588w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, d dVar, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
        this.f95588w = dVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, this.f95588w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
    
        if (com.revolut.feature.wealth.impl.ui.screens.composite_add_money.b.I2(r4, r1, r5) == r0) goto L19;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r5.u
            r2 = 2
            r3 = 1
            com.revolut.feature.wealth.impl.ui.screens.composite_add_money.b r4 = r5.v
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            yhm.o.b(r6)
            goto L4e
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            yhm.o.b(r6)
            goto L30
        L1e:
            yhm.o.b(r6)
            ozg.c r6 = r4.I
            com.revolut.feature.wealth.impl.ui.screens.composite_add_money.CompositeAddMoneyScreenContract$Input r1 = r4.o
            com.revolut.feature.wealth.models.addmoney.TransferSubjectId r1 = r1.f95583a
            r5.u = r3
            java.lang.Object r6 = r6.a(r1, r5)
            if (r6 != r0) goto L30
            goto L4d
        L30:
            com.revolut.kompot.common.ParcelableControllerDescriptor r6 = (com.revolut.kompot.common.ParcelableControllerDescriptor) r6
            dj0.d r1 = r5.f95588w
            if (r6 == 0) goto L45
            com.revolut.kompot.navigable.vc.modal.a r0 = r4.L
            com.revolut.feature.wealth.impl.ui.screens.composite_add_money.CompositeAddMoneyScreenContract$FlowStep$PreActionPrompt r2 = new com.revolut.feature.wealth.impl.ui.screens.composite_add_money.CompositeAddMoneyScreenContract$FlowStep$PreActionPrompt
            r2.<init>(r6, r1)
            com.revolut.kompot.common.ModalDestination$Style$BOTTOM_DIALOG r6 = com.revolut.kompot.common.ModalDestination.Style.BOTTOM_DIALOG.f98301a
            oki.h.v2(r0, r2, r6)
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L45:
            r5.u = r2
            java.lang.Object r6 = com.revolut.feature.wealth.impl.ui.screens.composite_add_money.b.I2(r4, r1, r5)
            if (r6 != r0) goto L4e
        L4d:
            return r0
        L4e:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.wealth.impl.ui.screens.composite_add_money.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
