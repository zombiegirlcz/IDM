package nl;

import com.onfido.android.sdk.capture.internal.util.logging.Timber;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class o implements igm.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f216929a = new o();

    @Override // igm.p
    public final boolean test(Object obj2) {
        Throwable throwable = (Throwable) obj2;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Timber.INSTANCE.e(throwable, "Error during submitting document with nfc task completion", new Object[0]);
        return true;
    }
}
