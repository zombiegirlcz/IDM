package e94;

import com.revolut.core.model.money.ScaleMode;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import e8e.y;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class r implements cli.n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static RowDelegate.Model a(qu3.e eVar) {
        int i;
        TextLocalisedClause textLocalisedClause;
        dj0.d dVar;
        RowDelegate.Model.c.b bVar;
        RowDelegate.Model.c aVar;
        dj0.d dVar2;
        int i2;
        String str = eVar.f249200a;
        pu3.d dVar3 = eVar.f249201b;
        int[] iArr = s.f123918a;
        switch (iArr[dVar3.ordinal()]) {
            case 1:
                i = R$string.credit_application_outstanding_debts_debts_hub_item_mortgage_title;
                break;
            case 2:
                i = R$string.credit_application_outstanding_debts_debts_hub_item_loan_title;
                break;
            case 3:
                i = R$string.credit_application_outstanding_debts_debts_hub_item_credit_card_title;
                break;
            case 4:
                i = R$string.credit_application_outstanding_debts_debts_hub_item_bnpl_title;
                break;
            case 5:
                i = R$string.credit_application_outstanding_debts_debts_hub_item_line_of_credit_title;
                break;
            case 6:
                i = R$string.credit_application_outstanding_debts_debts_hub_item_overdraft_title;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(i, null, null, 14);
        if (eVar.i) {
            textLocalisedClause = new TextLocalisedClause(R$string.credit_application_outstanding_debts_debts_hub_item_description_provider_revolut, null, null, 14);
        } else {
            int i3 = R$string.credit_application_outstanding_debts_debts_hub_item_description_provider_external;
            String str2 = eVar.d.f249198b;
            if (str2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            textLocalisedClause = new TextLocalisedClause(i3, u.c(str2), null, 12);
        }
        if (eVar.k) {
            aVar = new RowDelegate.Model.c.a(new TagViewData(null, new TextLocalisedClause(R$string.credit_application_outstanding_debts_debts_hub_item_label_repaid, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), new Color.Solid(R$attr.uikit_colorForeground_10), R$attr.uikit_colorTransparent, null, 1000), null, false, 6);
        } else if (eVar.f249205j && dVar3 == pu3.d.LOAN) {
            qu3.d dVar4 = eVar.f249203g;
            if (dVar4 != null && (dVar2 = (dj0.d) dVar4.getValue()) != null) {
                bVar = new RowDelegate.Model.c.b(new MoneyClause(dVar2, new MoneyClause.Format.Defaults(null, new ScaleMode.SimpleLen(2, 2), false, false, 13), null, null, 12), new TextLocalisedClause(R$string.credit_application_outstanding_debts_debts_hub_item_label_amount, null, null, 14), null, false, 124);
                aVar = bVar;
            }
            aVar = null;
        } else {
            qu3.d dVar5 = eVar.e;
            if (dVar5 != null && (dVar = (dj0.d) dVar5.getValue()) != null) {
                MoneyClause moneyClause = new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, new ScaleMode.SimpleLen(2, 2), false, false, 13), null, null, 12);
                int i5 = iArr[dVar3.ordinal()];
                bVar = new RowDelegate.Model.c.b(moneyClause, (i5 == 1 || i5 == 2) ? new TextLocalisedClause(R$string.credit_application_outstanding_debts_debts_hub_item_label_amount, null, null, 14) : new TextLocalisedClause(R$string.credit_application_outstanding_debts_debts_hub_item_label_credit_limit, null, null, 14), null, false, 124);
                aVar = bVar;
            }
            aVar = null;
        }
        TextLocalisedClause textLocalisedClause3 = (eVar.x3() && eVar.a()) ? new TextLocalisedClause(R$string.credit_application_outstanding_debts_debts_hub_item_action_add_missing_info, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10) : null;
        switch (iArr[dVar3.ordinal()]) {
            case 1:
                i2 = R$drawable.uikit_icn_24_mortgage;
                break;
            case 2:
                i2 = R$drawable.uikit_icn_24_credit_loan;
                break;
            case 3:
                i2 = R$drawable.uikit_icn_24_credit_card;
                break;
            case 4:
                i2 = R$drawable.uikit_icn_24_bnpl;
                break;
            case 5:
                i2 = R$drawable.uikit_icn_24_credit_bag;
                break;
            case 6:
                i2 = R$drawable.uikit_icn_24_overdraft;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Image40(new GlyphImage(i2, null, null, 6), null, null, false, null, false, 60), textLocalisedClause2, null, 0, textLocalisedClause, textLocalisedClause3, null, 0, aVar, true ^ eVar.f249206l, null, false, null, null, null, null, null, null, eVar, null, 0, 0, 0, 0, 532673432);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        m domainState = (m) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (q) iii.c.f(domainState.f123911a, new y(this, 9), new e6e.a(this, 7), new dbg.b(this, domainState, 25));
    }
}
