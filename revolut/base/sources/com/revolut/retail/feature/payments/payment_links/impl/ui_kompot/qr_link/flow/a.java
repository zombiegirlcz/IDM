package com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.qr_link.flow;

import do3.n;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends i implements Function1 {
    public n u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f102219w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(1, continuation);
        this.f102219w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.f102219w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0095  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r9.v
            com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.qr_link.flow.b r2 = r9.f102219w
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L20
            if (r1 == r4) goto L1c
            if (r1 != r3) goto L14
            do3.n r0 = r9.u
            yhm.o.b(r10)
            goto L71
        L14:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1c:
            yhm.o.b(r10)
            goto L33
        L20:
            yhm.o.b(r10)
            ang.f r10 = r2.o
            r1 = 0
            efm.d0 r10 = r10.f(r1)
            r9.v = r4
            java.lang.Object r10 = nim.a.b(r10, r9)
            if (r10 != r0) goto L33
            goto L6e
        L33:
            do3.n r10 = (do3.n) r10
            zjh.j r1 = r2.f102220p
            java.lang.Object r1 = r1.f322839a
            y21.c r1 = (y21.c) r1
            com.revolut.data.network.models.security.SecuritySettings r5 = com.revolut.data.network.models.security.SecuritySettings.USERNAME
            w4l.h r6 = w4l.h.f294642c
            efm.r r1 = r1.b(r5, r6)
            y07.m r5 = new y07.m
            r6 = 28
            r5.<init>(r6)
            efm.r r1 = nim.a.w(r1, r5)
            y13.a r5 = new y13.a
            r6 = 7
            r5.<init>(r6)
            r6 = 0
            efm.r r1 = m70.a.g(r1, r6, r5, r4)
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            efm.d0 r1 = r1.first(r4)
            java.lang.String r4 = "first(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r4)
            r9.u = r10
            r9.v = r3
            java.lang.Object r1 = nim.a.b(r1, r9)
            if (r1 != r0) goto L6f
        L6e:
            return r0
        L6f:
            r0 = r10
            r10 = r1
        L71:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            java.lang.String r1 = "Required value was null."
            if (r10 == 0) goto L95
            yki.i r3 = r2.f102221q
            com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.qr_link.flow.PaymentLinkQrFlowContract$Step$QrCodeScreen r4 = new com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.qr_link.flow.PaymentLinkQrFlowContract$Step$QrCodeScreen
            java.lang.String r10 = r0.f
            if (r10 == 0) goto L8f
            r4.<init>(r10)
            r7 = 0
            r8 = 12
            r5 = 0
            r6 = 0
            oki.h.t2(r2, r3, r4, r5, r6, r7, r8)
            goto La8
        L8f:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            r10.<init>(r1)
            throw r10
        L95:
            yki.i r3 = r2.f102221q
            com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.qr_link.flow.PaymentLinkQrFlowContract$Step$PermissionScreen r4 = new com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.qr_link.flow.PaymentLinkQrFlowContract$Step$PermissionScreen
            java.lang.String r10 = r0.f
            if (r10 == 0) goto Lab
            r4.<init>(r10)
            r7 = 0
            r8 = 12
            r5 = 0
            r6 = 0
            oki.h.t2(r2, r3, r4, r5, r6, r7, r8)
        La8:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        Lab:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            r10.<init>(r1)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.qr_link.flow.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
