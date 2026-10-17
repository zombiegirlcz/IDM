package xwd;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.staking.api.R$plurals;
import com.revolut.feature.staking.api.R$string;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mx0.i3;
import mx0.m3;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class p implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w80.b f309367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qd0.b f309368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dvd.a f309369c;
    public final zwd.b d;

    public p(w80.b amountFormatter, qd0.b languageProvider, dvd.a keyboardSuggestionsProvider, zwd.b amountErrorMapperProvider) {
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        Intrinsics.checkNotNullParameter(keyboardSuggestionsProvider, "keyboardSuggestionsProvider");
        Intrinsics.checkNotNullParameter(amountErrorMapperProvider, "amountErrorMapperProvider");
        this.f309367a = amountFormatter;
        this.f309368b = languageProvider;
        this.f309369c = keyboardSuggestionsProvider;
        this.d = amountErrorMapperProvider;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        CellDetailsDelegate.Model model;
        long j2;
        List listF0;
        zwd.a aVarA;
        l domainState = (l) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        dj0.d dVar = domainState.e;
        long j3 = domainState.f309354a;
        yqi.b error = domainState.f;
        xi0.b bVar = domainState.f309355b;
        String str = dVar.f115083b.f306286a;
        int i = domainState.f309358h;
        if (i > 0) {
            model = new CellDetailsDelegate.Model("LOCK_UP_CELL_DETAILS_LIST_ID", new TextLocalisedClause(R$string.staking_details_unstaking_title, null, null, 14), new TextLocalisedQuantityClause(R$plurals.staking_unstake_v2_lockup_days, Integer.valueOf(i), (List) null, (Style) null, 28), null, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), true, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048520);
            yp0.b.l(model, R$attr.uikit_dp0, 0, 0, 0, null, false, 62);
        } else {
            model = null;
        }
        String strD = this.f309367a.d(j3, bVar.f306286a);
        String strJ = cp5.d.A(bVar) ? cp5.d.J(bVar) : null;
        TextClause textClause = new TextClause(cp5.d.J(bVar), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        if (!cp5.d.z(bVar)) {
            textClause = null;
        }
        bw0.e eVar = error != null ? bw0.e.SuggestionsElseCalculator : bw0.e.SuggestionsWhenTextEmptyElseCalculator;
        dvd.a aVar = this.f309369c;
        if (error != null) {
            dvd.c cVar = (dvd.c) aVar;
            cVar.getClass();
            Intrinsics.checkNotNullParameter(error, "error");
            zwd.a aVarA2 = cVar.f118083a.a(error);
            listF0 = v.l(aVarA2 != null ? aVarA2.c(error) : null);
            j2 = j3;
        } else {
            dj0.d balance = domainState.e;
            ((dvd.c) aVar).getClass();
            Intrinsics.checkNotNullParameter(balance, "balance");
            if (balance.k()) {
                listF0 = f0.f322471a;
                j2 = j3;
            } else {
                j2 = j3;
                bw0.d dVar2 = new bw0.d(4, new MoneyClause(balance, new MoneyClause.Format.Defaults(null, null, true, false, 11), null, null, 12), new TextLocalisedClause(R$string.staking_keyboard_suggestion_all, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10));
                List list = dvd.c.f118082b;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                for (Iterator it8 = list.iterator(); it8.hasNext(); it8 = it8) {
                    int iIntValue = ((Number) it8.next()).intValue();
                    arrayList.add(new bw0.d(4, new MoneyClause(pyd.c.N(balance, iIntValue / 100.0f), new MoneyClause.Format.Defaults(null, null, true, false, 11), null, null, 12), new TextClause(a0.d.h(iIntValue, "%"), (Style) new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124)));
                }
                listF0 = d0.F0(dVar2, arrayList);
            }
            if (!cp5.d.z(bVar)) {
                listF0 = null;
            }
            if (listF0 == null) {
                listF0 = f0.f322471a;
            }
        }
        bw0.h hVar = new bw0.h(strD, strJ, textClause, true, (List) null, Boolean.TRUE, listF0, false, false, false, false, eVar, (Clause) null, false, 30608);
        bw0.m mVarD = (error == null || (error instanceof axd.a) || (aVarA = this.d.a(error)) == null) ? null : aVarA.d(error);
        m3 m3Var = m3.ON;
        k kVar = domainState.d;
        dj0.d dVar3 = cp5.d.z(bVar) ? kVar.f309352a : kVar.f309353b;
        CenteredAmountDelegate.Model model2 = new CenteredAmountDelegate.Model("CENTERED_AMOUNT_DELEGATE_LIST_ID", null, hVar, null, mVarD, null, new i3(m3Var, dVar3 != null ? new MoneyClause(dVar3, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4) : new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null), model == null, false, new i(((s80.b) this.f309368b).b(), bVar), null, 1314);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.crypto_staking_unstake_header_title, u.c(new CurrencyClause(domainState.f309356c, CurrencyClause.Format.Ticker.f57756a, null, 4)), null, 12);
        int i2 = R$string.crypto_staking_amount_info_staked_balance;
        List listC = u.c(new MoneyClause(domainState.e, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.SENSITIVE, 4));
        Custom custom = new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254);
        if (!(error instanceof axd.a)) {
            custom = null;
        }
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(i2, listC, custom, 8);
        CurrencyImage currencyImage = new CurrencyImage(str, (ImageTransformations) null, (TextLocalisedClause) null, 14);
        boolean z = j2 > 0 && error == null;
        Object[] elements = {model2, model};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new m(textLocalisedClause, textLocalisedClause2, currencyImage, textLocalisedClause, z, kotlin.collections.d.L(elements));
    }
}
