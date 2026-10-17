package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import com.fourthline.orca.internal.f1;
import com.fourthline.vision.document.DocumentScannerConfig;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class uo implements to {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f34138l = DocumentScannerConfig.$stable;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DocumentScannerConfig f34139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final fd f34140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f34141c;
    private final boolean d;
    private final boolean e;
    private final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f34142g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final double f34143h;
    private final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Integer f34144j;
    private final f1 k;

    public uo(DocumentScannerConfig documentScannerConfig, fd fdVar, boolean z, boolean z3, boolean z4, boolean z6, boolean z11, double d, boolean z12, Integer num, f1 analysisPopupStrategy) {
        Intrinsics.checkNotNullParameter(documentScannerConfig, "documentScannerConfig");
        Intrinsics.checkNotNullParameter(analysisPopupStrategy, "analysisPopupStrategy");
        this.f34139a = documentScannerConfig;
        this.f34140b = fdVar;
        this.f34141c = z;
        this.d = z3;
        this.e = z4;
        this.f = z6;
        this.f34142g = z11;
        this.f34143h = d;
        this.i = z12;
        this.f34144j = num;
        this.k = analysisPopupStrategy;
    }

    @Override // com.fourthline.orca.internal.to
    public fd a() {
        return this.f34140b;
    }

    @Override // com.fourthline.orca.internal.to
    public /* bridge */ DocumentType b() {
        return super.b();
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof uo)) {
            return false;
        }
        uo uoVar = (uo) obj2;
        return Intrinsics.f(this.f34139a, uoVar.f34139a) && Intrinsics.f(this.f34140b, uoVar.f34140b) && this.f34141c == uoVar.f34141c && this.d == uoVar.d && this.e == uoVar.e && this.f == uoVar.f && this.f34142g == uoVar.f34142g && Double.compare(this.f34143h, uoVar.f34143h) == 0 && this.i == uoVar.i && Intrinsics.f(this.f34144j, uoVar.f34144j) && Intrinsics.f(this.k, uoVar.k);
    }

    @Override // com.fourthline.orca.internal.to
    public /* bridge */ en f() {
        return super.f();
    }

    @Override // com.fourthline.orca.internal.to
    public Integer g() {
        return this.f34144j;
    }

    public int hashCode() {
        int iHashCode = this.f34139a.hashCode() * 31;
        fd fdVar = this.f34140b;
        int iHashCode2 = (((((((((((((((iHashCode + (fdVar == null ? 0 : fdVar.hashCode())) * 31) + Boolean.hashCode(this.f34141c)) * 31) + Boolean.hashCode(this.d)) * 31) + Boolean.hashCode(this.e)) * 31) + Boolean.hashCode(this.f)) * 31) + Boolean.hashCode(this.f34142g)) * 31) + Double.hashCode(this.f34143h)) * 31) + Boolean.hashCode(this.i)) * 31;
        Integer num = this.f34144j;
        return ((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31) + this.k.hashCode();
    }

    @Override // com.fourthline.orca.internal.to
    public double i() {
        return this.f34143h;
    }

    @Override // com.fourthline.orca.internal.to
    public boolean isDynamicStepsEnabled() {
        return this.f34142g;
    }

    @Override // com.fourthline.orca.internal.to
    public boolean j() {
        return this.d;
    }

    @Override // com.fourthline.orca.internal.to
    public DocumentScannerConfig k() {
        return this.f34139a;
    }

    @Override // com.fourthline.orca.internal.to
    public boolean l() {
        return this.f34141c;
    }

    @Override // com.fourthline.orca.internal.to
    public f1 n() {
        return this.k;
    }

    @Override // com.fourthline.orca.internal.to
    public boolean p() {
        return this.f;
    }

    @Override // com.fourthline.orca.internal.to
    public boolean r() {
        return this.i;
    }

    public String toString() {
        return "DocumentScannerRepositoryData(documentScannerConfig=" + this.f34139a + ", issuingCountry=" + this.f34140b + ", isDocumentImageUploadEnabled=" + this.f34141c + ", isDocumentAnalysisEnabled=" + this.d + ", isAutomaticStartEnabled=" + this.e + ", isManualConfirmationEnabled=" + this.f + ", isDynamicStepsEnabled=" + this.f34142g + ", imageCompressionPercentage=" + this.f34143h + ", useCameraX=" + this.i + ", preferredVideoRecordingBitrate=" + this.f34144j + ", analysisPopupStrategy=" + this.k + ")";
    }

    public /* synthetic */ uo(DocumentScannerConfig documentScannerConfig, fd fdVar, boolean z, boolean z3, boolean z4, boolean z6, boolean z11, double d, boolean z12, Integer num, f1 f1Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(documentScannerConfig, (i & 2) != 0 ? null : fdVar, z, z3, z4, (i & 32) != 0 ? true : z6, (i & 64) != 0 ? false : z11, d, (i & 256) != 0 ? false : z12, num, (i & 1024) != 0 ? f1.a.f28308a : f1Var);
    }
}
