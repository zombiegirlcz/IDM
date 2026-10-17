package xw3;

import com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.OutstandingDebtsV2FlowContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import ngm.n;
import r74.q;
import wm3.j;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OutstandingDebtsV2FlowContract$InputData f309328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f309329b;

    public b(OutstandingDebtsV2FlowContract$InputData input, a debtsInteractor) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(debtsInteractor, "debtsInteractor");
        this.f309328a = input;
        this.f309329b = debtsInteractor;
    }

    @Override // r74.q
    public final Flow a() {
        return n.K(new j(this, null, 11));
    }
}
