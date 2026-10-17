package ii4;

import com.revolut.feature.credit.application.plugins.api.models.config.SpinnerConfiguration;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class t0 implements cli.n {
    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        k0 domainState = (k0) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        SpinnerConfiguration.Content.SpinnerContent spinnerContent = domainState.f161533a;
        return new p0(spinnerContent.f66375a, spinnerContent.f66376b);
    }
}
