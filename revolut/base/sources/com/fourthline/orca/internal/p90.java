package com.fourthline.orca.internal;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: loaded from: classes23.dex */
public final class p90 implements g6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ib0 f31888a;

    public static final class a extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f31889a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f31890b;
        int d;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) throws JSONException {
            this.f31890b = obj2;
            this.d |= Integer.MIN_VALUE;
            Object objA = p90.this.a(null, this);
            return objA == fim.a.COROUTINE_SUSPENDED ? objA : new yhm.m(objA);
        }
    }

    public p90(ib0 networkService) {
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        this.f31888a = networkService;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // com.fourthline.orca.internal.g6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.fourthline.orca.internal.g6.b r18, kotlin.coroutines.Continuation r19) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.p90.a(com.fourthline.orca.internal.g6$b, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
