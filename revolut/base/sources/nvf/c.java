package nvf;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.transport.api.R$string;
import com.revolut.feature.transport.models.transit.PurchasedTransitTicket;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f219585a;

    public c(o qrCodeMapper, ruf.k timeLeftProvider, a componentsMapper) {
        Intrinsics.checkNotNullParameter(qrCodeMapper, "qrCodeMapper");
        Intrinsics.checkNotNullParameter(timeLeftProvider, "timeLeftProvider");
        Intrinsics.checkNotNullParameter(componentsMapper, "componentsMapper");
        this.f219585a = qrCodeMapper;
    }

    public final RowDelegate.Model a(PurchasedTransitTicket.Expired ticket) {
        Intrinsics.checkNotNullParameter(ticket, "ticket");
        return new RowDelegate.Model(j6.a.q("EXPIRED_ID_", ticket.f92645a), new RowDelegate.Model.MainImage.Image40(ruf.d.a(ticket.e), null, null, false, null, false, 60), new TextClause(ticket.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, a.a(ticket), a.b(ticket.f92649h), null, 0, null, false, null, false, null, null, null, null, null, null, ticket, null, 0, 0, 0, 0, 532676504);
    }

    public final RowDelegate.Model b(PurchasedTransitTicket.NotPurchased ticket) {
        Intrinsics.checkNotNullParameter(ticket, "ticket");
        return new RowDelegate.Model(j6.a.q("FAILED_ID_", ticket.f92658a), new RowDelegate.Model.MainImage.Image40(ruf.d.a(ticket.e), null, null, false, null, false, 60), new TextClause(ticket.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, a.a(ticket), a.b(ticket.f92662h), null, 0, new RowDelegate.Model.c.b(new TextLocalisedClause(R$string.transport_ticket_details_status_failed, null, new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), 10), null, null, false, 126), false, null, false, null, null, null, null, null, null, ticket, null, 0, 0, 0, 0, 532675480);
    }
}
