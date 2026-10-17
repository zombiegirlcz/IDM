package com.fourthline.orca.internal;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class wa0 implements nx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function1 f34560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ib0 f34561b;

    public static final class a extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f34562a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f34563b;
        int d;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f34563b = obj2;
            this.d |= Integer.MIN_VALUE;
            Object objA = wa0.this.a(null, this);
            return objA == fim.a.COROUTINE_SUSPENDED ? objA : new yhm.m(objA);
        }
    }

    public wa0(Function1 endpoint, ib0 networkService) {
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        this.f34560a = endpoint;
        this.f34561b = networkService;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.nx0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.fourthline.orca.internal.nx0.a r14, kotlin.coroutines.Continuation r15) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.wa0.a(com.fourthline.orca.internal.nx0$a, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
