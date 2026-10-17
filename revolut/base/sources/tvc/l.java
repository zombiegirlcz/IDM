package tvc;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.security_hub.api.R$string;
import com.revolut.feature.security_hub.api.navigation.SecurityDelayType;
import ip0.pb0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class l implements n {
    public static pb0 a(int i) {
        return t61.a.o("SECURITY_DELAY_INFO_LOADING_LIST_ID_", i, pb0.Companion, false, 4);
    }

    public static int b(SecurityDelayType securityDelayType) {
        if (securityDelayType instanceof SecurityDelayType.Transaction) {
            return R$string.security_delay_bottom_sheet_cancel_transfer;
        }
        if (securityDelayType instanceof SecurityDelayType.WealthProtection) {
            return R$string.security_delay_bottom_sheet_cancel;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (f) iii.c.f(domainState.f274747c, new tsk.j(this, 16), new tq0.j(this, 24), new si5.c(this, domainState, 29));
    }

    public final f d(SecurityDelayType securityDelayType) {
        return new f(new lw0.a(new TextLocalisedClause(R$string.security_delay_bottom_sheet_completed_title, null, null, 14), new TextLocalisedClause(R$string.security_delay_bottom_sheet_completed_subtitle, null, null, 14), new lw0.f(0L, System.currentTimeMillis()), null, false, 24), f0.f322471a, true, new TextLocalisedClause(R$string.security_delay_bottom_sheet_completed_action, null, null, 14), new TextLocalisedClause(b(securityDelayType), null, null, 14));
    }
}
