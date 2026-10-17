package u97;

import com.revolut.chat.ChatApi$Toggles;
import com.revolut.chat.domain.model.ChatFeed;
import com.revolut.chat.domain.model.ChatTarget;
import com.revolut.chat.domain.model.NewTicketContext;
import com.revolut.chat.domain.model.TicketCreationContext;
import com.revolut.chat.navigation.ChatFlowDestination;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.globalsearch.api.R$string;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import v30.t;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends r97.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f278399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t97.d f278400c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(t97.c productCellProvider, gte.a featureToggleInteractor) {
        super(productCellProvider);
        Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f278399b = featureToggleInteractor;
        this.f278400c = t97.d.CHAT;
    }

    @Override // r97.b
    public final p97.a e(p97.a productCell) {
        Intrinsics.checkNotNullParameter(productCell, "productCell");
        return ((jte.d) this.f278399b).c(ChatApi$Toggles.SupportNewInbox.f50985c) ? p97.a.a(productCell, 0, new TextLocalisedClause(R$string.search_products_support, null, null, 14), null, null, null, null, 123) : productCell;
    }

    @Override // r97.b
    public final p97.b f() {
        return this.f278400c;
    }

    @Override // r97.b
    public final Object g(Continuation continuation) {
        return new o97.d(new ChatFlowDestination(new ChatTarget.Messages(new ChatFeed.Support(null, null, new TicketCreationContext((String) null, (List) null, (List) null, (NewTicketContext) null, 31), 3), t.DEFAULT, null, 4), true));
    }
}
