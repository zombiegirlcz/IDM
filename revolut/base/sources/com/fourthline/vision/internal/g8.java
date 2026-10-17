package com.fourthline.vision.internal;

import android.media.Image;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class g8 implements q7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final oa f36242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e8 f36243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Pair f36244c;
    private final k3 d;
    private final q7 e;
    private final Function1 f;

    public static final class a extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f36245a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f36246b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f36247c;
        /* synthetic */ Object d;
        int f;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.d = obj2;
            this.f |= Integer.MIN_VALUE;
            return g8.this.process((Pair<? extends Image, fa>) null, (Continuation<? super ud>) this);
        }
    }

    public g8(@NotNull oa scannerDetectionAreaProvider, @NotNull e8 imageConverter, @NotNull Pair<Integer, Integer> imageSize, @NotNull k3 mrzDocumentDetector, @NotNull q7 scannerImageCreator, @NotNull Function1<? super List<? extends e3>, ? extends List<? extends e3>> mrzCandidateFilter) {
        Intrinsics.checkNotNullParameter(scannerDetectionAreaProvider, "scannerDetectionAreaProvider");
        Intrinsics.checkNotNullParameter(imageConverter, "imageConverter");
        Intrinsics.checkNotNullParameter(imageSize, "imageSize");
        Intrinsics.checkNotNullParameter(mrzDocumentDetector, "mrzDocumentDetector");
        Intrinsics.checkNotNullParameter(scannerImageCreator, "scannerImageCreator");
        Intrinsics.checkNotNullParameter(mrzCandidateFilter, "mrzCandidateFilter");
        this.f36242a = scannerDetectionAreaProvider;
        this.f36243b = imageConverter;
        this.f36244c = imageSize;
        this.d = mrzDocumentDetector;
        this.e = scannerImageCreator;
        this.f = mrzCandidateFilter;
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

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object process(@org.jetbrains.annotations.NotNull kotlin.Pair<? extends android.media.Image, com.fourthline.vision.internal.fa> r14, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.fourthline.vision.internal.ud> r15) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.vision.internal.g8.process(kotlin.Pair, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
