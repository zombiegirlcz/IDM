package wf6;

import com.revolut.feature.external_accounts.models.ExternalAccountTopupPayload;
import com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination;
import com.revolut.feature.rev10_main_screen.api.action.MainScreenContainerActionData;
import com.revolut.feature.rev10_main_screen.api.action.MainScreenContainerActionId;
import com.revolut.feature.tab.accounts.api.model.TabAccountsInitialPayload;
import com.revolut.feature.tab.accounts.api.model.TabAccountsLaunchConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.kompot.common.transition.AccountCreationTransitionAnimation;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import zhm.y0;

/* JADX INFO: loaded from: classes3.dex */
public final class m0 implements ke6.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xg6.b0 f296999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f297000b;

    public m0(xg6.b0 payToStoredMethodTopUpRepository) {
        Intrinsics.checkNotNullParameter(payToStoredMethodTopUpRepository, "payToStoredMethodTopUpRepository");
        this.f296999a = payToStoredMethodTopUpRepository;
        this.f297000b = y0.b("institution-auth/stored-method/{storedMethodId}/{state}?type={type}");
    }

    @Override // xii.b
    public final Set a() {
        return this.f297000b;
    }

    @Override // xii.b
    public final ParcelableDestination e(lg0.e deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        LinkedHashMap linkedHashMap = deeplink.f195040b;
        String str = (String) linkedHashMap.get("storedMethodId");
        if (str == null || kotlin.text.d0.W(str)) {
            IllegalStateException illegalStateException = new IllegalStateException("storedMethodId should be presented for PayTo top-up via stored method");
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            return null;
        }
        if (!Intrinsics.f(lg0.g.a("type", deeplink.f195041c), "PAY_TO")) {
            IllegalStateException illegalStateException2 = new IllegalStateException("Unknown deeplink type for stored method topup");
            zhm.h0 h0Var2 = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
            return null;
        }
        String str2 = (String) linkedHashMap.get("state");
        Boolean bool = Intrinsics.f(str2, "active") ? Boolean.TRUE : Intrinsics.f(str2, "rejected") ? Boolean.FALSE : null;
        if (bool != null) {
            dj0.d dVar = (dj0.d) skm.e0.E(kotlin.coroutines.g.f186406a, new w3k.i(this, str, null, 28));
            if (dVar == null) {
                return null;
            }
            return new MainContainerScreenDestination.JustShow(ibb.c.f160140a, new TabAccountsLaunchConfig(null, new TabAccountsInitialPayload.Action(new MainContainerScreenDestination.Action(new MainScreenContainerActionData(new MainScreenContainerActionId("EXTERNAL_ACCOUNT_TOPUP"), new ExternalAccountTopupPayload.PayToStoredMethodPayload(dVar, str, bool.booleanValue()))))), (AccountCreationTransitionAnimation) null, 12);
        }
        IllegalStateException illegalStateException3 = new IllegalStateException("Unknown deeplink state for stored method topup");
        zhm.h0 h0Var3 = zhm.h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException3, h0Var3);
        return null;
    }
}
