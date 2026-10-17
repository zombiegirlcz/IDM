package vb2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class k implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f287367a;

    public k(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f287367a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f287367a, ((k) obj2).f287367a);
    }

    public final int hashCode() {
        return this.f287367a.hashCode();
    }
}
