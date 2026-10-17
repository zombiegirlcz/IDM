package com.revolut.feature.external_accounts.impl.mandate.bottom_sheet;

import aw0.m6;
import aw0.n6;
import bh6.g;
import bh6.i;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.external_accounts.impl.R$string;
import com.revolut.feature.external_accounts.impl.mandate.bottom_sheet.a;
import ip0.nb0;
import ip0.pb0;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zg6.h;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements n {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bh6.h f72435a;

    public c(bh6.h termsAndConditionsMapper) {
        Intrinsics.checkNotNullParameter(termsAndConditionsMapper, "termsAndConditionsMapper");
        this.f72435a = termsAndConditionsMapper;
    }

    @Override // cli.n
    public final o c(j jVar) {
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        if (!(domainState instanceof zg6.a)) {
            if (!Intrinsics.f(domainState, a.C0481a.f72429a)) {
                throw new NoWhenBranchMatchedException();
            }
            nb0 nb0Var = pb0.Companion;
            List listK = v.k(nb0.b(nb0Var, "LOADING_ITEM_1", false, 0, false, 30), nb0.b(nb0Var, "LOADING_ITEM_2", false, 0, false, 30));
            yp0.b.k(listK, 0, 0, 0, 0, 31);
            return new cii.b(null, listK, new lw0.a(new TextLocalisedClause(R$string.open_banking_mandate_setup_sheet_header_title, null, null, 14), new TextLocalisedClause(R$string.open_banking_mandate_setup_sheet_header_subtitle, null, null, 14), null, null, false, 28));
        }
        zg6.a aVar = (zg6.a) domainState;
        List listK2 = v.k(new CellDetailsActionDelegate.Model("ITEM_ID_MAX_PER_TRANSFER", new TextLocalisedClause(R$string.open_banking_mandate_max_per_transfer, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_24_pencil, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new MoneyClause(aVar.f322075a, new MoneyClause.Format.Defaults(null, null, false, false, 15), new Click(30, (Integer) null, (Object) null, "ACTION_CHANGE_MAX_PER_TRANSFER", false), null, 8), false, false, null, null, 0, 0, 32736), new CellDetailsActionDelegate.Model("ITEM_ID_MAX_PER_MONTH", new TextLocalisedClause(R$string.open_banking_mandate_max_per_month, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_24_pencil, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new MoneyClause(aVar.f322076b, new MoneyClause.Format.Defaults(null, null, false, false, 15), new Click(30, (Integer) null, (Object) null, "ACTION_CHANGE_MAX_PER_MONTH", false), null, 8), false, false, null, null, 0, 0, 32736));
        yp0.b.k(listK2, 0, 0, 0, 0, 31);
        ArrayList arrayListF0 = d0.F0(((i) this.f72435a).a(g.BOTTOM_SHEET), listK2);
        lw0.a aVar2 = new lw0.a(new TextLocalisedClause(R$string.open_banking_mandate_setup_sheet_header_title, null, null, 14), new TextLocalisedClause(R$string.open_banking_mandate_setup_sheet_header_subtitle, null, null, 14), null, null, false, 28);
        m6 m6Var = n6.Companion;
        return new cii.b(new aw0.h(false, m6.c(m6Var, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), m6.c(m6Var, new TextLocalisedClause(R$string.open_banking_common_action_not_now, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, null, 1020), null, null, null, 121), arrayListF0, aVar2);
    }
}
