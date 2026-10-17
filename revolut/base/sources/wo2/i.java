package wo2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f298869a;

    public i(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f298869a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f298869a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f298869a, ((i) obj2).f298869a);
    }

    public final int hashCode() {
        return this.f298869a.hashCode();
    }
}
