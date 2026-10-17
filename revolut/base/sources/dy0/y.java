package dy0;

import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.views.slider_layout.SliderLayout;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class y implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f121033a;

    public y(i0 config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f121033a = config;
    }

    @Override // dy0.m0
    public final void a(View view, SliderLayout parent, r state) {
        float f;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        int i = x.f121032a[state.ordinal()];
        if (i == 1) {
            f = BitmapDescriptorFactory.HUE_RED;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f = 1.0f;
        }
        view.setAlpha(f);
    }

    @Override // dy0.m0
    public final void c(View view, SliderLayout parent, float f) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
    }

    @Override // dy0.m0
    public final void d(View view, SliderLayout parent, r targetState) {
        float f;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(targetState, "targetState");
        int i = x.f121032a[targetState.ordinal()];
        if (i == 1) {
            f = 1.0f;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f = BitmapDescriptorFactory.HUE_RED;
        }
        view.setAlpha(f);
    }

    @Override // dy0.m0
    public final void e(View view, SliderLayout parent, float f) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        view.setAlpha(f);
    }

    @Override // dy0.m0
    public final i0 getConfig() {
        return this.f121033a;
    }
}
