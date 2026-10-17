package g35;

import com.revolut.feature.credit.impl.ui.entry_points.CreditEntryPointsControllerContract$InputData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class n implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditEntryPointsControllerContract$InputData f140200a;

    public n(CreditEntryPointsControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f140200a = inputData;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new l(domainState.f140193a, (List) iii.c.f(domainState.f140194b, new g1k.k(this, 27), new g0c.h(27), new fnk.o(this, 18)));
    }
}
