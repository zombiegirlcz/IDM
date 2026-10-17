package com.fourthline.orca.internal;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class lb0 implements o71 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ib0 f30563a;

    public static final class a extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f30564a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f30565b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f30566c;
        int e;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f30566c = obj2;
            this.e |= Integer.MIN_VALUE;
            Object objA = lb0.this.a(null, null, this);
            return objA == fim.a.COROUTINE_SUSPENDED ? objA : new yhm.m(objA);
        }
    }

    public lb0(ib0 networkService) {
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        this.f30563a = networkService;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // com.fourthline.orca.internal.o71
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(java.lang.String r17, java.lang.String r18, kotlin.coroutines.Continuation r19) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.lb0.a(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
