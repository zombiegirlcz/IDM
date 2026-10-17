package kl;

import com.onfido.android.sdk.capture.internal.util.logging.Timber;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class s1 implements igm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s1 f185237a = new s1();

    @Override // igm.g
    public final void accept(Object obj2) {
        Throwable throwable = (Throwable) obj2;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Timber.INSTANCE.e(throwable, "Error happened during handling face capturing processor outcome", new Object[0]);
    }
}
