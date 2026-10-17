package tyc;

import cli.y;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class j extends oki.h implements dli.b {
    public final y o;

    public j(String userDefinedType, l mapper) {
        Intrinsics.checkNotNullParameter(userDefinedType, "userDefinedType");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.o = mra.d.b(this, new e(userDefinedType), mapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
