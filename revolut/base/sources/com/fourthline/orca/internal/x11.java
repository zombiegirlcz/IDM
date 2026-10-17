package com.fourthline.orca.internal;

import com.fourthline.vision.ScannerMetadata;
import com.fourthline.vision.selfie.SelfieScannerConfig;
import com.fourthline.vision.selfie.SelfieScannerResult;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class x11 implements i21 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ef f34830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final sg0 f34831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SelfieScannerConfig f34832c;
    private final oy0 d;
    private SelfieScannerResult e;

    public x11(ef deviceDataBundle, sg0 analyticsTracker, SelfieScannerConfig selfieScannerConfig, oy0 oy0Var) {
        Intrinsics.checkNotNullParameter(deviceDataBundle, "deviceDataBundle");
        Intrinsics.checkNotNullParameter(analyticsTracker, "analyticsTracker");
        Intrinsics.checkNotNullParameter(selfieScannerConfig, "selfieScannerConfig");
        this.f34830a = deviceDataBundle;
        this.f34831b = analyticsTracker;
        this.f34832c = selfieScannerConfig;
        this.d = oy0Var;
    }

    @Override // com.fourthline.orca.internal.i21
    public SelfieScannerResult a() {
        return this.e;
    }

    @Override // com.fourthline.orca.internal.i21
    public oy0 b() {
        return this.d;
    }

    @Override // com.fourthline.orca.internal.i21
    public SelfieScannerConfig c() {
        return this.f34832c;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x11)) {
            return false;
        }
        x11 x11Var = (x11) obj2;
        return Intrinsics.f(this.f34830a, x11Var.f34830a) && Intrinsics.f(this.f34831b, x11Var.f34831b) && Intrinsics.f(this.f34832c, x11Var.f34832c) && Intrinsics.f(this.d, x11Var.d);
    }

    public int hashCode() {
        int iHashCode = ((((this.f34830a.hashCode() * 31) + this.f34831b.hashCode()) * 31) + this.f34832c.hashCode()) * 31;
        oy0 oy0Var = this.d;
        return iHashCode + (oy0Var == null ? 0 : oy0Var.hashCode());
    }

    public String toString() {
        return "SelfieProductScannerRepository(deviceDataBundle=" + this.f34830a + ", analyticsTracker=" + this.f34831b + ", selfieScannerConfig=" + this.f34832c + ", randomnessConfig=" + this.d + ")";
    }

    @Override // com.fourthline.orca.internal.i21
    public void a(SelfieScannerResult selfieScannerResult) {
        ScannerMetadata metadata;
        this.e = selfieScannerResult;
        this.f34830a.b((selfieScannerResult == null || (metadata = selfieScannerResult.getMetadata()) == null) ? null : metadata.getMotionData());
        h9.d.a(this.f34831b, this.f34830a.l(), "selfie");
    }
}
