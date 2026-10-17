package to2;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.bank_account_switching.impl.ui.request_list.RequestListScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import tjf.p0;

/* JADX INFO: loaded from: classes21.dex */
public final class m extends oki.h implements dli.b {
    public final vo2.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f272507p;

    public m(cli.n stateMapper, RequestListScreenContract$InputData inputData, vo2.e requestListInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(requestListInteractor, "requestListInteractor");
        this.o = requestListInteractor;
        this.f272507p = mra.d.b(this, new f(inputData.f63957a, new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        n2(new p0(this, null, 5), new whi.b(6));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f272507p;
    }
}
