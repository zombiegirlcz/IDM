package tll;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.BusinessBadge;
import com.revolut.core.ui_kit.models.badge.RetailBadge;
import com.revolut.core.ui_kit.models.badge.RevolutBadge;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.sso.api.models.RevolutAccountSession;
import com.revolut.sso.api.models.UserInfo;
import com.revolut.sso.impl.domain.models.UserInfoAccount;
import com.revolut.sso.impl.domain.models.UserInfoPicture;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.d0;
import org.jmrtd.cbeff.ISO781611;
import zhm.y0;

/* JADX INFO: loaded from: classes12.dex */
public final class r implements p {
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public static Image b(UserInfoAccount userInfoAccount) {
        UserInfoPicture userInfoPicture = userInfoAccount.d;
        if (userInfoPicture == null) {
            return new ContactImage((String) null, (String) null, (String) null, (String) null, (String) null, userInfoAccount.f106204b, (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4063);
        }
        return new UrlImage(userInfoPicture.f106214a, null, null, null, 0L, new UrlImage.SimpleCustomHeaders(y0.b("X-Device-Id"), userInfoPicture.f106215b), null, null, null, new ContactImage((String) null, (String) null, (String) null, (String) null, (String) null, userInfoAccount.f106204b, (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4063), false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), null, null, false, false, 502718);
    }

    public static ContactImage c(String str) {
        return new ContactImage((String) null, (String) null, (String) null, (String) null, (String) null, str, (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4063);
    }

    public static Image d(UserInfo userInfo) {
        Image imageJ = x5d.b.j(userInfo);
        if (imageJ == null) {
            String str = userInfo.d;
            if (str == null || d0.W(str)) {
                str = null;
            }
            imageJ = str != null ? c(str) : null;
            if (imageJ == null) {
                return LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_profile, Integer.valueOf(R$attr.uikit_colorWhite), R$attr.uikit_colorGreyTone20, 8.0f, null, null, 48);
            }
        }
        return imageJ;
    }

    public static RevolutBadge e(UserInfoAccount userInfoAccount) {
        int i = q.f272119a[userInfoAccount.e.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return BusinessBadge.f58051a;
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return RetailBadge.f58066a;
    }

    public static TextClause g(UserInfo userInfo) {
        String str = userInfo.d;
        String str2 = userInfo.e;
        String str3 = userInfo.f;
        if (str != null) {
            return new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        if (str2 != null) {
            return new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 62);
        }
        if (str3 != null) {
            return new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        m70.a.c(t0.f186434a);
        return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
    public final Image a(UserInfoAccount account) {
        Intrinsics.checkNotNullParameter(account, "account");
        UserInfoPicture userInfoPicture = account.d;
        String str = account.f106204b;
        if (userInfoPicture == null) {
            return c(str);
        }
        return new UrlImage(userInfoPicture.f106214a, null, null, null, 0L, new UrlImage.SimpleCustomHeaders(y0.b("X-Device-Id"), userInfoPicture.f106215b), null, null, null, c(str), false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), null, null, false, false, 502718);
    }

    public final RowDelegate.Model f(int i, RevolutAccountSession session) {
        TextClause textClause;
        TextClause textClause2;
        Intrinsics.checkNotNullParameter(session, "session");
        String strN = a0.d.n("LIST_ID_USER_SESSION.", i);
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(d(session.f105974b), null, null, false, null, false, 62);
        UserInfo userInfo = session.f105974b;
        TextClause textClauseG = g(userInfo);
        String str = userInfo.e;
        String str2 = userInfo.f;
        String str3 = userInfo.d;
        if (str3 != null && str != null) {
            textClause = new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 62);
        } else {
            if (str3 != null && str2 != null) {
                textClause2 = new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                return new RowDelegate.Model(strN, image40, textClauseG, null, 0, textClause2, null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false), false, null, false, null, null, null, null, null, null, session, null, 0, 0, 0, 0, 532675544);
            }
            textClause = null;
        }
        textClause2 = textClause;
        return new RowDelegate.Model(strN, image40, textClauseG, null, 0, textClause2, null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false), false, null, false, null, null, null, null, null, null, session, null, 0, 0, 0, 0, 532675544);
    }
}
