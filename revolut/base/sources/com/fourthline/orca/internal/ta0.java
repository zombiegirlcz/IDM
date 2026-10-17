package com.fourthline.orca.internal;

import com.fourthline.core.DeviceMetadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ta0 implements ex0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function1 f33262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ib0 f33263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function0 f33264c;

    public static final class a extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f33265a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f33266b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f33267c;
        int e;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f33267c = obj2;
            this.e |= Integer.MIN_VALUE;
            Object objA = ta0.this.a(null, this);
            return objA == fim.a.COROUTINE_SUSPENDED ? objA : new yhm.m(objA);
        }
    }

    public ta0(Function1 endpoint, ib0 networkService, Function0 metadataProvider) {
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        Intrinsics.checkNotNullParameter(metadataProvider, "metadataProvider");
        this.f33262a = endpoint;
        this.f33263b = networkService;
        this.f33264c = metadataProvider;
    }

    private final DeviceMetadata a() {
        return (DeviceMetadata) this.f33264c.invoke();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.ex0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.fourthline.orca.internal.fx0.a r14, kotlin.coroutines.Continuation r15) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.ta0.a(com.fourthline.orca.internal.fx0$a, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
