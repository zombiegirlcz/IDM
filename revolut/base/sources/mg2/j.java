package mg2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class j implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f205146a;

    public j(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f205146a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f205146a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f205146a, ((j) obj2).f205146a);
    }

    public final int hashCode() {
        return this.f205146a.hashCode();
    }
}
