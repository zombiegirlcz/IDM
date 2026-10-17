package androidx.camera.core.internal.compat.quirk;

import androidx.camera.core.impl.Quirk;
import androidx.camera.core.impl.Quirks;
import java.util.Iterator;

/* JADX INFO: loaded from: classes15.dex */
public interface SurfaceProcessingQuirk extends Quirk {
    default boolean workaroundBySurfaceProcessing() {
        return true;
    }

    static boolean workaroundBySurfaceProcessing(Quirks quirks) {
        Iterator it8 = quirks.getAll(SurfaceProcessingQuirk.class).iterator();
        while (it8.hasNext()) {
            if (((SurfaceProcessingQuirk) it8.next()).workaroundBySurfaceProcessing()) {
                return true;
            }
        }
        return false;
    }
}
