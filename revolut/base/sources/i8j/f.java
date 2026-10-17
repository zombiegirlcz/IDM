package i8j;

import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.mainscreen.api.R$string;
import com.revolut.retail.feature.crypto.asset_details.common.impl.glossary.CryptoStatsGlossaryContract$InputData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import mx0.v5;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements n {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoStatsGlossaryContract$InputData f159546a;

    public f(CryptoStatsGlossaryContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f159546a = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        CryptoStatsGlossaryContract$InputData cryptoStatsGlossaryContract$InputData = this.f159546a;
        Clause clause = cryptoStatsGlossaryContract$InputData.f99947a;
        Pair pair = new Pair(new TextLocalisedClause(R$string.crypto_details_section_stats_market_cap, null, null, 14), new TextLocalisedClause(R$string.crypto_details_section_stats_info_market_cap, u.c(clause), null, 12));
        Integer f99946a = cryptoStatsGlossaryContract$InputData.f99948b.f99943b.getF99946a();
        Pair[] elements = {pair, f99946a != null ? new Pair(new TextLocalisedClause(R$string.crypto_details_section_stats_market_cap_rank, null, null, 14), new TextLocalisedClause(R$string.crypto_details_section_stats_info_market_cap_rank, v.k(clause, Integer.valueOf(f99946a.intValue())), null, 12)) : null, new Pair(new TextLocalisedClause(R$string.crypto_details_section_stats_circulating_supply, null, null, 14), new TextLocalisedClause(R$string.crypto_details_section_stats_info_circulating_supply, u.c(clause), null, 12)), new Pair(new TextLocalisedClause(R$string.crypto_details_section_stats_max_supply, null, null, 14), new TextLocalisedClause(R$string.crypto_details_section_stats_info_max_supply, null, null, 14)), new Pair(new TextLocalisedClause(R$string.crypto_details_section_stats_twenty_four_h_trading_volume, null, null, 14), new TextLocalisedClause(R$string.crypto_details_section_stats_info_twenty_four_h_trading_volume, u.c(clause), null, 12))};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        ArrayList arrayList = new ArrayList(w.t(listL, 10));
        int i = 0;
        for (Object obj2 : listL) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            Pair pair2 = (Pair) obj2;
            PlainTextDelegate.Model model = new PlainTextDelegate.Model(a0.d.n("ASSET_DETAILS_CRYPTO_STATS", i), (UrlImage) null, (TextLocalisedClause) pair2.f186385a, TextLocalisedClause.c((TextLocalisedClause) pair2.f186386b, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 27), (v5) null, (List) null, (String) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 32746);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            arrayList.add(model);
            i = i2;
        }
        return new a(new TextLocalisedClause(R$string.crypto_details_section_stats_info_title, null, null, 14), arrayList);
    }
}
