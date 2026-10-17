package es0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.internal.drawables.RoundedBackgroundDrawable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class l {
    private l() {
    }

    public static fp0.p a(FrameLayout view, Color.Solid contentColor, Color.Solid backgroundColor, int i) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(contentColor, "contentColor");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        fp0.m mVar = fp0.p.Companion;
        Drawable background = view.getBackground();
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        RoundedBackgroundDrawable roundedBackgroundDrawable = new RoundedBackgroundDrawable(context, -16777216, 4);
        roundedBackgroundDrawable.f(i);
        Unit unit = Unit.f186387a;
        gp0.h hVar = new gp0.h(new hp0.c(background, roundedBackgroundDrawable), new gp0.f((gp0.c) null, 3), new fp0.d(contentColor, backgroundColor, false));
        mVar.getClass();
        return fp0.m.a(view, hVar);
    }
}
