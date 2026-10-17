package rz7;

import kotlin.jvm.internal.Intrinsics;
import te0.w;

/* JADX INFO: loaded from: classes4.dex */
public final class r implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f258518a;

    public r(k state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f258518a = state;
    }

    @Override // rz7.j
    public final efm.r D2() {
        efm.r rVarA = this.f258518a.getName().a();
        q qVar = q.f;
        efm.r map = rVarA.map(new q2j.k(26));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    @Override // rz7.j
    public final efm.r Y() {
        return this.f258518a.getName().a();
    }

    @Override // rz7.j
    public final efm.b r(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return w.z0(this.f258518a.getName(), name);
    }
}
