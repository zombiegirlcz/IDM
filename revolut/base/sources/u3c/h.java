package u3c;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f276900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f276901b;

    public h(boolean z, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f276900a = z;
        this.f276901b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f276901b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f276900a == hVar.f276900a && Intrinsics.f(this.f276901b, hVar.f276901b);
    }

    public final int hashCode() {
        return this.f276901b.hashCode() + (Boolean.hashCode(this.f276900a) * 31);
    }
}
