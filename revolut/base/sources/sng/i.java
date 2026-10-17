package sng;

import cli.n;
import cli.y;
import cli.z;
import com.revolut.shared.feature.user_declarations.api.navigation.DateOfBirthControllerDescriptor$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i extends oki.h implements z {
    public final y o;

    public i(DateOfBirthControllerDescriptor$InputData inputData, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = mra.d.b(this, new d(inputData.f105049a, inputData.f105050b), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
