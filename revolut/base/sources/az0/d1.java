package az0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.ContextCompat;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.drawables.GradientTintDrawable;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class d1 implements yy0.d {
    public static Drawable g(ResourceImage resourceImage, Context context) {
        Drawable drawable;
        Drawable drawableMutate;
        Drawable drawableMutate2;
        Drawable drawableA = null;
        try {
            drawable = AppCompatResources.getDrawable(context, resourceImage.f59995a);
        } catch (Resources.NotFoundException e) {
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
            drawable = null;
        }
        Integer num = resourceImage.d;
        Integer num2 = resourceImage.f59997c;
        Integer num3 = resourceImage.f59996b;
        List list = resourceImage.e;
        if (num3 != null || num2 != null || num != null || list != null) {
            if (list != null) {
                List list2 = list;
                ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    arrayList.add(Integer.valueOf(kli.a.s(((Number) it8.next()).intValue(), context)));
                }
                int[] iArrC1 = zhm.d0.c1(arrayList);
                if (drawable != null && (drawableMutate2 = drawable.mutate()) != null) {
                    GradientTintDrawable.INSTANCE.getClass();
                    drawableA = GradientTintDrawable.Companion.a(drawableMutate2, iArrC1);
                }
            } else if (num != null) {
                int iS = kli.a.s(num.intValue(), context);
                if (drawable != null && (drawableMutate = drawable.mutate()) != null) {
                    drawableMutate.setTint(iS);
                    drawableA = drawableMutate;
                }
            } else if (num3 != null) {
                int color = ContextCompat.getColor(context, num3.intValue());
                if (drawable != null && (drawableMutate = drawable.mutate()) != null) {
                    drawableMutate.setTint(color);
                    drawableA = drawableMutate;
                }
            } else {
                if (num2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                int iIntValue = num2.intValue();
                if (drawable != null && (drawableMutate = drawable.mutate()) != null) {
                    drawableMutate.setTint(iIntValue);
                    drawableA = drawableMutate;
                }
            }
            drawable = drawableA;
        }
        if ((drawable instanceof AnimatedVectorDrawable) && resourceImage.f) {
            ((AnimatedVectorDrawable) drawable).start();
        }
        return drawable;
    }

    @Override // yy0.d
    public final void a(Image originalImage, ImageView to6, Function1 function1, Function0 function0) {
        List list;
        Intrinsics.checkNotNullParameter(originalImage, "originalImage");
        Intrinsics.checkNotNullParameter(to6, "to");
        if (!(originalImage instanceof ResourceImage)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        ResourceImage resourceImageA = b01.b.a((ResourceImage) originalImage, to6);
        gz0.b bVar = resourceImageA.f59998g.d;
        if (bVar == gz0.b.CenterInside || bVar == null) {
            to6.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        }
        Context context = to6.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Drawable drawableG = g(resourceImageA, context);
        Context context2 = to6.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        List listJ = te0.w.J(resourceImageA, context2);
        c8.o[] oVarArr = (listJ == null || (list = (List) ue0.e.M(te0.w.C0(listJ))) == null) ? null : (c8.o[]) list.toArray(new c8.o[0]);
        if (oVarArr == null) {
            to6.setImageDrawable(drawableG);
            if (function1 != null) {
                function1.invoke(drawableG);
                return;
            }
            return;
        }
        com.bumptech.glide.j jVarQ = com.bumptech.glide.b.d(to6.getContext()).q(drawableG);
        u8.h hVar = new u8.h();
        hVar.L((c8.o[]) Arrays.copyOf(oVarArr, oVarArr.length));
        com.bumptech.glide.j jVarA = jVarQ.a(hVar);
        Intrinsics.checkNotNullExpressionValue(jVarA, "apply(...)");
        v04.b.b(jVarA, function1, function0).R(to6);
    }

    @Override // yy0.d
    public final void b(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        com.bumptech.glide.n nVarD = com.bumptech.glide.b.d(imageView.getContext());
        nVarD.getClass();
        a0.d.z(imageView, nVarD);
    }

    @Override // yy0.d
    public final Clause c(Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        Clause d = image.getD();
        if (d != null) {
            return d;
        }
        oy0.a aVar = oy0.a.f230869a;
        return oy0.a.f(((ResourceImage) image).f59995a);
    }

    @Override // yy0.d
    public final boolean e(Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        return image instanceof ResourceImage;
    }

    @Override // yy0.d
    public final void f(Image image, Context context, int i, int i2, v1.m mVar, a3l.b bVar) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(context, "context");
        Drawable drawableG = g((ResourceImage) image, context);
        if (te0.w.K((gz0.c) image, context) != null) {
            Intrinsics.checkNotNullExpressionValue("ResourceImage", "getSimpleName(...)");
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.b(rd0.c.WARNING, "ResourceImage", "Glide transformations not implemented for render drawables", null, null, 16);
        }
        if (drawableG != null) {
            drawableG.setBounds(0, 0, i, i2);
        }
        if (mVar != null) {
            mVar.invoke(drawableG);
        }
    }
}
