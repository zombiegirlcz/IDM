package pri;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f239030h;

    public abstract void N(rri.a aVar);

    public void O() {
    }

    public final void P(List list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f239030h = list;
    }

    @Override // pri.b, pri.e
    public final void h(rri.a view) {
        Intrinsics.checkNotNullParameter(view, "view");
        List list = this.f239030h;
        if (list == null) {
            Intrinsics.r("delegates");
            throw null;
        }
        List list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                if (!((f) it8.next()).C(view)) {
                    return;
                }
            }
        }
        super.h(view);
        N(view);
    }

    @Override // pri.b, pri.e
    public final void l() {
        List list = this.f239030h;
        if (list == null) {
            Intrinsics.r("delegates");
            throw null;
        }
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            ((f) it8.next()).I();
        }
        O();
        super.l();
    }
}
