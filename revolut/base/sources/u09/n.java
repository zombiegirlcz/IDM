package u09;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f276136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f276137b;

    public n(List tags, m filterMode) {
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(filterMode, "filterMode");
        this.f276136a = tags;
        this.f276137b = filterMode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f276136a, nVar.f276136a) && this.f276137b == nVar.f276137b;
    }

    public final int hashCode() {
        return this.f276137b.hashCode() + (this.f276136a.hashCode() * 31);
    }
}
