package vm;

import com.google.common.collect.ImmutableSet;
import efm.d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import qfm.f0;
import qfm.j0;
import ufm.i;
import zhm.w;

/* JADX INFO: loaded from: classes.dex */
public final class b extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f290516a;

    public b(ImmutableSet ignoreConditions) {
        Intrinsics.checkNotNullParameter(ignoreConditions, "ignoreConditions");
        this.f290516a = ignoreConditions;
    }

    @Override // vm.d
    public final d0 d(um.a payload) {
        Intrinsics.checkNotNullParameter(payload, "errorData");
        Set set = this.f290516a;
        ArrayList arrayList = new ArrayList(w.t(set, 10));
        Iterator it8 = set.iterator();
        while (it8.hasNext()) {
            ((in.c) it8.next()).getClass();
            Intrinsics.checkNotNullParameter(payload, "payload");
            ufm.b bVarM = d0.m(Boolean.valueOf(!x5d.b.b(payload)));
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            arrayList.add(bVarM);
        }
        i iVar = new i(new f0(new j0(d0.h(efm.i.h(arrayList)), new vif.c(new vjk.b(21), 24), 0), Boolean.TRUE), new vif.c(new a(payload), 25), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    @Override // um.b
    public final int getLevel() {
        return -9999;
    }
}
