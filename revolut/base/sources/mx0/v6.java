package mx0;

import com.revolut.core.ui_kit.internal.drawables.BottomAnchoredGradientDrawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class v6 implements x6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u6 f210050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BottomAnchoredGradientDrawable f210051b;

    public v6(u6 bodyStyle, BottomAnchoredGradientDrawable backgroundGradient) {
        Intrinsics.checkNotNullParameter(bodyStyle, "bodyStyle");
        Intrinsics.checkNotNullParameter(backgroundGradient, "backgroundGradient");
        this.f210050a = bodyStyle;
        this.f210051b = backgroundGradient;
    }
}
