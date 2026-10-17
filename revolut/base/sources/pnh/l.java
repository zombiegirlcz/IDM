package pnh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f237790a;

    public l(String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        this.f237790a = link;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f237790a, ((l) obj2).f237790a);
    }

    public final int hashCode() {
        return this.f237790a.hashCode();
    }
}
