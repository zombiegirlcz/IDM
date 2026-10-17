package p2c;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f232216a;

    public m(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f232216a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f232216a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f232216a, ((m) obj2).f232216a);
    }

    public final int hashCode() {
        return this.f232216a.hashCode();
    }
}
