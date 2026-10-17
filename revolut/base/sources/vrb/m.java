package vrb;

import aw0.n6;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.wealth.resources.R$string;
import d9.e1;
import d9.t0;
import ip0.qd0;
import ip0.vd0;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class m implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f291563a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f291564b;

    public /* synthetic */ m(c cVar) {
        this.f291564b = cVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        dj0.d dVar;
        switch (this.f291563a) {
            case 0:
                qrb.f unrealisedPerformance = (qrb.f) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(unrealisedPerformance, "unrealisedPerformance");
                y49.h hVar = unrealisedPerformance.f248687b;
                Set<kel.n> set = unrealisedPerformance.f248686a;
                List list = hVar.f310853l;
                nel.n nVar = hVar.f310847a;
                List list2 = list;
                ArrayList arrayList = new ArrayList(w.t(list2, 10));
                Iterator it8 = list2.iterator();
                while (true) {
                    boolean zHasNext = it8.hasNext();
                    c cVar = this.f291564b;
                    if (!zHasNext) {
                        Set set2 = cVar.f291548b;
                        BigDecimal bigDecimal = hVar.f310848b;
                        ej0.b bVar = hVar.f310852j;
                        boolean z = set2.size() == hVar.f310853l.size();
                        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(e1.G(bigDecimal) ? R$string.trading_advanced_charts_open_positions_total_buy_positions : R$string.trading_advanced_charts_open_positions_total_sell_positions, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10);
                        BigDecimal bigDecimalAbs = bigDecimal.abs();
                        Intrinsics.checkNotNullExpressionValue(bigDecimalAbs, "abs(...)");
                        RowDelegate.Model model = new RowDelegate.Model("INNER_TOTAL", null, textLocalisedClause, null, 0, n.b(t0.D(bVar, nVar), bigDecimalAbs), null, null, 0, new RowDelegate.Model.c.b(n.a(hVar.f310849c), null, null, false, 126), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869850);
                        vd0 vd0Var = vd0.CHECKBOX;
                        qd0 qd0Var = z ? qd0.SELECTED : qd0.UNSELECTED;
                        if (z) {
                            set = null;
                        }
                        Set setI1 = set != null ? d0.i1(set) : null;
                        if (setI1 == null) {
                            setI1 = h0.f322473a;
                        }
                        ArrayList arrayListJ = ue0.e.J(new SelectableDelegate.Model("ROW_TOTAL", model, qd0Var, null, vd0Var, false, null, new d(setI1), null, false, 32488), arrayList);
                        yp0.b.k(arrayListJ, 0, 0, 0, 0, 31);
                        return arrayListJ;
                    }
                    y49.e position = (y49.e) it8.next();
                    Set set3 = cVar.f291548b;
                    Intrinsics.checkNotNullParameter(position, "position");
                    for (kel.n nVar2 : set) {
                        String str = nVar2.f183173a.f183145a;
                        String str2 = position.f310837a;
                        if (Intrinsics.f(str, str2)) {
                            kel.m mVar = nVar2.k;
                            if (mVar != null) {
                                dVar = t0.D(mVar.f183170a, nVar);
                            } else {
                                xi0.a aVar = xi0.b.Companion;
                                String str3 = nVar2.f183173a.e;
                                aVar.getClass();
                                dVar = new dj0.d(0L, xi0.a.a(str3));
                            }
                            String strQ = j6.a.q("ROW_ITEM_", str2);
                            String strQ2 = j6.a.q("INNER_HOLDING_ITEM_", str2);
                            BigDecimal bigDecimalAbs2 = nVar2.f183174b.abs();
                            Intrinsics.checkNotNullExpressionValue(bigDecimalAbs2, "abs(...)");
                            arrayList.add(new SelectableDelegate.Model(strQ, new RowDelegate.Model(strQ2, null, n.b(dVar, bigDecimalAbs2), null, 0, null, null, null, 0, new RowDelegate.Model.c.b(n.a(position.f310839c), null, null, false, 126), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869882), set3.contains(nVar2) ? qd0.SELECTED : qd0.UNSELECTED, null, vd0.CHECKBOX, false, null, new e(nVar2), null, false, 32488));
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            default:
                qrb.f content = (qrb.f) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content, "content");
                n6 n6Var = new n6(new TextLocalisedClause(R$string.trading_advanced_charts_close_all_positions_action_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020);
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.trading_advanced_charts_close_all_positions_action_close_positions, null, null, 14);
                LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
                c cVar2 = this.f291564b;
                boolean z3 = !cVar2.f291548b.isEmpty();
                Set set4 = cVar2.f291548b;
                return new aw0.g(n6Var, new n6(textLocalisedClause2, defaultFilledButton, null, "CLOSE_POSITION_BUTTON_LOADING", z3, null, new a(set4, Intrinsics.f(content.f248686a, set4)), 460), (Clause) null, (aw0.f) null, 25);
        }
    }

    public /* synthetic */ m(n nVar, c cVar) {
        this.f291564b = cVar;
    }
}
