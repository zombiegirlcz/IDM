package com.fourthline.orca.internal;

import com.fourthline.orca.internal.ab0;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class h70 implements ib0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ib0 f29157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ka0 f29158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f29159c;

    public static final class a extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f29160a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f29161b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f29162c;
        int e;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f29162c = obj2;
            this.e |= Integer.MIN_VALUE;
            Object objA = h70.this.a((ab0.a) null, this);
            return objA == fim.a.COROUTINE_SUSPENDED ? objA : new yhm.m(objA);
        }
    }

    public static final class b extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f29163a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f29164b;
        int d;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f29164b = obj2;
            this.d |= Integer.MIN_VALUE;
            Object objA = h70.this.a((ab0.c) null, this);
            return objA == fim.a.COROUTINE_SUSPENDED ? objA : new yhm.m(objA);
        }
    }

    public h70(ib0 delegate, ka0 networkLogger) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(networkLogger, "networkLogger");
        this.f29157a = delegate;
        this.f29158b = networkLogger;
        this.f29159c = zhm.y0.b("/newanalytics");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.ib0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.fourthline.orca.internal.ab0.a r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.fourthline.orca.internal.h70.a
            if (r0 == 0) goto L13
            r0 = r8
            com.fourthline.orca.internal.h70$a r0 = (com.fourthline.orca.internal.h70.a) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            com.fourthline.orca.internal.h70$a r0 = new com.fourthline.orca.internal.h70$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f29162c
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            boolean r7 = r0.f29161b
            java.lang.Object r0 = r0.f29160a
            com.fourthline.orca.internal.ab0$a r0 = (com.fourthline.orca.internal.ab0.a) r0
            yhm.o.b(r8)
            yhm.m r8 = (yhm.m) r8
            java.lang.Object r8 = r8.f314193a
            goto L65
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            yhm.o.b(r8)
            java.util.Set r8 = r6.f29159c
            java.lang.String r2 = r7.e()
            boolean r8 = r8.contains(r2)
            if (r8 != 0) goto L52
            com.fourthline.orca.internal.ka0 r2 = r6.f29158b     // Catch: java.lang.Throwable -> L4e
            r2.a(r7)     // Catch: java.lang.Throwable -> L4e
            goto L52
        L4e:
            r2 = move-exception
            r2.printStackTrace()
        L52:
            com.fourthline.orca.internal.ib0 r2 = r6.f29157a
            r4 = 0
            r0.f29160a = r4
            r0.f29161b = r8
            r0.e = r3
            java.lang.Object r7 = r2.a(r7, r0)
            if (r7 != r1) goto L62
            return r1
        L62:
            r5 = r8
            r8 = r7
            r7 = r5
        L65:
            if (r7 != 0) goto L71
            com.fourthline.orca.internal.ka0 r7 = r6.f29158b     // Catch: java.lang.Throwable -> L6d
            r7.a(r8)     // Catch: java.lang.Throwable -> L6d
            goto L71
        L6d:
            r7 = move-exception
            r7.printStackTrace()
        L71:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.h70.a(com.fourthline.orca.internal.ab0$a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.fourthline.orca.internal.ib0
    public mb.d b() {
        return this.f29157a.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.ib0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.fourthline.orca.internal.ab0.c r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.fourthline.orca.internal.h70.b
            if (r0 == 0) goto L13
            r0 = r6
            com.fourthline.orca.internal.h70$b r0 = (com.fourthline.orca.internal.h70.b) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            com.fourthline.orca.internal.h70$b r0 = new com.fourthline.orca.internal.h70$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f29164b
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r5 = r0.f29163a
            com.fourthline.orca.internal.ab0$c r5 = (com.fourthline.orca.internal.ab0.c) r5
            yhm.o.b(r6)
            yhm.m r6 = (yhm.m) r6
            java.lang.Object r5 = r6.f314193a
            goto L52
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            yhm.o.b(r6)
            com.fourthline.orca.internal.ka0 r6 = r4.f29158b     // Catch: java.lang.Throwable -> L40
            r6.a(r5)     // Catch: java.lang.Throwable -> L40
            goto L44
        L40:
            r6 = move-exception
            r6.printStackTrace()
        L44:
            com.fourthline.orca.internal.ib0 r6 = r4.f29157a
            r2 = 0
            r0.f29163a = r2
            r0.d = r3
            java.lang.Object r5 = r6.a(r5, r0)
            if (r5 != r1) goto L52
            return r1
        L52:
            com.fourthline.orca.internal.ka0 r6 = r4.f29158b     // Catch: java.lang.Throwable -> L58
            r6.a(r5)     // Catch: java.lang.Throwable -> L58
            goto L5c
        L58:
            r6 = move-exception
            r6.printStackTrace()
        L5c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.h70.a(com.fourthline.orca.internal.ab0$c, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
