package bq2;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f17670a;

    public d(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f17670a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f17670a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f17670a, ((d) obj2).f17670a);
    }

    public final int hashCode() {
        return this.f17670a.hashCode();
    }
}
