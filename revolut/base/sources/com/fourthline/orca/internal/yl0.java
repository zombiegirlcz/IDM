package com.fourthline.orca.internal;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class yl0 implements h2 {
    private static final a d = new a(null);
    public static final int e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f30 f35375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o71 f35376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e30 f35377c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f35378a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f35379b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f35380c;
        Object d;
        long e;
        int f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f35381g;
        int i;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f35381g = obj2;
            this.i |= Integer.MIN_VALUE;
            return yl0.this.a(null, null, this);
        }
    }

    public yl0(f30 tokenProvider, o71 submitAttestationWorker, e30 analytics) {
        Intrinsics.checkNotNullParameter(tokenProvider, "tokenProvider");
        Intrinsics.checkNotNullParameter(submitAttestationWorker, "submitAttestationWorker");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        this.f35375a = tokenProvider;
        this.f35376b = submitAttestationWorker;
        this.f35377c = analytics;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.h2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(java.lang.String r12, com.fourthline.orca.internal.a2 r13, kotlin.coroutines.Continuation r14) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.yl0.a(java.lang.String, com.fourthline.orca.internal.a2, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
