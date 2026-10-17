package val;

import com.revolut.shared.feature.suspicious_transaction.impl.ui.actions.ActionsScreenContract$InputData;
import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class h extends jki.g implements f {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f287337p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(p stateMapper, ActionsScreenContract$InputData inputData) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f287337p = new e(inputData.f105007a);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f287337p;
    }
}
