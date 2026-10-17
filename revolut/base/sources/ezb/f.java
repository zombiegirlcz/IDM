package ezb;

import androidx.viewpager2.widget.ViewPager2;
import com.revolut.feature.rev_points.impl.ui.challenges.home.RevPointsChallengesHomeScreen;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RevPointsChallengesHomeScreen f130922a;

    public f(RevPointsChallengesHomeScreen revPointsChallengesHomeScreen) {
        this.f130922a = revPointsChallengesHomeScreen;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i) {
        com.revolut.feature.rev_points.impl.ui.challenges.home.b bVar = (com.revolut.feature.rev_points.impl.ui.challenges.home.b) this.f130922a.d();
        bVar.H2(bVar.v, new a5g.i(i, 14));
    }
}
