package qc0;

import com.revolut.feature.backend_flow.domain.models.BackendScreen;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class i0 extends kotlin.jvm.internal.q implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        BackendScreen p0 = (BackendScreen) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((j0) this.receiver).s(p0);
    }
}
