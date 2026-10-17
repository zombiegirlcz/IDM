package d62;

import com.revolut.feature.apm.iris.api.navigation.IrisNavigation$Destination;
import com.revolut.feature.apm.iris.api.navigation.IrisNavigation$StartType;
import com.revolut.feature.apm.wero.api.navigation.WeroNavigation$Destination;
import com.revolut.feature.apm.wero.api.navigation.WeroNavigation$StartType;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;
import xo9.h;
import zh9.u0;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class b implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f111437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f111438b;

    public /* synthetic */ b(h hVar, int i) {
        this.f111437a = i;
        this.f111438b = hVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f111437a) {
            case 0:
                h hVar = this.f111438b;
                Intrinsics.i(hVar, "null cannot be cast to non-null type com.revolut.feature.apm.iris.impl.qr.IrisQrHandlerImpl.Result");
                return u0.f(new IrisNavigation$Destination(new IrisNavigation$StartType.Pay.QrScan(((d) hVar).f111439a), null, 2));
            case 1:
                h hVar2 = this.f111438b;
                Intrinsics.i(hVar2, "null cannot be cast to non-null type com.revolut.feature.apm.ideal.impl.qr.IDealQrHandlerImpl.IDealParsingResult");
                return ((n52.b) hVar2).f212535a;
            default:
                h hVar3 = this.f111438b;
                Intrinsics.i(hVar3, "null cannot be cast to non-null type com.revolut.feature.apm.wero.impl.qr.WeroQrHandlerImpl.Result");
                return u0.f(new WeroNavigation$Destination(new WeroNavigation$StartType.Pay.URL(((rh2.b) hVar3).f254300a)));
        }
    }
}
