package com.fourthline.orca.internal;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class xb0 implements ny {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final iz f34939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f34940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final gl f34941c;
    private final tr d;
    private final qh e;
    private final wf f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final km f34942g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f34943h;
    private final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f34944j;

    public xb0(iz documentStrategy, boolean z, gl imageCapture, tr video, qh confirmation, wf analysis, km nfc2, List supportedDocuments, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(documentStrategy, "documentStrategy");
        Intrinsics.checkNotNullParameter(imageCapture, "imageCapture");
        Intrinsics.checkNotNullParameter(video, "video");
        Intrinsics.checkNotNullParameter(confirmation, "confirmation");
        Intrinsics.checkNotNullParameter(analysis, "analysis");
        Intrinsics.checkNotNullParameter(nfc2, "nfc");
        Intrinsics.checkNotNullParameter(supportedDocuments, "supportedDocuments");
        this.f34939a = documentStrategy;
        this.f34940b = z;
        this.f34941c = imageCapture;
        this.d = video;
        this.e = confirmation;
        this.f = analysis;
        this.f34942g = nfc2;
        this.f34943h = supportedDocuments;
        this.i = z3;
        this.f34944j = z4;
    }

    public final wf b() {
        return this.f;
    }

    public final qh c() {
        return this.e;
    }

    public final iz d() {
        return this.f34939a;
    }

    public final gl e() {
        return this.f34941c;
    }

    public final km f() {
        return this.f34942g;
    }

    public final List g() {
        return this.f34943h;
    }

    public final boolean h() {
        return this.f34940b;
    }

    public final boolean i() {
        return this.i;
    }

    public final boolean j() {
        return this.f34944j;
    }

    public final tr k() {
        return this.d;
    }

    @Override // com.fourthline.orca.internal.ny
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public vb0 a() {
        return new vb0(this);
    }
}
