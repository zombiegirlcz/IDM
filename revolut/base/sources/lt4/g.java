package lt4;

import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.card.api.models.presentation.CreditCardModelAction;
import com.revolut.feature.credit.card.api.models.presentation.CreditCardModelParcel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public abstract class g {
    public static final LargeActionButton.ButtonStyle.DefaultFilledButton a(tl4.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        int i = f.f199796c[aVar.ordinal()];
        if (i == 1) {
            return LargeActionButton.ButtonStyle.f58725a;
        }
        if (i == 2) {
            return LargeActionButton.ButtonStyle.f58726b;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int b(tl4.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        int i = f.f199795b[cVar.ordinal()];
        if (i == 1) {
            return R$attr.uikit_colorStatusSuccess;
        }
        if (i == 2) {
            return R$attr.uikit_colorStatusWarning;
        }
        if (i == 3) {
            return R$attr.uikit_colorGreyTone50;
        }
        if (i == 4) {
            return R$attr.uikit_colorStatusDanger;
        }
        if (i == 5) {
            return R$attr.uikit_colorForeground;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int c(tl4.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        switch (f.f199794a[dVar.ordinal()]) {
            case 1:
                return R$drawable.uikit_icn_24_time;
            case 2:
                return R$drawable.uikit_icn_24_check_success;
            case 3:
                return R$drawable.uikit_icn_24_check;
            case 4:
                return R$drawable.uikit_icn_24_exclamation_mark;
            case 5:
                return R$drawable.uikit_icn_24_fees;
            case 6:
                return R$drawable.uikit_icn_24_pencil;
            case 7:
                return R$drawable.uikit_icn_24_info;
            case 8:
                return R$drawable.uikit_icn_24_coins;
            case 9:
                return R$drawable.uikit_icn_24_info_outline;
            case 10:
                return R$drawable.uikit_icn_24_reverted;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final CreditCardModelParcel d(CreditCardModelAction creditCardModelAction) {
        Intrinsics.checkNotNullParameter(creditCardModelAction, "<this>");
        if (creditCardModelAction instanceof CreditCardModelAction.Contextual) {
            return new CreditCardModelParcel.ContextualParcel(((CreditCardModelAction.Contextual) creditCardModelAction).f68847a);
        }
        if (creditCardModelAction instanceof CreditCardModelAction.Deeplink) {
            CreditCardModelAction.Deeplink deeplink = (CreditCardModelAction.Deeplink) creditCardModelAction;
            return new CreditCardModelParcel.DeeplinkParcel(deeplink.f68848a, deeplink.f68849b);
        }
        if (creditCardModelAction instanceof CreditCardModelAction.Dialogue) {
            return new CreditCardModelParcel.DialogParcel(((CreditCardModelAction.Dialogue) creditCardModelAction).f68850a);
        }
        throw new NoWhenBranchMatchedException();
    }
}
