package o27;

import aw0.o9;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.freelancer.common.models.FreelancerOrder;
import com.revolut.feature.freelancer.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import njj.c1;
import o17.x;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class w implements cli.n {

    @NotNull
    public static final v Companion = new v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w80.b f221533a;

    public w(w80.b amountFormatter, u80.o moneyPrefixFormatter, q27.c refundHintFactory) {
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(moneyPrefixFormatter, "moneyPrefixFormatter");
        Intrinsics.checkNotNullParameter(refundHintFactory, "refundHintFactory");
        this.f221533a = amountFormatter;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        String str;
        l domainState = (l) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        FreelancerOrder freelancerOrder = domainState.e;
        Data data = domainState.f221520h;
        r rVar = new r(new TextLocalisedClause(R$string.freelancer_refund_header_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), (freelancerOrder == null || (str = freelancerOrder.f73291c) == null) ? null : new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        k kVar = (k) data.getContent();
        h hVar = kVar != null ? kVar.f221513a : null;
        return new s(rVar, (List) iii.c.f(data, new x(this, 8), new nz7.g(16), new c1(this, domainState, 12)), new q(new TextLocalisedClause(R$string.freelancer_common_action_refund, null, null, 14), hVar != null && hVar.f221509a && hVar.f221510b && hVar.f221511c));
    }
}
