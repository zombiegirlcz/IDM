package j02;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f169918a;

    public g(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f169918a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f169918a, ((g) obj2).f169918a);
    }

    public final int hashCode() {
        return this.f169918a.hashCode();
    }
}
