package com.revolut.feature.credit.direct.debit.account_details_v2;

import aim.e;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.direct.debit.account_details_v2.DirectDebitAccountDetailsScreenContract$AccountInfo;
import java.util.List;
import jki.i;
import jki.m;
import jki.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import ry4.d;
import ry4.f;
import yp0.b;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements p {

    @NotNull
    public static final C0479a Companion = new C0479a();

    /* JADX INFO: renamed from: com.revolut.feature.credit.direct.debit.account_details_v2.a$a, reason: collision with other inner class name */
    public static final class C0479a {
        private C0479a() {
        }
    }

    @Override // jki.p
    public final m a(i iVar) {
        d domainState = (d) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Clause clause = domainState.f258213a;
        Clause clause2 = domainState.f258214b;
        int i = R$drawable.uikit_icn_24_back_button_arrow;
        DirectDebitAccountDetailsScreenContract$AccountInfo directDebitAccountDetailsScreenContract$AccountInfo = domainState.f258215c;
        if (!(directDebitAccountDetailsScreenContract$AccountInfo instanceof DirectDebitAccountDetailsScreenContract$AccountInfo.Clabe)) {
            throw new NoWhenBranchMatchedException();
        }
        DirectDebitAccountDetailsScreenContract$AccountInfo.Clabe clabe = (DirectDebitAccountDetailsScreenContract$AccountInfo.Clabe) directDebitAccountDetailsScreenContract$AccountInfo;
        Image image = clabe.f69879c;
        e eVarB = u.b();
        List listK = v.k(new CellDetailsDelegate.Model("ID_BANK_NAME", new TextLocalisedClause(R$string.credit_card_direct_debit_account_details_item_bank, null, null, 14), new TextClause(clabe.f69877a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, clabe.f69877a, null, null, null, null, false, 0, 0, 32744), new CellDetailsDelegate.Model("ID_CLABE", new TextLocalisedClause(R$string.credit_card_direct_debit_account_type_clabe, null, null, 14), new TextClause(clabe.f69878b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, clabe.f69878b, null, null, null, null, false, 0, 0, 32744));
        b.k(listK, 0, 0, 0, 0, 31);
        eVarB.addAll(listK);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_card_direct_debit_account_details_action_delete_account, null, new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), 10);
        m70.a.c(t0.f186434a);
        CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("ID_DELETE_ACCOUNT", textLocalisedClause, new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, null, null, true, 0, 0, 31736);
        b.l(model, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model);
        return new f(clause, clause2, i, image, u.a(eVarB));
    }
}
