package ueg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.feature.travel.hotels.api.R$string;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.TravelHotelsSearchResultsMapScreen;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes9.dex */
public final class l extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f279400a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f279401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TravelHotelsSearchResultsMapScreen f279402c;

    public l(FrameLayout frameLayout, TravelHotelsSearchResultsMapScreen travelHotelsSearchResultsMapScreen) {
        this.f279401b = frameLayout;
        this.f279402c = travelHotelsSearchResultsMapScreen;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animation, boolean z) {
        switch (this.f279400a) {
            case 1:
                Intrinsics.checkNotNullParameter(animation, "animation");
                KProperty[] kPropertyArr = TravelHotelsSearchResultsMapScreen.p0;
                this.f279402c.i3().f22443m.setTitle(new TextLocalisedClause(R$string.hotels_search_header_title, null, null, 14));
                break;
            default:
                super.onAnimationEnd(animation, z);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animation) {
        switch (this.f279400a) {
            case 1:
                Intrinsics.checkNotNullParameter(animation, "animation");
                this.f279401b.setVisibility(0);
                break;
            default:
                super.onAnimationStart(animation);
                break;
        }
    }

    public l(TravelHotelsSearchResultsMapScreen travelHotelsSearchResultsMapScreen, FrameLayout frameLayout) {
        this.f279402c = travelHotelsSearchResultsMapScreen;
        this.f279401b = frameLayout;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animation, boolean z) {
        switch (this.f279400a) {
            case 0:
                Intrinsics.checkNotNullParameter(animation, "animation");
                KProperty[] kPropertyArr = TravelHotelsSearchResultsMapScreen.p0;
                BasicNavBar basicNavBar = this.f279402c.i3().f22443m;
                m70.a.c(kotlin.jvm.internal.t0.f186434a);
                basicNavBar.setTitle(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
                break;
            default:
                super.onAnimationStart(animation, z);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animation) {
        switch (this.f279400a) {
            case 0:
                Intrinsics.checkNotNullParameter(animation, "animation");
                this.f279401b.setVisibility(8);
                break;
            default:
                super.onAnimationEnd(animation);
                break;
        }
    }
}
