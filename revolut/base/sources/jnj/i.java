package jnj;

import aw0.m6;
import aw0.n6;
import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsStandaloneNoteDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.feature.esim.api.model.EsimHyperText;
import com.revolut.retail.feature.esim.api.model.EsimSubscriptionRefundIneligibilityDetails;
import com.revolut.retail.feature.esim.impl.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class i implements n {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wnj.a f176816a;

    public i(wnj.a descriptorApplier) {
        Intrinsics.checkNotNullParameter(descriptorApplier, "descriptorApplier");
        this.f176816a = descriptorApplier;
    }

    @Override // cli.n
    public final o c(j jVar) {
        Clause textLocalisedClause;
        List listK;
        EsimHyperText esimHyperText;
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        EsimSubscriptionRefundIneligibilityDetails esimSubscriptionRefundIneligibilityDetails = domainState.f176813a;
        String str = esimSubscriptionRefundIneligibilityDetails != null ? esimSubscriptionRefundIneligibilityDetails.f100505a : null;
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.esim_subscription_details_refund_unavailable_title_placeholder, u.c(str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : new TextLocalisedClause(R$string.esim_subscription_details_refund_unavailable_title, null, null, 14)), null, 12);
        wnj.a aVar = this.f176816a;
        if (esimSubscriptionRefundIneligibilityDetails == null || (esimHyperText = esimSubscriptionRefundIneligibilityDetails.f100506b) == null || (textLocalisedClause = wnj.a.c(aVar, esimHyperText, null, 6)) == null) {
            textLocalisedClause = new TextLocalisedClause(R$string.esim_subscription_details_refund_unavailable_subtitle, null, null, 14);
        }
        lw0.a aVar2 = new lw0.a(textLocalisedClause2, textLocalisedClause, null, null, false, 28);
        CellDetailsStandaloneNoteDelegate.Model.Companion companion = CellDetailsStandaloneNoteDelegate.Model.INSTANCE;
        if (esimSubscriptionRefundIneligibilityDetails == null) {
            listK = v.k(CellDetailsStandaloneNoteDelegate.Model.Companion.b(companion, "ID_ITEM_EXPIRED", new TextLocalisedClause(R$string.esim_subscription_details_refund_unavailable_expired, null, null, 14)), CellDetailsStandaloneNoteDelegate.Model.Companion.b(companion, "ID_ITEM_USAGE", new TextLocalisedClause(R$string.esim_subscription_details_refund_unavailable_usage, null, null, 14)), CellDetailsStandaloneNoteDelegate.Model.Companion.b(companion, "ID_ITEM_TIME_LIMIT", new TextLocalisedClause(R$string.esim_subscription_details_refund_unavailable_time_limit, null, null, 14)));
        } else {
            ArrayList arrayList = esimSubscriptionRefundIneligibilityDetails.f100507c;
            ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
            int i = 0;
            for (Object obj2 : arrayList) {
                int i2 = i + 1;
                if (i < 0) {
                    v.s();
                    throw null;
                }
                arrayList2.add(CellDetailsStandaloneNoteDelegate.Model.Companion.b(CellDetailsStandaloneNoteDelegate.Model.INSTANCE, a0.d.n("ID_ITEM_CRITERIA_", i), wnj.a.c(aVar, (EsimHyperText) obj2, null, 6)));
                i = i2;
            }
            listK = arrayList2;
        }
        int i3 = R$attr.uikit_dp0;
        yp0.b.k(listK, i3, i3, 0, 0, 28);
        companion.getClass();
        ArrayList arrayListA = CellDetailsStandaloneNoteDelegate.Model.Companion.a(listK);
        m6 m6Var = n6.Companion;
        return new cii.b(new aw0.g(m6.c(m6Var, new TextLocalisedClause(R$string.esim_subscription_details_refund_unavailable_help, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, null, 1020), m6.c(m6Var, new TextLocalisedClause(R$string.esim_subscription_details_refund_unavailable_accept, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), (Clause) null, (aw0.f) null, 25), arrayListA, aVar2);
    }
}
