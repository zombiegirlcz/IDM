package ryi;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f258380c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f258381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f258382b;

    static {
        dj0.d.Companion.getClass();
        f258380c = new g(dj0.d.e, null);
    }

    public g(dj0.d money, Double d) {
        Intrinsics.checkNotNullParameter(money, "money");
        this.f258381a = money;
        this.f258382b = d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f258381a, gVar.f258381a) && Intrinsics.f(this.f258382b, gVar.f258382b);
    }

    public final int hashCode() {
        int iHashCode = this.f258381a.hashCode() * 31;
        Double d = this.f258382b;
        return iHashCode + (d == null ? 0 : d.hashCode());
    }
}
