package csk;

import androidx.viewpager.widget.ViewPager;
import com.revolut.retail.feature.stockdetails.impl.ui.activities.statements.StockFinancialsStatementsActivity;
import zhm.d0;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends ViewPager.SimpleOnPageChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ StockFinancialsStatementsActivity f108511a;

    public b(StockFinancialsStatementsActivity stockFinancialsStatementsActivity) {
        this.f108511a = stockFinancialsStatementsActivity;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageSelected(int i) {
        StockFinancialsStatementsActivity stockFinancialsStatementsActivity = this.f108511a;
        pwk.a aVar = (pwk.a) d0.e0(i, stockFinancialsStatementsActivity.z0);
        if (aVar != null) {
            stockFinancialsStatementsActivity.y0.onNext(aVar.f240486a);
        }
    }
}
