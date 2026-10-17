package com.fourthline.orca.internal;

import com.fourthline.core.eid.EidServiceProvider;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ir0 implements ov {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bs f29689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EidServiceProvider f29690b;

    public static final class a extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f29691a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f29692b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f29693c;
        /* synthetic */ Object d;
        int f;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.d = obj2;
            this.f |= Integer.MIN_VALUE;
            Object objA = ir0.this.a(this);
            return objA == fim.a.COROUTINE_SUSPENDED ? objA : new yhm.m(objA);
        }
    }

    public ir0(bs bundle, EidServiceProvider provider) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f29689a = bundle;
        this.f29690b = provider;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x008c, code lost:
    
        if (r7 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.ov
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.fourthline.orca.internal.ir0.a
            if (r0 == 0) goto L13
            r0 = r7
            com.fourthline.orca.internal.ir0$a r0 = (com.fourthline.orca.internal.ir0.a) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            com.fourthline.orca.internal.ir0$a r0 = new com.fourthline.orca.internal.ir0$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.d
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4d
            if (r2 == r4) goto L41
            if (r2 != r3) goto L39
            java.lang.Object r1 = r0.f29692b
            skm.g0 r1 = (skm.g0) r1
            java.lang.Object r0 = r0.f29691a
            com.fourthline.orca.internal.ir0 r0 = (com.fourthline.orca.internal.ir0) r0
            yhm.o.b(r7)     // Catch: java.lang.Throwable -> L37
            yhm.m r7 = (yhm.m) r7     // Catch: java.lang.Throwable -> L37
            java.lang.Object r7 = r7.f314193a     // Catch: java.lang.Throwable -> L37
            goto L8f
        L37:
            r7 = move-exception
            goto L97
        L39:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L41:
            java.lang.Object r1 = r0.f29692b
            skm.g0 r1 = (skm.g0) r1
            java.lang.Object r0 = r0.f29691a
            com.fourthline.orca.internal.ir0 r0 = (com.fourthline.orca.internal.ir0) r0
            yhm.o.b(r7)     // Catch: java.lang.Throwable -> L37
            goto L6b
        L4d:
            yhm.o.b(r7)
            yhm.m$a r7 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L37
            com.fourthline.orca.internal.bs r7 = r6.f29689a     // Catch: java.lang.Throwable -> L37
            skm.g0 r7 = r7.g()     // Catch: java.lang.Throwable -> L37
            r2 = 0
            if (r7 == 0) goto L78
            r0.f29691a = r6     // Catch: java.lang.Throwable -> L37
            r0.f29692b = r5     // Catch: java.lang.Throwable -> L37
            r0.f29693c = r2     // Catch: java.lang.Throwable -> L37
            r0.f = r4     // Catch: java.lang.Throwable -> L37
            java.lang.Object r7 = r7.i(r0)     // Catch: java.lang.Throwable -> L37
            if (r7 != r1) goto L6a
            goto L8e
        L6a:
            r0 = r6
        L6b:
            yhm.m r7 = (yhm.m) r7     // Catch: java.lang.Throwable -> L37
            java.lang.Object r7 = r7.f314193a     // Catch: java.lang.Throwable -> L37
            yhm.o.b(r7)     // Catch: java.lang.Throwable -> L37
            com.fourthline.orca.internal.bs r7 = r0.f29689a     // Catch: java.lang.Throwable -> L37
            r7.a(r5)     // Catch: java.lang.Throwable -> L37
            goto L92
        L78:
            com.fourthline.core.eid.EidServiceProvider r7 = r6.f29690b     // Catch: java.lang.Throwable -> L37
            com.fourthline.orca.internal.bs r4 = r6.f29689a     // Catch: java.lang.Throwable -> L37
            boolean r4 = r4.d()     // Catch: java.lang.Throwable -> L37
            r0.f29691a = r5     // Catch: java.lang.Throwable -> L37
            r0.f29692b = r5     // Catch: java.lang.Throwable -> L37
            r0.f29693c = r2     // Catch: java.lang.Throwable -> L37
            r0.f = r3     // Catch: java.lang.Throwable -> L37
            java.lang.Object r7 = r7.mo3654startProcessgIAlus(r4, r0)     // Catch: java.lang.Throwable -> L37
            if (r7 != r1) goto L8f
        L8e:
            return r1
        L8f:
            yhm.o.b(r7)     // Catch: java.lang.Throwable -> L37
        L92:
            com.fourthline.orca.internal.nv r7 = com.fourthline.orca.internal.nv.f31486a     // Catch: java.lang.Throwable -> L37
            yhm.m$a r0 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L37
            return r7
        L97:
            yhm.m$a r0 = yhm.m.INSTANCE
            yhm.n r7 = yhm.o.a(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.ir0.a(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
