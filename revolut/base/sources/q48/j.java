package q48;

import cli.y;
import com.revolut.data.model.Data;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import q2e.i0;
import yji.l;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends oki.h implements dli.b {
    public final i4b.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f242080p;

    public j(i mapper, i4b.f legalEntityContextProvider) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(legalEntityContextProvider, "legalEntityContextProvider");
        this.o = legalEntityContextProvider;
        this.f242080p = mra.d.b(this, new d(new Data(null, null, true, 3, null)), mapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, this.o.j(null), null, null, new i0(this, (Continuation) null, 6), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f242080p;
    }
}
