package f6f;

import cli.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g6f.a f132421a;

    public b() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f132421a, ((b) obj2).f132421a);
    }

    public final int hashCode() {
        return this.f132421a.f140919a.hashCode();
    }

    public b(g6f.a chartUIState) {
        Intrinsics.checkNotNullParameter(chartUIState, "chartUIState");
        this.f132421a = chartUIState;
    }

    public /* synthetic */ b(int i) {
        this(new g6f.a(0));
    }
}
