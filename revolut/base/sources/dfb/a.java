package dfb;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.retail.reverywhere.impl.network.ReverywhereService;
import kotlin.jvm.internal.Intrinsics;
import vc.s;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f113828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f113829b;

    public a(b bVar, int i) {
        this.f113828a = bVar;
        this.f113829b = i;
    }

    @Override // phm.a
    public final Object get() {
        b bVar = this.f113828a;
        ee0.a aVar = bVar.f113832c;
        nj0.a aVar2 = bVar.f113834h;
        int i = this.f113829b;
        if (i == 0) {
            h hVar = bVar.f113830a;
            efb.c cVar = (efb.c) hVar.f113862c.get();
            s.j(cVar);
            efb.a aVar3 = (efb.a) hVar.e.get();
            s.j(aVar3);
            efb.j jVar = (efb.j) hVar.f113863g.get();
            s.j(jVar);
            efb.b bVar2 = (efb.b) hVar.i.get();
            s.j(bVar2);
            ImmutableSet immutableSetOf = ImmutableSet.of(new cfb.b(cVar, aVar3, jVar, bVar2));
            gte.a aVarB = bVar.f113831b.b();
            s.j(aVarB);
            return new bfb.d(immutableSetOf, aVarB);
        }
        if (i != 1) {
            if (i == 2) {
                return new efb.h((zeb.k) bVar.f113843t.get());
            }
            if (i == 3) {
                return new zeb.k((ReverywhereService) bVar.f113842s.get(), new ne0.d(), (ue0.c) bVar.f113841r.get());
            }
            if (i != 4) {
                throw new AssertionError(i);
            }
            ik0.b bVarM = ((nj0.d) aVar2).m();
            s.j(bVarM);
            yeb.a aVar4 = (yeb.a) bVar.i.f113859b.get();
            s.j(aVar4);
            return p.a(bVarM, aVar4, ((nj0.d) aVar2).d());
        }
        je0.d mapper = aVar.b();
        s.j(mapper);
        yk0.a databaseSessionProvider = bVar.d.b();
        s.j(databaseSessionProvider);
        xe0.f storageFactory = aVar.f();
        s.j(storageFactory);
        n.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "reverywhere", mapper, 0, null, 56);
    }
}
