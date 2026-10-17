package wf6;

import com.revolut.feature.external_accounts.models.ExternalAccountTopupPayload;
import com.revolut.feature.rev10_main_screen.api.action.MainScreenContainerActionData;
import com.revolut.feature.rev10_main_screen.api.action.MainScreenContainerActionId;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class u implements ke6.r {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sri.m f297012a;

    public u(sri.m navigator, rh6.a externalAccountsNaviCommandProvider) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(externalAccountsNaviCommandProvider, "externalAccountsNaviCommandProvider");
        this.f297012a = navigator;
    }

    public static ExternalAccountTopupPayload.LinkedAccountPayload b(jf0.c cVar) {
        HashMap map = cVar.d;
        String str = (String) map.get("institutionId");
        if (str == null) {
            IllegalStateException illegalStateException = new IllegalStateException("institutionId param should present for openbanking top-up via stored method");
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            str = null;
        }
        return new ExternalAccountTopupPayload.LinkedAccountPayload(Intrinsics.f(map.get("success"), "true"), str);
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return wp5.y.D(cVar, "deeplink", 1, "topup-institution-auth");
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        return new q06.i(new q06.a(new MainScreenContainerActionData(new MainScreenContainerActionId("EXTERNAL_ACCOUNT_TOPUP"), b(cVar))));
    }

    @Override // jf0.d
    public final efm.d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        pfm.z zVarD = new pfm.h(new v3e.t(this, deeplink, 19), 2).D(Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
        return zVarD;
    }
}
