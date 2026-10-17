package kme;

import com.revolut.core.ui_kit_resources.R$drawable;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements b {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static int a(h19.c cVar) {
        switch (d.f185789a[cVar.ordinal()]) {
            case 1:
                return R$drawable.uikit_icn_24_plane_arrows_left_right;
            case 2:
                return R$drawable.uikit_icn_24_resort;
            case 3:
                return R$drawable.uikit_icn_24_voucher;
            case 4:
                return R$drawable.uikit_icn_24_sim_card;
            case 5:
                return R$drawable.uikit_icn_24_shopping;
            case 6:
                return R$drawable.uikit_icn_24_lounges;
            case 7:
                return R$drawable.uikit_icn_24_turbo_transfer;
            case 8:
                return R$drawable.uikit_icn_24_heart;
            case 9:
                return R$drawable.uikit_icn_24_insurance;
            case 10:
                return R$drawable.uikit_icn_24_present;
            case 11:
                return R$drawable.uikit_icn_24_rev_points;
            case 12:
                return R$drawable.uikit_icn_24_transport;
            case 13:
                return R$drawable.uikit_icn_24_travel;
            case 14:
                return R$drawable.uikit_icn_24_airplane_car;
            case 15:
                return R$drawable.uikit_icn_24_suitcase;
            case 16:
                return R$drawable.uikit_icn_24_lightning;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
