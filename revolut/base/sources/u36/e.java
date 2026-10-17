package u36;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f276783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f276784b;

    public e(List items, String searchQuery) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        this.f276783a = items;
        this.f276784b = searchQuery;
    }

    @Override // cli.p
    public final List c() {
        return this.f276783a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f276783a, eVar.f276783a) && Intrinsics.f(this.f276784b, eVar.f276784b);
    }

    public final int hashCode() {
        return this.f276784b.hashCode() + (this.f276783a.hashCode() * 31);
    }
}
