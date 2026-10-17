package rkh;

import aw0.o9;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.mainscreen.api.R$string;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import pkh.d;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements f {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pair f254867b = new Pair(null, new TextLocalisedClause(R$string.commodities_disclosures_special_sg_disclosure, null, null, 14));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pair f254868c = new Pair(new TextLocalisedClause(R$string.commodities_disclosures_news_title, null, null, 14), new TextLocalisedClause(R$string.commodities_disclosures_wealth_news_disclosure, null, null, 14));
    public static final Pair d = new Pair(new TextLocalisedClause(R$string.commodities_disclosures_general_title, null, null, 14), new TextLocalisedClause(R$string.commodities_disclosures_general_disclosure, null, null, 14));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l61.a f254869a;

    public b(l61.a userCompanyInteractor) {
        Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
        this.f254869a = userCompanyInteractor;
    }

    @Override // rkh.f
    public final go.g a() {
        return zi0.c.i(new TextLocalisedClause(R$string.commodities_disclosures_title, null, null, 14));
    }

    @Override // rkh.f
    public final Flow b() {
        od0.h hVar = od0.i.Companion;
        CompositeClause compositeClauseM = yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), u.c(new TextLocalisedClause(R$string.commodities_home_disclaimer_text, u.c(new TextLocalisedClause(R$string.commodities_home_disclaimer_link, null, new Click(28, (Integer) null, (Object) d.a.f237181a, "DISCLOSURE_DESCRIPTION_CLICK_ID", false), 10)), null, 12)));
        hVar.getClass();
        return zi0.c.i(od0.h.a(compositeClauseM));
    }

    @Override // rkh.f
    public final Flow c() {
        return nim.a.v(rd0.e.b(hng.g.b(((ang.b) this.f254869a).f7765a)), new rj7.b(16));
    }
}
