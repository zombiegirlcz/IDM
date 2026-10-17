package com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit;

import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.ExchangeOrderDraft;
import gim.i;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends i implements Function1 {
    public Set u;
    public ExchangeOrderDraft v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f99855w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ g f99856x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, Continuation continuation) {
        super(1, continuation);
        this.f99856x = gVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new e(this.f99856x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((e) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007e  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g r0 = r10.f99856x
            cli.y r1 = r0.T
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r10.f99855w
            r4 = 3
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L33
            if (r3 == r6) goto L2f
            if (r3 == r5) goto L27
            if (r3 != r4) goto L1f
            com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.ExchangeOrderDraft r1 = r10.v
            java.util.Set r2 = r10.u
            java.util.Set r2 = (java.util.Set) r2
            yhm.o.b(r11)
            r6 = r2
            goto La3
        L1f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L27:
            java.util.Set r3 = r10.u
            java.util.Set r3 = (java.util.Set) r3
            yhm.o.b(r11)
            goto L73
        L2f:
            yhm.o.b(r11)
            goto L4f
        L33:
            yhm.o.b(r11)
            d7j.p0 r11 = new d7j.p0
            r3 = 7
            r11.<init>(r3)
            kotlinx.coroutines.flow.Flow r11 = r1.B(r11)
            vkm.t0 r3 = new vkm.t0
            r7 = 1
            r3.<init>(r11, r7)
            r10.f99855w = r6
            java.lang.Object r11 = vkm.q.x(r3, r10)
            if (r11 != r2) goto L4f
            goto L9e
        L4f:
            java.util.Set r11 = (java.util.Set) r11
            d7j.p0 r3 = new d7j.p0
            r7 = 8
            r3.<init>(r7)
            kotlinx.coroutines.flow.Flow r3 = r1.B(r3)
            vkm.t0 r7 = new vkm.t0
            r8 = 1
            r7.<init>(r3, r8)
            r3 = r11
            java.util.Set r3 = (java.util.Set) r3
            r10.u = r3
            r10.f99855w = r5
            java.lang.Object r3 = vkm.q.x(r7, r10)
            if (r3 != r2) goto L70
            goto L9e
        L70:
            r9 = r3
            r3 = r11
            r11 = r9
        L73:
            com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.ExchangeOrderDraft r11 = (com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.ExchangeOrderDraft) r11
            int r5 = r3.size()
            if (r5 > r6) goto L7e
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        L7e:
            d7j.p0 r5 = new d7j.p0
            r6 = 9
            r5.<init>(r6)
            kotlinx.coroutines.flow.Flow r1 = r1.B(r5)
            vkm.t0 r5 = new vkm.t0
            r6 = 1
            r5.<init>(r1, r6)
            r1 = r3
            java.util.Set r1 = (java.util.Set) r1
            r10.u = r1
            r10.v = r11
            r10.f99855w = r4
            java.lang.Object r1 = vkm.q.x(r5, r10)
            if (r1 != r2) goto L9f
        L9e:
            return r2
        L9f:
            r6 = r1
            r1 = r11
            r11 = r6
            r6 = r3
        La3:
            r7 = r11
            java.util.Set r7 = (java.util.Set) r7
            com.revolut.kompot.navigable.vc.modal.a r11 = r0.S
            com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.CommodityOrderEditScreenContract$ModalStep$SelectOrderType r2 = new com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.CommodityOrderEditScreenContract$ModalStep$SelectOrderType
            com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.CommodityOrderEditScreenContract$InputData r0 = r0.N
            com.revolut.retail.feature.commodity.order_flow.api.navigation.CommodityOrderFlowConfig r0 = r0.f99825a
            com.revolut.retail.feature.commodity.order_flow.api.domain.PocketDescriptor$FullPocketDescriptor r0 = r0.f99807c
            xi0.b r3 = r0.f99802a
            wd6.e r4 = r1.f99887c
            wd6.h r5 = r1.e
            r2.<init>(r3, r4, r5, r6, r7)
            com.revolut.kompot.common.ModalDestination$Style$BOTTOM_DIALOG r0 = com.revolut.kompot.common.ModalDestination.Style.BOTTOM_DIALOG.f98301a
            oki.h.v2(r11, r2, r0)
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
