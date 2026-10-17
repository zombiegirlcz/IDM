package com.fourthline.vision.internal;

import android.media.Image;
import com.fourthline.vision.internal.e3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class l7 implements q7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k3 f36471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x1 f36472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function1 f36473c;
    private final e8 d;
    private final oa e;
    private final Pair f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final x1 f36474g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final t6 f36475h;

    public static final class a extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f36476a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f36477b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f36478c;
        Object d;
        /* synthetic */ Object e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f36479g;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.e = obj2;
            this.f36479g |= Integer.MIN_VALUE;
            return l7.this.process((Image) null, (Continuation<? super List<? extends e3>>) this);
        }
    }

    public l7(@NotNull k3 mrzDocumentDetector, @NotNull x1 imagePrecondition, @NotNull Function1<? super List<? extends e3>, ? extends List<? extends e3>> mrzCandidateFilter, @NotNull e8 imageConverter, @NotNull oa detectionAreaProvider, @NotNull Pair<Integer, Integer> imageSize, x1 x1Var) {
        Intrinsics.checkNotNullParameter(mrzDocumentDetector, "mrzDocumentDetector");
        Intrinsics.checkNotNullParameter(imagePrecondition, "imagePrecondition");
        Intrinsics.checkNotNullParameter(mrzCandidateFilter, "mrzCandidateFilter");
        Intrinsics.checkNotNullParameter(imageConverter, "imageConverter");
        Intrinsics.checkNotNullParameter(detectionAreaProvider, "detectionAreaProvider");
        Intrinsics.checkNotNullParameter(imageSize, "imageSize");
        this.f36471a = mrzDocumentDetector;
        this.f36472b = imagePrecondition;
        this.f36473c = mrzCandidateFilter;
        this.d = imageConverter;
        this.e = detectionAreaProvider;
        this.f = imageSize;
        this.f36474g = x1Var;
        this.f36475h = new t6("Camera2Document", 0L, 2, null);
    }

    private final List<fa> debugRectangles(List<e3.d> list, fa faVar) {
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator<T> it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(((e3.d) it8.next()).getBox());
        }
        return fitTextBoxesIntoMrzArea(arrayList, faVar);
    }

    private final List<fa> fitTextBoxesIntoMrzArea(List<fa> list, fa faVar) {
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator<T> it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(((fa) it8.next()).translate(faVar.getLeft(), faVar.getTop()));
        }
        return zhm.d0.E0(zhm.u.c(faVar), arrayList);
    }

    @NotNull
    public final k3 getMrzDocumentDetector() {
        return this.f36471a;
    }

    @Override // com.fourthline.vision.internal.q7
    public /* bridge */ /* synthetic */ Object process(Object obj2, Continuation continuation) {
        return process((Image) obj2, (Continuation<? super List<? extends e3>>) continuation);
    }

    @Override // com.fourthline.vision.internal.q7, com.fourthline.vision.internal.pd
    public /* bridge */ void start() {
        super.start();
    }

    @Override // com.fourthline.vision.internal.q7, com.fourthline.vision.internal.pd
    public /* bridge */ void stop() {
        super.stop();
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e5, code lost:
    
        if (r2.consume(r11, r0) == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object process(@org.jetbrains.annotations.NotNull android.media.Image r11, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.util.List<? extends com.fourthline.vision.internal.e3>> r12) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.vision.internal.l7.process(android.media.Image, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
