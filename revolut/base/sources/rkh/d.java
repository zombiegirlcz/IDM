package rkh;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.wealth.resources.R$string;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements f {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pair f254870b = new Pair(new TextLocalisedClause(R$string.wealth_disclosures_most_traded_crypto_title, null, null, 14), new TextLocalisedClause(R$string.wealth_disclosures_most_traded_crypto_disclosure, null, null, 14));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pair f254871c = new Pair(new TextLocalisedClause(com.revolut.feature.mainscreen.api.R$string.crypto_disclosures_top_movers_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.mainscreen.api.R$string.crypto_disclosures_top_movers_disclosure, null, null, 14));
    public static final Pair d = new Pair(new TextLocalisedClause(com.revolut.feature.mainscreen.api.R$string.crypto_disclosures_popular_crypto_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.mainscreen.api.R$string.crypto_disclosures_popular_crypto_disclosure, null, null, 14));
    public static final Pair e = new Pair(new TextLocalisedClause(com.revolut.feature.mainscreen.api.R$string.crypto_disclosures_news_disclosure_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.mainscreen.api.R$string.crypto_disclosures_wealth_news_disclosure, null, null, 14));
    public static final Pair f = new Pair(new TextLocalisedClause(com.revolut.feature.mainscreen.api.R$string.crypto_details_section_stats_info_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.mainscreen.api.R$string.crypto_details_section_stats_disclosures, null, null, 14));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pair f254872g = new Pair(new TextLocalisedClause(com.revolut.feature.mainscreen.api.R$string.crypto_details_section_stats_info_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.mainscreen.api.R$string.crypto_details_section_stats_disclosures_us, null, null, 14));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Pair f254873h = new Pair(new TextLocalisedClause(com.revolut.feature.mainscreen.api.R$string.crypto_disclosures_biographies_disclosure_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.mainscreen.api.R$string.crypto_disclosures_biographies_disclosure, null, null, 14));
    public static final Pair i = new Pair(new TextLocalisedClause(com.revolut.feature.mainscreen.api.R$string.crypto_disclosures_general_disclosure_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.mainscreen.api.R$string.crypto_disclosures_general_disclosure, null, null, 14));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Pair f254874j = new Pair(new TextLocalisedClause(com.revolut.feature.mainscreen.api.R$string.crypto_disclosures_general_disclosure_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.mainscreen.api.R$string.crypto_disclosures_general_disclosure_sg, null, null, 14));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ang.f f254875a;

    public d(ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f254875a = userInteractor;
    }

    @Override // rkh.f
    public final go.g a() {
        return zi0.c.i(new TextLocalisedClause(com.revolut.feature.mainscreen.api.R$string.crypto_disclosures_title, null, null, 14));
    }

    @Override // rkh.f
    public final Flow b() {
        return nim.a.v(nim.a.v(this.f254875a.j(w4l.h.f294642c), new rj7.b(19)), new rj7.b(this, 17));
    }

    @Override // rkh.f
    public final Flow c() {
        return nim.a.v(nim.a.v(this.f254875a.j(w4l.h.f294642c), new rj7.b(19)), new rj7.b(this, 18));
    }
}
