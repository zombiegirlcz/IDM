package az0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.LayerDrawable;
import android.widget.ImageView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.drawables.ShimmerImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeAppearance;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeImage;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import skm.a2;
import skm.c2;

/* JADX INFO: loaded from: classes.dex */
public final class w0 implements yy0.d {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakHashMap f11370a = new WeakHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineScope f11371b;

    public static final class a {
        private a() {
        }
    }

    public w0() {
        c1 c1Var = new c1(skm.z.f264021a, 0);
        c2 c2VarE = skm.e0.e();
        skm.p0 p0Var = skm.p0.f264001a;
        this.f11371b = skm.e0.c(kotlin.coroutines.e.d(c2VarE, zkm.o.f323119a).plus(c1Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(az0.w0 r23, android.content.Context r24, com.revolut.core.ui_kit_core.displayers.image.models.QrCodeImage r25, com.revolut.core.ui_kit_core.displayers.image.models.QrCodeAppearance.Type.Classic r26, gim.c r27) {
        /*
            Method dump skipped, instruction units count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: az0.w0.g(az0.w0, android.content.Context, com.revolut.core.ui_kit_core.displayers.image.models.QrCodeImage, com.revolut.core.ui_kit_core.displayers.image.models.QrCodeAppearance$Type$Classic, gim.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(az0.w0 r32, android.content.Context r33, com.revolut.core.ui_kit_core.displayers.image.models.QrCodeImage r34, com.revolut.core.ui_kit_core.displayers.image.models.QrCodeAppearance.Type.Rounded r35, gim.c r36) {
        /*
            Method dump skipped, instruction units count: 610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: az0.w0.h(az0.w0, android.content.Context, com.revolut.core.ui_kit_core.displayers.image.models.QrCodeImage, com.revolut.core.ui_kit_core.displayers.image.models.QrCodeAppearance$Type$Rounded, gim.c):java.lang.Object");
    }

    public static void i(QrCodeImage qrCodeImage, Context context, LayerDrawable layerDrawable) {
        QrCodeAppearance qrCodeAppearance = qrCodeImage.f59993b;
        if (qrCodeAppearance.getE() > BitmapDescriptorFactory.HUE_RED) {
            int iK = kli.a.k(context, qrCodeAppearance.getE());
            layerDrawable.setLayerInset(layerDrawable.getNumberOfLayers() - 1, iK, iK, iK, iK);
        }
    }

    public static void j(Canvas canvas, int i, int i2, float f, Paint paint, int i3) {
        float f4 = 7;
        float f5 = (5 * f) / f4;
        float f6 = (3 * f) / f4;
        paint.setColor(i3);
        k(canvas, i, i2, (int) f, paint);
        Paint paint2 = new Paint(1);
        paint2.setColor(0);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT));
        paint2.setAntiAlias(true);
        float f32 = 2;
        int i5 = (int) ((f - f5) / f32);
        k(canvas, i + i5, i5 + i2, (int) f5, paint2);
        paint.setColor(i3);
        int i6 = (int) ((f - f6) / f32);
        k(canvas, i + i6, i2 + i6, (int) f6, paint);
    }

    public static void k(Canvas canvas, int i, int i2, int i3, Paint paint) {
        RectF rectF = new RectF(new Rect(i, i2, i + i3, i2 + i3));
        float f = i3 * 0.25f;
        canvas.drawRoundRect(rectF, f, f, paint);
    }

    public static int l(QrCodeAppearance.ColorType colorType, Context context) {
        if (colorType instanceof QrCodeAppearance.ColorType.ColorAbsolute) {
            return ((QrCodeAppearance.ColorType.ColorAbsolute) colorType).getF59973a();
        }
        if (colorType instanceof QrCodeAppearance.ColorType.ColorAttr) {
            return kli.a.s(((QrCodeAppearance.ColorType.ColorAttr) colorType).getF59974a(), context);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static float n(QrCodeAppearance.Type.Rounded rounded, QrCodeImage qrCodeImage) {
        int f59987a = rounded.getF59987a();
        int f59987a2 = rounded.getF59987a();
        int[][] iArr = qrCodeImage.f59992a;
        float length = iArr.length;
        float length2 = iArr.length != 0 ? iArr[0].length : 0;
        float f = f59987a;
        if (f < length) {
            f = length;
        }
        float f4 = f59987a2;
        if (f4 < length2) {
            f4 = length2;
        }
        float f5 = f / length;
        float f6 = f4 / length2;
        return f5 > f6 ? f6 : f5;
    }

    @Override // yy0.d
    public final void a(Image image, ImageView to6, Function1 function1, Function0 function0) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(to6, "to");
        Context context = to6.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        o((QrCodeImage) image, context, to6, function1, function0, new a31.m(to6, 28, function1, function0));
    }

    @Override // yy0.d
    public final void b(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        com.bumptech.glide.n nVarD = com.bumptech.glide.b.d(imageView.getContext());
        nVarD.getClass();
        a0.d.z(imageView, nVarD);
        Job job2 = (Job) this.f11370a.remove(imageView);
        if (job2 != null) {
            job2.f(null);
        }
    }

    @Override // yy0.d
    public final boolean e(Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        return image instanceof QrCodeImage;
    }

    @Override // yy0.d
    public final void f(Image image, Context context, int i, int i2, v1.m mVar, a3l.b bVar) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(context, "context");
        o((QrCodeImage) image, context, null, mVar, bVar, new v0(i, mVar, bVar, i2, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(com.revolut.core.ui_kit_core.displayers.image.models.QrCodeAppearance.Layer r8, android.content.Context r9, java.lang.Integer r10, gim.c r11) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: az0.w0.m(com.revolut.core.ui_kit_core.displayers.image.models.QrCodeAppearance$Layer, android.content.Context, java.lang.Integer, gim.c):java.lang.Object");
    }

    public final void o(QrCodeImage qrCodeImage, Context context, ImageView imageView, Function1 function1, Function0 function0, Function1 function12) {
        ShimmerImageDrawable shimmerImageDrawable;
        if (imageView != null) {
            QrCodeImageDrawable qrCodeImageDrawable = qrCodeImage.f59994c;
            if (qrCodeImageDrawable != null) {
                ImageTransformations imageTransformations = qrCodeImage.d;
                if (!(qrCodeImageDrawable instanceof QrCodeImageDrawable.Shimmering)) {
                    throw new NoWhenBranchMatchedException();
                }
                shimmerImageDrawable = new ShimmerImageDrawable(context, imageTransformations, 6);
            } else {
                shimmerImageDrawable = null;
            }
            imageView.setImageDrawable(shimmerImageDrawable);
        }
        a2 a2VarC = skm.e0.C(this.f11371b, null, null, new b1(qrCodeImage, this, context, function0, imageView, function1, function12, null), 3);
        if (imageView != null) {
            this.f11370a.put(imageView, a2VarC);
        }
    }
}
