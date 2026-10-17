package dy0;

import android.view.View;
import com.revolut.core.ui_kit.views.slider_layout.SliderLayout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public interface m0 {

    @NotNull
    public static final c0 Companion = c0.f120964a;

    void a(View view, SliderLayout sliderLayout, r rVar);

    default void b(View view, SliderLayout parent, float f) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
    }

    void c(View view, SliderLayout sliderLayout, float f);

    void d(View view, SliderLayout sliderLayout, r rVar);

    void e(View view, SliderLayout sliderLayout, float f);

    i0 getConfig();
}
