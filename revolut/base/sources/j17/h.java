package j17;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.referrals.common.data.api.domain.model.common.Upsell;
import com.revolut.revolut.feature_fourthline_impl.R;
import i6j.q;
import java.util.List;
import jki.i;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements p {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // jki.p
    public final m a(i iVar) {
        Upsell.Modal modal;
        d domainState = (d) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = (List) iii.c.f(domainState.f170129a, new j1.e(this, 2), new j0g.b(this, 4), new q(this, 23));
        Data data = domainState.f170129a;
        Upsell upsell = (Upsell) data.getContent();
        String str = (upsell == null || (modal = upsell.e) == null) ? null : modal.f81785a;
        if (str == null) {
            str = "";
        }
        return new f(new e(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), data.getLoading()), list, new c(new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), data.getContent() != null));
    }
}
