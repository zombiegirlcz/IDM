package bca;

import cli.n;
import cli.y;
import com.revolut.feature.pix.impl.flow.qr_request.screen.add_description.PixQrRequestAddDescriptionScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends oki.h implements dli.b {
    public final y o;

    public h(n stateMapper, PixQrRequestAddDescriptionScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        String str = inputData.f80725a;
        String str2 = "";
        if (str == null) {
            m70.a.c(t0.f186434a);
            str = "";
        }
        String str3 = inputData.f80725a;
        if (str3 == null) {
            m70.a.c(t0.f186434a);
        } else {
            str2 = str3;
        }
        this.o = mra.d.b(this, new e(str, str2), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
