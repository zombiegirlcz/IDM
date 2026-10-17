package com.fourthline.orca.internal;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ab implements ie {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f26749a;

    public static final class a extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f26750a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f26751b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f26752c;
        Object d;
        Object e;
        int f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f26753g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f26754h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f26755j;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f26754h = obj2;
            this.f26755j |= Integer.MIN_VALUE;
            return ab.this.a(null, this);
        }
    }

    public ab(List listeners) {
        Intrinsics.checkNotNullParameter(listeners, "listeners");
        this.f26749a = listeners;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:23:0x0073
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // com.fourthline.orca.internal.ie
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.fourthline.orca.workflow.WorkflowResults.IDV r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.fourthline.orca.internal.ab.a
            if (r0 == 0) goto L13
            r0 = r9
            com.fourthline.orca.internal.ab$a r0 = (com.fourthline.orca.internal.ab.a) r0
            int r1 = r0.f26755j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26755j = r1
            goto L18
        L13:
            com.fourthline.orca.internal.ab$a r0 = new com.fourthline.orca.internal.ab$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f26754h
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f26755j
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 != r4) goto L3c
            int r8 = r0.f
            java.lang.Object r2 = r0.e
            com.fourthline.orca.internal.ie r2 = (com.fourthline.orca.internal.ie) r2
            java.lang.Object r2 = r0.f26752c
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r5 = r0.f26751b
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.lang.Object r5 = r0.f26750a
            com.fourthline.orca.workflow.WorkflowResults$IDV r5 = (com.fourthline.orca.workflow.WorkflowResults.IDV) r5
            yhm.o.b(r9)     // Catch: java.lang.Throwable -> L39
        L39:
            r9 = r8
            r8 = r5
            goto L4f
        L3c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L44:
            yhm.o.b(r9)
            java.util.List r9 = r7.f26749a
            java.util.Iterator r9 = r9.iterator()
            r2 = r9
            r9 = r3
        L4f:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L76
            java.lang.Object r5 = r2.next()
            com.fourthline.orca.internal.ie r5 = (com.fourthline.orca.internal.ie) r5
            r0.f26750a = r8     // Catch: java.lang.Throwable -> L73
            r6 = 0
            r0.f26751b = r6     // Catch: java.lang.Throwable -> L73
            r0.f26752c = r2     // Catch: java.lang.Throwable -> L73
            r0.d = r6     // Catch: java.lang.Throwable -> L73
            r0.e = r6     // Catch: java.lang.Throwable -> L73
            r0.f = r9     // Catch: java.lang.Throwable -> L73
            r0.f26753g = r3     // Catch: java.lang.Throwable -> L73
            r0.f26755j = r4     // Catch: java.lang.Throwable -> L73
            java.lang.Object r5 = r5.a(r8, r0)     // Catch: java.lang.Throwable -> L73
            if (r5 != r1) goto L4f
            return r1
        L73:
            r5 = r8
            r8 = r9
            goto L39
        L76:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.ab.a(com.fourthline.orca.workflow.WorkflowResults$IDV, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
