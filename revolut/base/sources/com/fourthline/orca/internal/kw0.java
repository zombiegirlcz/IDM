package com.fourthline.orca.internal;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes23.dex */
public final class kw0 implements wd1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lw0 f30428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final kx0 f30429b;

    public static final class a extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f30430a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f30431b;
        final /* synthetic */ b21 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b21 b21Var, Continuation continuation) {
            super(2, continuation);
            this.d = b21Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(FlowCollector flowCollector, Continuation continuation) {
            return ((a) create(flowCollector, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            a aVar = kw0.this.new a(this.d, continuation);
            aVar.f30431b = obj2;
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
                java.lang.Object r0 = r6.f30431b
                kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
                fim.a r1 = fim.a.COROUTINE_SUSPENDED
                int r2 = r6.f30430a
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
                r6.f30431b = r0
                r6.f30430a = r5
                java.lang.Object r7 = r0.emit(r7, r6)
                if (r7 != r1) goto L35
                goto L47
            L35:
                com.fourthline.orca.internal.kw0 r7 = com.fourthline.orca.internal.kw0.this
                com.fourthline.orca.internal.b21 r2 = r6.d
                com.fourthline.vision.selfie.SelfieScannerResult r2 = r2.a()
                r6.f30431b = r3
                r6.f30430a = r4
                java.lang.Object r7 = r7.a(r0, r2, r6)
                if (r7 != r1) goto L48
            L47:
                return r1
            L48:
                kotlin.Unit r7 = kotlin.Unit.f186387a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.kw0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class b extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f30433a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f30434b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f30435c;
        Object d;
        int e;
        /* synthetic */ Object f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f30437h;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f = obj2;
            this.f30437h |= Integer.MIN_VALUE;
            return kw0.this.a(null, null, this);
        }
    }

    public kw0(lw0 repository, kx0 uploadSelfieWorker) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(uploadSelfieWorker, "uploadSelfieWorker");
        this.f30428a = repository;
        this.f30429b = uploadSelfieWorker;
    }

    @Override // com.fourthline.orca.internal.wd1
    public Object a(b21 b21Var, Continuation continuation) {
        return new vkm.v1(new a(b21Var, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a9, code lost:
    
        if (r10.emit(r11, r0) == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c5, code lost:
    
        if (r10.emit(r11, r0) == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ee, code lost:
    
        if (r10.emit(r11, r0) == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlinx.coroutines.flow.FlowCollector r10, com.fourthline.vision.selfie.SelfieScannerResult r11, kotlin.coroutines.Continuation r12) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.kw0.a(kotlinx.coroutines.flow.FlowCollector, com.fourthline.vision.selfie.SelfieScannerResult, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
