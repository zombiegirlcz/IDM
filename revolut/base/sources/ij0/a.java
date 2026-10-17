package ij0;

import com.onfido.android.sdk.capture.ui.camera.CapturePresenter;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public interface a {
    boolean failingBackendEnabled();

    String getAppTypeHeader();

    String getBaseUrl();

    boolean getDebug();

    boolean getEndToEndMode();

    boolean getLogEnabled();

    b getMandatoryInterceptorsProvider();

    Function0 getNeedToSimulatedDelay();

    List getRevolutHosts();

    String getSslHostPattern();

    List getSslPins();

    int getVersionCode();

    Function0 getVersionName();

    default long requestDelayMs() {
        if (((Boolean) getNeedToSimulatedDelay().invoke()).booleanValue()) {
            return CapturePresenter.PASSPORT_OVERLAY_DELAY_MS;
        }
        return 0L;
    }

    boolean signRequests();
}
