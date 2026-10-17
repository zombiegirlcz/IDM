package ol;

import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.BiometricTokenEvents;
import io.reactivex.rxjava3.core.Observable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class j implements igm.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f226270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f226271b;

    public j(l lVar, String str) {
        this.f226270a = lVar;
        this.f226271b = str;
    }

    @Override // igm.o
    public final Object apply(Object obj2) {
        Throwable error = (Throwable) obj2;
        Intrinsics.checkNotNullParameter(error, "error");
        this.f226270a.e.track(new BiometricTokenEvents.BiometricTokenRetrievalError(this.f226271b, error.getMessage()));
        return Observable.error(error);
    }
}
