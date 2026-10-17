package ss4;

import android.os.Parcelable;
import aw0.n6;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.rev_points.giftcards.impl.ui.screen.downloadcards.RevPointsGiftcardsDownloadScreenContract$ModalStep;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.lounge_details.a;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccounts;
import d9.t0;
import grl.k9;
import java.math.BigDecimal;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import jsl.h0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class a0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f265266a;

    public /* synthetic */ a0(int i) {
        this.f265266a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object data) {
        boolean z = false;
        switch (this.f265266a) {
            case 0:
                Function1 defaultErrorItems = (Function1) data;
                Intrinsics.checkNotNullParameter(defaultErrorItems, "defaultErrorItems");
                return new q(new p(new TextLocalisedClause(R$string.credit_card_instalment_repay_amount_title, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false), (List) defaultErrorItems.invoke(new iii.d(14, null, true, false, null)), new o(null, false, false));
            case 1:
                Throwable th10 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                if (th10 != null) {
                    return d0.a(new TextLocalisedClause(R$string.credit_common_error_title, null, null, 14));
                }
                return null;
            case 2:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return h0.f178214a;
            case 3:
                Function1 getDefaultErrorItems = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return new su4.l((List) getDefaultErrorItems.invoke(new iii.d(14, null, true, false, null)));
            case 4:
                Function1 getDefaultErrorItems2 = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return (List) getDefaultErrorItems2.invoke(ivi.a.f168867a);
            case 5:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return null;
            case 6:
                Function1 items = (Function1) data;
                Intrinsics.checkNotNullParameter(items, "items");
                return (List) items.invoke(new iii.d(10, null, true, false, "id_credit_card_statement_error_upcoming_payments"));
            case 7:
                Function1 getDefaultErrorItems3 = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return (List) getDefaultErrorItems3.invoke(new iii.d(12, null, false, true, null));
            case 8:
                Function1 getDefaultErrorItems4 = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                return (List) getDefaultErrorItems4.invoke(new iii.d(12, null, true, true, null));
            case 9:
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                RevPointsGiftcardsDownloadScreenContract$ModalStep step = (RevPointsGiftcardsDownloadScreenContract$ModalStep) data;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (!Intrinsics.f(step, RevPointsGiftcardsDownloadScreenContract$ModalStep.NotAvailable.f83698a)) {
                    throw new NoWhenBranchMatchedException();
                }
                lw0.a aVar = new lw0.a(new TextLocalisedClause(com.revolut.feature.rev_points.giftcards.api.R$string.gift_cards_download_screen_unavailable_section_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.rev_points.giftcards.api.R$string.gift_cards_download_screen_unavailable_section_description, null, null, 14), null, null, false, 28);
                aw0.e eVar = new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.feature.rev_points.giftcards.api.R$string.gift_cards_download_screen_unavailable_section_action_title, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
                k9 k9Var = k9.GiftCards;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                return new ActionsBottomSheetController(new dii.a(aVar, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
            case 10:
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                pwg.h portfolioInsightsCollectionIndicator = (pwg.h) data;
                Intrinsics.checkNotNullParameter(null, "params");
                Intrinsics.checkNotNullParameter(portfolioInsightsCollectionIndicator, "portfolioInsightsCollectionIndicator");
                throw null;
            case 11:
                Throwable error = (Throwable) obj2;
                JuniorBankingProfile juniorBankingProfile = (JuniorBankingProfile) data;
                Intrinsics.checkNotNullParameter(error, "error");
                if (juniorBankingProfile == null) {
                    return error;
                }
                return null;
            case 12:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return f0.f322471a;
            case 13:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return null;
            case 14:
                nel.n instrument = (nel.n) obj2;
                mwg.f bond = (mwg.f) data;
                Intrinsics.checkNotNullParameter(instrument, "instrument");
                Intrinsics.checkNotNullParameter(bond, "contributor");
                int i = sxg.b.f266485a[instrument.f214597c.ordinal()];
                if (i == 1) {
                    String assetName = instrument.d;
                    String ref2 = instrument.f214596b;
                    String symbol = instrument.e;
                    Intrinsics.checkNotNullParameter(bond, "bond");
                    Intrinsics.checkNotNullParameter(assetName, "assetName");
                    Intrinsics.checkNotNullParameter(ref2, "ref");
                    Intrinsics.checkNotNullParameter(symbol, "symbol");
                    return new rxg.a(symbol, ref2, assetName, bond.d, bond.e, bond.f209456g);
                }
                if (i == 2) {
                    String assetName2 = instrument.d;
                    String ref3 = instrument.f214596b;
                    String symbol2 = instrument.e;
                    Intrinsics.checkNotNullParameter(bond, "fund");
                    Intrinsics.checkNotNullParameter(assetName2, "assetName");
                    Intrinsics.checkNotNullParameter(ref3, "ref");
                    Intrinsics.checkNotNullParameter(symbol2, "symbol");
                    return new rxg.f(symbol2, ref3, assetName2, bond.d, bond.e, bond.f209456g);
                }
                if (i != 3) {
                    String assetName3 = instrument.d;
                    String ref4 = instrument.f214596b;
                    String symbol3 = instrument.e;
                    Intrinsics.checkNotNullParameter(bond, "stock");
                    Intrinsics.checkNotNullParameter(assetName3, "assetName");
                    Intrinsics.checkNotNullParameter(ref4, "ref");
                    Intrinsics.checkNotNullParameter(symbol3, "symbol");
                    return new rxg.i(symbol3, ref4, assetName3, bond.d, bond.e, bond.f209456g);
                }
                String assetName4 = instrument.d;
                String ref5 = instrument.f214596b;
                String symbol4 = instrument.e;
                Intrinsics.checkNotNullParameter(bond, "cfd");
                Intrinsics.checkNotNullParameter(assetName4, "assetName");
                Intrinsics.checkNotNullParameter(ref5, "ref");
                Intrinsics.checkNotNullParameter(symbol4, "symbol");
                dj0.d dVar = bond.d;
                Float f = bond.f;
                return new rxg.b(symbol4, ref5, assetName4, dVar, f != null ? f.floatValue() : bond.e, bond.f209456g);
            case 15:
                nel.n instrument2 = (nel.n) obj2;
                mwg.f cfdPosition = (mwg.f) data;
                Intrinsics.checkNotNullParameter(instrument2, "instrument");
                Intrinsics.checkNotNullParameter(cfdPosition, "contributor");
                BigDecimal quantity = cfdPosition.k;
                if (quantity == null) {
                    return null;
                }
                String assetName5 = instrument2.d;
                String ref6 = instrument2.f214596b;
                String symbol5 = instrument2.e;
                ej0.b bVar = cfdPosition.i;
                dj0.d dVarD = bVar != null ? t0.D(bVar, instrument2) : null;
                String str = cfdPosition.f209458j;
                Intrinsics.checkNotNullParameter(cfdPosition, "cfdPosition");
                Intrinsics.checkNotNullParameter(assetName5, "assetName");
                Intrinsics.checkNotNullParameter(ref6, "ref");
                Intrinsics.checkNotNullParameter(symbol5, "symbol");
                Intrinsics.checkNotNullParameter(quantity, "quantity");
                dj0.d dVar2 = cfdPosition.d;
                Float f4 = cfdPosition.f;
                return new rxg.c(symbol5, ref6, assetName5, dVarD, str, quantity, dVar2, f4 != null ? f4.floatValue() : cfdPosition.e, cfdPosition.f209456g);
            case 16:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return null;
            case 17:
                Function1 getDefaultErrorItems5 = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems5, "getDefaultErrorItems");
                return (List) getDefaultErrorItems5.invoke(new iii.d(8, null, true, true, "ID_ERROR_ITEM"));
            case 18:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return a.c.f99111a;
            case 19:
                Function1 getDefaultErrorItems6 = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems6, "getDefaultErrorItems");
                return (List) getDefaultErrorItems6.invoke(new iii.d(12, null, true, true, null));
            case 20:
                Throwable error2 = (Throwable) obj2;
                u09.f fVar = (u09.f) data;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (fVar == null) {
                    return error2;
                }
                return null;
            case 21:
                Throwable error3 = (Throwable) obj2;
                u09.q qVar = (u09.q) data;
                Intrinsics.checkNotNullParameter(error3, "error");
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, error3, h0Var);
                if (qVar == null) {
                    return error3;
                }
                return null;
            case 22:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                int iIntValue = ((Integer) data).intValue();
                if (!zBooleanValue && iIntValue < 1) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 23:
                Throwable th11 = (Throwable) obj2;
                if (((TradingAccounts) data) == null) {
                    return th11;
                }
                return null;
            case 24:
                Throwable th12 = (Throwable) obj2;
                if (((od0.i) data) == null) {
                    return th12;
                }
                return null;
            case 25:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.FALSE;
            case 26:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof syl.d);
            case 27:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof syl.h);
            case 28:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.FALSE;
            default:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof syl.m);
        }
    }

    public /* synthetic */ a0(Object obj2, int i) {
        this.f265266a = i;
    }
}
