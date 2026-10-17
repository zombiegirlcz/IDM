package nl;

import com.onfido.android.sdk.capture.internal.util.logging.Timber;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class f0 implements igm.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sl.x f216906a;

    public f0(sl.x xVar) {
        this.f216906a = xVar;
    }

    @Override // igm.p
    public final boolean test(Object obj2) {
        Throwable throwable = (Throwable) obj2;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Timber.INSTANCE.e(throwable, "Error during submitting Motion Capture: " + this.f216906a + " completion", new Object[0]);
        return true;
    }
}
