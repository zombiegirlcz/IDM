package thf;

import bnf.o;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.models.badge.CircleIconBadge;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import do3.n;
import java.util.Map;
import k71.q;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;
import zhm.r0;

/* JADX INFO: loaded from: classes8.dex */
public interface d {
    static /* synthetic */ Image a(d dVar, a3 a3Var, Map map, Map map2, r61.c cVar, Map map3, n nVar, Map map4, Map map5, Map map6, Map map7, Map map8, int i) {
        r61.c cVarA;
        Map mapG = (i & 4) != 0 ? r0.g() : map2;
        if ((i & 8) != 0) {
            r61.c.Companion.getClass();
            cVarA = r61.b.a();
        } else {
            cVarA = cVar;
        }
        return ((o) dVar).n(a3Var, map, mapG, cVarA, (i & 16) != 0 ? r0.g() : map3, (i & 32) != 0 ? null : nVar, (i & 64) != 0 ? r0.g() : map4, (i & 128) != 0 ? r0.g() : map5, (i & 256) != 0 ? r0.g() : map6, (i & 512) != 0 ? r0.g() : map7, (i & 1024) != 0 ? r0.g() : map8);
    }

    static /* synthetic */ CircleIconBadge c(d dVar, a3 a3Var, String str, Map map, Map map2, Map map3, int i) {
        if ((i & 2) != 0) {
            str = null;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            map = r0.g();
        }
        Map map4 = map;
        if ((i & 8) != 0) {
            map2 = r0.g();
        }
        Map map5 = map2;
        if ((i & 16) != 0) {
            map3 = r0.g();
        }
        return ((o) dVar).w(a3Var, str2, map4, map5, map3);
    }

    static LayeredImage d(d dVar, a3 transaction) {
        o oVar = (o) dVar;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        bnf.j jVar = oVar.f17155h;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Map cryptoActionRequiredDeposits = r0.g();
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(cryptoActionRequiredDeposits, "cryptoActionRequiredDeposits");
        bnf.g gVarA = jVar.a(null, cryptoActionRequiredDeposits, transaction, false);
        if (gVarA == null) {
            return null;
        }
        switch (bnf.i.f17145c[gVarA.ordinal()]) {
            case 1:
                LayeredImage.Companion companion = LayeredImage.INSTANCE;
                int i = R$drawable.uikit_icn_10_badge_left;
                int i2 = R$attr.uikit_colorPopoverBackground;
                return LayeredImage.Companion.f(companion, i, R$attr.uikit_colorAccentNeutral, i2, Integer.valueOf(i2), 3.0f, BitmapDescriptorFactory.HUE_RED, null, 96);
            case 2:
                LayeredImage.Companion companion2 = LayeredImage.INSTANCE;
                int i3 = R$drawable.uikit_icn_10_badge_right;
                int i5 = R$attr.uikit_colorPopoverBackground;
                return LayeredImage.Companion.f(companion2, i3, R$attr.uikit_colorAccentNeutral, i5, Integer.valueOf(i5), 3.0f, BitmapDescriptorFactory.HUE_RED, null, 96);
            case 3:
                return LayeredImage.Companion.c(LayeredImage.INSTANCE, R$drawable.uikit_icn_16_time, Integer.valueOf(R$attr.uikit_colorAccentNeutral), new Color.Solid(R$attr.uikit_colorPopoverBackground), 1.0f, Float.valueOf(18.0f), 32);
            case 4:
                return LayeredImage.Companion.c(LayeredImage.INSTANCE, R$drawable.uikit_icn_16_cross_circle, Integer.valueOf(R$attr.uikit_colorRed), new Color.Solid(R$attr.uikit_colorPopoverBackground), 2.0f, Float.valueOf(16.0f), 32);
            case 5:
                return LayeredImage.Companion.f(LayeredImage.INSTANCE, R$drawable.uikit_icn_16_status_refund, R$attr.uikit_colorForeground, R$attr.uikit_colorPopoverBackground, null, 3.0f, 3.0f, null, 72);
            case 6:
                return LayeredImage.Companion.f(LayeredImage.INSTANCE, R$drawable.uikit_icn_16_arrow_recurring, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorPopoverBackground, null, 3.0f, BitmapDescriptorFactory.HUE_RED, null, 104);
            case 7:
                return LayeredImage.Companion.f(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_coins, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorPopoverBackground, null, 3.0f, 3.0f, null, 72);
            case 8:
                return LayeredImage.Companion.f(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_plus, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorPopoverBackground, null, 3.0f, BitmapDescriptorFactory.HUE_RED, null, 104);
            case 9:
                return LayeredImage.Companion.f(LayeredImage.INSTANCE, R$drawable.uikit_icn_16_exclamation_mark_sign, R$attr.uikit_colorOrange, R$attr.uikit_colorPopoverBackground, null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, SyslogConstants.LOG_CLOCK);
            case 10:
                return LayeredImage.Companion.f(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_reverted, R$attr.uikit_colorDeepGrey, R$attr.uikit_colorPopoverBackground, null, 3.0f, 3.0f, Float.valueOf(20.0f), 8);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    default Image b(a3 transaction, q extraData) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        return ((o) this).n(transaction, extraData.d, extraData.e, extraData.f181799j, extraData.f181804q, extraData.f181794a, extraData.f181795b, extraData.f181806s, extraData.f181807t, extraData.u, extraData.f181810y);
    }
}
