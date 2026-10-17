package ahd;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class p implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f4953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4954b;

    public p(List items, String str) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f4953a = items;
        this.f4954b = str;
    }

    @Override // cli.o
    public final cli.q a(cli.o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        if ((oldState instanceof p ? (p) oldState : null) == null) {
            return null;
        }
        return new o(!Intrinsics.f(this.f4954b, r3.f4954b));
    }

    @Override // cli.p
    public final List c() {
        return this.f4953a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f4953a, pVar.f4953a) && Intrinsics.f(this.f4954b, pVar.f4954b);
    }

    public final int hashCode() {
        int iHashCode = this.f4953a.hashCode() * 31;
        String str = this.f4954b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
