package yxc;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import zhm.r0;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements z9l.b, z9l.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f317642a = r0.k(new Pair("AWAITING_GREY", aal.a.AWAITING_GREY), new Pair("AWAITING_ORANGE", aal.a.AWAITING_ORANGE), new Pair("CANCELLED", aal.a.CANCELLED), new Pair("CHECK_BLUE", aal.a.CHECK_BLUE), new Pair("CHECK_GREEN", aal.a.CHECK_GREEN), new Pair("EDIT", aal.a.EDIT), new Pair("ERROR", aal.a.ERROR), new Pair("EXPIRED", aal.a.EXPIRED), new Pair("INCOME", aal.a.INCOME), new Pair("INFO", aal.a.INFO), new Pair("LOCKED", aal.a.LOCKED), new Pair("OUTGOING", aal.a.OUTGOING), new Pair("PENDING_BLUE", aal.a.PENDING_BLUE), new Pair("PENDING_GREY", aal.a.PENDING_GREY), new Pair("RECURRING", aal.a.RECURRING), new Pair("REVERT", aal.a.REVERT), new Pair("SUSPICIOUS_ORANGE", aal.a.SUSPICIOUS_ORANGE), new Pair("SUSPICIOUS_RED", aal.a.SUSPICIOUS_RED), new Pair("TOPUP", aal.a.TOPUP));

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
    public final aal.a a(String badgeName) {
        Intrinsics.checkNotNullParameter(badgeName, "badgeName");
        String upperCase = badgeName.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return (aal.a) u1.v(upperCase, this.f317642a);
    }

    public final LayeredImage b(aal.a badge) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(badge, "badge");
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        int[] iArr = c.f317641a;
        switch (iArr[badge.ordinal()]) {
            case 1:
                i = R$drawable.uikit_icn_16_sand_watch;
                break;
            case 2:
                i = R$drawable.uikit_icn_16_sand_watch;
                break;
            case 3:
                i = R$drawable.uikit_icn_24_reverted;
                break;
            case 4:
                i = R$drawable.uikit_icn_16_check;
                break;
            case 5:
                i = R$drawable.uikit_icn_16_check;
                break;
            case 6:
                i = R$drawable.uikit_icn_24_pencil;
                break;
            case 7:
                i = R$drawable.uikit_icn_16_cross_small;
                break;
            case 8:
                i = R$drawable.uikit_icn_16_status_clock_arrows;
                break;
            case 9:
                i = R$drawable.uikit_icn_10_badge_left;
                break;
            case 10:
                i = R$drawable.uikit_icn_24_info_sign;
                break;
            case 11:
                i = R$drawable.uikit_icn_24_lock_closed;
                break;
            case 12:
                i = R$drawable.uikit_icn_10_badge_right;
                break;
            case 13:
                i = R$drawable.uikit_icn_16_status_clock_arrows;
                break;
            case 14:
                i = R$drawable.uikit_icn_16_status_clock_arrows;
                break;
            case 15:
                i = R$drawable.uikit_icn_16_arrow_repeat;
                break;
            case 16:
                i = R$drawable.uikit_icn_24_revert_left;
                break;
            case 17:
                i = R$drawable.uikit_icn_16_exclamation_mark_sign;
                break;
            case 18:
                i = R$drawable.uikit_icn_16_exclamation_mark_sign;
                break;
            case 19:
                i = R$drawable.uikit_icn_16_plus;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        switch (iArr[badge.ordinal()]) {
            case 1:
                i2 = R$attr.uikit_colorGreyTone50;
                break;
            case 2:
                i2 = R$attr.uikit_colorOrange;
                break;
            case 3:
                i2 = R$attr.uikit_colorDeepGrey;
                break;
            case 4:
                i2 = R$attr.uikit_colorAccent;
                break;
            case 5:
                i2 = R$attr.uikit_colorGreen;
                break;
            case 6:
                i2 = R$attr.uikit_colorAccent;
                break;
            case 7:
                i2 = R$attr.uikit_colorRed;
                break;
            case 8:
                i2 = R$attr.uikit_colorOrange;
                break;
            case 9:
                i2 = R$attr.uikit_colorAccent;
                break;
            case 10:
                i2 = R$attr.uikit_colorOrange;
                break;
            case 11:
                i2 = R$attr.uikit_colorGreyTone50;
                break;
            case 12:
                i2 = R$attr.uikit_colorAccent;
                break;
            case 13:
                i2 = R$attr.uikit_colorAccent;
                break;
            case 14:
                i2 = R$attr.uikit_colorGreyTone50;
                break;
            case 15:
                i2 = R$attr.uikit_colorAccent;
                break;
            case 16:
                i2 = R$attr.uikit_colorAccent;
                break;
            case 17:
                i2 = R$attr.uikit_colorOrange;
                break;
            case 18:
                i2 = R$attr.uikit_colorRed;
                break;
            case 19:
                i2 = R$attr.uikit_colorAccent;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        int i3 = R$attr.uikit_colorWidgetBackground;
        int i5 = iArr[badge.ordinal()];
        return LayeredImage.Companion.f(companion, i, i2, i3, null, 4.0f, BitmapDescriptorFactory.HUE_RED, (i5 == 3 || i5 == 6 || i5 == 16 || i5 == 10 || i5 == 11) ? Float.valueOf(12.0f) : null, 40);
    }
}
