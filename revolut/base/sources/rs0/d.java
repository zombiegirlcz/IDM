package rs0;

import android.content.Context;
import android.content.res.Resources;
import android.widget.FrameLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.math.BigDecimal;
import java.math.MathContext;
import kotlin.jvm.internal.Intrinsics;
import ms0.x;

/* JADX INFO: loaded from: classes19.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f256908a = c(20);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f256909b = c(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f256910c = c(2);
    public static final float d = c(33);
    public static final float e = c(5);
    public static final float f = c(3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float f256911g = c(35);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final float f256912h = c(32);
    public static final float i = c(1);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final float f256913j = c(10);
    public static final float k = 0.5f * Resources.getSystem().getDisplayMetrics().density;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final float f256914l = c(10);

    public static final x a(Context context) {
        x xVar = new x(context, null, 6, 0);
        xVar.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        xVar.setX(BitmapDescriptorFactory.HUE_RED);
        xVar.setZ(2.0f);
        return xVar;
    }

    public static final BigDecimal b(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5) {
        BigDecimal bigDecimalSubtract = bigDecimal2.subtract(bigDecimal);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        if (bigDecimalSubtract.compareTo(BigDecimal.ZERO) == 0) {
            bigDecimalSubtract = null;
        }
        if (bigDecimalSubtract == null) {
            bigDecimalSubtract = BigDecimal.ONE;
        }
        BigDecimal bigDecimalSubtract2 = bigDecimal5.subtract(bigDecimal);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract2, "subtract(...)");
        BigDecimal bigDecimalSubtract3 = bigDecimal4.subtract(bigDecimal3);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract3, "subtract(...)");
        BigDecimal bigDecimalMultiply = bigDecimalSubtract2.multiply(bigDecimalSubtract3);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        Intrinsics.h(bigDecimalSubtract);
        Intrinsics.checkNotNullParameter(bigDecimalMultiply, "<this>");
        BigDecimal bigDecimalDivide = bigDecimalMultiply.divide(bigDecimalSubtract, MathContext.DECIMAL128);
        Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "div(...)");
        BigDecimal bigDecimalAdd = bigDecimal3.add(bigDecimalDivide);
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
        return bigDecimalAdd;
    }

    public static final float c(int i2) {
        return i2 * Resources.getSystem().getDisplayMetrics().density;
    }
}
