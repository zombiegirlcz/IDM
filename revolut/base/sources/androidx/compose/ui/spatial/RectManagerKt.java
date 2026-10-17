package androidx.compose.ui.spatial;

import androidx.compose.ui.unit.IntOffset;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\"\u0018\u0010\t\u001a\u00020\u0006*\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroidx/compose/ui/graphics/Matrix;", "", "analyzeComponents-58bKbWc", "([F)I", "analyzeComponents", "Landroidx/compose/ui/unit/IntOffset;", "", "isSet--gyyYBs", "(J)Z", "isSet", "ui"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class RectManagerKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: analyzeComponents-58bKbWc, reason: not valid java name */
    public static final int m2846analyzeComponents58bKbWc(float[] fArr) {
        int i = 0;
        if (fArr.length < 16) {
            return 0;
        }
        int i2 = (fArr[0] == 1.0f && fArr[1] == BitmapDescriptorFactory.HUE_RED && fArr[2] == BitmapDescriptorFactory.HUE_RED && fArr[4] == BitmapDescriptorFactory.HUE_RED && fArr[5] == 1.0f && fArr[6] == BitmapDescriptorFactory.HUE_RED && fArr[8] == BitmapDescriptorFactory.HUE_RED && fArr[9] == BitmapDescriptorFactory.HUE_RED && fArr[10] == 1.0f) ? 1 : 0;
        if (fArr[12] == BitmapDescriptorFactory.HUE_RED && fArr[13] == BitmapDescriptorFactory.HUE_RED && fArr[14] == BitmapDescriptorFactory.HUE_RED && fArr[15] == 1.0f) {
            i = 1;
        }
        return (i2 << 1) | i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: isSet--gyyYBs, reason: not valid java name */
    public static final boolean m2847isSetgyyYBs(long j2) {
        return !IntOffset.m3333equalsimpl0(j2, IntOffset.INSTANCE.m3342getMaxnOccac());
    }
}
