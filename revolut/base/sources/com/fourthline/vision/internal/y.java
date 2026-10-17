package com.fourthline.vision.internal;

import com.fourthline.core.internal.Try;
import com.fourthline.core.internal.TryKt;
import com.fourthline.vision.internal.ra;
import com.fourthline.vision.internal.w;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class y implements zf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f37123a;

    public static final class a extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f37124a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f37125b;
        int d;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.f37125b = obj2;
            this.d |= Integer.MIN_VALUE;
            return y.this.start(null, this);
        }
    }

    public y(@NotNull s camera2) {
        Intrinsics.checkNotNullParameter(camera2, "camera2");
        this.f37123a = camera2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Try start$lambda$0(Throwable it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        return TryKt.failure(new ra.a(it8 instanceof w.d ? pa.e : pa.f36695a, null, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l0 start$lambda$1(l0 it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        return it8;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.fourthline.vision.internal.zf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object start(@org.jetbrains.annotations.NotNull java.util.List<? extends android.view.Surface> r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.fourthline.core.internal.Try<com.fourthline.vision.internal.l0>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.fourthline.vision.internal.y.a
            if (r0 == 0) goto L13
            r0 = r6
            com.fourthline.vision.internal.y$a r0 = (com.fourthline.vision.internal.y.a) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            com.fourthline.vision.internal.y$a r0 = new com.fourthline.vision.internal.y$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f37125b
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.f37124a
            java.util.List r5 = (java.util.List) r5
            yhm.o.b(r6)
            goto L44
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            yhm.o.b(r6)
            com.fourthline.vision.internal.s r6 = r4.f37123a
            r2 = 0
            r0.f37124a = r2
            r0.d = r3
            java.lang.Object r6 = r6.initializeCamera$fourthline_vision_release(r5, r0)
            if (r6 != r1) goto L44
            return r1
        L44:
            com.fourthline.core.internal.Try r6 = (com.fourthline.core.internal.Try) r6
            com.fourthline.vision.internal.qh r5 = new com.fourthline.vision.internal.qh
            r0 = 1
            r5.<init>(r0)
            com.fourthline.core.internal.Try r5 = com.fourthline.core.internal.TryKt.handleErrorWith(r6, r5)
            com.fourthline.vision.internal.qh r6 = new com.fourthline.vision.internal.qh
            r0 = 2
            r6.<init>(r0)
            com.fourthline.core.internal.Try r5 = com.fourthline.core.internal.TryKt.map(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.vision.internal.y.start(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.fourthline.vision.internal.zf
    public void stop() {
        this.f37123a.closeCamera$fourthline_vision_release();
    }
}
