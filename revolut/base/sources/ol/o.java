package ol;

import com.onfido.android.sdk.capture.internal.util.logging.Timber;
import kotlin.jvm.internal.Intrinsics;
import sl.x;

/* JADX INFO: loaded from: classes17.dex */
public final class o implements igm.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f226278a;

    public o(sl.l lVar) {
        this.f226278a = lVar;
    }

    @Override // igm.p
    public final boolean test(Object obj2) {
        Throwable throwable = (Throwable) obj2;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Timber.INSTANCE.e(throwable, "Error submitting Biometric Token Storage: " + this.f226278a + " completion", new Object[0]);
        return true;
    }
}
