package androidx.compose.ui.geometry;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"toStringAsFixed", "", "", "digits", "", "ui-geometry"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class GeometryUtilsKt {
    @NotNull
    public static final String toStringAsFixed(float f, int i) {
        if (Float.isNaN(f)) {
            return "NaN";
        }
        if (Float.isInfinite(f)) {
            return f < BitmapDescriptorFactory.HUE_RED ? "-Infinity" : "Infinity";
        }
        int iMax = Math.max(i, 0);
        float fPow = (float) Math.pow(10.0f, iMax);
        float f4 = f * fPow;
        int i2 = (int) f4;
        if (f4 - i2 >= 0.5f) {
            i2++;
        }
        float f5 = i2 / fPow;
        return iMax > 0 ? String.valueOf(f5) : String.valueOf((int) f5);
    }
}
