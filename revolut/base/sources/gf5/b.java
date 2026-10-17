package gf5;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f143344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f143345b;

    public b(Clause clause, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f143344a = clause;
        this.f143345b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f143345b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f143344a, bVar.f143344a) && Intrinsics.f(this.f143345b, bVar.f143345b);
    }

    public final int hashCode() {
        Clause clause = this.f143344a;
        return this.f143345b.hashCode() + ((clause == null ? 0 : clause.hashCode()) * 31);
    }
}
