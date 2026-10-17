package ux0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.Intrinsics;
import ms0.j2;
import org.jetbrains.annotations.NotNull;
import tx0.u2;
import tx0.x2;

/* JADX INFO: loaded from: classes20.dex */
public abstract class t0 extends ConstraintLayout implements c1, j2, x2 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public abstract /* bridge */ ViewGroup.LayoutParams N(Context context);

    public abstract /* bridge */ void d0(int i);

    public abstract efm.r f0();

    public abstract efm.r g0();

    public abstract /* synthetic */ View getActionsForTransition();

    public abstract int getDisclaimerHeightForTransition();

    public abstract efm.r h0();

    public abstract /* synthetic */ void setBackgroundOffset(int i);

    public abstract /* synthetic */ void setColorSchemeListener(@NotNull u2 u2Var);

    public abstract void setModel(@NotNull u0 u0Var) throws IllegalStateException;

    public abstract void setStoriesAlpha(float f);
}
