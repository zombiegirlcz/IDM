package wf6;

import com.revolut.feature.external_accounts.models.ExternalAccountTopupPayload;
import com.revolut.feature.rev10_main_screen.api.action.MainScreenContainerActionData;
import com.revolut.feature.rev10_main_screen.api.action.MainScreenContainerActionId;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements ke6.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sri.m f297001a;

    public n(sri.m navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f297001a = navigator;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return wp5.y.D(cVar, "deeplink", 1, "topup") && Intrinsics.f(cVar.e(2), "upi-net-banking");
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        return new q06.i(new q06.a(new MainScreenContainerActionData(new MainScreenContainerActionId("EXTERNAL_ACCOUNT_TOPUP"), new ExternalAccountTopupPayload.IndiaNetBankingPayload(Intrinsics.f(cVar.d.get("success"), "true")))));
    }

    @Override // jf0.d
    public final efm.d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        ufm.c cVar = new ufm.c(new to7.f(this, deeplink, 28), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        return cVar;
    }
}
