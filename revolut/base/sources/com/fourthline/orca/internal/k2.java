package com.fourthline.orca.internal;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class k2 implements fq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ukm.j0 f30100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ukm.i0 f30101b;

    public static final class a extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f30102a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f30103b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f30104c;
        int d;
        /* synthetic */ Object e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f30105g;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.e = obj2;
            this.f30105g |= Integer.MIN_VALUE;
            return k2.this.a(null, this);
        }
    }

    public k2(ukm.j0 popupEffectChannel, ukm.i0 popupEventChannel) {
        Intrinsics.checkNotNullParameter(popupEffectChannel, "popupEffectChannel");
        Intrinsics.checkNotNullParameter(popupEventChannel, "popupEventChannel");
        this.f30100a = popupEffectChannel;
        this.f30101b = popupEventChannel;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.fq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.fourthline.orca.internal.zp0 r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.fourthline.orca.internal.k2.a
            if (r0 == 0) goto L13
            r0 = r9
            com.fourthline.orca.internal.k2$a r0 = (com.fourthline.orca.internal.k2.a) r0
            int r1 = r0.f30105g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30105g = r1
            goto L18
        L13:
            com.fourthline.orca.internal.k2$a r0 = new com.fourthline.orca.internal.k2$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.e
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f30105g
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L50
            if (r2 == r5) goto L48
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r8 = r0.f30104c
            com.fourthline.orca.internal.yp0 r8 = (com.fourthline.orca.internal.yp0) r8
            java.lang.Object r8 = r0.f30103b
            java.lang.Object r0 = r0.f30102a
            com.fourthline.orca.internal.zp0 r0 = (com.fourthline.orca.internal.zp0) r0
            yhm.o.b(r9)
            return r8
        L38:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L40:
            java.lang.Object r8 = r0.f30102a
            com.fourthline.orca.internal.zp0 r8 = (com.fourthline.orca.internal.zp0) r8
            yhm.o.b(r9)
            goto L72
        L48:
            java.lang.Object r8 = r0.f30102a
            com.fourthline.orca.internal.zp0 r8 = (com.fourthline.orca.internal.zp0) r8
            yhm.o.b(r9)
            goto L65
        L50:
            yhm.o.b(r9)
            ukm.j0 r9 = r7.f30100a
            com.fourthline.orca.internal.xp0$b r2 = new com.fourthline.orca.internal.xp0$b
            r2.<init>(r8)
            r0.f30102a = r6
            r0.f30105g = r5
            java.lang.Object r8 = r9.send(r2, r0)
            if (r8 != r1) goto L65
            goto L92
        L65:
            ukm.i0 r8 = r7.f30101b
            r0.f30102a = r6
            r0.f30105g = r4
            java.lang.Object r9 = r8.j(r0)
            if (r9 != r1) goto L72
            goto L92
        L72:
            r8 = r9
            com.fourthline.orca.internal.yp0 r8 = (com.fourthline.orca.internal.yp0) r8
            com.fourthline.orca.internal.yp0$e r2 = com.fourthline.orca.internal.yp0.e.f35411a
            boolean r8 = kotlin.jvm.internal.Intrinsics.f(r8, r2)
            if (r8 != 0) goto L93
            ukm.j0 r8 = r7.f30100a
            com.fourthline.orca.internal.xp0$a r2 = com.fourthline.orca.internal.xp0.a.f35072a
            r0.f30102a = r6
            r0.f30103b = r9
            r0.f30104c = r6
            r4 = 0
            r0.d = r4
            r0.f30105g = r3
            java.lang.Object r8 = r8.send(r2, r0)
            if (r8 != r1) goto L93
        L92:
            return r1
        L93:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.k2.a(com.fourthline.orca.internal.zp0, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
