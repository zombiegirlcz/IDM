package hdg;

import cli.j;
import kotlin.jvm.internal.Intrinsics;
import od0.i;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f151429a;

    public b() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f151429a, ((b) obj2).f151429a);
    }

    public final int hashCode() {
        return this.f151429a.hashCode();
    }

    public b(i inventoryProvider) {
        Intrinsics.checkNotNullParameter(inventoryProvider, "inventoryProvider");
        this.f151429a = inventoryProvider;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i) {
        this(i.f224256b);
        i.Companion.getClass();
    }
}
