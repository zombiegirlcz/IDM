package qw1;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f249734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f249735b;

    public d() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f249734a, dVar.f249734a) && Intrinsics.f(this.f249735b, dVar.f249735b);
    }

    public final int hashCode() {
        return this.f249735b.hashCode() + (this.f249734a.hashCode() * 31);
    }

    public d(List availableAliases, Set selectedAliases) {
        Intrinsics.checkNotNullParameter(availableAliases, "availableAliases");
        Intrinsics.checkNotNullParameter(selectedAliases, "selectedAliases");
        this.f249734a = availableAliases;
        this.f249735b = selectedAliases;
    }

    public d(int i) {
        this(f0.f322471a, h0.f322473a);
    }
}
