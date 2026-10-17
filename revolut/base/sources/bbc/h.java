package bbc;

import aw0.n6;
import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.revolutpay.order_tracking.impl.R$string;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new g(new cii.a(new lw0.a(new TextLocalisedClause(R$string.revolut_pay_delete_tracking_title, null, null, 14), new TextLocalisedClause(R$string.revolut_pay_delete_tracking_subtitle, null, null, 14), null, null, false, 28), new aw0.g(new n6(new TextLocalisedClause(R$string.revolut_pay_delete_tracking_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, b.f14246a, 504), new n6(new TextLocalisedClause(R$string.revolut_pay_delete_tracking_delete, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, "DELETE_TRACKING_TAG", false, null, c.f14247a, 488), (Clause) null, (aw0.f) null, 25)));
    }
}
