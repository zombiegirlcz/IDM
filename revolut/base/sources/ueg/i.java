package ueg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.TravelHotelsSearchResultsMapScreen;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes9.dex */
public final class i extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f279390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TravelHotelsSearchResultsMapScreen f279391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f279392c;

    public /* synthetic */ i(TravelHotelsSearchResultsMapScreen travelHotelsSearchResultsMapScreen, ViewGroup viewGroup, int i) {
        this.f279390a = i;
        this.f279391b = travelHotelsSearchResultsMapScreen;
        this.f279392c = viewGroup;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animation, boolean z) {
        switch (this.f279390a) {
            case 1:
                Intrinsics.checkNotNullParameter(animation, "animation");
                KProperty[] kPropertyArr = TravelHotelsSearchResultsMapScreen.p0;
                TravelHotelsSearchResultsMapScreen travelHotelsSearchResultsMapScreen = this.f279391b;
                travelHotelsSearchResultsMapScreen.m3().postDelayed(new t70.x(travelHotelsSearchResultsMapScreen, 16), 500L);
                break;
            default:
                super.onAnimationEnd(animation, z);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation, boolean z) {
        int i = this.f279390a;
        TravelHotelsSearchResultsMapScreen travelHotelsSearchResultsMapScreen = this.f279391b;
        Intrinsics.checkNotNullParameter(animation, "animation");
        switch (i) {
            case 0:
                KProperty[] kPropertyArr = TravelHotelsSearchResultsMapScreen.p0;
                travelHotelsSearchResultsMapScreen.m3().removeOnScrollListener(travelHotelsSearchResultsMapScreen.j0);
                break;
            default:
                KProperty[] kPropertyArr2 = TravelHotelsSearchResultsMapScreen.p0;
                travelHotelsSearchResultsMapScreen.m3().removeOnScrollListener(travelHotelsSearchResultsMapScreen.j0);
                this.f279392c.setVisibility(0);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animation) {
        switch (this.f279390a) {
            case 0:
                Intrinsics.checkNotNullParameter(animation, "animation");
                this.f279392c.setVisibility(8);
                KProperty[] kPropertyArr = TravelHotelsSearchResultsMapScreen.p0;
                TravelHotelsSearchResultsMapScreen travelHotelsSearchResultsMapScreen = this.f279391b;
                travelHotelsSearchResultsMapScreen.m3().postDelayed(new t70.x(travelHotelsSearchResultsMapScreen, 16), 500L);
                break;
            default:
                super.onAnimationEnd(animation);
                break;
        }
    }
}
