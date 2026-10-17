package com.fourthline.orca.internal;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes23.dex */
public final class o51 implements b7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f31583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f31584b;

    public static final class a extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f31585a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f31586b;
        int d;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f31586b = obj2;
            this.d |= Integer.MIN_VALUE;
            Object objA = o51.this.a(null, this);
            return objA == fim.a.COROUTINE_SUSPENDED ? objA : new yhm.m(objA);
        }
    }

    public o51(Object obj2, long j2) {
        this.f31583a = obj2;
        this.f31584b = j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.b7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.fourthline.orca.internal.b7.c r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r6 = r7 instanceof com.fourthline.orca.internal.o51.a
            if (r6 == 0) goto L13
            r6 = r7
            com.fourthline.orca.internal.o51$a r6 = (com.fourthline.orca.internal.o51.a) r6
            int r0 = r6.d
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r6.d = r0
            goto L18
        L13:
            com.fourthline.orca.internal.o51$a r6 = new com.fourthline.orca.internal.o51$a
            r6.<init>(r7)
        L18:
            java.lang.Object r7 = r6.f31586b
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.d
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            java.lang.Object r6 = r6.f31585a
            com.fourthline.orca.internal.b7$c r6 = (com.fourthline.orca.internal.b7.c) r6
            yhm.o.b(r7)
            goto L44
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            yhm.o.b(r7)
            long r3 = r5.f31584b
            r7 = 0
            r6.f31585a = r7
            r6.d = r2
            java.lang.Object r6 = skm.k0.b(r3, r6)
            if (r6 != r0) goto L44
            return r0
        L44:
            java.lang.Object r6 = r5.f31583a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.o51.a(com.fourthline.orca.internal.b7$c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public /* synthetic */ o51(Object obj2, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj2, (i & 2) != 0 ? 1000L : j2);
    }
}
