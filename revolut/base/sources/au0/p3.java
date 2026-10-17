package au0;

import android.animation.ValueAnimator;
import android.content.Context;
import androidx.core.graphics.ColorUtils;
import com.onfido.android.sdk.capture.ui.widget.LoadingView;
import com.revolut.core.ui_kit.internal.views.diagram.TrendView;
import com.revolut.core.ui_kit.internal.views.navbar.NavBarWithContainerBehaviour;
import com.revolut.core.ui_kit.views.FloatingBottomBarView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainer;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class p3 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9311c;

    public /* synthetic */ p3(NavBarWithContainer navBarWithContainer, NavBarWithContainerBehaviour navBarWithContainerBehaviour, int i) {
        this.f9309a = 0;
        this.f9311c = navBarWithContainer;
        this.f9310b = i;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object obj2;
        int iS;
        Integer num;
        int i = this.f9309a;
        int i2 = this.f9310b;
        Object obj3 = this.f9311c;
        switch (i) {
            case 0:
                NavBarWithContainer navBarWithContainer = (NavBarWithContainer) obj3;
                int iIntValue = ((Integer) z9h.n.g(valueAnimator, "animation", "null cannot be cast to non-null type kotlin.Int")).intValue();
                if (navBarWithContainer.getHeaderView().messageAnimRunning) {
                    valueAnimator.cancel();
                }
                NavBarWithContainerBehaviour.h(navBarWithContainer, iIntValue, i2);
                break;
            case 1:
                bt0.q qVar = (bt0.q) obj3;
                qVar.i.put(Integer.valueOf(i2), (Integer) z9h.n.g(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Int"));
                qVar.f18244c.invalidate();
                break;
            case 2:
                LoadingView.onAttachedToWindow$lambda$5$lambda$4((LoadingView) obj3, i2, valueAnimator);
                break;
            case 3:
                TrendView trendView = (TrendView) obj3;
                TrendView.Companion companion = TrendView.INSTANCE;
                trendView.f56875a0.set(i2, ((Float) z9h.n.g(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue());
                trendView.chartDirty = true;
                trendView.invalidate();
                break;
            default:
                wp0.e eVar = (wp0.e) obj3;
                float fFloatValue = ((Float) z9h.n.g(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                eVar.d.setAlpha(fFloatValue);
                ms0.p pVar = eVar.f;
                if (pVar != null) {
                    pVar.setAlpha(1 - fFloatValue);
                }
                FloatingBottomBarView floatingBottomBarView = eVar.e;
                ArrayDeque arrayDeque = floatingBottomBarView.f;
                int size = arrayDeque.size();
                int i3 = 0;
                while (true) {
                    if (i3 < size) {
                        obj2 = arrayDeque.get(i3);
                        if (((FloatingBottomBarView.a) obj2).f58592b) {
                            i3++;
                        }
                    } else {
                        obj2 = null;
                    }
                }
                FloatingBottomBarView.a aVar = (FloatingBottomBarView.a) obj2;
                if (aVar == null || (num = aVar.f58591a) == null) {
                    Context context = floatingBottomBarView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    iS = kli.a.s(R$attr.uikit_colorElevatedBackground, context);
                } else {
                    iS = num.intValue();
                }
                eVar.f298999g.a(ColorUtils.blendARGB(i2, iS, fFloatValue));
                break;
        }
    }

    public /* synthetic */ p3(Object obj2, int i, int i2) {
        this.f9309a = i2;
        this.f9311c = obj2;
        this.f9310b = i;
    }
}
