package wx6;

import cli.n;
import cli.o;
import com.revolut.feature.freelancer.impl.ui.invoice.screen.email_message.InvoiceEmailMessageScreenContract$InputData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import wvg.r1;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvoiceEmailMessageScreenContract$InputData f300769a;

    public l(InvoiceEmailMessageScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f300769a = inputData;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        h domainState = (h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new i((List) iii.c.f(domainState.f300760a, new r1(19), new wug.k(21), new k(this, domainState, 0)));
    }
}
