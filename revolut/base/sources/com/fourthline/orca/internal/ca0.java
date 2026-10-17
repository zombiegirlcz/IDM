package com.fourthline.orca.internal;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ca0 implements qs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ib0 f27428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f27429b;

    public static final class a extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f27430a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f27431b;
        int d;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f27431b = obj2;
            this.d |= Integer.MIN_VALUE;
            Object objA = ca0.this.a(null, this);
            return objA == fim.a.COROUTINE_SUSPENDED ? objA : new yhm.m(objA);
        }
    }

    public ca0(ib0 networkService, boolean z) {
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        this.f27428a = networkService;
        this.f27429b = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.qs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.fourthline.orca.internal.qs.a r14, kotlin.coroutines.Continuation r15) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.ca0.a(com.fourthline.orca.internal.qs$a, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
