package ab4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class l implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wu3.g f2877a;

    public l(wu3.g term) {
        Intrinsics.checkNotNullParameter(term, "term");
        this.f2877a = term;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f2877a, ((l) obj2).f2877a);
    }

    public final int hashCode() {
        return this.f2877a.hashCode();
    }
}
