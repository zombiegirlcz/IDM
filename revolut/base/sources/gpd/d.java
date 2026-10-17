package gpd;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f145438a;

    public d(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f145438a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f145438a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f145438a, ((d) obj2).f145438a);
    }

    public final int hashCode() {
        return this.f145438a.hashCode();
    }
}
