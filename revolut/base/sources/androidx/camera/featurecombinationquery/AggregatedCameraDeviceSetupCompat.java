package androidx.camera.featurecombinationquery;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.params.SessionConfiguration;
import androidx.camera.featurecombinationquery.CameraDeviceSetupCompat;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
final class AggregatedCameraDeviceSetupCompat implements CameraDeviceSetupCompat {
    private final List<CameraDeviceSetupCompat> mCameraDeviceSetupImpls;

    public AggregatedCameraDeviceSetupCompat(List<CameraDeviceSetupCompat> list) {
        this.mCameraDeviceSetupImpls = list;
    }

    @Override // androidx.camera.featurecombinationquery.CameraDeviceSetupCompat
    public CameraDeviceSetupCompat.SupportQueryResult isSessionConfigurationSupported(SessionConfiguration sessionConfiguration) throws CameraAccessException {
        Iterator<CameraDeviceSetupCompat> it8 = this.mCameraDeviceSetupImpls.iterator();
        while (it8.hasNext()) {
            CameraDeviceSetupCompat.SupportQueryResult supportQueryResultIsSessionConfigurationSupported = it8.next().isSessionConfigurationSupported(sessionConfiguration);
            if (supportQueryResultIsSessionConfigurationSupported.getSupported() != 0) {
                return supportQueryResultIsSessionConfigurationSupported;
            }
        }
        return new CameraDeviceSetupCompat.SupportQueryResult(0, 0, 0L);
    }
}
