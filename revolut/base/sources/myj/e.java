package myj;

import efm.d0;
import efm.r;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kx7.o0;
import mx0.oc;
import te0.w;
import u09.v;
import ufm.i;
import zhm.y0;

/* JADX INFO: loaded from: classes11.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xoj.a f210547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f210548b;

    public e(xoj.a featuresInteractor) {
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        this.f210547a = featuresInteractor;
        this.f210548b = y0.b(v.PRO);
    }

    public final d0 a(v domain) {
        Intrinsics.checkNotNullParameter(domain, "domain");
        if (this.f210548b.contains(domain)) {
            return w.j(yoj.d.ENABLED);
        }
        yoj.c cVar = null;
        switch (c.f210546a[domain.ordinal()]) {
            case 1:
                cVar = yoj.c.LEARN_CRYPTO;
                break;
            case 2:
                cVar = yoj.c.LEARN_STOCKS;
                break;
            case 3:
                cVar = yoj.c.LEARN_FRAUD;
                break;
            case 4:
                cVar = yoj.c.LEARN_APP_TIPS;
                break;
            case 5:
            case 6:
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        if (cVar == null) {
            return w.j(yoj.d.DISABLED);
        }
        d0 d0VarE = ((cpj.b) this.f210547a).e(cVar, yoj.d.DISABLED);
        d dVar = d.f;
        return new i(d0VarE, new o0(17), 1);
    }

    public final r b() {
        return nim.a.w(((cpj.b) this.f210547a).k(yoj.c.LEARN, yoj.d.DISABLED), new oc(11));
    }
}
