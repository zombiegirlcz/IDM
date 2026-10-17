package au0;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.internal.views.navbar.CollapsingAppBarLayout$Behavior;
import com.revolut.core.ui_kit.internal.views.navbar.HeaderWithBigTileLayout;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainer;
import com.revolut.core.ui_kit.views.slider_layout.SliderLayout;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class m1 implements View.OnLayoutChangeListener, ix0.a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f9270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9271c;
    public final /* synthetic */ Object d;

    public /* synthetic */ m1(View view, Object obj2, Object obj3, int i) {
        this.f9269a = i;
        this.f9270b = view;
        this.f9271c = obj2;
        this.d = obj3;
    }

    @Override // ix0.a2
    public final void cancel() {
        switch (this.f9269a) {
            case 0:
                this.f9270b.removeOnLayoutChangeListener(this);
                break;
            case 1:
                ((o) this.f9270b).removeOnLayoutChangeListener(this);
                break;
            case 2:
                this.f9270b.removeOnLayoutChangeListener(this);
                break;
            case 3:
                this.f9270b.removeOnLayoutChangeListener(this);
                break;
            case 4:
                this.f9270b.removeOnLayoutChangeListener(this);
                break;
            case 5:
                this.f9270b.removeOnLayoutChangeListener(this);
                break;
            default:
                this.f9270b.removeOnLayoutChangeListener(this);
                break;
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i5, int i6, int i21, int i22, int i32) {
        switch (this.f9269a) {
            case 0:
                Intrinsics.checkNotNullParameter(view, "view");
                if (((HeaderWithBigTileLayout) this.f9271c).L == m0.BOTTOM_BLUR) {
                    kp0.w0.b(view, zhm.u.c(new qo0.e(BitmapDescriptorFactory.HUE_RED, 100.0f, (int) (view.getHeight() * 0.6f), Integer.MAX_VALUE)), (j70.a) this.d);
                    break;
                }
                break;
            case 1:
                Intrinsics.checkNotNullParameter(view, "view");
                view.removeOnLayoutChangeListener(this);
                ((u2) this.f9271c).f((v2) this.d);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(view, "view");
                view.removeOnLayoutChangeListener(this);
                ((SliderLayout) this.f9271c).v = null;
                SliderLayout sliderLayout = (SliderLayout) this.d;
                if (sliderLayout.getAbsoluteTransitionProgress() >= 0.25f) {
                    sliderLayout.settleSlideView(SliderLayout.f(sliderLayout));
                } else {
                    sliderLayout.settleSlideView(SliderLayout.h(sliderLayout));
                }
                break;
            case 3:
                Intrinsics.checkNotNullParameter(view, "view");
                view.removeOnLayoutChangeListener(this);
                ((lji.c) this.f9271c).d.setImageDrawable((Drawable) ((Lazy) this.d).getValue());
                break;
            case 4:
                Intrinsics.checkNotNullParameter(view, "view");
                view.removeOnLayoutChangeListener(this);
                ((tx0.e4) this.f9271c).d(((NestedScrollView) this.d).getScrollY());
                break;
            case 5:
                Intrinsics.checkNotNullParameter(view, "view");
                view.removeOnLayoutChangeListener(this);
                ((tx0.e4) this.f9271c).d(((RecyclerView) this.d).computeVerticalScrollOffset());
                break;
            default:
                Intrinsics.checkNotNullParameter(view, "view");
                view.removeOnLayoutChangeListener(this);
                NavBarWithContainer navBarWithContainer = (NavBarWithContainer) this.f9271c;
                ux0.s0 s0Var = (ux0.s0) this.d;
                int height = s0Var.getProductIntroContentView().getHeight() - s0Var.getAccountsSelectionView().getHeight();
                CollapsingAppBarLayout$Behavior currentBehaviourOrNull$ui_kit_components_release = navBarWithContainer.getCurrentBehaviourOrNull$ui_kit_components_release();
                int i33 = 0;
                if (currentBehaviourOrNull$ui_kit_components_release != null) {
                    if (height >= 0) {
                        height = 0;
                    }
                    currentBehaviourOrNull$ui_kit_components_release.setTopAndBottomOffset(height);
                    i33 = height;
                }
                s0Var.getProductIntroContentView().setTranslationY(Math.abs(i33));
                break;
        }
    }
}
