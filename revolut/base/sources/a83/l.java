package a83;

import com.revolut.core.ui_kit.views.FloatingBottomBarView;
import com.revolut.feature.card_screen.impl.kompot.cards_list.screen.CardListScreen;
import com.revolut.feature.main_screen_ui_customization.impl.tabs_order_settings.TabsOrderSettingsScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import vkm.j2;

/* JADX INFO: loaded from: classes21.dex */
public final class l implements tw0.b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewController f2059b;

    public /* synthetic */ l(ViewController viewController, int i) {
        this.f2058a = i;
        this.f2059b = viewController;
    }

    @Override // tw0.b0
    public final void I1() {
        switch (this.f2058a) {
            case 0:
                com.revolut.feature.card_screen.impl.kompot.cards_list.screen.a aVar = (com.revolut.feature.card_screen.impl.kompot.cards_list.screen.a) ((CardListScreen) this.f2059b).R2();
                aVar.H2(aVar.Q, new a0(aVar, 2));
                break;
            default:
                q49.h hVar = (q49.h) ((TabsOrderSettingsScreen) this.f2059b).d();
                hVar.H2(hVar.f242091r, new q3d.i(5));
                break;
        }
    }

    @Override // tw0.b0
    public final void m1(int i, int i2) {
        Pair pair;
        switch (this.f2058a) {
            case 0:
                com.revolut.feature.card_screen.impl.kompot.cards_list.screen.a aVar = (com.revolut.feature.card_screen.impl.kompot.cards_list.screen.a) ((CardListScreen) this.f2059b).R2();
                List list = (List) ((o) ((j2) aVar.Q.f22677a).getValue()).f2064a.getContent();
                if (list != null && i >= 0) {
                    List list2 = list;
                    if (i < list2.size() && i2 >= 0 && i2 < list2.size()) {
                        List list3 = list;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it8 = list3.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(((f83.a) it8.next()).f132693a);
                        }
                        ArrayList arrayListF1 = zhm.d0.f1(arrayList);
                        arrayListF1.add(i2, (h93.f0) arrayListF1.remove(i));
                        aVar.l2(new a1a.a(aVar, arrayListF1, null, 21), new yi5.b(26));
                        break;
                    }
                }
                break;
            default:
                q49.h hVar = (q49.h) ((TabsOrderSettingsScreen) this.f2059b).d();
                cli.y yVar = hVar.f242091r;
                q49.c cVar = (q49.c) ((j2) yVar.f22677a).getValue();
                int i3 = cVar.d;
                List list4 = cVar.f242084b;
                if (i3 <= 0 || list4.size() <= i3) {
                    pair = new Pair(Integer.valueOf(i), Integer.valueOf(i2));
                } else {
                    int i5 = cVar.d;
                    int i6 = (i5 <= 0 || list4.size() <= i5) ? -1 : i5 - 1;
                    if (i != i6 && i2 != i6) {
                        if (i > i6) {
                            i--;
                        }
                        if (i2 > i6) {
                            i2--;
                        }
                        pair = new Pair(Integer.valueOf(i), Integer.valueOf(i2));
                    }
                }
                int iIntValue = ((Number) pair.f186385a).intValue();
                int iIntValue2 = ((Number) pair.f186386b).intValue();
                if (iIntValue >= 0) {
                    List list5 = list4;
                    if (iIntValue < list5.size() && iIntValue2 >= 0 && iIntValue2 < list5.size() && !((FloatingBottomBarView.Item) list4.get(iIntValue2)).d && !((FloatingBottomBarView.Item) list4.get(iIntValue)).d) {
                        ArrayList arrayListF12 = zhm.d0.f1(list4);
                        arrayListF12.add(iIntValue2, (FloatingBottomBarView.Item) arrayListF12.remove(iIntValue));
                        hVar.H2(yVar, new jeg.i(25, arrayListF12));
                        break;
                    }
                }
                break;
        }
    }
}
