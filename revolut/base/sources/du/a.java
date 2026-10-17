package du;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class a implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f117486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f117487c;

    public a(String documentNumber, String dateOfBirth, String dateOfExpiry) {
        Intrinsics.checkNotNullParameter(documentNumber, "documentNumber");
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
        Intrinsics.checkNotNullParameter(dateOfExpiry, "dateOfExpiry");
        this.f117485a = documentNumber;
        this.f117486b = dateOfBirth;
        this.f117487c = dateOfExpiry;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f117485a, aVar.f117485a) && Intrinsics.f(this.f117486b, aVar.f117486b) && Intrinsics.f(this.f117487c, aVar.f117487c);
    }

    public final int hashCode() {
        return this.f117487c.hashCode() + p.a.c(this.f117485a.hashCode() * 31, 31, this.f117486b);
    }
}
