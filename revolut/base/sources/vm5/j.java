package vm5;

import cli.y;
import cli.z;
import com.revolut.feature.crypto.tfr.validation.impl.dob.DateOfBirthScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends oki.h implements z {
    public final y o;

    public j(l stateMapper, DateOfBirthScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = mra.d.b(this, new e(inputData.f71040a), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
