package com.fourthline.vision.internal;

import android.media.Image;
import com.fourthline.vision.ScannerImage;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class ta implements q7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q7 f36959a;

    public static final class a extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f36960a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f36961b;
        int d;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.f36961b = obj2;
            this.d |= Integer.MIN_VALUE;
            return ta.this.process((Pair<? extends Image, fa>) null, (Continuation<? super ud>) this);
        }
    }

    public static final class b implements ud {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ScannerImage f36963a;

        public b(ScannerImage scannerImage) {
            this.f36963a = scannerImage;
        }

        @Override // com.fourthline.vision.internal.ud
        public ScannerImage getImage() {
            return this.f36963a;
        }
    }

    public ta(@NotNull q7 converter) {
        Intrinsics.checkNotNullParameter(converter, "converter");
        this.f36959a = converter;
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
    public java.lang.Object process(@org.jetbrains.annotations.NotNull kotlin.Pair<? extends android.media.Image, com.fourthline.vision.internal.fa> r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.fourthline.vision.internal.ud> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.fourthline.vision.internal.ta.a
            if (r0 == 0) goto L13
            r0 = r6
            com.fourthline.vision.internal.ta$a r0 = (com.fourthline.vision.internal.ta.a) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            com.fourthline.vision.internal.ta$a r0 = new com.fourthline.vision.internal.ta$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f36961b
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.f36960a
            kotlin.Pair r5 = (kotlin.Pair) r5
            yhm.o.b(r6)
            goto L44
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            yhm.o.b(r6)
            com.fourthline.vision.internal.q7 r6 = r4.f36959a
            r2 = 0
            r0.f36960a = r2
            r0.d = r3
            java.lang.Object r6 = r6.process(r5, r0)
            if (r6 != r1) goto L44
            return r1
        L44:
            com.fourthline.vision.ScannerImage r6 = (com.fourthline.vision.ScannerImage) r6
            com.fourthline.vision.internal.ta$b r5 = new com.fourthline.vision.internal.ta$b
            r5.<init>(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.vision.internal.ta.process(kotlin.Pair, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
