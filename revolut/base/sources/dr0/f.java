package dr0;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f117050a = View.generateViewId();

    public static final void a(View view, e stroke) {
        LayerDrawable layerDrawable;
        LayerDrawable layerDrawable2;
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(stroke, "stroke");
        Drawable background = view.getBackground();
        LayerDrawable layerDrawable3 = background instanceof LayerDrawable ? (LayerDrawable) background : null;
        int i = f117050a;
        Drawable drawableFindDrawableByLayerId = layerDrawable3 != null ? layerDrawable3.findDrawableByLayerId(i) : null;
        ShapeDrawable shapeDrawable = drawableFindDrawableByLayerId instanceof ShapeDrawable ? (ShapeDrawable) drawableFindDrawableByLayerId : null;
        if (shapeDrawable != null) {
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            b(shapeDrawable, stroke, context);
            shapeDrawable.invalidateSelf();
            return;
        }
        Context context2 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        float fL = kli.a.l(context2, stroke.b());
        float[] fArr = new float[8];
        for (int i2 = 0; i2 < 8; i2++) {
            fArr[i2] = fL;
        }
        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        b(shapeDrawable2, stroke, context2);
        int strokeWidth = ((int) shapeDrawable2.getPaint().getStrokeWidth()) / 2;
        Drawable background2 = view.getBackground();
        if (background2 instanceof LayerDrawable) {
            Drawable drawableMutate = ((LayerDrawable) background2).mutate();
            Intrinsics.i(drawableMutate, "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
            layerDrawable2 = (LayerDrawable) drawableMutate;
            layerDrawable2.addLayer(shapeDrawable2);
        } else {
            if (background2 != null) {
                layerDrawable = new LayerDrawable(new Drawable[]{background2, shapeDrawable2});
                layerDrawable.setPaddingMode(1);
                int numberOfLayers = layerDrawable.getNumberOfLayers() - 1;
                layerDrawable.setId(numberOfLayers, i);
                layerDrawable.setLayerInset(numberOfLayers, strokeWidth, strokeWidth, strokeWidth, strokeWidth);
                view.setBackground(layerDrawable);
            }
            layerDrawable2 = new LayerDrawable(new ShapeDrawable[]{shapeDrawable2});
        }
        layerDrawable = layerDrawable2;
        layerDrawable.setPaddingMode(1);
        int numberOfLayers2 = layerDrawable.getNumberOfLayers() - 1;
        layerDrawable.setId(numberOfLayers2, i);
        layerDrawable.setLayerInset(numberOfLayers2, strokeWidth, strokeWidth, strokeWidth, strokeWidth);
        view.setBackground(layerDrawable);
    }

    public static final void b(ShapeDrawable shapeDrawable, e eVar, Context context) {
        shapeDrawable.getPaint().reset();
        shapeDrawable.getPaint().setAntiAlias(true);
        shapeDrawable.getPaint().setStyle(Paint.Style.STROKE);
        shapeDrawable.getPaint().setStrokeWidth(kli.a.l(context, eVar.a()));
        if (eVar instanceof d) {
            shapeDrawable.setShaderFactory(null);
            shapeDrawable.getPaint().setColor(io0.a.c(context, ((d) eVar).f117048a));
        } else {
            if (!(eVar instanceof c)) {
                throw new NoWhenBranchMatchedException();
            }
            bq0.c cVarH = tz4.d.h(((c) eVar).f117046a, context);
            shapeDrawable.setShaderFactory(cVarH);
            if (shapeDrawable.getBounds().isEmpty()) {
                return;
            }
            shapeDrawable.getPaint().setShader(cVarH.resize(shapeDrawable.getBounds().width(), shapeDrawable.getBounds().height()));
        }
    }
}
