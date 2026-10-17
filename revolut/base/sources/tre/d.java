package tre;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f273782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f273783b;

    public d(List terms, List userDocuments) {
        Intrinsics.checkNotNullParameter(terms, "terms");
        Intrinsics.checkNotNullParameter(userDocuments, "userDocuments");
        this.f273782a = terms;
        this.f273783b = userDocuments;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f273782a, dVar.f273782a) && Intrinsics.f(this.f273783b, dVar.f273783b);
    }

    public final int hashCode() {
        return this.f273783b.hashCode() + (this.f273782a.hashCode() * 31);
    }
}
