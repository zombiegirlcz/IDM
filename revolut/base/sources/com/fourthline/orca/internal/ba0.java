package com.fourthline.orca.internal;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ba0 implements ej {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ib0 f27061a;

    public static final class a extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f27062a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f27063b;
        int d;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f27063b = obj2;
            this.d |= Integer.MIN_VALUE;
            Object objA = ba0.this.a(null, this);
            return objA == fim.a.COROUTINE_SUSPENDED ? objA : new yhm.m(objA);
        }
    }

    public ba0(ib0 networkService) {
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        this.f27061a = networkService;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.ej
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.fourthline.orca.internal.ej.a r14, kotlin.coroutines.Continuation r15) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.ba0.a(com.fourthline.orca.internal.ej$a, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
