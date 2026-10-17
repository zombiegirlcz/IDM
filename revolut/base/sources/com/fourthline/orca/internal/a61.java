package com.fourthline.orca.internal;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import yhm.m;

/* JADX INFO: loaded from: classes23.dex */
public final class a61 implements jz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f26712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f26713b;

    public static final class a extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f26714a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f26715b;
        int d;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f26715b = obj2;
            this.d |= Integer.MIN_VALUE;
            Object objA = a61.this.a(null, this);
            return objA == fim.a.COROUTINE_SUSPENDED ? objA : new yhm.m(objA);
        }
    }

    public a61(Object obj2, long j2) {
        this.f26712a = obj2;
        this.f26713b = j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.jz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.fourthline.orca.internal.jz.a r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r6 = r7 instanceof com.fourthline.orca.internal.a61.a
            if (r6 == 0) goto L13
            r6 = r7
            com.fourthline.orca.internal.a61$a r6 = (com.fourthline.orca.internal.a61.a) r6
            int r0 = r6.d
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r6.d = r0
            goto L18
        L13:
            com.fourthline.orca.internal.a61$a r6 = new com.fourthline.orca.internal.a61$a
            r6.<init>(r7)
        L18:
            java.lang.Object r7 = r6.f26715b
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.d
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            java.lang.Object r6 = r6.f26714a
            com.fourthline.orca.internal.jz$a r6 = (com.fourthline.orca.internal.jz.a) r6
            yhm.o.b(r7)
            goto L44
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            yhm.o.b(r7)
            long r3 = r5.f26713b
            r7 = 0
            r6.f26714a = r7
            r6.d = r2
            java.lang.Object r6 = skm.k0.b(r3, r6)
            if (r6 != r0) goto L44
            return r0
        L44:
            java.lang.Object r6 = r5.f26712a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.a61.a(com.fourthline.orca.internal.jz$a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public a61(yhm.m mVar, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            m.Companion companion = yhm.m.INSTANCE;
            mVar = new yhm.m(kz.f30445a);
        }
        this(mVar.f314193a, (i & 2) != 0 ? 1000L : j2);
    }
}
