package pa9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f234453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t89.a f234454b;

    public d(wi0.b countryOfResidence, t89.a countryTerms) {
        Intrinsics.checkNotNullParameter(countryOfResidence, "countryOfResidence");
        Intrinsics.checkNotNullParameter(countryTerms, "countryTerms");
        this.f234453a = countryOfResidence;
        this.f234454b = countryTerms;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f234453a, dVar.f234453a) && this.f234454b == dVar.f234454b;
    }

    public final int hashCode() {
        return this.f234454b.hashCode() + (this.f234453a.f297794a.hashCode() * 31);
    }
}
