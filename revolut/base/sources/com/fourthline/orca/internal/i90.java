package com.fourthline.orca.internal;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class i90 implements t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final nc1 f29530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f29531b;

    public static final class a extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f29532a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f29533b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f29534c;
        int e;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f29534c = obj2;
            this.e |= Integer.MIN_VALUE;
            Object objA = i90.this.a(null, this);
            return objA == fim.a.COROUTINE_SUSPENDED ? objA : new yhm.m(objA);
        }
    }

    public i90(nc1 uploadDocumentImageWorker, boolean z) {
        Intrinsics.checkNotNullParameter(uploadDocumentImageWorker, "uploadDocumentImageWorker");
        this.f29530a = uploadDocumentImageWorker;
        this.f29531b = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.t1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.fourthline.orca.internal.t1.a r8, kotlin.coroutines.Continuation r9) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.i90.a(com.fourthline.orca.internal.t1$a, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
