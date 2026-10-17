package odh;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import p5d.e;
import w4l.j;
import zhm.d0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kdh.b f224476a;

    public d(kdh.b instrumentActionsInteractor) {
        Intrinsics.checkNotNullParameter(instrumentActionsInteractor, "instrumentActionsInteractor");
        this.f224476a = instrumentActionsInteractor;
    }

    @Override // p5d.e
    public final Flow a(List swipeableAssets) {
        Intrinsics.checkNotNullParameter(swipeableAssets, "swipeableAssets");
        if (swipeableAssets.isEmpty()) {
            return zi0.c.i(r0.g());
        }
        List list = swipeableAssets;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(((p5d.b) it8.next()).f233095a);
        }
        return nim.a.v(this.f224476a.a0(d0.U(arrayList), false, j.f294644c), new njf.e(swipeableAssets, 8));
    }
}
