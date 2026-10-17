package tj9;

import aw0.m6;
import aw0.n6;
import cli.j;
import cli.n;
import cli.o;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.feature.credit.core.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mx0.v5;
import tif.g;
import zh9.i;
import zh9.i0;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements n {
    @Override // cli.n
    public final o c(j jVar) {
        i iVar;
        b domainState = (b) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.credit_pay_later_overdue_balance_sheet_title, null, null, 14), null, null, null, false, 30);
        aw0.e eVar = new aw0.e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(R$string.credit_common_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), null, null, 55);
        i0 i0Var = (i0) domainState.f271610a.getContent();
        List listC = u.c(new PlainTextDelegate.Model("description_id", (Clause) null, (Clause) new TextLocalisedClause(((i0Var == null || (iVar = i0Var.f322286b) == null) ? null : iVar.f322282c) == zh9.c.Overdue ? R$string.credit_pay_later_overdue_balance_sheet_description_6dpd : R$string.credit_pay_later_overdue_balance_sheet_description, null, null, 14), (v5) null, (UrlImage) null, false, (pa) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65518));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        return new cii.b(eVar, d0.E0((List) iii.c.f(t1.t(domainState.f271610a, domainState.f271611b), new g(6), new d(0), new sr8.a(this, 16)), listC), aVar);
    }
}
