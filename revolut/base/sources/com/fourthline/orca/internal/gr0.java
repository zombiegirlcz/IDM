package com.fourthline.orca.internal;

import com.fourthline.core.eid.EidServiceProvider;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class gr0 implements xr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bs f28976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EidServiceProvider f28977b;

    public static final class a extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f28978a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f28979b;
        int d;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f28979b = obj2;
            this.d |= Integer.MIN_VALUE;
            Object objA = gr0.this.a(null, this);
            return objA == fim.a.COROUTINE_SUSPENDED ? objA : new yhm.m(objA);
        }
    }

    public gr0(bs bundle, EidServiceProvider provider) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f28976a = bundle;
        this.f28977b = provider;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.xr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.fourthline.orca.internal.xr.a r4, kotlin.coroutines.Continuation r5) {
        /*
            r3 = this;
            boolean r4 = r5 instanceof com.fourthline.orca.internal.gr0.a
            if (r4 == 0) goto L13
            r4 = r5
            com.fourthline.orca.internal.gr0$a r4 = (com.fourthline.orca.internal.gr0.a) r4
            int r0 = r4.d
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.d = r0
            goto L18
        L13:
            com.fourthline.orca.internal.gr0$a r4 = new com.fourthline.orca.internal.gr0$a
            r4.<init>(r5)
        L18:
            java.lang.Object r5 = r4.f28979b
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r4.d
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            java.lang.Object r4 = r4.f28978a
            com.fourthline.orca.internal.xr$a r4 = (com.fourthline.orca.internal.xr.a) r4
            yhm.o.b(r5)
            yhm.m r5 = (yhm.m) r5
            java.lang.Object r4 = r5.f314193a
            goto L48
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            yhm.o.b(r5)
            com.fourthline.core.eid.EidServiceProvider r5 = r3.f28977b
            r1 = 0
            r4.f28978a = r1
            r4.d = r2
            java.lang.Object r4 = r5.mo3652acceptAccessRightsIoAF18A(r4)
            if (r4 != r0) goto L48
            return r0
        L48:
            yhm.o.b(r4)
            yhm.m$a r4 = yhm.m.INSTANCE
            com.fourthline.orca.internal.yr r4 = com.fourthline.orca.internal.yr.f35421a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.gr0.a(com.fourthline.orca.internal.xr$a, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
