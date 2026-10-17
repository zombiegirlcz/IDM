package hsk;

import androidx.viewpager.widget.ViewPager;
import com.revolut.retail.feature.stockdetails.impl.ui.activities.stats.DetailedStatsActivity;
import zhm.d0;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends ViewPager.SimpleOnPageChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DetailedStatsActivity f155071a;

    public b(DetailedStatsActivity detailedStatsActivity) {
        this.f155071a = detailedStatsActivity;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageSelected(int i) {
        DetailedStatsActivity detailedStatsActivity = this.f155071a;
        i iVar = (i) d0.e0(i, detailedStatsActivity.f103811x0);
        if (iVar != null) {
            detailedStatsActivity.y0.onNext(iVar);
        }
    }
}
