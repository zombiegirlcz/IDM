package to2;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit.models.badge.DangerCircleBadge;
import com.revolut.core.ui_kit.models.badge.SuccessCircleBadge;
import com.revolut.core.ui_kit.models.badge.WarningCircleBadge;
import com.revolut.core.ui_kit.models.badge.WhiteCircleBadge;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.bank_account_switching.api.R$string;
import ip0.z;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.ISO781611;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final class n implements cli.n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static TextLocalisedClause a(mn2.a aVar) {
        int i = o.f272509b[aVar.ordinal()];
        if (i == 1) {
            return new TextLocalisedClause(R$string.account_switch_feature_subtitle, null, null, 14);
        }
        if (i == 2) {
            return new TextLocalisedClause(R$string.account_switch_list_cass_subtitle, null, null, 14);
        }
        if (i == 3) {
            return new TextLocalisedClause(R$string.account_switch_list_elcimai_subtitle, null, null, 14);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static z b() {
        return new z("ID_ADD_REQUEST_BAR", u.c(new ActionsView.Item("ID_ADD_REQUEST", null, false, null, null, new TextLocalisedClause(R$string.account_switch_list_action, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_plus, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, null, null, 32670)), null, null, 0, 0, 124);
    }

    public static RowDelegate.Model d(vo2.b bVar) {
        CircleBadgeModel whiteCircleBadge;
        TextClause textClause;
        Integer num;
        Integer numValueOf;
        String strQ = j6.a.q("ID_REQUEST_", bVar.f290844a);
        UrlImage urlImage = new UrlImage(bVar.d, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), null, null, false, false, 507898);
        vo2.a aVar = bVar.e;
        int[] iArr = o.f272508a;
        int i = iArr[aVar.ordinal()];
        if (i == 1) {
            whiteCircleBadge = new WhiteCircleBadge(dw0.a.Pending);
        } else if (i == 2) {
            whiteCircleBadge = new SuccessCircleBadge(dw0.a.Checked);
        } else if (i == 3) {
            whiteCircleBadge = new WarningCircleBadge(dw0.a.Suspicious);
        } else if (i == 4) {
            whiteCircleBadge = null;
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            whiteCircleBadge = new DangerCircleBadge(dw0.a.Cancelled);
        }
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(urlImage, whiteCircleBadge, null, false, null, false, 60);
        TextClause textClause2 = new TextClause(bVar.f290845b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        String str = bVar.f290846c;
        if (str != null) {
            int i2 = iArr[aVar.ordinal()];
            if (i2 == 1) {
                num = null;
                textClause = new TextClause(str, (Style) null, num, false, (o9) null, (List) null, 122);
            } else {
                if (i2 == 2) {
                    numValueOf = Integer.valueOf(R$attr.uikit_colorGreen);
                } else if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        numValueOf = Integer.valueOf(R$attr.uikit_colorRed);
                    }
                    num = null;
                    textClause = new TextClause(str, (Style) null, num, false, (o9) null, (List) null, 122);
                } else {
                    numValueOf = Integer.valueOf(R$attr.uikit_colorStatusWarning);
                }
                num = numValueOf;
                textClause = new TextClause(str, (Style) null, num, false, (o9) null, (List) null, 122);
            }
        } else {
            textClause = null;
        }
        String str2 = bVar.f;
        return new RowDelegate.Model(strQ, image40, textClause2, null, 0, textClause, str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, 0, new tf(new yy0.j(new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254))), false, null, false, null, null, null, null, null, null, bVar, null, 0, 0, 0, 0, 532675480);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (l) iii.c.f(domainState.f272499b, new tjf.e(this, domainState, 21), new ta8.a(this, domainState, 27), new tch.c(this, domainState, 5));
    }
}
