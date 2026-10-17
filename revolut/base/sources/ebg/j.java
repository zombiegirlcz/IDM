package ebg;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class j implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f124342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f124343b;

    public j(ArrayList items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f124342a = items;
        this.f124343b = z;
    }

    @Override // cli.o
    public final cli.q a(cli.o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        if (oldState instanceof j) {
            return new h(((j) oldState).f124343b != this.f124343b);
        }
        return null;
    }

    @Override // cli.p
    public final List c() {
        return this.f124342a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f124342a.equals(jVar.f124342a) && this.f124343b == jVar.f124343b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f124343b) + (this.f124342a.hashCode() * 31);
    }
}
