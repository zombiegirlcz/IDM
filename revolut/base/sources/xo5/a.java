package xo5;

import com.revolut.feature.crypto.withdraw.api.CryptoSendApi$Toggles;
import go5.e;
import kotlin.jvm.internal.Intrinsics;
import vc.s;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ite.a f307685a;

    public a(c cVar, ite.a aVar) {
        this.f307685a = aVar;
    }

    public final e a() {
        gte.a featureToggleInteractor = this.f307685a.b();
        s.j(featureToggleInteractor);
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        jte.d dVar = (jte.d) featureToggleInteractor;
        return new e(dVar.c(CryptoSendApi$Toggles.CryptoSourcePickerAllowInvestmentPockets.f71052c), dVar.c(CryptoSendApi$Toggles.CryptoSourcePickerAllowCommoditiesPockets.f71051c), dVar.c(CryptoSendApi$Toggles.CryptoSourcePickerAllowVaults.f71055c), dVar.c(CryptoSendApi$Toggles.CryptoSourcePickerAllowJointPockets.f71053c), dVar.c(CryptoSendApi$Toggles.CryptoSourcePickerAllowSavings.f71054c), go5.a.NEW_TRANSFER_SCREEN);
    }
}
