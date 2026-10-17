package au0;

import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public interface t2 {
    void a(ViewGroup viewGroup);

    default void b(aw0.v1 colorScheme) {
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
    }

    void c(float f, int i);

    default void d(boolean z) {
    }

    default goi.f getNavbarMaskState() {
        return goi.d.f145165a;
    }

    void onAttachedToWindow();

    void onDetachedFromWindow();
}
