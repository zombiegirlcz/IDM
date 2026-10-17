package hr7;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f154788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f154789b;

    public g(Clause title, List items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f154788a = title;
        this.f154789b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f154789b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f154788a.equals(gVar.f154788a) && Intrinsics.f(this.f154789b, gVar.f154789b);
    }

    public final int hashCode() {
        return this.f154789b.hashCode() + (this.f154788a.hashCode() * 31);
    }
}
