package h7;

import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f149761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f149762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f149763c;
    public final ArrayList d;
    public final ArrayList e;
    public final ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f149764g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f149765h;
    public final ArrayList i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f149766j;

    public b0(List properties) {
        Intrinsics.checkNotNullParameter(properties, "properties");
        List list = properties;
        ArrayList intProperties = new ArrayList();
        for (Object obj2 : list) {
            if (((e0) obj2).f149774a instanceof Integer) {
                intProperties.add(obj2);
            }
        }
        ArrayList pointFProperties = new ArrayList();
        for (Object obj3 : list) {
            if (((e0) obj3).f149774a instanceof PointF) {
                pointFProperties.add(obj3);
            }
        }
        ArrayList floatProperties = new ArrayList();
        for (Object obj4 : list) {
            if (((e0) obj4).f149774a instanceof Float) {
                floatProperties.add(obj4);
            }
        }
        ArrayList scaleProperties = new ArrayList();
        for (Object obj5 : list) {
            if (((e0) obj5).f149774a instanceof s7.d) {
                scaleProperties.add(obj5);
            }
        }
        ArrayList colorFilterProperties = new ArrayList();
        for (Object obj6 : list) {
            if (((e0) obj6).f149774a instanceof ColorFilter) {
                colorFilterProperties.add(obj6);
            }
        }
        ArrayList intArrayProperties = new ArrayList();
        for (Object obj7 : list) {
            if (((e0) obj7).f149774a instanceof Object[]) {
                intArrayProperties.add(obj7);
            }
        }
        ArrayList typefaceProperties = new ArrayList();
        for (Object obj8 : list) {
            if (((e0) obj8).f149774a instanceof Typeface) {
                typefaceProperties.add(obj8);
            }
        }
        ArrayList bitmapProperties = new ArrayList();
        for (Object obj9 : list) {
            if (((e0) obj9).f149774a instanceof Bitmap) {
                bitmapProperties.add(obj9);
            }
        }
        ArrayList charSequenceProperties = new ArrayList();
        for (Object obj10 : list) {
            if (((e0) obj10).f149774a instanceof CharSequence) {
                charSequenceProperties.add(obj10);
            }
        }
        ArrayList pathProperties = new ArrayList();
        for (Object obj11 : list) {
            if (((e0) obj11).f149774a instanceof Path) {
                pathProperties.add(obj11);
            }
        }
        Intrinsics.checkNotNullParameter(intProperties, "intProperties");
        Intrinsics.checkNotNullParameter(pointFProperties, "pointFProperties");
        Intrinsics.checkNotNullParameter(floatProperties, "floatProperties");
        Intrinsics.checkNotNullParameter(scaleProperties, "scaleProperties");
        Intrinsics.checkNotNullParameter(colorFilterProperties, "colorFilterProperties");
        Intrinsics.checkNotNullParameter(intArrayProperties, "intArrayProperties");
        Intrinsics.checkNotNullParameter(typefaceProperties, "typefaceProperties");
        Intrinsics.checkNotNullParameter(bitmapProperties, "bitmapProperties");
        Intrinsics.checkNotNullParameter(charSequenceProperties, "charSequenceProperties");
        Intrinsics.checkNotNullParameter(pathProperties, "pathProperties");
        this.f149761a = intProperties;
        this.f149762b = pointFProperties;
        this.f149763c = floatProperties;
        this.d = scaleProperties;
        this.e = colorFilterProperties;
        this.f = intArrayProperties;
        this.f149764g = typefaceProperties;
        this.f149765h = bitmapProperties;
        this.i = charSequenceProperties;
        this.f149766j = pathProperties;
    }
}
