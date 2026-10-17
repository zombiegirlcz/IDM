package sdl;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import sdl.d1;

/* JADX INFO: loaded from: classes12.dex */
public abstract class r1 {
    public static final cfl.x a(g1 g1Var) {
        Intrinsics.checkNotNullParameter(g1Var, "<this>");
        return new cfl.x(g1Var.f261968a, g1Var.f261970c, g1Var.f261969b, g1Var.d);
    }

    public static final cfl.a0 b(n1 n1Var) {
        Intrinsics.checkNotNullParameter(n1Var, "<this>");
        m1 m1Var = n1Var.f261991a;
        Intrinsics.checkNotNullParameter(m1Var, "<this>");
        return new cfl.a0(new cfl.z(m1Var.f261984b, m1Var.f261983a));
    }

    public static final cfl.c0 c(q1 q1Var) {
        Intrinsics.checkNotNullParameter(q1Var, "<this>");
        return new cfl.c0(q1Var.f261993a, q1Var.f261994b, q1Var.f261995c, q1Var.d, q1Var.e);
    }

    public static final cfl.f0 d(d1 d1Var) {
        Intrinsics.checkNotNullParameter(d1Var, "<this>");
        if (d1Var instanceof d1.a) {
            d1.a aVar = (d1.a) d1Var;
            return new cfl.w(aVar.f261948b, c1.a(aVar.f261949c));
        }
        if (d1Var instanceof d1.c.a) {
            d1.c.a aVar2 = (d1.c.a) d1Var;
            return new cfl.y(aVar2.f261951b, c(aVar2.f261952c), a(aVar2.d), b(aVar2.e));
        }
        if (d1Var instanceof d1.c.b) {
            d1.c.b bVar = (d1.c.b) d1Var;
            return new cfl.b0(bVar.f261954b, c(bVar.f261955c), a(bVar.d), b(bVar.e));
        }
        if (d1Var instanceof d1.c.d) {
            d1.c.d dVar = (d1.c.d) d1Var;
            return new cfl.e0(dVar.f261960b, c(dVar.f261961c), a(dVar.d), b(dVar.e));
        }
        if (!(d1Var instanceof d1.c.C1454c)) {
            throw new NoWhenBranchMatchedException();
        }
        d1.c.C1454c c1454c = (d1.c.C1454c) d1Var;
        return new cfl.d0(c1454c.f261957b, c(c1454c.f261958c), a(c1454c.d), b(c1454c.e));
    }

    public static final g1 e(cfl.x xVar) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        return new g1(xVar.f23753a, xVar.f23755c, xVar.f23754b, xVar.d);
    }

    public static final n1 f(cfl.a0 a0Var) {
        Intrinsics.checkNotNullParameter(a0Var, "<this>");
        cfl.z zVar = a0Var.f23728a;
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        return new n1(new m1(zVar.f23760b, zVar.f23759a));
    }

    public static final q1 g(cfl.c0 c0Var) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        return new q1(c0Var.f23732a, c0Var.f23733b, c0Var.f23734c, c0Var.d, c0Var.e);
    }
}
