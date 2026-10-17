package evj;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f129971a;

    public d(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f129971a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f129971a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f129971a, ((d) obj2).f129971a);
    }

    public final int hashCode() {
        return this.f129971a.hashCode();
    }
}
