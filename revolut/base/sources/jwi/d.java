package jwi;

import gwi.f2;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import svi.h0;
import svi.y;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f179013a = r0.k(new Pair("LIMITED", y.LIMITED), new Pair("UNLIMITED", y.UNLIMITED));

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Map] */
    public static final ArrayList a(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<f2> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (f2 f2Var : list2) {
            arrayList.add(new h0(f2Var.f147393a, (y) u1.t(f2Var.f147394b, y.UNKNOWN, f179013a), mo3.a.o(f2Var.f147395c)));
        }
        return arrayList;
    }
}
