package qij;

import com.onfido.android.sdk.capture.ui.camera.CapturePresenter;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f246734a;

    public h(ArrayList esimProfiles) {
        Intrinsics.checkNotNullParameter(esimProfiles, "esimProfiles");
        this.f246734a = esimProfiles;
    }

    @Override // qij.k
    public final long a() {
        return CapturePresenter.PASSPORT_OVERLAY_DELAY_MS;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && this.f246734a.equals(((h) obj2).f246734a);
    }

    public final int hashCode() {
        return this.f246734a.hashCode();
    }
}
