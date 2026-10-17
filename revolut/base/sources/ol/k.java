package ol;

import com.onfido.android.sdk.capture.internal.util.logging.Timber;
import kotlin.jvm.internal.Intrinsics;
import sl.x;

/* JADX INFO: loaded from: classes17.dex */
public final class k implements igm.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f226272a;

    public k(x xVar) {
        this.f226272a = xVar;
    }

    @Override // igm.p
    public final boolean test(Object obj2) {
        Throwable throwable = (Throwable) obj2;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Timber.INSTANCE.e(throwable, "Error submitting Biometric Token Retrieval: " + this.f226272a + " completion", new Object[0]);
        return true;
    }
}
