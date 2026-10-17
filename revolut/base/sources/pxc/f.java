package pxc;

import com.revolut.chat.domain.model.ChatListFilter;
import com.revolut.chat.domain.model.ChatTarget;
import com.revolut.chat.domain.model.TicketCreationContext;
import com.revolut.chat.navigation.ChatFlowDestination;
import com.revolut.chat.navigation.InboxDestination;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.bridge.navigation.DeeplinkDestination;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.CompositeCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import efm.d0;
import java.util.HashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements a {

    @NotNull
    private static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sri.m f240604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gde.d f240605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j30.c f240606c;

    public f(sri.m navigator, gde.d helpCentreNaviCommandProvider, j30.c featureToggles) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(helpCentreNaviCommandProvider, "helpCentreNaviCommandProvider");
        Intrinsics.checkNotNullParameter(featureToggles, "featureToggles");
        this.f240604a = navigator;
        this.f240605b = helpCentreNaviCommandProvider;
        this.f240606c = featureToggles;
    }

    public static e c(jf0.c cVar) {
        String strE = cVar.e(1);
        HashMap map = cVar.d;
        if (!Intrinsics.f(strE, "consumer-tickets")) {
            return null;
        }
        String strE2 = cVar.e(2);
        if (strE2.length() > 0) {
            return new c(strE2, (String) map.get("transactionId"), Intrinsics.f(map.get("presentation_type"), "inline"));
        }
        if (Intrinsics.f(map.get("filter"), "ticketor")) {
            return d.f240603a;
        }
        return null;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return c(deeplink) != null;
    }

    public final CompositeCommand b() {
        return com.revolut.retail.core.navigation.a.c(new FeatureCommand(new MainScreenFeatureConfig.JustShow(s49.a.SINGLE_TOP)), ((rf3.d) this.f240606c).b() == j30.b.FULLY_ENABLED ? new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) InboxDestination.f51112b, false, (Integer) null, 0, 61)) : this.f240605b.a());
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        String str;
        e eVarC = c(cVar);
        if (eVarC == null) {
            return null;
        }
        if (eVarC instanceof c) {
            c cVar2 = (c) eVarC;
            ChatFlowDestination chatFlowDestination = new ChatFlowDestination(new ChatTarget.ChatList(new ChatListFilter.Tickets(true, true), (TicketCreationContext) null, cVar2.f240600a, 4), true);
            return (!cVar2.f240601b || (str = cVar2.f240602c) == null) ? new q06.h(chatFlowDestination, null) : new q06.h(new DeeplinkDestination(new BridgeDestination(new FeatureCommand(new TransactionsFeatureConfig.Details(new k71.c(str), null, null, null, 94))), chatFlowDestination), null);
        }
        if (eVarC instanceof d) {
            return new q06.h(new ChatFlowDestination(new ChatTarget.ChatList(new ChatListFilter.Tickets(true, true), (TicketCreationContext) null, (String) null, 12), true), null);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        ufm.c cVar = new ufm.c(new pu9.a(this, deeplink, 2), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        return cVar;
    }
}
