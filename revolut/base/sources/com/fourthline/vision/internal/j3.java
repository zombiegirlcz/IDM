package com.fourthline.vision.internal;

import android.media.Image;
import com.fourthline.vision.internal.e3;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class j3 implements q7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p7 f36390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final oa f36391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final oa f36392c;
    private final q7 d;

    public static final class a extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f36393a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f36394b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f36395c;
        /* synthetic */ Object d;
        int f;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.d = obj2;
            this.f |= Integer.MIN_VALUE;
            return j3.this.process((Pair<? extends Image, e3.b>) null, (Continuation<? super ud>) this);
        }
    }

    public j3(@NotNull p7 intelligentCropping, @NotNull oa mrzDetectionAreaProvider, @NotNull oa maskDetectionAreaProvider, @NotNull q7 scannerImageCreator) {
        Intrinsics.checkNotNullParameter(intelligentCropping, "intelligentCropping");
        Intrinsics.checkNotNullParameter(mrzDetectionAreaProvider, "mrzDetectionAreaProvider");
        Intrinsics.checkNotNullParameter(maskDetectionAreaProvider, "maskDetectionAreaProvider");
        Intrinsics.checkNotNullParameter(scannerImageCreator, "scannerImageCreator");
        this.f36390a = intelligentCropping;
        this.f36391b = mrzDetectionAreaProvider;
        this.f36392c = maskDetectionAreaProvider;
        this.d = scannerImageCreator;
    }

    @Override // com.fourthline.vision.internal.q7
    public /* bridge */ /* synthetic */ Object process(Object obj2, Continuation continuation) {
        return process((Pair<? extends Image, e3.b>) obj2, (Continuation<? super ud>) continuation);
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
    public java.lang.Object process(@org.jetbrains.annotations.NotNull kotlin.Pair<? extends android.media.Image, com.fourthline.vision.internal.e3.b> r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.fourthline.vision.internal.ud> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.fourthline.vision.internal.j3.a
            if (r0 == 0) goto L13
            r0 = r10
            com.fourthline.vision.internal.j3$a r0 = (com.fourthline.vision.internal.j3.a) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            com.fourthline.vision.internal.j3$a r0 = new com.fourthline.vision.internal.j3$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.d
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r9 = r0.f36395c
            com.fourthline.vision.internal.fa r9 = (com.fourthline.vision.internal.fa) r9
            java.lang.Object r9 = r0.f36394b
            com.fourthline.vision.internal.fa r9 = (com.fourthline.vision.internal.fa) r9
            java.lang.Object r9 = r0.f36393a
            kotlin.Pair r9 = (kotlin.Pair) r9
            yhm.o.b(r10)
            goto L7d
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3b:
            yhm.o.b(r10)
            com.fourthline.vision.internal.oa r10 = r8.f36391b
            com.fourthline.vision.internal.fa r10 = r10.contentDetectionArea()
            com.fourthline.vision.internal.p7 r2 = r8.f36390a
            com.fourthline.vision.internal.oa r4 = r8.f36392c
            com.fourthline.vision.internal.fa r4 = r4.contentDetectionArea()
            java.lang.Object r5 = r9.f186386b
            com.fourthline.vision.internal.e3$b r5 = (com.fourthline.vision.internal.e3.b) r5
            com.fourthline.vision.internal.fa r5 = r5.getBox()
            int r6 = r10.getLeft()
            int r7 = r10.getTop()
            com.fourthline.vision.internal.fa r5 = r5.translate(r6, r7)
            com.fourthline.vision.internal.fa r10 = r2.performCorrection(r4, r10, r5)
            com.fourthline.vision.internal.q7 r2 = r8.d
            java.lang.Object r4 = r9.f186385a
            kotlin.Pair r5 = new kotlin.Pair
            r5.<init>(r4, r10)
            r0.f36393a = r9
            r10 = 0
            r0.f36394b = r10
            r0.f36395c = r10
            r0.f = r3
            java.lang.Object r10 = r2.process(r5, r0)
            if (r10 != r1) goto L7d
            return r1
        L7d:
            r1 = r10
            com.fourthline.vision.ScannerImage r1 = (com.fourthline.vision.ScannerImage) r1
            com.fourthline.vision.internal.r5$b r0 = new com.fourthline.vision.internal.r5$b
            java.lang.Object r9 = r9.f186386b
            com.fourthline.vision.internal.e3$b r9 = (com.fourthline.vision.internal.e3.b) r9
            com.fourthline.core.mrz.MrzInfo r2 = r9.getMrz()
            r4 = 4
            r5 = 0
            r3 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.vision.internal.j3.process(kotlin.Pair, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
