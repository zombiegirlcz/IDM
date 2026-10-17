package wf6;

import com.revolut.feature.external_accounts.models.ExternalAccountTopupPayload;
import com.revolut.feature.rev10_main_screen.api.action.MainScreenContainerActionData;
import com.revolut.feature.rev10_main_screen.api.action.MainScreenContainerActionId;
import java.net.URI;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements ke6.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sri.m f296976a;

    public c(sri.m navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f296976a = navigator;
    }

    public static ExternalAccountTopupPayload.BrazilPixMandatePayload b(jf0.c cVar) {
        String rawFragment;
        try {
            rawFragment = URI.create(cVar.f173627a).getRawFragment();
        } catch (Exception e) {
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
            rawFragment = null;
        }
        if (rawFragment != null && !kotlin.text.d0.W(rawFragment)) {
            return new ExternalAccountTopupPayload.BrazilPixMandatePayload(rawFragment);
        }
        IllegalStateException illegalStateException = new IllegalStateException("Brazil PIX mandate deeplink missing fragment data");
        zhm.h0 h0Var2 = zhm.h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var2);
        return null;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return Intrinsics.f(deeplink.e(1) + "/" + deeplink.e(2), "open-banking/pix-mandate-created");
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        return new q06.i(new q06.a(new MainScreenContainerActionData(new MainScreenContainerActionId("EXTERNAL_ACCOUNT_TOPUP"), b(cVar))));
    }

    @Override // jf0.d
    public final efm.d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        ufm.c cVar = new ufm.c(new to7.f(this, deeplink, 27), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        return cVar;
    }
}
