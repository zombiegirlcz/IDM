package com.fourthline.orca.internal;

import android.graphics.Bitmap;
import com.fourthline.orca.internal.ab0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class va0 implements kx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function1 f34281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ib0 f34282b;

    public static final class a extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f34283a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f34284b;
        int d;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f34284b = obj2;
            this.d |= Integer.MIN_VALUE;
            Object objA = va0.this.a(null, this);
            return objA == fim.a.COROUTINE_SUSPENDED ? objA : new yhm.m(objA);
        }
    }

    public va0(Function1 endpoint, ib0 networkService) {
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        this.f34281a = endpoint;
        this.f34282b = networkService;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.kx0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.fourthline.orca.internal.kx0.a r13, kotlin.coroutines.Continuation r14) {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.va0.a(com.fourthline.orca.internal.kx0$a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final ab0.c.a a(Bitmap bitmap) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
            ab0.c.a aVar = new ab0.c.a("selfie", new sc(byteArray), bx.a(bx.d(), "selfie.jpeg"));
            byteArrayOutputStream.close();
            return aVar;
        } finally {
        }
    }
}
