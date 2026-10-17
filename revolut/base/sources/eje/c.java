package eje;

import android.os.Parcelable;
import com.revolut.chat.domain.model.ChatEntryPoint;
import com.revolut.chat.ui.flow.ChatFlow;
import com.revolut.feature.card_screen.api.navigation.CardListPreSelectedVariant;
import com.revolut.feature.tab.crypto.api.TabCryptoApi$Toggles;
import com.revolut.feature.tab.crypto.impl.ui.TabCryptoFlow;
import com.revolut.feature.tab.crypto.impl.ui.v2.TabCryptoRootFlowV2;
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
    public final e f126871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f126872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j30.d f126873c;
    public final gte.a d;
    public final vqi.a e;

    public c(e profileFlowControllerProvider, h cardsListFlowControllerProvider, j30.d moneyAssistantDestinationProvider, gte.a featureToggleInteractor, vqi.a menuItemsRegistry) {
        Intrinsics.checkNotNullParameter(profileFlowControllerProvider, "profileFlowControllerProvider");
        Intrinsics.checkNotNullParameter(cardsListFlowControllerProvider, "cardsListFlowControllerProvider");
        Intrinsics.checkNotNullParameter(moneyAssistantDestinationProvider, "moneyAssistantDestinationProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(menuItemsRegistry, "menuItemsRegistry");
        this.f126871a = profileFlowControllerProvider;
        this.f126872b = cardsListFlowControllerProvider;
        this.f126873c = moneyAssistantDestinationProvider;
        this.d = featureToggleInteractor;
        this.e = menuItemsRegistry;
    }

    @Override // dtb.b
    public final com.revolut.kompot.navigable.a a(o direction, boolean z) {
        ChatFlow chatFlowA;
        Intrinsics.checkNotNullParameter(direction, "direction");
        int i = a.f126869a[direction.ordinal()];
        if (i == 1) {
            return ((k) this.f126871a).a();
        }
        if (i == 2) {
            return ((com.revolut.feature.card_screen.impl.kompot.cards_list.a) this.f126872b).a(new CardListPreSelectedVariant.Tab(n63.c.CRYPTO));
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        if (z) {
            chatFlowA = ((f) this.f126873c).a(new ChatEntryPoint("crypto"));
        } else {
            chatFlowA = null;
        }
        if (chatFlowA != null) {
            return chatFlowA;
        }
        throw new IllegalArgumentException("Sliding to " + direction + " is not supported in crypto tab");
    }

    @Override // dtb.b
    public final n0 b() {
        return new a5a.c(this, 3);
    }

    @Override // dtb.b
    public final com.revolut.kompot.navigable.a c(Parcelable parcelable) {
        return ((jte.d) this.d).c(TabCryptoApi$Toggles.CryptoHomeMultipleAccounts.f89774c) ? new TabCryptoRootFlowV2() : new TabCryptoFlow();
    }
}
