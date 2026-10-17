package ec6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ba6.f f124449a;

    public g(ba6.f collection) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        this.f124449a = collection;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f124449a, ((g) obj2).f124449a);
    }

    public final int hashCode() {
        return this.f124449a.hashCode();
    }
}
