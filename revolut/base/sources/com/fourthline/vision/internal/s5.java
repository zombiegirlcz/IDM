package com.fourthline.vision.internal;

import android.media.Image;
import com.fourthline.core.internal.Try;
import com.fourthline.core.internal.TryKt;
import com.fourthline.vision.internal.ra;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class s5 implements td {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sd f36862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o7 f36863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w7 f36864c;
    private boolean d;
    private final Try e;

    public static final class a extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f36865a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f36866b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f36867c;
        Object d;
        int e;
        int f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f36868g;
        int i;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.f36868g = obj2;
            this.i |= Integer.MIN_VALUE;
            return s5.this.process((Image) null, (Continuation<? super Try<? extends ud>>) this);
        }
    }

    public s5(@NotNull sd stepConfig, @NotNull o7 imageTooDarkConsumer, @NotNull w7 isSteadyWarningInteractor) {
        Intrinsics.checkNotNullParameter(stepConfig, "stepConfig");
        Intrinsics.checkNotNullParameter(imageTooDarkConsumer, "imageTooDarkConsumer");
        Intrinsics.checkNotNullParameter(isSteadyWarningInteractor, "isSteadyWarningInteractor");
        this.f36862a = stepConfig;
        this.f36863b = imageTooDarkConsumer;
        this.f36864c = isSteadyWarningInteractor;
        this.e = TryKt.failure(ra.f.a.f36780a);
    }

    @Override // com.fourthline.vision.internal.td
    @NotNull
    public sd getStepConfig() {
        return this.f36862a;
    }

    @Override // com.fourthline.vision.internal.td, com.fourthline.vision.internal.t1
    public boolean isCompleted() {
        return this.d;
    }

    @Override // com.fourthline.vision.internal.td, com.fourthline.vision.internal.q7
    public /* bridge */ /* synthetic */ Object process(Object obj2, Continuation continuation) {
        return process((Image) obj2, (Continuation<? super Try<? extends ud>>) continuation);
    }

    public void setCompleted(boolean z) {
        this.d = z;
    }

    @Override // com.fourthline.vision.internal.td, com.fourthline.vision.internal.q7, com.fourthline.vision.internal.pd
    public void start() {
        setCompleted(false);
    }

    @Override // com.fourthline.vision.internal.td, com.fourthline.vision.internal.q7, com.fourthline.vision.internal.pd
    public void stop() {
        setCompleted(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object process(@org.jetbrains.annotations.NotNull android.media.Image r11, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.fourthline.core.internal.Try<? extends com.fourthline.vision.internal.ud>> r12) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.vision.internal.s5.process(android.media.Image, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
