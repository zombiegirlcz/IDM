package x9b;

import cli.p;
import java.util.AbstractList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractList f303653a;

    public e(AbstractList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f303653a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f303653a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f303653a.equals(((e) obj2).f303653a);
    }

    public final int hashCode() {
        return this.f303653a.hashCode();
    }
}
