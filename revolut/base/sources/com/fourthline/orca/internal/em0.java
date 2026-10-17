package com.fourthline.orca.internal;

import android.content.Context;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class em0 implements f30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e30 f28187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f28188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final rc.b f28189c;
    private final hlm.a d;
    private rc.a e;
    private Long f;

    public static final class a extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f28190a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f28191b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f28192c;
        Object d;
        int e;
        int f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f28193g;
        int i;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f28193g = obj2;
            this.i |= Integer.MIN_VALUE;
            return em0.this.a(0L, this);
        }
    }

    public static final class b extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f28195a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f28196b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f28197c;
        Object d;
        Object e;
        int f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f28198g;
        int i;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f28198g = obj2;
            this.i |= Integer.MIN_VALUE;
            Object objA = em0.this.a(0L, (String) null, this);
            return objA == fim.a.COROUTINE_SUSPENDED ? objA : new yhm.m(objA);
        }
    }

    public em0(Context context, e30 analytics) {
        onh.b bVar;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        this.f28187a = analytics;
        Context applicationContext = context.getApplicationContext();
        this.f28188b = applicationContext;
        synchronized (rc.j.class) {
            try {
                if (rc.j.f253155a == null) {
                    Context applicationContext2 = applicationContext.getApplicationContext();
                    rc.j.f253155a = new onh.b(applicationContext2 != null ? applicationContext2 : applicationContext);
                }
                bVar = rc.j.f253155a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        rc.b bVar2 = (rc.b) ((zc.m) bVar.f226950b).a();
        Intrinsics.checkNotNullExpressionValue(bVar2, "createStandard(...)");
        this.f28189c = bVar2;
        this.d = hlm.d.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x009c, code lost:
    
        if (r12 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.f30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(long r9, java.lang.String r11, kotlin.coroutines.Continuation r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof com.fourthline.orca.internal.em0.b
            if (r0 == 0) goto L13
            r0 = r12
            com.fourthline.orca.internal.em0$b r0 = (com.fourthline.orca.internal.em0.b) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            com.fourthline.orca.internal.em0$b r0 = new com.fourthline.orca.internal.em0$b
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f28198g
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.i
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L5b
            if (r2 == r4) goto L46
            if (r2 != r3) goto L3e
            java.lang.Object r9 = r0.e
            rc.w r9 = (rc.w) r9
            java.lang.Object r9 = r0.d
            rc.a r9 = (rc.a) r9
            java.lang.Object r9 = r0.f28197c
            com.fourthline.orca.internal.em0 r9 = (com.fourthline.orca.internal.em0) r9
            java.lang.Object r9 = r0.f28196b
            java.lang.String r9 = (java.lang.String) r9
            yhm.o.b(r12)     // Catch: java.lang.Throwable -> L3b
            goto L9f
        L3b:
            r9 = move-exception
            goto Lb3
        L3e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L46:
            int r9 = r0.f
            long r10 = r0.f28195a
            java.lang.Object r2 = r0.f28197c
            com.fourthline.orca.internal.em0 r2 = (com.fourthline.orca.internal.em0) r2
            java.lang.Object r2 = r0.f28196b
            java.lang.String r2 = (java.lang.String) r2
            yhm.o.b(r12)     // Catch: java.lang.Throwable -> L3b
            r7 = r12
            r12 = r9
            r9 = r10
            r11 = r2
            r2 = r7
            goto L72
        L5b:
            yhm.o.b(r12)
            yhm.m$a r12 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L3b
            r0.f28196b = r11     // Catch: java.lang.Throwable -> L3b
            r0.f28197c = r5     // Catch: java.lang.Throwable -> L3b
            r0.f28195a = r9     // Catch: java.lang.Throwable -> L3b
            r12 = 0
            r0.f = r12     // Catch: java.lang.Throwable -> L3b
            r0.i = r4     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r2 = r8.a(r9, r0)     // Catch: java.lang.Throwable -> L3b
            if (r2 != r1) goto L72
            goto L9e
        L72:
            rc.a r2 = (rc.a) r2     // Catch: java.lang.Throwable -> L3b
            int r4 = zc.j.f320986c     // Catch: java.lang.Throwable -> L3b
            zc.l r4 = zc.l.f320989g     // Catch: java.lang.Throwable -> L3b
            if (r4 == 0) goto Lab
            rc.w r6 = new rc.w     // Catch: java.lang.Throwable -> L3b
            r6.<init>(r11, r4)     // Catch: java.lang.Throwable -> L3b
            rc.t r2 = (rc.t) r2     // Catch: java.lang.Throwable -> L3b
            com.google.android.gms.tasks.Task r11 = r2.a(r6)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r2 = "request(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r2)     // Catch: java.lang.Throwable -> L3b
            r0.f28196b = r5     // Catch: java.lang.Throwable -> L3b
            r0.f28197c = r5     // Catch: java.lang.Throwable -> L3b
            r0.d = r5     // Catch: java.lang.Throwable -> L3b
            r0.e = r5     // Catch: java.lang.Throwable -> L3b
            r0.f28195a = r9     // Catch: java.lang.Throwable -> L3b
            r0.f = r12     // Catch: java.lang.Throwable -> L3b
            r0.i = r3     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r12 = jh.d.b(r11, r0)     // Catch: java.lang.Throwable -> L3b
            if (r12 != r1) goto L9f
        L9e:
            return r1
        L9f:
            rc.s r12 = (rc.s) r12     // Catch: java.lang.Throwable -> L3b
            java.lang.String r9 = r12.f253173a     // Catch: java.lang.Throwable -> L3b
            com.fourthline.orca.internal.g30 r10 = new com.fourthline.orca.internal.g30     // Catch: java.lang.Throwable -> L3b
            r10.<init>(r9)     // Catch: java.lang.Throwable -> L3b
            yhm.m$a r9 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L3b
            return r10
        Lab:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L3b
            java.lang.String r10 = "Null verdictOptOut"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L3b
            throw r9     // Catch: java.lang.Throwable -> L3b
        Lb3:
            yhm.m$a r10 = yhm.m.INSTANCE
            yhm.n r9 = yhm.o.a(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.em0.a(long, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v2, types: [hlm.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r11, kotlin.coroutines.Continuation r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.em0.a(long, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
