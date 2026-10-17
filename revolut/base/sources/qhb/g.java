package qhb;

import aw0.m6;
import aw0.n6;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.data.model.Data;
import com.revolut.feature.retail.salary_account.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pv7.t;
import qg7.v;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static aw0.e a(boolean z) {
        return new aw0.e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(R$string.salary_switch_assistant_review_email_confirm_and_send, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, z, null, null, null, 988), null, null, 55);
    }

    @Override // cli.n
    public final o c(j jVar) {
        qhb.a domainState = (qhb.a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        aw0.e eVarA = null;
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.salary_switch_assistant_review_email_title, null, null, 14), null, null, null, false, 30);
        List list = (List) iii.c.f(domainState.f246592b, new v(4), new qc8.a(this, 20), new t(29));
        Data data = domainState.f246592b;
        if (data.getLoading()) {
            eVarA = a(false);
        } else if (data.getContent() != null) {
            eVarA = a(true);
        }
        return new cii.b(eVarA, list, aVar);
    }
}
