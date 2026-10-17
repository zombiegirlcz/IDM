package com.fourthline.orca.internal;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class na0 implements is0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ib0 f31359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final px f31360b;

    public static final class a extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f31361a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f31362b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f31363c;
        Object d;
        int e;
        int f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f31364g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f31365h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f31366j;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f31365h = obj2;
            this.f31366j |= Integer.MIN_VALUE;
            Object objA = na0.this.a(null, this);
            return objA == fim.a.COROUTINE_SUSPENDED ? objA : new yhm.m(objA);
        }
    }

    public na0(ib0 networkService, px fileWriter) {
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        Intrinsics.checkNotNullParameter(fileWriter, "fileWriter");
        this.f31359a = networkService;
        this.f31360b = fileWriter;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a0, code lost:
    
        if (r1 == r3) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // com.fourthline.orca.internal.is0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.fourthline.orca.internal.is0.a r17, kotlin.coroutines.Continuation r18) {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.na0.a(com.fourthline.orca.internal.is0$a, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
