package com.fourthline.orca.internal;

import com.fourthline.orca.internal.nc1;
import java.io.IOException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class t50 implements nc1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function0 f33203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ib0 f33204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f33205c;

    public static final class a extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f33206a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f33207b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f33208c;
        int d;
        /* synthetic */ Object e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f33209g;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) throws IOException {
            this.e = obj2;
            this.f33209g |= Integer.MIN_VALUE;
            Object objA = t50.this.a(null, 0L, this);
            return objA == fim.a.COROUTINE_SUSPENDED ? objA : new yhm.m(objA);
        }
    }

    public t50(Function0 workflowIdProvider, ib0 networkService, double d) {
        Intrinsics.checkNotNullParameter(workflowIdProvider, "workflowIdProvider");
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        this.f33203a = workflowIdProvider;
        this.f33204b = networkService;
        this.f33205c = d;
    }

    @Override // com.fourthline.orca.internal.nc1
    public void a(nc1.a input) {
        Intrinsics.checkNotNullParameter(input, "input");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // com.fourthline.orca.internal.nc1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.fourthline.orca.internal.nc1.a r20, long r21, kotlin.coroutines.Continuation r23) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.t50.a(com.fourthline.orca.internal.nc1$a, long, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
