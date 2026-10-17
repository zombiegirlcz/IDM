package cn5;

import cli.n;
import cli.y;
import com.revolut.feature.crypto.tfr.validation.impl.provide_details.ProvideDetailsScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends oki.h implements i {
    public final y o;

    public k(n stateMapper, ProvideDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = mra.d.b(this, new e(inputData.f71050a), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
