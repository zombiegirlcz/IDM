package dy0;

import android.view.View;
import com.revolut.core.ui_kit.views.slider_layout.SliderLayout;
import ix0.a2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class q implements View.OnLayoutChangeListener, a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f121009a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f121010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SliderLayout f121011c;
    public final /* synthetic */ SliderLayout d;
    public final /* synthetic */ float e;
    public final /* synthetic */ Object f;

    public q(View view, SliderLayout sliderLayout, SliderLayout sliderLayout2, float f, o oVar) {
        this.f121010b = view;
        this.f121011c = sliderLayout;
        this.d = sliderLayout2;
        this.e = f;
        this.f = oVar;
    }

    @Override // ix0.a2
    public final void cancel() {
        switch (this.f121009a) {
            case 0:
                this.f121010b.removeOnLayoutChangeListener(this);
                break;
            default:
                this.f121010b.removeOnLayoutChangeListener(this);
                break;
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i5, int i6, int i21, int i22, int i32) {
        switch (this.f121009a) {
            case 0:
                Intrinsics.checkNotNullParameter(view, "view");
                view.removeOnLayoutChangeListener(this);
                this.f121011c.v = null;
                SliderLayout sliderLayout = this.d;
                float absoluteTransitionProgress = sliderLayout.getAbsoluteTransitionProgress();
                float fH = this.e;
                if (absoluteTransitionProgress < 0.25f && Math.abs(fH) < sliderLayout.k && Math.signum(fH) == ((o) this.f).a()) {
                    fH = SliderLayout.h(sliderLayout);
                }
                sliderLayout.settleSlideView(fH);
                break;
            default:
                Intrinsics.checkNotNullParameter(view, "view");
                view.removeOnLayoutChangeListener(this);
                this.f121011c.v = null;
                this.d.S((int) com.revolut.core.ui_kit.views.slider_layout.b.a((com.revolut.core.ui_kit.views.slider_layout.b) this.f, Math.abs(this.e)));
                break;
        }
    }

    public q(View view, SliderLayout sliderLayout, SliderLayout sliderLayout2, com.revolut.core.ui_kit.views.slider_layout.b bVar, float f) {
        this.f121010b = view;
        this.f121011c = sliderLayout;
        this.d = sliderLayout2;
        this.f = bVar;
        this.e = f;
    }
}
