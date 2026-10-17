package com.fourthline.orca.internal;

import com.fourthline.core.DocumentFileSide;
import com.fourthline.core.DocumentType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class nd1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f31395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DocumentType f31396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final DocumentFileSide f31397c;
    private final Boolean d;

    public nd1(String issuingCountry, DocumentType documentType, DocumentFileSide documentFileSide, Boolean bool) {
        Intrinsics.checkNotNullParameter(issuingCountry, "issuingCountry");
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        this.f31395a = issuingCountry;
        this.f31396b = documentType;
        this.f31397c = documentFileSide;
        this.d = bool;
    }

    public final Boolean a() {
        return this.d;
    }

    public final DocumentFileSide b() {
        return this.f31397c;
    }

    public final DocumentType c() {
        return this.f31396b;
    }

    public final String d() {
        return this.f31395a;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof nd1)) {
            return false;
        }
        nd1 nd1Var = (nd1) obj2;
        return Intrinsics.f(this.f31395a, nd1Var.f31395a) && this.f31396b == nd1Var.f31396b && this.f31397c == nd1Var.f31397c && Intrinsics.f(this.d, nd1Var.d);
    }

    public int hashCode() {
        int iHashCode = ((this.f31395a.hashCode() * 31) + this.f31396b.hashCode()) * 31;
        DocumentFileSide documentFileSide = this.f31397c;
        int iHashCode2 = (iHashCode + (documentFileSide == null ? 0 : documentFileSide.hashCode())) * 31;
        Boolean bool = this.d;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "ValidationDocumentExpectations(issuingCountry=" + this.f31395a + ", documentType=" + this.f31396b + ", documentSide=" + this.f31397c + ", documentIsAngled=" + this.d + ")";
    }
}
