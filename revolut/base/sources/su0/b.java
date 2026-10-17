package su0;

import android.content.Context;
import androidx.viewpager2.widget.ViewPager2;
import com.revolut.core.ui_kit.internal.views.swipeablecards.SwipeableCardViewPager;
import ihm.f;
import jh.d;
import mx0.dc;

/* JADX INFO: loaded from: classes19.dex */
public final class b extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f265628a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SwipeableCardViewPager f265629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f265630c;

    public b(SwipeableCardViewPager swipeableCardViewPager, Context context) {
        this.f265629b = swipeableCardViewPager;
        this.f265630c = context;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i) {
        int i2;
        SwipeableCardViewPager swipeableCardViewPager = this.f265629b;
        f fVar = swipeableCardViewPager.e;
        int i3 = this.f265628a;
        fVar.onNext(new dc(i3, i, (i3 < 0 || i3 > swipeableCardViewPager.getAdapter().getItemCount()) ? null : swipeableCardViewPager.getAdapter().a(this.f265628a), swipeableCardViewPager.getAdapter().a(i), swipeableCardViewPager.getAdapter().getItemCount()));
        if (i != -1 && i != (i2 = this.f265628a) && i2 != -1) {
            d.f(this.f265630c).n0().i(swipeableCardViewPager, String.valueOf(i));
        }
        this.f265628a = i;
    }
}
