package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import com.fourthline.vision.document.DocumentScannerConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class xm implements to, vo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bg f35035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ef f35036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final sg0 f35037c;
    private final DocumentScannerConfig d;
    private final boolean e;
    private final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f35038g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f35039h;
    private final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final double f35040j;
    private final fd k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f35041l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Integer f35042m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final f1 f35043n;

    public xm(bg dataBundle, ef deviceDataBundle, sg0 analyticsTracker, DocumentScannerConfig documentScannerConfig, boolean z, boolean z3, boolean z4, boolean z6, boolean z11, double d, fd fdVar, boolean z12, Integer num, f1 analysisPopupStrategy) {
        Intrinsics.checkNotNullParameter(dataBundle, "dataBundle");
        Intrinsics.checkNotNullParameter(deviceDataBundle, "deviceDataBundle");
        Intrinsics.checkNotNullParameter(analyticsTracker, "analyticsTracker");
        Intrinsics.checkNotNullParameter(documentScannerConfig, "documentScannerConfig");
        Intrinsics.checkNotNullParameter(analysisPopupStrategy, "analysisPopupStrategy");
        this.f35035a = dataBundle;
        this.f35036b = deviceDataBundle;
        this.f35037c = analyticsTracker;
        this.d = documentScannerConfig;
        this.e = z;
        this.f = z3;
        this.f35038g = z4;
        this.f35039h = z6;
        this.i = z11;
        this.f35040j = d;
        this.k = fdVar;
        this.f35041l = z12;
        this.f35042m = num;
        this.f35043n = analysisPopupStrategy;
    }

    @Override // com.fourthline.orca.internal.to
    public fd a() {
        return this.k;
    }

    @Override // com.fourthline.orca.internal.to
    public /* bridge */ DocumentType b() {
        return super.b();
    }

    @Override // com.fourthline.orca.internal.to
    public /* bridge */ en f() {
        return super.f();
    }

    @Override // com.fourthline.orca.internal.to
    public Integer g() {
        return this.f35042m;
    }

    @Override // com.fourthline.orca.internal.to
    public double i() {
        return this.f35040j;
    }

    @Override // com.fourthline.orca.internal.to
    public boolean isDynamicStepsEnabled() {
        return this.i;
    }

    @Override // com.fourthline.orca.internal.to
    public boolean j() {
        return this.f35038g;
    }

    @Override // com.fourthline.orca.internal.to
    public DocumentScannerConfig k() {
        return this.d;
    }

    @Override // com.fourthline.orca.internal.to
    public boolean l() {
        return this.f;
    }

    @Override // com.fourthline.orca.internal.to
    public f1 n() {
        return this.f35043n;
    }

    @Override // com.fourthline.orca.internal.to
    public boolean p() {
        return this.f35039h;
    }

    @Override // com.fourthline.orca.internal.to
    public boolean r() {
        return this.f35041l;
    }

    @Override // com.fourthline.orca.internal.vo
    public void a(ko result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.f35035a.a(result.a());
        this.f35036b.a(result.a().getMetadata().getMotionData());
        h9.d.a(this.f35037c, this.f35036b.l(), "document");
    }
}
