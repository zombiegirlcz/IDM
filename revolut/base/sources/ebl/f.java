package ebl;

import com.revolut.shared.feature.suspicious_transaction.impl.ui.warning.WarningScreenContract$InputData;
import jki.i;
import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f extends jki.g implements d {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f124389p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(p stateMapper, WarningScreenContract$InputData inputData) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f124389p = new c(inputData.f105017a);
    }

    @Override // jki.g
    public final i r2() {
        return this.f124389p;
    }
}
