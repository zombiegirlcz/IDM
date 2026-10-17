package ya5;

import aw0.n6;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.credit.core.R$string;
import kotlin.jvm.internal.Intrinsics;
import y66.q;

/* JADX INFO: loaded from: classes21.dex */
public final class m implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w80.b f311948a;

    public m(w80.b amountFormatter) {
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        this.f311948a = amountFormatter;
    }

    public static aw0.e a(boolean z) {
        return new aw0.e(false, new TextLocalisedClause(R$string.post_termination_plan_repayment_footer, null, null, 14), null, new n6(new TextLocalisedClause(R$string.post_termination_plan_repayment_continue, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, z, null, null, 988), null, null, 53);
    }

    public static h b() {
        return new h(new TextLocalisedClause(R$string.post_termination_plan_repayment_header, null, null, 14));
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (i) iii.c.f(domainState.f311933a, new y8a.h(this, domainState, 8), new y65.n(this, 12), new q(this, domainState, 2));
    }
}
