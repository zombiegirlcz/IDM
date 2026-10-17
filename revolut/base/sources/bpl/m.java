package bpl;

import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.p2;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.BusinessBadge;
import com.revolut.core.ui_kit.models.badge.RetailBadge;
import com.revolut.core.ui_kit.models.badge.RevolutBadge;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.sso.api.R$string;
import com.revolut.sso.impl.domain.models.UserInfoAccount;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tll.r;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
public final class m implements n {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f17645a;

    public m(r revolutAccountsUiFactory) {
        Intrinsics.checkNotNullParameter(revolutAccountsUiFactory, "revolutAccountsUiFactory");
        this.f17645a = revolutAccountsUiFactory;
    }

    public static CellDetailsNoteDelegate.Model a(int i, Clause clause, TextLocalisedClause textLocalisedClause, String str) {
        return new CellDetailsNoteDelegate.Model(str, textLocalisedClause, null, clause, null, true, new ResourceImage(i, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), null, p2.f54570a, null, null, 0, 130324);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        boolean z;
        CellDetailsNoteDelegate.Model modelA;
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        UserInfoAccount userInfoAccount = domainState.f17635c;
        TextClause textClause = new TextClause(userInfoAccount.f106204b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        boolean z3 = domainState.f17633a;
        Clause compositeClause = z3 ? new CompositeClause(v.k(new TextClause(userInfoAccount.f106205c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new DotDividerClause((Integer) null), new TextLocalisedClause(R$string.revolut_sso_revolut_account_this_marker, null, null, 14)), null, null, null, 14) : new TextClause(userInfoAccount.f106205c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        yy0.i iVar = yy0.l.Companion;
        Image imageA = this.f17645a.a(userInfoAccount);
        iVar.getClass();
        yy0.l lVarA = yy0.i.a(imageA);
        int i = l.f17644a[userInfoAccount.e.ordinal()];
        RevolutBadge revolutBadge = RetailBadge.f58066a;
        if (i != 1) {
            if (i == 2) {
                revolutBadge = BusinessBadge.f58051a;
            } else if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        g gVar = new g(textClause, compositeClause, lVarA, revolutBadge);
        UserInfoAccount userInfoAccount2 = domainState.f17635c;
        UserInfoAccount.Claim claim = userInfoAccount2.f106206g;
        UserInfoAccount.Claim claim2 = userInfoAccount2.f;
        aim.e eVarB = u.b();
        aim.e eVarB2 = u.b();
        if (claim != null) {
            eVarB2.add(a(R$drawable.uikit_icn_24_pencil, new TextClause(claim.f106213c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.revolut_sso_revolut_account_phone_number, null, null, 14), "PHONE_NUMBER"));
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.revolut_sso_revolut_account_email_address, null, null, 14);
        if (claim2 == null) {
            modelA = a(R$drawable.uikit_icn_24_plus, new TextLocalisedClause(R$string.revolut_sso_revolut_account_add_email_address, null, new Custom(Integer.valueOf(R$attr.uikit_colorStatusDanger), false, null, false, null, 254), 10), textLocalisedClause, "EMAIL");
            z = z3;
        } else if (Intrinsics.f(claim2.f106212b, Boolean.FALSE)) {
            z = z3;
            modelA = a(R$drawable.uikit_icn_24_pencil, new CompositeClause(v.k(new TextClause(claim2.f106213c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new DotDividerClause((Integer) null), new TextLocalisedClause(R$string.revolut_sso_revolut_account_email_not_verified, null, new Custom(Integer.valueOf(R$attr.uikit_colorStatusDanger), false, null, false, null, 254), 10)), null, null, null, 14), textLocalisedClause, "EMAIL");
        } else {
            z = z3;
            modelA = a(R$drawable.uikit_icn_24_pencil, new TextClause(claim2.f106213c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), textLocalisedClause, "EMAIL");
        }
        eVarB2.add(modelA);
        aim.e eVarA = u.a(eVarB2);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        eVarB.addAll(eVarA);
        if (z && domainState.f17634b && domainState.d) {
            boolean z4 = false;
            RowDelegate.Model model = new RowDelegate.Model("CLOSE_ACCOUNT", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_broken_heart, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorStatusDanger), (List) null, (ImageTransformations) null, (Clause) null, 246), z4, z4, 6), new TextLocalisedClause(R$string.revolut_sso_revolut_account_close_account, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            eVarB.add(model);
        }
        return new h(gVar, u.a(eVarB));
    }
}
