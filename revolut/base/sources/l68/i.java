package l68;

import cli.n;
import cli.y;
import com.revolut.feature.junior.account_activation.impl.ui.screen.edit_name.EditNameControllerContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends oki.h implements dli.b {
    public final y o;

    public i(EditNameControllerContract$InputData inputData, n mapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        String str = inputData.f76666a;
        String str2 = inputData.f76667b;
        this.o = mra.d.b(this, new e(str, str2, str, str2, inputData.f76668c), mapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
