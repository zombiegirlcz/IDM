package v74;

import com.revolut.data.model.Data;
import com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.flow.CreditPromptFlowContract$InputData;
import go.g;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import r74.q;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditPromptFlowContract$InputData f286555a;

    public c(CreditPromptFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f286555a = inputData;
    }

    @Override // r74.q
    public final Flow a() {
        return new g(new Data(this.f286555a.f67348b, null, false, 6, null), 2);
    }
}
