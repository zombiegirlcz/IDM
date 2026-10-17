package lp;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.crypto_investments.impl.data.database.CryptoInvestmentsDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public abstract class h1 implements e4m.e {
    public static b60.a A(baj.a aVar) {
        b60.a aVarA = aVar.a();
        vc.s.k(aVarA);
        return aVarA;
    }

    public static if0.a B(tg5.d dVar) {
        return new if0.a(ImmutableSet.of((od0.e) dVar.f271076p.get(), (od0.e) dVar.o.get()));
    }

    public static if0.a C(ku5.g gVar) {
        yk0.a databaseSessionProvider = gVar.e.b();
        vc.s.j(databaseSessionProvider);
        ee0.a aVar = gVar.o;
        je0.d mapper = aVar.b();
        vc.s.j(mapper);
        xe0.f storageFactory = aVar.f();
        vc.s.j(storageFactory);
        du5.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return new if0.a(ImmutableSet.of((xqj.a) xe0.f.f(storageFactory, databaseSessionProvider, "crypto_investments_storage", mapper, 0, null, 56), (xqj.a) gVar.f(), (xqj.a) gVar.a(), new xqj.a(gVar.d, (CryptoInvestmentsDatabase) gVar.f189695y.get())));
    }

    public static b60.a D(mh5.a aVar) {
        b60.a aVar2 = (b60.a) aVar.e.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a a(ju5.b bVar) {
        b60.a aVarA = bVar.a();
        vc.s.k(aVarA);
        return aVarA;
    }

    public static b60.a b(ju5.b bVar) {
        b60.a aVarA = bVar.a();
        vc.s.k(aVarA);
        return aVarA;
    }

    public static b60.a c(ju5.d dVar) {
        b60.a aVar = (b60.a) dVar.u.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a d(ju5.d dVar) {
        b60.a aVar = (b60.a) dVar.u.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a e(gh5.b bVar) {
        b60.a aVar = (b60.a) bVar.f143854b.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a f(gh5.b bVar) {
        b60.a aVar = (b60.a) bVar.f143854b.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a g(mh5.b bVar) {
        b60.a aVar = (b60.a) bVar.f205420b.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a h(mh5.b bVar) {
        b60.a aVar = (b60.a) bVar.f205420b.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a i(baj.a aVar) {
        b60.a aVarA = aVar.a();
        vc.s.k(aVarA);
        return aVarA;
    }

    public static b60.a j(baj.a aVar) {
        b60.a aVarA = aVar.a();
        vc.s.k(aVarA);
        return aVarA;
    }

    public static b60.a k(mh5.a aVar) {
        b60.a aVar2 = (b60.a) aVar.e.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a l(mh5.a aVar) {
        b60.a aVar2 = (b60.a) aVar.e.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static hh5.b m(b60.a aVar) {
        hh5.b bVar = (hh5.b) aVar.b();
        vc.s.k(bVar);
        return bVar;
    }

    public static nh5.a n(b60.a aVar) {
        nh5.a aVar2 = (nh5.a) aVar.b();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static nh5.b o(b60.a aVar) {
        nh5.b bVar = (nh5.b) aVar.b();
        vc.s.k(bVar);
        return bVar;
    }

    public static aaj.a p(b60.a aVar) {
        aaj.a aVar2 = (aaj.a) aVar.b();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static sg5.c q(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, a31.a aVar7, a31.a aVar8, a31.a aVar9, a31.a aVar10, a31.a aVar11) {
        return new sg5.c(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11);
    }

    public static b60.a r(ju5.b bVar) {
        b60.a aVarA = bVar.a();
        vc.s.k(aVarA);
        return aVarA;
    }

    public static a31.a s(p1 p1Var) {
        return new a31.a(p1Var);
    }

    public static b60.a t(gh5.b bVar) {
        b60.a aVar = (b60.a) bVar.f143854b.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static a31.a u(p1 p1Var) {
        return new a31.a(p1Var);
    }

    public static a31.a v(p1 p1Var) {
        return new a31.a(p1Var);
    }

    public static b60.a w(mh5.b bVar) {
        b60.a aVar = (b60.a) bVar.f205420b.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static gh5.b x(a31.a aVar) {
        return new gh5.b(aVar);
    }

    public static mh5.a y(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4) {
        return new mh5.a(aVar, aVar2, aVar3, aVar4);
    }

    public static mh5.b z(a31.a aVar) {
        return new mh5.b(aVar);
    }
}
