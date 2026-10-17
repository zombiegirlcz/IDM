package aw7;

import androidx.viewpager2.widget.ViewPager2;
import com.revolut.feature.insurance_embedded.impl.ui.screen.plan_comparison.PlanComparisonScreen;
import gu7.d4;
import gu7.g4;
import java.util.List;
import zhm.d0;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PlanComparisonScreen f10735a;

    public c(PlanComparisonScreen planComparisonScreen) {
        this.f10735a = planComparisonScreen;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i) {
        List list;
        d4 d4Var;
        l lVar = (l) this.f10735a.P.getValue();
        g4 g4Var = (g4) ((g) lVar.t2()).f10740b.getContent();
        if (g4Var == null || (list = g4Var.f146753a) == null || (d4Var = (d4) d0.e0(i, list)) == null) {
            return;
        }
        lVar.x2(new abf.n(d4Var, i, 2));
    }
}
