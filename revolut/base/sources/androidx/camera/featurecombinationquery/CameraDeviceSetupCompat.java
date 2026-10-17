package androidx.camera.featurecombinationquery;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.params.SessionConfiguration;

/* JADX INFO: loaded from: classes15.dex */
public interface CameraDeviceSetupCompat {

    public static final class SupportQueryResult {
        private final int mSource;
        private final int mSupported;
        private final long mTimestampMillis;

        public SupportQueryResult(int i, int i2, long j2) {
            this.mSupported = i;
            this.mSource = i2;
            this.mTimestampMillis = j2;
        }

        public int getSupported() {
            return this.mSupported;
        }
    }

    SupportQueryResult isSessionConfigurationSupported(SessionConfiguration sessionConfiguration) throws CameraAccessException;
}
