package com.fourthline.orca.internal;

import com.fourthline.orca.internal.tg;
import com.fourthline.vision.document.DocumentScannerResult;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class sg implements rg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bg f33004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final yj0 f33005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f33006c;
    private final vg d;

    public sg(bg documentAnalysisBundle, yj0 personBundle, long j2, vg resultHandler) {
        Intrinsics.checkNotNullParameter(documentAnalysisBundle, "documentAnalysisBundle");
        Intrinsics.checkNotNullParameter(personBundle, "personBundle");
        Intrinsics.checkNotNullParameter(resultHandler, "resultHandler");
        this.f33004a = documentAnalysisBundle;
        this.f33005b = personBundle;
        this.f33006c = j2;
        this.d = resultHandler;
    }

    @Override // com.fourthline.orca.internal.rg
    public boolean a() {
        DocumentScannerResult documentScannerResultA = this.f33004a.a();
        return (documentScannerResultA != null ? documentScannerResultA.getMrzInfo() : null) != null;
    }

    @Override // com.fourthline.orca.internal.rg
    public String b() {
        return cg.a(this.f33004a);
    }

    @Override // com.fourthline.orca.internal.rg
    public long c() {
        return this.f33006c;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof sg)) {
            return false;
        }
        sg sgVar = (sg) obj2;
        return Intrinsics.f(this.f33004a, sgVar.f33004a) && Intrinsics.f(this.f33005b, sgVar.f33005b) && this.f33006c == sgVar.f33006c && Intrinsics.f(this.d, sgVar.d);
    }

    public int hashCode() {
        return (((((this.f33004a.hashCode() * 31) + this.f33005b.hashCode()) * 31) + Long.hashCode(this.f33006c)) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "DocumentAnalysisRepositoryFromBundle(documentAnalysisBundle=" + this.f33004a + ", personBundle=" + this.f33005b + ", backendProcessingTimeoutMs=" + this.f33006c + ", resultHandler=" + this.d + ")";
    }

    @Override // com.fourthline.orca.internal.rg
    public void a(tg document) {
        Intrinsics.checkNotNullParameter(document, "document");
        this.f33004a.a(document);
        if (document instanceof tg.a) {
            a(this.f33005b.s(), (tg.a) document);
        }
        this.d.a(document);
    }

    private final void a(zj0 zj0Var, tg.a aVar) {
        String birthPlace;
        gg0 gg0VarC = aVar.c();
        String strD = null;
        zj0Var.b(gg0VarC != null ? gg0VarC.getFirstName() : null);
        zj0Var.c(gg0VarC != null ? gg0VarC.getLastName() : null);
        zj0Var.a(gg0VarC != null ? hj.a(gg0VarC) : null);
        zj0Var.d(gg0VarC != null ? gg0VarC.getNationality() : null);
        zj0Var.a(gg0VarC != null ? gg0VarC.getDateOfBirth() : null);
        if (gg0VarC != null && (birthPlace = gg0VarC.getBirthPlace()) != null) {
            strD = kotlin.text.a0.D(birthPlace, "\n", ", ", false);
        }
        zj0Var.a(strD);
        zj0Var.e(aVar.d());
        zj0Var.a(aVar.b());
    }
}
