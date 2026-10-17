package ks0;

import androidx.collection.ArrayMap;
import androidx.core.graphics.ColorUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mx0.a7;

/* JADX INFO: loaded from: classes19.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f189073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a7 f189074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f189075c;
    public ArrayMap d;

    public i(int i, a7 colorSetter, g strategy) {
        Intrinsics.checkNotNullParameter(colorSetter, "colorSetter");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        this.f189073a = i;
        this.f189074b = colorSetter;
        this.f189075c = strategy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        Float f;
        if (h.f189072a[this.f189075c.ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        ArrayMap arrayMap = this.d;
        if (arrayMap == null) {
            arrayMap = new ArrayMap();
            this.d = arrayMap;
        }
        Intrinsics.checkNotNullParameter(arrayMap, "<this>");
        if (arrayMap.isEmpty()) {
            f = null;
        } else {
            Float fValueOf = (Float) arrayMap.valueAt(0);
            int size = arrayMap.getSize();
            for (int i = 1; i < size; i++) {
                Intrinsics.h(fValueOf);
                float fFloatValue = fValueOf.floatValue();
                V vValueAt = arrayMap.valueAt(i);
                Intrinsics.checkNotNullExpressionValue(vValueAt, "valueAt(...)");
                fValueOf = Float.valueOf(Math.max(fFloatValue, ((Number) vValueAt).floatValue()));
            }
            f = fValueOf;
        }
        this.f189074b.invoke(Integer.valueOf(ColorUtils.blendARGB(0, this.f189073a, f != null ? f.floatValue() : BitmapDescriptorFactory.HUE_RED)));
    }
}
