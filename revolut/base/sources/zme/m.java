package zme;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f323503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f323504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f323505c;

    public m(String documentType, String documentNumber, wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        Intrinsics.checkNotNullParameter(documentNumber, "documentNumber");
        this.f323503a = countryCode;
        this.f323504b = documentType;
        this.f323505c = documentNumber;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f323503a, mVar.f323503a) && Intrinsics.f(this.f323504b, mVar.f323504b) && Intrinsics.f(this.f323505c, mVar.f323505c);
    }

    public final int hashCode() {
        return this.f323505c.hashCode() + p.a.c(this.f323503a.f297794a.hashCode() * 31, 31, this.f323504b);
    }
}
