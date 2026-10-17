package ts0;

import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import aw0.h4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f273856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f273857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f273858c;
    public h4 d;

    public b0(ConstraintLayout container, TextView nameView, TextView percentView) {
        h4 appliedPlacement = h4.LABEL_THEN_PERCENT;
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(nameView, "nameView");
        Intrinsics.checkNotNullParameter(percentView, "percentView");
        Intrinsics.checkNotNullParameter(appliedPlacement, "appliedPlacement");
        this.f273856a = container;
        this.f273857b = nameView;
        this.f273858c = percentView;
        this.d = appliedPlacement;
    }
}
