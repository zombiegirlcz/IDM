package sl;

import com.onfido.android.sdk.capture.internal.util.logging.Timber;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class i implements igm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f264037a = new i();

    @Override // igm.g
    public final void accept(Object obj2) {
        Throwable it8 = (Throwable) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        Timber.INSTANCE.e(it8, "Failure during polling", new Object[0]);
    }
}
