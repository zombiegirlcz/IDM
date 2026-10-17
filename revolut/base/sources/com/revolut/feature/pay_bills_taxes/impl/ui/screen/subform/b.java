package com.revolut.feature.pay_bills_taxes.impl.ui.screen.subform;

import aw0.e;
import aw0.n6;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.feature.pay_bills_taxes.api.R$string;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.subform.SubformScreenContract$SubformScreenAction;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.subform.SubformScreenContract$ToolbarAction;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import of9.f;
import of9.g;
import yg9.k;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f78741a;

    public b(f commonProvider, g validator) {
        Intrinsics.checkNotNullParameter(commonProvider, "commonProvider");
        Intrinsics.checkNotNullParameter(validator, "validator");
        this.f78741a = commonProvider;
    }

    @Override // cli.n
    public final o c(j jVar) {
        TextLocalisedClause textLocalisedClause;
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        ArrayList arrayList = domainState.f313582a.f61360a;
        List list = domainState.f313584c;
        ArrayList arrayListD = this.f78741a.d(arrayList, list);
        Clause clause = domainState.d;
        List listL = v.l(Intrinsics.f(domainState.f313585g, SubformScreenContract$ToolbarAction.Remove.f78735a) ? new TextNavBarMenuItem("SUBFORM_MENU_ITEM_REMOVE", new TextLocalisedClause(R$string.pay_bills_taxes_common_remove, null, null, 14), null, null, 12) : null);
        Clause clause2 = domainState.e;
        SubformScreenContract$SubformScreenAction subformScreenContract$SubformScreenAction = domainState.f;
        if (Intrinsics.f(subformScreenContract$SubformScreenAction, SubformScreenContract$SubformScreenAction.Save.f78734a)) {
            textLocalisedClause = new TextLocalisedClause(R$string.pay_bills_taxes_common_save, null, null, 14);
        } else {
            if (!Intrinsics.f(subformScreenContract$SubformScreenAction, SubformScreenContract$SubformScreenAction.Add.f78733a)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.pay_bills_taxes_common_add, null, null, 14);
        }
        return new yg9.n(arrayListD, clause, new e(true, clause2, null, new n6(textLocalisedClause, LargeActionButton.ButtonStyle.f58725a, null, "SUBFORM_SCREEN_BUTTON_LOADING_TAG", g.a(domainState.f313582a.f61360a, list), null, null, 972), null, null, 52), listL);
    }
}
