package qu6;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.badge.AccentCircleBadge;
import com.revolut.core.ui_kit.models.badge.CircleIconBadge;
import com.revolut.core.ui_kit.models.badge.DangerCircleBadge;
import com.revolut.core.ui_kit.models.q0;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.youTransactor.uCube.rpc.Constants;
import iu6.j;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import nr6.c0;
import nr6.e;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements jr6.a {
    public b(j clauseFactory) {
        Intrinsics.checkNotNullParameter(clauseFactory, "clauseFactory");
    }

    public static CircleIconBadge a(c0 c0Var) {
        switch (c0Var == null ? -1 : a.f249259b[c0Var.ordinal()]) {
            case 1:
            case 2:
                return new AccentCircleBadge(dw0.a.Pending);
            case 3:
            case 4:
                return new AccentCircleBadge(dw0.a.Revert);
            case 5:
            case 6:
                return new DangerCircleBadge(dw0.a.Error);
            default:
                return null;
        }
    }

    public static LayeredImage b(e eVar, boolean z) {
        float f;
        Float fValueOf;
        int i;
        if (z) {
            fValueOf = Float.valueOf(40.0f);
            f = 16.0f;
        } else {
            f = 8.0f;
            fValueOf = null;
        }
        Float f4 = fValueOf;
        float f5 = f;
        switch (eVar == null ? -1 : a.f249258a[eVar.ordinal()]) {
            case 1:
                i = R$drawable.uikit_icn_24_logo_apple_tap_to_pay_filled;
                break;
            case 2:
                i = R$drawable.uikit_icn_24_card_reader;
                break;
            case 3:
                i = R$drawable.uikit_icn_24_document;
                break;
            case 4:
                i = R$drawable.uikit_icn_24_link;
                break;
            case 5:
                i = R$drawable.uikit_icn_24_card_terminal;
                break;
            case 6:
                i = R$drawable.uikit_icn_24_qr_code;
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                i = R$drawable.uikit_icn_24_merchant;
                break;
            default:
                i = R$drawable.uikit_icn_24_puzzle;
                break;
        }
        int i2 = i;
        switch (eVar != null ? a.f249258a[eVar.ordinal()] : -1) {
        }
        return LayeredImage.Companion.b(LayeredImage.INSTANCE, i2, Integer.valueOf(R$attr.uikit_colorWhite), R$attr.uikit_colorIndigo, f5, f4, null, 32);
    }

    public static MoneyClause c(nr6.b order) {
        Intrinsics.checkNotNullParameter(order, "order");
        c0 c0Var = order.d;
        boolean z = c0Var == c0.CANCELLED || c0Var == c0.FAILED;
        return new MoneyClause(order.f218549s, new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(z ? R$attr.uikit_colorGreyTone50 : R$attr.uikit_colorForeground), z, null, false, null, Constants.TAG_FC_SPEED_MODE), null, 8);
    }

    public static TimeClause e(nr6.b order, boolean z) {
        Intrinsics.checkNotNullParameter(order, "order");
        return new TimeClause(oi0.d.R(order.f218538b), new TimeClause.Format.Pretty(z ? q0.DATETIME : q0.ONLY_TIME), null, null, 12);
    }

    public final RowDelegate.Model d(nr6.b order, boolean z) {
        Intrinsics.checkNotNullParameter(order, "order");
        String str = order.f218537a;
        Intrinsics.checkNotNullParameter(order, "order");
        TextClause textClause = new TextClause(order.i, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        RowDelegate.Model.c.b bVar = new RowDelegate.Model.c.b(c(order), null, null, false, 126);
        Intrinsics.checkNotNullParameter(order, "order");
        c0 c0Var = order.d;
        TextLocalisedClause textLocalisedClauseA = c0Var != null ? j.a(c0Var) : null;
        TimeClause timeClauseE = e(order, z);
        return new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Image40(b(order.e, false), a(c0Var), null, false, null, false, 60), textClause, null, 0, textLocalisedClauseA != null ? new CompositeClause(v.k(textLocalisedClauseA, timeClauseE), new DotDividerClause((Integer) null), null, null, 12) : timeClauseE, null, null, 0, bVar, false, null, false, null, null, null, null, null, null, order, null, 0, 0, 0, 0, 532675544);
    }
}
