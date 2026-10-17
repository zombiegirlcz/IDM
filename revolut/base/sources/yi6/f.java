package yi6;

import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.external_accounts.impl.R$string;
import com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.accounts_au.access_detail_au.AccessDetailsAuScreenContract$InputData;
import gl6.g;
import ip0.ck0;
import ip0.yj0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccessDetailsAuScreenContract$InputData f314263a;

    public f(AccessDetailsAuScreenContract$InputData inputData, g consentPermissionsMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(consentPermissionsMapper, "consentPermissionsMapper");
        this.f314263a = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        AccessDetailsAuScreenContract$InputData accessDetailsAuScreenContract$InputData = this.f314263a;
        ArrayList arrayListA = g.a(accessDetailsAuScreenContract$InputData.f72525b);
        yp0.b.k(arrayListA, 0, 0, 0, 0, 31);
        return new d(d0.F0(new TextDelegate.Model("CDR_POLICY_FOOTER_LIST_ID", new TextLocalisedClause(R$string.open_banking_consent_flow_accounts_information_permissions_info_au_screen_footer, v.k(accessDetailsAuScreenContract$InputData.f72524a, new TextLocalisedClause(R$string.open_banking_consent_flow_accounts_information_au_policy, null, new Click(30, (Integer) null, (Object) null, "CDR_POLICY_CLICK_ID", false), 10)), null, 12), false, new ck0(yj0.CENTER_HORIZONTAL), null, null, 0, 0, 0, 0, 2036), arrayListA));
    }
}
