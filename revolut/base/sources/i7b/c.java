package i7b;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanHubInfoBenefitsSectionAction;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c7b.a f159225a;

    public c(c7b.a iconsMapper) {
        Intrinsics.checkNotNullParameter(iconsMapper, "iconsMapper");
        this.f159225a = iconsMapper;
    }

    public final LargeActionButtonDelegate.Model a(CobrandedCardsPlanHubInfoBenefitsSectionAction action, String listIdPrefix) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(listIdPrefix, "listIdPrefix");
        if (!(action instanceof CobrandedCardsPlanHubInfoBenefitsSectionAction.Url)) {
            throw new NoWhenBranchMatchedException();
        }
        String strP = p.a.p("list_id_", listIdPrefix, "_action");
        LargeActionButton.ButtonStyle.FlatButton flatButton = LargeActionButton.ButtonStyle.o;
        CobrandedCardsPlanHubInfoBenefitsSectionAction.Url url2 = (CobrandedCardsPlanHubInfoBenefitsSectionAction.Url) action;
        String str = url2.f82362b;
        return new LargeActionButtonDelegate.Model(strP, flatButton, str != null ? this.f159225a.c(str) : null, new TextClause(url2.f82361a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, null, null, action, null, 744);
    }
}
