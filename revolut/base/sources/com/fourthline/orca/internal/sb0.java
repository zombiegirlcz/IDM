package com.fourthline.orca.internal;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class sb0 implements kh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ib0 f32963a;

    public static final class a extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f32964a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f32965b;
        int d;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f32965b = obj2;
            this.d |= Integer.MIN_VALUE;
            Object objA = sb0.this.a(null, this);
            return objA == fim.a.COROUTINE_SUSPENDED ? objA : new yhm.m(objA);
        }
    }

    public sb0(ib0 networkService) {
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        this.f32963a = networkService;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.kh1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.fourthline.orca.internal.kh1.a r14, kotlin.coroutines.Continuation r15) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.sb0.a(com.fourthline.orca.internal.kh1$a, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
