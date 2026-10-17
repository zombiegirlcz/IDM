package androidx.camera.core;

import android.util.Range;

/* JADX INFO: loaded from: classes15.dex */
public interface ExposureState {
    int getExposureCompensationIndex();

    Range<Integer> getExposureCompensationRange();

    boolean isExposureCompensationSupported();
}
