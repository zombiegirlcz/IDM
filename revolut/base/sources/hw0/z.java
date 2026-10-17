package hw0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes19.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ms0.v f156028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f156029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f156030c;
    public final List d;

    public z() {
        this(null, null, 15);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return this.f156028a == zVar.f156028a && this.f156029b == zVar.f156029b && this.f156030c == zVar.f156030c && Intrinsics.f(this.d, zVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + j6.a.c(j6.a.c(this.f156028a.hashCode() * 31, 31, this.f156029b), 31, this.f156030c);
    }

    public z(ms0.v badgeStyle, boolean z, boolean z3, List badges) {
        Intrinsics.checkNotNullParameter(badgeStyle, "badgeStyle");
        Intrinsics.checkNotNullParameter(badges, "badges");
        this.f156028a = badgeStyle;
        this.f156029b = z;
        this.f156030c = z3;
        this.d = badges;
    }

    public z(ms0.v vVar, List list, int i) {
        this((i & 1) != 0 ? ms0.v.WhiteTransparentBackground : vVar, (i & 2) == 0, false, (i & 8) != 0 ? f0.f322471a : list);
    }

    public /* synthetic */ z(a aVar, a aVar2, ms0.v vVar, int i) {
        this(aVar, aVar2, (i & 16) != 0 ? ms0.v.WhiteTransparentBackground : vVar, (i & 32) == 0, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public z(a aVar, a aVar2, ms0.v badgeStyle, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(badgeStyle, "badgeStyle");
        a[] elements = {aVar2, null, null, aVar};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this(badgeStyle, z, z3, kotlin.collections.d.L(elements));
    }
}
