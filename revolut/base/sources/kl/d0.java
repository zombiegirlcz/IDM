package kl;

import com.onfido.android.sdk.capture.internal.util.logging.Timber;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class d0 implements igm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d0 f185160a = new d0();

    @Override // igm.g
    public final void accept(Object obj2) {
        Throwable throwable = (Throwable) obj2;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Timber.INSTANCE.e(throwable, "Error during subscribing to workflow state", new Object[0]);
    }
}
