package com.fourthline.orca.internal;

import com.fourthline.core.eid.EidServiceProvider;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class hr0 implements zr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bs f29384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EidServiceProvider f29385b;

    public static final class a extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f29386a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f29387b;
        int d;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f29387b = obj2;
            this.d |= Integer.MIN_VALUE;
            Object objA = hr0.this.a(null, this);
            return objA == fim.a.COROUTINE_SUSPENDED ? objA : new yhm.m(objA);
        }
    }

    public hr0(bs bundle, EidServiceProvider provider) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f29384a = bundle;
        this.f29385b = provider;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.zr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.fourthline.orca.internal.zr.a r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.fourthline.orca.internal.hr0.a
            if (r0 == 0) goto L13
            r0 = r6
            com.fourthline.orca.internal.hr0$a r0 = (com.fourthline.orca.internal.hr0.a) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            com.fourthline.orca.internal.hr0$a r0 = new com.fourthline.orca.internal.hr0$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f29387b
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r5 = r0.f29386a
            com.fourthline.orca.internal.zr$a r5 = (com.fourthline.orca.internal.zr.a) r5
            yhm.o.b(r6)
            yhm.m r6 = (yhm.m) r6
            java.lang.Object r5 = r6.f314193a
            goto L4c
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            yhm.o.b(r6)
            com.fourthline.core.eid.EidServiceProvider r6 = r4.f29385b
            java.lang.String r5 = r5.a()
            r2 = 0
            r0.f29386a = r2
            r0.d = r3
            java.lang.Object r5 = r6.mo3653fetchAccessRightsgIAlus(r5, r0)
            if (r5 != r1) goto L4c
            return r1
        L4c:
            yhm.o.b(r5)
            java.util.List r5 = (java.util.List) r5
            com.fourthline.orca.internal.bs r6 = r4.f29384a
            r6.a(r5)
            yhm.m$a r6 = yhm.m.INSTANCE
            com.fourthline.orca.internal.zr$b$a r6 = new com.fourthline.orca.internal.zr$b$a
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.hr0.a(com.fourthline.orca.internal.zr$a, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
