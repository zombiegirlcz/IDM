package xl9;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.HighlightTileDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pay_with_smile.impl.R$string;
import com.revolut.sso.impl.domain.models.UserInfoAccount;
import ip0.ak0;
import ip0.rm;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class q implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f306973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ aim.e f306974b;

    public /* synthetic */ q(aim.e eVar, int i) {
        this.f306973a = i;
        this.f306974b = eVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        Clause textClause;
        TextLocalisedClause textLocalisedClause;
        switch (this.f306973a) {
            case 0:
                ((Boolean) obj3).getClass();
                aim.e eVarB = u.b();
                eVarB.add(new TextLocalisedClause(R$string.revolut_pay_enable_pay_with_smile_privacy_notice_prefix, u.c(new TextLocalisedClause(R$string.revolut_pay_enable_pay_with_smile_privacy_notice_link, null, new Click(30, (Integer) null, (Object) null, "ID_PRIVACY_NOTICE", false), 10)), null, 12));
                this.f306974b.add(new TextDelegate.Model("ID_PRIVACY_NOTE_TEXT", yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), u.a(eVarB)), false, new ak0(null, null, 3), null, null, 0, 0, 0, 0, 2036));
                break;
            case 1:
                BigDecimal bigDecimal = (BigDecimal) obj2;
                ((Boolean) obj3).getClass();
                if (bigDecimal != null) {
                    HighlightTileDelegate.Model model = new HighlightTileDelegate.Model("ID_EARN_REVPOINTS", new TextLocalisedClause(R$string.revolut_pay_enable_pay_with_smile_highlight_earn_revpoints, u.c(nub.a.j(bigDecimal, null, 7)), null, 12), new ResourceImage(R$drawable.uikit_icn_24_rev_points_default, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, null, null, null, null, rm.f166211a, 1016);
                    yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                    this.f306974b.add(model);
                }
                break;
            default:
                List revolutAccounts = (List) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(revolutAccounts, "revolutAccounts");
                if (!revolutAccounts.isEmpty()) {
                    ListSubheaderDelegate.Model modelD = xpl.n.d();
                    aim.e eVar = this.f306974b;
                    eVar.add(modelD);
                    List<UserInfoAccount> list = revolutAccounts;
                    ArrayList arrayList = new ArrayList(w.t(list, 10));
                    for (UserInfoAccount account : list) {
                        Intrinsics.checkNotNullParameter(account, "account");
                        String strQ = j6.a.q("REVOLUT_ACCOUNT_", account.f106203a);
                        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(tll.r.b(account), tll.r.e(account), null, false, null, false, 60);
                        TextClause textClause2 = new TextClause(account.f106204b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                        UserInfoAccount.Claim claim = account.f;
                        if (claim == null) {
                            textLocalisedClause = new TextLocalisedClause(com.revolut.sso.api.R$string.revolut_sso_revolut_id_screen_account_item_add_email_address, null, new Custom(Integer.valueOf(R$attr.uikit_colorStatusDanger), false, null, false, null, 254), 10);
                        } else if (Intrinsics.f(claim.f106212b, Boolean.FALSE)) {
                            textLocalisedClause = new TextLocalisedClause(com.revolut.sso.api.R$string.revolut_sso_revolut_id_screen_account_item_unverified_email, null, new Custom(Integer.valueOf(R$attr.uikit_colorStatusDanger), false, null, false, null, 254), 10);
                        } else {
                            textClause = new TextClause(account.f106205c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                            yy0.i iVar = yy0.l.Companion;
                            ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_16_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246);
                            iVar.getClass();
                            arrayList.add(new RowDelegate.Model(strQ, image40, textClause2, null, 0, textClause, null, null, 0, new tf(yy0.i.a(resourceImage)), false, null, false, null, null, null, null, null, null, account, null, 0, 0, 0, 0, 532675544));
                        }
                        textClause = textLocalisedClause;
                        yy0.i iVar2 = yy0.l.Companion;
                        ResourceImage resourceImage2 = new ResourceImage(R$drawable.uikit_icn_16_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246);
                        iVar2.getClass();
                        arrayList.add(new RowDelegate.Model(strQ, image40, textClause2, null, 0, textClause, null, null, 0, new tf(yy0.i.a(resourceImage2)), false, null, false, null, null, null, null, null, null, account, null, 0, 0, 0, 0, 532675544));
                    }
                    yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                    eVar.addAll(arrayList);
                }
                break;
        }
        return Unit.f186387a;
    }

    public /* synthetic */ q(aim.e eVar, xpl.n nVar) {
        this.f306973a = 2;
        this.f306974b = eVar;
    }
}
