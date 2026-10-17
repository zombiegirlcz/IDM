package um9;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f281275a;

    public i(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f281275a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f281275a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f281275a, ((i) obj2).f281275a);
    }

    public final int hashCode() {
        return this.f281275a.hashCode();
    }
}
