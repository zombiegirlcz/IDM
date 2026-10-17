package ft4;

import com.revolut.core.ui_kit.delegates.TabsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class l0 implements cli.n {

    @NotNull
    public static final j0 Companion = new j0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final whf.n f137919a;

    public l0(whf.n transactionItemsMapper) {
        Intrinsics.checkNotNullParameter(transactionItemsMapper, "transactionItemsMapper");
        this.f137919a = transactionItemsMapper;
    }

    public static TabsDelegate.Model a(h hVar) {
        String str = "id_instalment_tab_debit";
        List listK = zhm.v.k(new com.revolut.core.ui_kit.views.q("id_instalment_tab_debit", new com.revolut.core.ui_kit.views.t(new TextLocalisedClause(R$string.credit_card_instalment_select_transaction_tab_debit, null, null, 14)), 58), new com.revolut.core.ui_kit.views.q("id_instalment_tab_credit", new com.revolut.core.ui_kit.views.t(new TextLocalisedClause(R$string.credit_card_instalment_select_transaction_tab_credit, null, null, 14)), 58));
        int i = k0.f137916a[hVar.ordinal()];
        if (i == 1) {
            str = "id_instalment_tab_credit";
        } else if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return new TabsDelegate.Model("id_instalment_transactions_tabs", listK, str, null, null, null, 0, 0, null, 8184);
    }

    public static u b() {
        return new u(new TextLocalisedClause(R$string.credit_card_instalment_select_transaction_title_split_installments, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        m domainState = (m) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (v) iii.c.f(domainState.f137920a, new w(this, 2), new fq7.j(this), new f0e.i(this, domainState, 19));
    }
}
