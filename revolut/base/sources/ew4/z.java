package ew4;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.card.impl.ui.statement_financing.details.CreditCardStatementFinancingDetailsScreenContract$InputData;
import com.revolut.feature.credit.core.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class z implements cli.n {

    @NotNull
    public static final x Companion = new x();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardStatementFinancingDetailsScreenContract$InputData f130091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gs4.f f130092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final he2.b f130093c;
    public final yr4.e d;

    public z(CreditCardStatementFinancingDetailsScreenContract$InputData inputData, yr4.a loadingMapper, gs4.f creditCardInstalmentIconMapper, he2.b creditCardSectionMapper, gs4.l instalmentDocumentMapper, yr4.e toolbarMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(loadingMapper, "loadingMapper");
        Intrinsics.checkNotNullParameter(creditCardInstalmentIconMapper, "creditCardInstalmentIconMapper");
        Intrinsics.checkNotNullParameter(creditCardSectionMapper, "creditCardSectionMapper");
        Intrinsics.checkNotNullParameter(instalmentDocumentMapper, "instalmentDocumentMapper");
        Intrinsics.checkNotNullParameter(toolbarMapper, "toolbarMapper");
        this.f130091a = inputData;
        this.f130092b = creditCardInstalmentIconMapper;
        this.f130093c = creditCardSectionMapper;
        this.d = toolbarMapper;
    }

    public static ListSubheaderDelegate.Model a() {
        return new ListSubheaderDelegate.Model("id_credit_card_statement_financing_details_title", (Image) null, (Clause) new TextLocalisedClause(R$string.credit_card_instalment_confirmation_section_details, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
    }

    public static aim.e b(ql4.t tVar) {
        aim.e eVarB = zhm.u.b();
        int i = y.f130090a[tVar.ordinal()];
        if (i == 1) {
            eVarB.add(new ActionsView.Item("id_credit_card_statement_financing_action_repay", null, false, null, null, new TextLocalisedClause(R$string.credit_card_statement_financing_details_action_repay, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_plus, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, null, null, 32670));
        } else if (i != 2 && i != 3 && i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return zhm.u.a(eVarB);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        h domainState = (h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (t) iii.c.f(domainState.f130076a, new eu7.c(this, 12), new eul.f(this, 5), new ec8.q(this, 19));
    }
}
