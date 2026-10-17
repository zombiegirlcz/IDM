package com.fourthline.orca.internal;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class s9 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f32940c = new a(null);
    public static final int d = 8;
    private static final String e = "CdnAssetBundleDownloadWorker";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t9 f32941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final sg0 f32942b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f32943a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f32944b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f32945c;
        Object d;
        Object e;
        Object f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f32946g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f32947h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f32948j;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f32947h = obj2;
            this.f32948j |= Integer.MIN_VALUE;
            Object objA = s9.this.a(null, this);
            return objA == fim.a.COROUTINE_SUSPENDED ? objA : new yhm.m(objA);
        }
    }

    public s9(t9 cdnUrlDownloadWorker, sg0 tracker) {
        Intrinsics.checkNotNullParameter(cdnUrlDownloadWorker, "cdnUrlDownloadWorker");
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f32941a = cdnUrlDownloadWorker;
        this.f32942b = tracker;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00db A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00d2 -> B:21:0x00d5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.fourthline.orca.internal.w1 r13, kotlin.coroutines.Continuation r14) {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.s9.a(com.fourthline.orca.internal.w1, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
