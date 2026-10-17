package com.fourthline.orca.internal;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class q21 implements u41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f32177a;

    public static final class a extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f32178a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f32179b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f32180c;
        Object d;
        Object e;
        int f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f32181g;
        int i;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f32181g = obj2;
            this.i |= Integer.MIN_VALUE;
            return q21.this.a(null, null, this);
        }
    }

    public q21(List handlers) {
        Intrinsics.checkNotNullParameter(handlers, "handlers");
        this.f32177a = handlers;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0077 -> B:12:0x003d). Please report as a decompilation issue!!! */
    @Override // com.fourthline.orca.internal.u41
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.fourthline.orca.internal.dp r7, com.fourthline.orca.internal.g51 r8, kotlin.coroutines.Continuation r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.fourthline.orca.internal.q21.a
            if (r0 == 0) goto L13
            r0 = r9
            com.fourthline.orca.internal.q21$a r0 = (com.fourthline.orca.internal.q21.a) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            com.fourthline.orca.internal.q21$a r0 = new com.fourthline.orca.internal.q21$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f32181g
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.i
            r3 = 1
            if (r2 == 0) goto L47
            if (r2 != r3) goto L3f
            java.lang.Object r7 = r0.e
            com.fourthline.orca.internal.u41 r7 = (com.fourthline.orca.internal.u41) r7
            java.lang.Object r7 = r0.d
            com.fourthline.orca.internal.u41 r7 = (com.fourthline.orca.internal.u41) r7
            java.lang.Object r7 = r0.f32180c
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r8 = r0.f32179b
            com.fourthline.orca.internal.g51 r8 = (com.fourthline.orca.internal.g51) r8
            java.lang.Object r2 = r0.f32178a
            com.fourthline.orca.internal.dp r2 = (com.fourthline.orca.internal.dp) r2
            yhm.o.b(r9)
            r5 = r0
            r0 = r8
            r8 = r2
        L3d:
            r2 = r5
            goto L7b
        L3f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L47:
            yhm.o.b(r9)
            java.util.List r9 = r6.f32177a
            java.util.Iterator r9 = r9.iterator()
            r5 = r8
            r8 = r7
            r7 = r9
            r9 = r5
        L54:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L83
            java.lang.Object r2 = r7.next()
            com.fourthline.orca.internal.u41 r2 = (com.fourthline.orca.internal.u41) r2
            r0.f32178a = r8
            r0.f32179b = r9
            r0.f32180c = r7
            r4 = 0
            r0.d = r4
            r0.e = r4
            r4 = 0
            r0.f = r4
            r0.i = r3
            java.lang.Object r2 = r2.a(r8, r9, r0)
            if (r2 != r1) goto L77
            return r1
        L77:
            r5 = r0
            r0 = r9
            r9 = r2
            goto L3d
        L7b:
            com.fourthline.orca.internal.u41$a r4 = com.fourthline.orca.internal.u41.a.f33955c
            if (r9 != r4) goto L80
            return r4
        L80:
            r9 = r0
            r0 = r2
            goto L54
        L83:
            com.fourthline.orca.internal.u41$a r7 = com.fourthline.orca.internal.u41.a.f33954b
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.q21.a(com.fourthline.orca.internal.dp, com.fourthline.orca.internal.g51, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.fourthline.orca.internal.u41
    public /* bridge */ void reset() {
        super.reset();
    }
}
