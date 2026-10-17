package av7;

import aqd.h1;
import au6.e2;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import com.revolut.core.ui_kit.delegates.dc;
import com.revolut.core.ui_kit.delegates.ec;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.feature.insurance_embedded.impl.R$string;
import gu7.j4;
import java.util.List;
import jki.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class n implements p {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static ProductSelectionDelegate.Model b(j4 j4Var, boolean z) {
        return new ProductSelectionDelegate.Model(j6.a.q("PRODUCT_ITEM_", j4Var.f146771a), z ? new ec(new UrlImage(j4Var.f146773c, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286)) : new dc(new UrlImage(j4Var.f146773c, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286)), new TextClause(j4Var.f146771a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(j4Var.f146772b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, j4Var, null, !z, true, false, 592);
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        TextLocalisedClause textLocalisedClause;
        e domainState = (e) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        int i = o.f9943a[domainState.f9928a.ordinal()];
        if (i == 1) {
            textLocalisedClause = new TextLocalisedClause(R$string.embedded_insurance_list_title_travel, null, null, 14);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.embedded_insurance_list_title_purchase, null, null, 14);
        }
        return new i(textLocalisedClause, (List) iii.c.f(domainState.f9929b, new e2(this, 9), new h1(19), new a2g.m(this, 25)));
    }
}
