package com.fourthline.orca.internal;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ia0 implements c00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ib0 f29542a;

    public static final class a extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f29543a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f29544b;
        int d;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f29544b = obj2;
            this.d |= Integer.MIN_VALUE;
            Object objA = ia0.this.a(null, this);
            return objA == fim.a.COROUTINE_SUSPENDED ? objA : new yhm.m(objA);
        }
    }

    public ia0(ib0 networkService) {
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        this.f29542a = networkService;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.c00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(java.lang.String r14, kotlin.coroutines.Continuation r15) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.ia0.a(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
