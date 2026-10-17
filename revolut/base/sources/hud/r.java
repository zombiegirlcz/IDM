package hud;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.staking.api.R$plurals;
import com.revolut.feature.staking.api.R$string;
import com.revolut.feature.staking.api.model.StakingInfo;
import com.revolut.feature.staking.api.model.StakingModes;
import com.revolut.feature.staking.api.model.StakingPocket;
import com.revolut.feature.staking.api.model.StakingProduct;
import com.revolut.feature.staking.impl.confirmation.StakingConfirmationControllerContract$Parcel$Unstaking;
import com.revolut.feature.staking.impl.confirmation.StakingConfirmationControllerContract$Parcel$Warmup;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import hu1.h0;
import ip0.y10;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class r implements cli.n {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wwd.d f155641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xud.b f155642b;

    public r(wwd.d tiersRateItemMapper, xud.b highRiskTokenItemProvider) {
        Intrinsics.checkNotNullParameter(tiersRateItemMapper, "tiersRateItemMapper");
        Intrinsics.checkNotNullParameter(highRiskTokenItemProvider, "highRiskTokenItemProvider");
        this.f155641a = tiersRateItemMapper;
        this.f155642b = highRiskTokenItemProvider;
    }

    public static dj0.d a(i iVar) {
        OrderQuote orderQuote;
        Amount amount;
        Data data = iVar.d;
        return (data == null || (orderQuote = (OrderQuote) data.getContent()) == null || (amount = orderQuote.f) == null) ? iVar.f155625b : a.a.L(amount);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        TextLocalisedClause textLocalisedClause;
        char c2;
        sa saVar;
        Collection collection;
        CellDetailsActionDelegate.Model modelB;
        Address address;
        int i;
        i domainState = (i) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.crypto_staking_review_screen_confirm, null, null, 14);
        Data data = domainState.d;
        StakingProduct product = domainState.f;
        boolean z = data != null && (data.getContent() != null || (data.getError() == null && !data.getLoading()));
        boolean z3 = data != null && data.getLoading();
        MoneyClause moneyClause = new MoneyClause(a(domainState), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
        CurrencyImage currencyImage = new CurrencyImage(a(domainState).f115083b.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14);
        boolean z4 = z;
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.crypto_staking_review_screen_subtitle, null, null, 14);
        sh5.c cVar = domainState.i;
        Clause clause = cVar != null ? cVar.f263435a : null;
        aim.e eVarB = u.b();
        ((xud.c) this.f155642b).getClass();
        Intrinsics.checkNotNullParameter(product, "product");
        StakingModes.Manual manual = product.f88088c.f88071a;
        if (manual == null || (i = manual.f88078c) <= 0) {
            textLocalisedClause = textLocalisedClause2;
            c2 = 0;
            saVar = null;
        } else {
            c2 = 0;
            textLocalisedClause = textLocalisedClause2;
            sa saVar2 = new sa("HIGH_RISK_LIST_ITEM_ID", (Clause) new TextLocalisedQuantityClause(R$plurals.staking_high_risk_v2_title, Integer.valueOf(i), (List) null, (Style) null, 28), (Clause) new TextLocalisedClause(R$string.staking_high_risk_v2_description, u.c(new TextLocalisedQuantityClause(R$plurals.staking_unstake_lockup_days, Integer.valueOf(i), (List) null, (Style) null, 28)), null, 12), (List) null, false, (Image) new ResourceImage(R$drawable.uikit_icn_24_warning, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorStatusWarning), (List) null, (ImageTransformations) null, (Clause) null, 246), (y10) null, (Object) null, 4040);
            yp0.b.l(saVar2, 0, 0, 0, 0, null, false, 63);
            saVar = saVar2;
        }
        if (saVar != null) {
            eVarB.add(saVar);
        }
        if (data == null || (collection = (List) iii.c.f(data, new h0(this), new ht1.l(6), new hnc.a(4, domainState, this))) == null) {
            collection = f0.f322471a;
        }
        eVarB.addAll(collection);
        StakingPocket stakingPocket = domainState.e;
        dj0.d dVarA = a(domainState);
        xi0.b bVar = dVarA.f115083b;
        xi0.b bVar2 = product.d;
        StakingInfo stakingInfo = product.f88087b;
        if (Intrinsics.f(bVar, bVar2)) {
            dj0.d dVarO = pyd.c.O(dVarA, stakingPocket != null ? stakingPocket.f88083c : null);
            do3.n nVar = domainState.f155628h;
            modelB = this.f155641a.b(product, dVarO, (nVar == null || (address = nVar.k) == null) ? null : nz8.d.g(address));
        } else {
            modelB = null;
        }
        int i2 = stakingInfo.f88061b;
        CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("WARM_UP_ITEM_LIST_ID", new TextLocalisedClause(R$string.crypto_staking_review_screen_warm_up_period, null, null, 14), new TextLocalisedQuantityClause(R$plurals.staking_exchange_warmup_days, Integer.valueOf(i2), (List) null, (Style) null, 28), null, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), false, 0, null, new StakingConfirmationControllerContract$Parcel$Warmup(i2), null, null, 0, null, true, null, 0, 0, 0, 0, 1031656);
        int i3 = stakingInfo.f88062c;
        CellDetailsDelegate.Model model2 = i3 == 0 ? null : new CellDetailsDelegate.Model("UNSTAKING_PERIOD_ITEM_LIST_ID", new TextLocalisedClause(R$string.crypto_staking_review_screen_unstaking_period, null, null, 14), new TextLocalisedQuantityClause(R$plurals.staking_unstake_v2_lockup_days, Integer.valueOf(i3), (List) null, (Style) null, 28), null, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), false, 0, null, new StakingConfirmationControllerContract$Parcel$Unstaking(i3), null, null, 0, null, true, null, 0, 0, 0, 0, 1031656);
        qv0.i[] elements = new qv0.i[3];
        elements[c2] = modelB;
        elements[1] = model;
        elements[2] = model2;
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        eVarB.addAll(listL);
        od0.i iVar = (od0.i) domainState.k.getContent();
        eVarB.addAll(v.l(iVar != null ? (qv0.i) iVar.g() : null));
        eVarB.addAll(domainState.f155629j);
        Unit unit = Unit.f186387a;
        return new j(textLocalisedClause, z4, z3, moneyClause, currencyImage, textLocalisedClause3, clause, u.a(eVarB));
    }
}
