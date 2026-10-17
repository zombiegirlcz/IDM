package lml;

import aw0.o9;
import aw0.t0;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.sso.api.R$string;
import com.revolut.sso.api.models.UserInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tll.r;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes12.dex */
public final class i implements n {

    @NotNull
    private static final h Companion = new h();

    public static CellDetailsDelegate.Model a(int i, String str, String str2) {
        return new CellDetailsDelegate.Model(str, new t0((Clause) new TextLocalisedClause(i, null, null, 14), (Image) null, 0, false, 30), new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, 0, null, false, false, null, null, 32760);
    }

    @Override // cli.n
    public final o c(j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.revolut_sso_identity_match_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.revolut_sso_identity_match_subtitle, u.c(new TextLocalisedClause(R$string.revolut_sso_identity_match_learn_more, null, new Click(30, (Integer) null, (Object) null, "CLAUSE_ID_LEARN_MORE", false), 10)), null, 12);
        UserInfo userInfo = domainState.f197095a;
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        List listC = u.c(new RowDelegate.Model("LIST_ID_USER_INFO", new RowDelegate.Model.MainImage.Image40(r.d(userInfo), null, null, false, null, false, 62), r.g(userInfo), null, 0, new TextLocalisedClause(R$string.revolut_sso_identity_match_account_type_retail, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, userInfo, null, 0, 0, 0, 0, 532676568));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        aim.e eVarB = u.b();
        String str = userInfo.e;
        if (str != null) {
            eVarB.add(a(R$string.revolut_sso_identity_match_phone_title, "LIST_ID_PHONE", str));
        }
        String str2 = userInfo.f;
        if (str2 != null) {
            eVarB.add(a(R$string.revolut_sso_identity_match_email_title, "LIST_ID_EMAIL", str2));
        }
        aim.e eVarA = u.a(eVarB);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        return new g(textLocalisedClause, textLocalisedClause2, d0.E0(eVarA, listC));
    }
}
