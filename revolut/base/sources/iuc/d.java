package iuc;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f168548a;

    public d(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f168548a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f168548a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f168548a, ((d) obj2).f168548a);
    }

    public final int hashCode() {
        return this.f168548a.hashCode();
    }
}
