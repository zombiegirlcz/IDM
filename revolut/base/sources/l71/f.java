package l71;

import com.revolut.domain.models.user.UserCompanyRegion;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import l71.a;

/* JADX INFO: loaded from: classes20.dex */
public abstract class f {
    public static final boolean a(d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return dVar.a() == UserCompanyRegion.BR;
    }

    public static final boolean b(d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return dVar.a() == UserCompanyRegion.CO;
    }

    public static final boolean c(d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return dVar.a() == UserCompanyRegion.GB && dVar.b().equals(a.h0.f192478a);
    }

    public static final boolean d(d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return dVar.b().equals(a.j.f192480a);
    }

    public static final boolean e(d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return dVar.a() == UserCompanyRegion.IL;
    }

    public static final boolean f(d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return dVar.a() == UserCompanyRegion.MX;
    }

    public static final boolean g(d dVar) {
        return Intrinsics.f(dVar != null ? dVar.b() : null, a.b0.f192466a);
    }

    public static final boolean h(d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        a aVarB = dVar.b();
        if (aVarB.equals(a.b0.f192466a) || aVarB.equals(a.C1096a.f192463a) || aVarB.equals(a.z.f192496a) || aVarB.equals(a.b.f192465a) || aVarB.equals(a.c0.f192468a) || aVarB.equals(a.v.f192492a) || aVarB.equals(a.r.f192488a) || aVarB.equals(a.g.f192475a) || aVarB.equals(a.n.f192484a) || aVarB.equals(a.m.f192483a) || aVarB.equals(a.i.f192479a) || aVarB.equals(a.d.f192469a) || aVarB.equals(a.p.f192486a) || aVarB.equals(a.c.f192467a) || aVarB.equals(a.s.f192489a) || aVarB.equals(a.k.f192481a) || aVarB.equals(a.l.f192482a) || aVarB.equals(a.f.f192473a) || aVarB.equals(a.a0.f192464a) || aVarB.equals(a.h.f192477a) || aVarB.equals(a.q.f192487a) || aVarB.equals(a.o.f192485a) || aVarB.equals(a.j.f192480a) || aVarB.equals(a.e.f192471a)) {
            return true;
        }
        if (aVarB.equals(a.t.f192490a) || aVarB.equals(a.u.f192491a) || aVarB.equals(a.w.f192493a) || aVarB.equals(a.x.f192494a) || aVarB.equals(a.y.f192495a) || aVarB.equals(a.d0.f192470a) || aVarB.equals(a.e0.f192472a) || aVarB.equals(a.f0.f192474a) || aVarB.equals(a.g0.f192476a) || aVarB.equals(a.h0.f192478a) || (aVarB instanceof b)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean i(d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return dVar.a() == UserCompanyRegion.AE;
    }

    public static final wi0.b j(UserCompanyRegion userCompanyRegion) {
        Intrinsics.checkNotNullParameter(userCompanyRegion, "<this>");
        switch (e.f192501a[userCompanyRegion.ordinal()]) {
            case 1:
                wi0.b.Companion.getClass();
                return wi0.b.f297781v1;
            case 2:
                wi0.b.Companion.getClass();
                return wi0.b.f297760n0;
            case 3:
                wi0.b.Companion.getClass();
                return wi0.b.f297756l;
            case 4:
                wi0.b.Companion.getClass();
                return wi0.b.E;
            case 5:
                wi0.b.Companion.getClass();
                return wi0.b.X0;
            case 6:
                wi0.b.Companion.getClass();
                return wi0.b.f297770q3;
            case 7:
                wi0.b.Companion.getClass();
                return wi0.b.J;
            case 8:
                wi0.b.Companion.getClass();
                return wi0.b.L0;
            case 9:
                wi0.b.Companion.getClass();
                return wi0.b.l2;
            case 10:
                wi0.b.Companion.getClass();
                return wi0.b.J2;
            case 11:
                wi0.b.Companion.getClass();
                return wi0.b.f297750h0;
            case 12:
                wi0.b.Companion.getClass();
                return wi0.b.h2;
            case 13:
                wi0.b.Companion.getClass();
                return wi0.b.O0;
            case 14:
                wi0.b.Companion.getClass();
                return wi0.b.W;
            case 15:
                wi0.b.Companion.getClass();
                return wi0.b.f297771r;
            case 16:
                wi0.b.Companion.getClass();
                return wi0.b.Y1;
            case 17:
                wi0.b.Companion.getClass();
                return wi0.b.p0;
            case 18:
                wi0.b.Companion.getClass();
                return wi0.b.A;
            case 19:
                wi0.b.Companion.getClass();
                return wi0.b.y2;
            case 20:
                wi0.b.Companion.getClass();
                return wi0.b.T0;
            case 21:
                wi0.b.Companion.getClass();
                return wi0.b.t2;
            case 22:
                wi0.b.Companion.getClass();
                return wi0.b.k;
            case 23:
                wi0.b.Companion.getClass();
                return wi0.b.y0;
            case 24:
                wi0.b.Companion.getClass();
                return wi0.b.I0;
            case 25:
                wi0.b.Companion.getClass();
                return wi0.b.D2;
            case 26:
                wi0.b.Companion.getClass();
                return wi0.b.O;
            case 27:
                wi0.b.Companion.getClass();
                return wi0.b.I2;
            case 28:
                wi0.b.Companion.getClass();
                return wi0.b.f297753k0;
            case 29:
                wi0.b.Companion.getClass();
                return wi0.b.i2;
            case 30:
                wi0.b.Companion.getClass();
                return wi0.b.Y;
            case 31:
                wi0.b.Companion.getClass();
                return wi0.b.f297734c;
            case 32:
                wi0.b.Companion.getClass();
                return wi0.b.M0;
            default:
                return null;
        }
    }
}
