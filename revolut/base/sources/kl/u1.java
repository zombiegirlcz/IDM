package kl;

import com.onfido.android.sdk.capture.internal.util.logging.Timber;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class u1 implements igm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u1 f185242a = new u1();

    @Override // igm.g
    public final void accept(Object obj2) {
        Throwable throwable = (Throwable) obj2;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Timber.INSTANCE.e(throwable, "Failed to listen for toolbar state", new Object[0]);
    }
}
