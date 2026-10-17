package wje;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.vf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.tab.crypto.impl.R$string;
import com.revolut.feature.tab.crypto.impl.ui.settings.CryptoSettingsScreenContract$Parcel$AutoEarn;
import com.revolut.feature.tab.crypto.impl.ui.settings.models.CryptoSpareChangeInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class s implements cli.n {

    @NotNull
    public static final r Companion = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zl5.a f298082a;

    public s(zl5.a cryptoSpareChangeSettingMapper) {
        Intrinsics.checkNotNullParameter(cryptoSpareChangeSettingMapper, "cryptoSpareChangeSettingMapper");
        this.f298082a = cryptoSpareChangeSettingMapper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.lang.Object[], qv0.i[]] */
    /* JADX WARN: Type inference failed for: r12v10, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r37v1 */
    /* JADX WARN: Type inference failed for: r37v2 */
    /* JADX WARN: Type inference failed for: r37v4 */
    /* JADX WARN: Type inference failed for: r38v0 */
    /* JADX WARN: Type inference failed for: r38v1 */
    /* JADX WARN: Type inference failed for: r38v3 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        int i;
        ?? r56;
        char c2;
        RowDelegate.Model model;
        soa.b bVar;
        ?? r122;
        int i2;
        Clause textLocalisedClause;
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        xi0.b bVar2 = domainState.f298067a;
        RowDelegate.Model.MainImage.Image24 image24 = new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_rates_converter, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccentNeutral), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.crypto_settings_general_currency_switcher_title, null, null, 14);
        CurrencyClause.Format.Ticker ticker = CurrencyClause.Format.Ticker.f57756a;
        RowDelegate.Model model2 = new RowDelegate.Model("CRYPTO_SETTINGS_CURRENCY_LIST_ID", image24, textLocalisedClause2, null, 0, bVar2 != null ? new CurrencyClause(bVar2, ticker, null, 4) : null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872);
        CryptoSpareChangeInfo cryptoSpareChangeInfo = domainState.f298068b;
        if (cryptoSpareChangeInfo != null) {
            xi0.b bVar3 = cryptoSpareChangeInfo.f89809a;
            Integer num = cryptoSpareChangeInfo.f89810b;
            boolean z = bVar3 != null;
            RowDelegate.Model.MainImage.Image24 image242 = new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_coins, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccentNeutral), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6);
            if (bVar3 != null) {
                r122 = 0;
                i2 = 14;
                ArrayList arrayListN = v.n(new TextLocalisedClause(com.revolut.feature.crypto.spare.change.api.R$string.crypto_settings_sparechange_status_title, null, null, 14), new DotDividerClause((Integer) null), new CurrencyClause(bVar3, ticker, null, 4));
                if (num != null && num.intValue() > 1) {
                    arrayListN.add(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
                    ul5.g gVar = this.f298082a.f323189a;
                    int iIntValue = num.intValue();
                    for (ul5.f fVar : gVar.a()) {
                        if (fVar.f280893b == iIntValue) {
                            arrayListN.add(new TextLocalisedClause(fVar.f280892a, null, null, 14));
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                textLocalisedClause = new CompositeClause(arrayListN, null, null, null, 14);
            } else {
                r122 = 0;
                i2 = 14;
                textLocalisedClause = new TextLocalisedClause(com.revolut.feature.crypto.spare.change.api.R$string.crypto_sparechange_header_title, null, null, 14);
            }
            c2 = 4;
            r56 = r122;
            i = i2;
            model = new RowDelegate.Model("CRYPTO_SETTINGS_SPARE_CHANGE_LIST_ID", image242, textLocalisedClause, null, 0, z ? new TextLocalisedClause(com.revolut.feature.crypto.spare.change.api.R$string.crypto_settings_sparechange_active_subtitle, r122, r122, i2) : new TextLocalisedClause(com.revolut.feature.crypto.spare.change.api.R$string.crypto_settings_sparechange_inactive_subtitle, r122, r122, i2), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872);
        } else {
            i = 14;
            r56 = 0;
            c2 = 4;
            model = null;
        }
        ?? model3 = domainState.f298069c ? new RowDelegate.Model("CRYPTO_SETTINGS_WEALTH_PROTECTION_LIST_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_face_id, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccentNeutral), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6), new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_wealth_protection_title, r56, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), null, 0, new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.crypto_settings_wealth_protection_subtitle, r56, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), null, null, 0, null, true, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824) : r56;
        Data data = domainState.e;
        ?? model4 = (data == null || (bVar = (soa.b) data.getContent()) == null) ? r56 : new RowDelegate.Model("CRYPTO_SETTINGS_VOLATILITY_ALERT_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_line_chart, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccentNeutral), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6), new TextLocalisedClause(R$string.crypto_settings_volatilityAlerts_title, r56, r56, i), null, 0, new TextLocalisedClause(R$string.crypto_settings_volatilityAlerts_subtitle, r56, r56, i), null, null, 0, null, true, null, false, null, null, null, null, null, null, bVar, null, 0, 0, 0, 0, 532674520);
        boolean z3 = domainState.f298070g;
        boolean z4 = domainState.f298071h;
        ?? model5 = r56;
        if (z3) {
            model5 = new RowDelegate.Model("CRYPTO_SETTINGS_AUTO_EARN_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_coins_earning, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccentNeutral), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6), new TextLocalisedClause(R$string.crypto_settings_auto_earn_title, r56, r56, i), null, 0, new TextLocalisedClause(R$string.crypto_settings_auto_earn_subtitle, r56, r56, i), null, null, 0, new vf(z4, true), false, null, false, null, null, null, null, null, null, new CryptoSettingsScreenContract$Parcel$AutoEarn(z4), null, 0, 0, 0, 0, 532673496);
        }
        ?? elements = new qv0.i[5];
        elements[0] = model2;
        elements[1] = model;
        elements[2] = model3;
        elements[3] = model4;
        elements[c2] = model5;
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        return new i(listL);
    }
}
