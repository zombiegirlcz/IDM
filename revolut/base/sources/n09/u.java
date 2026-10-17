package n09;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class u implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f210969a;

    public u(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f210969a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof u) && Intrinsics.f(this.f210969a, ((u) obj2).f210969a);
    }

    public final int hashCode() {
        return this.f210969a.hashCode();
    }
}
