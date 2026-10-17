package twf;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.transport.api.R$string;
import com.revolut.feature.transport.models.transit.TransitTicket;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ruf.f;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    @NotNull
    public static final C1529a Companion = new C1529a();

    /* JADX INFO: renamed from: twf.a$a, reason: collision with other inner class name */
    public static final class C1529a {
        private C1529a() {
        }
    }

    public static TextLocalisedClause a(TransitTicket ticket, dj0.d price) {
        Intrinsics.checkNotNullParameter(ticket, "ticket");
        Intrinsics.checkNotNullParameter(price, "price");
        return new TextLocalisedClause(ticket.o ? R$string.transport_transit_checkout_action_buy_ticket : R$string.transport_transit_checkout_action, u.c(f.b(price)), null, 12);
    }
}
