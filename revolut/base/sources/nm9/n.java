package nm9;

import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.payees.impl.ui.PayeesFlowType;
import com.revolut.feature.security_hub.api.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class n implements cli.n {

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static TextLocalisedClause a(g gVar) {
        PayeesFlowType payeesFlowType = gVar.f217221a;
        if (payeesFlowType instanceof PayeesFlowType.Blocked) {
            return new TextLocalisedClause(R$string.security_hub_payees_select_sheet_block_action, null, null, 14);
        }
        if (payeesFlowType instanceof PayeesFlowType.RequireAuthentication) {
            return new TextLocalisedClause(R$string.security_hub_payees_select_sheet_action_confrim, null, null, 14);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static RowDelegate.Model b(int i, int i2, int i3) {
        return new RowDelegate.Model(a0.d.n("PAYEES_CONFIRMATION_ITEM_", i), new RowDelegate.Model.MainImage.Image24(new ResourceImage(i3, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(i2, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (k) iii.c.f(domainState.f217222b, new nfj.l(this, domainState), new nk4.o(this, domainState), new mgh.i(domainState, this, 23));
    }
}
