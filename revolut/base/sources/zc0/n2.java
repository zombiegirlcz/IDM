package zc0;

import com.revolut.feature.backend_flow.domain.models.BackendScreen;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class n2 extends kotlin.jvm.internal.q implements Function1 {
    public static final n2 f = new n2();

    public n2() {
        super(1, uc0.b.class, "isTransactionsSelectionScreen", "isTransactionsSelectionScreen(Lcom/revolut/feature/backend_flow/domain/models/BackendScreen;)Z", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        BackendScreen p0 = (BackendScreen) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return Boolean.valueOf(uc0.b.t(p0));
    }
}
