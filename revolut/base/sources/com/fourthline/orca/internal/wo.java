package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class wo implements vo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final yz0 f34751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DocumentType f34752b;

    public wo(yz0 secondaryDocuments, DocumentType secondaryDocumentType) {
        Intrinsics.checkNotNullParameter(secondaryDocuments, "secondaryDocuments");
        Intrinsics.checkNotNullParameter(secondaryDocumentType, "secondaryDocumentType");
        this.f34751a = secondaryDocuments;
        this.f34752b = secondaryDocumentType;
    }

    @Override // com.fourthline.orca.internal.vo
    public void a(ko result) {
        Intrinsics.checkNotNullParameter(result, "result");
        yz0 yz0Var = this.f34751a;
        List listA = yz0Var.a();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listA) {
            if (((xz0) obj2).d() != this.f34752b) {
                arrayList.add(obj2);
            }
        }
        xz0 xz0Var = new xz0(null, null, null, null, 15, null);
        go.a(xz0Var, result.a());
        Unit unit = Unit.f186387a;
        yz0Var.a(zhm.d0.F0(xz0Var, arrayList));
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof wo)) {
            return false;
        }
        wo woVar = (wo) obj2;
        return Intrinsics.f(this.f34751a, woVar.f34751a) && this.f34752b == woVar.f34752b;
    }

    public int hashCode() {
        return (this.f34751a.hashCode() * 31) + this.f34752b.hashCode();
    }

    public String toString() {
        return "DocumentScannerResultRepositoryToKycSecondaryDocumentBundle(secondaryDocuments=" + this.f34751a + ", secondaryDocumentType=" + this.f34752b + ")";
    }
}
