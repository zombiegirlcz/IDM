package xr7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f308287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f308288b;

    public a(String id10, b state) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f308287a = id10;
        this.f308288b = state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f308287a, aVar.f308287a) && this.f308288b == aVar.f308288b;
    }

    public final int hashCode() {
        return this.f308288b.hashCode() + (this.f308287a.hashCode() * 31);
    }
}
