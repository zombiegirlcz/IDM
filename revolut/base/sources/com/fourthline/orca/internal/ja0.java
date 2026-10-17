package com.fourthline.orca.internal;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ja0 implements e00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ib0 f29841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f29842b;

    public static final class a extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f29843a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f29844b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f29845c;
        /* synthetic */ Object d;
        int f;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.d = obj2;
            this.f |= Integer.MIN_VALUE;
            Object objA = ja0.this.a(null, this);
            return objA == fim.a.COROUTINE_SUSPENDED ? objA : new yhm.m(objA);
        }
    }

    public ja0(ib0 networkService, boolean z) {
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        this.f29841a = networkService;
        this.f29842b = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.e00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.fourthline.orca.internal.e00.a r14, kotlin.coroutines.Continuation r15) {
        /*
            Method dump skipped, instruction units count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.ja0.a(com.fourthline.orca.internal.e00$a, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
