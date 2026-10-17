package com.fourthline.orca.internal;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class oa0 implements js0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function2 f31613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ib0 f31614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final px f31615c;

    public static final class a extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f31616a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f31617b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f31618c;
        Object d;
        int e;
        int f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f31619g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f31620h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f31621j;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f31620h = obj2;
            this.f31621j |= Integer.MIN_VALUE;
            Object objA = oa0.this.a(null, this);
            return objA == fim.a.COROUTINE_SUSPENDED ? objA : new yhm.m(objA);
        }
    }

    public oa0(Function2 endpoint, ib0 networkService, px fileWriter) {
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        Intrinsics.checkNotNullParameter(fileWriter, "fileWriter");
        this.f31613a = endpoint;
        this.f31614b = networkService;
        this.f31615c = fileWriter;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b1, code lost:
    
        if (r1 == r3) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // com.fourthline.orca.internal.js0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.fourthline.orca.internal.js0.a r17, kotlin.coroutines.Continuation r18) {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.oa0.a(com.fourthline.orca.internal.js0$a, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
