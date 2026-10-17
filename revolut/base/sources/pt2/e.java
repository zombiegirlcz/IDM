package pt2;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f239596a;

    public e(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f239596a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f239596a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f239596a, ((e) obj2).f239596a);
    }

    public final int hashCode() {
        return this.f239596a.hashCode();
    }
}
