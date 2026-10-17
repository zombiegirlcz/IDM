package ip0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.internal.drawables.AnimatedBorderGradientDrawable;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class oh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f165664a = zhm.u.c(new Color.Solid(R$attr.uikit_colorGroupedBackground_20));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f165665b = zhm.v.k(new Color.Solid(R$attr.uikit_colorForeground_10), new Color.Solid(R$attr.uikit_colorForeground_5));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List f165666c = zhm.v.k(new Color.ModifiedColor(new Color.Solid(R$attr.uikit_colorForeground), 0.25f), new Color.ModifiedColor(new Color.Solid(R$attr.uikit_colorForeground), BitmapDescriptorFactory.HUE_RED), new Color.ModifiedColor(new Color.Solid(R$attr.uikit_colorForeground), BitmapDescriptorFactory.HUE_RED), new Color.ModifiedColor(new Color.Solid(R$attr.uikit_colorForeground), 0.25f));

    private oh0() {
    }

    public static void a(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Context context2 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        float fL = kli.a.l(context2, qv0.h.EXTRA_LARGE.a());
        float fA = r6.b.a(view, "getContext(...)", 1.0f);
        GradientDrawable gradientDrawableK = v7.k(0);
        gradientDrawableK.setColor(io0.a.c(context, (Color) zhm.d0.K0(f165664a)));
        gradientDrawableK.setCornerRadius(fL);
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        List list = f165665b;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(Integer.valueOf(io0.a.c(context, (Color) it8.next())));
        }
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, zhm.d0.c1(arrayList));
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(fL);
        List list2 = f165666c;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
        Iterator it9 = list2.iterator();
        while (it9.hasNext()) {
            arrayList2.add(Integer.valueOf(io0.a.c(context, (Color) it9.next())));
        }
        view.setBackground(new LayerDrawable(new Drawable[]{gradientDrawableK, gradientDrawable, new AnimatedBorderGradientDrawable(zhm.d0.c1(arrayList2), new dr0.r(fL, fA))}));
    }

    public static AnimatedBorderGradientDrawable b(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof AnimatedBorderGradientDrawable) {
            return (AnimatedBorderGradientDrawable) drawable;
        }
        if (!(drawable instanceof LayerDrawable)) {
            return null;
        }
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        int numberOfLayers = layerDrawable.getNumberOfLayers();
        for (int i = 0; i < numberOfLayers; i++) {
            AnimatedBorderGradientDrawable animatedBorderGradientDrawableB = b(layerDrawable.getDrawable(i));
            if (animatedBorderGradientDrawableB != null) {
                return animatedBorderGradientDrawableB;
            }
        }
        return null;
    }
}
