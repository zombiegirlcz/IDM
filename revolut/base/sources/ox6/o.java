package ox6;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f230635a;

    public o(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f230635a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f230635a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f230635a, ((o) obj2).f230635a);
    }

    public final int hashCode() {
        return this.f230635a.hashCode();
    }
}
