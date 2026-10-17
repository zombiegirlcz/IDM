package s44;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class q implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uh1.a f259770a;

    public q(uh1.a addressPrinter) {
        Intrinsics.checkNotNullParameter(addressPrinter, "addressPrinter");
        this.f259770a = addressPrinter;
    }

    public static TextLocalisedClause a(String str) {
        if (str != null) {
            return new TextLocalisedClause(R$string.credit_application_address_v2_subtitle, u.c(str), null, 12);
        }
        return null;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (m) iii.c.f(domainState.d, new ryd.i(this, domainState), new s42.f(1, domainState, this), new rbe.c(this, domainState, 23));
    }
}
