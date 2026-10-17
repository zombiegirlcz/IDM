package androidx.camera.camera2.compat;

import android.util.Range;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"EMPTY_RANGE", "Landroid/util/Range;", "", "getEMPTY_RANGE", "()Landroid/util/Range;", "camera-camera2"}, k = 2, mv = {2, 1, 0}, xi = 48)
public abstract class EvCompCompatKt {

    @NotNull
    private static final Range<Integer> EMPTY_RANGE = new Range<>(0, 0);

    @NotNull
    public static final Range<Integer> getEMPTY_RANGE() {
        return EMPTY_RANGE;
    }
}
