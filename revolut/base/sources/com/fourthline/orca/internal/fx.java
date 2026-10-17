package com.fourthline.orca.internal;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class fx implements h00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fg1 f28678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ej f28679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p01 f28680c;
    private final r11 d;

    public static final class a extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f28681a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f28682b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f28683c;
        Object d;
        Object e;
        int f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f28684g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f28685h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f28686j;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f28685h = obj2;
            this.f28686j |= Integer.MIN_VALUE;
            Object objA = fx.this.a(null, this);
            return objA == fim.a.COROUTINE_SUSPENDED ? objA : new yhm.m(objA);
        }
    }

    public fx(fg1 mobileSessionWorker, ej documentFlowConfigWorker, p01 selfieFlowConfigWorker, r11 selfieModelDownloadWorker) {
        Intrinsics.checkNotNullParameter(mobileSessionWorker, "mobileSessionWorker");
        Intrinsics.checkNotNullParameter(documentFlowConfigWorker, "documentFlowConfigWorker");
        Intrinsics.checkNotNullParameter(selfieFlowConfigWorker, "selfieFlowConfigWorker");
        Intrinsics.checkNotNullParameter(selfieModelDownloadWorker, "selfieModelDownloadWorker");
        this.f28678a = mobileSessionWorker;
        this.f28679b = documentFlowConfigWorker;
        this.f28680c = selfieFlowConfigWorker;
        this.d = selfieModelDownloadWorker;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0176, code lost:
    
        if (r7.a(r6, r0) == r1) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0159 A[Catch: all -> 0x004c, TryCatch #1 {all -> 0x004c, blocks: (B:15:0x0042, B:65:0x017a, B:22:0x0065, B:55:0x012f, B:57:0x0148, B:61:0x0159, B:25:0x007d, B:51:0x0103, B:47:0x00e0), top: B:70:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.h00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.fourthline.orca.internal.h00.a r13, kotlin.coroutines.Continuation r14) {
        /*
            Method dump skipped, instruction units count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.fx.a(com.fourthline.orca.internal.h00$a, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
