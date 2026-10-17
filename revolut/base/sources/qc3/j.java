package qc3;

import cli.p;
import java.util.AbstractList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f244546a;

    public j(AbstractList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f244546a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f244546a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f244546a, ((j) obj2).f244546a);
    }

    public final int hashCode() {
        return this.f244546a.hashCode();
    }
}
