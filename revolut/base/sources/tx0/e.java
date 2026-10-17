package tx0;

import aw0.l1;
import aw0.x6;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f275107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x6 f275108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw0.l1 f275109c;
    public final boolean d;
    public final boolean e;

    public e(List chartItems, x6 chartColorScheme, aw0.l1 interpolation, int i) {
        interpolation = (i & 4) != 0 ? l1.d.f10401a : interpolation;
        boolean z = (i & 8) == 0;
        boolean z3 = (i & 32) == 0;
        Intrinsics.checkNotNullParameter(chartItems, "chartItems");
        Intrinsics.checkNotNullParameter(chartColorScheme, "chartColorScheme");
        Intrinsics.checkNotNullParameter(interpolation, "interpolation");
        this.f275107a = chartItems;
        this.f275108b = chartColorScheme;
        this.f275109c = interpolation;
        this.d = z;
        this.e = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f275107a, eVar.f275107a) && Intrinsics.f(this.f275108b, eVar.f275108b) && Intrinsics.f(this.f275109c, eVar.f275109c) && this.d == eVar.d && this.e == eVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j6.a.c(j6.a.c((this.f275109c.hashCode() + p.a.d(this.f275107a.hashCode() * 31, 31, this.f275108b.f10606a)) * 31, 31, this.d), 31, true);
    }
}
