package androidx.compose.ui.platform;

import androidx.compose.ui.ComposeUiFlags;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0017\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\u0005¨\u0006\b"}, d2 = {"", "ceilAwayFromZero", "(F)F", "", "extractIntegerPixels", "(F)I", "offset", "composeToViewOffset", "ui"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class NestedScrollInteropConnectionKt {
    private static final float ceilAwayFromZero(float f) {
        return (float) (f >= BitmapDescriptorFactory.HUE_RED ? Math.ceil(f) : Math.floor(f));
    }

    public static final int composeToViewOffset(float f) {
        return (ComposeUiFlags.isNestedScrollInteropIntegerPropagationEnabled ? extractIntegerPixels(f) : (int) ceilAwayFromZero(f)) * (-1);
    }

    private static final int extractIntegerPixels(float f) {
        return rim.d.c(f);
    }
}
