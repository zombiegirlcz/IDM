package com.fourthline.orca.internal;

import com.fourthline.vision.document.DocumentScannerResult;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class we implements bg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DocumentScannerResult f34652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f34653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private tg f34654c;

    public we(DocumentScannerResult documentScannerResult, String str, tg tgVar) {
        this.f34652a = documentScannerResult;
        this.f34653b = str;
        this.f34654c = tgVar;
    }

    @Override // com.fourthline.orca.internal.bg
    public DocumentScannerResult a() {
        return this.f34652a;
    }

    @Override // com.fourthline.orca.internal.bg
    public String b() {
        return this.f34653b;
    }

    @Override // com.fourthline.orca.internal.bg
    public tg c() {
        return this.f34654c;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof we)) {
            return false;
        }
        we weVar = (we) obj2;
        return Intrinsics.f(this.f34652a, weVar.f34652a) && Intrinsics.f(this.f34653b, weVar.f34653b) && Intrinsics.f(this.f34654c, weVar.f34654c);
    }

    public int hashCode() {
        DocumentScannerResult documentScannerResult = this.f34652a;
        int iHashCode = (documentScannerResult == null ? 0 : documentScannerResult.hashCode()) * 31;
        String str = this.f34653b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        tg tgVar = this.f34654c;
        return iHashCode2 + (tgVar != null ? tgVar.hashCode() : 0);
    }

    public String toString() {
        return "DefaultDocumentAnalysisDataBundle(documentScannerResult=" + this.f34652a + ", documentAnalysisId=" + this.f34653b + ", documentAnalysisResult=" + this.f34654c + ")";
    }

    @Override // com.fourthline.orca.internal.bg
    public void a(DocumentScannerResult documentScannerResult) {
        this.f34652a = documentScannerResult;
    }

    @Override // com.fourthline.orca.internal.bg
    public void a(String str) {
        this.f34653b = str;
    }

    @Override // com.fourthline.orca.internal.bg
    public void a(tg tgVar) {
        this.f34654c = tgVar;
    }

    public /* synthetic */ we(DocumentScannerResult documentScannerResult, String str, tg tgVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : documentScannerResult, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : tgVar);
    }
}
