package dy0;

import android.view.View;
import com.revolut.core.ui_kit.views.slider_layout.SliderLayout;
import com.revolut.core.ui_kit_core.displayers.haptic.Haptic;

/* JADX INFO: loaded from: classes20.dex */
public final class u implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SliderLayout f121026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f121027b;

    public u(SliderLayout sliderLayout, boolean z) {
        this.f121026a = sliderLayout;
        this.f121027b = z;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i5, int i6, int i21, int i22, int i32) {
        view.removeOnLayoutChangeListener(this);
        SliderLayout.a aVar = SliderLayout.Companion;
        SliderLayout sliderLayout = this.f121026a;
        if (sliderLayout.H().f120995c && this.f121027b) {
            ((com.revolut.core.ui_kit_core.displayers.haptic.b) or0.u.k(sliderLayout).Y()).a(new Haptic.Effect(com.revolut.core.ui_kit_core.displayers.haptic.c.SHORT, true));
        }
        sliderLayout.K().d(view, sliderLayout, sliderLayout.getNextState());
    }
}
