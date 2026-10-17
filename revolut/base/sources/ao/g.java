package ao;

import androidx.room.EntityInsertAdapter;
import androidx.sqlite.SQLiteStatement;
import com.revolut.feature.contacts.impl.GsonHolder;
import iv9.n;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import ml3.p;
import ml3.u;
import ml3.v;
import n77.k;
import nif.a3;
import nif.a4;
import nif.c3;
import nif.e1;
import nif.i1;
import nif.j1;
import nif.k1;
import nif.l1;
import nif.m1;
import nif.q2;
import nif.w0;
import o45.b1;
import o45.b2;
import o45.c0;
import o45.c2;
import o45.f0;
import o45.f1;
import o45.j0;
import o45.m;
import o45.p0;
import o45.s;
import o45.v0;
import o45.w1;
import o45.x1;
import o45.y0;
import o45.y1;
import o45.z;
import org.joda.time.DateTime;
import prk.o;

/* JADX INFO: loaded from: classes.dex */
public final class g extends EntityInsertAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7845a;

    public /* synthetic */ g(int i) {
        this.f7845a = i;
    }

    private final void a(SQLiteStatement sQLiteStatement, Object obj2) {
        e1 e1Var = (e1) obj2;
        if (e1Var.d() == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, e1Var.d());
        }
        if (e1Var.y() == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindText(2, e1Var.y());
        }
        if (e1Var.x() == null) {
            sQLiteStatement.bindNull(3);
        } else {
            sQLiteStatement.bindText(3, e1Var.x());
        }
        if (e1Var.f() == null) {
            sQLiteStatement.bindNull(4);
        } else {
            sQLiteStatement.bindText(4, e1Var.f());
        }
        if (e1Var.e() == null) {
            sQLiteStatement.bindNull(5);
        } else {
            sQLiteStatement.bindText(5, e1Var.e());
        }
        if (e1Var.u() == null) {
            sQLiteStatement.bindNull(6);
        } else {
            sQLiteStatement.bindLong(6, e1Var.u().longValue());
        }
        if (e1Var.t() == null) {
            sQLiteStatement.bindNull(7);
        } else {
            sQLiteStatement.bindLong(7, e1Var.t().longValue());
        }
        if (e1Var.s() == null) {
            sQLiteStatement.bindNull(8);
        } else {
            sQLiteStatement.bindLong(8, e1Var.s().longValue());
        }
        if (e1Var.v() == null) {
            sQLiteStatement.bindNull(9);
        } else {
            sQLiteStatement.bindLong(9, e1Var.v().longValue());
        }
        if (e1Var.i() == null) {
            sQLiteStatement.bindNull(10);
        } else {
            sQLiteStatement.bindLong(10, e1Var.i().longValue());
        }
        if (e1Var.h() == null) {
            sQLiteStatement.bindNull(11);
        } else {
            sQLiteStatement.bindLong(11, e1Var.h().longValue());
        }
        if (e1Var.g() == null) {
            sQLiteStatement.bindNull(12);
        } else {
            sQLiteStatement.bindLong(12, e1Var.g().longValue());
        }
        if (e1Var.j() == null) {
            sQLiteStatement.bindNull(13);
        } else {
            sQLiteStatement.bindLong(13, e1Var.j().longValue());
        }
        if (e1Var.n() == null) {
            sQLiteStatement.bindNull(14);
        } else {
            sQLiteStatement.bindLong(14, e1Var.n().longValue());
        }
        if (e1Var.m() == null) {
            sQLiteStatement.bindNull(15);
        } else {
            sQLiteStatement.bindLong(15, e1Var.m().longValue());
        }
        if (e1Var.l() == null) {
            sQLiteStatement.bindNull(16);
        } else {
            sQLiteStatement.bindLong(16, e1Var.l().longValue());
        }
        if (e1Var.o() == null) {
            sQLiteStatement.bindNull(17);
        } else {
            sQLiteStatement.bindLong(17, e1Var.o().longValue());
        }
        if (e1Var.q() == null) {
            sQLiteStatement.bindNull(18);
        } else {
            sQLiteStatement.bindLong(18, e1Var.q().longValue());
        }
        if (e1Var.w() == null) {
            sQLiteStatement.bindNull(19);
        } else {
            sQLiteStatement.bindLong(19, e1Var.w().longValue());
        }
        if (e1Var.k() == null) {
            sQLiteStatement.bindNull(20);
        } else {
            sQLiteStatement.bindLong(20, e1Var.k().longValue());
        }
        if (e1Var.p() == null) {
            sQLiteStatement.bindNull(21);
        } else {
            sQLiteStatement.bindLong(21, e1Var.p().longValue());
        }
        if (e1Var.b() == null) {
            sQLiteStatement.bindNull(22);
        } else {
            sQLiteStatement.bindText(22, e1Var.b());
        }
        if (e1Var.a() == null) {
            sQLiteStatement.bindNull(23);
        } else {
            sQLiteStatement.bindText(23, e1Var.a());
        }
        if (e1Var.c() == null) {
            sQLiteStatement.bindNull(24);
        } else {
            sQLiteStatement.bindText(24, e1Var.c());
        }
        if (e1Var.r() == null) {
            sQLiteStatement.bindNull(25);
        } else {
            sQLiteStatement.bindText(25, e1Var.r());
        }
        q2 q2VarZ = e1Var.z();
        if (q2VarZ == null) {
            o.z(sQLiteStatement, 26, 27, 28, 29);
            return;
        }
        if (q2VarZ.a() == null) {
            sQLiteStatement.bindNull(26);
        } else {
            sQLiteStatement.bindLong(26, q2VarZ.a().longValue());
        }
        if (q2VarZ.c() == null) {
            sQLiteStatement.bindNull(27);
        } else {
            sQLiteStatement.bindLong(27, q2VarZ.c().longValue());
        }
        if (q2VarZ.b() == null) {
            sQLiteStatement.bindNull(28);
        } else {
            sQLiteStatement.bindLong(28, q2VarZ.b().longValue());
        }
        sQLiteStatement.bindLong(29, q2VarZ.d());
    }

    private final void b(SQLiteStatement sQLiteStatement, Object obj2) {
        String strK;
        ml3.i iVar = (ml3.i) obj2;
        sQLiteStatement.bindLong(1, iVar.i());
        if (iVar.n() == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindText(2, iVar.n());
        }
        if (iVar.g() == null) {
            sQLiteStatement.bindNull(3);
        } else {
            sQLiteStatement.bindText(3, iVar.g());
        }
        if (iVar.h() == null) {
            sQLiteStatement.bindNull(4);
        } else {
            sQLiteStatement.bindText(4, iVar.h());
        }
        if (iVar.k() == null) {
            sQLiteStatement.bindNull(5);
        } else {
            sQLiteStatement.bindText(5, iVar.k());
        }
        if (iVar.o() == null) {
            sQLiteStatement.bindNull(6);
        } else {
            sQLiteStatement.bindText(6, iVar.o());
        }
        if (iVar.s() == null) {
            sQLiteStatement.bindNull(7);
        } else {
            sQLiteStatement.bindText(7, iVar.s());
        }
        if (iVar.d() == null) {
            sQLiteStatement.bindNull(8);
        } else {
            sQLiteStatement.bindText(8, iVar.d());
        }
        sQLiteStatement.bindLong(9, iVar.u() ? 1L : 0L);
        sQLiteStatement.bindLong(10, iVar.t() ? 1L : 0L);
        if (iVar.j() == null) {
            sQLiteStatement.bindNull(11);
        } else {
            sQLiteStatement.bindLong(11, iVar.j().longValue());
        }
        if (iVar.c() == null) {
            sQLiteStatement.bindNull(12);
        } else {
            sQLiteStatement.bindText(12, iVar.c());
        }
        sQLiteStatement.bindLong(13, iVar.q());
        sQLiteStatement.bindLong(14, iVar.p());
        if (iVar.m() == null) {
            sQLiteStatement.bindNull(15);
        } else {
            sQLiteStatement.bindText(15, iVar.m());
        }
        ll3.a aVarR = iVar.r();
        if (aVarR != null) {
            strK = GsonHolder.a().k(aVarR);
            Intrinsics.checkNotNullExpressionValue(strK, "toJson(...)");
        } else {
            strK = null;
        }
        if (strK == null) {
            sQLiteStatement.bindNull(16);
        } else {
            sQLiteStatement.bindText(16, strK);
        }
        if (iVar.e() == null) {
            sQLiteStatement.bindNull(17);
        } else {
            sQLiteStatement.bindText(17, iVar.e());
        }
        if (iVar.b() == null) {
            sQLiteStatement.bindNull(18);
        } else {
            sQLiteStatement.bindText(18, iVar.b());
        }
        if (iVar.l() == null) {
            sQLiteStatement.bindNull(19);
        } else {
            sQLiteStatement.bindText(19, iVar.l());
        }
        if (iVar.f() == null) {
            sQLiteStatement.bindNull(20);
        } else {
            sQLiteStatement.bindText(20, iVar.f());
        }
    }

    private final void c(SQLiteStatement sQLiteStatement, Object obj2) {
        p pVar = (p) obj2;
        if (pVar.c() == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, pVar.c());
        }
        if (pVar.h() == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindText(2, pVar.h());
        }
        if (pVar.g() == null) {
            sQLiteStatement.bindNull(3);
        } else {
            sQLiteStatement.bindText(3, pVar.g());
        }
        if (pVar.a() == null) {
            sQLiteStatement.bindNull(4);
        } else {
            sQLiteStatement.bindText(4, pVar.a());
        }
        if (pVar.f() == null) {
            sQLiteStatement.bindNull(5);
        } else {
            sQLiteStatement.bindText(5, pVar.f());
        }
        if (pVar.d() == null) {
            sQLiteStatement.bindNull(6);
        } else {
            sQLiteStatement.bindText(6, pVar.d());
        }
        if (pVar.e() == null) {
            sQLiteStatement.bindNull(7);
        } else {
            sQLiteStatement.bindText(7, pVar.e());
        }
        if (pVar.b() == null) {
            sQLiteStatement.bindNull(8);
        } else {
            sQLiteStatement.bindText(8, pVar.b());
        }
    }

    private final void d(SQLiteStatement sQLiteStatement, Object obj2) {
        u uVar = (u) obj2;
        if (uVar.a() == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, uVar.a());
        }
        v value = uVar.d();
        Intrinsics.checkNotNullParameter(value, "value");
        String strName = value.name();
        if (strName == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindText(2, strName);
        }
        sQLiteStatement.bindLong(3, uVar.c());
        sQLiteStatement.bindLong(4, uVar.b());
    }

    private final void e(SQLiteStatement sQLiteStatement, Object obj2) {
        String strC;
        String strC2;
        String strC3;
        String strC4;
        z zVar = (z) obj2;
        if (zVar.h() == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, zVar.h());
        }
        sQLiteStatement.bindLong(2, zVar.g());
        sQLiteStatement.bindLong(3, zVar.m());
        sQLiteStatement.bindLong(4, zVar.k());
        String strA = r45.a.a(zVar.b());
        if (strA == null) {
            sQLiteStatement.bindNull(5);
        } else {
            sQLiteStatement.bindText(5, strA);
        }
        String strA2 = r45.a.a(zVar.a());
        if (strA2 == null) {
            sQLiteStatement.bindNull(6);
        } else {
            sQLiteStatement.bindText(6, strA2);
        }
        String strA3 = r45.a.a(zVar.j());
        if (strA3 == null) {
            sQLiteStatement.bindNull(7);
        } else {
            sQLiteStatement.bindText(7, strA3);
        }
        sQLiteStatement.bindLong(8, zVar.i());
        sQLiteStatement.bindLong(9, zVar.o() ? 1L : 0L);
        o45.v vVarN = zVar.n();
        String strC5 = null;
        if (vVarN != null) {
            Json jsonA = h55.b.a();
            jsonA.getClass();
            strC = jsonA.c(o45.v.Companion.serializer(), vVarN);
        } else {
            strC = null;
        }
        if (strC == null) {
            sQLiteStatement.bindNull(10);
        } else {
            sQLiteStatement.bindText(10, strC);
        }
        List listF = zVar.f();
        if (listF != null) {
            Json jsonA2 = h55.b.a();
            jsonA2.getClass();
            strC2 = jsonA2.c(new qlm.e(m.Companion.serializer()), listF);
        } else {
            strC2 = null;
        }
        if (strC2 == null) {
            sQLiteStatement.bindNull(11);
        } else {
            sQLiteStatement.bindText(11, strC2);
        }
        o45.g gVarD = zVar.d();
        if (gVarD != null) {
            Json jsonA3 = h55.b.a();
            jsonA3.getClass();
            strC3 = jsonA3.c(o45.g.INSTANCE.serializer(), gVarD);
        } else {
            strC3 = null;
        }
        if (strC3 == null) {
            sQLiteStatement.bindNull(12);
        } else {
            sQLiteStatement.bindText(12, strC3);
        }
        o45.j jVarE = zVar.e();
        if (jVarE != null) {
            Json jsonA4 = h55.b.a();
            jsonA4.getClass();
            strC4 = jsonA4.c(o45.j.Companion.serializer(), jVarE);
        } else {
            strC4 = null;
        }
        if (strC4 == null) {
            sQLiteStatement.bindNull(13);
        } else {
            sQLiteStatement.bindText(13, strC4);
        }
        s sVarL = zVar.l();
        if (sVarL != null) {
            Json jsonA5 = h55.b.a();
            jsonA5.getClass();
            strC5 = jsonA5.c(s.Companion.serializer(), sVarL);
        }
        if (strC5 == null) {
            sQLiteStatement.bindNull(14);
        } else {
            sQLiteStatement.bindText(14, strC5);
        }
        if (zVar.c() == null) {
            sQLiteStatement.bindNull(15);
        } else {
            sQLiteStatement.bindText(15, zVar.c());
        }
    }

    private final void f(SQLiteStatement sQLiteStatement, Object obj2) {
        String strC;
        String strC2;
        String strC3;
        String strC4;
        String strC5;
        String strC6;
        String strC7;
        w1 w1Var = (w1) obj2;
        if (w1Var.h() == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, w1Var.h());
        }
        if (w1Var.m() == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindText(2, w1Var.m());
        }
        LocalDate localDateD = w1Var.d();
        String strC8 = null;
        String strC9 = localDateD != null ? h55.b.a().c(ie0.m.f160609a, localDateD) : null;
        if (strC9 == null) {
            sQLiteStatement.bindNull(3);
        } else {
            sQLiteStatement.bindText(3, strC9);
        }
        LocalDate localDateE = w1Var.e();
        String strC10 = localDateE != null ? h55.b.a().c(ie0.m.f160609a, localDateE) : null;
        if (strC10 == null) {
            sQLiteStatement.bindNull(4);
        } else {
            sQLiteStatement.bindText(4, strC10);
        }
        if (w1Var.c() == null) {
            sQLiteStatement.bindNull(5);
        } else {
            sQLiteStatement.bindText(5, w1Var.c());
        }
        if (w1Var.b() == null) {
            sQLiteStatement.bindNull(6);
        } else {
            sQLiteStatement.bindText(6, w1Var.b());
        }
        sQLiteStatement.bindLong(7, w1Var.q());
        sQLiteStatement.bindLong(8, w1Var.o());
        if (w1Var.p() == null) {
            sQLiteStatement.bindNull(9);
        } else {
            sQLiteStatement.bindLong(9, w1Var.p().longValue());
        }
        if (w1Var.f() == null) {
            sQLiteStatement.bindNull(10);
        } else {
            sQLiteStatement.bindLong(10, w1Var.f().longValue());
        }
        sQLiteStatement.bindLong(11, w1Var.w());
        sQLiteStatement.bindLong(12, w1Var.x());
        sQLiteStatement.bindDouble(13, w1Var.g());
        f1 f1VarV = w1Var.v();
        if (f1VarV != null) {
            Json jsonA = h55.b.a();
            jsonA.getClass();
            strC = jsonA.c(f1.INSTANCE.serializer(), f1VarV);
        } else {
            strC = null;
        }
        if (strC == null) {
            sQLiteStatement.bindNull(14);
        } else {
            sQLiteStatement.bindText(14, strC);
        }
        if (w1Var.r() == null) {
            sQLiteStatement.bindNull(15);
        } else {
            sQLiteStatement.bindText(15, w1Var.r());
        }
        sQLiteStatement.bindLong(16, w1Var.u());
        sQLiteStatement.bindLong(17, w1Var.t());
        v0 v0VarK = w1Var.k();
        if (v0VarK != null) {
            Json jsonA2 = h55.b.a();
            jsonA2.getClass();
            strC2 = jsonA2.c(v0.Companion.serializer(), v0VarK);
        } else {
            strC2 = null;
        }
        if (strC2 == null) {
            sQLiteStatement.bindNull(18);
        } else {
            sQLiteStatement.bindText(18, strC2);
        }
        f0 f0VarN = w1Var.n();
        if (f0VarN != null) {
            Json jsonA3 = h55.b.a();
            jsonA3.getClass();
            strC3 = jsonA3.c(f0.Companion.serializer(), f0VarN);
        } else {
            strC3 = null;
        }
        if (strC3 == null) {
            sQLiteStatement.bindNull(19);
        } else {
            sQLiteStatement.bindText(19, strC3);
        }
        b1 b1VarL = w1Var.l();
        if (b1VarL != null) {
            Json jsonA4 = h55.b.a();
            jsonA4.getClass();
            strC4 = jsonA4.c(b1.Companion.serializer(), b1VarL);
        } else {
            strC4 = null;
        }
        if (strC4 == null) {
            sQLiteStatement.bindNull(20);
        } else {
            sQLiteStatement.bindText(20, strC4);
        }
        c0 c0VarA = w1Var.a();
        if (c0VarA != null) {
            Json jsonA5 = h55.b.a();
            jsonA5.getClass();
            strC5 = jsonA5.c(c0.Companion.serializer(), c0VarA);
        } else {
            strC5 = null;
        }
        if (strC5 == null) {
            sQLiteStatement.bindNull(21);
        } else {
            sQLiteStatement.bindText(21, strC5);
        }
        y0 y0VarS = w1Var.s();
        if (y0VarS != null) {
            Json jsonA6 = h55.b.a();
            jsonA6.getClass();
            strC6 = jsonA6.c(y0.Companion.serializer(), y0VarS);
        } else {
            strC6 = null;
        }
        if (strC6 == null) {
            sQLiteStatement.bindNull(22);
        } else {
            sQLiteStatement.bindText(22, strC6);
        }
        p0 p0VarJ = w1Var.j();
        if (p0VarJ != null) {
            Json jsonA7 = h55.b.a();
            jsonA7.getClass();
            strC7 = jsonA7.c(p0.Companion.serializer(), p0VarJ);
        } else {
            strC7 = null;
        }
        if (strC7 == null) {
            sQLiteStatement.bindNull(23);
        } else {
            sQLiteStatement.bindText(23, strC7);
        }
        j0 j0VarI = w1Var.i();
        if (j0VarI != null) {
            Json jsonA8 = h55.b.a();
            jsonA8.getClass();
            strC8 = jsonA8.c(j0.INSTANCE.serializer(), j0VarI);
        }
        if (strC8 == null) {
            sQLiteStatement.bindNull(24);
        } else {
            sQLiteStatement.bindText(24, strC8);
        }
    }

    private final void g(SQLiteStatement sQLiteStatement, Object obj2) {
        x1 x1Var = (x1) obj2;
        if (x1Var.b() == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, x1Var.b());
        }
        sQLiteStatement.bindLong(2, x1Var.c() ? 1L : 0L);
    }

    private final void h(SQLiteStatement sQLiteStatement, Object obj2) {
        y1 y1Var = (y1) obj2;
        if (y1Var.j() == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, y1Var.j());
        }
        if (y1Var.k() == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindText(2, y1Var.k());
        }
        if (y1Var.g() == null) {
            sQLiteStatement.bindNull(3);
        } else {
            sQLiteStatement.bindText(3, y1Var.g());
        }
        if (y1Var.f() == null) {
            sQLiteStatement.bindNull(4);
        } else {
            sQLiteStatement.bindText(4, y1Var.f());
        }
        if (y1Var.h() == null) {
            sQLiteStatement.bindNull(5);
        } else {
            sQLiteStatement.bindText(5, y1Var.h());
        }
        sQLiteStatement.bindLong(6, y1Var.a());
        if (y1Var.c() == null) {
            sQLiteStatement.bindNull(7);
        } else {
            sQLiteStatement.bindText(7, y1Var.c());
        }
        if (y1Var.m() == null) {
            sQLiteStatement.bindNull(8);
        } else {
            sQLiteStatement.bindText(8, y1Var.m());
        }
        if (y1Var.l() == null) {
            sQLiteStatement.bindNull(9);
        } else {
            sQLiteStatement.bindText(9, y1Var.l());
        }
        sQLiteStatement.bindLong(10, y1Var.i() ? 1L : 0L);
        if (y1Var.b() == null) {
            sQLiteStatement.bindNull(11);
        } else {
            sQLiteStatement.bindText(11, y1Var.b());
        }
        if (y1Var.d() == null) {
            sQLiteStatement.bindNull(12);
        } else {
            sQLiteStatement.bindText(12, y1Var.d());
        }
        if (y1Var.e() == null) {
            sQLiteStatement.bindNull(13);
        } else {
            sQLiteStatement.bindText(13, y1Var.e());
        }
    }

    private final void i(SQLiteStatement sQLiteStatement, Object obj2) {
        String strC;
        c2 c2Var = (c2) obj2;
        if (c2Var.k() == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, c2Var.k());
        }
        if (c2Var.g() == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindText(2, c2Var.g());
        }
        if (c2Var.n() == null) {
            sQLiteStatement.bindNull(3);
        } else {
            sQLiteStatement.bindText(3, c2Var.n());
        }
        if (c2Var.m() == null) {
            sQLiteStatement.bindNull(4);
        } else {
            sQLiteStatement.bindText(4, c2Var.m());
        }
        if (c2Var.e() == null) {
            sQLiteStatement.bindNull(5);
        } else {
            sQLiteStatement.bindText(5, c2Var.e());
        }
        sQLiteStatement.bindLong(6, c2Var.c());
        if (c2Var.p() == null) {
            sQLiteStatement.bindNull(7);
        } else {
            sQLiteStatement.bindText(7, c2Var.p());
        }
        if (c2Var.d() == null) {
            sQLiteStatement.bindNull(8);
        } else {
            sQLiteStatement.bindText(8, c2Var.d());
        }
        if (c2Var.f() == null) {
            sQLiteStatement.bindNull(9);
        } else {
            sQLiteStatement.bindText(9, c2Var.f());
        }
        if (c2Var.i() == null) {
            sQLiteStatement.bindNull(10);
        } else {
            sQLiteStatement.bindText(10, c2Var.i());
        }
        if (c2Var.l() == null) {
            sQLiteStatement.bindNull(11);
        } else {
            sQLiteStatement.bindLong(11, c2Var.l().longValue());
        }
        if (c2Var.b() == null) {
            sQLiteStatement.bindNull(12);
        } else {
            sQLiteStatement.bindLong(12, c2Var.b().longValue());
        }
        if (c2Var.j() == null) {
            sQLiteStatement.bindNull(13);
        } else {
            sQLiteStatement.bindLong(13, c2Var.j().longValue());
        }
        if (c2Var.o() == null) {
            sQLiteStatement.bindNull(14);
        } else {
            sQLiteStatement.bindText(14, c2Var.o());
        }
        b2 b2VarA = c2Var.a();
        if (b2VarA != null) {
            Json jsonA = h55.b.a();
            jsonA.getClass();
            strC = jsonA.c(b2.Companion.serializer(), b2VarA);
        } else {
            strC = null;
        }
        if (strC == null) {
            sQLiteStatement.bindNull(15);
        } else {
            sQLiteStatement.bindText(15, strC);
        }
        if (c2Var.h() == null) {
            sQLiteStatement.bindNull(16);
        } else {
            sQLiteStatement.bindText(16, c2Var.h());
        }
    }

    private final void j(SQLiteStatement sQLiteStatement, Object obj2) {
        n77.f fVar = (n77.f) obj2;
        if (fVar.c() == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, fVar.c());
        }
        if (fVar.e() == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindText(2, fVar.e());
        }
        if (fVar.a() == null) {
            sQLiteStatement.bindNull(3);
        } else {
            sQLiteStatement.bindText(3, fVar.a());
        }
        if (fVar.d() == null) {
            sQLiteStatement.bindNull(4);
        } else {
            sQLiteStatement.bindText(4, fVar.d());
        }
        if (fVar.b() == null) {
            sQLiteStatement.bindNull(5);
        } else {
            sQLiteStatement.bindText(5, fVar.b());
        }
    }

    private final void k(SQLiteStatement sQLiteStatement, Object obj2) {
        String str;
        n77.g gVar = (n77.g) obj2;
        sQLiteStatement.bindLong(1, gVar.d());
        n77.h hVarG = gVar.g();
        int i = k.f213024a[hVarG.ordinal()];
        if (i == 1) {
            str = "INDEX";
        } else if (i == 2) {
            str = "CURRENCY";
        } else {
            if (i != 3) {
                throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: " + hVarG);
            }
            str = "COMMODITY";
        }
        sQLiteStatement.bindText(2, str);
        if (gVar.c() == null) {
            sQLiteStatement.bindNull(3);
        } else {
            sQLiteStatement.bindText(3, gVar.c());
        }
        if (gVar.f() == null) {
            sQLiteStatement.bindNull(4);
        } else {
            sQLiteStatement.bindText(4, gVar.f());
        }
        if (gVar.e() == null) {
            sQLiteStatement.bindNull(5);
        } else {
            sQLiteStatement.bindText(5, gVar.e());
        }
        if (gVar.b() == null) {
            sQLiteStatement.bindNull(6);
        } else {
            sQLiteStatement.bindText(6, gVar.b());
        }
        if (gVar.a() == null) {
            sQLiteStatement.bindNull(7);
        } else {
            sQLiteStatement.bindText(7, gVar.a());
        }
    }

    @Override // androidx.room.EntityInsertAdapter
    public final void bind(SQLiteStatement sQLiteStatement, Object obj2) {
        String strK;
        String strC;
        switch (this.f7845a) {
            case 0:
                j jVar = (j) obj2;
                if (jVar.b() == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, jVar.b());
                }
                if (jVar.c() == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindBlob(2, jVar.c());
                }
                sQLiteStatement.bindLong(3, jVar.d());
                if (jVar.a() != null) {
                    sQLiteStatement.bindText(4, jVar.a());
                } else {
                    sQLiteStatement.bindNull(4);
                }
                break;
            case 1:
                c4d.a aVar = (c4d.a) obj2;
                if (aVar.g() == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, aVar.g());
                }
                if (aVar.d() == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, aVar.d());
                }
                if (aVar.e() == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, aVar.e());
                }
                if (aVar.f() == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, aVar.f());
                }
                if (aVar.l() == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, aVar.l());
                }
                BigDecimal bigDecimalJ = aVar.j();
                String plainString = bigDecimalJ != null ? bigDecimalJ.toPlainString() : null;
                if (plainString == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, plainString);
                }
                DateTime dateTimeB = aVar.b();
                Long lValueOf = dateTimeB != null ? Long.valueOf(dateTimeB.getMillis()) : null;
                if (lValueOf == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindLong(7, lValueOf.longValue());
                }
                DateTime dateTimeA = aVar.a();
                Long lValueOf2 = dateTimeA != null ? Long.valueOf(dateTimeA.getMillis()) : null;
                if (lValueOf2 == null) {
                    sQLiteStatement.bindNull(8);
                } else {
                    sQLiteStatement.bindLong(8, lValueOf2.longValue());
                }
                if (aVar.m() == null) {
                    sQLiteStatement.bindNull(9);
                } else {
                    sQLiteStatement.bindText(9, aVar.m());
                }
                if (aVar.h() == null) {
                    sQLiteStatement.bindNull(10);
                } else {
                    sQLiteStatement.bindText(10, aVar.h());
                }
                if (aVar.c() == null) {
                    sQLiteStatement.bindNull(11);
                } else {
                    sQLiteStatement.bindText(11, aVar.c());
                }
                BigDecimal bigDecimalI = aVar.i();
                String plainString2 = bigDecimalI != null ? bigDecimalI.toPlainString() : null;
                if (plainString2 == null) {
                    sQLiteStatement.bindNull(12);
                } else {
                    sQLiteStatement.bindText(12, plainString2);
                }
                if (aVar.k() != null) {
                    sQLiteStatement.bindText(13, aVar.k());
                } else {
                    sQLiteStatement.bindNull(13);
                }
                break;
            case 2:
                fpk.d dVar = (fpk.d) obj2;
                if (dVar.d() == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, dVar.d());
                }
                if (dVar.f() == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, dVar.f());
                }
                if (dVar.a() == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, dVar.a());
                }
                if (dVar.b() == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, dVar.b());
                }
                if (dVar.e() == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, dVar.e());
                }
                if (dVar.c() != null) {
                    sQLiteStatement.bindText(6, dVar.c());
                } else {
                    sQLiteStatement.bindNull(6);
                }
                break;
            case 3:
                fpk.f fVar = (fpk.f) obj2;
                if (fVar.b() == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, fVar.b());
                }
                if (fVar.d() == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, fVar.d());
                }
                if (fVar.c() == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, fVar.c());
                }
                if (fVar.a() == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, fVar.a());
                }
                if ((fVar.g() == null ? null : Integer.valueOf(fVar.g().booleanValue() ? 1 : 0)) == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindLong(5, r3.intValue());
                }
                Long lB = b21.a.b(fVar.f());
                if (lB == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindLong(6, lB.longValue());
                }
                Long lB2 = b21.a.b(fVar.e());
                if (lB2 != null) {
                    sQLiteStatement.bindLong(7, lB2.longValue());
                } else {
                    sQLiteStatement.bindNull(7);
                }
                break;
            case 4:
                n nVar = (n) obj2;
                if (nVar.a() == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, nVar.a());
                }
                if (nVar.b() != null) {
                    sQLiteStatement.bindText(2, nVar.b());
                } else {
                    sQLiteStatement.bindNull(2);
                }
                break;
            case 5:
                ipk.f fVar2 = (ipk.f) obj2;
                sQLiteStatement.bindDouble(1, fVar2.e());
                if (fVar2.a() == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, fVar2.a());
                }
                if (fVar2.b() == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, fVar2.b());
                }
                String strA = kpk.a.a(fVar2.c());
                if (strA == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, strA);
                }
                List listD = fVar2.d();
                String strR = listD != null ? com.revolut.data.database.models.openbanking.d.r("toJson(...)", listD) : null;
                if (strR != null) {
                    sQLiteStatement.bindText(5, strR);
                } else {
                    sQLiteStatement.bindNull(5);
                }
                break;
            case 6:
                la6.h hVar = (la6.h) obj2;
                if (hVar.k() == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, hVar.k());
                }
                if (hVar.m() == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, hVar.m());
                }
                if (hVar.n() == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, hVar.n());
                }
                if (hVar.d() == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, hVar.d());
                }
                if (hVar.g() == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, hVar.g());
                }
                if (hVar.j() == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, hVar.j());
                }
                if (hVar.c() == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindText(7, hVar.c());
                }
                la6.a aVarE = hVar.e();
                if (aVarE != null) {
                    strK = com.revolut.data.utils.gson.GsonHolder.a().k(aVarE);
                    Intrinsics.checkNotNullExpressionValue(strK, "toJson(...)");
                } else {
                    strK = null;
                }
                if (strK == null) {
                    sQLiteStatement.bindNull(8);
                } else {
                    sQLiteStatement.bindText(8, strK);
                }
                sQLiteStatement.bindLong(9, hVar.q() ? 1L : 0L);
                if (hVar.f() == null) {
                    sQLiteStatement.bindNull(10);
                } else {
                    sQLiteStatement.bindText(10, hVar.f());
                }
                if (hVar.b() == null) {
                    sQLiteStatement.bindNull(11);
                } else {
                    sQLiteStatement.bindText(11, hVar.b());
                }
                sQLiteStatement.bindLong(12, hVar.h());
                sQLiteStatement.bindLong(13, hVar.p());
                sQLiteStatement.bindLong(14, hVar.i() ? 1L : 0L);
                if (hVar.a() == null) {
                    sQLiteStatement.bindNull(15);
                } else {
                    sQLiteStatement.bindText(15, hVar.a());
                }
                sQLiteStatement.bindLong(16, hVar.o() ? 1L : 0L);
                jo3.b bVarR = hVar.r();
                if (a10.b.v(bVarR, sQLiteStatement, 17) == null) {
                    sQLiteStatement.bindNull(18);
                } else {
                    sQLiteStatement.bindText(18, bVarR.getCurrency());
                }
                jo3.b bVarL = hVar.l();
                if (a10.b.v(bVarL, sQLiteStatement, 19) != null) {
                    sQLiteStatement.bindText(20, bVarL.getCurrency());
                } else {
                    sQLiteStatement.bindNull(20);
                }
                break;
            case 7:
                la6.c cVar = (la6.c) obj2;
                if (cVar.e() == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, cVar.e());
                }
                if (cVar.f() == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, cVar.f());
                }
                if (cVar.c() == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, cVar.c());
                }
                if (cVar.a() == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, cVar.a());
                }
                List listB = cVar.b();
                String strR2 = listB != null ? com.revolut.data.database.models.openbanking.d.r("toJson(...)", listB) : null;
                if (strR2 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, strR2);
                }
                sQLiteStatement.bindLong(6, cVar.d() ? 1L : 0L);
                break;
            case 8:
                jpk.a aVar2 = (jpk.a) obj2;
                aVar2.getClass();
                sQLiteStatement.bindLong(1, 0L);
                if (aVar2.e() == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, aVar2.e());
                }
                if (aVar2.a() == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, aVar2.a());
                }
                Long lB3 = b21.a.b(aVar2.c());
                if (lB3 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindLong(4, lB3.longValue());
                }
                Long lB4 = b21.a.b(aVar2.f());
                if (lB4 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindLong(5, lB4.longValue());
                }
                String strO = b21.a.o(aVar2.d());
                if (strO == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, strO);
                }
                String strO2 = b21.a.o(aVar2.b());
                if (strO2 != null) {
                    sQLiteStatement.bindText(7, strO2);
                } else {
                    sQLiteStatement.bindNull(7);
                }
                break;
            case 9:
                jpk.b bVar = (jpk.b) obj2;
                Long lB5 = b21.a.b(bVar.h());
                if (lB5 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindLong(1, lB5.longValue());
                }
                Long lB6 = b21.a.b(bVar.g());
                if (lB6 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindLong(2, lB6.longValue());
                }
                String strO3 = b21.a.o(bVar.f());
                if (strO3 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, strO3);
                }
                String strO4 = b21.a.o(bVar.b());
                if (strO4 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, strO4);
                }
                String strO5 = b21.a.o(bVar.d());
                if (strO5 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, strO5);
                }
                String strO6 = b21.a.o(bVar.e());
                if (strO6 == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, strO6);
                }
                sQLiteStatement.bindLong(7, bVar.c());
                break;
            case 10:
                c3 c3Var = (c3) obj2;
                if (c3Var.b() == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, c3Var.b());
                }
                if (c3Var.a() == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, c3Var.a());
                }
                yhf.v vVarC = c3Var.c();
                if (vVarC != null) {
                    Json jsonA = af0.b.a();
                    jsonA.getClass();
                    strC = jsonA.c(yhf.v.INSTANCE.serializer(), vVarC);
                } else {
                    strC = null;
                }
                if (strC != null) {
                    sQLiteStatement.bindText(3, strC);
                } else {
                    sQLiteStatement.bindNull(3);
                }
                break;
            case 11:
                w0 w0Var = (w0) obj2;
                if (w0Var.b() == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, w0Var.b());
                }
                sQLiteStatement.bindLong(2, w0Var.a() ? 1L : 0L);
                break;
            case 12:
                a4 a4Var = (a4) obj2;
                if (a4Var.g() == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, a4Var.g());
                }
                if (a4Var.n() == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, a4Var.n());
                }
                if (a4Var.i() == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, a4Var.i());
                }
                if (a4Var.e() == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, a4Var.e());
                }
                if (a4Var.h() == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, a4Var.h());
                }
                if (a4Var.j() == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, a4Var.j());
                }
                if (a4Var.o() == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindText(7, a4Var.o());
                }
                if (a4Var.c() == null) {
                    sQLiteStatement.bindNull(8);
                } else {
                    sQLiteStatement.bindText(8, a4Var.c());
                }
                if (a4Var.d() == null) {
                    sQLiteStatement.bindNull(9);
                } else {
                    sQLiteStatement.bindText(9, a4Var.d());
                }
                if (a4Var.k() == null) {
                    sQLiteStatement.bindNull(10);
                } else {
                    sQLiteStatement.bindText(10, a4Var.k());
                }
                if (a4Var.l() == null) {
                    sQLiteStatement.bindNull(11);
                } else {
                    sQLiteStatement.bindText(11, a4Var.l());
                }
                if (a4Var.a() == null) {
                    sQLiteStatement.bindNull(12);
                } else {
                    sQLiteStatement.bindText(12, a4Var.a());
                }
                if (a4Var.m() == null) {
                    sQLiteStatement.bindNull(13);
                } else {
                    sQLiteStatement.bindText(13, a4Var.m());
                }
                if (a4Var.b() == null) {
                    sQLiteStatement.bindNull(14);
                } else {
                    sQLiteStatement.bindText(14, a4Var.b());
                }
                if (a4Var.f() != null) {
                    sQLiteStatement.bindText(15, a4Var.f());
                } else {
                    sQLiteStatement.bindNull(15);
                }
                break;
            case 13:
                k1 k1Var = (k1) obj2;
                if (k1Var.k() == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, k1Var.k());
                }
                if (k1Var.p() == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, k1Var.p());
                }
                if (k1Var.j() == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, k1Var.j());
                }
                if (k1Var.d() == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, k1Var.d());
                }
                if (k1Var.q() == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, k1Var.q());
                }
                if (k1Var.o() == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, k1Var.o());
                }
                if (k1Var.g() == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindText(7, k1Var.g());
                }
                if (k1Var.h() == null) {
                    sQLiteStatement.bindNull(8);
                } else {
                    sQLiteStatement.bindText(8, k1Var.h());
                }
                if (k1Var.i() == null) {
                    sQLiteStatement.bindNull(9);
                } else {
                    sQLiteStatement.bindText(9, k1Var.i());
                }
                if (k1Var.a() == null) {
                    sQLiteStatement.bindNull(10);
                } else {
                    sQLiteStatement.bindText(10, k1Var.a());
                }
                if (k1Var.t() == null) {
                    sQLiteStatement.bindNull(11);
                } else {
                    sQLiteStatement.bindText(11, k1Var.t());
                }
                if (k1Var.r() == null) {
                    sQLiteStatement.bindNull(12);
                } else {
                    sQLiteStatement.bindText(12, k1Var.r());
                }
                if (k1Var.n() == null) {
                    sQLiteStatement.bindNull(13);
                } else {
                    sQLiteStatement.bindText(13, k1Var.n());
                }
                if (k1Var.b() == null) {
                    sQLiteStatement.bindNull(14);
                } else {
                    sQLiteStatement.bindText(14, k1Var.b());
                }
                if ((k1Var.f() == null ? null : Integer.valueOf(k1Var.f().booleanValue() ? 1 : 0)) == null) {
                    sQLiteStatement.bindNull(15);
                } else {
                    sQLiteStatement.bindLong(15, r3.intValue());
                }
                if (k1Var.c() == null) {
                    sQLiteStatement.bindNull(16);
                } else {
                    sQLiteStatement.bindText(16, k1Var.c());
                }
                if (k1Var.e() == null) {
                    sQLiteStatement.bindNull(17);
                } else {
                    sQLiteStatement.bindText(17, k1Var.e());
                }
                if (k1Var.s() == null) {
                    sQLiteStatement.bindNull(18);
                } else {
                    sQLiteStatement.bindText(18, k1Var.s());
                }
                if (k1Var.l() == null) {
                    sQLiteStatement.bindNull(19);
                } else {
                    sQLiteStatement.bindDouble(19, k1Var.l().doubleValue());
                }
                if (k1Var.m() != null) {
                    sQLiteStatement.bindDouble(20, k1Var.m().doubleValue());
                } else {
                    sQLiteStatement.bindNull(20);
                }
                break;
            case 14:
                m1 m1Var = (m1) obj2;
                if (m1Var.b() == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, m1Var.b());
                }
                if (m1Var.f() == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, m1Var.f());
                }
                if (m1Var.d() == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, m1Var.d());
                }
                if (m1Var.e() == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindLong(4, m1Var.e().longValue());
                }
                l1 l1VarC = m1Var.c();
                if (l1VarC != null) {
                    if (l1VarC.b() == null) {
                        sQLiteStatement.bindNull(5);
                    } else {
                        sQLiteStatement.bindText(5, l1VarC.b());
                    }
                    if (l1VarC.c() == null) {
                        sQLiteStatement.bindNull(6);
                    } else {
                        sQLiteStatement.bindText(6, l1VarC.c());
                    }
                    if (l1VarC.a() == null) {
                        sQLiteStatement.bindNull(7);
                    } else {
                        sQLiteStatement.bindText(7, l1VarC.a());
                    }
                } else {
                    o.y(sQLiteStatement, 5, 6, 7);
                }
                j1 j1VarA = m1Var.a();
                if (j1VarA == null) {
                    o.z(sQLiteStatement, 8, 9, 10, 11);
                    o.z(sQLiteStatement, 12, 13, 14, 15);
                    o.z(sQLiteStatement, 16, 17, 18, 19);
                    o.z(sQLiteStatement, 20, 21, 22, 23);
                    o.y(sQLiteStatement, 24, 25, 26);
                } else {
                    if (j1VarA.e() == null) {
                        sQLiteStatement.bindNull(8);
                    } else {
                        sQLiteStatement.bindText(8, j1VarA.e());
                    }
                    if (j1VarA.d() == null) {
                        sQLiteStatement.bindNull(9);
                    } else {
                        sQLiteStatement.bindText(9, j1VarA.d());
                    }
                    if (j1VarA.f() == null) {
                        sQLiteStatement.bindNull(10);
                    } else {
                        sQLiteStatement.bindText(10, j1VarA.f());
                    }
                    if (j1VarA.h() == null) {
                        sQLiteStatement.bindNull(11);
                    } else {
                        sQLiteStatement.bindText(11, j1VarA.h());
                    }
                    if (j1VarA.c() == null) {
                        sQLiteStatement.bindNull(12);
                    } else {
                        sQLiteStatement.bindText(12, j1VarA.c());
                    }
                    if (j1VarA.g() == null) {
                        sQLiteStatement.bindNull(13);
                    } else {
                        sQLiteStatement.bindText(13, j1VarA.g());
                    }
                    if (j1VarA.b() == null) {
                        sQLiteStatement.bindNull(14);
                    } else {
                        sQLiteStatement.bindText(14, j1VarA.b());
                    }
                    i1 i1VarA = j1VarA.a();
                    if (i1VarA == null) {
                        o.z(sQLiteStatement, 15, 16, 17, 18);
                        o.z(sQLiteStatement, 19, 20, 21, 22);
                        o.z(sQLiteStatement, 23, 24, 25, 26);
                    } else {
                        if (i1VarA.a() == null) {
                            sQLiteStatement.bindNull(15);
                        } else {
                            sQLiteStatement.bindText(15, i1VarA.a());
                        }
                        if (i1VarA.k() == null) {
                            sQLiteStatement.bindNull(16);
                        } else {
                            sQLiteStatement.bindText(16, i1VarA.k());
                        }
                        if ((i1VarA.e() == null ? null : Integer.valueOf(i1VarA.e().booleanValue() ? 1 : 0)) == null) {
                            sQLiteStatement.bindNull(17);
                        } else {
                            sQLiteStatement.bindLong(17, r3.intValue());
                        }
                        if (i1VarA.i() == null) {
                            sQLiteStatement.bindNull(18);
                        } else {
                            sQLiteStatement.bindLong(18, i1VarA.i().intValue());
                        }
                        if (i1VarA.j() == null) {
                            sQLiteStatement.bindNull(19);
                        } else {
                            sQLiteStatement.bindLong(19, i1VarA.j().intValue());
                        }
                        if (i1VarA.c() == null) {
                            sQLiteStatement.bindNull(20);
                        } else {
                            sQLiteStatement.bindText(20, i1VarA.c());
                        }
                        if (i1VarA.b() == null) {
                            sQLiteStatement.bindNull(21);
                        } else {
                            sQLiteStatement.bindText(21, i1VarA.b());
                        }
                        if (i1VarA.d() == null) {
                            sQLiteStatement.bindNull(22);
                        } else {
                            sQLiteStatement.bindText(22, i1VarA.d());
                        }
                        if (i1VarA.l() == null) {
                            sQLiteStatement.bindNull(23);
                        } else {
                            sQLiteStatement.bindText(23, i1VarA.l());
                        }
                        if (i1VarA.g() == null) {
                            sQLiteStatement.bindNull(24);
                        } else {
                            sQLiteStatement.bindText(24, i1VarA.g());
                        }
                        if (i1VarA.f() == null) {
                            sQLiteStatement.bindNull(25);
                        } else {
                            sQLiteStatement.bindText(25, i1VarA.f());
                        }
                        if (i1VarA.h() != null) {
                            sQLiteStatement.bindText(26, i1VarA.h());
                        } else {
                            sQLiteStatement.bindNull(26);
                        }
                    }
                }
                break;
            case 15:
                nif.c cVar2 = (nif.c) obj2;
                if (cVar2.c() == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, cVar2.c());
                }
                if (cVar2.a() == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindLong(2, cVar2.a().longValue());
                }
                if (cVar2.b() == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, cVar2.b());
                }
                nif.d dVarD = cVar2.d();
                if (dVarD == null) {
                    o.z(sQLiteStatement, 4, 5, 6, 7);
                    o.y(sQLiteStatement, 8, 9, 10);
                } else {
                    if (dVarD.c() == null) {
                        sQLiteStatement.bindNull(4);
                    } else {
                        sQLiteStatement.bindText(4, dVarD.c());
                    }
                    nif.e eVarB = dVarD.b();
                    if (eVarB != null) {
                        sQLiteStatement.bindDouble(5, eVarB.c());
                        sQLiteStatement.bindLong(6, eVarB.a());
                        if (eVarB.b() == null) {
                            sQLiteStatement.bindNull(7);
                        } else {
                            sQLiteStatement.bindText(7, eVarB.b());
                        }
                    } else {
                        o.y(sQLiteStatement, 5, 6, 7);
                    }
                    nif.e eVarA = dVarD.a();
                    if (eVarA == null) {
                        o.y(sQLiteStatement, 8, 9, 10);
                    } else {
                        sQLiteStatement.bindDouble(8, eVarA.c());
                        sQLiteStatement.bindLong(9, eVarA.a());
                        if (eVarA.b() != null) {
                            sQLiteStatement.bindText(10, eVarA.b());
                        } else {
                            sQLiteStatement.bindNull(10);
                        }
                    }
                }
                break;
            case 16:
                a(sQLiteStatement, obj2);
                break;
            case 17:
                nif.z zVar = (nif.z) obj2;
                if (zVar.d() == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, zVar.d());
                }
                if (zVar.g() == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, zVar.g());
                }
                if ((zVar.a() == null ? null : Integer.valueOf(zVar.a().booleanValue() ? 1 : 0)) == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindLong(3, r3.intValue());
                }
                if (zVar.b() == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, zVar.b());
                }
                if (zVar.f() == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, zVar.f());
                }
                if (zVar.e() == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, zVar.e());
                }
                a3 a3VarC = zVar.c();
                if (a3VarC == null) {
                    sQLiteStatement.bindNull(7);
                    sQLiteStatement.bindNull(8);
                } else {
                    if (a3VarC.b() == null) {
                        sQLiteStatement.bindNull(7);
                    } else {
                        sQLiteStatement.bindDouble(7, a3VarC.b().doubleValue());
                    }
                    if (a3VarC.a() != null) {
                        sQLiteStatement.bindText(8, a3VarC.a());
                    } else {
                        sQLiteStatement.bindNull(8);
                    }
                }
                break;
            case 18:
                b(sQLiteStatement, obj2);
                break;
            case 19:
                ml3.o oVar = (ml3.o) obj2;
                if (oVar.c() == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, oVar.c());
                }
                if (oVar.k() == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, oVar.k());
                }
                if (oVar.g() == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, oVar.g());
                }
                if (oVar.e() == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, oVar.e());
                }
                if (oVar.f() == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, oVar.f());
                }
                if (oVar.d() == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, oVar.d());
                }
                if (oVar.a() == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindText(7, oVar.a());
                }
                if (oVar.j() == null) {
                    sQLiteStatement.bindNull(8);
                } else {
                    sQLiteStatement.bindText(8, oVar.j());
                }
                if (oVar.b() == null) {
                    sQLiteStatement.bindNull(9);
                } else {
                    sQLiteStatement.bindText(9, oVar.b());
                }
                sQLiteStatement.bindLong(10, oVar.i());
                sQLiteStatement.bindLong(11, oVar.h());
                break;
            case 20:
                c(sQLiteStatement, obj2);
                break;
            case 21:
                d(sQLiteStatement, obj2);
                break;
            case 22:
                e(sQLiteStatement, obj2);
                break;
            case 23:
                f(sQLiteStatement, obj2);
                break;
            case 24:
                g(sQLiteStatement, obj2);
                break;
            case 25:
                h(sQLiteStatement, obj2);
                break;
            case 26:
                i(sQLiteStatement, obj2);
                break;
            case 27:
                j(sQLiteStatement, obj2);
                break;
            case 28:
                k(sQLiteStatement, obj2);
                break;
            default:
                sra.b bVar2 = (sra.b) obj2;
                if (bVar2.d() == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, bVar2.d());
                }
                if (bVar2.c() == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, bVar2.c());
                }
                if (bVar2.f() == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, bVar2.f());
                }
                if (bVar2.e() == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, bVar2.e());
                }
                if (bVar2.b() == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, bVar2.b());
                }
                if (bVar2.h() == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, bVar2.h());
                }
                sra.a cardEntity = bVar2.a();
                Intrinsics.checkNotNullParameter(cardEntity, "cardEntity");
                String strK2 = com.revolut.data.utils.gson.GsonHolder.a().k(cardEntity);
                Intrinsics.checkNotNullExpressionValue(strK2, "toJson(...)");
                if (strK2 == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindText(7, strK2);
                }
                sQLiteStatement.bindLong(8, bVar2.g() ? 1L : 0L);
                break;
        }
    }

    @Override // androidx.room.EntityInsertAdapter
    public final String createQuery() {
        switch (this.f7845a) {
            case 0:
                return "INSERT OR IGNORE INTO `events` (`id`,`raw`,`timestamp`,`host`) VALUES (?,?,?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `alert_items` (`id`,`from_id`,`from_name`,`from_type_key`,`to`,`target_rate`,`created_at`,`completed_at`,`type`,`note`,`frequency`,`percentage`,`time_range`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 2:
                return "INSERT OR REPLACE INTO `all_rates` (`from`,`to`,`askRate`,`bidRate`,`midRate`,`eodRate`) VALUES (?,?,?,?,?,?)";
            case 3:
                return "INSERT OR REPLACE INTO `mid_rates_cache` (`from`,`to`,`rate`,`eodRate`,`isWeekend`,`weekendStartTime`,`weekendEndTime`) VALUES (?,?,?,?,?,?,?)";
            case 4:
                return "INSERT OR REPLACE INTO `payments_social_sent_message` (`localId`,`messageId`) VALUES (?,?)";
            case 5:
                return "INSERT OR REPLACE INTO `mid_rates_plot` (`previousRangeCloseRate`,`currencyFrom`,`currencyTo`,`duration`,`plot`) VALUES (?,?,?,?,?)";
            case 6:
                return "INSERT OR REPLACE INTO `charity` (`id`,`name`,`pocket_id`,`brief`,`description`,`icon`,`banner`,`campaign`,`shareable`,`code`,`availability_area`,`donors_count`,`rank`,`featured`,`availability`,`pointsRedemptionAvailable`,`total_donation_amount`,`total_donation_currency`,`my_donation_amount`,`my_donation_currency`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 7:
                return "INSERT OR REPLACE INTO `charity_collections` (`id`,`title`,`description`,`banner_url`,`charities`,`featured`) VALUES (?,?,?,?,?,?)";
            case 8:
                return "INSERT OR REPLACE INTO `candles_cryptocommodities_chart` (`graph_id`,`symbol`,`duration`,`from`,`to`,`startClose`,`endClose`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
            case 9:
                return "INSERT OR REPLACE INTO `candles_cryptocommodities_point` (`timestampStart`,`timestampEnd`,`open`,`close`,`high`,`low`,`graph_id`) VALUES (?,?,?,?,?,?,?)";
            case 10:
                return "INSERT OR REPLACE INTO `transaction_details` (`leg_id`,`group_id`,`response`) VALUES (?,?,?)";
            case 11:
                return "INSERT OR REPLACE INTO `hidden` (`leg_id`,`hidden`) VALUES (?,?)";
            case 12:
                return "INSERT OR REPLACE INTO `transfer_users` (`transfer_user_key`,`transfer_user_id`,`transfer_user_legal_name`,`transfer_user_first_name`,`transfer_user_last_name`,`transfer_user_phone`,`transfer_user_username`,`transfer_user_code`,`transfer_user_country`,`transfer_user_pocket_id`,`transfer_user_pocket_type`,`transfer_user_appMode`,`transfer_user_type`,`transfer_user_businessName`,`transfer_user_individual_type`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 13:
                return "INSERT OR REPLACE INTO `merchants` (`merchant_table_key`,`merchant_merchant_identifier`,`merchant_identifier`,`merchant_blocked_merchant_id`,`merchant_name`,`merchant_mcc`,`merchant_category`,`merchant_city`,`merchant_country`,`merchant_address`,`merchant_state`,`merchant_postcode`,`merchant_logo`,`merchant_background_color`,`merchant_can_be_blocked`,`merchant_block_eligibility`,`merchant_brand_id`,`merchant_scheme`,`merchant_location_latitude`,`merchant_location_longitude`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 14:
                return "INSERT OR REPLACE INTO `merchant_payments` (`merchant_payment_identifier`,`merchant_payment_type`,`merchant_payment_payment_method`,`merchant_payment_settle_on`,`merchant_payment_order_id`,`merchant_payment_order_type`,`merchant_payment_order_description`,`merchant_payment_customer_id`,`merchant_payment_customer_full_name`,`merchant_payment_customer_name`,`merchant_payment_customer_user_name`,`merchant_payment_customer_email`,`merchant_payment_customer_phone`,`merchant_payment_customer_cardholder_name`,`merchant_payment_customer_card_bin`,`merchant_payment_customer_card_last_four`,`merchant_payment_customer_card_card_present`,`merchant_payment_customer_card_expiry_month`,`merchant_payment_customer_card_expiry_year`,`merchant_payment_customer_card_bin_scheme`,`merchant_payment_customer_card_bin_member_name`,`merchant_payment_customer_card_card_brand`,`merchant_payment_customer_card_product_code`,`merchant_payment_customer_card_card_type`,`merchant_payment_customer_card_card_sub_type`,`merchant_payment_customer_card_country_code`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 15:
                return "INSERT OR REPLACE INTO `acquiring_cashback` (`acquiring_cashback_leg_id`,`acquiring_cashback_amount`,`acquiring_cashback_currency`,`acquiring_cashback_payout_type`,`acquiring_cashback_payout_plan_rate`,`acquiring_cashback_payout_plan_amount`,`acquiring_cashback_payout_plan_currency`,`acquiring_cashback_payout_booster_rate`,`acquiring_cashback_payout_booster_amount`,`acquiring_cashback_payout_booster_currency`) VALUES (?,?,?,?,?,?,?,?,?,?)";
            case 16:
                return "INSERT OR REPLACE INTO `loans` (`loan_leg_id`,`loan_repayment_type`,`loan_repayment_mode`,`loan_name`,`loan_id`,`loan_regular_loan_amount`,`loan_regular_interest_amount`,`loan_regular_fee_amount`,`loan_regular_principal_amount`,`loan_outstanding_loan_amount`,`loan_outstanding_interest_amount`,`loan_outstanding_fee_amount`,`loan_outstanding_principal_amount`,`loan_overdue_loan_amount`,`loan_overdue_interest_amount`,`loan_overdue_fee_amount`,`loan_overdue_principal_amount`,`loan_penalty_amount`,`loan_regularRescheduledPrincipalAmount`,`loan_outstandingRescheduledPrincipalAmount`,`loan_overdueRescheduledPrincipalAmount`,`loan_bank_identifier`,`loan_account_number`,`loan_debtor_name`,`loan_product`,`loan_stampDuty_over_accrued_interest`,`loan_stampDuty_over_late_interest`,`loan_stampDuty_over_late_fee`,`loan_stampDuty_total`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 17:
                return "INSERT OR REPLACE INTO `crypto_deposits` (`crypto_deposit_leg_id`,`transaction_hash`,`below_minimum`,`blockchain`,`deposit_state`,`source_address`,`display_rate`,`display_currency`) VALUES (?,?,?,?,?,?,?,?)";
            case 18:
                return "INSERT OR REPLACE INTO `contact` (`id`,`point`,`displayedName`,`firstName`,`lastName`,`registeredAs`,`username`,`code`,`isRevolut`,`isNewlyJoined`,`joinDate`,`birthday`,`transactionsCount`,`timestamp`,`pictureUri`,`type`,`country`,`appMode`,`paidPlan`,`customerType`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 19:
                return "INSERT OR REPLACE INTO `remote_contacts` (`code`,`username`,`legalName`,`firstName`,`lastName`,`country`,`appMode`,`type`,`businessName`,`transactionsCount`,`timestamp`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            case 20:
                return "INSERT OR REPLACE INTO `remote_contacts_extra` (`code`,`username`,`paidPlan`,`birthday`,`legalName`,`firstName`,`lastName`,`businessName`) VALUES (?,?,?,?,?,?,?,?)";
            case 21:
                return "INSERT OR REPLACE INTO `virtual_contacts` (`point`,`type`,`transactionsCount`,`timestamp`) VALUES (?,?,?,?)";
            case 22:
                return "INSERT OR REPLACE INTO `loan_details_shard` (`id`,`durationMonths`,`repaymentDay`,`outstandingBalance`,`accruedInterest`,`accruedFee`,`oneTimeFee`,`monthlyRepayment`,`isInCooldownPeriod`,`unavailableFeatures`,`borrowers`,`autoPayRepaymentSource`,`backupCard`,`repaymentConfig`,`agreementNumber`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 23:
                return "INSERT OR REPLACE INTO `loans` (`id`,`name`,`disbursalDate`,`finalRepaymentDate`,`currency`,`countryCode`,`principal`,`outstandingPrincipal`,`outstandingRescheduledPrincipal`,`fixedOutstandingBalance`,`totalRepaid`,`totalToRepay`,`fractionRepaid`,`state`,`product`,`repaidCount`,`remainingTerm`,`interestRate`,`nextInstalment`,`lastPaidRepayment`,`config`,`refurbishment`,`interestOnly`,`insuranceState`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 24:
                return "INSERT OR REPLACE INTO `loan_preferences` (`loanId`,`isHidden`) VALUES (?,?)";
            case 25:
                return "INSERT OR REPLACE INTO `loan_refinanced_credits_v2` (`refinancingIdentifier`,`refinancingState`,`loanId`,`id`,`mode`,`amount`,`currency`,`type`,`state`,`receiptAvailable`,`bankName`,`fallbackDateTime`,`fallbackTransactionId`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 26:
                return "INSERT OR IGNORE INTO `loan_repayments` (`loanId`,`id`,`transactionId`,`repaymentDateTime`,`currency`,`amount`,`type`,`clientId`,`firstName`,`lastName`,`principal`,`accruedInterest`,`lateRepaymentInterest`,`transferType`,`accountDetails`,`insuranceType`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 27:
                return "INSERT OR REPLACE INTO `index_details` (`ref`,`symbol`,`baseCurrency`,`shortDescription`,`description`) VALUES (?,?,?,?,?)";
            case 28:
                return "INSERT OR ABORT INTO `market_assets` (`id`,`type`,`description`,`symbol`,`ref`,`currency`,`baseCurrency`) VALUES (?,?,?,?,?,?,?)";
            default:
                return "INSERT OR ABORT INTO `card_owners` (`id`,`firstName`,`lastName`,`label`,`email`,`type`,`card`,`twoFaRequired`) VALUES (?,?,?,?,?,?,?,?)";
        }
    }

    public /* synthetic */ g(Object obj2, int i) {
        this.f7845a = i;
    }
}
