package bs4;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.card.impl.ui.instalment.details.pre_purchase.CreditCardPrePurchaseDetailsScreenContract$InputData;
import com.revolut.feature.credit.core.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ql4.y;

/* JADX INFO: loaded from: classes22.dex */
public final class w implements cli.n {

    @NotNull
    public static final u Companion = new u();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardPrePurchaseDetailsScreenContract$InputData f18064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yr4.e f18065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final thf.m f18066c;
    public final gs4.f d;
    public final whf.n e;

    public w(CreditCardPrePurchaseDetailsScreenContract$InputData inputData, yr4.a loadingMapper, yr4.e toolbarMapper, thf.m transactionTextResourcesMapper, gs4.f creditCardInstalmentIconMapper, whf.n transactionItemsMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(loadingMapper, "loadingMapper");
        Intrinsics.checkNotNullParameter(toolbarMapper, "toolbarMapper");
        Intrinsics.checkNotNullParameter(transactionTextResourcesMapper, "transactionTextResourcesMapper");
        Intrinsics.checkNotNullParameter(creditCardInstalmentIconMapper, "creditCardInstalmentIconMapper");
        Intrinsics.checkNotNullParameter(transactionItemsMapper, "transactionItemsMapper");
        this.f18064a = inputData;
        this.f18065b = toolbarMapper;
        this.f18066c = transactionTextResourcesMapper;
        this.d = creditCardInstalmentIconMapper;
        this.e = transactionItemsMapper;
    }

    public static aim.e a(y yVar) {
        aim.e eVarB = zhm.u.b();
        int i = v.f18063a[yVar.f247195b.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (yVar.e.f247187b.f > 0 && yVar.f247197g != ql4.j.UNKNOWN) {
                eVarB.add(new ActionsView.Item("id_credit_card_pre_purchase_action_repay", null, false, null, null, new TextLocalisedClause(R$string.credit_card_statement_financing_details_action_repay, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_plus, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, yVar.f247197g, null, 24478));
            }
        }
        return zhm.u.a(eVarB);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (r) iii.c.f(domainState.f18047a, new bq7.j(this, 5), new bhi.c(this, 20), new b88.o(this, 16));
    }
}
