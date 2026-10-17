package au;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class k implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9122c;
    public final yt.a d;

    public k(String documentNumber, String dateOfBirth, String dateOfExpiry, yt.a documentType) {
        Intrinsics.checkNotNullParameter(documentNumber, "documentNumber");
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
        Intrinsics.checkNotNullParameter(dateOfExpiry, "dateOfExpiry");
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        this.f9120a = documentNumber;
        this.f9121b = dateOfBirth;
        this.f9122c = dateOfExpiry;
        this.d = documentType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f9120a, kVar.f9120a) && Intrinsics.f(this.f9121b, kVar.f9121b) && Intrinsics.f(this.f9122c, kVar.f9122c) && this.d == kVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f9120a.hashCode() * 31, 31, this.f9121b), 31, this.f9122c);
    }
}
