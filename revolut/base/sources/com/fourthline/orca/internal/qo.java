package com.fourthline.orca.internal;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class qo implements ny {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final iz f32496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f32497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final qh f32498c;
    private final gl d;
    private final tr e;
    private final wf f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final km f32499g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f32500h;
    private final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f32501j;
    private final int k;

    public qo(iz documentStrategy, boolean z, qh confirmation, gl imageCapture, tr video, wf analysis, km nfc2, List supportedDocuments, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(documentStrategy, "documentStrategy");
        Intrinsics.checkNotNullParameter(confirmation, "confirmation");
        Intrinsics.checkNotNullParameter(imageCapture, "imageCapture");
        Intrinsics.checkNotNullParameter(video, "video");
        Intrinsics.checkNotNullParameter(analysis, "analysis");
        Intrinsics.checkNotNullParameter(nfc2, "nfc");
        Intrinsics.checkNotNullParameter(supportedDocuments, "supportedDocuments");
        this.f32496a = documentStrategy;
        this.f32497b = z;
        this.f32498c = confirmation;
        this.d = imageCapture;
        this.e = video;
        this.f = analysis;
        this.f32499g = nfc2;
        this.f32500h = supportedDocuments;
        this.i = z3;
        this.f32501j = z4;
        this.k = analysis.getMinimumAge();
    }

    public final wf b() {
        return this.f;
    }

    public final qh c() {
        return this.f32498c;
    }

    public final iz d() {
        return this.f32496a;
    }

    public final gl e() {
        return this.d;
    }

    public final int f() {
        return this.k;
    }

    public final km g() {
        return this.f32499g;
    }

    public final List h() {
        return this.f32500h;
    }

    public final boolean i() {
        return this.f32497b;
    }

    public final boolean j() {
        return this.i;
    }

    public final boolean k() {
        return this.f32501j;
    }

    public final tr l() {
        return this.e;
    }

    @Override // com.fourthline.orca.internal.ny
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public po a() {
        return new po(this);
    }
}
