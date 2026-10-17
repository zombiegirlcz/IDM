package iv6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f168761a;

    public s(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f168761a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && Intrinsics.f(this.f168761a, ((s) obj2).f168761a);
    }

    public final int hashCode() {
        return this.f168761a.hashCode();
    }
}
