package qv4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f249531a;

    public j(aim.e items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f249531a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f249531a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f249531a, ((j) obj2).f249531a);
    }

    public final int hashCode() {
        return this.f249531a.hashCode();
    }
}
