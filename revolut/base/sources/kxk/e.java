package kxk;

import androidx.viewpager2.widget.ViewPager2;
import com.revolut.retail.feature.trading_hours.impl.ui.market_hours.MarketHoursController;
import java.util.Iterator;

/* JADX INFO: loaded from: classes12.dex */
public final class e extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MarketHoursController f190598a;

    public e(MarketHoursController marketHoursController) {
        this.f190598a = marketHoursController;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i) {
        Object next;
        n nVar = (n) this.f190598a.R2();
        nVar.getClass();
        Iterator<E> it8 = j.a().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            } else {
                next = it8.next();
                if (((j) next).b() == i) {
                    break;
                }
            }
        }
        j jVar = (j) next;
        if (jVar != null) {
            nVar.H2(nVar.f190609q, new l(jVar, 0));
        }
    }
}
