package x9h;

import efm.r;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ox5.e0;
import x8i.h;
import xzg.n0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f303732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b9k.f f303733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w0h.d f303734c;

    public /* synthetic */ c(b9k.f fVar, w0h.d dVar, int i) {
        this.f303732a = i;
        this.f303733b = fVar;
        this.f303734c = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        r rVarV;
        switch (this.f303732a) {
            case 0:
                n0 filter = (n0) obj2;
                Intrinsics.checkNotNullParameter(filter, "filter");
                n0 n0Var = n0.LOSERS;
                b9k.f fVar = this.f303733b;
                w0h.d dVar = this.f303734c;
                if (filter == n0Var) {
                    fVar.getClass();
                    rVarV = fVar.v(dVar, n0Var, new a(fVar, 1), new b(fVar, 2), new h(9));
                } else {
                    fVar.getClass();
                    rVarV = fVar.v(dVar, n0.GAINERS, new a(fVar, 0), new b(fVar, 1), new h(8));
                }
                return nim.a.w(rVarV, new e0(filter, 1));
            default:
                List entries = (List) obj2;
                Intrinsics.checkNotNullParameter(entries, "entries");
                return zi0.c.u(h0h.b.a((e9h.d) this.f303733b.f13816a, entries, h0h.a.ONE_DAY, null, false, 12), new x8h.d(this.f303734c, 17));
        }
    }
}
