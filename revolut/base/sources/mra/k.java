package mra;

import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class k {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final int a(String scheme) {
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        String lowerCase = scheme.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        switch (lowerCase.hashCode()) {
            case -2038717326:
                if (lowerCase.equals("mastercard")) {
                    return R$drawable.uikit_icn_24_logo_mc;
                }
                break;
            case -1331704771:
                if (lowerCase.equals("diners")) {
                    return R$drawable.uikit_icn_24_logo_diners_club_colour;
                }
                break;
            case 105033:
                if (lowerCase.equals("jcb")) {
                    return R$drawable.uikit_icn_24_logo_jcb_colour;
                }
                break;
            case 2997727:
                if (lowerCase.equals("amex")) {
                    return R$drawable.uikit_icn_24_logo_amex;
                }
                break;
            case 3619905:
                if (lowerCase.equals("visa")) {
                    return R$drawable.uikit_icn_24_logo_visa_colour;
                }
                break;
            case 273184745:
                if (lowerCase.equals("discover")) {
                    return R$drawable.uikit_icn_24_logo_discover_colour;
                }
                break;
            case 827497775:
                if (lowerCase.equals("maestro")) {
                    return R$drawable.uikit_icn_24_logo_ma;
                }
                break;
        }
        return R$drawable.uikit_icn_24_card_number;
    }
}
