package dr0;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RectShape;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.click.animator.ripple.StateListRippleDrawable;
import com.revolut.core.ui_kit.click.animator.ripple.UIKitRippleDrawable;
import com.revolut.core.ui_kit.internal.drawables.DashedStrokeRectangleDrawable;
import com.revolut.core.ui_kit_resources.R$attr;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f117054a = new l();

    private l() {
    }

    public static DashedStrokeRectangleDrawable a(Context context, int i, float f) {
        float fK = kli.a.k(context, 1.0f);
        float fK2 = kli.a.k(context, 6.0f);
        float fK3 = kli.a.k(context, 6.0f);
        Intrinsics.checkNotNullParameter(context, "context");
        return new DashedStrokeRectangleDrawable(fK, fK2, fK3, f, i);
    }

    public static GradientDrawable c(Context context, Color color) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(color, "color");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(io0.a.c(context, color));
        return gradientDrawable;
    }

    public static ShapeDrawable d(int i) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.getPaint().setColor(i);
        return shapeDrawable;
    }

    public static UIKitRippleDrawable e(Context context, Color color, Drawable drawable, Drawable drawable2, int i) {
        Drawable drawable3 = (i & 4) != 0 ? null : drawable;
        Drawable drawable4 = (i & 16) != 0 ? null : drawable2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(color, "color");
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(io0.a.c(context, color));
        Intrinsics.checkNotNullExpressionValue(colorStateListValueOf, "valueOf(...)");
        return new UIKitRippleDrawable(context, colorStateListValueOf, drawable3, drawable4, (Integer) null);
    }

    public static UIKitRippleDrawable f(Context context, fp0.i surface, Drawable drawable, Integer num, Drawable drawable2, int i) {
        if ((i & 4) != 0) {
            drawable = null;
        }
        if ((i & 8) != 0) {
            num = null;
        }
        if ((i & 16) != 0) {
            drawable2 = null;
        }
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(surface, "surface");
        return new UIKitRippleDrawable(context, surface, drawable, drawable2, num);
    }

    public static GradientDrawable g(Context context, float f, float f4, float f5, float f6, Color color, int i, Color color2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(color, "color");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        if (f == f4 && f == f5 && f == f6) {
            gradientDrawable.setCornerRadius(f);
        } else {
            gradientDrawable.setCornerRadii(new float[]{f, f, f4, f4, f5, f5, f6, f6});
        }
        gradientDrawable.setColor(io0.a.c(context, color));
        if (i != 0 && color2 != null) {
            gradientDrawable.setStroke(i, io0.a.c(context, color2));
        }
        return gradientDrawable;
    }

    public static GradientDrawable h(Context context, float f, Color color, int i, Color color2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(color, "color");
        float fK = kli.a.k(context, f);
        return g(context, fK, fK, fK, fK, color, i, color2);
    }

    public static /* synthetic */ GradientDrawable i(Context context, float f, float f4, float f5, float f6, Color color, int i) {
        return g(context, (i & 2) != 0 ? 0.0f : f, (i & 4) != 0 ? 0.0f : f4, (i & 8) != 0 ? 0.0f : f5, (i & 16) != 0 ? 0.0f : f6, color, 0, null);
    }

    public static StateListDrawable j(l lVar, Drawable drawable, GradientDrawable gradientDrawable, GradientDrawable gradientDrawable2, GradientDrawable gradientDrawable3, int i) {
        if ((i & 4) != 0) {
            gradientDrawable = null;
        }
        if ((i & 8) != 0) {
            gradientDrawable2 = null;
        }
        if ((i & 16) != 0) {
            gradientDrawable3 = null;
        }
        int i2 = (i & 64) != 0 ? 0 : 300;
        int i3 = (i & 128) != 0 ? 0 : 300;
        Intrinsics.checkNotNullParameter(drawable, "default");
        StateListDrawable stateListDrawable = new StateListDrawable();
        if (gradientDrawable != null) {
            stateListDrawable.addState(new int[]{-16842910}, gradientDrawable);
        }
        if (gradientDrawable2 != null) {
            stateListDrawable.addState(new int[]{R.attr.state_selected}, gradientDrawable2);
        }
        if (gradientDrawable3 != null) {
            stateListDrawable.addState(new int[]{R.attr.state_activated}, gradientDrawable3);
        }
        stateListDrawable.addState(new int[0], drawable);
        stateListDrawable.setEnterFadeDuration(i2);
        stateListDrawable.setExitFadeDuration(i3);
        return stateListDrawable;
    }

    public static StateListRippleDrawable k(hp0.a aVar, Drawable drawable, Drawable drawable2, int i) {
        if ((i & 4) != 0) {
            drawable2 = null;
        }
        Intrinsics.checkNotNullParameter(aVar, "default");
        return new StateListRippleDrawable(aVar, drawable, drawable2, null);
    }

    public final StateListDrawable b(Context context, float f, float f4) {
        Intrinsics.checkNotNullParameter(context, "context");
        float fK = kli.a.k(context, f);
        float fK2 = kli.a.k(context, f4);
        return j(this, i(context, fK, fK, fK2, fK2, new Color.Solid(R$attr.uikit_colorSearchBackground), 192), null, null, i(context, fK, fK, fK2, fK2, new Color.Solid(R$attr.uikit_colorInputError), 192), Constants.TAG_EE_SUPPORTED_RPC_ID_LIST);
    }
}
