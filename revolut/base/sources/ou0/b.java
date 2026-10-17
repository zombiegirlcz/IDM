package ou0;

import android.view.View;
import com.revolut.core.ui_kit.internal.views.slider.LargeSliderView;
import com.revolut.core.ui_kit.internal.views.slider.RadialSliderView;
import ix0.i1;

/* JADX INFO: loaded from: classes19.dex */
public final class b extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f229754h;
    public final /* synthetic */ View i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(View view, int i) {
        super(view);
        this.f229754h = i;
        this.i = view;
    }

    @Override // ou0.a
    public final void c(float f) {
        switch (this.f229754h) {
            case 0:
                LargeSliderView largeSliderView = (LargeSliderView) this.i;
                largeSliderView.f57526p = i1.c(f, largeSliderView.e, largeSliderView.f);
                largeSliderView.f57527q = i1.c(f, largeSliderView.f57518b, largeSliderView.f57519c);
                largeSliderView.e();
                largeSliderView.d(largeSliderView.f57525n);
                largeSliderView.invalidate();
                break;
            default:
                float f4 = (f * 0.03f) + 1.0f;
                RadialSliderView radialSliderView = (RadialSliderView) this.i;
                radialSliderView.setScaleX(f4);
                radialSliderView.setScaleY(f4);
                radialSliderView.invalidate();
                break;
        }
    }
}
