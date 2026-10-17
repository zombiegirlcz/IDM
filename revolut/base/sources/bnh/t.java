package bnh;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class t implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f17216a;

    public t(List portfolios) {
        Intrinsics.checkNotNullParameter(portfolios, "portfolios");
        this.f17216a = portfolios;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t) && Intrinsics.f(this.f17216a, ((t) obj2).f17216a);
    }

    public final int hashCode() {
        return this.f17216a.hashCode();
    }
}
