package cf5;

import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int a(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        String str = currency.f306286a;
        switch (str.hashCode()) {
            case -1790039479:
                if (str.equals("X:8:POL")) {
                    return R$attr.uikit_colorPurple;
                }
                break;
            case -1790036413:
                if (str.equals("X:8:SUI")) {
                    return R$attr.uikit_colorTeal;
                }
                break;
            case 64638:
                if (str.equals("ADA")) {
                    return R$attr.uikit_colorGreen;
                }
                break;
            case 67881:
                if (str.equals("DOT")) {
                    return R$attr.uikit_colorRed;
                }
                break;
            case 68985:
                if (str.equals("ETH")) {
                    return R$attr.uikit_colorBlue;
                }
                break;
            case 72645:
                if (str.equals("INJ")) {
                    return R$attr.uikit_colorBlue;
                }
                break;
            case 74725:
                if (str.equals("KSM")) {
                    return R$attr.uikit_colorPink;
                }
                break;
            case 82288:
                if (str.equals("SOL")) {
                    return R$attr.uikit_colorPink;
                }
                break;
            case 83052:
                if (str.equals("TIA")) {
                    return R$attr.uikit_colorDeepGrey;
                }
                break;
            case 83251:
                if (str.equals("TON")) {
                    return R$attr.uikit_colorCyan;
                }
                break;
            case 83354:
                if (str.equals("TRX")) {
                    return R$attr.uikit_colorTeal;
                }
                break;
            case 87262:
                if (str.equals("XTZ")) {
                    return R$attr.uikit_colorYellow;
                }
                break;
            case 2011731:
                if (str.equals("ALGO")) {
                    return R$attr.uikit_colorDeepGrey;
                }
                break;
            case 2019665:
                if (str.equals("ATOM")) {
                    return R$attr.uikit_colorOrange;
                }
                break;
            case 2392104:
                if (str.equals("NEAR")) {
                    return R$attr.uikit_colorCyan;
                }
                break;
            case 2435718:
                if (str.equals("OSMO")) {
                    return R$attr.uikit_colorBrown;
                }
                break;
        }
        return R$attr.uikit_colorIndigo;
    }
}
