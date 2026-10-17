package x8h;

import com.revolut.data.model.Data;
import e7l.g;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import le.u1;

/* JADX INFO: loaded from: classes9.dex */
public final class e0 implements efm.x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ybl.b f303335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fk3.a f303336b;

    public e0(ybl.b instrumentTickerInteractor, fk3.a configurationInteractor) {
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        this.f303335a = instrumentTickerInteractor;
        this.f303336b = configurationInteractor;
    }

    public final efm.r a(List entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        List list = entries;
        boolean z = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it8 = list.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                if (((xzg.a0) it8.next()).f309970b instanceof xzg.y) {
                    z = true;
                    break;
                }
            }
        }
        return nim.a.w(u1.d(z ? ybl.b.c(this.f303335a) : te0.w.h(new Data(zhm.f0.f322471a, null, false, 6, null)), nim.a.w(((ik3.c) this.f303336b).k(g.b.f123407a), new h(7))), new x5f.m(5, this, entries));
    }

    @Override // efm.x
    public final efm.w apply(efm.r upstream) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        return pd.b.r(upstream, new d(this, 10));
    }
}
