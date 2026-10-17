package ol;

import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.BiometricTokenEvents;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class n implements igm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f226276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f226277b;

    public n(p pVar, String str) {
        this.f226276a = pVar;
        this.f226277b = str;
    }

    @Override // igm.g
    public final void accept(Object obj2) {
        Throwable error = (Throwable) obj2;
        Intrinsics.checkNotNullParameter(error, "error");
        this.f226276a.d.track(new BiometricTokenEvents.BiometricTokenStorageError(this.f226277b, error.getMessage()));
    }
}
