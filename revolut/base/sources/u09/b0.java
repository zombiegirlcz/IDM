package u09;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f276102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f276103b;

    public b0(String id10, String text) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(text, "text");
        this.f276102a = id10;
        this.f276103b = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return Intrinsics.f(this.f276102a, b0Var.f276102a) && Intrinsics.f(this.f276103b, b0Var.f276103b);
    }

    public final int hashCode() {
        return this.f276103b.hashCode() + (this.f276102a.hashCode() * 31);
    }
}
