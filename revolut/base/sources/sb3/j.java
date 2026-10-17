package sb3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class j extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f261486a;

    public j(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f261486a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f261486a, ((j) obj2).f261486a);
    }

    public final int hashCode() {
        return this.f261486a.hashCode();
    }
}
