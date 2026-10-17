package vwb;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f292693a;

    public j(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f292693a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f292693a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f292693a, ((j) obj2).f292693a);
    }

    public final int hashCode() {
        return this.f292693a.hashCode();
    }
}
