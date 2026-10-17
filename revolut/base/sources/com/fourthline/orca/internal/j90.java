package com.fourthline.orca.internal;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class j90 implements v3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ib0 f29832a;

    public static final class a extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f29833a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f29834b;
        int d;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f29834b = obj2;
            this.d |= Integer.MIN_VALUE;
            Object objA = j90.this.a(null, this);
            return objA == fim.a.COROUTINE_SUSPENDED ? objA : new yhm.m(objA);
        }
    }

    public j90(ib0 networkService) {
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        this.f29832a = networkService;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // com.fourthline.orca.internal.v3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.fourthline.orca.internal.v3.b r17, kotlin.coroutines.Continuation r18) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.j90.a(com.fourthline.orca.internal.v3$b, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
