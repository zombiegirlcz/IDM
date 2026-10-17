package sle;

import android.os.Parcelable;
import com.revolut.chat.domain.model.ChatEntryPoint;
import com.revolut.chat.ui.flow.ChatFlow;
import com.revolut.feature.tab.lifestyle.impl.ui.screen.TabLifestyleScreen;
import com.revolut.feature.tab.lifestyle.impl.ui.screen.TabLifestyleScreenContract$InputData;
import dy0.n0;
import dy0.o;
import j30.d;
import j30.f;
import jma.k;
import kotlin.jvm.internal.Intrinsics;
import n63.h;
import tla.e;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements dtb.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f264196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f264197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f264198c;
    public final vqi.a d;

    public c(e profileFlowControllerProvider, h cardsListFlowControllerProvider, d moneyAssistantDestinationProvider, gte.a featureToggleInteractor, vqi.a menuItemsRegistry) {
        Intrinsics.checkNotNullParameter(profileFlowControllerProvider, "profileFlowControllerProvider");
        Intrinsics.checkNotNullParameter(cardsListFlowControllerProvider, "cardsListFlowControllerProvider");
        Intrinsics.checkNotNullParameter(moneyAssistantDestinationProvider, "moneyAssistantDestinationProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(menuItemsRegistry, "menuItemsRegistry");
        this.f264196a = profileFlowControllerProvider;
        this.f264197b = cardsListFlowControllerProvider;
        this.f264198c = moneyAssistantDestinationProvider;
        this.d = menuItemsRegistry;
    }

    @Override // dtb.b
    public final com.revolut.kompot.navigable.a a(o direction, boolean z) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        int i = a.f264194a[direction.ordinal()];
        if (i == 1) {
            return ((k) this.f264196a).a();
        }
        ChatFlow chatFlowA = null;
        if (i == 2) {
            return ((com.revolut.feature.card_screen.impl.kompot.cards_list.a) this.f264197b).a(null);
        }
        if (i != 3) {
            throw new IllegalArgumentException("Sliding to " + direction + " is not supported on Lifestyle tab");
        }
        if (z) {
            chatFlowA = ((f) this.f264198c).a(new ChatEntryPoint("lifestyle"));
        }
        if (chatFlowA != null) {
            return chatFlowA;
        }
        throw new IllegalArgumentException("Sliding to " + direction + " is not supported on Lifestyle tab");
    }

    @Override // dtb.b
    public final n0 b() {
        return new a5a.c(this, 7);
    }

    @Override // dtb.b
    public final com.revolut.kompot.navigable.a c(Parcelable parcelable) {
        return new TabLifestyleScreen(parcelable != null ? new TabLifestyleScreenContract$InputData.Action(parcelable) : TabLifestyleScreenContract$InputData.Default.f89917a);
    }
}
