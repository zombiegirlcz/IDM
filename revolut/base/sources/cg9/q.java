package cg9;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.bills.core.api.model.Bill;
import com.revolut.feature.pay_bills_taxes.api.R$string;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class q implements cli.n {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final of9.b f23885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l80.e f23886b;

    public q(of9.b fieldMapper, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(fieldMapper, "fieldMapper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f23885a = fieldMapper;
        this.f23886b = dateProvider;
    }

    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        TimeClause timeClause;
        int i;
        int i2;
        ?? r110;
        List listL;
        boolean zIsBefore;
        Object obj2;
        ActionsView.Item item;
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = (List) iii.c.f(domainState.f23871b, new ccg.c(26), new ccg.a(10), new cf1.h(this, 1));
        Bill bill = (Bill) domainState.f23871b.getContent();
        g gVar = null;
        if (bill != null) {
            LocalDate localDate = bill.f61251j;
            xo1.j jVar2 = bill.f61247b;
            if (localDate != null) {
                long jP = ebm.a.P(localDate);
                TimeClause.Format.INSTANCE.getClass();
                timeClause = new TimeClause(jP, TimeClause.Format.f57959a, null, null, 12);
            } else {
                timeClause = null;
            }
            int[] iArr = p.f23884a;
            int i3 = iArr[jVar2.ordinal()];
            if (i3 == 1) {
                i = R$string.pay_bills_taxes_tax_form_state_draft;
            } else if (i3 == 2) {
                i = R$string.pay_bills_taxes_tax_form_state_scheduled;
            } else if (i3 == 3) {
                i = R$string.pay_bills_taxes_tax_form_state_completed;
            } else if (i3 == 4) {
                i = R$string.pay_bills_taxes_tax_form_state_declined;
            } else {
                if (i3 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$string.pay_bills_taxes_tax_form_state_cancelled;
            }
            Object[] elements = {new TextLocalisedClause(i, null, null, 14), timeClause};
            Intrinsics.checkNotNullParameter(elements, "elements");
            CompositeClause compositeClause = new CompositeClause(kotlin.collections.d.L(elements), new DotDividerClause((Integer) null), null, null, 12);
            String str = bill.f61249g;
            if (str == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            TextClause textClause = new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            MoneyClause moneyClause = new MoneyClause(bill.f, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
            int i5 = iArr[jVar2.ordinal()];
            if (i5 == 1) {
                i2 = 14;
                r110 = 0;
                listL = f0.f322471a;
                gVar = new g(textClause, moneyClause, compositeClause, listL, u.c(new TextNavBarMenuItem("CREATE_COPY_MENU_ID", new TextLocalisedClause(R$string.pay_bills_taxes_tax_form_action_copy, r110, r110, i2), null, null, 12)));
            } else if (i5 != 2) {
                if (i5 != 3 && i5 != 4 && i5 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = 14;
                r110 = 0;
                listL = f0.f322471a;
                gVar = new g(textClause, moneyClause, compositeClause, listL, u.c(new TextNavBarMenuItem("CREATE_COPY_MENU_ID", new TextLocalisedClause(R$string.pay_bills_taxes_tax_form_action_copy, r110, r110, i2), null, null, 12)));
            } else {
                if (localDate == null) {
                    zIsBefore = false;
                } else {
                    zIsBefore = ((l80.f) this.f23886b).b().isBefore(localDate.plusDays(1L).atStartOfDay(ZoneOffset.UTC).toInstant());
                }
                if (zIsBefore) {
                    i2 = 14;
                    obj2 = null;
                    item = new ActionsView.Item("CANCEL_FORM_ACTION_ID", null, false, null, null, new TextLocalisedClause(R$string.pay_bills_taxes_tax_form_action_cancel, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, bill, null, 24478);
                } else {
                    i2 = 14;
                    obj2 = null;
                    item = null;
                }
                listL = v.l(item);
                r110 = obj2;
                gVar = new g(textClause, moneyClause, compositeClause, listL, u.c(new TextNavBarMenuItem("CREATE_COPY_MENU_ID", new TextLocalisedClause(R$string.pay_bills_taxes_tax_form_action_copy, r110, r110, i2), null, null, 12)));
            }
        }
        return new i(list, gVar);
    }
}
