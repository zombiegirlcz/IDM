package meg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f204659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f204660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final efi.a f204661c;

    public b(String reference, String queryParam, efi.a newValue) {
        Intrinsics.checkNotNullParameter(reference, "reference");
        Intrinsics.checkNotNullParameter(queryParam, "queryParam");
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        this.f204659a = reference;
        this.f204660b = queryParam;
        this.f204661c = newValue;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f204659a, bVar.f204659a) && Intrinsics.f(this.f204660b, bVar.f204660b) && Intrinsics.f(this.f204661c, bVar.f204661c);
    }

    public final int hashCode() {
        return this.f204661c.hashCode() + p.a.c(this.f204659a.hashCode() * 31, 31, this.f204660b);
    }
}
