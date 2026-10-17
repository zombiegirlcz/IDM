package com.fourthline.vision.internal;

import com.fourthline.vision.selfie.SelfieScannerWarning;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class o6 implements q7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private na f36619a;

    public o6(@NotNull na dataSource) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        this.f36619a = dataSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fa process$lambda$0(h6 it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        return it8.getFaceBox();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair process$lambda$1(fa faVar, fa it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        return new Pair(Integer.valueOf(it8.area()), Integer.valueOf(faVar.area()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float process$lambda$2(Pair it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        return ((Number) it8.f186385a).intValue() / ((Number) it8.f186386b).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean process$lambda$3(float f) {
        return ((double) f) > 0.6d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SelfieScannerWarning process$lambda$4(float f) {
        return SelfieScannerWarning.FACE_TOO_CLOSE;
    }

    @NotNull
    public final na getDataSource() {
        return this.f36619a;
    }

    @Override // com.fourthline.vision.internal.q7
    public /* bridge */ /* synthetic */ Object process(Object obj2, Continuation continuation) {
        return process((List<? extends h6>) obj2, (Continuation<? super List<? extends SelfieScannerWarning>>) continuation);
    }

    public final void setDataSource(@NotNull na naVar) {
        Intrinsics.checkNotNullParameter(naVar, "<set-?>");
        this.f36619a = naVar;
    }

    @Override // com.fourthline.vision.internal.q7, com.fourthline.vision.internal.pd
    public /* bridge */ void start() {
        super.start();
    }

    @Override // com.fourthline.vision.internal.q7, com.fourthline.vision.internal.pd
    public /* bridge */ void stop() {
        super.stop();
    }

    public Object process(@NotNull List<? extends h6> list, @NotNull Continuation<? super List<? extends SelfieScannerWarning>> continuation) {
        return nkm.y.J(nkm.y.x(nkm.y.I(nkm.y.x(nkm.y.x(nkm.y.x(zhm.d0.Q(list), new aem.d(19)), new eh(this.f36619a.contentDetectionArea(), 0)), new aem.d(20)), new aem.d(21)), new aem.d(22)));
    }
}
