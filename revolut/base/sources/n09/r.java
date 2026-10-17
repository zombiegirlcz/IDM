package n09;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class r implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f210966a;

    public r(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f210966a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && Intrinsics.f(this.f210966a, ((r) obj2).f210966a);
    }

    public final int hashCode() {
        return this.f210966a.hashCode();
    }
}
