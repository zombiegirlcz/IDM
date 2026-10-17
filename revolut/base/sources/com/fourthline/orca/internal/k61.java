package com.fourthline.orca.internal;

import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class k61 implements qx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f30137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f30138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f30139c;

    public static final class a extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f30140a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f30141b;
        int d;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f30141b = obj2;
            this.d |= Integer.MIN_VALUE;
            Object objA = k61.this.a(null, this);
            return objA == fim.a.COROUTINE_SUSPENDED ? objA : new yhm.m(objA);
        }
    }

    public k61(Object obj2, Map specificResults, long j2) {
        Intrinsics.checkNotNullParameter(specificResults, "specificResults");
        this.f30137a = obj2;
        this.f30138b = specificResults;
        this.f30139c = j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.qx0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.fourthline.orca.internal.qx0.a r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.fourthline.orca.internal.k61.a
            if (r0 == 0) goto L13
            r0 = r8
            com.fourthline.orca.internal.k61$a r0 = (com.fourthline.orca.internal.k61.a) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            com.fourthline.orca.internal.k61$a r0 = new com.fourthline.orca.internal.k61$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f30141b
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r7 = r0.f30140a
            com.fourthline.orca.internal.qx0$a r7 = (com.fourthline.orca.internal.qx0.a) r7
            yhm.o.b(r8)
            goto L43
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            yhm.o.b(r8)
            long r4 = r6.f30139c
            r0.f30140a = r7
            r0.d = r3
            java.lang.Object r8 = skm.k0.b(r4, r0)
            if (r8 != r1) goto L43
            return r1
        L43:
            java.util.Map r8 = r6.f30138b
            java.lang.String r7 = r7.a()
            java.lang.Object r7 = r8.get(r7)
            yhm.m r7 = (yhm.m) r7
            if (r7 == 0) goto L54
            java.lang.Object r7 = r7.f314193a
            return r7
        L54:
            java.lang.Object r7 = r6.f30137a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.k61.a(com.fourthline.orca.internal.qx0$a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public /* synthetic */ k61(Object obj2, Map map, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj2, (i & 2) != 0 ? zhm.r0.g() : map, (i & 4) != 0 ? 1000L : j2);
    }
}
