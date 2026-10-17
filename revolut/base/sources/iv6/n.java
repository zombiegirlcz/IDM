package iv6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f168759a;

    public n(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f168759a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f168759a, ((n) obj2).f168759a);
    }

    public final int hashCode() {
        return this.f168759a.hashCode();
    }
}
