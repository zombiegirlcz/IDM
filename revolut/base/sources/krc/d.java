package krc;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f188848a;

    public d(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f188848a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f188848a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f188848a, ((d) obj2).f188848a);
    }

    public final int hashCode() {
        return this.f188848a.hashCode();
    }
}
