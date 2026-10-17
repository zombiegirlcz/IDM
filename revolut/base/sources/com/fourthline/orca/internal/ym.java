package com.fourthline.orca.internal;

import com.fourthline.orca.internal.tg;
import com.fourthline.vision.document.DocumentScannerResult;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ym {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DocumentScannerResult f35385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final tg.a f35386b;

    public ym(DocumentScannerResult scannerResult, tg.a aVar) {
        Intrinsics.checkNotNullParameter(scannerResult, "scannerResult");
        this.f35385a = scannerResult;
        this.f35386b = aVar;
    }

    public final tg.a a() {
        return this.f35386b;
    }

    public final DocumentScannerResult b() {
        return this.f35385a;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ym)) {
            return false;
        }
        ym ymVar = (ym) obj2;
        return Intrinsics.f(this.f35385a, ymVar.f35385a) && Intrinsics.f(this.f35386b, ymVar.f35386b);
    }

    public int hashCode() {
        int iHashCode = this.f35385a.hashCode() * 31;
        tg.a aVar = this.f35386b;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public String toString() {
        return "DocumentProductResult(scannerResult=" + this.f35385a + ", rtfResult=" + this.f35386b + ")";
    }

    public /* synthetic */ ym(DocumentScannerResult documentScannerResult, tg.a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(documentScannerResult, (i & 2) != 0 ? null : aVar);
    }
}
