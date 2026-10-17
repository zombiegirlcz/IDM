package ksc;

import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.sca_prompt.impl.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class l implements n {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nd.k f189422a;

    public l(dsc.a dependenciesProvider, nd.k beneficiaryNameProvider, msc.a legalEntityProvider) {
        Intrinsics.checkNotNullParameter(dependenciesProvider, "dependenciesProvider");
        Intrinsics.checkNotNullParameter(beneficiaryNameProvider, "beneficiaryNameProvider");
        Intrinsics.checkNotNullParameter(legalEntityProvider, "legalEntityProvider");
        this.f189422a = beneficiaryNameProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    @Override // cli.n
    public final o c(cli.j jVar) {
        int i;
        TextLocalisedClause textLocalisedClause;
        List listK;
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        int i2 = k.f189420a[msc.a.a(domainState.f189411a).ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                listK = v.k(new j(new TextLocalisedClause(R$string.crypto_sca_learn_more_item_one_title, null, null, 14), new TextLocalisedClause(R$string.stocks_sca_learn_more_item_one_subtitle_rseuab, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_info, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), new j(new TextLocalisedClause(R$string.crypto_sca_learn_more_item_two_title, null, null, 14), new TextLocalisedClause(R$string.stocks_sca_learn_more_item_two_subtitle_rseuab, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_secure_seal, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), new j(new TextLocalisedClause(R$string.stocks_sca_learn_more_item_three_title_rseuab, null, null, 14), new TextLocalisedClause(R$string.stocks_sca_learn_more_item_three_subtitle_rseuab, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_company_filled, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), new j(new TextLocalisedClause(R$string.crypto_sca_learn_more_item_four_title, null, null, 14), new TextLocalisedClause(R$string.stocks_sca_learn_more_item_four_subtitle_rseuab, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_controls, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)));
            } else if (i2 == 3) {
                listK = v.k(new j(new TextLocalisedClause(R$string.crypto_sca_learn_more_item_one_title, null, null, 14), new TextLocalisedClause(R$string.wealth_commodities_sca_learn_more_item_one_subtitle_revolut_ltd, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_info, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), new j(new TextLocalisedClause(R$string.crypto_sca_learn_more_item_two_title, null, null, 14), new TextLocalisedClause(R$string.wealth_sca_learn_more_item_two_subtitle_revolut_ltd, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_secure_seal, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), new j(new TextLocalisedClause(R$string.wealth_sca_learn_more_item_three_title_revolut_ltd, null, null, 14), new TextLocalisedClause(R$string.wealth_sca_learn_more_item_three_subtitle_revolut_ltd, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_company_filled, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), new j(new TextLocalisedClause(R$string.crypto_sca_learn_more_item_four_title, null, null, 14), new TextLocalisedClause(R$string.wealth_sca_learn_more_item_four_subtitle_revolut_ltd, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_controls, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)));
            } else if (i2 == 4) {
                listK = v.k(new j(new TextLocalisedClause(R$string.crypto_sca_learn_more_item_one_title, null, null, 14), new TextLocalisedClause(R$string.wealth_invest_services_sca_learn_more_item_one_subtitle_revolut_trading_ltd, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_info, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), new j(new TextLocalisedClause(R$string.crypto_sca_learn_more_item_two_title, null, null, 14), new TextLocalisedClause(R$string.wealth_sca_learn_more_item_two_subtitle_revolut_trading_ltd, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_secure_seal, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), new j(new TextLocalisedClause(R$string.wealth_sca_learn_more_item_three_title_revolut_trading_ltd, null, null, 14), new TextLocalisedClause(R$string.wealth_sca_learn_more_item_three_subtitle_revolut_trading_ltd, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_company_filled, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), new j(new TextLocalisedClause(R$string.crypto_sca_learn_more_item_four_title, null, null, 14), new TextLocalisedClause(R$string.wealth_sca_learn_more_item_four_subtitle_revolut_trading_ltd, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_controls, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)));
            } else {
                if (i2 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                listK = f0.f322471a;
            }
            i = 0;
        } else {
            j jVar2 = new j(new TextLocalisedClause(R$string.crypto_sca_learn_more_item_one_title, null, null, 14), new TextLocalisedClause(R$string.crypto_sca_learn_more_item_one_subtitle, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_info, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
            j jVar3 = new j(new TextLocalisedClause(R$string.crypto_sca_learn_more_item_two_title, null, null, 14), new TextLocalisedClause(R$string.crypto_sca_learn_more_item_two_subtitle, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_secure_seal, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
            j jVar4 = new j(new TextLocalisedClause(R$string.crypto_sca_learn_more_item_three_title, null, null, 14), yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new TextLocalisedClause(R$string.crypto_sca_learn_more_item_three_subtitle, null, null, 14), new TextLocalisedClause(R$string.crypto_sca_prompt_learn_more, null, new Click(14, Integer.valueOf(R$attr.uikit_colorAccent), (Object) null, "LEARN_MORE_LIST_ID", false), 10))), new ResourceImage(R$drawable.uikit_icn_24_company_filled, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.crypto_sca_learn_more_item_four_title, null, null, 14);
            vrc.k kVar = domainState.f189412b;
            String str = domainState.f189411a;
            int i3 = k.f189421b[kVar.ordinal()];
            i = 0;
            nd.k kVar2 = this.f189422a;
            if (i3 == 1 || i3 == 2) {
                textLocalisedClause = new TextLocalisedClause(R$string.crypto_sca_learn_more_item_four_trade_subtitle, u.c(kVar2.j(str)), null, 12);
            } else {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause = new TextLocalisedClause(R$string.crypto_sca_learn_more_item_four_mandatory_to_trade_subtitle, v.k(kVar2.j(str), new TextLocalisedClause(R$string.crypto_sca_app_name_retail, null, null, 14)), null, 12);
            }
            listK = v.k(jVar2, jVar3, jVar4, new j(textLocalisedClause2, textLocalisedClause, new ResourceImage(R$drawable.uikit_icn_24_controls, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)));
        }
        List list = listK;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        int i5 = i;
        for (Object obj2 : list) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                v.s();
                throw null;
            }
            j jVar5 = (j) obj2;
            boolean z = i;
            arrayList.add(new RowDelegate.Model(a0.d.n("LEARN_MORE_ROW_LIST_ID_", i5), new RowDelegate.Model.MainImage.Image24(jVar5.f189419c, z, z, 6), jVar5.f189417a, null, 0, jVar5.f189418b, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824));
            i5 = i6;
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return new f(arrayList);
    }
}
