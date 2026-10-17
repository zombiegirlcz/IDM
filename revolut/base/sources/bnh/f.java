package bnh;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f17181a;

    public f(List portfolios) {
        Intrinsics.checkNotNullParameter(portfolios, "portfolios");
        this.f17181a = portfolios;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f17181a, ((f) obj2).f17181a);
    }

    public final int hashCode() {
        return this.f17181a.hashCode();
    }
}
