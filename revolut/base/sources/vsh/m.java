package vsh;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.feature.widgets.impl.ui.screen.catalgoue.WidgetsCatalogueScreenContract$InputData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ua2.r;
import vkm.v1;
import zhm.f0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class m extends jki.g implements f {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final csh.j f291803p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ish.a f291804q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ish.b f291805r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final WidgetsCatalogueScreenContract$InputData f291806s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(csh.j widgetsCatalogueOrder, ish.a widgetCatalogueInteractor, ish.b widgetContentInteractor, WidgetsCatalogueScreenContract$InputData inputData, c mapper) {
        super(mapper);
        Intrinsics.checkNotNullParameter(widgetsCatalogueOrder, "widgetsCatalogueOrder");
        Intrinsics.checkNotNullParameter(widgetCatalogueInteractor, "widgetCatalogueInteractor");
        Intrinsics.checkNotNullParameter(widgetContentInteractor, "widgetContentInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f291803p = widgetsCatalogueOrder;
        this.f291804q = widgetCatalogueInteractor;
        this.f291805r = widgetContentInteractor;
        this.f291806s = inputData;
    }

    @Override // yji.l
    public final void I1() {
        List listA = this.f291803p.a(this.f291806s.f96383a);
        ArrayList arrayList = new ArrayList(w.t(listA, 10));
        Iterator it8 = listA.iterator();
        while (it8.hasNext()) {
            arrayList.add(new h((String) it8.next(), null, null, null));
        }
        x2(new r(8, arrayList));
    }

    @Override // yji.l
    public final void T1(long j2) {
        List list = ((d) t2()).f291791a;
        ArrayList flows = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (true) {
            Continuation continuation = null;
            if (!it8.hasNext()) {
                Intrinsics.checkNotNullParameter(flows, "flows");
                yji.l.b1(this, new v1(new dmf.c(flows, continuation, 1)), null, new l(this, null), 3);
                return;
            }
            flows.add(rd0.e.d(new v1(new j((h) it8.next(), this, null)), h0.f322473a));
        }
    }

    @Override // jki.g
    public final jki.i r2() {
        return new d(f0.f322471a);
    }

    public final void y2(BaseDraggableWidgetDelegate.Model widgetModel) {
        String str;
        Intrinsics.checkNotNullParameter(widgetModel, "widgetModel");
        for (h hVar : ((d) t2()).f291791a) {
            BaseDraggableWidgetDelegate.Model model = hVar.f291797b;
            if (Intrinsics.f(model != null ? model.getF52269a() : null, widgetModel.getF52269a())) {
                List list = hVar.f291798c;
                if (list == null || (str = hVar.d) == null) {
                    return;
                }
                v2(new e(hVar.f291796a, list, str));
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
