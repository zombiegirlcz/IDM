package azc;

import at.r;
import cli.y;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class n extends oki.h implements dli.b {
    public final y o;

    public n(String currentNote, r mapper) {
        Intrinsics.checkNotNullParameter(currentNote, "currentNote");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.o = mra.d.b(this, new i(currentNote, currentNote), mapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
