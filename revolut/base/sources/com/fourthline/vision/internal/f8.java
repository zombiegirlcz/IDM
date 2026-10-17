package com.fourthline.vision.internal;

import android.media.Image;
import com.fourthline.core.internal.Try;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class f8 implements td, CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final oa f36188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f36189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q7 f36190c;
    private final sd d;
    private final CoroutineContext e;
    private boolean f;

    public static final class a extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f36191a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f36192b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f36193c;
        Object d;
        Object e;
        Object f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f36194g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f36195h;
        int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f36196j;
        /* synthetic */ Object k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f36198m;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.k = obj2;
            this.f36198m |= Integer.MIN_VALUE;
            return f8.this.process((Image) null, (Continuation<? super Try<? extends ud>>) this);
        }
    }

    public f8(@NotNull oa scannerDetectionAreaProvider, @NotNull List<? extends qd> preconditions, @NotNull q7 processor, @NotNull sd stepConfig, @NotNull CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(scannerDetectionAreaProvider, "scannerDetectionAreaProvider");
        Intrinsics.checkNotNullParameter(preconditions, "preconditions");
        Intrinsics.checkNotNullParameter(processor, "processor");
        Intrinsics.checkNotNullParameter(stepConfig, "stepConfig");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.f36188a = scannerDetectionAreaProvider;
        this.f36189b = preconditions;
        this.f36190c = processor;
        this.d = stepConfig;
        this.e = coroutineContext;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.e;
    }

    @Override // com.fourthline.vision.internal.td
    @NotNull
    public sd getStepConfig() {
        return this.d;
    }

    @Override // com.fourthline.vision.internal.td, com.fourthline.vision.internal.t1
    public boolean isCompleted() {
        return this.f;
    }

    @Override // com.fourthline.vision.internal.td, com.fourthline.vision.internal.q7
    public /* bridge */ /* synthetic */ Object process(Object obj2, Continuation continuation) {
        return process((Image) obj2, (Continuation<? super Try<? extends ud>>) continuation);
    }

    public void setCompleted(boolean z) {
        this.f = z;
    }

    @Override // com.fourthline.vision.internal.td, com.fourthline.vision.internal.q7, com.fourthline.vision.internal.pd
    public void start() {
        if (f8.class.isAnonymousClass()) {
            String name = f8.class.getName();
            if (name.length() > 23) {
                Intrinsics.checkNotNullExpressionValue(name.substring(name.length() - 23, name.length()), "substring(...)");
            }
        }
        setCompleted(false);
        Iterator it8 = this.f36189b.iterator();
        while (it8.hasNext()) {
            ((qd) it8.next()).start();
        }
    }

    @Override // com.fourthline.vision.internal.td, com.fourthline.vision.internal.q7, com.fourthline.vision.internal.pd
    public void stop() {
        if (f8.class.isAnonymousClass()) {
            String name = f8.class.getName();
            if (name.length() > 23) {
                Intrinsics.checkNotNullExpressionValue(name.substring(name.length() - 23, name.length()), "substring(...)");
            }
        }
        Iterator it8 = this.f36189b.iterator();
        while (it8.hasNext()) {
            ((qd) it8.next()).stop();
        }
        this.f36190c.stop();
        setCompleted(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f3, code lost:
    
        if (r13 == r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object process(@org.jetbrains.annotations.NotNull android.media.Image r12, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.fourthline.core.internal.Try<? extends com.fourthline.vision.internal.ud>> r13) {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.vision.internal.f8.process(android.media.Image, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
