package baf;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferBroker;
import com.revolut.feature.trading.transfer.investments.impl.R$string;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import ip0.iq;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class q implements cli.n {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n8b.a f14064a;

    public q(n8b.a countryInteractor) {
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        this.f14064a = countryInteractor;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) throws Throwable {
        InputTextDelegate.Model model;
        InputTextDelegate.Model model2;
        InputChecklistDelegate.Model model3;
        Clause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        i domainState = (i) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TransferBroker transferBroker = domainState.e;
        TradingAccount tradingAccount = domainState.f14055g;
        String str = domainState.f14052a;
        TextLocalisedClause textLocalisedClause3 = null;
        TextClause textClause = str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
        TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.trading_stocks_transfer_in_account_number, null, null, 14);
        u8f.h hVar = transferBroker.f91502c;
        String str2 = transferBroker.f91500a;
        u8f.h hVar2 = transferBroker.f91502c;
        u8f.h hVar3 = u8f.h.ISA;
        InputTextDelegate.Model model4 = new InputTextDelegate.Model("ACCOUNT_INFO_ACCOUNT_NUMBER", textClause, null, textLocalisedClause4, false, null, false, hVar == hVar3 ? new TextLocalisedClause(R$string.trading_stocks_transfer_in_account_number_isa_hint, null, null, 14) : null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -140, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        if (hVar == u8f.h.DTC || hVar == u8f.h.FOP) {
            String str3 = domainState.f14053b;
            model = new InputTextDelegate.Model("ACCOUNT_INFO_ACCOUNT_HOLDER_NAME", str3 != null ? new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, new TextLocalisedClause(R$string.trading_stocks_transfer_in_account_holder, null, null, 14), false, null, false, new TextLocalisedClause(R$string.trading_stocks_transfer_in_account_holder_hint, null, null, 14), null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -140, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        } else {
            model = null;
        }
        if (hVar != hVar3) {
            wi0.b bVar = domainState.f14054c;
            model2 = new InputTextDelegate.Model("ACCOUNT_INFO_BROKER_COUNTRY", bVar != null ? new TextClause(((o8b.c) this.f14064a).b(bVar.f297794a), (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, new TextLocalisedClause(R$string.trading_stocks_transfer_in_account_broker_country, null, null, 14), false, null, false, null, null, null, null, new ResourceImage(R$drawable.uikit_icn_16_chevron_down, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), null, false, null, null, false, false, true, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, h.f14051a, null, null, 0, 0, 0, 0, -34082828, 65023);
        } else {
            model2 = null;
        }
        if (hVar != hVar3) {
            model3 = new InputChecklistDelegate.Model("ACCOUNT_INFO_BROKER_CONTACTED", new TextLocalisedClause(R$string.trading_stocks_transfer_in_account_confirmation, null, null, 14), domainState.d, false, null, iq.CHECK_BUTTON, null, null, g.f14050a, null, 0, 0, 0, 523992);
            yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
        } else {
            model3 = null;
        }
        InputTextDelegate.Model[] elements = {model4, model, model2};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List<InputTextDelegate.Model> listL = kotlin.collections.d.L(elements);
        ArrayList arrayList = new ArrayList(w.t(listL, 10));
        for (InputTextDelegate.Model model5 : listL) {
            yp0.b.r(model5, 0, 0, 0, 0, 15);
            arrayList.add(model5);
        }
        aim.e eVarB = u.b();
        eVarB.addAll(arrayList);
        if (model3 != null) {
            eVarB.add(model3);
            Unit unit = Unit.f186387a;
        }
        aim.e eVarA = u.a(eVarB);
        int i = p.f14062a[domainState.f14056h.ordinal()];
        if (i == 1) {
            textLocalisedClause = new TextLocalisedClause(R$string.trading_stocks_transfer_broker_header_title, u.c(str2), null, 12);
        } else if (i == 2) {
            switch (hVar2 == null ? -1 : p.f14063b[hVar2.ordinal()]) {
                case -1:
                case 3:
                    textLocalisedClause = new TextLocalisedClause(R$string.trading_stocks_transfer_in_account_header_title, u.c(str2), null, 12);
                    break;
                case 0:
                default:
                    throw new NoWhenBranchMatchedException();
                case 1:
                case 2:
                    textLocalisedClause = new TextLocalisedClause(R$string.trading_stocks_transfer_in_account_header_acat_title, u.c(str2), null, 12);
                    break;
                case 4:
                case 5:
                    textLocalisedClause = new TextLocalisedClause(R$string.trading_stocks_transfer_in_account_header_dtc_title, null, null, 14);
                    break;
                case 6:
                    if (tradingAccount instanceof TradingAccount.TaxAdvantage.JIsa) {
                        TradingAccount.TaxAdvantage.JIsa jIsa = (TradingAccount.TaxAdvantage.JIsa) tradingAccount;
                        if (!(jIsa instanceof TradingAccount.TaxAdvantage.JIsa.Custodian)) {
                            if (!(jIsa instanceof TradingAccount.TaxAdvantage.JIsa.Personal)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            textLocalisedClause = new TextLocalisedClause(R$string.trading_stocks_transfer_in_account_header_personal_jisa_title, null, null, 14);
                        } else {
                            textLocalisedClause = new TextLocalisedClause(R$string.trading_stocks_transfer_in_account_header_jisa_title, u.c(((TradingAccount.TaxAdvantage.JIsa.Custodian) jIsa).f105237n.f105176b), null, 12);
                        }
                    } else {
                        textLocalisedClause = new TextLocalisedClause(R$string.trading_stocks_transfer_in_account_header_isa_title, null, null, 14);
                    }
                    break;
            }
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            hx7.e.n(new IllegalStateException("NONE direction is not available for broker selection"));
            textLocalisedClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        switch (hVar2 != null ? p.f14063b[hVar2.ordinal()] : -1) {
            case -1:
            case 3:
            case 4:
            case 5:
                textLocalisedClause2 = new TextLocalisedClause(R$string.trading_stocks_transfer_in_account_header_subtitle, null, null, 14);
                textLocalisedClause3 = textLocalisedClause2;
                return new m(textLocalisedClause, textLocalisedClause3, domainState.f, eVarA);
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
            case 2:
                textLocalisedClause2 = new TextLocalisedClause(R$string.trading_stocks_transfer_in_account_header_acat_subtitle, null, null, 14);
                textLocalisedClause3 = textLocalisedClause2;
                return new m(textLocalisedClause, textLocalisedClause3, domainState.f, eVarA);
            case 6:
                if (tradingAccount instanceof TradingAccount.TaxAdvantage.Isa) {
                    textLocalisedClause2 = new TextLocalisedClause(R$string.trading_stocks_transfer_in_account_header_isa_subtitle, null, null, 14);
                    textLocalisedClause3 = textLocalisedClause2;
                }
                return new m(textLocalisedClause, textLocalisedClause3, domainState.f, eVarA);
        }
    }
}
