package po0;

import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import com.revolut.core.ui_kit.background.StatefulAnimatedBackground;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class y extends WindowInsetsAnimationCompat.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ StatefulAnimatedBackground f237871a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(StatefulAnimatedBackground statefulAnimatedBackground) {
        super(1);
        this.f237871a = statefulAnimatedBackground;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public final WindowInsetsCompat onProgress(WindowInsetsCompat insets, List runningAnimations) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        Intrinsics.checkNotNullParameter(runningAnimations, "runningAnimations");
        this.f237871a.setTranslationY(-insets.getInsets(WindowInsetsCompat.Type.ime()).bottom);
        return insets;
    }
}
