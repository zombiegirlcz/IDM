package com.fourthline.orca.internal;

import com.fourthline.orca.internal.ke;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes23.dex */
public final class y51 implements ry {

    public static final class a extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f35169a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f35170b;
        int d;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f35170b = obj2;
            this.d |= Integer.MIN_VALUE;
            Object objA = y51.this.a(null, this);
            return objA == fim.a.COROUTINE_SUSPENDED ? objA : new yhm.m(objA);
        }
    }

    @Override // com.fourthline.orca.internal.ke
    public void a(le request) {
        Intrinsics.checkNotNullParameter(request, "request");
    }

    @Override // com.fourthline.orca.internal.ke
    public Flow a(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        return new go.g(new ne(identifier, new ke.a.d("Success")), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.ry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.fourthline.orca.internal.h10 r4, kotlin.coroutines.Continuation r5) {
        /*
            r3 = this;
            boolean r4 = r5 instanceof com.fourthline.orca.internal.y51.a
            if (r4 == 0) goto L13
            r4 = r5
            com.fourthline.orca.internal.y51$a r4 = (com.fourthline.orca.internal.y51.a) r4
            int r0 = r4.d
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.d = r0
            goto L18
        L13:
            com.fourthline.orca.internal.y51$a r4 = new com.fourthline.orca.internal.y51$a
            r4.<init>(r5)
        L18:
            java.lang.Object r5 = r4.f35170b
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r4.d
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            java.lang.Object r4 = r4.f35169a
            com.fourthline.orca.internal.h10 r4 = (com.fourthline.orca.internal.h10) r4
            yhm.o.b(r5)
            goto L44
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            yhm.o.b(r5)
            r5 = 0
            r4.f35169a = r5
            r4.d = r2
            r1 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r4 = skm.k0.b(r1, r4)
            if (r4 != r0) goto L44
            return r0
        L44:
            yhm.m$a r4 = yhm.m.INSTANCE
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.y51.a(com.fourthline.orca.internal.h10, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
