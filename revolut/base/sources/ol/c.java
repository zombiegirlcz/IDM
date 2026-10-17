package ol;

import android.content.Context;
import android.os.ResultReceiver;
import com.onfido.android.sdk.capture.errors.OnfidoException;
import io.reactivex.rxjava3.core.Observable;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class c implements f {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f226262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ResultReceiver f226263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f226264c;

    public c(Context applicationContext, ResultReceiver resultReceiver) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        this.f226262a = applicationContext;
        this.f226263b = resultReceiver;
    }

    @Override // ol.f
    public final ogm.e a(String customerUserHash, String biometricToken) {
        Intrinsics.checkNotNullParameter(customerUserHash, "customerUserHash");
        Intrinsics.checkNotNullParameter(biometricToken, "biometricToken");
        ogm.e eVar = new ogm.e(new nl.f(3, customerUserHash, biometricToken, this), 2);
        Intrinsics.checkNotNullExpressionValue(eVar, "fromAction(...)");
        return eVar;
    }

    @Override // ol.f
    public final Observable b(String customerUserHash) {
        Intrinsics.checkNotNullParameter(customerUserHash, "customerUserHash");
        Observable observableDoFinally = Observable.create(new kp0.b(this, customerUserHash, 24)).timeout(30L, TimeUnit.SECONDS, Observable.error(new OnfidoException("Biometric token retrieval from external storage timed out"))).doFinally(new com.onfido.android.sdk.capture.component.active.video.capture.data.repository.b(this, 17));
        Intrinsics.checkNotNullExpressionValue(observableDoFinally, "doFinally(...)");
        return observableDoFinally;
    }

    @Override // ol.f
    public final g getType() {
        return g.EXTERNAL;
    }
}
