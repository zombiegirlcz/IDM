package y2e;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.store.api.model.StoreMegaFilter;
import com.revolut.feature.store.api.model.StoreMegaQuickFilter;
import com.revolut.kompot.common.R$string;
import ip0.zj;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import ms0.h4;
import org.jetbrains.annotations.NotNull;
import xo8.j0;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class t implements cli.n {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ImageTransformations f310660a = new ImageTransformations(null, new CircleTransformation(Float.valueOf(1.0f), Integer.valueOf(R$attr.uikit_colorGrey50_5), true, 4), null, null, null, 44, 44, 29);

    public static final class a {
        private a() {
        }
    }

    public static ActionsView.Item a(String str, String str2, boolean z, f fVar) {
        return new ActionsView.Item(str, z ? mx0.d.ACCENT : mx0.d.SEMIACCENT, false, null, null, new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, false, null, null, fVar, null, 24476);
    }

    public static FullScreenStateDelegate.Model b(String str) {
        return new FullScreenStateDelegate.Model(str, new TextLocalisedClause(R$string.common_error_state_title, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), new l6(12, new TextLocalisedClause(R$string.common_error_state_action, null, null, 14), null, h4.ACCENT), zj.REGULAR, false, null, null, null, 1860);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        Object next;
        boolean z;
        y2e.a domainState = (y2e.a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = (List) iii.c.g(domainState.f310632a, new y25.d(4), new y13.a(this, 10), new j0(16, domainState, this));
        List list2 = domainState.f310633b;
        g2e.a aVar = domainState.d;
        List list3 = list2;
        ArrayList arrayList = new ArrayList(w.t(list3, 10));
        Iterator it8 = list3.iterator();
        while (it8.hasNext()) {
            arrayList.add(((StoreMegaQuickFilter) it8.next()).f88565a);
        }
        Set setI1 = d0.i1(arrayList);
        ArrayList arrayList2 = new ArrayList(w.t(list3, 10));
        Iterator it9 = list3.iterator();
        while (true) {
            boolean z3 = true;
            if (!it9.hasNext()) {
                break;
            }
            StoreMegaQuickFilter storeMegaQuickFilter = (StoreMegaQuickFilter) it9.next();
            List list4 = aVar.f139971a;
            String str = storeMegaQuickFilter.f88565a;
            boolean zContains = list4.contains(str);
            ArrayList arrayListA = g2e.d.a(aVar);
            if (arrayListA.isEmpty()) {
                z = false;
            } else {
                Iterator it10 = arrayListA.iterator();
                while (it10.hasNext()) {
                    if (Intrinsics.f(((StoreMegaFilter.StoreMegaFilterValue) ((Pair) it10.next()).f186386b).f88540a, str)) {
                        z = true;
                        break;
                    }
                }
                z = false;
            }
            String strQ = j6.a.q("QUICK_FILTER_API_CHIP_LIST_ID_PREFIX_", str);
            String str2 = storeMegaQuickFilter.f88566b;
            if (!zContains && !z) {
                z3 = false;
            }
            arrayList2.add(a(strQ, str2, z3, new d(str)));
        }
        ArrayList arrayListA2 = g2e.d.a(aVar);
        ArrayList<Pair> arrayList3 = new ArrayList();
        for (Object obj2 : arrayListA2) {
            if (!setI1.contains(((StoreMegaFilter.StoreMegaFilterValue) ((Pair) obj2).f186386b).f88540a)) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
        for (Pair pair : arrayList3) {
            StoreMegaFilter storeMegaFilter = (StoreMegaFilter) pair.f186385a;
            StoreMegaFilter.StoreMegaFilterValue storeMegaFilterValue = (StoreMegaFilter.StoreMegaFilterValue) pair.f186386b;
            arrayList4.add(a(a0.d.s("QUICK_FILTER_MODAL_CHIP_LIST_ID_PREFIX_", storeMegaFilter.f88537a, "_", storeMegaFilterValue.f88540a), storeMegaFilterValue.f88541b, true, new e(storeMegaFilter.f88537a, storeMegaFilterValue.f88540a)));
        }
        ArrayList arrayListE0 = d0.E0(arrayList4, arrayList2);
        Iterator it11 = arrayListE0.iterator();
        while (true) {
            if (!it11.hasNext()) {
                next = null;
                break;
            }
            next = it11.next();
            if (((ActionsView.Item) next).f58317b == mx0.d.ACCENT) {
                break;
            }
        }
        ActionsView.Item item = (ActionsView.Item) next;
        return new h(list, arrayListE0, item != null ? new mx0.s(item.f58316a) : mx0.t.f210002a);
    }
}
