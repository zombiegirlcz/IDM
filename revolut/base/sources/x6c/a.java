package x6c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f303062a;

    public final boolean equals(Object obj2) {
        if (obj2 instanceof a) {
            return Intrinsics.f(this.f303062a, ((a) obj2).f303062a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f303062a.hashCode();
    }

    public final String toString() {
        return p.a.p("BrowseUrl(url=", this.f303062a, ")");
    }
}
