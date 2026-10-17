package q6h;

import cli.n;
import cli.o;
import com.revolut.data.model.Data;
import ip0.pb0;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kp0.m;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class j implements n {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final BigDecimal f242602a = new BigDecimal(100);

    public static final class a {
        private a() {
        }
    }

    public static aim.e a(boolean z) {
        aim.e eVarB = u.b();
        for (int i = 0; i < 5; i++) {
            eVarB.add(new pb0(a0.d.n("loading_item_", i)));
        }
        aim.e eVarA = u.a(eVarB);
        if (z) {
            yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        }
        return eVarA;
    }

    public final List b(q6h.a aVar, del.b bVar) {
        List list;
        lk0.g gVar = aVar.f242595a;
        return (gVar == null || (list = (List) iii.c.g(gVar, new q3d.i(this, 25), new q34.a(14), new p40.n(this, bVar, 26))) == null) ? f0.f322471a : list;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        List list;
        q6h.a domainState = (q6h.a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f242596b;
        if (data == null || (list = (List) iii.c.f(data, new q3d.i(this, 24), new m(this, domainState, 28), new ox2.d(this, domainState, 27))) == null) {
            list = f0.f322471a;
        }
        return new c(list);
    }
}
