package kke;

import android.os.Parcelable;
import com.revolut.chat.domain.model.ChatEntryPoint;
import com.revolut.chat.ui.flow.ChatFlow;
import com.revolut.core.ui_kit.views.navbar.NavBarMenuItem;
import com.revolut.feature.global_markets.impl.ui.redesign.flow.GlobalMarketsRedesignFlow;
import com.revolut.feature.tab.invest.impl.ui.home.TabInvestController;
import dy0.n0;
import dy0.o;
import j30.f;
import jma.k;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import n63.h;
import tla.e;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements dtb.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f184580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f184581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j30.d f184582c;
    public final vqi.a d;

    public c(e profileFlowControllerProvider, h cardsListFlowControllerProvider, c87.b globalMarketsFlowControllerProvider, j30.d moneyAssistantDestinationProvider, vqi.a menuItemsRegistry) {
        Intrinsics.checkNotNullParameter(profileFlowControllerProvider, "profileFlowControllerProvider");
        Intrinsics.checkNotNullParameter(cardsListFlowControllerProvider, "cardsListFlowControllerProvider");
        Intrinsics.checkNotNullParameter(globalMarketsFlowControllerProvider, "globalMarketsFlowControllerProvider");
        Intrinsics.checkNotNullParameter(moneyAssistantDestinationProvider, "moneyAssistantDestinationProvider");
        Intrinsics.checkNotNullParameter(menuItemsRegistry, "menuItemsRegistry");
        this.f184580a = profileFlowControllerProvider;
        this.f184581b = cardsListFlowControllerProvider;
        this.f184582c = moneyAssistantDestinationProvider;
        this.d = menuItemsRegistry;
    }

    @Override // dtb.b
    public final com.revolut.kompot.navigable.a a(o direction, boolean z) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        int i = a.f184578a[direction.ordinal()];
        if (i == 1) {
            return ((k) this.f184580a).a();
        }
        if (i == 2) {
            vqi.a aVar = this.d;
            NavBarMenuItem navBarMenuItemA = aVar.a();
            return (aVar.f291403a == null || Intrinsics.f(navBarMenuItemA != null ? navBarMenuItemA.getF55268b() : null, "INVEST_HEADER_GLOBAL_MARKETS_MENU_ITEM_ID")) ? new GlobalMarketsRedesignFlow() : ((com.revolut.feature.card_screen.impl.kompot.cards_list.a) this.f184581b).a(null);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        ChatFlow chatFlowA = z ? ((f) this.f184582c).a(new ChatEntryPoint("invest")) : null;
        if (chatFlowA != null) {
            return chatFlowA;
        }
        throw new IllegalArgumentException("Sliding to " + direction + " is not supported in invest tab");
    }

    @Override // dtb.b
    public final n0 b() {
        return new a5a.c(this, 5);
    }

    @Override // dtb.b
    public final com.revolut.kompot.navigable.a c(Parcelable parcelable) {
        return new TabInvestController();
    }
}
