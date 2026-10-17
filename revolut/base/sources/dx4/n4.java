package dx4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class n4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f120690b;

    public n4(String id10, List screens) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(screens, "screens");
        this.f120689a = id10;
        this.f120690b = screens;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n4)) {
            return false;
        }
        n4 n4Var = (n4) obj2;
        return Intrinsics.f(this.f120689a, n4Var.f120689a) && Intrinsics.f(this.f120690b, n4Var.f120690b);
    }

    public final int hashCode() {
        return this.f120690b.hashCode() + (this.f120689a.hashCode() * 31);
    }
}
