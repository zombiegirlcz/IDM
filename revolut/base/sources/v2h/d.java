package v2h;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f285744a;

    public d(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f285744a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f285744a, ((d) obj2).f285744a);
    }

    public final int hashCode() {
        return this.f285744a.hashCode();
    }
}
