package qij;

import com.onfido.android.sdk.capture.ui.camera.CapturePresenter;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f246735a;

    public i(ArrayList esimProfiles) {
        Intrinsics.checkNotNullParameter(esimProfiles, "esimProfiles");
        this.f246735a = esimProfiles;
    }

    @Override // qij.k
    public final long a() {
        return CapturePresenter.PASSPORT_OVERLAY_DELAY_MS;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && this.f246735a.equals(((i) obj2).f246735a);
    }

    public final int hashCode() {
        return this.f246735a.hashCode();
    }
}
