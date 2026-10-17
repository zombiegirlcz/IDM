package com.fourthline.orca.internal;

import com.fourthline.core.internal.devicedata.DeviceDataCollector;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class mb0 implements sb1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f31146h = new a(null);
    public static final int i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final je f31147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DeviceDataCollector f31148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final mc1 f31149c;
    private final Function0 d;
    private final sg0 e;
    private final Function0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ef f31150g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f31151a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f31152b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f31153c;
        /* synthetic */ Object d;
        int f;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.d = obj2;
            this.f |= Integer.MIN_VALUE;
            Object objA = mb0.this.a(null, this);
            return objA == fim.a.COROUTINE_SUSPENDED ? objA : new yhm.m(objA);
        }
    }

    public mb0(je dataUploaderWorker, DeviceDataCollector deviceDataCollector, mc1 deviceDataRepository, Function0 uploadTimeoutMsProvider, sg0 analyticsTracker, Function0 deviceDataCollectionConfig, ef deviceDataBundle) {
        Intrinsics.checkNotNullParameter(dataUploaderWorker, "dataUploaderWorker");
        Intrinsics.checkNotNullParameter(deviceDataCollector, "deviceDataCollector");
        Intrinsics.checkNotNullParameter(deviceDataRepository, "deviceDataRepository");
        Intrinsics.checkNotNullParameter(uploadTimeoutMsProvider, "uploadTimeoutMsProvider");
        Intrinsics.checkNotNullParameter(analyticsTracker, "analyticsTracker");
        Intrinsics.checkNotNullParameter(deviceDataCollectionConfig, "deviceDataCollectionConfig");
        Intrinsics.checkNotNullParameter(deviceDataBundle, "deviceDataBundle");
        this.f31147a = dataUploaderWorker;
        this.f31148b = deviceDataCollector;
        this.f31149c = deviceDataRepository;
        this.d = uploadTimeoutMsProvider;
        this.e = analyticsTracker;
        this.f = deviceDataCollectionConfig;
        this.f31150g = deviceDataBundle;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a0, code lost:
    
        if (r11 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.sb1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.fourthline.orca.internal.sb1.a r11, kotlin.coroutines.Continuation r12) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.mb0.a(com.fourthline.orca.internal.sb1$a, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
