package xgd;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class p implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f305688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f305689b;

    public p(List items, String str) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f305688a = items;
        this.f305689b = str;
    }

    @Override // cli.o
    public final cli.q a(cli.o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        if ((oldState instanceof p ? (p) oldState : null) == null) {
            return null;
        }
        return new o(!Intrinsics.f(this.f305689b, r3.f305689b));
    }

    @Override // cli.p
    public final List c() {
        return this.f305688a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f305688a, pVar.f305688a) && Intrinsics.f(this.f305689b, pVar.f305689b);
    }

    public final int hashCode() {
        int iHashCode = this.f305688a.hashCode() * 31;
        String str = this.f305689b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
