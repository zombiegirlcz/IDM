package com.fourthline.orca.internal;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class sc1 implements ie {
    public static final a e = new a(null);
    public static final int f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final je f32979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ef f32980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function0 f32981c;
    private final sg0 d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f32982a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f32983b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f32984c;
        int d;
        /* synthetic */ Object e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f32985g;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.e = obj2;
            this.f32985g |= Integer.MIN_VALUE;
            return sc1.this.a(null, this);
        }
    }

    public sc1(je dataUploaderWorker, ef deviceDataBundle, Function0 workflowId, sg0 analyticsTracker) {
        Intrinsics.checkNotNullParameter(dataUploaderWorker, "dataUploaderWorker");
        Intrinsics.checkNotNullParameter(deviceDataBundle, "deviceDataBundle");
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        Intrinsics.checkNotNullParameter(analyticsTracker, "analyticsTracker");
        this.f32979a = dataUploaderWorker;
        this.f32980b = deviceDataBundle;
        this.f32981c = workflowId;
        this.d = analyticsTracker;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.ie
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.fourthline.orca.workflow.WorkflowResults.IDV r10, kotlin.coroutines.Continuation r11) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.sc1.a(com.fourthline.orca.workflow.WorkflowResults$IDV, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
