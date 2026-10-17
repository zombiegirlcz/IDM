package zq0;

import android.content.Context;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.revolut.core.ui_kit.delegates.dh;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Guideline f324346a;

    public d(Guideline titleValueDividerGuideline) {
        Intrinsics.checkNotNullParameter(titleValueDividerGuideline, "titleValueDividerGuideline");
        this.f324346a = titleValueDividerGuideline;
    }

    public final void a(dh columnsWidthsMode) {
        Intrinsics.checkNotNullParameter(columnsWidthsMode, "columnsWidthsMode");
        Guideline guideline = this.f324346a;
        ViewGroup.LayoutParams layoutParams = guideline.getLayoutParams();
        Intrinsics.i(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        columnsWidthsMode.getClass();
        Context context = guideline.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iA = columnsWidthsMode.a(kli.a.k(context, 112.0f));
        if (layoutParams2.guidePercent == -1.0f && layoutParams2.guideEnd == iA) {
            return;
        }
        ViewGroup.LayoutParams layoutParams3 = guideline.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
        layoutParams4.guidePercent = -1.0f;
        layoutParams4.guideEnd = iA;
        guideline.setLayoutParams(layoutParams4);
    }
}
