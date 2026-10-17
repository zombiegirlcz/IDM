package rkh;

import aw0.o9;
import com.revolut.core.ui_kit.models.HtmlLocalisedClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.wealth.resources.R$string;
import e7l.g;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import zh9.u0;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class h implements f {

    @NotNull
    public static final g Companion = new g();
    public static final Pair d = new Pair(new TextLocalisedClause(R$string.invest_disclosures_combined_uk_provision_of_information_title, null, null, 14), yoj.b.m(new TextClause("\n\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new TextLocalisedClause(R$string.invest_disclosures_combined_uk_provision_of_information_content_paragraph1_short, null, null, 14), new TextLocalisedClause(R$string.invest_disclosures_combined_uk_provision_of_information_content_emphasis_revolut_trading, null, null, 14), yoj.b.m(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new TextLocalisedClause(R$string.invest_disclosures_combined_uk_provision_of_information_content_paragraph2, null, null, 14), new TextClause("\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new HtmlLocalisedClause(R$string.invest_disclosures_combined_uk_provision_of_information_content_paragraph2_html, (List) null, (Integer) null, (Object) null, 30))), new TextLocalisedClause(R$string.invest_disclosures_combined_uk_provision_of_information_content_paragraph3, v.k(new TextLocalisedClause(R$string.invest_disclosures_combined_uk_provision_of_information_content_emphasis_are_indicative, null, null, 14), new TextLocalisedClause(R$string.invest_disclosures_combined_uk_provision_of_information_content_emphasis_past_performance, null, null, 14), new TextLocalisedClause(R$string.invest_disclosures_combined_uk_provision_of_information_content_emphasis_in_app_courses, null, null, 14), new TextLocalisedClause(R$string.invest_disclosures_combined_uk_provision_of_information_content_emphasis_informational_purposes, null, null, 14)), null, 12))));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fk3.a f254877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ybl.l f254878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wbf.k f254879c;

    public h(fk3.a configurationInteractor, ybl.l tradingConfigInteractor, wbf.k tradingAddOnListInteractor) {
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(tradingAddOnListInteractor, "tradingAddOnListInteractor");
        this.f254877a = configurationInteractor;
        this.f254878b = tradingConfigInteractor;
        this.f254879c = tradingAddOnListInteractor;
    }

    @Override // rkh.f
    public final go.g a() {
        return zi0.c.i(new TextLocalisedClause(R$string.invest_disclosures_combined_uk_title, null, null, 14));
    }

    @Override // rkh.f
    public final Flow b() {
        od0.i.Companion.getClass();
        return zi0.c.i(od0.i.f224256b);
    }

    @Override // rkh.f
    public final Flow c() {
        return nim.a.v(u0.i(rd0.e.b(((ik3.c) this.f254877a).l(g.b.f123407a, w4l.h.f294642c)), rd0.e.b(ybl.l.c(this.f254878b, false, 3)), rd0.e.b(this.f254879c.f296152a.f253046g.f(Unit.f186387a, true))), new rj7.b(this, 20));
    }
}
