package av8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final my8.l f9947a;

    public h(my8.l doc2) {
        Intrinsics.checkNotNullParameter(doc2, "doc");
        this.f9947a = doc2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f9947a, ((h) obj2).f9947a);
    }

    public final int hashCode() {
        return this.f9947a.hashCode();
    }
}
