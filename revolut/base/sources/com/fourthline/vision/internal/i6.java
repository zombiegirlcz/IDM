package com.fourthline.vision.internal;

import android.media.Image;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class i6 implements q7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p7 f36355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final oa f36356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q7 f36357c;

    public static final class a extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f36358a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f36359b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f36360c;
        /* synthetic */ Object d;
        int f;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.d = obj2;
            this.f |= Integer.MIN_VALUE;
            return i6.this.process((Pair<? extends Image, ? extends h6>) null, (Continuation<? super ud>) this);
        }
    }

    public i6(@NotNull p7 intelligentCropping, @NotNull oa scannerDetectionAreaProvider, @NotNull q7 scannerImageCreator) {
        Intrinsics.checkNotNullParameter(intelligentCropping, "intelligentCropping");
        Intrinsics.checkNotNullParameter(scannerDetectionAreaProvider, "scannerDetectionAreaProvider");
        Intrinsics.checkNotNullParameter(scannerImageCreator, "scannerImageCreator");
        this.f36355a = intelligentCropping;
        this.f36356b = scannerDetectionAreaProvider;
        this.f36357c = scannerImageCreator;
    }

    @Override // com.fourthline.vision.internal.q7
    public /* bridge */ /* synthetic */ Object process(Object obj2, Continuation continuation) {
        return process((Pair<? extends Image, ? extends h6>) obj2, (Continuation<? super ud>) continuation);
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
    public java.lang.Object process(@org.jetbrains.annotations.NotNull kotlin.Pair<? extends android.media.Image, ? extends com.fourthline.vision.internal.h6> r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.fourthline.vision.internal.ud> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.fourthline.vision.internal.i6.a
            if (r0 == 0) goto L13
            r0 = r7
            com.fourthline.vision.internal.i6$a r0 = (com.fourthline.vision.internal.i6.a) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            com.fourthline.vision.internal.i6$a r0 = new com.fourthline.vision.internal.i6$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.d
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r6 = r0.f36360c
            com.fourthline.vision.internal.fa r6 = (com.fourthline.vision.internal.fa) r6
            java.lang.Object r6 = r0.f36359b
            com.fourthline.vision.internal.fa r6 = (com.fourthline.vision.internal.fa) r6
            java.lang.Object r6 = r0.f36358a
            kotlin.Pair r6 = (kotlin.Pair) r6
            yhm.o.b(r7)
            goto L6b
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            yhm.o.b(r7)
            com.fourthline.vision.internal.oa r7 = r5.f36356b
            com.fourthline.vision.internal.fa r7 = r7.contentDetectionArea()
            com.fourthline.vision.internal.p7 r2 = r5.f36355a
            java.lang.Object r4 = r6.f186386b
            com.fourthline.vision.internal.h6 r4 = (com.fourthline.vision.internal.h6) r4
            com.fourthline.vision.internal.fa r4 = r4.getFaceBox()
            com.fourthline.vision.internal.fa r7 = r2.performCorrection(r7, r7, r4)
            com.fourthline.vision.internal.q7 r2 = r5.f36357c
            java.lang.Object r6 = r6.f186385a
            kotlin.Pair r4 = new kotlin.Pair
            r4.<init>(r6, r7)
            r6 = 0
            r0.f36358a = r6
            r0.f36359b = r6
            r0.f36360c = r6
            r0.f = r3
            java.lang.Object r7 = r2.process(r4, r0)
            if (r7 != r1) goto L6b
            return r1
        L6b:
            com.fourthline.vision.ScannerImage r7 = (com.fourthline.vision.ScannerImage) r7
            com.fourthline.vision.internal.vc r6 = new com.fourthline.vision.internal.vc
            r6.<init>(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.vision.internal.i6.process(kotlin.Pair, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
