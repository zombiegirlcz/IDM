package ct;

import cli.n;
import cli.y;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class l extends oki.h implements dli.b {

    @NotNull
    public static final k Companion = new k();
    public final y o;

    public l(n stateMapper) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = mra.d.b(this, new e(0), stateMapper, null, false, 12);
    }

    public final void I2(h event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (Intrinsics.f(event, f.f108553a)) {
            B2();
            return;
        }
        if (!(event instanceof g)) {
            throw new NoWhenBranchMatchedException();
        }
        String str = ((g) event).f108554a;
        if (str.length() > 4) {
            return;
        }
        H2(this.o, new cp7.k(event, 20));
        if (str.length() == 4) {
            C2(new i(str));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
