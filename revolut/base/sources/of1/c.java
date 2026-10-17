package of1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f224678a;

    public c(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f224678a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f224678a, ((c) obj2).f224678a);
    }

    public final int hashCode() {
        return this.f224678a.hashCode();
    }
}
