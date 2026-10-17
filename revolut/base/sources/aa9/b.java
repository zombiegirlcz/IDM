package aa9;

import a9j.j;
import efm.r;
import kotlin.jvm.internal.Intrinsics;
import te0.s;
import te0.w;
import y99.g0;
import y99.i;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f2790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z99.a f2791b;

    public b(i state, z99.a personalCodeUtils) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(personalCodeUtils, "personalCodeUtils");
        this.f2790a = state;
        this.f2791b = personalCodeUtils;
    }

    @Override // aa9.a
    public final r Z2() {
        return ((g0) this.f2790a).y0().c(s.f270018a);
    }

    @Override // aa9.a
    public final void c3(String personalCode, boolean z) {
        Intrinsics.checkNotNullParameter(personalCode, "personalCode");
        g0 g0Var = (g0) this.f2790a;
        g0Var.y0().set(personalCode);
        g0Var.f311779h.getValue(g0Var, g0.f311775p[6]).set(Boolean.valueOf(z));
    }

    @Override // aa9.a
    public final r z1() {
        g0 g0Var = (g0) this.f2790a;
        r map = w.l(g0Var.f311779h.getValue(g0Var, g0.f311775p[6]).c(s.f270018a), Z2()).map(new j(new a7b.r(this, 11), 9));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }
}
