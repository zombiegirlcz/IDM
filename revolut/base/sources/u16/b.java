package u16;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f276352a;

    public b(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f276352a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f276352a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f276352a, ((b) obj2).f276352a);
    }

    public final int hashCode() {
        return this.f276352a.hashCode();
    }
}
