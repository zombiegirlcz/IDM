package qq6;

import cli.y;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import ood.o0;
import yji.l;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends h implements dli.b {
    public final oq6.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f248494p;

    public c(d mapper, oq6.a foreignCurrenciesInteractor) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(foreignCurrenciesInteractor, "foreignCurrenciesInteractor");
        this.o = foreignCurrenciesInteractor;
        this.f248494p = mra.d.b(this, new e(new Data(null, null, true, 3, null)), mapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        l.b1(this, nim.a.v(rd0.e.b(osg.b.k(this.o.f227752a, true, 2)), new o0(24)), null, new qp7.g(this, null, 4), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f248494p;
    }
}
