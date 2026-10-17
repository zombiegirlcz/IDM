package ebf;

import aw0.m6;
import aw0.n6;
import aw0.o9;
import aw0.t0;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferBroker;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferOutInstrument;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferOutSelectedAsset;
import com.revolut.feature.trading.transfer.investments.impl.R$string;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import com.revolut.shared.feature.wealth.ui_kit.models.image.InstrumentImage;
import e8e.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ox0.b0;
import z0h.q1;
import zhm.d0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class r implements cli.n {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kpj.f f124332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q1 f124333b;

    public r(kpj.f wealthAccountHeaderUiMapper, q1 wealthDisclaimersMapper) {
        Intrinsics.checkNotNullParameter(wealthAccountHeaderUiMapper, "wealthAccountHeaderUiMapper");
        Intrinsics.checkNotNullParameter(wealthDisclaimersMapper, "wealthDisclaimersMapper");
        this.f124332a = wealthAccountHeaderUiMapper;
        this.f124333b = wealthDisclaimersMapper;
    }

    public static CellDetailsDelegate.Model a(TextLocalisedClause textLocalisedClause) {
        return new CellDetailsDelegate.Model("TRANSFER_OUT_REVIEW_FROM_LIST_ID", new t0((Clause) new TextLocalisedClause(R$string.trading_stocks_transfer_progress_section_from, null, null, 14), (Image) null, 0, false, 30), textLocalisedClause, null, null, null, null, 0, null, false, false, null, null, 30712);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        qv0.i model;
        String str;
        h domainState = (h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        CellDetailsChevronDelegate.Model model2 = null;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.trading_stocks_transfer_progress_header_title_review_transfer, null, null, 14);
        int i = R$string.trading_stocks_transfer_progress_header_subtitle_to;
        TransferBroker transferBroker = domainState.f124322a;
        ArrayList<TransferOutSelectedAsset> arrayList = domainState.f124324c;
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(i, u.c(new TextClause(transferBroker.f91500a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
        Data data = domainState.f;
        aw0.e eVar = new aw0.e(true, data != null ? (Clause) iii.c.f(data, new y(24), new e6e.a(15), new dbg.b(this, 28)) : null, b0.ABOVE_BUTTONS, m6.c(n6.Companion, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_confirm, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, "transfer_out_review_confirm_button", false, null, null, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION), null, null, 48);
        aim.e eVarB = u.b();
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (TransferOutSelectedAsset transferOutSelectedAsset : arrayList) {
            TransferOutInstrument transferOutInstrument = transferOutSelectedAsset.f91517a;
            String strQ = j6.a.q("TRANSFER_OUT_REVIEW_ASSET_", transferOutInstrument.f91514a);
            TextClause textClause = new TextClause(transferOutInstrument.f91515b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(new InstrumentImage(transferOutInstrument.f91514a, 30, null, null), null, null, false, null, false, 62);
            NumberClause numberClause = new NumberClause(transferOutSelectedAsset.f91518b, (NumberClause.Format.Compact) null, (Custom) null, 6);
            xi0.a aVar = xi0.b.Companion;
            String str2 = transferOutInstrument.f91516c;
            aVar.getClass();
            arrayList2.add(new RowDelegate.Model(strQ, image40, textClause, null, 0, null, null, null, 0, new RowDelegate.Model.c.b(yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(numberClause, new CurrencyClause(xi0.a.a(str2), CurrencyClause.Format.Ticker.f57756a, null, 4))), null, null, false, 126), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869880));
        }
        yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
        eVarB.addAll(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            dj0.d dVar = ((TransferOutSelectedAsset) it8.next()).f91517a.f;
            if (dVar != null) {
                arrayList3.add(dVar);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList3) {
            xi0.b bVar = ((dj0.d) obj2).f115083b;
            Object arrayList4 = linkedHashMap.get(bVar);
            if (arrayList4 == null) {
                arrayList4 = new ArrayList();
                linkedHashMap.put(bVar, arrayList4);
            }
            ((List) arrayList4).add(obj2);
        }
        ArrayList arrayList5 = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            xi0.b bVar2 = (xi0.b) entry.getKey();
            Iterator it9 = ((List) entry.getValue()).iterator();
            long j2 = 0;
            while (it9.hasNext()) {
                j2 += ((dj0.d) it9.next()).f115082a;
                eVarB = eVarB;
            }
            arrayList5.add(new dj0.d(j2, bVar2));
        }
        aim.e eVar2 = eVarB;
        List listP0 = d0.P0(arrayList5, new q());
        if (listP0.isEmpty()) {
            model = new CellDetailsDelegate.Model("TRANSFER_OUT_REVIEW_FEES", new t0((Clause) new TextLocalisedClause(R$string.trading_stocks_transfer_progress_section_fees, null, null, 14), (Image) null, 0, false, 30), new TextLocalisedClause(R$string.trading_stocks_transfer_progress_section_fees_no_fees, null, null, 14), null, null, null, null, 0, null, false, false, null, null, 32760);
        } else {
            List list = listP0;
            ArrayList arrayList6 = new ArrayList(w.t(list, 10));
            Iterator it10 = list.iterator();
            while (it10.hasNext()) {
                arrayList6.add(new MoneyClause((dj0.d) it10.next(), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12));
            }
            model = new CellDetailsActionDelegate.Model("TRANSFER_OUT_REVIEW_FEES", new TextLocalisedClause(R$string.trading_stocks_transfer_progress_section_fees, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), yoj.b.m(new TextClause(" + ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), arrayList6), null, false, false, null, null, i.f124325a, 0, 0, 0, 0, 4192228);
        }
        qv0.i iVar = model;
        yp0.b.l(iVar, 0, 0, 0, 0, null, false, 63);
        eVar2.add(iVar);
        Data data2 = domainState.e;
        qv0.l[] elements = {data2 != null ? (qv0.l) iii.c.f(data2, new y(25), new e6e.a(this, 16), new dn8.k(domainState, this, 15)) : null, new CellDetailsDelegate.Model("TRANSFER_OUT_REVIEW_TO_LIST_ID", new t0((Clause) new TextLocalisedClause(R$string.trading_stocks_transfer_progress_section_to, null, null, 14), (Image) null, 0, false, 30), new TextClause(domainState.f124322a.f91500a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, 0, null, false, false, null, null, 30712)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        eVar2.addAll(listL);
        TradingAccount tradingAccount = domainState.d;
        if (tradingAccount instanceof TradingAccount.GIA) {
            str = "question.can-i-transfer-my-securities-to-another-broker";
        } else if (tradingAccount instanceof TradingAccount.TaxAdvantage.Isa) {
            str = "6e538fc-d1d5-4bbb-9c30-07537c94c749";
        } else if (tradingAccount instanceof TradingAccount.TaxAdvantage.JIsa) {
            str = "46018aa6-ef97-4921-aa70-e40b657c20c7";
        } else {
            if (!(tradingAccount instanceof TradingAccount.TaxAdvantage.Pea) && !(tradingAccount instanceof TradingAccount.Margin) && !(tradingAccount instanceof TradingAccount.MoneyMarketFunds) && !(tradingAccount instanceof TradingAccount.Robo) && !(tradingAccount instanceof TradingAccount.TaxAdvantage.Unknown) && !(tradingAccount instanceof TradingAccount.PaperTrading) && !(tradingAccount instanceof TradingAccount.Unknown)) {
                throw new NoWhenBranchMatchedException();
            }
            str = null;
        }
        if (str != null) {
            CellDetailsChevronDelegate.Model model3 = new CellDetailsChevronDelegate.Model("TRANSFER_OUT_REVIEW_GET_HELP_LIST_ID", new TextLocalisedClause(R$string.trading_stocks_transfer_progress_section_get_help, null, null, 14), 0, false, new j(str), null, null, 2028);
            yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
            model2 = model3;
        }
        if (model2 != null) {
            eVar2.add(model2);
        }
        Unit unit = Unit.f186387a;
        return new l(textLocalisedClause, textLocalisedClause2, eVar, u.a(eVar2));
    }
}
