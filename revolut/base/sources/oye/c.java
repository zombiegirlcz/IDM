package oye;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ConfigurableResourceImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.domain.models.topup.methods.TopupMethod;
import com.revolut.domain.models.topup.methods.TopupMethodType;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final class c {
    public c(sze.d imageFactory) {
        Intrinsics.checkNotNullParameter(imageFactory, "imageFactory");
    }

    public final Image a(TopupMethod topUpMethod) {
        Intrinsics.checkNotNullParameter(topUpMethod, "topUpMethod");
        if (topUpMethod instanceof TopupMethod.StoredMethod.Card) {
            return sze.d.a(R$drawable.uikit_icn_24_card);
        }
        if ((topUpMethod instanceof TopupMethod.StoredMethod.PixSmartTransfer) || (topUpMethod instanceof TopupMethod.StoredMethod.Openbanking) || (topUpMethod instanceof TopupMethod.StoredMethod.GmoPgBankDirect)) {
            return sze.d.a(R$drawable.uikit_icn_24_bank);
        }
        if (topUpMethod instanceof TopupMethod.StoredMethod.PayTo) {
            return sze.d.a(R$drawable.uikit_icn_24_payto);
        }
        if (topUpMethod instanceof TopupMethod.StoredMethod.UpiApp) {
            return sze.d.a(R$drawable.uikit_icn_24_upi);
        }
        if (!(topUpMethod instanceof TopupMethod.StoredMethod.NetBanking) && !(topUpMethod instanceof TopupMethod.StoredMethod.Akahu)) {
            if (!(topUpMethod instanceof TopupMethod.OtherMethod)) {
                if (topUpMethod instanceof TopupMethod.SuggestedMethod.OpenBankingInstitution) {
                    return sze.d.a(R$drawable.uikit_icn_24_bank);
                }
                if (!(topUpMethod instanceof TopupMethod.SuggestedMethod)) {
                    throw new NoWhenBranchMatchedException();
                }
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("No fallback image intended for type, as method can't be selected " + topUpMethod);
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
                return sze.d.a(R$drawable.uikit_icn_24_bank);
            }
            TopupMethodType topupMethodType = ((TopupMethod.OtherMethod) topUpMethod).f60440a;
            switch (b.f231027a[topupMethodType.ordinal()]) {
                case 1:
                    return sze.d.a(R$drawable.uikit_icn_24_cash);
                case 2:
                    return sze.d.a(R$drawable.uikit_icn_24_cheque);
                case 3:
                    return new ConfigurableResourceImage(R$drawable.uikit_icn_payment_scheme_google_pay, null, null, null, 1022);
                case 4:
                    return sze.d.a(R$drawable.uikit_icn_24_card);
                case 5:
                case 6:
                case 7:
                    return sze.d.a(R$drawable.uikit_icn_24_bank);
                case 8:
                case 9:
                    return sze.d.a(R$drawable.uikit_icn_24_revolut);
                case 10:
                    return sze.d.a(R$drawable.uikit_icn_24_repayment);
                case 11:
                    return zw1.a.a();
                case 12:
                case 13:
                    return sze.d.a(R$drawable.uikit_icn_24_logo_pix_outline);
                case 14:
                    return sze.d.a(R$drawable.uikit_icn_24_payto);
                case 15:
                case 16:
                    return sze.d.a(R$drawable.uikit_icn_24_upi_2);
                case 17:
                case 18:
                    return sze.d.a(R$drawable.uikit_icn_24_bank);
                case 19:
                    return sze.d.a(R$drawable.uikit_icn_24_paynow_brand_mark);
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("No fallback image intended for type, as method can't be selected " + topupMethodType);
                    h0 h0Var2 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException2, h0Var2);
                    return sze.d.a(R$drawable.uikit_icn_24_bank);
                case 27:
                    return sze.d.a(R$drawable.uikit_icn_24_pse);
                case 28:
                    return sze.d.a(R$drawable.uikit_icn_24_bre_b);
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        return sze.d.a(R$drawable.uikit_icn_24_bank);
    }
}
