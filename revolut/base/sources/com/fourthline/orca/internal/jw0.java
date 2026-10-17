package com.fourthline.orca.internal;

import android.graphics.Bitmap;
import com.fourthline.orca.internal.c21;
import com.fourthline.orca.internal.c81;
import com.fourthline.vision.ScannerImage;
import com.fourthline.vision.selfie.SelfieScannerWarning;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class jw0 implements l21 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l21 f30065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p70 f30066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v10 f30067c;

    public jw0(l21 uiStateProvider, p70 spinnerLottieSource, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(uiStateProvider, "uiStateProvider");
        Intrinsics.checkNotNullParameter(spinnerLottieSource, "spinnerLottieSource");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        this.f30065a = uiStateProvider;
        this.f30066b = spinnerLottieSource;
        this.f30067c = imageServiceLocator;
    }

    @Override // com.fourthline.orca.internal.l21
    public c21.b.c.C0177b a(int i, Pair stepsProgress) {
        Intrinsics.checkNotNullParameter(stepsProgress, "stepsProgress");
        return this.f30065a.a(i, stepsProgress);
    }

    @Override // com.fourthline.orca.internal.l21
    public c21 b() {
        return this.f30065a.b();
    }

    @Override // com.fourthline.orca.internal.l21
    public c21.b.c.C0177b c(int i) {
        return this.f30065a.c(i);
    }

    @Override // com.fourthline.orca.internal.l21
    public c21 d() {
        return this.f30065a.d();
    }

    @Override // com.fourthline.orca.internal.l21
    public c21.b.C0176b f() {
        return this.f30065a.f();
    }

    @Override // com.fourthline.orca.internal.l21
    public c21.b.C0176b h() {
        return this.f30065a.h();
    }

    @Override // com.fourthline.orca.internal.l21
    public c21 j() {
        return this.f30065a.j();
    }

    @Override // com.fourthline.orca.internal.j20
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public c21 getInitialState() {
        return (c21) this.f30065a.getInitialState();
    }

    @Override // com.fourthline.orca.internal.l21
    public Function1 o() {
        return this.f30065a.o();
    }

    @Override // com.fourthline.orca.internal.l21
    public Function1 p() {
        return this.f30065a.p();
    }

    @Override // com.fourthline.orca.internal.l21
    public c21 r() {
        return this.f30065a.r();
    }

    @Override // com.fourthline.orca.internal.l21
    public c21.b.a u() {
        return this.f30065a.u();
    }

    @Override // com.fourthline.orca.internal.l21
    public Function1 a(Integer num, Float f, Float f4) {
        return this.f30065a.a(num, f, f4);
    }

    @Override // com.fourthline.orca.internal.l21
    public c21 b(c21 c21Var) {
        Intrinsics.checkNotNullParameter(c21Var, "<this>");
        return this.f30065a.b(c21Var);
    }

    @Override // com.fourthline.orca.internal.l21
    public Function1 a(Bitmap image) {
        Intrinsics.checkNotNullParameter(image, "image");
        return this.f30065a.a(image);
    }

    @Override // com.fourthline.orca.internal.l21
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c21.a.b a(ScannerImage image) {
        Intrinsics.checkNotNullParameter(image, "image");
        c81.a aVar = c81.f27404a;
        return new c21.a.b(c81.a.a(aVar, R.string.step_selfie_capture_header_verify, 0, 2, null), c81.a.a(aVar, R.string.step_selfie_capture_message_uploading, 0, 2, null), image.getFull(), 0, this.f30066b, this.f30067c.a(r10.L0));
    }

    @Override // com.fourthline.orca.internal.l21
    public Function1 a(int i) {
        return this.f30065a.a(i);
    }

    @Override // com.fourthline.orca.internal.l21
    public c21 a(SelfieScannerWarning warning) {
        Intrinsics.checkNotNullParameter(warning, "warning");
        return this.f30065a.a(warning);
    }

    @Override // com.fourthline.orca.internal.l21
    public c21.b.c.a a(Pair stepsProgress, int i) {
        Intrinsics.checkNotNullParameter(stepsProgress, "stepsProgress");
        return this.f30065a.a(stepsProgress, i);
    }
}
