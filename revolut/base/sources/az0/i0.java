package az0;

import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.drawable.DrawableCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.drawables.ScaledDrawable;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.delegates.ScalableLayerDrawable;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class i0 implements yy0.d {
    public static ScalableLayerDrawable g(LayeredImage image, Context context) {
        Integer numValueOf;
        Drawable drawableMutate;
        Drawable drawableWrap;
        Drawable drawable;
        Drawable drawableWrap2;
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(context, "context");
        List list = image.f59937a;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (true) {
            Integer numValueOf2 = null;
            h0Var = null;
            h0Var = null;
            h0Var = null;
            Drawable h0Var = null;
            if (!it8.hasNext()) {
                int i = 0;
                Drawable[] drawableArr = (Drawable[]) zhm.d0.Z(arrayList).toArray(new Drawable[0]);
                Float f = image.f59938b;
                if (f != null) {
                    float fFloatValue = f.floatValue();
                    numValueOf = Integer.valueOf(fFloatValue < BitmapDescriptorFactory.HUE_RED ? -1 : kli.a.k(context, fFloatValue));
                } else {
                    numValueOf = null;
                }
                Float f4 = image.f59939c;
                if (f4 != null) {
                    float fFloatValue2 = f4.floatValue();
                    numValueOf2 = Integer.valueOf(fFloatValue2 >= BitmapDescriptorFactory.HUE_RED ? kli.a.k(context, fFloatValue2) : -1);
                }
                ScalableLayerDrawable scalableLayerDrawable = new ScalableLayerDrawable(drawableArr, numValueOf, numValueOf2);
                int iJ = zhm.v.j(arrayList);
                if (iJ >= 0) {
                    int i2 = 0;
                    while (i2 < scalableLayerDrawable.getNumberOfLayers()) {
                        LayeredImage.Layer layer = (LayeredImage.Layer) image.f59937a.get(i);
                        if (arrayList.get(i) != null) {
                            scalableLayerDrawable.setLayerInset(i2, kli.a.k(context, layer.getE()), kli.a.k(context, layer.getF59950g()), kli.a.k(context, layer.getF()), kli.a.k(context, layer.getF59951h()));
                            i2++;
                        }
                        if (i == iJ) {
                            break;
                        }
                        i++;
                    }
                }
                return scalableLayerDrawable;
            }
            LayeredImage.Layer layer2 = (LayeredImage.Layer) it8.next();
            if (layer2 instanceof LayeredImage.Layer.Drawable) {
                LayeredImage.Layer.Drawable drawable2 = (LayeredImage.Layer.Drawable) layer2;
                Drawable drawable3 = AppCompatResources.getDrawable(context, drawable2.f59940a);
                drawableMutate = (drawable3 == null || (drawableWrap2 = DrawableCompat.wrap(drawable3)) == null) ? null : drawableWrap2.mutate();
                if (drawableMutate != null) {
                    Color color = drawable2.f59941b;
                    Integer numValueOf3 = color != null ? Integer.valueOf(io0.a.c(context, color)) : null;
                    if (numValueOf3 != null) {
                        DrawableCompat.setTint(drawableMutate, numValueOf3.intValue());
                    }
                    h0Var = drawableMutate;
                }
            } else if (layer2 instanceof LayeredImage.Layer.InvertedDrawable) {
                LayeredImage.Layer.InvertedDrawable invertedDrawable = (LayeredImage.Layer.InvertedDrawable) layer2;
                Drawable drawable4 = context.getDrawable(invertedDrawable.getF59947a());
                if (drawable4 != null && (drawable = context.getDrawable(invertedDrawable.getF59948b())) != null) {
                    Color d = invertedDrawable.getD();
                    h0Var = new h0(drawable4, drawable, d != null ? io0.a.c(context, d) : kli.a.s(R$attr.uikit_colorForeground, context), kli.a.k(context, invertedDrawable.getF59949c()));
                }
            } else {
                if (!(layer2 instanceof LayeredImage.Layer.GrayedOutDrawable)) {
                    throw new NoWhenBranchMatchedException();
                }
                Drawable drawable5 = AppCompatResources.getDrawable(context, ((LayeredImage.Layer.GrayedOutDrawable) layer2).getF59944a());
                drawableMutate = (drawable5 == null || (drawableWrap = DrawableCompat.wrap(drawable5)) == null) ? null : drawableWrap.mutate();
                if (drawableMutate != null) {
                    ColorMatrix colorMatrix = new ColorMatrix();
                    colorMatrix.setSaturation(BitmapDescriptorFactory.HUE_RED);
                    drawableMutate.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                    h0Var = drawableMutate;
                }
            }
            com.revolut.core.ui_kit_core.displayers.image.models.c i3 = layer2.getI();
            if (h0Var != null && i3 != null && h0Var.getIntrinsicHeight() != -1 && h0Var.getIntrinsicWidth() != -1) {
                h0Var = new ScaledDrawable(h0Var, i3);
            }
            arrayList.add(h0Var);
        }
    }

    @Override // yy0.d
    public final void a(Image image, ImageView to6, Function1 function1, Function0 function0) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(to6, "to");
        if (image instanceof LayeredImage) {
            Context context = to6.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ScalableLayerDrawable scalableLayerDrawableG = g((LayeredImage) image, context);
            to6.setImageDrawable(scalableLayerDrawableG);
            if (function1 != null) {
                function1.invoke(scalableLayerDrawableG);
            }
        }
    }

    @Override // yy0.d
    public final void b(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
    }

    @Override // yy0.d
    public final boolean e(Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        return image instanceof LayeredImage;
    }

    @Override // yy0.d
    public final void f(Image image, Context context, int i, int i2, v1.m mVar, a3l.b bVar) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(context, "context");
        if (image instanceof LayeredImage) {
            ScalableLayerDrawable scalableLayerDrawableG = g((LayeredImage) image, context);
            scalableLayerDrawableG.setBounds(0, 0, i, i2);
            if (mVar != null) {
                mVar.invoke(scalableLayerDrawableG);
            }
        }
    }
}
