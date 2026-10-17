package rz7;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import zw7.z;

/* JADX INFO: loaded from: classes4.dex */
public final class p implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f258517a;

    public p(i state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f258517a = state;
    }

    @Override // rz7.h
    public final efm.b M1(z gender) {
        Intrinsics.checkNotNullParameter(gender, "gender");
        return w.z0(this.f258517a.c0(), gender);
    }

    @Override // rz7.h
    public final efm.r O() {
        efm.r map = this.f258517a.c0().a().map(new ryd.j(new ryd.k(7), 15));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    @Override // rz7.h
    public final efm.r R1() {
        return this.f258517a.c0().a();
    }

    @Override // rz7.h
    public final efm.r v() {
        z.Companion.getClass();
        z[] zVarArrValues = z.values();
        ArrayList arrayList = new ArrayList();
        for (z zVar : zVarArrValues) {
            if (zVar != z.UNKNOWN) {
                arrayList.add(zVar);
            }
        }
        return w.h(arrayList);
    }
}
