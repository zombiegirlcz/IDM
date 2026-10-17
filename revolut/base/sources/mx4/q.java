package mx4;

import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.b9;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w80.b f210189a;

    public q(w80.b amountFormatter) {
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        this.f210189a = amountFormatter;
    }

    public final List a(dx4.s0 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        String str = item.f120759a;
        dj0.d dVar = item.f120760b;
        b9 b9Var = b9.WRAP_CONTENT;
        String str2 = item.f120761c;
        List listC = zhm.u.c(new CenteredAmountDelegate.Model(str, null, new bw0.h(this.f210189a.e(dVar), null, null, true, null, Boolean.FALSE, false, false, null, null, null, bw0.c.DisabledNotDimmed, 16342), null, str2 != null ? new bw0.m(new HtmlClause(0, 30, (Integer) null, (Object) null, str2), bw0.l.INFO, null, false, null, 28) : null, null, b9Var, null, null, null, null, dVar.f115083b, null, 6058));
        yp0.b.q(listC, 0, R$attr.uikit_dp12, 0, 0, 13);
        return listC;
    }
}
