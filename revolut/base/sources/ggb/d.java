package ggb;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f143603a;

    public d(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f143603a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f143603a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f143603a, ((d) obj2).f143603a);
    }

    public final int hashCode() {
        return this.f143603a.hashCode();
    }
}
