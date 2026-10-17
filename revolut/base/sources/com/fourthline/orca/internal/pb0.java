package com.fourthline.orca.internal;

import com.fourthline.orca.Orca;
import com.fourthline.orca.internal.bf1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class pb0 implements bf1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ib0 f31912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Orca.a f31913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final sg0 f31914c;

    public static final class a extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f31915a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f31916b;
        int d;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f31916b = obj2;
            this.d |= Integer.MIN_VALUE;
            Object objA = pb0.this.a((bf1.a) null, this);
            return objA == fim.a.COROUTINE_SUSPENDED ? objA : new yhm.m(objA);
        }
    }

    public pb0(ib0 networkService, Orca.a integration, sg0 tracker) {
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        Intrinsics.checkNotNullParameter(integration, "integration");
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f31912a = networkService;
        this.f31913b = integration;
        this.f31914c = tracker;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // com.fourthline.orca.internal.bf1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.fourthline.orca.internal.bf1.a r17, kotlin.coroutines.Continuation r18) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.pb0.a(com.fourthline.orca.internal.bf1$a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void a(ye1 ye1Var, bf1.a aVar) {
        this.f31914c.a(this.f31912a.b(), aVar.a(), ye1Var, this.f31913b);
    }
}
