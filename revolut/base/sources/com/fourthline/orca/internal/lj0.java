package com.fourthline.orca.internal;

import com.fourthline.orca.internal.ky;
import com.fourthline.orca.internal.re1;
import com.fourthline.orca.internal.xd1;
import java.util.Comparator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes23.dex */
public final class lj0 implements wd1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f30639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ic1 f30640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ry f30641c;
    private final lz d;

    public static final class a extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f30642a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f30643b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f30644c;
        Object d;
        Object e;
        Object f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f30645g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f30646h;
        int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f30647j;

        public a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(FlowCollector flowCollector, Continuation continuation) {
            return ((a) create(flowCollector, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            a aVar = lj0.this.new a(continuation);
            aVar.f30647j = obj2;
            return aVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x005d, code lost:
        
            if (r0.emit(r12, r11) == r1) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x00a8, code lost:
        
            if (r9.a(r0, r12, r11) == r1) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00cc, code lost:
        
            if (r0.emit(r12, r11) == r1) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00cf, code lost:
        
            r2 = r5;
            r5 = r8;
            r6 = r9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x011b, code lost:
        
            if (r0.emit(r12, r11) != r1) goto L26;
         */
        /* JADX WARN: Removed duplicated region for block: B:16:0x007e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x00a8 -> B:26:0x00cf). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00cc -> B:26:0x00cf). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00f7 -> B:33:0x00f8). Please report as a decompilation issue!!! */
        @Override // gim.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instruction units count: 308
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.lj0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class b extends gim.i implements Function3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f30648a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f30649b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f30650c;
        /* synthetic */ Object d;

        public b(Continuation continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(FlowCollector flowCollector, Throwable th10, Continuation continuation) {
            b bVar = new b(continuation);
            bVar.f30650c = flowCollector;
            bVar.d = th10;
            return bVar.invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            FlowCollector flowCollector = (FlowCollector) this.f30650c;
            Throwable th10 = (Throwable) this.d;
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f30649b;
            if (i == 0) {
                yhm.o.b(obj2);
                xd1.b bVar = new xd1.b(new re1.b("An error occurred when completing a View: " + th10.getMessage()));
                this.f30650c = null;
                this.d = null;
                this.f30648a = null;
                this.f30649b = 1;
                if (flowCollector.emit(bVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
            }
            return Unit.f186387a;
        }
    }

    public static final class c extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f30651a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f30652b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f30653c;
        Object d;
        /* synthetic */ Object e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f30654g;

        public c(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.e = obj2;
            this.f30654g |= Integer.MIN_VALUE;
            return lj0.this.a((FlowCollector) null, this);
        }
    }

    public static final class d extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f30655a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f30656b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f30657c;
        Object d;
        int e;
        /* synthetic */ Object f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f30659h;

        public d(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f = obj2;
            this.f30659h |= Integer.MIN_VALUE;
            return lj0.this.a((FlowCollector) null, (h10) null, this);
        }
    }

    public lj0(my flowActionProvider, ic1 uploadDataRequestBuilder, ry dataWorkManager, lz whatsNextWorker) {
        Intrinsics.checkNotNullParameter(flowActionProvider, "flowActionProvider");
        Intrinsics.checkNotNullParameter(uploadDataRequestBuilder, "uploadDataRequestBuilder");
        Intrinsics.checkNotNullParameter(dataWorkManager, "dataWorkManager");
        Intrinsics.checkNotNullParameter(whatsNextWorker, "whatsNextWorker");
        this.f30639a = flowActionProvider;
        this.f30640b = uploadDataRequestBuilder;
        this.f30641c = dataWorkManager;
        this.d = whatsNextWorker;
    }

    @Override // com.fourthline.orca.internal.wd1
    public Object a(ge1 ge1Var, Continuation continuation) {
        return new vkm.y(new vkm.v1(new a(null)), new b(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c3, code lost:
    
        if (r9.emit(r11, r0) == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlinx.coroutines.flow.FlowCollector r9, com.fourthline.orca.internal.h10 r10, kotlin.coroutines.Continuation r11) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.lj0.a(kotlinx.coroutines.flow.FlowCollector, com.fourthline.orca.internal.h10, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00be A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlinx.coroutines.flow.FlowCollector r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.fourthline.orca.internal.lj0.c
            if (r0 == 0) goto L13
            r0 = r9
            com.fourthline.orca.internal.lj0$c r0 = (com.fourthline.orca.internal.lj0.c) r0
            int r1 = r0.f30654g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30654g = r1
            goto L18
        L13:
            com.fourthline.orca.internal.lj0$c r0 = new com.fourthline.orca.internal.lj0$c
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.e
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f30654g
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L6a
            if (r2 == r5) goto L5a
            if (r2 == r4) goto L46
            if (r2 != r3) goto L3e
            java.lang.Object r8 = r0.d
            com.fourthline.orca.internal.h10 r8 = (com.fourthline.orca.internal.h10) r8
            java.lang.Object r8 = r0.f30653c
            com.fourthline.orca.internal.lz$c r8 = (com.fourthline.orca.internal.lz.c) r8
            java.lang.Object r8 = r0.f30652b
            com.fourthline.orca.internal.lz$a r8 = (com.fourthline.orca.internal.lz.a) r8
            java.lang.Object r8 = r0.f30651a
            kotlinx.coroutines.flow.FlowCollector r8 = (kotlinx.coroutines.flow.FlowCollector) r8
            yhm.o.b(r9)
            return r9
        L3e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L46:
            java.lang.Object r8 = r0.d
            com.fourthline.orca.internal.h10 r8 = (com.fourthline.orca.internal.h10) r8
            java.lang.Object r8 = r0.f30653c
            com.fourthline.orca.internal.lz$c r8 = (com.fourthline.orca.internal.lz.c) r8
            java.lang.Object r8 = r0.f30652b
            com.fourthline.orca.internal.lz$a r8 = (com.fourthline.orca.internal.lz.a) r8
            java.lang.Object r8 = r0.f30651a
            kotlinx.coroutines.flow.FlowCollector r8 = (kotlinx.coroutines.flow.FlowCollector) r8
            yhm.o.b(r9)
            goto Lad
        L5a:
            java.lang.Object r8 = r0.f30652b
            com.fourthline.orca.internal.lz$a r8 = (com.fourthline.orca.internal.lz.a) r8
            java.lang.Object r8 = r0.f30651a
            kotlinx.coroutines.flow.FlowCollector r8 = (kotlinx.coroutines.flow.FlowCollector) r8
            yhm.o.b(r9)
            yhm.m r9 = (yhm.m) r9
            java.lang.Object r9 = r9.f314193a
            goto L81
        L6a:
            yhm.o.b(r9)
            com.fourthline.orca.internal.lz$a r9 = new com.fourthline.orca.internal.lz$a
            r9.<init>(r6, r5, r6)
            com.fourthline.orca.internal.lz r2 = r7.d
            r0.f30651a = r8
            r0.f30652b = r6
            r0.f30654g = r5
            java.lang.Object r9 = r2.a(r9, r0)
            if (r9 != r1) goto L81
            goto Lbd
        L81:
            yhm.o.b(r9)
            com.fourthline.orca.internal.lz$b r9 = (com.fourthline.orca.internal.lz.b) r9
            com.fourthline.orca.internal.lz$c r9 = r9.a()
            boolean r2 = r9 instanceof com.fourthline.orca.internal.lz.c.C0245c
            if (r2 == 0) goto Lc4
            com.fourthline.orca.internal.ic1 r2 = r7.f30640b
            com.fourthline.orca.internal.lz$c$c r9 = (com.fourthline.orca.internal.lz.c.C0245c) r9
            com.fourthline.orca.internal.ny r5 = r9.c()
            com.fourthline.orca.internal.h10 r2 = r2.a(r5)
            if (r2 == 0) goto Lbf
            r0.f30651a = r8
            r0.f30652b = r6
            r0.f30653c = r6
            r0.d = r6
            r0.f30654g = r4
            java.lang.Object r9 = r7.a(r8, r2, r0)
            if (r9 != r1) goto Lad
            goto Lbd
        Lad:
            r0.f30651a = r6
            r0.f30652b = r6
            r0.f30653c = r6
            r0.d = r6
            r0.f30654g = r3
            java.lang.Object r8 = r7.a(r8, r0)
            if (r8 != r1) goto Lbe
        Lbd:
            return r1
        Lbe:
            return r8
        Lbf:
            com.fourthline.orca.internal.ny r8 = r9.c()
            return r8
        Lc4:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.lj0.a(kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List a(List list) {
        final hp1 hp1Var = new hp1(0);
        return zhm.d0.P0(list, new Comparator() { // from class: com.fourthline.orca.internal.ip1
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                return lj0.a(hp1Var, obj2, obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int a(Function2 function2, Object obj2, Object obj3) {
        return ((Number) function2.invoke(obj2, obj3)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int a(ky kyVar, ky kyVar2) {
        if (kyVar instanceof ky.c) {
            return -1;
        }
        return kyVar2 instanceof ky.c ? 1 : 0;
    }
}
