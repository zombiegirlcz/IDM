package fhi;

import aw0.ma;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature_workflow_reminder_impl.R$string;
import ip0.cl0;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final class i implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        TextLocalisedClause textLocalisedClause;
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        cl0 cl0Var = new cl0("WORKFLOW_TIMER_PICKER_ID", domainState.f135241b, ma.TIME_24H, null, 8);
        yp0.b.l(cl0Var, 0, 0, 0, 0, null, false, 63);
        List listC = u.c(cl0Var);
        int i = j.f135246a[domainState.f135240a.ordinal()];
        if (i == 1) {
            textLocalisedClause = new TextLocalisedClause(R$string.fincrime_reminder_remind_me_day, u.c(new TextLocalisedClause(R$string.fincrime_common_today_in_sentence, null, null, 14)), null, 12);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.fincrime_reminder_remind_me_day, u.c(new TextLocalisedClause(R$string.fincrime_common_tomorrow_in_sentence, null, null, 14)), null, 12);
        }
        return new h(textLocalisedClause, listC);
    }
}
