package vg5;

import aim.e;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tim.d;
import zhm.d0;
import zhm.u;
import zhm.v;
import zhm.y0;
import zhm.z0;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f288755b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yzl.a f288756a;

    static {
        xi0.b.Companion.getClass();
        f288755b = y0.b(xi0.b.N);
    }

    public c(yzl.a randomUtils) {
        Intrinsics.checkNotNullParameter(randomUtils, "randomUtils");
        this.f288756a = randomUtils;
    }

    public final e a(ArrayList arrayList, List list, List list2, int i) {
        ug5.b bVar = (ug5.b) d0.e0(i, list);
        ug5.b bVar2 = (ug5.b) d0.e0(i, list2);
        ug5.b bVar3 = (ug5.b) d0.e0(i + 3, list2);
        Set setI = z0.i(bVar, bVar2, bVar3);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!setI.contains((ug5.b) obj2)) {
                arrayList2.add(obj2);
            }
        }
        int iA = this.f288756a.a();
        List listQ = v.q(arrayList2, new d(iA, iA >> 31));
        e eVarB = u.b();
        if (bVar != null) {
            eVarB.add(bVar);
        }
        if (bVar2 != null) {
            eVarB.add(bVar2);
        }
        eVarB.addAll(listQ);
        if (bVar3 != null) {
            eVarB.add(bVar3);
        }
        return u.a(eVarB);
    }
}
