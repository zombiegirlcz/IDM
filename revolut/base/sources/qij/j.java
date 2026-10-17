package qij;

import com.onfido.android.sdk.capture.ui.camera.CapturePresenter;
import com.revolut.retail.feature.esim.api.model.EsimProfile;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimProfile f246736a;

    public j(EsimProfile esimProfile) {
        Intrinsics.checkNotNullParameter(esimProfile, "esimProfile");
        this.f246736a = esimProfile;
    }

    @Override // qij.k
    public final long a() {
        return CapturePresenter.PASSPORT_OVERLAY_DELAY_MS;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f246736a, ((j) obj2).f246736a);
    }

    public final int hashCode() {
        return this.f246736a.hashCode();
    }
}
