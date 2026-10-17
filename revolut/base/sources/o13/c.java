package o13;

import kotlin.jvm.internal.Intrinsics;
import u13.g;

/* JADX INFO: loaded from: classes21.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f221272a;

    public c(g deliveryRepository) {
        Intrinsics.checkNotNullParameter(deliveryRepository, "deliveryRepository");
        this.f221272a = deliveryRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r5, java.lang.String r6, java.lang.String r7, gim.c r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof o13.b
            if (r0 == 0) goto L13
            r0 = r8
            o13.b r0 = (o13.b) r0
            int r1 = r0.f221271w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f221271w = r1
            goto L18
        L13:
            o13.b r0 = new o13.b
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f221271w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L6f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r8)
            u13.g r8 = r4.f221272a
            r8.getClass()
            java.lang.String r2 = "cardId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r2)
            java.lang.String r2 = "postcode"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r2)
            java.lang.String r2 = "country"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r2)
            com.revolut.feature.card_order_new.impl.delivery.api.repository.network.DeliveryService r8 = r8.f276343a
            efm.d0 r5 = r8.getDeliveryMethods(r5, r6, r7)
            u13.f r6 = u13.f.f
            tc7.m0 r6 = new tc7.m0
            r7 = 13
            r6.<init>(r7)
            r5.getClass()
            ufm.i r7 = new ufm.i
            r7.<init>(r5, r6, r3)
            java.lang.String r5 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r5)
            ufm.n r5 = te0.w.i0(r7)
            r0.f221271w = r3
            java.lang.Object r8 = nim.a.b(r5, r0)
            if (r8 != r1) goto L6f
            return r1
        L6f:
            java.lang.String r5 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r5)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o13.c.a(java.lang.String, java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, boolean r25, java.lang.String r26, java.util.List r27, gim.c r28) {
        /*
            r17 = this;
            r0 = r17
            r1 = r28
            boolean r2 = r1 instanceof o13.a
            if (r2 == 0) goto L17
            r2 = r1
            o13.a r2 = (o13.a) r2
            int r3 = r2.f221270w
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f221270w = r3
            goto L1c
        L17:
            o13.a r2 = new o13.a
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.u
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.f221270w
            r5 = 1
            if (r4 == 0) goto L33
            if (r4 != r5) goto L2b
            yhm.o.b(r1)
            goto L8c
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L33:
            yhm.o.b(r1)
            u13.g r1 = r0.f221272a
            r1.getClass()
            java.lang.String r4 = "postcode"
            r7 = r18
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r4)
            java.lang.String r4 = "country"
            r8 = r19
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r4)
            java.lang.String r4 = "cardBrand"
            r9 = r20
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r4)
            java.lang.String r4 = "cardDesignCode"
            r10 = r21
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r4)
            com.revolut.feature.card_order_new.impl.delivery.api.repository.network.DeliveryService r6 = r1.f276343a
            r11 = r22
            r12 = r23
            r13 = r24
            r14 = r25
            r15 = r26
            r16 = r27
            efm.d0 r1 = r6.getDeliveryDetails(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            u13.e r4 = u13.e.f
            tc7.m0 r4 = new tc7.m0
            r6 = 14
            r4.<init>(r6)
            r1.getClass()
            ufm.i r6 = new ufm.i
            r6.<init>(r1, r4, r5)
            java.lang.String r1 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r1)
            ufm.n r1 = te0.w.i0(r6)
            r2.f221270w = r5
            java.lang.Object r1 = nim.a.b(r1, r2)
            if (r1 != r3) goto L8c
            return r3
        L8c:
            java.lang.String r2 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o13.c.b(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.util.List, gim.c):java.lang.Object");
    }
}
