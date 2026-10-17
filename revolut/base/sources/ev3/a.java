package ev3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f129699a;

    public a(String taxPayerNumber) {
        Intrinsics.checkNotNullParameter(taxPayerNumber, "taxPayerNumber");
        this.f129699a = taxPayerNumber;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f129699a, ((a) obj2).f129699a);
    }

    public final int hashCode() {
        return this.f129699a.hashCode();
    }
}
