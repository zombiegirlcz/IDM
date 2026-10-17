package ill;

import cli.y;
import com.revolut.sso.impl.ui.choose_challenge.ChooseChallengeContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class j extends oki.h implements dli.b {
    public final y o;

    public j(ChooseChallengeContract$InputData inputData, k mapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.o = mra.d.b(this, new a(inputData.f106404a), mapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
