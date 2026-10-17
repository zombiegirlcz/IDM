package com.fourthline.vision.internal;

import android.media.Image;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class sa implements q7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q7 f36875a;

    public static final class a extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f36876a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f36877b;
        int d;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.f36877b = obj2;
            this.d |= Integer.MIN_VALUE;
            return sa.this.process((Pair<? extends Image, fa>) null, (Continuation<? super ud>) this);
        }
    }

    public sa(@NotNull q7 converter) {
        Intrinsics.checkNotNullParameter(converter, "converter");
        this.f36875a = converter;
    }

    @Override // com.fourthline.vision.internal.q7
    public /* bridge */ /* synthetic */ Object process(Object obj2, Continuation continuation) {
        return process((Pair<? extends Image, fa>) obj2, (Continuation<? super ud>) continuation);
    }

    @Override // com.fourthline.vision.internal.q7, com.fourthline.vision.internal.pd
    public /* bridge */ void start() {
        super.start();
    }

    @Override // com.fourthline.vision.internal.q7, com.fourthline.vision.internal.pd
    public /* bridge */ void stop() {
        super.stop();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object process(@org.jetbrains.annotations.NotNull kotlin.Pair<? extends android.media.Image, com.fourthline.vision.internal.fa> r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.fourthline.vision.internal.ud> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.fourthline.vision.internal.sa.a
            if (r0 == 0) goto L13
            r0 = r7
            com.fourthline.vision.internal.sa$a r0 = (com.fourthline.vision.internal.sa.a) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            com.fourthline.vision.internal.sa$a r0 = new com.fourthline.vision.internal.sa$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f36877b
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r6 = r0.f36876a
            kotlin.Pair r6 = (kotlin.Pair) r6
            yhm.o.b(r7)
            goto L44
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            yhm.o.b(r7)
            com.fourthline.vision.internal.q7 r7 = r5.f36875a
            r0.f36876a = r4
            r0.d = r3
            java.lang.Object r7 = r7.process(r6, r0)
            if (r7 != r1) goto L44
            return r1
        L44:
            com.fourthline.vision.ScannerImage r7 = (com.fourthline.vision.ScannerImage) r7
            com.fourthline.vision.internal.r5$a r6 = new com.fourthline.vision.internal.r5$a
            r0 = 2
            r6.<init>(r7, r4, r0, r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.vision.internal.sa.process(kotlin.Pair, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
