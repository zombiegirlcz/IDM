package t5d;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.wh;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.s3;
import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.shared.asset.trade.actions.ui.impl.R$string;
import ip0.xh0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import koi.j;
import kotlin.jvm.internal.Intrinsics;
import op0.q;
import op0.r;
import qv0.i;
import qv0.k;
import qv0.l;
import qv0.p;
import yhm.m;
import yhm.n;
import yhm.o;
import zhm.d0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class d {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v19, types: [com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate$Model, com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate$Model] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.lang.Object, java.util.Map] */
    public static List b(Data data, List list) {
        ?? model;
        p5d.b bVarC;
        boolean z;
        int i;
        SwipeToActionDelegate.SwipeAction swipeAction;
        List listL;
        Data data2 = data;
        if (data2 == null) {
            return list;
        }
        o5d.d dVar = (o5d.d) data2.getContent();
        List<Object> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (Object objA : list2) {
            if (objA instanceof RowsWidgetDelegate.Model) {
                RowsWidgetDelegate.Model model2 = (RowsWidgetDelegate.Model) objA;
                List items = b(data2, model2.f);
                String listId = model2.e;
                boolean z3 = model2.f55226g;
                q widgetSize = model2.f55227h;
                Parcelable parcelable = model2.i;
                py0.d dVar2 = model2.f55228j;
                boolean z4 = model2.k;
                boolean z6 = model2.f55229l;
                r widgetState = model2.f55230m;
                Object obj2 = model2.f55231n;
                s3 s3Var = model2.o;
                Intrinsics.checkNotNullParameter(listId, "listId");
                Intrinsics.checkNotNullParameter(items, "items");
                Intrinsics.checkNotNullParameter(widgetSize, "widgetSize");
                Intrinsics.checkNotNullParameter(widgetState, "widgetState");
                model = new RowsWidgetDelegate.Model(listId, items, z3, widgetSize, parcelable, dVar2, z4, z6, widgetState, obj2, s3Var);
                model.f54988a = model2.f54988a;
            } else {
                boolean z11 = objA instanceof wh;
                Object obj3 = z11 ? (j) ((wh) objA).f54925b : objA;
                p pVar = obj3 instanceof p ? (p) obj3 : null;
                Object f = pVar != null ? pVar.getF() : null;
                p5d.a aVar = f instanceof p5d.a ? (p5d.a) f : null;
                if (aVar != null && (bVarC = aVar.c()) != null) {
                    String str = bVarC.f233095a;
                    p5d.c cVar = dVar != null ? (p5d.c) dVar.f222424a.get(bVarC) : null;
                    if (cVar == null) {
                        listL = f0.f322471a;
                        z = z11;
                    } else {
                        AnalyticsContext analyticsContextR = aVar.R();
                        if (cVar.f233099b) {
                            z = z11;
                            i = 14;
                            swipeAction = new SwipeToActionDelegate.SwipeAction(j6.a.q("asset_sell_swipe_action_", str), new ResourceImage(R$drawable.uikit_icn_24_arrow_rates_down, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.swipe_to_trade_actions_sell, null, null, 14), xh0.NEUTRAL, null, new o5d.e(p5d.f.SELL, bVarC), analyticsContextR, 16);
                        } else {
                            z = z11;
                            i = 14;
                            swipeAction = null;
                        }
                        SwipeToActionDelegate.SwipeAction[] elements = {swipeAction, cVar.f233098a ? new SwipeToActionDelegate.SwipeAction(j6.a.q("asset_buy_swipe_action_", str), new ResourceImage(R$drawable.uikit_icn_24_arrow_rates, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.swipe_to_trade_actions_buy, null, null, i), xh0.PRIMARY, null, new o5d.e(p5d.f.BUY, bVarC), aVar.R(), 16) : null};
                        Intrinsics.checkNotNullParameter(elements, "elements");
                        listL = kotlin.collections.d.L(elements);
                    }
                    List list3 = listL;
                    if (z) {
                        wh whVar = (wh) objA;
                        List list4 = whVar.f54926c;
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        Iterator it8 = list4.iterator();
                        while (it8.hasNext()) {
                            linkedHashSet.add(((SwipeToActionDelegate.SwipeAction) it8.next()).f53505a);
                        }
                        List list5 = list4;
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj4 : list3) {
                            if (!linkedHashSet.contains(((SwipeToActionDelegate.SwipeAction) obj4).f53505a)) {
                                arrayList2.add(obj4);
                            }
                        }
                        ArrayList arrayListE0 = d0.E0(arrayList2, list5);
                        AnimationRequest animationRequestB = aVar.b();
                        if (arrayListE0.isEmpty()) {
                            animationRequestB = null;
                        }
                        objA = wh.a(whVar, null, arrayListE0, animationRequestB, 16371);
                    } else if (objA instanceof RowDelegate.Model) {
                        RowDelegate.Model model3 = (RowDelegate.Model) objA;
                        wh whVar2 = new wh(model3.f53228a, (i) objA, list3, !list3.isEmpty() ? aVar.b() : null, 240);
                        whVar2.j(model3.v);
                        whVar2.f = model3.f53242w;
                        whVar2.f54927g = model3.f53243x;
                        whVar2.f54928h = model3.f53244y;
                        whVar2.i = model3.z;
                        k f51842q = ((l) objA).getF51842q();
                        if (f51842q == null) {
                            f51842q = whVar2.f54932n;
                        }
                        whVar2.R0(f51842q);
                        objA = whVar2;
                    }
                }
                model = objA;
            }
            arrayList.add(model);
            data2 = data;
        }
        return arrayList;
    }

    public final List a(Data data, List items) throws Throwable {
        Object objA;
        Intrinsics.checkNotNullParameter(items, "items");
        try {
            m.Companion companion = m.INSTANCE;
            objA = b(data, items);
            Intrinsics.i(objA, "null cannot be cast to non-null type kotlin.collections.List<com.revolut.core.ui_kit.items.BoxListItem>");
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            objA = o.a(th10);
        }
        Throwable thA = m.a(objA);
        if (thA != null) {
            hx7.e.n(thA);
        }
        if (objA instanceof n) {
            objA = null;
        }
        List list = (List) objA;
        return list == null ? items : list;
    }

    public final List c(Data data, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        return b(data, items);
    }
}
