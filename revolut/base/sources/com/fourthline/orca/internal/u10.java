package com.fourthline.orca.internal;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class u10 implements u41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u41 f33909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f33910b;

    public static final class a extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f33911a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f33912b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f33913c;
        Object d;
        Object e;
        int f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f33914g;
        int i;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f33914g = obj2;
            this.i |= Integer.MIN_VALUE;
            return u10.this.a(null, null, this);
        }
    }

    public static final class b extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f33916a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f33917b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f33918c;
        Object d;
        Object e;
        Object f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f33919g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f33920h;
        int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f33921j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ g51 f33922l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ List f33923m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(g51 g51Var, List list, Continuation continuation) {
            super(2, continuation);
            this.f33922l = g51Var;
            this.f33923m = list;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            b bVar = u10.this.new b(this.f33922l, this.f33923m, continuation);
            bVar.f33921j = obj2;
            return bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0082 A[Catch: CancellationException -> 0x0028, TryCatch #0 {CancellationException -> 0x0028, blocks: (B:6:0x0024, B:23:0x007c, B:25:0x0082, B:20:0x0060, B:26:0x0086, B:29:0x008b, B:30:0x0090), top: B:35:0x0024 }] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0086 A[Catch: CancellationException -> 0x0028, TryCatch #0 {CancellationException -> 0x0028, blocks: (B:6:0x0024, B:23:0x007c, B:25:0x0082, B:20:0x0060, B:26:0x0086, B:29:0x008b, B:30:0x0090), top: B:35:0x0024 }] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0095  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0079 -> B:23:0x007c). Please report as a decompilation issue!!! */
        @Override // gim.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = r10.f33921j
                kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
                fim.a r1 = fim.a.COROUTINE_SUSPENDED
                int r2 = r10.i
                r3 = 0
                r4 = 1
                if (r2 == 0) goto L32
                if (r2 != r4) goto L2a
                int r2 = r10.f33919g
                java.lang.Object r5 = r10.f
                com.fourthline.orca.internal.s10 r5 = (com.fourthline.orca.internal.s10) r5
                java.lang.Object r6 = r10.d
                java.util.Iterator r6 = (java.util.Iterator) r6
                java.lang.Object r7 = r10.f33918c
                java.util.List r7 = (java.util.List) r7
                java.lang.Object r8 = r10.f33917b
                com.fourthline.orca.internal.g51 r8 = (com.fourthline.orca.internal.g51) r8
                java.lang.Object r9 = r10.f33916a
                java.lang.Iterable r9 = (java.lang.Iterable) r9
                yhm.o.b(r11)     // Catch: java.util.concurrent.CancellationException -> L28
                goto L7c
            L28:
                r11 = move-exception
                goto L91
            L2a:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L32:
                yhm.o.b(r11)
                com.fourthline.orca.internal.u10 r11 = com.fourthline.orca.internal.u10.this
                java.util.List r11 = com.fourthline.orca.internal.u10.a(r11)
                com.fourthline.orca.internal.g51 r2 = r10.f33922l
                java.util.List r5 = r10.f33923m
                java.util.Iterator r11 = r11.iterator()
                r6 = r11
                r8 = r2
                r2 = r3
                r7 = r5
            L47:
                boolean r11 = r6.hasNext()
                if (r11 == 0) goto L95
                java.lang.Object r11 = r6.next()
                r5 = r11
                com.fourthline.orca.internal.s10 r5 = (com.fourthline.orca.internal.s10) r5
                boolean r11 = skm.e0.y(r0)
                if (r11 != 0) goto L5d
                kotlin.Unit r11 = kotlin.Unit.f186387a
                return r11
            L5d:
                r5.b()
                r10.f33921j = r0     // Catch: java.util.concurrent.CancellationException -> L28
                r11 = 0
                r10.f33916a = r11     // Catch: java.util.concurrent.CancellationException -> L28
                r10.f33917b = r8     // Catch: java.util.concurrent.CancellationException -> L28
                r10.f33918c = r7     // Catch: java.util.concurrent.CancellationException -> L28
                r10.d = r6     // Catch: java.util.concurrent.CancellationException -> L28
                r10.e = r11     // Catch: java.util.concurrent.CancellationException -> L28
                r10.f = r5     // Catch: java.util.concurrent.CancellationException -> L28
                r10.f33919g = r2     // Catch: java.util.concurrent.CancellationException -> L28
                r10.f33920h = r3     // Catch: java.util.concurrent.CancellationException -> L28
                r10.i = r4     // Catch: java.util.concurrent.CancellationException -> L28
                java.lang.Object r11 = r5.a(r8, r10)     // Catch: java.util.concurrent.CancellationException -> L28
                if (r11 != r1) goto L7c
                return r1
            L7c:
                com.fourthline.orca.internal.t10 r11 = (com.fourthline.orca.internal.t10) r11     // Catch: java.util.concurrent.CancellationException -> L28
                boolean r9 = r11 instanceof com.fourthline.orca.internal.t10.b     // Catch: java.util.concurrent.CancellationException -> L28
                if (r9 == 0) goto L86
                r7.add(r11)     // Catch: java.util.concurrent.CancellationException -> L28
                goto L47
            L86:
                boolean r11 = r11 instanceof com.fourthline.orca.internal.t10.a     // Catch: java.util.concurrent.CancellationException -> L28
                if (r11 == 0) goto L8b
                goto L47
            L8b:
                kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException     // Catch: java.util.concurrent.CancellationException -> L28
                r11.<init>()     // Catch: java.util.concurrent.CancellationException -> L28
                throw r11     // Catch: java.util.concurrent.CancellationException -> L28
            L91:
                r5.a()
                throw r11
            L95:
                kotlin.Unit r11 = kotlin.Unit.f186387a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.u10.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public u10(u41 remoteHandler) {
        Intrinsics.checkNotNullParameter(remoteHandler, "remoteHandler");
        this.f33909a = remoteHandler;
        this.f33910b = zhm.v.k(new h8(), new ri(), new zz0());
    }

    @Override // com.fourthline.orca.internal.u41
    public void reset() {
        this.f33909a.reset();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00b0 A[LOOP:0: B:25:0x00aa->B:27:0x00b0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.u41
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.fourthline.orca.internal.dp r9, com.fourthline.orca.internal.g51 r10, kotlin.coroutines.Continuation r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.fourthline.orca.internal.u10.a
            if (r0 == 0) goto L13
            r0 = r11
            com.fourthline.orca.internal.u10$a r0 = (com.fourthline.orca.internal.u10.a) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            com.fourthline.orca.internal.u10$a r0 = new com.fourthline.orca.internal.u10$a
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f33914g
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.i
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L5f
            if (r2 == r4) goto L47
            if (r2 != r3) goto L3f
            java.lang.Object r9 = r0.e
            com.fourthline.orca.internal.u41$a r9 = (com.fourthline.orca.internal.u41.a) r9
            java.lang.Object r10 = r0.d
            kotlinx.coroutines.Job r10 = (kotlinx.coroutines.Job) r10
            java.lang.Object r10 = r0.f33913c
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r1 = r0.f33912b
            com.fourthline.orca.internal.g51 r1 = (com.fourthline.orca.internal.g51) r1
            java.lang.Object r0 = r0.f33911a
            com.fourthline.orca.internal.dp r0 = (com.fourthline.orca.internal.dp) r0
            yhm.o.b(r11)
            goto La6
        L3f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L47:
            java.lang.Object r9 = r0.e
            com.fourthline.orca.internal.u41 r9 = (com.fourthline.orca.internal.u41) r9
            java.lang.Object r9 = r0.d
            kotlinx.coroutines.Job r9 = (kotlinx.coroutines.Job) r9
            java.lang.Object r10 = r0.f33913c
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r2 = r0.f33912b
            com.fourthline.orca.internal.g51 r2 = (com.fourthline.orca.internal.g51) r2
            java.lang.Object r2 = r0.f33911a
            com.fourthline.orca.internal.dp r2 = (com.fourthline.orca.internal.dp) r2
            yhm.o.b(r11)
            goto L8d
        L5f:
            yhm.o.b(r11)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            elm.g r2 = skm.p0.f264002b
            com.fourthline.orca.internal.u10$b r6 = new com.fourthline.orca.internal.u10$b
            r6.<init>(r10, r11, r5)
            skm.a2 r2 = skm.e0.C(r9, r2, r5, r6, r3)
            com.fourthline.orca.internal.u41 r6 = r8.f33909a
            r0.f33911a = r5
            r0.f33912b = r5
            r0.f33913c = r11
            r0.d = r2
            r0.e = r5
            r7 = 0
            r0.f = r7
            r0.i = r4
            java.lang.Object r9 = r6.a(r9, r10, r0)
            if (r9 != r1) goto L8a
            goto La4
        L8a:
            r10 = r11
            r11 = r9
            r9 = r2
        L8d:
            com.fourthline.orca.internal.u41$a r11 = (com.fourthline.orca.internal.u41.a) r11
            r9.f(r5)
            r0.f33911a = r5
            r0.f33912b = r5
            r0.f33913c = r10
            r0.d = r5
            r0.e = r11
            r0.i = r3
            java.lang.Object r9 = r9.u(r0)
            if (r9 != r1) goto La5
        La4:
            return r1
        La5:
            r9 = r11
        La6:
            java.util.Iterator r10 = r10.iterator()
        Laa:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto Lbd
            java.lang.Object r11 = r10.next()
            com.fourthline.orca.internal.t10$b r11 = (com.fourthline.orca.internal.t10.b) r11
            r11.b()
            r11.a()
            goto Laa
        Lbd:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.u10.a(com.fourthline.orca.internal.dp, com.fourthline.orca.internal.g51, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
