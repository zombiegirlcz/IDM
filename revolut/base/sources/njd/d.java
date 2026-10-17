package njd;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f216452a;

    public d(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f216452a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f216452a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f216452a, ((d) obj2).f216452a);
    }

    public final int hashCode() {
        return this.f216452a.hashCode();
    }
}
