package com.fourthline.vision.internal;

import android.media.Image;
import com.fourthline.core.internal.Try;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public class h implements td {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sd f36290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f36291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f36292c;
    private final List d;
    private final q7 e;
    private final q7 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f36293g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f36294h;

    public static final class a extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f36295a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f36296b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f36297c;
        Object d;
        Object e;
        Object f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f36298g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f36299h;
        Object i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f36300j;
        Object k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f36301l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f36302m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f36303n;
        int o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f36304p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f36305q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f36306r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f36308t;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.f36306r = obj2;
            this.f36308t |= Integer.MIN_VALUE;
            return h.process$suspendImpl(h.this, null, this);
        }
    }

    public h(@NotNull sd stepConfig, @NotNull List<? extends qd> preconditions, @NotNull List<? extends x1> errors, @NotNull List<? extends q7> warnings, @NotNull q7 processor, @NotNull q7 detector, @NotNull List<? extends x1> postProcessors) {
        Intrinsics.checkNotNullParameter(stepConfig, "stepConfig");
        Intrinsics.checkNotNullParameter(preconditions, "preconditions");
        Intrinsics.checkNotNullParameter(errors, "errors");
        Intrinsics.checkNotNullParameter(warnings, "warnings");
        Intrinsics.checkNotNullParameter(processor, "processor");
        Intrinsics.checkNotNullParameter(detector, "detector");
        Intrinsics.checkNotNullParameter(postProcessors, "postProcessors");
        this.f36290a = stepConfig;
        this.f36291b = preconditions;
        this.f36292c = errors;
        this.d = warnings;
        this.e = processor;
        this.f = detector;
        this.f36293g = postProcessors;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x02af, code lost:
    
        if (r0 == r3) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0130 A[Catch: all -> 0x02cb, TryCatch #0 {all -> 0x02cb, blocks: (B:13:0x0041, B:71:0x02b2, B:16:0x006a, B:61:0x023e, B:63:0x0244, B:66:0x0279, B:68:0x027f, B:73:0x02c1, B:74:0x02c3, B:19:0x00a3, B:54:0x0216, B:48:0x01d7, B:50:0x01dd, B:55:0x0221, B:60:0x0231, B:75:0x02c4, B:76:0x02ca, B:22:0x00d1, B:42:0x018a, B:44:0x0190, B:47:0x01bb, B:25:0x00e6, B:41:0x017d, B:28:0x010d, B:32:0x012a, B:34:0x0130, B:37:0x0159, B:31:0x011c), top: B:89:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0190 A[Catch: all -> 0x02cb, TryCatch #0 {all -> 0x02cb, blocks: (B:13:0x0041, B:71:0x02b2, B:16:0x006a, B:61:0x023e, B:63:0x0244, B:66:0x0279, B:68:0x027f, B:73:0x02c1, B:74:0x02c3, B:19:0x00a3, B:54:0x0216, B:48:0x01d7, B:50:0x01dd, B:55:0x0221, B:60:0x0231, B:75:0x02c4, B:76:0x02ca, B:22:0x00d1, B:42:0x018a, B:44:0x0190, B:47:0x01bb, B:25:0x00e6, B:41:0x017d, B:28:0x010d, B:32:0x012a, B:34:0x0130, B:37:0x0159, B:31:0x011c), top: B:89:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01dd A[Catch: all -> 0x02cb, TryCatch #0 {all -> 0x02cb, blocks: (B:13:0x0041, B:71:0x02b2, B:16:0x006a, B:61:0x023e, B:63:0x0244, B:66:0x0279, B:68:0x027f, B:73:0x02c1, B:74:0x02c3, B:19:0x00a3, B:54:0x0216, B:48:0x01d7, B:50:0x01dd, B:55:0x0221, B:60:0x0231, B:75:0x02c4, B:76:0x02ca, B:22:0x00d1, B:42:0x018a, B:44:0x0190, B:47:0x01bb, B:25:0x00e6, B:41:0x017d, B:28:0x010d, B:32:0x012a, B:34:0x0130, B:37:0x0159, B:31:0x011c), top: B:89:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0221 A[Catch: all -> 0x02cb, TryCatch #0 {all -> 0x02cb, blocks: (B:13:0x0041, B:71:0x02b2, B:16:0x006a, B:61:0x023e, B:63:0x0244, B:66:0x0279, B:68:0x027f, B:73:0x02c1, B:74:0x02c3, B:19:0x00a3, B:54:0x0216, B:48:0x01d7, B:50:0x01dd, B:55:0x0221, B:60:0x0231, B:75:0x02c4, B:76:0x02ca, B:22:0x00d1, B:42:0x018a, B:44:0x0190, B:47:0x01bb, B:25:0x00e6, B:41:0x017d, B:28:0x010d, B:32:0x012a, B:34:0x0130, B:37:0x0159, B:31:0x011c), top: B:89:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0244 A[Catch: all -> 0x02cb, TryCatch #0 {all -> 0x02cb, blocks: (B:13:0x0041, B:71:0x02b2, B:16:0x006a, B:61:0x023e, B:63:0x0244, B:66:0x0279, B:68:0x027f, B:73:0x02c1, B:74:0x02c3, B:19:0x00a3, B:54:0x0216, B:48:0x01d7, B:50:0x01dd, B:55:0x0221, B:60:0x0231, B:75:0x02c4, B:76:0x02ca, B:22:0x00d1, B:42:0x018a, B:44:0x0190, B:47:0x01bb, B:25:0x00e6, B:41:0x017d, B:28:0x010d, B:32:0x012a, B:34:0x0130, B:37:0x0159, B:31:0x011c), top: B:89:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0279 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0159 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0210 -> B:54:0x0216). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <SCANNER_STEP, SCANNER_WARNING extends java.lang.Enum<?>, DETECTION> java.lang.Object process$suspendImpl(com.fourthline.vision.internal.h r17, android.media.Image r18, kotlin.coroutines.Continuation<? super com.fourthline.core.internal.Try<? extends com.fourthline.vision.internal.ud>> r19) {
        /*
            Method dump skipped, instruction units count: 758
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.vision.internal.h.process$suspendImpl(com.fourthline.vision.internal.h, android.media.Image, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @NotNull
    public q7 getDetector() {
        return this.f;
    }

    @NotNull
    public List<x1> getErrors() {
        return this.f36292c;
    }

    @NotNull
    public List<x1> getPostProcessors() {
        return this.f36293g;
    }

    @NotNull
    public List<qd> getPreconditions() {
        return this.f36291b;
    }

    @NotNull
    public q7 getProcessor() {
        return this.e;
    }

    @Override // com.fourthline.vision.internal.td
    @NotNull
    public sd getStepConfig() {
        return this.f36290a;
    }

    @NotNull
    public List<q7> getWarnings() {
        return this.d;
    }

    @Override // com.fourthline.vision.internal.td, com.fourthline.vision.internal.t1
    public boolean isCompleted() {
        return this.f36294h;
    }

    public Object process(@NotNull Image image, @NotNull Continuation<? super Try<? extends ud>> continuation) {
        return process$suspendImpl(this, image, continuation);
    }

    public void setCompleted(boolean z) {
        this.f36294h = z;
    }

    @Override // com.fourthline.vision.internal.td, com.fourthline.vision.internal.q7, com.fourthline.vision.internal.pd
    public void start() {
        setCompleted(false);
        Iterator<T> it8 = getPreconditions().iterator();
        while (it8.hasNext()) {
            ((qd) it8.next()).start();
        }
        Iterator<T> it9 = getWarnings().iterator();
        while (it9.hasNext()) {
            ((q7) it9.next()).start();
        }
    }

    @Override // com.fourthline.vision.internal.td, com.fourthline.vision.internal.q7, com.fourthline.vision.internal.pd
    public void stop() {
        Iterator<T> it8 = getPreconditions().iterator();
        while (it8.hasNext()) {
            ((qd) it8.next()).stop();
        }
        Iterator<T> it9 = getWarnings().iterator();
        while (it9.hasNext()) {
            ((q7) it9.next()).stop();
        }
        getProcessor().stop();
        setCompleted(true);
    }

    @Override // com.fourthline.vision.internal.td, com.fourthline.vision.internal.q7
    public /* bridge */ /* synthetic */ Object process(Object obj2, Continuation continuation) {
        return process((Image) obj2, (Continuation<? super Try<? extends ud>>) continuation);
    }

    public h(sd sdVar, List list, List list2, List list3, q7 q7Var, q7 q7Var2, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(sdVar, list, list2, list3, q7Var, q7Var2, (i & 64) != 0 ? zhm.f0.f322471a : list4);
    }
}
