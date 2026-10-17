package s12;

import a12.t;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.badge.RawCutoutImageBadge;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.apm.core.api.R$string;
import com.revolut.feature.apm.core.models.transfers.payments.ApmPaymentDraft;
import java.util.List;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rwg.e0;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements a12.h {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lx1.i f259039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f259040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f259041c;

    public c(lx1.i apmRecipientMapper, t apmListMapper) {
        Intrinsics.checkNotNullParameter(apmRecipientMapper, "apmRecipientMapper");
        Intrinsics.checkNotNullParameter(apmListMapper, "apmListMapper");
        this.f259039a = apmRecipientMapper;
        this.f259040b = apmListMapper;
        this.f259041c = yhm.j.b(new e0(27));
    }

    public final e12.d a(ApmPaymentDraft apmPaymentDraft, Clause clause) {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.apm_area_draft_payments_status_pending, u.c(clause), new Custom(Integer.valueOf(R$attr.uikit_colorStatusWarning), false, null, false, null, 254), 8);
        ApmPaymentDraft.Details details = apmPaymentDraft.d;
        Long l2 = details.f62197b;
        TextLocalisedClause textLocalisedClause2 = l2 != null ? new TextLocalisedClause(R$string.apm_area_draft_payments_expires_on, u.c(new TimeClause(l2.longValue(), new TimeClause.Format.DateMedium(0), null, null, 12)), null, 12) : null;
        Pair pair = textLocalisedClause2 != null ? new Pair(textLocalisedClause2, textLocalisedClause) : new Pair(textLocalisedClause, null);
        return new e12.d(apmPaymentDraft.f62193a, new TextClause(details.d.getDisplayName(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (TextLocalisedClause) pair.f186385a, (TextLocalisedClause) pair.f186386b, new RowDelegate.Model.MainImage.Image40(((fy1.q) this.f259039a).c(details.d), (RawCutoutImageBadge) this.f259041c.getValue(), null, false, null, false, 60), new RowDelegate.Model.c.b(new MoneyClause(apmPaymentDraft.f62194b, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 126), apmPaymentDraft);
    }
}
