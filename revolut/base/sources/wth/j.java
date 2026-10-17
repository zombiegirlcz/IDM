package wth;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f299989a;

    public j(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f299989a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f299989a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f299989a, ((j) obj2).f299989a);
    }

    public final int hashCode() {
        return this.f299989a.hashCode();
    }
}
