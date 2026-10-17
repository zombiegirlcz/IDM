package rz7;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import zw7.c0;

/* JADX INFO: loaded from: classes4.dex */
public final class t implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f258520a;

    public t(o state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f258520a = state;
    }

    @Override // rz7.n
    public final efm.r F() {
        return this.f258520a.h0().a();
    }

    @Override // rz7.n
    public final efm.b I(c0 type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return w.z0(this.f258520a.h0(), type);
    }

    @Override // rz7.n
    public final efm.r g0() {
        c0.Companion.getClass();
        c0[] c0VarArrValues = c0.values();
        ArrayList arrayList = new ArrayList();
        for (c0 c0Var : c0VarArrValues) {
            if (c0Var != c0.UNKNOWN) {
                arrayList.add(c0Var);
            }
        }
        return w.h(arrayList);
    }
}
