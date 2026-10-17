package tuc;

import aw0.o9;
import aw0.t0;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.security_hub.api.R$string;
import com.revolut.feature.security_hub.api.models.DigitizedCard;
import h93.f0;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public final class s implements cli.n {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xtc.c f274588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uuc.b f274589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z80.b f274590c;

    public s(xtc.c securityHubCardItemMapper, uuc.b cardTransactionsMapper, z80.b phoneToolsProvider) {
        Intrinsics.checkNotNullParameter(securityHubCardItemMapper, "securityHubCardItemMapper");
        Intrinsics.checkNotNullParameter(cardTransactionsMapper, "cardTransactionsMapper");
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        this.f274588a = securityHubCardItemMapper;
        this.f274589b = cardTransactionsMapper;
        this.f274590c = phoneToolsProvider;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        List list;
        int i;
        String str;
        Clause textClause;
        yy0.l lVarA;
        int i2;
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        aim.e eVarB = u.b();
        f0 f0Var = domainState.f274573a;
        m mVar = domainState.d;
        DigitizedCard digitizedCard = domainState.f274574b;
        RowDelegate.Model model = new RowDelegate.Model(f0Var.f150110a, this.f274588a.b(f0Var), v04.b.J(f0Var, f0Var.f150111b, null, null, 14), null, 0, new TextClause(j6.a.q("··", f0Var.f150115j), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model);
        do3.n nVar = domainState.e;
        if (nVar == null) {
            list = zhm.f0.f322471a;
        } else {
            String str2 = nVar.f116411g;
            CellDetailsDelegate.Model[] elements = {(str2 == null || str2.length() <= 0) ? null : new CellDetailsDelegate.Model("EMAIL_ITEM_LIST_ID", new t0((Clause) new TextLocalisedClause(R$string.security_hub_card_connections_details_email, null, null, 14), (Image) null, 0, false, 30), new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, 0, null, false, false, null, null, 32760), new CellDetailsDelegate.Model("PHONE_ITEM_LIST_ID", new t0((Clause) new TextLocalisedClause(R$string.security_hub_card_connections_details_phone, null, null, 14), (Image) null, 0, false, 30), new TextClause(z80.b.b(this.f274590c, nVar.i, null, null, 6), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, 0, null, false, false, null, null, 32760)};
            Intrinsics.checkNotNullParameter(elements, "elements");
            List listL = kotlin.collections.d.L(elements);
            yp0.b.k(listL, 0, 0, 0, 0, 31);
            list = listL;
        }
        eVarB.addAll(list);
        t0 t0Var = new t0((Clause) new TextLocalisedClause(R$string.security_hub_linked_wallet_details_date_linked_title, null, null, 14), (Image) null, 0, false, 30);
        long j2 = digitizedCard.d;
        qtc.f fVar = digitizedCard.f85400j;
        List listC = u.c(new CellDetailsDelegate.Model("LINKED_DATE_ITEM_LIST_ID", t0Var, new TimeClause(j2, new TimeClause.Format.Pretty(0), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 32760));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        eVarB.addAll(listC);
        List list2 = (List) iii.c.f(domainState.f274575c, new tsk.j(9), new tq0.j(19), new tch.c(this, 9));
        yp0.b.k(list2, 0, 0, 0, 0, 31);
        eVarB.addAll(list2);
        int i3 = r.f274586a[mVar.ordinal()];
        if (i3 == 1) {
            i = R$string.security_hub_card_connections_details_merchant_dont_recognize_title;
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.security_hub_linked_wallet_details_dont_recognize_title;
        }
        RowDelegate.Model model2 = new RowDelegate.Model("DONT_RECOGNIZE_DEVICE_ITEM_ID", null, new TextLocalisedClause(i, null, new Custom(Integer.valueOf(R$attr.uikit_colorStatusDanger), false, null, false, null, 254), 10), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, k.f274579a, null, 0, 0, 0, 0, 532676602);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model2);
        aim.e eVarA = u.a(eVarB);
        List listC2 = u.c(new ActionsView.Item("REMOVE_ACTION_ITEM_ID", null, false, null, null, new TextLocalisedClause(R$string.security_hub_linked_wallets_remove, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_trash, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, null, null, 32670));
        m mVar2 = m.LINKED_WALLETS;
        if (mVar == mVar2) {
            switch (r.f274587b[fVar.ordinal()]) {
                case 1:
                    i2 = R$string.security_hub_card_connections_linked_wallets_android_pay;
                    break;
                case 2:
                    i2 = R$string.security_hub_card_connections_linked_wallets_apple_pay;
                    break;
                case 3:
                    i2 = R$string.security_hub_card_connections_linked_wallets_fitbit_pay;
                    break;
                case 4:
                    i2 = R$string.security_hub_card_connections_linked_wallets_garmin_pay;
                    break;
                case 5:
                    i2 = R$string.security_hub_card_connections_linked_wallets_samsung_pay;
                    break;
                case 6:
                    i2 = R$string.security_hub_card_connections_linked_wallets_click_to_pay;
                    break;
                default:
                    i2 = R$string.security_hub_card_connections_linked_wallets_unknown;
                    break;
            }
            textClause = new TextLocalisedClause(i2, null, null, 14);
        } else {
            DigitizedCard.Merchant merchant = digitizedCard.f85399h;
            if ((merchant == null || (str = merchant.f85403b) == null) && (str = digitizedCard.f85398g) == null) {
                str = digitizedCard.k;
            }
            textClause = new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        if (mVar == mVar2 && fVar == qtc.f.CLICK_TO_PAY) {
            yy0.i iVar = yy0.l.Companion;
            GlyphImage glyphImage = new GlyphImage(R$drawable.uikit_icn_24_click2pay, null, null, 6);
            iVar.getClass();
            lVarA = yy0.i.a(glyphImage);
        } else {
            lVarA = null;
        }
        return new n(eVarA, listC2, textClause, lVarA);
    }
}
