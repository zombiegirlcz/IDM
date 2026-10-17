package hv6;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.badge.AccentCircleBadge;
import com.revolut.core.ui_kit.models.badge.CircleIconBadge;
import com.revolut.core.ui_kit.models.badge.DangerCircleBadge;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import or6.e;
import pr6.d;
import pr6.j;

/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public b(wu6.b clauseFactory) {
        Intrinsics.checkNotNullParameter(clauseFactory, "clauseFactory");
    }

    public static CircleIconBadge a(lr6.a state, d type) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(type, "type");
        if (state == lr6.a.COMPLETED && type == d.REFUND) {
            return new AccentCircleBadge(dw0.a.Revert);
        }
        switch (a.f155787b[state.ordinal()]) {
            case 1:
                return new AccentCircleBadge(dw0.a.Pending);
            case 2:
            case 3:
                return new AccentCircleBadge(dw0.a.Revert);
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                return new DangerCircleBadge(dw0.a.Error);
            default:
                return null;
        }
    }

    public static ResourceImage b(j method, e eVar) {
        Intrinsics.checkNotNullParameter(method, "method");
        if (method == j.SEPA_DIRECT_DEBIT) {
            return new ResourceImage(R$drawable.uikit_icn_payment_scheme_sepa, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        }
        int i = eVar == null ? -1 : a.f155786a[eVar.ordinal()];
        return new ResourceImage(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? R$drawable.uikit_icn_payment_scheme_revolut_light : R$drawable.uikit_icn_24_logo_jcb_colour : R$drawable.uikit_icn_24_logo_discover_colour : R$drawable.uikit_icn_payment_scheme_amex : R$drawable.uikit_icn_payment_scheme_mastercard : R$drawable.uikit_icn_payment_scheme_visa, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.core.ui_kit.models.CompositeClause c(pr6.e r21) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hv6.b.c(pr6.e):com.revolut.core.ui_kit.models.CompositeClause");
    }
}
