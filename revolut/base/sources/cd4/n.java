package cd4;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v2.list.CreditLinkedAccountsV2ListScreenContract$InputData;
import com.revolut.feature.credit.core.R$string;
import java.util.List;
import jki.p;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class n implements p {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditLinkedAccountsV2ListScreenContract$InputData f23188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final je6.h f23189b;

    public n(CreditLinkedAccountsV2ListScreenContract$InputData inputData, je6.h externalInstitutionLogoMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(externalInstitutionLogoMapper, "externalInstitutionLogoMapper");
        this.f23188a = inputData;
        this.f23189b = externalInstitutionLogoMapper;
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        Pair pair;
        g domainState = (g) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        CreditLinkedAccountsV2ListScreenContract$InputData creditLinkedAccountsV2ListScreenContract$InputData = this.f23188a;
        String str = creditLinkedAccountsV2ListScreenContract$InputData.f67852c;
        if (str == null || creditLinkedAccountsV2ListScreenContract$InputData.d == null) {
            pair = creditLinkedAccountsV2ListScreenContract$InputData.f67851b ? new Pair(new TextLocalisedClause(R$string.linked_accounts_v3_hub_title, null, null, 14), new TextLocalisedClause(R$string.linked_accounts_v3_hub_subtitle, null, null, 14)) : creditLinkedAccountsV2ListScreenContract$InputData.f67850a ? new Pair(new TextLocalisedClause(R$string.linked_accounts_v2_hub_title, null, null, 14), new TextLocalisedClause(R$string.linked_accounts_v2_hub_subtitle, null, null, 14)) : new Pair(new TextLocalisedClause(R$string.linked_accounts_v2_hub_already_linked_title, null, null, 14), new TextLocalisedClause(R$string.linked_accounts_v2_hub_already_linked_subtitle, null, null, 14));
        } else {
            pair = new Pair(new TextLocalisedClause(R$string.linked_accounts_v3_hub_config_title, u.c(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), new TextLocalisedClause(R$string.linked_accounts_v3_hub_config_subtitle, u.c(new TextClause(creditLinkedAccountsV2ListScreenContract$InputData.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12));
        }
        return (j) iii.c.f(domainState.f23174a, new l(0, pair), new c9f.c(pair, 10), new cab.m(pair, this, 1));
    }
}
