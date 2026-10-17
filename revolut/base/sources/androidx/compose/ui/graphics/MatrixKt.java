package androidx.compose.ui.graphics;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/graphics/Matrix;", "", "isIdentity-58bKbWc", "([F)Z", "isIdentity", "ui-graphics"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class MatrixKt {
    /* JADX INFO: renamed from: isIdentity-58bKbWc, reason: not valid java name */
    public static final boolean m2069isIdentity58bKbWc(@NotNull float[] fArr) {
        return fArr.length >= 16 && fArr[0] == 1.0f && fArr[1] == BitmapDescriptorFactory.HUE_RED && fArr[2] == BitmapDescriptorFactory.HUE_RED && fArr[3] == BitmapDescriptorFactory.HUE_RED && fArr[4] == BitmapDescriptorFactory.HUE_RED && fArr[5] == 1.0f && fArr[6] == BitmapDescriptorFactory.HUE_RED && fArr[7] == BitmapDescriptorFactory.HUE_RED && fArr[8] == BitmapDescriptorFactory.HUE_RED && fArr[9] == BitmapDescriptorFactory.HUE_RED && fArr[10] == 1.0f && fArr[11] == BitmapDescriptorFactory.HUE_RED && fArr[12] == BitmapDescriptorFactory.HUE_RED && fArr[13] == BitmapDescriptorFactory.HUE_RED && fArr[14] == BitmapDescriptorFactory.HUE_RED && fArr[15] == 1.0f;
    }
}
