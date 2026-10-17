package com.fourthline.orca.internal;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class bb implements pu {
    public static final a d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final cw f27067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ov f27068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final zr f27069c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f27070a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f27071b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f27072c;
        int d;
        /* synthetic */ Object e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f27073g;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.e = obj2;
            this.f27073g |= Integer.MIN_VALUE;
            Object objA = bb.this.a(null, this);
            return objA == fim.a.COROUTINE_SUSPENDED ? objA : new yhm.m(objA);
        }
    }

    public static final class c extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27074a;

        public c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return bb.this.new c(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            Object objA;
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f27074a;
            if (i == 0) {
                yhm.o.b(obj2);
                ov ovVar = bb.this.f27068b;
                this.f27074a = 1;
                objA = ovVar.a(this);
                if (objA == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                objA = ((yhm.m) obj2).f314193a;
            }
            return new yhm.m(objA);
        }
    }

    public bb(cw eidWorkflowTokenUrlWorker, ov eidSdkConnectedWorker, zr eidAccessRightsWorker) {
        Intrinsics.checkNotNullParameter(eidWorkflowTokenUrlWorker, "eidWorkflowTokenUrlWorker");
        Intrinsics.checkNotNullParameter(eidSdkConnectedWorker, "eidSdkConnectedWorker");
        Intrinsics.checkNotNullParameter(eidAccessRightsWorker, "eidAccessRightsWorker");
        this.f27067a = eidWorkflowTokenUrlWorker;
        this.f27068b = eidSdkConnectedWorker;
        this.f27069c = eidAccessRightsWorker;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ce, code lost:
    
        if (r11 == r1) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b3 A[Catch: all -> 0x003c, TryCatch #2 {all -> 0x003c, blocks: (B:14:0x0033, B:43:0x00d1, B:45:0x00da, B:55:0x0107, B:46:0x00e6, B:47:0x00eb, B:21:0x0051, B:34:0x009c, B:38:0x00af, B:40:0x00b3, B:48:0x00ec, B:50:0x00f0, B:52:0x00fa, B:54:0x0101, B:56:0x010a, B:57:0x010f, B:37:0x00a3, B:29:0x0080, B:30:0x0083), top: B:66:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ec A[Catch: all -> 0x003c, TryCatch #2 {all -> 0x003c, blocks: (B:14:0x0033, B:43:0x00d1, B:45:0x00da, B:55:0x0107, B:46:0x00e6, B:47:0x00eb, B:21:0x0051, B:34:0x009c, B:38:0x00af, B:40:0x00b3, B:48:0x00ec, B:50:0x00f0, B:52:0x00fa, B:54:0x0101, B:56:0x010a, B:57:0x010f, B:37:0x00a3, B:29:0x0080, B:30:0x0083), top: B:66:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.pu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.fourthline.orca.internal.pu.a r11, kotlin.coroutines.Continuation r12) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.bb.a(com.fourthline.orca.internal.pu$a, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
