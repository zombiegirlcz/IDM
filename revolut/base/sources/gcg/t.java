package gcg;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class t implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f142469a;

    public t(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f142469a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f142469a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t) && Intrinsics.f(this.f142469a, ((t) obj2).f142469a);
    }

    public final int hashCode() {
        return this.f142469a.hashCode();
    }
}
