package com.fourthline.vision.internal;

import android.media.Image;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class m7 implements q7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j6 f36554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x1 f36555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e8 f36556c;
    private final t6 d;

    public static final class a extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f36557a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f36558b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f36559c;
        Object d;
        int e;
        /* synthetic */ Object f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f36561h;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.f = obj2;
            this.f36561h |= Integer.MIN_VALUE;
            return m7.this.process((Image) null, (Continuation<? super List<? extends h6>>) this);
        }
    }

    public m7(@NotNull j6 faceDetectorFast, x1 x1Var, @NotNull e8 imageConverter) {
        Intrinsics.checkNotNullParameter(faceDetectorFast, "faceDetectorFast");
        Intrinsics.checkNotNullParameter(imageConverter, "imageConverter");
        this.f36554a = faceDetectorFast;
        this.f36555b = x1Var;
        this.f36556c = imageConverter;
        this.d = new t6("Camera2Selfie", 0L, 2, null);
    }

    @NotNull
    public final j6 getFaceDetectorFast() {
        return this.f36554a;
    }

    @Override // com.fourthline.vision.internal.q7
    public /* bridge */ /* synthetic */ Object process(Object obj2, Continuation continuation) {
        return process((Image) obj2, (Continuation<? super List<? extends h6>>) continuation);
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
    public java.lang.Object process(@org.jetbrains.annotations.NotNull android.media.Image r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.util.List<? extends com.fourthline.vision.internal.h6>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.fourthline.vision.internal.m7.a
            if (r0 == 0) goto L13
            r0 = r9
            com.fourthline.vision.internal.m7$a r0 = (com.fourthline.vision.internal.m7.a) r0
            int r1 = r0.f36561h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36561h = r1
            goto L18
        L13:
            com.fourthline.vision.internal.m7$a r0 = new com.fourthline.vision.internal.m7$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f36561h
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4d
            if (r2 == r4) goto L41
            if (r2 != r3) goto L39
            java.lang.Object r8 = r0.d
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r8 = r0.f36559c
            java.lang.Object r1 = r0.f36558b
            com.fourthline.vision.internal.f9 r1 = (com.fourthline.vision.internal.f9) r1
            java.lang.Object r0 = r0.f36557a
            android.media.Image r0 = (android.media.Image) r0
            yhm.o.b(r9)
            return r8
        L39:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L41:
            java.lang.Object r8 = r0.f36558b
            com.fourthline.vision.internal.f9 r8 = (com.fourthline.vision.internal.f9) r8
            java.lang.Object r8 = r0.f36557a
            android.media.Image r8 = (android.media.Image) r8
            yhm.o.b(r9)
            goto L6a
        L4d:
            yhm.o.b(r9)
            com.fourthline.vision.internal.e8 r9 = r7.f36556c
            com.fourthline.vision.internal.f9 r8 = r9.toMlKitFrame(r8)
            com.fourthline.vision.internal.t6 r9 = r7.d
            r9.monitor()
            com.fourthline.vision.internal.j6 r9 = r7.f36554a
            r0.f36557a = r5
            r0.f36558b = r5
            r0.f36561h = r4
            java.lang.Object r9 = r9.detect(r8, r0)
            if (r9 != r1) goto L6a
            goto La7
        L6a:
            r8 = r9
            java.util.List r8 = (java.util.List) r8
            com.fourthline.vision.internal.x1 r2 = r7.f36555b
            if (r2 == 0) goto La8
            java.util.ArrayList r4 = new java.util.ArrayList
            r6 = 10
            int r6 = zhm.w.t(r8, r6)
            r4.<init>(r6)
            java.util.Iterator r8 = r8.iterator()
        L80:
            boolean r6 = r8.hasNext()
            if (r6 == 0) goto L94
            java.lang.Object r6 = r8.next()
            com.fourthline.vision.internal.h6 r6 = (com.fourthline.vision.internal.h6) r6
            com.fourthline.vision.internal.fa r6 = r6.getFaceBox()
            r4.add(r6)
            goto L80
        L94:
            r0.f36557a = r5
            r0.f36558b = r5
            r0.f36559c = r9
            r0.d = r5
            r8 = 0
            r0.e = r8
            r0.f36561h = r3
            java.lang.Object r8 = r2.consume(r4, r0)
            if (r8 != r1) goto La8
        La7:
            return r1
        La8:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.vision.internal.m7.process(android.media.Image, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
