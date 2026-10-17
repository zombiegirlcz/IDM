package com.fourthline.orca.internal;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes23.dex */
public final class kv0 implements wd1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fx0 f30418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final cx0 f30419b;

    public static final class a extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f30420a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f30421b;
        final /* synthetic */ a70 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(a70 a70Var, Continuation continuation) {
            super(2, continuation);
            this.d = a70Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(FlowCollector flowCollector, Continuation continuation) {
            return ((a) create(flowCollector, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            a aVar = kv0.this.new a(this.d, continuation);
            aVar.f30421b = obj2;
            return aVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
        
            if (r7.a(r0, r2, r6) == r1) goto L15;
         */
        @Override // gim.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f30421b
                kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
                fim.a r1 = fim.a.COROUTINE_SUSPENDED
                int r2 = r6.f30420a
                r3 = 0
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L21
                if (r2 == r5) goto L1d
                if (r2 != r4) goto L15
                yhm.o.b(r7)
                goto L48
            L15:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1d:
                yhm.o.b(r7)
                goto L35
            L21:
                yhm.o.b(r7)
                com.fourthline.orca.internal.xd1$c r7 = new com.fourthline.orca.internal.xd1$c
                r2 = 0
                r7.<init>(r2, r5, r3)
                r6.f30421b = r0
                r6.f30420a = r5
                java.lang.Object r7 = r0.emit(r7, r6)
                if (r7 != r1) goto L35
                goto L47
            L35:
                com.fourthline.orca.internal.kv0 r7 = com.fourthline.orca.internal.kv0.this
                com.fourthline.orca.internal.a70 r2 = r6.d
                com.fourthline.core.location.Coordinate r2 = r2.a()
                r6.f30421b = r3
                r6.f30420a = r4
                java.lang.Object r7 = r7.a(r0, r2, r6)
                if (r7 != r1) goto L48
            L47:
                return r1
            L48:
                kotlin.Unit r7 = kotlin.Unit.f186387a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.kv0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class b extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f30423a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f30424b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f30425c;
        Object d;
        int e;
        /* synthetic */ Object f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f30427h;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f = obj2;
            this.f30427h |= Integer.MIN_VALUE;
            return kv0.this.a(null, null, this);
        }
    }

    public kv0(fx0 startSignatureWorker, cx0 repository) {
        Intrinsics.checkNotNullParameter(startSignatureWorker, "startSignatureWorker");
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f30418a = startSignatureWorker;
        this.f30419b = repository;
    }

    @Override // com.fourthline.orca.internal.wd1
    public Object a(a70 a70Var, Continuation continuation) {
        return new vkm.v1(new a(a70Var, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a0, code lost:
    
        if (r7.emit(r8, r0) == r1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00be, code lost:
    
        if (r7.emit(r8, r0) == r1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00db, code lost:
    
        if (r7.emit(r8, r0) == r1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f8, code lost:
    
        if (r7.emit(r8, r0) == r1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0122, code lost:
    
        if (r7.emit(r8, r0) == r1) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlinx.coroutines.flow.FlowCollector r7, com.fourthline.core.location.Coordinate r8, kotlin.coroutines.Continuation r9) {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.kv0.a(kotlinx.coroutines.flow.FlowCollector, com.fourthline.core.location.Coordinate, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
