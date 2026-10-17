package jeg;

import cli.n;
import cli.y;
import efm.r;
import j82.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yji.l;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class j extends oki.h implements e {
    public final xag.g o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f173397p;

    public j(n stateMapper, xag.g roomsSelectionSharedState) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(roomsSelectionSharedState, "roomsSelectionSharedState");
        this.o = roomsSelectionSharedState;
        this.f173397p = mra.d.b(this, new d(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        r rVarHide = this.o.f303883a.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        r map = rVarHide.map(new h(new je5.n(5), 0));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        l.a1(this, rd0.e.b(map), null, null, new q(this, null, 19), 3);
    }

    public final void I2(Function1 function1) {
        y yVar = this.f173397p;
        List<ieg.b> list = ((d) ((j2) yVar.f22677a).getValue()).f173389a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (ieg.b bVar : list) {
            oei.b bVar2 = bVar.f160710a;
            List list2 = bVar.f160711b;
            ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                arrayList2.add(function1.invoke(it8.next()));
            }
            arrayList.add(new ieg.b(bVar2, arrayList2));
        }
        H2(yVar, new i(0, arrayList));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f173397p;
    }
}
