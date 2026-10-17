package w3c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f294276a;

    public j(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f294276a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f294276a, ((j) obj2).f294276a);
    }

    public final int hashCode() {
        return this.f294276a.hashCode();
    }
}
