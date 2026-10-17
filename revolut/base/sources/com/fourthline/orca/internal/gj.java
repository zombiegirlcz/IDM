package com.fourthline.orca.internal;

import com.fourthline.core.CountryNetworkModelKt;
import com.fourthline.core.DocumentType;
import com.fourthline.orca.internal.tg;
import com.fourthline.vision.document.DocumentScannerResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class gj implements bg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final gh f28901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final yz0 f28902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final yj0 f28903c;
    private fd d;
    private di e;
    private DocumentScannerResult f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f28904g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f28905h;
    private ad0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private gd0 f28906j;
    private byte[] k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private double f28907l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private DocumentType f28908m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f28909n;
    private List o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private tg f28910p;

    public gj(gh document, yz0 secondaryDocuments, yj0 person, fd fdVar, di diVar, DocumentScannerResult documentScannerResult, String str, String str2, ad0 ad0Var, gd0 gd0Var, byte[] bArr, double d, DocumentType documentType, String str3, List nfcErrors) {
        Intrinsics.checkNotNullParameter(document, "document");
        Intrinsics.checkNotNullParameter(secondaryDocuments, "secondaryDocuments");
        Intrinsics.checkNotNullParameter(person, "person");
        Intrinsics.checkNotNullParameter(nfcErrors, "nfcErrors");
        this.f28901a = document;
        this.f28902b = secondaryDocuments;
        this.f28903c = person;
        this.d = fdVar;
        this.e = diVar;
        this.f = documentScannerResult;
        this.f28904g = str;
        this.f28905h = str2;
        this.i = ad0Var;
        this.f28906j = gd0Var;
        this.k = bArr;
        this.f28907l = d;
        this.f28908m = documentType;
        this.f28909n = str3;
        this.o = nfcErrors;
    }

    public final void a(fd fdVar) {
        this.d = fdVar;
    }

    @Override // com.fourthline.orca.internal.bg
    public String b() {
        return this.f28904g;
    }

    public final void c(String str) {
        this.f28909n = str;
    }

    public final String d() {
        return this.f28905h;
    }

    public final gd0 e() {
        return this.f28906j;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof gj)) {
            return false;
        }
        gj gjVar = (gj) obj2;
        return Intrinsics.f(this.f28901a, gjVar.f28901a) && Intrinsics.f(this.f28902b, gjVar.f28902b) && Intrinsics.f(this.f28903c, gjVar.f28903c) && Intrinsics.f(this.d, gjVar.d) && Intrinsics.f(this.e, gjVar.e) && Intrinsics.f(this.f, gjVar.f) && Intrinsics.f(this.f28904g, gjVar.f28904g) && Intrinsics.f(this.f28905h, gjVar.f28905h) && Intrinsics.f(this.i, gjVar.i) && Intrinsics.f(this.f28906j, gjVar.f28906j) && Intrinsics.f(this.k, gjVar.k) && Double.compare(this.f28907l, gjVar.f28907l) == 0 && this.f28908m == gjVar.f28908m && Intrinsics.f(this.f28909n, gjVar.f28909n) && Intrinsics.f(this.o, gjVar.o);
    }

    public final gh f() {
        return this.f28901a;
    }

    public final fd g() {
        return this.d;
    }

    public final byte[] h() {
        return this.k;
    }

    public int hashCode() {
        int iHashCode = ((((this.f28901a.hashCode() * 31) + this.f28902b.hashCode()) * 31) + this.f28903c.hashCode()) * 31;
        fd fdVar = this.d;
        int iHashCode2 = (iHashCode + (fdVar == null ? 0 : fdVar.hashCode())) * 31;
        di diVar = this.e;
        int iHashCode3 = (iHashCode2 + (diVar == null ? 0 : diVar.hashCode())) * 31;
        DocumentScannerResult documentScannerResult = this.f;
        int iHashCode4 = (iHashCode3 + (documentScannerResult == null ? 0 : documentScannerResult.hashCode())) * 31;
        String str = this.f28904g;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f28905h;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ad0 ad0Var = this.i;
        int iHashCode7 = (iHashCode6 + (ad0Var == null ? 0 : ad0Var.hashCode())) * 31;
        gd0 gd0Var = this.f28906j;
        int iHashCode8 = (iHashCode7 + (gd0Var == null ? 0 : gd0Var.hashCode())) * 31;
        byte[] bArr = this.k;
        int iHashCode9 = (((iHashCode8 + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31) + Double.hashCode(this.f28907l)) * 31;
        DocumentType documentType = this.f28908m;
        int iHashCode10 = (iHashCode9 + (documentType == null ? 0 : documentType.hashCode())) * 31;
        String str3 = this.f28909n;
        return ((iHashCode10 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.o.hashCode();
    }

    public final ad0 i() {
        return this.i;
    }

    public final List j() {
        return this.o;
    }

    public final yj0 k() {
        return this.f28903c;
    }

    public final String l() {
        return this.f28909n;
    }

    public final DocumentType m() {
        return this.f28908m;
    }

    public final yz0 n() {
        return this.f28902b;
    }

    public final di o() {
        return this.e;
    }

    public String toString() {
        return "DocumentFlowDataBundle(document=" + this.f28901a + ", secondaryDocuments=" + this.f28902b + ", person=" + this.f28903c + ", documentIssuingCountry=" + this.d + ", selectedDocument=" + this.e + ", documentScannerResult=" + this.f + ", documentAnalysisId=" + this.f28904g + ", canNumber=" + this.f28905h + ", nfcCapabilityResult=" + this.i + ", deviceAntennaSettings=" + this.f28906j + ", inMemoryVideo=" + Arrays.toString(this.k) + ", imageCompression=" + this.f28907l + ", recognizedDocumentType=" + this.f28908m + ", recognizedCountryCode=" + this.f28909n + ", nfcErrors=" + this.o + ")";
    }

    public final void a(di diVar) {
        this.e = diVar;
    }

    public final void b(String str) {
        this.f28905h = str;
    }

    @Override // com.fourthline.orca.internal.bg
    public tg c() {
        return this.f28910p;
    }

    @Override // com.fourthline.orca.internal.bg
    public DocumentScannerResult a() {
        return this.f;
    }

    @Override // com.fourthline.orca.internal.bg
    public void a(DocumentScannerResult documentScannerResult) {
        this.f = documentScannerResult;
    }

    @Override // com.fourthline.orca.internal.bg
    public void a(String str) {
        this.f28904g = str;
    }

    public final void a(ad0 ad0Var) {
        this.i = ad0Var;
    }

    public final void a(gd0 gd0Var) {
        this.f28906j = gd0Var;
    }

    public final void a(byte[] bArr) {
        this.k = bArr;
    }

    public final void a(double d) {
        this.f28907l = d;
    }

    public final void a(DocumentType documentType) {
        this.f28908m = documentType;
    }

    @Override // com.fourthline.orca.internal.bg
    public void a(tg tgVar) {
        if (tgVar == null) {
            tgVar = null;
        } else if (tgVar instanceof tg.a) {
            a((tg.a) tgVar);
        }
        this.f28910p = tgVar;
    }

    private final void a(tg.a aVar) {
        DocumentType documentType;
        gg0 gg0VarC;
        String documentType2;
        try {
            gg0VarC = aVar.c();
        } catch (Throwable th10) {
            th10.printStackTrace();
        }
        if (gg0VarC == null || (documentType2 = gg0VarC.getDocumentType()) == null) {
            documentType = null;
        } else {
            String issuingCountry = aVar.c().getIssuingCountry();
            if (issuingCountry == null) {
                issuingCountry = "";
            }
            documentType = CountryNetworkModelKt.toDocumentType(documentType2, issuingCountry);
        }
        if (documentType != null) {
            zj0 zj0VarS = this.f28903c.s();
            gg0 gg0VarC2 = aVar.c();
            zj0VarS.b(gg0VarC2 != null ? gg0VarC2.getFirstName() : null);
            gg0 gg0VarC3 = aVar.c();
            zj0VarS.c(gg0VarC3 != null ? gg0VarC3.getLastName() : null);
            gg0 gg0VarC4 = aVar.c();
            zj0VarS.a(gg0VarC4 != null ? hj.a(gg0VarC4) : null);
            gg0 gg0VarC5 = aVar.c();
            zj0VarS.d(gg0VarC5 != null ? gg0VarC5.getNationality() : null);
            gg0 gg0VarC6 = aVar.c();
            zj0VarS.a(gg0VarC6 != null ? gg0VarC6.getDateOfBirth() : null);
            gg0 gg0VarC7 = aVar.c();
            zj0VarS.a(gg0VarC7 != null ? gg0VarC7.getBirthPlace() : null);
            fh fhVarL = this.f28901a.l();
            gg0 gg0VarC8 = aVar.c();
            fhVarL.b(gg0VarC8 != null ? gg0VarC8.getIssueDate() : null);
            gg0 gg0VarC9 = aVar.c();
            fhVarL.a(gg0VarC9 != null ? gg0VarC9.getExpirationDate() : null);
            gg0 gg0VarC10 = aVar.c();
            fhVarL.a(gg0VarC10 != null ? gg0VarC10.getDocumentNumber() : null);
            fhVarL.a(documentType);
            fhVarL.b(aVar.d());
            fhVarL.a(aVar.b());
        }
    }

    public /* synthetic */ gj(gh ghVar, yz0 yz0Var, yj0 yj0Var, fd fdVar, di diVar, DocumentScannerResult documentScannerResult, String str, String str2, ad0 ad0Var, gd0 gd0Var, byte[] bArr, double d, DocumentType documentType, String str3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(ghVar, yz0Var, yj0Var, (i & 8) != 0 ? null : fdVar, (i & 16) != 0 ? null : diVar, (i & 32) != 0 ? null : documentScannerResult, (i & 64) != 0 ? null : str, (i & 128) != 0 ? null : str2, (i & 256) != 0 ? null : ad0Var, (i & 512) != 0 ? null : gd0Var, (i & 1024) != 0 ? null : bArr, (i & 2048) != 0 ? 0.8d : d, (i & 4096) != 0 ? null : documentType, (i & 8192) != 0 ? null : str3, (i & 16384) != 0 ? new ArrayList() : list);
    }
}
