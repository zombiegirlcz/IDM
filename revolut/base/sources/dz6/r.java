package dz6;

import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.PlusActionNavBarMenuItem;
import com.revolut.feature.freelancer.impl.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements cli.n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        k kVar = domainState.f121242b;
        int[] iArr = s.f121263a;
        int i = iArr[kVar.ordinal()];
        if (i == 1) {
            textLocalisedClause = new TextLocalisedClause(R$string.freelancer_sale_invoice_templates_list_header_title, null, null, 14);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.freelancer_sale_invoice_templates_list_header_select_title, null, null, 14);
        }
        int i2 = iArr[kVar.ordinal()];
        if (i2 == 1) {
            textLocalisedClause2 = new TextLocalisedClause(R$string.freelancer_sale_invoice_templates_list_header_caption, null, null, 14);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause2 = new TextLocalisedClause(R$string.freelancer_sale_invoice_templates_list_header_select_subtitle, u.c(new TextLocalisedClause(R$string.freelancer_sale_invoice_templates_list_header_select_action_title, null, new Click(30, (Integer) null, (Object) null, "CLAUSE_ID_TEMPLATE_SETTINGS", false), 10)), null, 12);
        }
        return new m(new l(textLocalisedClause, textLocalisedClause2, u.c(PlusActionNavBarMenuItem.Companion.c(PlusActionNavBarMenuItem.INSTANCE, "MENU_ITEM_ID_NEW_TEMPLATE", new TextLocalisedClause(R$string.freelancer_common_action_new, null, null, 14), null, 60))), (List) iii.c.f(domainState.f121241a, new dwi.f(this, 29), new dug.d(this, 23), new dob.a(this, 9)));
    }
}
