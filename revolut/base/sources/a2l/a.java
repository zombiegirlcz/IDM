package a2l;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f892a;

    public a(String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f892a = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f892a, ((a) obj2).f892a);
    }

    public final int hashCode() {
        return this.f892a.hashCode();
    }
}
