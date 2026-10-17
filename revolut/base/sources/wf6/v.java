package wf6;

import com.revolut.feature.external_accounts.api.model.brazil.payment_confirmation.BrazilPaymentConsentInput;
import com.revolut.feature.external_accounts.api.navigation.OpenBankingBrazilDestination;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class v implements ke6.v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sri.m f297013a;

    public v(sri.m navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f297013a = navigator;
    }

    public static OpenBankingBrazilDestination b(jf0.c cVar) {
        HashMap map = cVar.d;
        String str = (String) map.get("client_id");
        String str2 = (String) map.get("request_uri");
        String str3 = (String) map.get("scope");
        String str4 = (String) map.get("state");
        if (str != null && !kotlin.text.d0.W(str) && str2 != null && !kotlin.text.d0.W(str2)) {
            return new OpenBankingBrazilDestination(new BrazilPaymentConsentInput.Regular(str, str2, str3, str4));
        }
        IllegalStateException illegalStateException = new IllegalStateException(a0.d.u(v0.a.m("Brazil deeplink had clientId=", str, " scope=", str3, " state="), str4, " requestUri=", str2));
        zhm.h0 h0Var = zhm.h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        return null;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return Intrinsics.f(deeplink.e(1) + "/" + deeplink.e(2), "open-banking/brazil");
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        OpenBankingBrazilDestination openBankingBrazilDestinationB = b(cVar);
        if (openBankingBrazilDestinationB != null) {
            return new q06.h(openBankingBrazilDestinationB, null);
        }
        return null;
    }

    @Override // jf0.d
    public final efm.d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        ufm.c cVar = new ufm.c(new to7.f(this, deeplink, 29), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        return cVar;
    }
}
