package com.fourthline.orca.internal;

import com.fourthline.orca.internal.cw0;
import com.fourthline.orca.internal.dw0;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class gx implements dw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final cw0 f29040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final is0 f29041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final js0 f29042c;
    private final k81 d;
    private final String e;

    public static final class a extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f29043a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f29044b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f29045c;
        /* synthetic */ Object d;
        int f;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.d = obj2;
            this.f |= Integer.MIN_VALUE;
            return gx.this.a((String) null, (cw0.a.C0180a) null, this);
        }
    }

    public static final class b extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f29046a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f29047b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f29048c;
        Object d;
        Object e;
        Object f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f29049g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f29050h;
        int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f29051j;
        int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f29052l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f29054n;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f29052l = obj2;
            this.f29054n |= Integer.MIN_VALUE;
            return gx.this.a((List) null, this);
        }
    }

    public static final class c extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f29055a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f29056b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f29057c;
        Object d;
        Object e;
        Object f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f29058g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f29059h;
        Object i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f29060j;
        int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f29061l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f29062m;
        int o;

        public c(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f29062m = obj2;
            this.o |= Integer.MIN_VALUE;
            return gx.this.a((String) null, (List) null, this);
        }
    }

    public static final class d extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f29064a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f29065b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f29066c;
        /* synthetic */ Object d;
        int f;

        public d(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.d = obj2;
            this.f |= Integer.MIN_VALUE;
            Object objA = gx.this.a((dw0.a) null, this);
            return objA == fim.a.COROUTINE_SUSPENDED ? objA : new yhm.m(objA);
        }
    }

    public gx(cw0 qesRetrieveSigningDetailsRequestWorker, is0 qesDownloadLegalDocumentWorker, js0 qesDownloadSignDocumentWorker, k81 timedProcessAnalytics) {
        Intrinsics.checkNotNullParameter(qesRetrieveSigningDetailsRequestWorker, "qesRetrieveSigningDetailsRequestWorker");
        Intrinsics.checkNotNullParameter(qesDownloadLegalDocumentWorker, "qesDownloadLegalDocumentWorker");
        Intrinsics.checkNotNullParameter(qesDownloadSignDocumentWorker, "qesDownloadSignDocumentWorker");
        Intrinsics.checkNotNullParameter(timedProcessAnalytics, "timedProcessAnalytics");
        this.f29040a = qesRetrieveSigningDetailsRequestWorker;
        this.f29041b = qesDownloadLegalDocumentWorker;
        this.f29042c = qesDownloadSignDocumentWorker;
        this.d = timedProcessAnalytics;
        this.e = "qes_get_signature_details";
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007d, code lost:
    
        if (r7 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.dw0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.fourthline.orca.internal.dw0.a r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.fourthline.orca.internal.gx.d
            if (r0 == 0) goto L13
            r0 = r7
            com.fourthline.orca.internal.gx$d r0 = (com.fourthline.orca.internal.gx.d) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            com.fourthline.orca.internal.gx$d r0 = new com.fourthline.orca.internal.gx$d
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.d
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r6 = r0.f29065b
            com.fourthline.orca.internal.cw0$a r6 = (com.fourthline.orca.internal.cw0.a) r6
            java.lang.Object r6 = r0.f29064a
            com.fourthline.orca.internal.dw0$a r6 = (com.fourthline.orca.internal.dw0.a) r6
            yhm.o.b(r7)     // Catch: java.lang.Throwable -> L32
            goto L80
        L32:
            r6 = move-exception
            goto L85
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3c:
            java.lang.Object r6 = r0.f29064a
            com.fourthline.orca.internal.dw0$a r6 = (com.fourthline.orca.internal.dw0.a) r6
            yhm.o.b(r7)
            yhm.m r7 = (yhm.m) r7
            java.lang.Object r7 = r7.f314193a
            goto L5f
        L48:
            yhm.o.b(r7)
            com.fourthline.orca.internal.k81 r7 = r5.d
            java.lang.String r2 = r5.e
            r7.b(r2)
            com.fourthline.orca.internal.cw0 r7 = r5.f29040a
            r0.f29064a = r6
            r0.f = r4
            java.lang.Object r7 = r7.a(r6, r0)
            if (r7 != r1) goto L5f
            goto L7f
        L5f:
            yhm.m$a r2 = yhm.m.INSTANCE
            boolean r2 = r7 instanceof yhm.n
            if (r2 != 0) goto L8c
            com.fourthline.orca.internal.cw0$a r7 = (com.fourthline.orca.internal.cw0.a) r7     // Catch: java.lang.Throwable -> L32
            java.lang.String r6 = r6.a()     // Catch: java.lang.Throwable -> L32
            com.fourthline.orca.internal.cw0$a$a r7 = r7.a()     // Catch: java.lang.Throwable -> L32
            r2 = 0
            r0.f29064a = r2     // Catch: java.lang.Throwable -> L32
            r0.f29065b = r2     // Catch: java.lang.Throwable -> L32
            r2 = 0
            r0.f29066c = r2     // Catch: java.lang.Throwable -> L32
            r0.f = r3     // Catch: java.lang.Throwable -> L32
            java.lang.Object r7 = r5.a(r6, r7, r0)     // Catch: java.lang.Throwable -> L32
            if (r7 != r1) goto L80
        L7f:
            return r1
        L80:
            com.fourthline.orca.internal.dw0$b r7 = (com.fourthline.orca.internal.dw0.b) r7     // Catch: java.lang.Throwable -> L32
            yhm.m$a r6 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L32
            return r7
        L85:
            yhm.m$a r7 = yhm.m.INSTANCE
            yhm.n r6 = yhm.o.a(r6)
            return r6
        L8c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.gx.a(com.fourthline.orca.internal.dw0$a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007a, code lost:
    
        if (r11 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r9, com.fourthline.orca.internal.cw0.a.C0180a r10, kotlin.coroutines.Continuation r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.fourthline.orca.internal.gx.a
            if (r0 == 0) goto L13
            r0 = r11
            com.fourthline.orca.internal.gx$a r0 = (com.fourthline.orca.internal.gx.a) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            com.fourthline.orca.internal.gx$a r0 = new com.fourthline.orca.internal.gx$a
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.d
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L53
            if (r2 == r5) goto L43
            if (r2 != r4) goto L3b
            java.lang.Object r9 = r0.f29045c
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r10 = r0.f29044b
            com.fourthline.orca.internal.cw0$a$a r10 = (com.fourthline.orca.internal.cw0.a.C0180a) r10
            java.lang.Object r0 = r0.f29043a
            java.lang.String r0 = (java.lang.String) r0
            yhm.o.b(r11)     // Catch: java.lang.Throwable -> L38
        L36:
            r4 = r9
            goto L7d
        L38:
            r0 = move-exception
            r9 = r0
            goto L9e
        L3b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L43:
            java.lang.Object r9 = r0.f29044b
            r10 = r9
            com.fourthline.orca.internal.cw0$a$a r10 = (com.fourthline.orca.internal.cw0.a.C0180a) r10
            java.lang.Object r9 = r0.f29043a
            java.lang.String r9 = (java.lang.String) r9
            yhm.o.b(r11)     // Catch: java.lang.Throwable -> L50
            goto L67
        L50:
            r0 = move-exception
            r9 = r0
            goto La6
        L53:
            yhm.o.b(r11)
            java.util.List r11 = r10.e()     // Catch: java.lang.Throwable -> L50
            r0.f29043a = r3     // Catch: java.lang.Throwable -> L50
            r0.f29044b = r10     // Catch: java.lang.Throwable -> L50
            r0.f = r5     // Catch: java.lang.Throwable -> L50
            java.lang.Object r11 = r8.a(r9, r11, r0)     // Catch: java.lang.Throwable -> L50
            if (r11 != r1) goto L67
            goto L7c
        L67:
            r9 = r11
            java.util.List r9 = (java.util.List) r9     // Catch: java.lang.Throwable -> L50
            java.util.List r11 = r10.b()     // Catch: java.lang.Throwable -> L38
            r0.f29043a = r3     // Catch: java.lang.Throwable -> L38
            r0.f29044b = r10     // Catch: java.lang.Throwable -> L38
            r0.f29045c = r9     // Catch: java.lang.Throwable -> L38
            r0.f = r4     // Catch: java.lang.Throwable -> L38
            java.lang.Object r11 = r8.a(r11, r0)     // Catch: java.lang.Throwable -> L38
            if (r11 != r1) goto L36
        L7c:
            return r1
        L7d:
            r5 = r11
            java.util.List r5 = (java.util.List) r5     // Catch: java.lang.Throwable -> L38
            com.fourthline.orca.internal.k81 r9 = r8.d
            java.lang.String r11 = r8.e
            r9.c(r11)
            com.fourthline.orca.internal.dw0$b r9 = new com.fourthline.orca.internal.dw0$b
            java.lang.String r3 = r10.c()
            java.util.List r6 = r10.a()
            com.fourthline.orca.internal.cw0$a$a$c r7 = r10.d()
            com.fourthline.orca.internal.dw0$b$a r2 = new com.fourthline.orca.internal.dw0$b$a
            r2.<init>(r3, r4, r5, r6, r7)
            r9.<init>(r2)
            return r9
        L9e:
            com.fourthline.orca.internal.k81 r10 = r8.d
            java.lang.String r11 = r8.e
            r10.a(r11)
            throw r9
        La6:
            com.fourthline.orca.internal.k81 r10 = r8.d
            java.lang.String r11 = r8.e
            r10.a(r11)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.gx.a(java.lang.String, com.fourthline.orca.internal.cw0$a$a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00b4 -> B:21:0x00bb). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r13, java.util.List r14, kotlin.coroutines.Continuation r15) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.gx.a(java.lang.String, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00b7 -> B:21:0x00b8). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.List r12, kotlin.coroutines.Continuation r13) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.gx.a(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final dw0.b.a.C0188a a(cw0.a.C0180a.b bVar, String str) {
        return new dw0.b.a.C0188a(bVar.b(), bVar.a(), str, bVar.c(), bVar.d());
    }

    private final dw0.b.a.C0189b a(cw0.a.C0180a.d dVar, String str) {
        return new dw0.b.a.C0189b(dVar.c(), dVar.a(), str);
    }
}
