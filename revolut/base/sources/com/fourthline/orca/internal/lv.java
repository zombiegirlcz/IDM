package com.fourthline.orca.internal;

import com.fourthline.core.eid.EidServiceProvider;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes23.dex */
public final class lv implements iv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bs f30758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EidServiceProvider f30759b;

    public static final class a extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f30760a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f30761b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Flow f30762c;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.lv$a$a, reason: collision with other inner class name */
        public static final class C0243a implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ FlowCollector f30763a;

            /* JADX INFO: renamed from: com.fourthline.orca.internal.lv$a$a$a, reason: collision with other inner class name */
            public static final class C0244a extends gim.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f30764a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f30765b;
                Object d;
                Object e;
                Object f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                Object f30767g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                int f30768h;

                public C0244a(Continuation continuation) {
                    super(continuation);
                }

                @Override // gim.a
                public final Object invokeSuspend(Object obj2) {
                    this.f30764a = obj2;
                    this.f30765b |= Integer.MIN_VALUE;
                    return C0243a.this.emit(null, this);
                }
            }

            public C0243a(FlowCollector flowCollector) {
                this.f30763a = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.fourthline.orca.internal.lv.a.C0243a.C0244a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.fourthline.orca.internal.lv$a$a$a r0 = (com.fourthline.orca.internal.lv.a.C0243a.C0244a) r0
                    int r1 = r0.f30765b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f30765b = r1
                    goto L18
                L13:
                    com.fourthline.orca.internal.lv$a$a$a r0 = new com.fourthline.orca.internal.lv$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f30764a
                    fim.a r1 = fim.a.COROUTINE_SUSPENDED
                    int r2 = r0.f30765b
                    r3 = 1
                    if (r2 == 0) goto L3b
                    if (r2 != r3) goto L33
                    java.lang.Object r5 = r0.f30767g
                    kotlinx.coroutines.flow.FlowCollector r5 = (kotlinx.coroutines.flow.FlowCollector) r5
                    java.lang.Object r5 = r0.f
                    com.fourthline.core.eid.EidAuthEvent r5 = (com.fourthline.core.eid.EidAuthEvent) r5
                    java.lang.Object r5 = r0.e
                    kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
                    yhm.o.b(r6)
                    goto L5c
                L33:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L3b:
                    yhm.o.b(r6)
                    kotlinx.coroutines.flow.FlowCollector r6 = r4.f30763a
                    com.fourthline.core.eid.EidAuthEvent r5 = (com.fourthline.core.eid.EidAuthEvent) r5
                    com.fourthline.orca.internal.iv$a$a r2 = new com.fourthline.orca.internal.iv$a$a
                    r2.<init>(r5)
                    r5 = 0
                    r0.d = r5
                    r0.e = r5
                    r0.f = r5
                    r0.f30767g = r5
                    r5 = 0
                    r0.f30768h = r5
                    r0.f30765b = r3
                    java.lang.Object r5 = r6.emit(r2, r0)
                    if (r5 != r1) goto L5c
                    return r1
                L5c:
                    kotlin.Unit r5 = kotlin.Unit.f186387a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.lv.a.C0243a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Flow flow, Continuation continuation) {
            super(2, continuation);
            this.f30762c = flow;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(FlowCollector flowCollector, Continuation continuation) {
            return ((a) create(flowCollector, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            a aVar = new a(this.f30762c, continuation);
            aVar.f30761b = obj2;
            return aVar;
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f30760a;
            if (i == 0) {
                yhm.o.b(obj2);
                FlowCollector flowCollector = (FlowCollector) this.f30761b;
                Flow flow = this.f30762c;
                C0243a c0243a = new C0243a(flowCollector);
                this.f30761b = null;
                this.f30760a = 1;
                if (flow.collect(c0243a, this) == aVar) {
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

    public static final class b extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f30769a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f30771c;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f30769a = obj2;
            this.f30771c |= Integer.MIN_VALUE;
            return lv.this.a(this);
        }
    }

    public lv(bs bundle, EidServiceProvider provider) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f30758a = bundle;
        this.f30759b = provider;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.iv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.fourthline.orca.internal.lv.b
            if (r0 == 0) goto L13
            r0 = r5
            com.fourthline.orca.internal.lv$b r0 = (com.fourthline.orca.internal.lv.b) r0
            int r1 = r0.f30771c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30771c = r1
            goto L18
        L13:
            com.fourthline.orca.internal.lv$b r0 = new com.fourthline.orca.internal.lv$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f30769a
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f30771c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L43
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            com.fourthline.core.eid.EidServiceProvider r5 = r4.f30759b
            com.fourthline.orca.internal.bs r2 = r4.f30758a
            java.lang.String r2 = com.fourthline.orca.internal.cs.b(r2)
            r0.f30771c = r3
            java.lang.Object r5 = r5.authenticateWithPin(r2, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            kotlinx.coroutines.flow.Flow r5 = (kotlinx.coroutines.flow.Flow) r5
            com.fourthline.orca.internal.lv$a r0 = new com.fourthline.orca.internal.lv$a
            r1 = 0
            r0.<init>(r5, r1)
            vkm.v1 r5 = new vkm.v1
            r5.<init>(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.lv.a(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
