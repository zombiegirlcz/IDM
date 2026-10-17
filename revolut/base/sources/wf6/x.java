package wf6;

import com.revolut.feature.external_accounts.api.model.brazil.payment_confirmation.BrazilPaymentConsentInput;
import com.revolut.feature.external_accounts.api.navigation.OpenBankingBrazilDestination;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class x implements ke6.x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sri.m f297017a;

    public x(sri.m navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f297017a = navigator;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return Intrinsics.f(deeplink.e(1) + "/" + deeplink.e(2), "open-banking/brazil-handoff");
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        return new q06.h(new OpenBankingBrazilDestination(new BrazilPaymentConsentInput.Handoff(cVar.e(3))), null);
    }

    @Override // jf0.d
    public final efm.d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        ufm.c cVar = new ufm.c(new w(this, deeplink, 0), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        return cVar;
    }
}
