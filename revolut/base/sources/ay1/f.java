package ay1;

import androidx.room.EntityInsertAdapter;
import androidx.sqlite.SQLiteStatement;
import com.revolut.data.utils.gson.GsonHolder;
import j1f.i0;
import j1f.j0;
import j1f.k;
import j1f.x;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonObject;
import ps6.l;
import ps6.m;
import ps6.n;
import qlm.v1;
import rlm.o;
import vjl.p;
import vjl.q;
import ysj.y;

/* JADX INFO: loaded from: classes20.dex */
public final class f extends EntityInsertAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11016b;

    public /* synthetic */ f(Object obj2, int i) {
        this.f11015a = i;
        this.f11016b = obj2;
    }

    private final void a(SQLiteStatement sQLiteStatement, Object obj2) {
        String strK;
        la6.f fVar = (la6.f) obj2;
        String str = fVar.f193328a;
        if (str == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, str);
        }
        String str2 = fVar.f193329b;
        if (str2 == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindText(2, str2);
        }
        String str3 = fVar.f193330c;
        if (str3 == null) {
            sQLiteStatement.bindNull(3);
        } else {
            sQLiteStatement.bindText(3, str3);
        }
        String str4 = fVar.d;
        if (str4 == null) {
            sQLiteStatement.bindNull(4);
        } else {
            sQLiteStatement.bindText(4, str4);
        }
        String str5 = fVar.e;
        if (str5 == null) {
            sQLiteStatement.bindNull(5);
        } else {
            sQLiteStatement.bindText(5, str5);
        }
        String str6 = fVar.f;
        if (str6 == null) {
            sQLiteStatement.bindNull(6);
        } else {
            sQLiteStatement.bindText(6, str6);
        }
        ia6.c cVar = ((ja6.b) this.f11016b).f172445c;
        List list = fVar.f193331g;
        if (list != null) {
            strK = cVar.f159952a.k(list);
        } else {
            cVar.getClass();
            strK = null;
        }
        if (strK == null) {
            sQLiteStatement.bindNull(7);
        } else {
            sQLiteStatement.bindText(7, strK);
        }
    }

    private final void b(SQLiteStatement sQLiteStatement, Object obj2) {
        String strK;
        String strK2;
        mud.a aVar = (mud.a) obj2;
        jud.e eVar = (jud.e) this.f11016b;
        String str = aVar.f209017a;
        if (str == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, str);
        }
        String str2 = aVar.f209018b;
        if (str2 == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindText(2, str2);
        }
        jo3.c cVar = eVar.f178656c;
        jo3.b bVar = aVar.f209019c;
        if (bVar != null) {
            strK = cVar.f176864a.k(bVar);
        } else {
            cVar.getClass();
            strK = null;
        }
        if (strK == null) {
            sQLiteStatement.bindNull(3);
        } else {
            sQLiteStatement.bindText(3, strK);
        }
        jo3.b bVar2 = aVar.d;
        if (bVar2 != null) {
            strK2 = cVar.f176864a.k(bVar2);
        } else {
            cVar.getClass();
            strK2 = null;
        }
        if (strK2 == null) {
            sQLiteStatement.bindNull(4);
        } else {
            sQLiteStatement.bindText(4, strK2);
        }
        jo3.b bVar3 = aVar.e;
        String strK3 = bVar3 != null ? cVar.f176864a.k(bVar3) : null;
        if (strK3 == null) {
            sQLiteStatement.bindNull(5);
        } else {
            sQLiteStatement.bindText(5, strK3);
        }
    }

    private final void c(SQLiteStatement sQLiteStatement, Object obj2) {
        p1f.a aVar = (p1f.a) obj2;
        String str = aVar.f231897a;
        if (str == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, str);
        }
        String str2 = aVar.f231898b;
        if (str2 == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindText(2, str2);
        }
        String str3 = aVar.f231899c;
        if (str3 == null) {
            sQLiteStatement.bindNull(3);
        } else {
            sQLiteStatement.bindText(3, str3);
        }
        m1f.a aVar2 = ((n1f.b) this.f11016b).f211316c;
        List list = aVar.e;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(list, "list");
        o oVar = aVar2.f201491a;
        oVar.getClass();
        sQLiteStatement.bindText(4, oVar.c(new qlm.e(v1.f247718a), list));
        p1f.c cVar = aVar.d;
        String str4 = cVar.f231914a;
        if (str4 == null) {
            sQLiteStatement.bindNull(5);
        } else {
            sQLiteStatement.bindText(5, str4);
        }
        String str5 = cVar.f231915b;
        if (str5 == null) {
            sQLiteStatement.bindNull(6);
        } else {
            sQLiteStatement.bindText(6, str5);
        }
        String str6 = cVar.f231916c;
        if (str6 == null) {
            sQLiteStatement.bindNull(7);
        } else {
            sQLiteStatement.bindText(7, str6);
        }
        String str7 = cVar.d;
        if (str7 == null) {
            sQLiteStatement.bindNull(8);
        } else {
            sQLiteStatement.bindText(8, str7);
        }
    }

    private final void d(SQLiteStatement sQLiteStatement, Object obj2) {
        String strC;
        p1f.b bVar = (p1f.b) obj2;
        n1f.d dVar = (n1f.d) this.f11016b;
        String str = bVar.f231900a;
        if (str == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, str);
        }
        String str2 = bVar.f231901b;
        if (str2 == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindText(2, str2);
        }
        String str3 = bVar.f231902c;
        if (str3 == null) {
            sQLiteStatement.bindNull(3);
        } else {
            sQLiteStatement.bindText(3, str3);
        }
        String str4 = bVar.d;
        if (str4 == null) {
            sQLiteStatement.bindNull(4);
        } else {
            sQLiteStatement.bindText(4, str4);
        }
        String str5 = bVar.e;
        if (str5 == null) {
            sQLiteStatement.bindNull(5);
        } else {
            sQLiteStatement.bindText(5, str5);
        }
        String str6 = bVar.f;
        if (str6 == null) {
            sQLiteStatement.bindNull(6);
        } else {
            sQLiteStatement.bindText(6, str6);
        }
        String str7 = bVar.f231903g;
        if (str7 == null) {
            sQLiteStatement.bindNull(7);
        } else {
            sQLiteStatement.bindText(7, str7);
        }
        String str8 = bVar.f231904h;
        if (str8 == null) {
            sQLiteStatement.bindNull(8);
        } else {
            sQLiteStatement.bindText(8, str8);
        }
        String str9 = bVar.i;
        if (str9 == null) {
            sQLiteStatement.bindNull(9);
        } else {
            sQLiteStatement.bindText(9, str9);
        }
        String str10 = bVar.f231905j;
        if (str10 == null) {
            sQLiteStatement.bindNull(10);
        } else {
            sQLiteStatement.bindText(10, str10);
        }
        sQLiteStatement.bindLong(11, bVar.k ? 1L : 0L);
        String str11 = bVar.f231906l;
        if (str11 == null) {
            sQLiteStatement.bindNull(12);
        } else {
            sQLiteStatement.bindText(12, str11);
        }
        m1f.b bVar2 = dVar.f211322c;
        x value = bVar.f231907m;
        bVar2.getClass();
        Intrinsics.checkNotNullParameter(value, "value");
        o oVar = bVar2.f201492a;
        oVar.getClass();
        sQLiteStatement.bindText(13, oVar.c(x.Companion.serializer(), value));
        m1f.a aVar = dVar.d;
        List list = bVar.f231908n;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(list, "list");
        o oVar2 = aVar.f201491a;
        oVar2.getClass();
        sQLiteStatement.bindText(14, oVar2.c(new qlm.e(v1.f247718a), list));
        String str12 = bVar.o;
        if (str12 == null) {
            sQLiteStatement.bindNull(15);
        } else {
            sQLiteStatement.bindText(15, str12);
        }
        String str13 = bVar.f231909p;
        if (str13 == null) {
            sQLiteStatement.bindNull(16);
        } else {
            sQLiteStatement.bindText(16, str13);
        }
        List value2 = bVar.f231910q;
        bVar2.getClass();
        o oVar3 = bVar2.f201492a;
        Intrinsics.checkNotNullParameter(value2, "value");
        oVar3.getClass();
        i0 i0Var = j0.Companion;
        sQLiteStatement.bindText(17, oVar3.c(new qlm.e(i0Var.serializer()), value2));
        List value3 = bVar.f231911r;
        Intrinsics.checkNotNullParameter(value3, "value");
        oVar3.getClass();
        sQLiteStatement.bindText(18, oVar3.c(new qlm.e(i0Var.serializer()), value3));
        k kVar = bVar.f231912s;
        String strC2 = null;
        if (kVar != null) {
            oVar3.getClass();
            strC = oVar3.c(k.INSTANCE.serializer(), kVar);
        } else {
            strC = null;
        }
        if (strC == null) {
            sQLiteStatement.bindNull(19);
        } else {
            sQLiteStatement.bindText(19, strC);
        }
        j1f.i iVar = bVar.f231913t;
        if (iVar != null) {
            oVar3.getClass();
            strC2 = oVar3.c(j1f.i.Companion.serializer(), iVar);
        }
        if (strC2 == null) {
            sQLiteStatement.bindNull(20);
        } else {
            sQLiteStatement.bindText(20, strC2);
        }
    }

    private final void e(SQLiteStatement sQLiteStatement, Object obj2) {
        ps6.b bVar = (ps6.b) obj2;
        os6.b bVar2 = (os6.b) this.f11016b;
        String str = bVar.f239395a;
        if (str == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, str);
        }
        String str2 = bVar.f239396b;
        if (str2 == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindText(2, str2);
        }
        String str3 = bVar.f239397c;
        if (str3 == null) {
            sQLiteStatement.bindNull(3);
        } else {
            sQLiteStatement.bindText(3, str3);
        }
        String str4 = bVar.d;
        if (str4 == null) {
            sQLiteStatement.bindNull(4);
        } else {
            sQLiteStatement.bindText(4, str4);
        }
        js6.i iVar = bVar2.f229242c;
        String strB = iVar.b(bVar.e);
        if (strB == null) {
            sQLiteStatement.bindNull(5);
        } else {
            sQLiteStatement.bindText(5, strB);
        }
        String strB2 = iVar.b(bVar.f);
        if (strB2 == null) {
            sQLiteStatement.bindNull(6);
        } else {
            sQLiteStatement.bindText(6, strB2);
        }
        String strB3 = iVar.b(bVar.f239398g);
        if (strB3 == null) {
            sQLiteStatement.bindNull(7);
        } else {
            sQLiteStatement.bindText(7, strB3);
        }
        String strB4 = iVar.b(bVar.f239399h);
        if (strB4 == null) {
            sQLiteStatement.bindNull(8);
        } else {
            sQLiteStatement.bindText(8, strB4);
        }
        String strB5 = iVar.b(bVar.i);
        if (strB5 == null) {
            sQLiteStatement.bindNull(9);
        } else {
            sQLiteStatement.bindText(9, strB5);
        }
        ns6.a aVar = bVar2.d;
        List steps = bVar.f239400j;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(steps, "steps");
        String strK = GsonHolder.a().k(steps);
        Intrinsics.checkNotNullExpressionValue(strK, "toJson(...)");
        if (strK == null) {
            sQLiteStatement.bindNull(10);
        } else {
            sQLiteStatement.bindText(10, strK);
        }
    }

    private final void f(SQLiteStatement sQLiteStatement, Object obj2) {
        ps6.i iVar = (ps6.i) obj2;
        String str = iVar.f239408a;
        if (str == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, str);
        }
        String str2 = iVar.f239409b;
        if (str2 == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindText(2, str2);
        }
        sQLiteStatement.bindLong(3, iVar.d ? 1L : 0L);
        String str3 = iVar.e;
        if (str3 == null) {
            sQLiteStatement.bindNull(4);
        } else {
            sQLiteStatement.bindText(4, str3);
        }
        ps6.h hVar = iVar.f239410c;
        String str4 = hVar.f239405a;
        if (str4 == null) {
            sQLiteStatement.bindNull(5);
        } else {
            sQLiteStatement.bindText(5, str4);
        }
        String strB = ((os6.d) this.f11016b).f229248c.b(hVar.f239406b);
        if (strB == null) {
            sQLiteStatement.bindNull(6);
        } else {
            sQLiteStatement.bindText(6, strB);
        }
        String str5 = hVar.f239407c;
        if (str5 == null) {
            sQLiteStatement.bindNull(7);
        } else {
            sQLiteStatement.bindText(7, str5);
        }
    }

    private final void g(SQLiteStatement sQLiteStatement, Object obj2) {
        ps6.o oVar = (ps6.o) obj2;
        String str = oVar.f239423a;
        if (str == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, str);
        }
        String str2 = oVar.f239424b;
        if (str2 == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindText(2, str2);
        }
        String strB = ((os6.f) this.f11016b).f229253c.b(oVar.d);
        if (strB == null) {
            sQLiteStatement.bindNull(3);
        } else {
            sQLiteStatement.bindText(3, strB);
        }
        ps6.k kVar = oVar.f239425c;
        m mVar = kVar.f239414a;
        sQLiteStatement.bindLong(4, mVar.f239419a);
        String str3 = mVar.f239420b;
        if (str3 == null) {
            sQLiteStatement.bindNull(5);
        } else {
            sQLiteStatement.bindText(5, str3);
        }
        l lVar = kVar.f239415b;
        if (lVar != null) {
            String str4 = lVar.f239417a;
            if (str4 == null) {
                sQLiteStatement.bindNull(6);
            } else {
                sQLiteStatement.bindText(6, str4);
            }
            sQLiteStatement.bindDouble(7, lVar.f239418b);
        } else {
            sQLiteStatement.bindNull(6);
            sQLiteStatement.bindNull(7);
        }
        n nVar = kVar.f239416c;
        sQLiteStatement.bindLong(8, nVar.f239421a);
        String str5 = nVar.f239422b;
        if (str5 == null) {
            sQLiteStatement.bindNull(9);
        } else {
            sQLiteStatement.bindText(9, str5);
        }
    }

    private final void h(SQLiteStatement sQLiteStatement, Object obj2) {
        xr8.b bVar = (xr8.b) obj2;
        or8.a aVar = ((pr8.c) this.f11016b).f238969c;
        String str = bVar.f308295a;
        if (str == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, str);
        }
        sQLiteStatement.bindLong(2, bVar.f308296b);
        String str2 = bVar.f308297c;
        if (str2 == null) {
            sQLiteStatement.bindNull(3);
        } else {
            sQLiteStatement.bindText(3, str2);
        }
        String str3 = bVar.d;
        if (str3 == null) {
            sQLiteStatement.bindNull(4);
        } else {
            sQLiteStatement.bindText(4, str3);
        }
        String str4 = bVar.e;
        if (str4 == null) {
            sQLiteStatement.bindNull(5);
        } else {
            sQLiteStatement.bindText(5, str4);
        }
        String str5 = bVar.f;
        if (str5 == null) {
            sQLiteStatement.bindNull(6);
        } else {
            sQLiteStatement.bindText(6, str5);
        }
        String str6 = bVar.f308298g;
        if (str6 == null) {
            sQLiteStatement.bindNull(7);
        } else {
            sQLiteStatement.bindText(7, str6);
        }
        sQLiteStatement.bindLong(8, bVar.f308299h);
        String str7 = bVar.i;
        if (str7 == null) {
            sQLiteStatement.bindNull(9);
        } else {
            sQLiteStatement.bindText(9, str7);
        }
        String str8 = bVar.f308300j;
        if (str8 == null) {
            sQLiteStatement.bindNull(10);
        } else {
            sQLiteStatement.bindText(10, str8);
        }
        xr8.a entity = bVar.k;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(entity, "entity");
        String strK = aVar.f228078a.k(entity);
        Intrinsics.checkNotNullExpressionValue(strK, "toJson(...)");
        if (strK == null) {
            sQLiteStatement.bindNull(11);
        } else {
            sQLiteStatement.bindText(11, strK);
        }
        xr8.a entity2 = bVar.f308301l;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(entity2, "entity");
        String strK2 = aVar.f228078a.k(entity2);
        Intrinsics.checkNotNullExpressionValue(strK2, "toJson(...)");
        if (strK2 == null) {
            sQLiteStatement.bindNull(12);
        } else {
            sQLiteStatement.bindText(12, strK2);
        }
        xr8.c cVar = bVar.f308302m;
        if (cVar == null) {
            prk.o.y(sQLiteStatement, 13, 14, 15);
            return;
        }
        String str9 = cVar.f308303a;
        if (str9 == null) {
            sQLiteStatement.bindNull(13);
        } else {
            sQLiteStatement.bindText(13, str9);
        }
        jo3.b bVar2 = cVar.f308304b;
        if (bVar2 == null) {
            sQLiteStatement.bindNull(14);
            sQLiteStatement.bindNull(15);
        } else if (a10.b.v(bVar2, sQLiteStatement, 14) == null) {
            sQLiteStatement.bindNull(15);
        } else {
            sQLiteStatement.bindText(15, bVar2.getCurrency());
        }
    }

    private final void i(SQLiteStatement sQLiteStatement, Object obj2) {
        rsj.a aVar = (rsj.a) obj2;
        psj.a aVar2 = (psj.a) this.f11016b;
        String str = aVar.f257085a;
        if (str == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, str);
        }
        String str2 = aVar.f257086b;
        if (str2 == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindText(2, str2);
        }
        qsj.a aVarA = aVar2.a();
        Map map = aVar.d;
        aVarA.getClass();
        Intrinsics.checkNotNullParameter(map, "map");
        sQLiteStatement.bindText(3, aVarA.f248864a.c(JsonObject.INSTANCE.serializer(), gj7.b.U(map)));
        qsj.c cVarB = aVar2.b();
        List list = aVar.e;
        cVarB.getClass();
        Intrinsics.checkNotNullParameter(list, "list");
        sQLiteStatement.bindText(4, cVarB.f248866a.c(nlm.a.a(rsj.e.Companion.serializer()), list));
        Long l2 = aVar.f;
        if (l2 == null) {
            sQLiteStatement.bindNull(5);
        } else {
            sQLiteStatement.bindLong(5, l2.longValue());
        }
        sQLiteStatement.bindLong(6, aVar.f257088g);
        sQLiteStatement.bindLong(7, aVar.f257089h);
        String str3 = aVar.i;
        if (str3 == null) {
            sQLiteStatement.bindNull(8);
        } else {
            sQLiteStatement.bindText(8, str3);
        }
        String str4 = aVar.f257090j;
        if (str4 == null) {
            sQLiteStatement.bindNull(9);
        } else {
            sQLiteStatement.bindText(9, str4);
        }
        sQLiteStatement.bindLong(10, aVar.k ? 1L : 0L);
        sQLiteStatement.bindLong(11, aVar.f257091l ? 1L : 0L);
        jo3.b bVar = aVar.f257087c;
        if (bVar == null) {
            sQLiteStatement.bindNull(12);
            sQLiteStatement.bindNull(13);
        } else if (a10.b.v(bVar, sQLiteStatement, 12) == null) {
            sQLiteStatement.bindNull(13);
        } else {
            sQLiteStatement.bindText(13, bVar.getCurrency());
        }
    }

    private final void j(SQLiteStatement sQLiteStatement, Object obj2) {
        rsj.b bVar = (rsj.b) obj2;
        psj.b bVar2 = (psj.b) this.f11016b;
        String str = bVar.f257092a;
        if (str == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, str);
        }
        String str2 = bVar.f257093b;
        if (str2 == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindText(2, str2);
        }
        String str3 = bVar.f257094c;
        if (str3 == null) {
            sQLiteStatement.bindNull(3);
        } else {
            sQLiteStatement.bindText(3, str3);
        }
        String str4 = bVar.d;
        if (str4 == null) {
            sQLiteStatement.bindNull(4);
        } else {
            sQLiteStatement.bindText(4, str4);
        }
        sQLiteStatement.bindLong(5, bVar.e ? 1L : 0L);
        qsj.b bVarA = bVar2.a();
        List list = bVar.f;
        bVarA.getClass();
        Intrinsics.checkNotNullParameter(list, "list");
        Json json = bVarA.f248865a;
        t0 t0Var = t0.f186434a;
        nlm.a.d(t0Var);
        v1 v1Var = v1.f247718a;
        sQLiteStatement.bindText(6, json.c(nlm.a.a(v1Var), list));
        if (bVar.f257095g == null) {
            sQLiteStatement.bindNull(7);
        } else {
            sQLiteStatement.bindLong(7, r1.intValue());
        }
        qsj.b bVarA2 = bVar2.a();
        List list2 = bVar.f257096h;
        bVarA2.getClass();
        Intrinsics.checkNotNullParameter(list2, "list");
        Json json2 = bVarA2.f248865a;
        nlm.a.d(t0Var);
        sQLiteStatement.bindText(8, json2.c(nlm.a.a(v1Var), list2));
        sQLiteStatement.bindLong(9, bVar.i ? 1L : 0L);
    }

    private final void k(SQLiteStatement sQLiteStatement, Object obj2) {
        svj.a aVar = (svj.a) obj2;
        String str = aVar.f266022a;
        if (str == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, str);
        }
        Long l2 = aVar.f266023b;
        if (l2 == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindLong(2, l2.longValue());
        }
        Long l3 = aVar.f266024c;
        if (l3 == null) {
            sQLiteStatement.bindNull(3);
        } else {
            sQLiteStatement.bindLong(3, l3.longValue());
        }
        String str2 = aVar.d;
        if (str2 == null) {
            sQLiteStatement.bindNull(4);
        } else {
            sQLiteStatement.bindText(4, str2);
        }
        rvj.a aVarL = ((qvj.c) this.f11016b).l();
        List type = aVar.e;
        aVarL.getClass();
        Intrinsics.checkNotNullParameter(type, "type");
        Json json = aVarL.f257783a;
        json.getClass();
        sQLiteStatement.bindText(5, json.c(new qlm.e(svj.d.Companion.serializer()), type));
        sQLiteStatement.bindLong(6, aVar.f);
        sQLiteStatement.bindLong(7, aVar.f266025g ? 1L : 0L);
    }

    private final void l(SQLiteStatement sQLiteStatement, Object obj2) {
        tqj.d dVar = (tqj.d) obj2;
        String str = dVar.f273612a;
        if (str == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, str);
        }
        sQLiteStatement.bindLong(2, dVar.f273613b);
        Long l2 = dVar.f273614c;
        if (l2 == null) {
            sQLiteStatement.bindNull(3);
        } else {
            sQLiteStatement.bindLong(3, l2.longValue());
        }
        String str2 = dVar.e;
        if (str2 == null) {
            sQLiteStatement.bindNull(4);
        } else {
            sQLiteStatement.bindText(4, str2);
        }
        sQLiteStatement.bindLong(5, dVar.f);
        sqj.a aVarF = ((rqj.j) this.f11016b).f();
        List value = dVar.f273615g;
        aVarF.getClass();
        Intrinsics.checkNotNullParameter(value, "value");
        sQLiteStatement.bindText(6, aVarF.f265096a.c(nlm.a.a(tqj.c.Companion.serializer()), value));
        zpj.a aVar = dVar.d;
        String str3 = aVar.f324314a;
        if (str3 == null) {
            sQLiteStatement.bindNull(7);
        } else {
            sQLiteStatement.bindText(7, str3);
        }
        String str4 = aVar.f324315b;
        if (str4 == null) {
            sQLiteStatement.bindNull(8);
        } else {
            sQLiteStatement.bindText(8, str4);
        }
        if (aVar.f324316c == null) {
            sQLiteStatement.bindNull(9);
        } else {
            sQLiteStatement.bindLong(9, r0.intValue());
        }
        String str5 = aVar.d;
        if (str5 == null) {
            sQLiteStatement.bindNull(10);
        } else {
            sQLiteStatement.bindText(10, str5);
        }
    }

    private final void m(SQLiteStatement sQLiteStatement, Object obj2) {
        String str;
        sx1.h hVar = (sx1.h) obj2;
        String str2 = hVar.f266258a;
        if (str2 == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, str2);
        }
        String str3 = hVar.f266259b;
        if (str3 == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindText(2, str3);
        }
        String str4 = hVar.f266260c;
        if (str4 == null) {
            sQLiteStatement.bindNull(3);
        } else {
            sQLiteStatement.bindText(3, str4);
        }
        String str5 = hVar.d;
        if (str5 == null) {
            sQLiteStatement.bindNull(4);
        } else {
            sQLiteStatement.bindText(4, str5);
        }
        String str6 = hVar.e;
        if (str6 == null) {
            sQLiteStatement.bindNull(5);
        } else {
            sQLiteStatement.bindText(5, str6);
        }
        String str7 = hVar.f;
        if (str7 == null) {
            sQLiteStatement.bindNull(6);
        } else {
            sQLiteStatement.bindText(6, str7);
        }
        String str8 = hVar.f266261g;
        if (str8 == null) {
            sQLiteStatement.bindNull(7);
        } else {
            sQLiteStatement.bindText(7, str8);
        }
        sx1.g gVar = (sx1.g) this.f11016b;
        wx1.b bVar = hVar.f266262h;
        gVar.getClass();
        int i = sx1.f.f266255a[bVar.ordinal()];
        if (i == 1) {
            str = "ACTIVE";
        } else {
            if (i != 2) {
                throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: " + bVar);
            }
            str = "DELETED";
        }
        sQLiteStatement.bindText(8, str);
        sQLiteStatement.bindLong(9, hVar.i ? 1L : 0L);
    }

    private final void n(SQLiteStatement sQLiteStatement, Object obj2) {
        q qVar = (q) obj2;
        String str = qVar.f289820a;
        if (str == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, str);
        }
        String str2 = qVar.f289821b;
        if (str2 == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindText(2, str2);
        }
        String str3 = qVar.f289822c;
        if (str3 == null) {
            sQLiteStatement.bindNull(3);
        } else {
            sQLiteStatement.bindText(3, str3);
        }
        sjl.c cVar = ((tjl.d) this.f11016b).f271814c;
        p type = qVar.d;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(type, "type");
        String strA = type.a();
        if (strA == null) {
            sQLiteStatement.bindNull(4);
        } else {
            sQLiteStatement.bindText(4, strA);
        }
        vjl.m mVar = qVar.e;
        if (mVar != null) {
            String str4 = mVar.f289817a;
            if (str4 == null) {
                sQLiteStatement.bindNull(5);
            } else {
                sQLiteStatement.bindText(5, str4);
            }
            Boolean bool = mVar.f289818b;
            if ((bool == null ? null : Integer.valueOf(bool.booleanValue() ? 1 : 0)) == null) {
                sQLiteStatement.bindNull(6);
            } else {
                sQLiteStatement.bindLong(6, r4.intValue());
            }
            String str5 = mVar.f289819c;
            if (str5 == null) {
                sQLiteStatement.bindNull(7);
            } else {
                sQLiteStatement.bindText(7, str5);
            }
        } else {
            prk.o.y(sQLiteStatement, 5, 6, 7);
        }
        vjl.m mVar2 = qVar.f;
        if (mVar2 != null) {
            String str6 = mVar2.f289817a;
            if (str6 == null) {
                sQLiteStatement.bindNull(8);
            } else {
                sQLiteStatement.bindText(8, str6);
            }
            Boolean bool2 = mVar2.f289818b;
            if ((bool2 != null ? Integer.valueOf(bool2.booleanValue() ? 1 : 0) : null) == null) {
                sQLiteStatement.bindNull(9);
            } else {
                sQLiteStatement.bindLong(9, r1.intValue());
            }
            String str7 = mVar2.f289819c;
            if (str7 == null) {
                sQLiteStatement.bindNull(10);
            } else {
                sQLiteStatement.bindText(10, str7);
            }
        } else {
            prk.o.y(sQLiteStatement, 8, 9, 10);
        }
        vjl.k kVar = qVar.f289823g;
        if (kVar == null) {
            prk.o.z(sQLiteStatement, 11, 12, 13, 14);
            sQLiteStatement.bindNull(15);
            return;
        }
        String str8 = kVar.f289814a;
        if (str8 == null) {
            sQLiteStatement.bindNull(11);
        } else {
            sQLiteStatement.bindText(11, str8);
        }
        String str9 = kVar.f289815b;
        if (str9 == null) {
            sQLiteStatement.bindNull(12);
        } else {
            sQLiteStatement.bindText(12, str9);
        }
        String str10 = kVar.f289816c;
        if (str10 == null) {
            sQLiteStatement.bindNull(13);
        } else {
            sQLiteStatement.bindText(13, str10);
        }
        String str11 = kVar.d;
        if (str11 == null) {
            sQLiteStatement.bindNull(14);
        } else {
            sQLiteStatement.bindText(14, str11);
        }
        String str12 = kVar.e;
        if (str12 == null) {
            sQLiteStatement.bindNull(15);
        } else {
            sQLiteStatement.bindText(15, str12);
        }
    }

    private final void o(SQLiteStatement sQLiteStatement, Object obj2) {
        String str;
        tx1.j jVar = (tx1.j) obj2;
        String str2 = jVar.f275315a;
        if (str2 == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, str2);
        }
        String str3 = jVar.f275316b;
        if (str3 == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindText(2, str3);
        }
        String str4 = jVar.f275317c;
        if (str4 == null) {
            sQLiteStatement.bindNull(3);
        } else {
            sQLiteStatement.bindText(3, str4);
        }
        String str5 = jVar.d;
        if (str5 == null) {
            sQLiteStatement.bindNull(4);
        } else {
            sQLiteStatement.bindText(4, str5);
        }
        String str6 = jVar.e;
        if (str6 == null) {
            sQLiteStatement.bindNull(5);
        } else {
            sQLiteStatement.bindText(5, str6);
        }
        String str7 = jVar.f;
        if (str7 == null) {
            sQLiteStatement.bindNull(6);
        } else {
            sQLiteStatement.bindText(6, str7);
        }
        String str8 = jVar.f275318g;
        if (str8 == null) {
            sQLiteStatement.bindNull(7);
        } else {
            sQLiteStatement.bindText(7, str8);
        }
        tx1.i iVar = (tx1.i) this.f11016b;
        wx1.c cVar = jVar.f275319h;
        iVar.getClass();
        int i = tx1.h.f275311a[cVar.ordinal()];
        if (i == 1) {
            str = "ACTIVE";
        } else if (i == 2) {
            str = "DELETED";
        } else {
            if (i != 3) {
                throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: " + cVar);
            }
            str = "NOT_REGISTERED";
        }
        sQLiteStatement.bindText(8, str);
    }

    private final void p(SQLiteStatement sQLiteStatement, Object obj2) {
        String str;
        ux1.h hVar = (ux1.h) obj2;
        String str2 = hVar.f283858a;
        if (str2 == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, str2);
        }
        String str3 = hVar.f283859b;
        if (str3 == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindText(2, str3);
        }
        String str4 = hVar.f283860c;
        if (str4 == null) {
            sQLiteStatement.bindNull(3);
        } else {
            sQLiteStatement.bindText(3, str4);
        }
        String str5 = hVar.d;
        if (str5 == null) {
            sQLiteStatement.bindNull(4);
        } else {
            sQLiteStatement.bindText(4, str5);
        }
        String str6 = hVar.e;
        if (str6 == null) {
            sQLiteStatement.bindNull(5);
        } else {
            sQLiteStatement.bindText(5, str6);
        }
        String str7 = hVar.f;
        if (str7 == null) {
            sQLiteStatement.bindNull(6);
        } else {
            sQLiteStatement.bindText(6, str7);
        }
        String str8 = hVar.f283861g;
        if (str8 == null) {
            sQLiteStatement.bindNull(7);
        } else {
            sQLiteStatement.bindText(7, str8);
        }
        ux1.g gVar = (ux1.g) this.f11016b;
        wx1.b bVar = hVar.f283862h;
        gVar.getClass();
        int i = ux1.f.f283855a[bVar.ordinal()];
        if (i == 1) {
            str = "ACTIVE";
        } else {
            if (i != 2) {
                throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: " + bVar);
            }
            str = "DELETED";
        }
        sQLiteStatement.bindText(8, str);
    }

    private final void q(SQLiteStatement sQLiteStatement, Object obj2) {
        String str;
        vx1.g gVar = (vx1.g) obj2;
        String str2 = gVar.f292798a;
        if (str2 == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, str2);
        }
        String str3 = gVar.f292799b;
        if (str3 == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindText(2, str3);
        }
        String str4 = gVar.f292800c;
        if (str4 == null) {
            sQLiteStatement.bindNull(3);
        } else {
            sQLiteStatement.bindText(3, str4);
        }
        String str5 = gVar.d;
        if (str5 == null) {
            sQLiteStatement.bindNull(4);
        } else {
            sQLiteStatement.bindText(4, str5);
        }
        String str6 = gVar.e;
        if (str6 == null) {
            sQLiteStatement.bindNull(5);
        } else {
            sQLiteStatement.bindText(5, str6);
        }
        String str7 = gVar.f;
        if (str7 == null) {
            sQLiteStatement.bindNull(6);
        } else {
            sQLiteStatement.bindText(6, str7);
        }
        String str8 = gVar.f292801g;
        if (str8 == null) {
            sQLiteStatement.bindNull(7);
        } else {
            sQLiteStatement.bindText(7, str8);
        }
        vx1.f fVar = (vx1.f) this.f11016b;
        wx1.b bVar = gVar.f292802h;
        fVar.getClass();
        int i = vx1.e.f292795a[bVar.ordinal()];
        if (i == 1) {
            str = "ACTIVE";
        } else {
            if (i != 2) {
                throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: " + bVar);
            }
            str = "DELETED";
        }
        sQLiteStatement.bindText(8, str);
        String str9 = gVar.i;
        if (str9 == null) {
            sQLiteStatement.bindNull(9);
        } else {
            sQLiteStatement.bindText(9, str9);
        }
    }

    private final void r(SQLiteStatement sQLiteStatement, Object obj2) {
        String strC;
        ysj.k kVar = (ysj.k) obj2;
        wsj.d dVar = (wsj.d) this.f11016b;
        String str = kVar.f316487a;
        if (str == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, str);
        }
        String str2 = kVar.f316488b;
        if (str2 == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindText(2, str2);
        }
        String str3 = kVar.f316489c;
        if (str3 == null) {
            sQLiteStatement.bindNull(3);
        } else {
            sQLiteStatement.bindText(3, str3);
        }
        String str4 = kVar.d;
        if (str4 == null) {
            sQLiteStatement.bindNull(4);
        } else {
            sQLiteStatement.bindText(4, str4);
        }
        sQLiteStatement.bindLong(5, kVar.e);
        xsj.b bVarC = dVar.c();
        List type = kVar.f;
        bVarC.getClass();
        Intrinsics.checkNotNullParameter(type, "type");
        Json json = bVarC.f308548a;
        json.getClass();
        ysj.i iVar = ysj.j.Companion;
        sQLiteStatement.bindText(6, json.c(new qlm.e(iVar.serializer()), type));
        xsj.c cVarD = dVar.d();
        ysj.j jVar = kVar.f316490g;
        if (jVar != null) {
            Json json2 = cVarD.f308549a;
            json2.getClass();
            strC = json2.c(iVar.serializer(), jVar);
        } else {
            cVarD.getClass();
            strC = null;
        }
        if (strC == null) {
            sQLiteStatement.bindNull(7);
        } else {
            sQLiteStatement.bindText(7, strC);
        }
    }

    private final void s(SQLiteStatement sQLiteStatement, Object obj2) {
        String strC;
        ysj.g gVar = (ysj.g) obj2;
        wsj.g gVar2 = (wsj.g) this.f11016b;
        String str = gVar.f316477a;
        if (str == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, str);
        }
        String str2 = gVar.f316478b;
        if (str2 == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindText(2, str2);
        }
        String str3 = gVar.f316479c;
        if (str3 == null) {
            sQLiteStatement.bindNull(3);
        } else {
            sQLiteStatement.bindText(3, str3);
        }
        String str4 = gVar.d;
        if (str4 == null) {
            sQLiteStatement.bindNull(4);
        } else {
            sQLiteStatement.bindText(4, str4);
        }
        String str5 = gVar.e;
        if (str5 == null) {
            sQLiteStatement.bindNull(5);
        } else {
            sQLiteStatement.bindText(5, str5);
        }
        sQLiteStatement.bindLong(6, gVar.f);
        sQLiteStatement.bindLong(7, gVar.f316480g);
        xsj.a aVarF = gVar2.f();
        List type = gVar.f316481h;
        aVarF.getClass();
        Intrinsics.checkNotNullParameter(type, "type");
        Json json = aVarF.f308547a;
        json.getClass();
        sQLiteStatement.bindText(8, json.c(new qlm.e(ysj.c.Companion.serializer()), type));
        String str6 = gVar.i;
        if (str6 == null) {
            sQLiteStatement.bindNull(9);
        } else {
            sQLiteStatement.bindText(9, str6);
        }
        xsj.d dVarG = gVar2.g();
        y yVar = gVar.f316482j;
        if (yVar != null) {
            Json json2 = dVarG.f308550a;
            json2.getClass();
            strC = json2.c(y.Companion.serializer(), yVar);
        } else {
            dVarG.getClass();
            strC = null;
        }
        if (strC == null) {
            sQLiteStatement.bindNull(10);
        } else {
            sQLiteStatement.bindText(10, strC);
        }
    }

    private final void t(SQLiteStatement sQLiteStatement, Object obj2) {
        String str;
        String str2;
        xx1.g gVar = (xx1.g) obj2;
        xx1.f fVar = (xx1.f) this.f11016b;
        String str3 = gVar.f309389a;
        if (str3 == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, str3);
        }
        String str4 = gVar.f309390b;
        if (str4 == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindText(2, str4);
        }
        String str5 = gVar.f309391c;
        if (str5 == null) {
            sQLiteStatement.bindNull(3);
        } else {
            sQLiteStatement.bindText(3, str5);
        }
        String str6 = gVar.d;
        if (str6 == null) {
            sQLiteStatement.bindNull(4);
        } else {
            sQLiteStatement.bindText(4, str6);
        }
        String str7 = gVar.e;
        if (str7 == null) {
            sQLiteStatement.bindNull(5);
        } else {
            sQLiteStatement.bindText(5, str7);
        }
        String str8 = gVar.f;
        if (str8 == null) {
            sQLiteStatement.bindNull(6);
        } else {
            sQLiteStatement.bindText(6, str8);
        }
        String str9 = gVar.f309392g;
        if (str9 == null) {
            sQLiteStatement.bindNull(7);
        } else {
            sQLiteStatement.bindText(7, str9);
        }
        wx1.b bVar = gVar.f309393h;
        fVar.getClass();
        int i = xx1.e.f309385a[bVar.ordinal()];
        if (i == 1) {
            str = "ACTIVE";
        } else {
            if (i != 2) {
                throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: " + bVar);
            }
            str = "DELETED";
        }
        sQLiteStatement.bindText(8, str);
        wx1.a aVar = gVar.i;
        int i2 = xx1.e.f309386b[aVar.ordinal()];
        if (i2 == 1) {
            str2 = "PERSONAL";
        } else {
            if (i2 != 2) {
                throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: " + aVar);
            }
            str2 = "BUSINESS";
        }
        sQLiteStatement.bindText(9, str2);
    }

    @Override // androidx.room.EntityInsertAdapter
    public final void bind(SQLiteStatement sQLiteStatement, Object obj2) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String strK;
        String strK2;
        String strK3;
        String strK4;
        String strK5;
        String strK6;
        String strK7;
        switch (this.f11015a) {
            case 0:
                i iVar = (i) obj2;
                String str6 = iVar.f11020a;
                if (str6 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str6);
                }
                String str7 = iVar.f11021b;
                if (str7 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str7);
                }
                String str8 = iVar.f11022c;
                if (str8 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, str8);
                }
                String str9 = iVar.d;
                if (str9 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, str9);
                }
                String str10 = iVar.e;
                if (str10 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, str10);
                }
                String str11 = iVar.f;
                if (str11 == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, str11);
                }
                String str12 = iVar.f11023g;
                if (str12 == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindText(7, str12);
                }
                h hVar = (h) this.f11016b;
                wx1.b bVar = iVar.f11024h;
                hVar.getClass();
                int i = g.f11017a[bVar.ordinal()];
                if (i == 1) {
                    str = "ACTIVE";
                } else {
                    if (i != 2) {
                        throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: " + bVar);
                    }
                    str = "DELETED";
                }
                sQLiteStatement.bindText(8, str);
                String str13 = iVar.i;
                if (str13 == null) {
                    sQLiteStatement.bindNull(9);
                } else {
                    sQLiteStatement.bindText(9, str13);
                }
                String str14 = iVar.f11025j;
                if (str14 == null) {
                    sQLiteStatement.bindNull(10);
                } else {
                    sQLiteStatement.bindText(10, str14);
                }
                String str15 = iVar.k;
                if (str15 == null) {
                    sQLiteStatement.bindNull(11);
                } else {
                    sQLiteStatement.bindText(11, str15);
                }
                String str16 = iVar.f11026l;
                if (str16 == null) {
                    sQLiteStatement.bindNull(12);
                    return;
                } else {
                    sQLiteStatement.bindText(12, str16);
                    return;
                }
            case 1:
                by1.h hVar2 = (by1.h) obj2;
                String str17 = hVar2.f19729a;
                if (str17 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str17);
                }
                String str18 = hVar2.f19730b;
                if (str18 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str18);
                }
                String str19 = hVar2.f19731c;
                if (str19 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, str19);
                }
                String str20 = hVar2.d;
                if (str20 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, str20);
                }
                String str21 = hVar2.e;
                if (str21 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, str21);
                }
                String str22 = hVar2.f;
                if (str22 == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, str22);
                }
                String str23 = hVar2.f19732g;
                if (str23 == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindText(7, str23);
                }
                by1.g gVar = (by1.g) this.f11016b;
                wx1.b bVar2 = hVar2.f19733h;
                gVar.getClass();
                int i2 = by1.f.f19726a[bVar2.ordinal()];
                if (i2 == 1) {
                    str2 = "ACTIVE";
                } else {
                    if (i2 != 2) {
                        throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: " + bVar2);
                    }
                    str2 = "DELETED";
                }
                sQLiteStatement.bindText(8, str2);
                sQLiteStatement.bindLong(9, hVar2.i ? 1L : 0L);
                wx1.d dVar = hVar2.f19734j;
                if (dVar == null) {
                    sQLiteStatement.bindNull(10);
                    return;
                }
                Boolean bool = dVar.f300732a;
                if ((bool == null ? null : Integer.valueOf(bool.booleanValue() ? 1 : 0)) == null) {
                    sQLiteStatement.bindNull(10);
                    return;
                } else {
                    sQLiteStatement.bindLong(10, r2.intValue());
                    return;
                }
            case 2:
                c72.a aVar = (c72.a) obj2;
                String str24 = aVar.f21830a;
                if (str24 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str24);
                }
                c72.f fVar = (c72.f) this.f11016b;
                c72.c cVar = aVar.f21831b;
                fVar.getClass();
                int i3 = c72.e.f21838a[cVar.ordinal()];
                if (i3 == 1) {
                    str3 = "UNKNOWN";
                } else if (i3 == 2) {
                    str3 = "ACTIVE";
                } else if (i3 == 3) {
                    str3 = "USED";
                } else if (i3 == 4) {
                    str3 = "EXPIRED";
                } else {
                    if (i3 != 5) {
                        throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: " + cVar);
                    }
                    str3 = "CANCELLED";
                }
                sQLiteStatement.bindText(2, str3);
                String str25 = aVar.f21832c;
                if (str25 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, str25);
                }
                String str26 = aVar.d;
                if (str26 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, str26);
                }
                String str27 = aVar.e;
                if (str27 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, str27);
                }
                sQLiteStatement.bindLong(6, aVar.f21833g);
                sQLiteStatement.bindLong(7, aVar.f21834h);
                sQLiteStatement.bindLong(8, aVar.i);
                String str28 = aVar.f21835j;
                if (str28 == null) {
                    sQLiteStatement.bindNull(9);
                } else {
                    sQLiteStatement.bindText(9, str28);
                }
                jo3.b bVar3 = aVar.f;
                if (a10.b.v(bVar3, sQLiteStatement, 10) == null) {
                    sQLiteStatement.bindNull(11);
                    return;
                } else {
                    sQLiteStatement.bindText(11, bVar3.getCurrency());
                    return;
                }
            case 3:
                cy1.h hVar3 = (cy1.h) obj2;
                String str29 = hVar3.f110032a;
                if (str29 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str29);
                }
                String str30 = hVar3.f110033b;
                if (str30 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str30);
                }
                String str31 = hVar3.f110034c;
                if (str31 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, str31);
                }
                String str32 = hVar3.d;
                if (str32 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, str32);
                }
                String str33 = hVar3.e;
                if (str33 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, str33);
                }
                String str34 = hVar3.f;
                if (str34 == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, str34);
                }
                String str35 = hVar3.f110035g;
                if (str35 == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindText(7, str35);
                }
                cy1.g gVar2 = (cy1.g) this.f11016b;
                wx1.b bVar4 = hVar3.f110036h;
                gVar2.getClass();
                int i5 = cy1.f.f110029a[bVar4.ordinal()];
                if (i5 == 1) {
                    str4 = "ACTIVE";
                } else {
                    if (i5 != 2) {
                        throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: " + bVar4);
                    }
                    str4 = "DELETED";
                }
                sQLiteStatement.bindText(8, str4);
                return;
            case 4:
                dy1.h hVar4 = (dy1.h) obj2;
                String str36 = hVar4.f121045a;
                if (str36 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str36);
                }
                String str37 = hVar4.f121046b;
                if (str37 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str37);
                }
                String str38 = hVar4.f121047c;
                if (str38 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, str38);
                }
                String str39 = hVar4.d;
                if (str39 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, str39);
                }
                String str40 = hVar4.e;
                if (str40 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, str40);
                }
                String str41 = hVar4.f;
                if (str41 == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, str41);
                }
                String str42 = hVar4.f121048g;
                if (str42 == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindText(7, str42);
                }
                dy1.g gVar3 = (dy1.g) this.f11016b;
                wx1.b bVar5 = hVar4.f121049h;
                gVar3.getClass();
                int i6 = dy1.f.f121042a[bVar5.ordinal()];
                if (i6 == 1) {
                    str5 = "ACTIVE";
                } else {
                    if (i6 != 2) {
                        throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: " + bVar5);
                    }
                    str5 = "DELETED";
                }
                sQLiteStatement.bindText(8, str5);
                sQLiteStatement.bindLong(9, hVar4.i ? 1L : 0L);
                return;
            case 5:
                iv9.m mVar = (iv9.m) obj2;
                String str43 = mVar.f168796a;
                if (str43 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str43);
                }
                String str44 = mVar.f168797b;
                if (str44 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str44);
                }
                String str45 = mVar.f168798c;
                if (str45 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, str45);
                }
                String str46 = mVar.d;
                if (str46 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, str46);
                }
                sQLiteStatement.bindLong(5, mVar.e ? 1L : 0L);
                fv9.a aVar2 = ((gv9.k) this.f11016b).f147119c;
                List list = mVar.f;
                aVar2.getClass();
                String strR = list != null ? com.revolut.data.database.models.openbanking.d.r("toJson(...)", list) : null;
                if (strR == null) {
                    sQLiteStatement.bindNull(6);
                    return;
                } else {
                    sQLiteStatement.bindText(6, strR);
                    return;
                }
            case 6:
                i16.b bVar6 = (i16.b) obj2;
                String str47 = bVar6.f157575a;
                if (str47 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str47);
                }
                String str48 = bVar6.f157576b;
                if (str48 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str48);
                }
                i16.c cVar2 = ((h16.a) this.f11016b).f148469c;
                List balances = bVar6.f157577c;
                cVar2.getClass();
                Intrinsics.checkNotNullParameter(balances, "balances");
                o oVar = cVar2.f157578a;
                oVar.getClass();
                sQLiteStatement.bindText(3, oVar.c(new qlm.e(i16.f.Companion.serializer()), balances));
                return;
            case 7:
                ks6.k kVar = (ks6.k) obj2;
                is6.a aVar3 = (is6.a) this.f11016b;
                js6.i iVar2 = aVar3.f168113c;
                String str49 = kVar.f189186a;
                if (str49 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str49);
                }
                js6.a aVar4 = aVar3.d;
                String strA = iVar2.a(kVar.f189187b);
                if (strA == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, strA);
                }
                String strA2 = iVar2.a(kVar.f189188c);
                if (strA2 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, strA2);
                }
                String str50 = kVar.d;
                if (str50 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, str50);
                }
                String str51 = kVar.e;
                if (str51 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, str51);
                }
                String str52 = kVar.f;
                if (str52 == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, str52);
                }
                String str53 = kVar.f189189g;
                if (str53 == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindText(7, str53);
                }
                String str54 = kVar.f189190h;
                if (str54 == null) {
                    sQLiteStatement.bindNull(8);
                } else {
                    sQLiteStatement.bindText(8, str54);
                }
                String str55 = kVar.i;
                if (str55 == null) {
                    sQLiteStatement.bindNull(9);
                } else {
                    sQLiteStatement.bindText(9, str55);
                }
                String str56 = kVar.f189191j;
                if (str56 == null) {
                    sQLiteStatement.bindNull(10);
                } else {
                    sQLiteStatement.bindText(10, str56);
                }
                List list2 = kVar.k;
                aVar4.getClass();
                String strK8 = null;
                String strR2 = list2 != null ? com.revolut.data.database.models.openbanking.d.r("toJson(...)", list2) : null;
                if (strR2 == null) {
                    sQLiteStatement.bindNull(11);
                } else {
                    sQLiteStatement.bindText(11, strR2);
                }
                List list3 = kVar.f189192l;
                String strR3 = list3 != null ? com.revolut.data.database.models.openbanking.d.r("toJson(...)", list3) : null;
                if (strR3 == null) {
                    sQLiteStatement.bindNull(12);
                } else {
                    sQLiteStatement.bindText(12, strR3);
                }
                ks6.i iVar3 = kVar.f189193m;
                if (iVar3 != null) {
                    strK = GsonHolder.a().k(iVar3);
                    Intrinsics.checkNotNullExpressionValue(strK, "toJson(...)");
                } else {
                    strK = null;
                }
                if (strK == null) {
                    sQLiteStatement.bindNull(13);
                } else {
                    sQLiteStatement.bindText(13, strK);
                }
                ks6.h hVar5 = kVar.f189194n;
                if (hVar5 != null) {
                    strK2 = GsonHolder.a().k(hVar5);
                    Intrinsics.checkNotNullExpressionValue(strK2, "toJson(...)");
                } else {
                    strK2 = null;
                }
                if (strK2 == null) {
                    sQLiteStatement.bindNull(14);
                } else {
                    sQLiteStatement.bindText(14, strK2);
                }
                ks6.j jVar = kVar.o;
                if (jVar != null) {
                    strK3 = GsonHolder.a().k(jVar);
                    Intrinsics.checkNotNullExpressionValue(strK3, "toJson(...)");
                } else {
                    strK3 = null;
                }
                if (strK3 == null) {
                    sQLiteStatement.bindNull(15);
                } else {
                    sQLiteStatement.bindText(15, strK3);
                }
                ks6.f fVar2 = kVar.f189195p;
                if (fVar2 != null) {
                    strK4 = GsonHolder.a().k(fVar2);
                    Intrinsics.checkNotNullExpressionValue(strK4, "toJson(...)");
                } else {
                    strK4 = null;
                }
                if (strK4 == null) {
                    sQLiteStatement.bindNull(16);
                } else {
                    sQLiteStatement.bindText(16, strK4);
                }
                ks6.e eVar = kVar.f189196q;
                if (eVar != null) {
                    strK5 = GsonHolder.a().k(eVar);
                    Intrinsics.checkNotNullExpressionValue(strK5, "toJson(...)");
                } else {
                    strK5 = null;
                }
                if (strK5 == null) {
                    sQLiteStatement.bindNull(17);
                } else {
                    sQLiteStatement.bindText(17, strK5);
                }
                ks6.g gVar4 = kVar.f189197r;
                if (gVar4 != null) {
                    strK8 = GsonHolder.a().k(gVar4);
                    Intrinsics.checkNotNullExpressionValue(strK8, "toJson(...)");
                }
                if (strK8 == null) {
                    sQLiteStatement.bindNull(18);
                } else {
                    sQLiteStatement.bindText(18, strK8);
                }
                jo3.b bVar7 = kVar.f189198s;
                if (a10.b.v(bVar7, sQLiteStatement, 19) == null) {
                    sQLiteStatement.bindNull(20);
                } else {
                    sQLiteStatement.bindText(20, bVar7.getCurrency());
                }
                jo3.b bVar8 = kVar.f189199t;
                if (bVar8 == null) {
                    sQLiteStatement.bindNull(21);
                    sQLiteStatement.bindNull(22);
                } else if (a10.b.v(bVar8, sQLiteStatement, 21) == null) {
                    sQLiteStatement.bindNull(22);
                } else {
                    sQLiteStatement.bindText(22, bVar8.getCurrency());
                }
                jo3.b bVar9 = kVar.u;
                if (bVar9 == null) {
                    sQLiteStatement.bindNull(23);
                    sQLiteStatement.bindNull(24);
                } else if (a10.b.v(bVar9, sQLiteStatement, 23) == null) {
                    sQLiteStatement.bindNull(24);
                } else {
                    sQLiteStatement.bindText(24, bVar9.getCurrency());
                }
                jo3.b bVar10 = kVar.v;
                if (bVar10 == null) {
                    sQLiteStatement.bindNull(25);
                    sQLiteStatement.bindNull(26);
                } else if (a10.b.v(bVar10, sQLiteStatement, 25) == null) {
                    sQLiteStatement.bindNull(26);
                } else {
                    sQLiteStatement.bindText(26, bVar10.getCurrency());
                }
                jo3.b bVar11 = kVar.f189200w;
                if (bVar11 == null) {
                    sQLiteStatement.bindNull(27);
                    sQLiteStatement.bindNull(28);
                } else if (a10.b.v(bVar11, sQLiteStatement, 27) == null) {
                    sQLiteStatement.bindNull(28);
                } else {
                    sQLiteStatement.bindText(28, bVar11.getCurrency());
                }
                jo3.b bVar12 = kVar.f189201x;
                if (bVar12 == null) {
                    sQLiteStatement.bindNull(29);
                    sQLiteStatement.bindNull(30);
                } else if (a10.b.v(bVar12, sQLiteStatement, 29) == null) {
                    sQLiteStatement.bindNull(30);
                } else {
                    sQLiteStatement.bindText(30, bVar12.getCurrency());
                }
                jo3.b bVar13 = kVar.f189202y;
                if (bVar13 == null) {
                    sQLiteStatement.bindNull(31);
                    sQLiteStatement.bindNull(32);
                } else if (a10.b.v(bVar13, sQLiteStatement, 31) == null) {
                    sQLiteStatement.bindNull(32);
                } else {
                    sQLiteStatement.bindText(32, bVar13.getCurrency());
                }
                jo3.b bVar14 = kVar.z;
                if (bVar14 == null) {
                    sQLiteStatement.bindNull(33);
                    sQLiteStatement.bindNull(34);
                } else if (a10.b.v(bVar14, sQLiteStatement, 33) == null) {
                    sQLiteStatement.bindNull(34);
                } else {
                    sQLiteStatement.bindText(34, bVar14.getCurrency());
                }
                jo3.b bVar15 = kVar.A;
                if (bVar15 == null) {
                    sQLiteStatement.bindNull(35);
                    sQLiteStatement.bindNull(36);
                    return;
                } else if (a10.b.v(bVar15, sQLiteStatement, 35) == null) {
                    sQLiteStatement.bindNull(36);
                    return;
                } else {
                    sQLiteStatement.bindText(36, bVar15.getCurrency());
                    return;
                }
            case 8:
                ks6.q qVar = (ks6.q) obj2;
                is6.c cVar3 = (is6.c) this.f11016b;
                String str57 = qVar.f189236a;
                if (str57 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str57);
                }
                String str58 = qVar.f189237b;
                if (str58 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str58);
                }
                js6.i iVar4 = cVar3.f168125c;
                String strA3 = iVar4.a(qVar.f189238c);
                if (strA3 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, strA3);
                }
                String strA4 = iVar4.a(qVar.d);
                if (strA4 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, strA4);
                }
                String strA5 = iVar4.a(qVar.e);
                if (strA5 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, strA5);
                }
                String str59 = qVar.f189241j;
                if (str59 == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, str59);
                }
                String str60 = qVar.k;
                if (str60 == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindText(7, str60);
                }
                js6.c cVar4 = cVar3.d;
                ks6.n nVar = qVar.f189242l;
                cVar4.getClass();
                String strK9 = null;
                if (nVar != null) {
                    strK6 = GsonHolder.a().k(nVar);
                    Intrinsics.checkNotNullExpressionValue(strK6, "toJson(...)");
                } else {
                    strK6 = null;
                }
                if (strK6 == null) {
                    sQLiteStatement.bindNull(8);
                } else {
                    sQLiteStatement.bindText(8, strK6);
                }
                String str61 = qVar.f189243m;
                if (str61 == null) {
                    sQLiteStatement.bindNull(9);
                } else {
                    sQLiteStatement.bindText(9, str61);
                }
                js6.e eVar2 = cVar3.e;
                List list4 = qVar.f189244n;
                eVar2.getClass();
                String strR4 = list4 != null ? com.revolut.data.database.models.openbanking.d.r("toJson(...)", list4) : null;
                if (strR4 == null) {
                    sQLiteStatement.bindNull(10);
                } else {
                    sQLiteStatement.bindText(10, strR4);
                }
                js6.f fVar3 = cVar3.f;
                List list5 = qVar.o;
                fVar3.getClass();
                String strR5 = list5 != null ? com.revolut.data.database.models.openbanking.d.r("toJson(...)", list5) : null;
                if (strR5 == null) {
                    sQLiteStatement.bindNull(11);
                } else {
                    sQLiteStatement.bindText(11, strR5);
                }
                js6.d dVar2 = cVar3.f168126g;
                ks6.o oVar2 = qVar.f189245p;
                dVar2.getClass();
                if (oVar2 != null) {
                    strK7 = GsonHolder.a().k(oVar2);
                    Intrinsics.checkNotNullExpressionValue(strK7, "toJson(...)");
                } else {
                    strK7 = null;
                }
                if (strK7 == null) {
                    sQLiteStatement.bindNull(12);
                } else {
                    sQLiteStatement.bindText(12, strK7);
                }
                String str62 = qVar.f189246q;
                if (str62 == null) {
                    sQLiteStatement.bindNull(13);
                } else {
                    sQLiteStatement.bindText(13, str62);
                }
                js6.b bVar16 = cVar3.f168127h;
                ks6.l lVar = qVar.f189247r;
                bVar16.getClass();
                if (lVar != null) {
                    strK9 = GsonHolder.a().k(lVar);
                    Intrinsics.checkNotNullExpressionValue(strK9, "toJson(...)");
                }
                if (strK9 == null) {
                    sQLiteStatement.bindNull(14);
                } else {
                    sQLiteStatement.bindText(14, strK9);
                }
                String str63 = qVar.f189248s;
                if (str63 == null) {
                    sQLiteStatement.bindNull(15);
                } else {
                    sQLiteStatement.bindText(15, str63);
                }
                jo3.b bVar17 = qVar.f;
                if (a10.b.v(bVar17, sQLiteStatement, 16) == null) {
                    sQLiteStatement.bindNull(17);
                } else {
                    sQLiteStatement.bindText(17, bVar17.getCurrency());
                }
                jo3.b bVar18 = qVar.f189239g;
                if (a10.b.v(bVar18, sQLiteStatement, 18) == null) {
                    sQLiteStatement.bindNull(19);
                } else {
                    sQLiteStatement.bindText(19, bVar18.getCurrency());
                }
                jo3.b bVar19 = qVar.f189240h;
                if (bVar19 == null) {
                    sQLiteStatement.bindNull(20);
                    sQLiteStatement.bindNull(21);
                } else if (a10.b.v(bVar19, sQLiteStatement, 20) == null) {
                    sQLiteStatement.bindNull(21);
                } else {
                    sQLiteStatement.bindText(21, bVar19.getCurrency());
                }
                jo3.b bVar20 = qVar.i;
                if (bVar20 == null) {
                    sQLiteStatement.bindNull(22);
                    sQLiteStatement.bindNull(23);
                    return;
                } else if (a10.b.v(bVar20, sQLiteStatement, 22) == null) {
                    sQLiteStatement.bindNull(23);
                    return;
                } else {
                    sQLiteStatement.bindText(23, bVar20.getCurrency());
                    return;
                }
            case 9:
                a(sQLiteStatement, obj2);
                return;
            case 10:
                b(sQLiteStatement, obj2);
                return;
            case 11:
                c(sQLiteStatement, obj2);
                return;
            case 12:
                d(sQLiteStatement, obj2);
                return;
            case 13:
                e(sQLiteStatement, obj2);
                return;
            case 14:
                f(sQLiteStatement, obj2);
                return;
            case 15:
                g(sQLiteStatement, obj2);
                return;
            case 16:
                h(sQLiteStatement, obj2);
                return;
            case 17:
                i(sQLiteStatement, obj2);
                return;
            case 18:
                j(sQLiteStatement, obj2);
                return;
            case 19:
                k(sQLiteStatement, obj2);
                return;
            case 20:
                l(sQLiteStatement, obj2);
                return;
            case 21:
                m(sQLiteStatement, obj2);
                return;
            case 22:
                n(sQLiteStatement, obj2);
                return;
            case 23:
                o(sQLiteStatement, obj2);
                return;
            case 24:
                p(sQLiteStatement, obj2);
                return;
            case 25:
                q(sQLiteStatement, obj2);
                return;
            case 26:
                r(sQLiteStatement, obj2);
                return;
            case 27:
                s(sQLiteStatement, obj2);
                return;
            case 28:
                t(sQLiteStatement, obj2);
                return;
            default:
                y8l.h hVar6 = (y8l.h) obj2;
                y8l.o oVar3 = (y8l.o) this.f11016b;
                String str64 = hVar6.f311676a;
                if (str64 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str64);
                }
                String str65 = hVar6.f311677b;
                if (str65 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str65);
                }
                sQLiteStatement.bindText(3, y8l.o.g(oVar3, hVar6.f311678c));
                sQLiteStatement.bindLong(4, hVar6.d);
                String str66 = hVar6.e;
                if (str66 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, str66);
                }
                sQLiteStatement.bindLong(6, hVar6.f);
                String str67 = hVar6.f311679g;
                if (str67 == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindText(7, str67);
                }
                String str68 = hVar6.f311680h;
                if (str68 == null) {
                    sQLiteStatement.bindNull(8);
                } else {
                    sQLiteStatement.bindText(8, str68);
                }
                Long l2 = hVar6.i;
                if (l2 == null) {
                    sQLiteStatement.bindNull(9);
                } else {
                    sQLiteStatement.bindLong(9, l2.longValue());
                }
                String str69 = hVar6.f311681j;
                if (str69 == null) {
                    sQLiteStatement.bindNull(10);
                } else {
                    sQLiteStatement.bindText(10, str69);
                }
                String str70 = hVar6.f311684n;
                if (str70 == null) {
                    sQLiteStatement.bindNull(11);
                } else {
                    sQLiteStatement.bindText(11, str70);
                }
                String str71 = hVar6.o;
                if (str71 == null) {
                    sQLiteStatement.bindNull(12);
                } else {
                    sQLiteStatement.bindText(12, str71);
                }
                y8l.i iVar5 = hVar6.k;
                if (iVar5 != null) {
                    String str72 = iVar5.f311687a;
                    if (str72 == null) {
                        sQLiteStatement.bindNull(13);
                    } else {
                        sQLiteStatement.bindText(13, str72);
                    }
                    sQLiteStatement.bindText(14, y8l.o.h(oVar3, iVar5.f311688b));
                    String str73 = iVar5.f311689c;
                    if (str73 == null) {
                        sQLiteStatement.bindNull(15);
                    } else {
                        sQLiteStatement.bindText(15, str73);
                    }
                    String str74 = iVar5.d;
                    if (str74 == null) {
                        sQLiteStatement.bindNull(16);
                    } else {
                        sQLiteStatement.bindText(16, str74);
                    }
                    String str75 = iVar5.e;
                    if (str75 == null) {
                        sQLiteStatement.bindNull(17);
                    } else {
                        sQLiteStatement.bindText(17, str75);
                    }
                    String str76 = iVar5.f;
                    if (str76 == null) {
                        sQLiteStatement.bindNull(18);
                    } else {
                        sQLiteStatement.bindText(18, str76);
                    }
                    String str77 = iVar5.f311690g;
                    if (str77 == null) {
                        sQLiteStatement.bindNull(19);
                    } else {
                        sQLiteStatement.bindText(19, str77);
                    }
                    String str78 = iVar5.f311691h;
                    if (str78 == null) {
                        sQLiteStatement.bindNull(20);
                    } else {
                        sQLiteStatement.bindText(20, str78);
                    }
                    String str79 = iVar5.i;
                    if (str79 == null) {
                        sQLiteStatement.bindNull(21);
                    } else {
                        sQLiteStatement.bindText(21, str79);
                    }
                    String str80 = iVar5.f311692j;
                    if (str80 == null) {
                        sQLiteStatement.bindNull(22);
                    } else {
                        sQLiteStatement.bindText(22, str80);
                    }
                    String str81 = iVar5.k;
                    if (str81 == null) {
                        sQLiteStatement.bindNull(23);
                    } else {
                        sQLiteStatement.bindText(23, str81);
                    }
                    String str82 = iVar5.f311693l;
                    if (str82 == null) {
                        sQLiteStatement.bindNull(24);
                    } else {
                        sQLiteStatement.bindText(24, str82);
                    }
                    String str83 = iVar5.f311694m;
                    if (str83 == null) {
                        sQLiteStatement.bindNull(25);
                    } else {
                        sQLiteStatement.bindText(25, str83);
                    }
                    String str84 = iVar5.f311695n;
                    if (str84 == null) {
                        sQLiteStatement.bindNull(26);
                    } else {
                        sQLiteStatement.bindText(26, str84);
                    }
                    String str85 = iVar5.o;
                    if (str85 == null) {
                        sQLiteStatement.bindNull(27);
                    } else {
                        sQLiteStatement.bindText(27, str85);
                    }
                    String str86 = iVar5.f311696p;
                    if (str86 == null) {
                        sQLiteStatement.bindNull(28);
                    } else {
                        sQLiteStatement.bindText(28, str86);
                    }
                } else {
                    prk.o.z(sQLiteStatement, 13, 14, 15, 16);
                    prk.o.z(sQLiteStatement, 17, 18, 19, 20);
                    prk.o.z(sQLiteStatement, 21, 22, 23, 24);
                    prk.o.z(sQLiteStatement, 25, 26, 27, 28);
                }
                y8l.i iVar6 = hVar6.f311682l;
                String str87 = iVar6.f311687a;
                if (str87 == null) {
                    sQLiteStatement.bindNull(29);
                } else {
                    sQLiteStatement.bindText(29, str87);
                }
                sQLiteStatement.bindText(30, y8l.o.h(oVar3, iVar6.f311688b));
                String str88 = iVar6.f311689c;
                if (str88 == null) {
                    sQLiteStatement.bindNull(31);
                } else {
                    sQLiteStatement.bindText(31, str88);
                }
                String str89 = iVar6.d;
                if (str89 == null) {
                    sQLiteStatement.bindNull(32);
                } else {
                    sQLiteStatement.bindText(32, str89);
                }
                String str90 = iVar6.e;
                if (str90 == null) {
                    sQLiteStatement.bindNull(33);
                } else {
                    sQLiteStatement.bindText(33, str90);
                }
                String str91 = iVar6.f;
                if (str91 == null) {
                    sQLiteStatement.bindNull(34);
                } else {
                    sQLiteStatement.bindText(34, str91);
                }
                String str92 = iVar6.f311690g;
                if (str92 == null) {
                    sQLiteStatement.bindNull(35);
                } else {
                    sQLiteStatement.bindText(35, str92);
                }
                String str93 = iVar6.f311691h;
                if (str93 == null) {
                    sQLiteStatement.bindNull(36);
                } else {
                    sQLiteStatement.bindText(36, str93);
                }
                String str94 = iVar6.i;
                if (str94 == null) {
                    sQLiteStatement.bindNull(37);
                } else {
                    sQLiteStatement.bindText(37, str94);
                }
                String str95 = iVar6.f311692j;
                if (str95 == null) {
                    sQLiteStatement.bindNull(38);
                } else {
                    sQLiteStatement.bindText(38, str95);
                }
                String str96 = iVar6.k;
                if (str96 == null) {
                    sQLiteStatement.bindNull(39);
                } else {
                    sQLiteStatement.bindText(39, str96);
                }
                String str97 = iVar6.f311693l;
                if (str97 == null) {
                    sQLiteStatement.bindNull(40);
                } else {
                    sQLiteStatement.bindText(40, str97);
                }
                String str98 = iVar6.f311694m;
                if (str98 == null) {
                    sQLiteStatement.bindNull(41);
                } else {
                    sQLiteStatement.bindText(41, str98);
                }
                String str99 = iVar6.f311695n;
                if (str99 == null) {
                    sQLiteStatement.bindNull(42);
                } else {
                    sQLiteStatement.bindText(42, str99);
                }
                String str100 = iVar6.o;
                if (str100 == null) {
                    sQLiteStatement.bindNull(43);
                } else {
                    sQLiteStatement.bindText(43, str100);
                }
                String str101 = iVar6.f311696p;
                if (str101 == null) {
                    sQLiteStatement.bindNull(44);
                } else {
                    sQLiteStatement.bindText(44, str101);
                }
                y8l.i iVar7 = hVar6.f311683m;
                if (iVar7 != null) {
                    String str102 = iVar7.f311687a;
                    if (str102 == null) {
                        sQLiteStatement.bindNull(45);
                    } else {
                        sQLiteStatement.bindText(45, str102);
                    }
                    sQLiteStatement.bindText(46, y8l.o.h(oVar3, iVar7.f311688b));
                    String str103 = iVar7.f311689c;
                    if (str103 == null) {
                        sQLiteStatement.bindNull(47);
                    } else {
                        sQLiteStatement.bindText(47, str103);
                    }
                    String str104 = iVar7.d;
                    if (str104 == null) {
                        sQLiteStatement.bindNull(48);
                    } else {
                        sQLiteStatement.bindText(48, str104);
                    }
                    String str105 = iVar7.e;
                    if (str105 == null) {
                        sQLiteStatement.bindNull(49);
                    } else {
                        sQLiteStatement.bindText(49, str105);
                    }
                    String str106 = iVar7.f;
                    if (str106 == null) {
                        sQLiteStatement.bindNull(50);
                    } else {
                        sQLiteStatement.bindText(50, str106);
                    }
                    String str107 = iVar7.f311690g;
                    if (str107 == null) {
                        sQLiteStatement.bindNull(51);
                    } else {
                        sQLiteStatement.bindText(51, str107);
                    }
                    String str108 = iVar7.f311691h;
                    if (str108 == null) {
                        sQLiteStatement.bindNull(52);
                    } else {
                        sQLiteStatement.bindText(52, str108);
                    }
                    String str109 = iVar7.i;
                    if (str109 == null) {
                        sQLiteStatement.bindNull(53);
                    } else {
                        sQLiteStatement.bindText(53, str109);
                    }
                    String str110 = iVar7.f311692j;
                    if (str110 == null) {
                        sQLiteStatement.bindNull(54);
                    } else {
                        sQLiteStatement.bindText(54, str110);
                    }
                    String str111 = iVar7.k;
                    if (str111 == null) {
                        sQLiteStatement.bindNull(55);
                    } else {
                        sQLiteStatement.bindText(55, str111);
                    }
                    String str112 = iVar7.f311693l;
                    if (str112 == null) {
                        sQLiteStatement.bindNull(56);
                    } else {
                        sQLiteStatement.bindText(56, str112);
                    }
                    String str113 = iVar7.f311694m;
                    if (str113 == null) {
                        sQLiteStatement.bindNull(57);
                    } else {
                        sQLiteStatement.bindText(57, str113);
                    }
                    String str114 = iVar7.f311695n;
                    if (str114 == null) {
                        sQLiteStatement.bindNull(58);
                    } else {
                        sQLiteStatement.bindText(58, str114);
                    }
                    String str115 = iVar7.o;
                    if (str115 == null) {
                        sQLiteStatement.bindNull(59);
                    } else {
                        sQLiteStatement.bindText(59, str115);
                    }
                    String str116 = iVar7.f311696p;
                    if (str116 == null) {
                        sQLiteStatement.bindNull(60);
                    } else {
                        sQLiteStatement.bindText(60, str116);
                    }
                } else {
                    prk.o.z(sQLiteStatement, 45, 46, 47, 48);
                    prk.o.z(sQLiteStatement, 49, 50, 51, 52);
                    prk.o.z(sQLiteStatement, 53, 54, 55, 56);
                    prk.o.z(sQLiteStatement, 57, 58, 59, 60);
                }
                y8l.k kVar2 = hVar6.f311685p;
                if (kVar2 != null) {
                    sQLiteStatement.bindLong(61, kVar2.f311697a ? 1L : 0L);
                    sQLiteStatement.bindLong(62, kVar2.f311698b ? 1L : 0L);
                } else {
                    sQLiteStatement.bindNull(61);
                    sQLiteStatement.bindNull(62);
                }
                y8l.a aVar5 = hVar6.f311686q;
                if (aVar5 == null) {
                    sQLiteStatement.bindNull(63);
                    sQLiteStatement.bindNull(64);
                    return;
                }
                String str117 = aVar5.f311673a;
                if (str117 == null) {
                    sQLiteStatement.bindNull(63);
                } else {
                    sQLiteStatement.bindText(63, str117);
                }
                String str118 = aVar5.f311674b;
                if (str118 == null) {
                    sQLiteStatement.bindNull(64);
                    return;
                } else {
                    sQLiteStatement.bindText(64, str118);
                    return;
                }
        }
    }

    @Override // androidx.room.EntityInsertAdapter
    public final String createQuery() {
        switch (this.f11015a) {
            case 0:
                return "INSERT OR REPLACE INTO `pix_contacts` (`id`,`idValue`,`descriptor`,`descriptorValue`,`contactName`,`alias`,`photoUri`,`state`,`aliasResolutionId`,`issuingEntityName`,`identificationType`,`identificationValue`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `qvik_contacts` (`id`,`idValue`,`descriptor`,`descriptorValue`,`contactName`,`alias`,`photoUri`,`state`,`isRequestEnabled`,`settings_blockIncomingMoneyRequests`) VALUES (?,?,?,?,?,?,?,?,?,?)";
            case 2:
                return "INSERT OR REPLACE INTO `apm_multibanco_withdrawal_code` (`id`,`state`,`code`,`ownerId`,`revolutCardId`,`createdDate`,`updatedDate`,`expirationDate`,`transactionId`,`amount_amount`,`amount_currency`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            case 3:
                return "INSERT OR REPLACE INTO `spin_contacts` (`id`,`idValue`,`descriptor`,`descriptorValue`,`contactName`,`alias`,`photoUri`,`state`) VALUES (?,?,?,?,?,?,?,?)";
            case 4:
                return "INSERT OR REPLACE INTO `wero_contacts` (`id`,`idValue`,`descriptor`,`descriptorValue`,`contactName`,`alias`,`photoUri`,`state`,`isRequestEnabled`) VALUES (?,?,?,?,?,?,?,?,?)";
            case 5:
                return "INSERT OR REPLACE INTO `payments_message_reactions` (`parentMessageId`,`relatedEntityId`,`relatedEntityType`,`chatId`,`isGroup`,`reactions`) VALUES (?,?,?,?,?,?)";
            case 6:
                return "INSERT OR REPLACE INTO `defi_accounts` (`id`,`name`,`balances`) VALUES (?,?,?)";
            case 7:
                return "INSERT OR REPLACE INTO `acquiring_orders` (`id`,`created_at`,`updated_at`,`status`,`channel`,`capture_mode`,`merchant_order_external_reference`,`description`,`readable_identifier`,`customer_note`,`custom_fields`,`customers`,`primary_payment`,`location`,`created_by_user`,`initiation_page`,`device`,`invoice`,`amount_amount`,`amount_currency`,`tip_amount_amount`,`tip_amount_currency`,`outstanding_amount_amount`,`outstanding_amount_currency`,`discount_total_amount_amount`,`discount_total_amount_currency`,`sub_total_amount_amount`,`sub_total_amount_currency`,`tax_total_amount_amount`,`tax_total_amount_currency`,`service_charge_amount_amount`,`service_charge_amount_currency`,`surcharge_amount_amount`,`surcharge_amount_currency`,`surcharge_tax_amount_amount`,`surcharge_tax_amount_currency`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 8:
                return "INSERT OR REPLACE INTO `acquiring_payments` (`id`,`state`,`created_at`,`updated_at`,`settle_on`,`type`,`payment_method`,`card`,`sepa_last_four`,`fees`,`rolling_reserves`,`customer`,`order_id`,`billing_address`,`acquiring_reference_number`,`amount_amount`,`amount_currency`,`tip_amount_amount`,`tip_amount_currency`,`surcharge_amount_amount`,`surcharge_amount_currency`,`net_amount_amount`,`net_amount_currency`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 9:
                return "INSERT OR REPLACE INTO `charity_campaigns` (`charityId`,`id`,`type`,`cardDesignCode`,`cardDesignUrl`,`status`,`minDonationsToUnlock`) VALUES (?,?,?,?,?,?,?)";
            case 10:
                return "INSERT OR REPLACE INTO `staking_pockets` (`id`,`productId`,`stakingBalance`,`fiatBalance`,`unstakingLockedBalance`) VALUES (?,?,?,?,?)";
            case 11:
                return "INSERT OR REPLACE INTO `trade_rev_points_accounts` (`id`,`product`,`externalId`,`primaryAgents`,`loyaltyProgramme_id`,`loyaltyProgramme_name`,`loyaltyProgramme_logoUrl`,`loyaltyProgramme_product`) VALUES (?,?,?,?,?,?,?,?)";
            case 12:
                return "INSERT OR REPLACE INTO `trade_rev_points_agents` (`id`,`product`,`name`,`programmeName`,`programmeDescription`,`subtitle`,`description`,`logoUrl`,`learnMoreUrl`,`additionalInfoUrl`,`suggested`,`backgroundUrl`,`loyaltyProgramme`,`redeemTypes`,`websiteUrl`,`voucherProductGroupId`,`redeemOptions`,`extraRedeemOptions`,`additionalDetails`,`limit`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 13:
                return "INSERT OR REPLACE INTO `tax_hub_calendar_event` (`id`,`tax_type`,`state`,`period`,`accounting_start_date`,`accounting_end_date`,`completed_date`,`filing_start_date`,`filing_end_date`,`steps`) VALUES (?,?,?,?,?,?,?,?,?,?)";
            case 14:
                return "INSERT OR REPLACE INTO `tax_hub_tax_profile` (`id`,`tax_type`,`notifications_enabled`,`state`,`scheduling_options_period`,`scheduling_options_next_payment_date`,`scheduling_options_closing_month`) VALUES (?,?,?,?,?,?,?)";
            case 15:
                return "INSERT OR REPLACE INTO `vat_summary` (`vat_reminder_id`,`assessment_period`,`next_vat_return_due_date`,`summary_total_sales_amount`,`summary_total_sales_currency`,`summary_tax_rate_type`,`summary_tax_rate_value`,`summary_total_tax_amount`,`summary_total_tax_currency`) VALUES (?,?,?,?,?,?,?,?,?)";
            case 16:
                return "INSERT OR REPLACE INTO `junior_transfer_request` (`id`,`amount`,`currency`,`transactionId`,`transactionWalletId`,`transactionPocketId`,`state`,`createdDate`,`comment`,`gifUrl`,`sender`,`recipient`,`reason_code`,`reason_limit_amount`,`reason_limit_currency`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 17:
                return "INSERT OR REPLACE INTO `custom_assets` (`id`,`category`,`attributes`,`value_history`,`next_estimation_date`,`created_at`,`updated_at`,`state`,`value_source`,`smart_estimation_enabled`,`smart_estimation_rejected`,`currentValue_amount`,`currentValue_currency`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 18:
                return "INSERT OR REPLACE INTO `field_definitions` (`category`,`name`,`type`,`component`,`required`,`options`,`max_length`,`required_for`,`supports_smart_estimation`) VALUES (?,?,?,?,?,?,?,?,?)";
            case 19:
                return "INSERT OR REPLACE INTO `trips` (`id`,`startDate`,`endDate`,`countryCode`,`transactionAdjustments`,`createdDate`,`deleted`) VALUES (?,?,?,?,?,?,?)";
            case 20:
                return "INSERT OR REPLACE INTO `budget_history_snapshot` (`walletId`,`effectiveFrom`,`effectiveTo`,`currency`,`overallAmount`,`categories`,`cycle_type`,`cycle_weekDay`,`cycle_startDay`,`cycle_behaviour`) VALUES (?,?,?,?,?,?,?,?,?,?)";
            case 21:
                return "INSERT OR REPLACE INTO `aani_contacts` (`id`,`idValue`,`descriptor`,`descriptorValue`,`contactName`,`alias`,`photoUri`,`state`,`isRequestEnabled`) VALUES (?,?,?,?,?,?,?,?,?)";
            case 22:
                return "INSERT OR REPLACE INTO `user_info_account` (`id`,`displayTitle`,`displaySubtitle`,`profileType`,`email_value`,`email_verified`,`email_unmaskedValue`,`phone_value`,`phone_verified`,`phone_unmaskedValue`,`address_streetAddress`,`address_postalCode`,`address_country`,`address_locality`,`address_region`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 23:
                return "INSERT OR REPLACE INTO `bizum_contacts` (`id`,`idValue`,`descriptor`,`descriptorValue`,`contactName`,`alias`,`photoUri`,`state`) VALUES (?,?,?,?,?,?,?,?)";
            case 24:
                return "INSERT OR REPLACE INTO `blik_contacts_temp` (`id`,`idValue`,`descriptor`,`descriptorValue`,`contactName`,`alias`,`photoUri`,`state`) VALUES (?,?,?,?,?,?,?,?)";
            case 25:
                return "INSERT OR REPLACE INTO `breb_contacts` (`id`,`idValue`,`descriptor`,`descriptorValue`,`contactName`,`alias`,`photoUri`,`state`,`issuingEntityName`) VALUES (?,?,?,?,?,?,?,?,?)";
            case 26:
                return "INSERT OR REPLACE INTO `income_sorter_executions` (`id`,`incomeSorterId`,`state`,`sourceTransactionId`,`updatedDate`,`destinations`,`remainderDestination`) VALUES (?,?,?,?,?,?,?)";
            case 27:
                return "INSERT OR REPLACE INTO `income_sorters` (`id`,`walletId`,`baseTransactionId`,`state`,`type`,`createdDate`,`updatedDate`,`destinations`,`sortMethod`,`remainingBalanceDestinationId`) VALUES (?,?,?,?,?,?,?,?,?,?)";
            case 28:
                return "INSERT OR REPLACE INTO `iris_contacts` (`id`,`idValue`,`descriptor`,`descriptorValue`,`contactName`,`alias`,`photoUri`,`state`,`identityType`) VALUES (?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR REPLACE INTO `money_requests` (`id`,`state`,`channel`,`amount`,`currency`,`update_date`,`comment`,`gif_url`,`expiry_date`,`receive_url`,`split_bill_id`,`registered_identity_id`,`payer_id`,`payer_type`,`payer_code`,`payer_username`,`payer_legal_name`,`payer_first_name`,`payer_last_name`,`payer_country`,`payer_phone`,`payer_email`,`payer_name`,`payer_app_mode`,`payer_pda_recipient_country`,`payer_contact_name`,`payer_alias`,`payer_customer_type`,`creator_id`,`creator_type`,`creator_code`,`creator_username`,`creator_legal_name`,`creator_first_name`,`creator_last_name`,`creator_country`,`creator_phone`,`creator_email`,`creator_name`,`creator_app_mode`,`creator_pda_recipient_country`,`creator_contact_name`,`creator_alias`,`creator_customer_type`,`requester_id`,`requester_type`,`requester_code`,`requester_username`,`requester_legal_name`,`requester_first_name`,`requester_last_name`,`requester_country`,`requester_phone`,`requester_email`,`requester_name`,`requester_app_mode`,`requester_pda_recipient_country`,`requester_contact_name`,`requester_alias`,`requester_customer_type`,`settings_editableAmount`,`settings_editableReference`,`attributes_invoice_url`,`attributes_invoice_number`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }
}
