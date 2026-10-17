package sqf;

import com.revolut.feature.transfer.core.api.ui.reference.ReferenceInputData;
import jki.h;
import jki.i;
import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends jki.g implements h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ReferenceInputData f265089p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d f265090q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ReferenceInputData inputData, p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f265089p = inputData;
        this.f265090q = new d(inputData.f92162c, inputData.f92160a, inputData.f92161b, inputData.d);
    }

    @Override // jki.g
    public final i r2() {
        return this.f265090q;
    }
}
