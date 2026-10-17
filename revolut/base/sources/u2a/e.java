package u2a;

import cli.o;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f276589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f276590b;

    public e(List items, Integer num) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f276589a = items;
        this.f276590b = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f276589a, eVar.f276589a) && Intrinsics.f(this.f276590b, eVar.f276590b);
    }

    public final int hashCode() {
        int iHashCode = this.f276589a.hashCode() * 31;
        Integer num = this.f276590b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
