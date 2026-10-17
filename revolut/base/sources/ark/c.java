package ark;

import androidx.room.EntityInsertAdapter;
import androidx.sqlite.SQLiteStatement;
import com.revolut.data.utils.gson.GsonHolder;
import ehl.e;
import ehl.f;
import ehl.i;
import ehl.k;
import ehl.m;
import ehl.n;
import ehl.p;
import ehl.r;
import ehl.s;
import ehl.t;
import ehl.u;
import ehl.x;
import hcl.b1;
import hcl.h1;
import hcl.i0;
import hcl.j0;
import hcl.k0;
import hcl.l1;
import hcl.m0;
import hcl.m1;
import hcl.o0;
import hcl.q0;
import hcl.r0;
import hcl.s0;
import hcl.t1;
import hcl.v;
import hcl.v0;
import hcl.w;
import hcl.x1;
import hcl.x2;
import hcl.y;
import hcl.y1;
import hcl.z;
import iel.j;
import iel.l;
import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.List;
import jcl.g;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import pcl.h;
import pcl.q;
import prk.o;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends EntityInsertAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8730a;

    public /* synthetic */ c(int i) {
        this.f8730a = i;
    }

    private final void a(SQLiteStatement sQLiteStatement, Object obj2) {
        x xVar = (x) obj2;
        String str = xVar.f126302a;
        if (str == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, str);
        }
        j jVar = xVar.f126303b;
        String id10 = jVar != null ? jVar.getId() : null;
        if (id10 == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindText(2, id10);
        }
        String strE = fhl.a.e(xVar.f126304c);
        if (strE == null) {
            sQLiteStatement.bindNull(3);
        } else {
            sQLiteStatement.bindText(3, strE);
        }
        n nVar = xVar.d;
        if (nVar != null) {
            l lVar = nVar.f126268a;
            String id11 = lVar != null ? lVar.getId() : null;
            if (id11 == null) {
                sQLiteStatement.bindNull(4);
            } else {
                sQLiteStatement.bindText(4, id11);
            }
            String str2 = nVar.f126269b;
            if (str2 == null) {
                sQLiteStatement.bindNull(5);
            } else {
                sQLiteStatement.bindText(5, str2);
            }
            sQLiteStatement.bindLong(6, nVar.f126270c ? 1L : 0L);
            Long lA = fhl.a.a(nVar.d);
            if (lA == null) {
                sQLiteStatement.bindNull(7);
            } else {
                sQLiteStatement.bindLong(7, lA.longValue());
            }
            Long lA2 = fhl.a.a(nVar.e);
            if (lA2 == null) {
                sQLiteStatement.bindNull(8);
            } else {
                sQLiteStatement.bindLong(8, lA2.longValue());
            }
        } else {
            o.z(sQLiteStatement, 4, 5, 6, 7);
            sQLiteStatement.bindNull(8);
        }
        e eVar = xVar.e;
        if (eVar != null) {
            String str3 = eVar.f126242a;
            if (str3 == null) {
                sQLiteStatement.bindNull(9);
            } else {
                sQLiteStatement.bindText(9, str3);
            }
            String str4 = eVar.f126243b;
            if (str4 == null) {
                sQLiteStatement.bindNull(10);
            } else {
                sQLiteStatement.bindText(10, str4);
            }
            String strE2 = fhl.a.e(eVar.f126244c);
            if (strE2 == null) {
                sQLiteStatement.bindNull(11);
            } else {
                sQLiteStatement.bindText(11, strE2);
            }
            String strG = fhl.a.g(eVar.d);
            if (strG == null) {
                sQLiteStatement.bindNull(12);
            } else {
                sQLiteStatement.bindText(12, strG);
            }
        } else {
            o.z(sQLiteStatement, 9, 10, 11, 12);
        }
        s sVar = xVar.f;
        if (sVar != null) {
            String str5 = sVar.f126283a;
            if (str5 == null) {
                sQLiteStatement.bindNull(13);
            } else {
                sQLiteStatement.bindText(13, str5);
            }
            String str6 = sVar.f126284b;
            if (str6 == null) {
                sQLiteStatement.bindNull(14);
            } else {
                sQLiteStatement.bindText(14, str6);
            }
            String strE3 = fhl.a.e(sVar.f126285c);
            if (strE3 == null) {
                sQLiteStatement.bindNull(15);
            } else {
                sQLiteStatement.bindText(15, strE3);
            }
            sQLiteStatement.bindDouble(16, sVar.d);
        } else {
            o.z(sQLiteStatement, 13, 14, 15, 16);
        }
        m mVar = xVar.f126305g;
        if (mVar != null) {
            String str7 = mVar.f126265a;
            if (str7 == null) {
                sQLiteStatement.bindNull(17);
            } else {
                sQLiteStatement.bindText(17, str7);
            }
            String str8 = mVar.f126266b;
            if (str8 == null) {
                sQLiteStatement.bindNull(18);
            } else {
                sQLiteStatement.bindText(18, str8);
            }
            iel.n nVar2 = mVar.f126267c;
            String id12 = nVar2 != null ? nVar2.getId() : null;
            if (id12 == null) {
                sQLiteStatement.bindNull(19);
            } else {
                sQLiteStatement.bindText(19, id12);
            }
        } else {
            o.y(sQLiteStatement, 17, 18, 19);
        }
        u uVar = xVar.f126306h;
        if (uVar != null) {
            String str9 = uVar.f126289a;
            if (str9 == null) {
                sQLiteStatement.bindNull(20);
            } else {
                sQLiteStatement.bindText(20, str9);
            }
            String str10 = uVar.f126290b;
            if (str10 == null) {
                sQLiteStatement.bindNull(21);
            } else {
                sQLiteStatement.bindText(21, str10);
            }
            String str11 = uVar.f126291c;
            if (str11 == null) {
                sQLiteStatement.bindNull(22);
            } else {
                sQLiteStatement.bindText(22, str11);
            }
            String str12 = uVar.d;
            if (str12 == null) {
                sQLiteStatement.bindNull(23);
            } else {
                sQLiteStatement.bindText(23, str12);
            }
        } else {
            o.z(sQLiteStatement, 20, 21, 22, 23);
        }
        t tVar = xVar.i;
        if (tVar != null) {
            String str13 = tVar.f126286a;
            if (str13 == null) {
                sQLiteStatement.bindNull(24);
            } else {
                sQLiteStatement.bindText(24, str13);
            }
            String str14 = tVar.f126287b;
            if (str14 == null) {
                sQLiteStatement.bindNull(25);
            } else {
                sQLiteStatement.bindText(25, str14);
            }
            String strE4 = fhl.a.e(tVar.f126288c);
            if (strE4 == null) {
                sQLiteStatement.bindNull(26);
            } else {
                sQLiteStatement.bindText(26, strE4);
            }
            String strE5 = fhl.a.e(tVar.d);
            if (strE5 == null) {
                sQLiteStatement.bindNull(27);
            } else {
                sQLiteStatement.bindText(27, strE5);
            }
            sQLiteStatement.bindLong(28, tVar.e);
            sQLiteStatement.bindLong(29, tVar.f);
        } else {
            o.z(sQLiteStatement, 24, 25, 26, 27);
            sQLiteStatement.bindNull(28);
            sQLiteStatement.bindNull(29);
        }
        ehl.j jVar2 = xVar.f126307j;
        if (jVar2 != null) {
            String str15 = jVar2.f126255a;
            if (str15 == null) {
                sQLiteStatement.bindNull(30);
            } else {
                sQLiteStatement.bindText(30, str15);
            }
            String str16 = jVar2.f126256b;
            if (str16 == null) {
                sQLiteStatement.bindNull(31);
            } else {
                sQLiteStatement.bindText(31, str16);
            }
            Long lA3 = fhl.a.a(jVar2.f126257c);
            if (lA3 == null) {
                sQLiteStatement.bindNull(32);
            } else {
                sQLiteStatement.bindLong(32, lA3.longValue());
            }
            Long lA4 = fhl.a.a(jVar2.d);
            if (lA4 == null) {
                sQLiteStatement.bindNull(33);
            } else {
                sQLiteStatement.bindLong(33, lA4.longValue());
            }
            String str17 = jVar2.e;
            if (str17 == null) {
                sQLiteStatement.bindNull(34);
            } else {
                sQLiteStatement.bindText(34, str17);
            }
            String str18 = jVar2.f;
            if (str18 == null) {
                sQLiteStatement.bindNull(35);
            } else {
                sQLiteStatement.bindText(35, str18);
            }
            String str19 = jVar2.f126258g;
            if (str19 == null) {
                sQLiteStatement.bindNull(36);
            } else {
                sQLiteStatement.bindText(36, str19);
            }
        } else {
            o.z(sQLiteStatement, 30, 31, 32, 33);
            o.y(sQLiteStatement, 34, 35, 36);
        }
        k kVar = xVar.k;
        if (kVar != null) {
            String str20 = kVar.f126259a;
            if (str20 == null) {
                sQLiteStatement.bindNull(37);
            } else {
                sQLiteStatement.bindText(37, str20);
            }
            String str21 = kVar.f126260b;
            if (str21 == null) {
                sQLiteStatement.bindNull(38);
            } else {
                sQLiteStatement.bindText(38, str21);
            }
            String strE6 = fhl.a.e(kVar.f126261c);
            if (strE6 == null) {
                sQLiteStatement.bindNull(39);
            } else {
                sQLiteStatement.bindText(39, strE6);
            }
            String strG2 = fhl.a.g(kVar.d);
            if (strG2 == null) {
                sQLiteStatement.bindNull(40);
            } else {
                sQLiteStatement.bindText(40, strG2);
            }
        } else {
            o.z(sQLiteStatement, 37, 38, 39, 40);
        }
        p pVar = xVar.f126308l;
        if (pVar != null) {
            String str22 = pVar.f126274a;
            if (str22 == null) {
                sQLiteStatement.bindNull(41);
            } else {
                sQLiteStatement.bindText(41, str22);
            }
            String str23 = pVar.f126275b;
            if (str23 == null) {
                sQLiteStatement.bindNull(42);
            } else {
                sQLiteStatement.bindText(42, str23);
            }
            String strA = fhl.b.a(pVar.f126276c);
            if (strA == null) {
                sQLiteStatement.bindNull(43);
            } else {
                sQLiteStatement.bindText(43, strA);
            }
        } else {
            o.y(sQLiteStatement, 41, 42, 43);
        }
        r rVar = xVar.f126309m;
        if (rVar != null) {
            String str24 = rVar.f126280a;
            if (str24 == null) {
                sQLiteStatement.bindNull(44);
            } else {
                sQLiteStatement.bindText(44, str24);
            }
            String str25 = rVar.f126281b;
            if (str25 == null) {
                sQLiteStatement.bindNull(45);
            } else {
                sQLiteStatement.bindText(45, str25);
            }
            String strA2 = fhl.b.a(rVar.f126282c);
            if (strA2 == null) {
                sQLiteStatement.bindNull(46);
            } else {
                sQLiteStatement.bindText(46, strA2);
            }
        } else {
            o.y(sQLiteStatement, 44, 45, 46);
        }
        ehl.a aVar = xVar.f126310n;
        if (aVar != null) {
            String str26 = aVar.f126222a;
            if (str26 == null) {
                sQLiteStatement.bindNull(47);
            } else {
                sQLiteStatement.bindText(47, str26);
            }
            String str27 = aVar.f126223b;
            if (str27 == null) {
                sQLiteStatement.bindNull(48);
            } else {
                sQLiteStatement.bindText(48, str27);
            }
        } else {
            sQLiteStatement.bindNull(47);
            sQLiteStatement.bindNull(48);
        }
        ehl.b bVar = xVar.o;
        if (bVar != null) {
            String str28 = bVar.f126224a;
            if (str28 == null) {
                sQLiteStatement.bindNull(49);
            } else {
                sQLiteStatement.bindText(49, str28);
            }
            String str29 = bVar.f126225b;
            if (str29 == null) {
                sQLiteStatement.bindNull(50);
            } else {
                sQLiteStatement.bindText(50, str29);
            }
            String strE7 = fhl.a.e(bVar.f126226c);
            if (strE7 == null) {
                sQLiteStatement.bindNull(51);
            } else {
                sQLiteStatement.bindText(51, strE7);
            }
            String strB = fhl.a.b(bVar.d);
            if (strB == null) {
                sQLiteStatement.bindNull(52);
            } else {
                sQLiteStatement.bindText(52, strB);
            }
        } else {
            o.z(sQLiteStatement, 49, 50, 51, 52);
        }
        ehl.l lVar2 = xVar.f126311p;
        if (lVar2 != null) {
            String str30 = lVar2.f126262a;
            if (str30 == null) {
                sQLiteStatement.bindNull(53);
            } else {
                sQLiteStatement.bindText(53, str30);
            }
            String str31 = lVar2.f126263b;
            if (str31 == null) {
                sQLiteStatement.bindNull(54);
            } else {
                sQLiteStatement.bindText(54, str31);
            }
            String strE8 = fhl.a.e(lVar2.f126264c);
            if (strE8 == null) {
                sQLiteStatement.bindNull(55);
            } else {
                sQLiteStatement.bindText(55, strE8);
            }
            String strE9 = fhl.a.e(lVar2.d);
            if (strE9 == null) {
                sQLiteStatement.bindNull(56);
            } else {
                sQLiteStatement.bindText(56, strE9);
            }
            String strB2 = fhl.a.b(lVar2.e);
            if (strB2 == null) {
                sQLiteStatement.bindNull(57);
            } else {
                sQLiteStatement.bindText(57, strB2);
            }
            sQLiteStatement.bindLong(58, lVar2.f ? 1L : 0L);
        } else {
            o.z(sQLiteStatement, 53, 54, 55, 56);
            sQLiteStatement.bindNull(57);
            sQLiteStatement.bindNull(58);
        }
        i iVar = xVar.f126312q;
        if (iVar != null) {
            String str32 = iVar.f126252a;
            if (str32 == null) {
                sQLiteStatement.bindNull(59);
            } else {
                sQLiteStatement.bindText(59, str32);
            }
            String str33 = iVar.f126253b;
            if (str33 == null) {
                sQLiteStatement.bindNull(60);
            } else {
                sQLiteStatement.bindText(60, str33);
            }
            String strE10 = fhl.a.e(iVar.f126254c);
            if (strE10 == null) {
                sQLiteStatement.bindNull(61);
            } else {
                sQLiteStatement.bindText(61, strE10);
            }
            String strE11 = fhl.a.e(iVar.d);
            if (strE11 == null) {
                sQLiteStatement.bindNull(62);
            } else {
                sQLiteStatement.bindText(62, strE11);
            }
            String strB3 = fhl.a.b(iVar.e);
            if (strB3 == null) {
                sQLiteStatement.bindNull(63);
            } else {
                sQLiteStatement.bindText(63, strB3);
            }
            sQLiteStatement.bindLong(64, iVar.f ? 1L : 0L);
        } else {
            o.z(sQLiteStatement, 59, 60, 61, 62);
            sQLiteStatement.bindNull(63);
            sQLiteStatement.bindNull(64);
        }
        ehl.o oVar = xVar.f126313r;
        if (oVar == null) {
            o.z(sQLiteStatement, 65, 66, 67, 68);
            sQLiteStatement.bindNull(69);
            sQLiteStatement.bindNull(70);
            return;
        }
        String str34 = oVar.f126271a;
        if (str34 == null) {
            sQLiteStatement.bindNull(65);
        } else {
            sQLiteStatement.bindText(65, str34);
        }
        String str35 = oVar.f126272b;
        if (str35 == null) {
            sQLiteStatement.bindNull(66);
        } else {
            sQLiteStatement.bindText(66, str35);
        }
        String strE12 = fhl.a.e(oVar.f126273c);
        if (strE12 == null) {
            sQLiteStatement.bindNull(67);
        } else {
            sQLiteStatement.bindText(67, strE12);
        }
        String strE13 = fhl.a.e(oVar.d);
        if (strE13 == null) {
            sQLiteStatement.bindNull(68);
        } else {
            sQLiteStatement.bindText(68, strE13);
        }
        String strB4 = fhl.a.b(oVar.e);
        if (strB4 == null) {
            sQLiteStatement.bindNull(69);
        } else {
            sQLiteStatement.bindText(69, strB4);
        }
        sQLiteStatement.bindLong(70, oVar.f ? 1L : 0L);
    }

    private final void b(SQLiteStatement sQLiteStatement, Object obj2) {
        String strK;
        String strK2;
        String strK3;
        String strK4;
        String strK5;
        String strK6;
        pcl.o oVar = (pcl.o) obj2;
        String str = oVar.f234969a;
        if (str == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, str);
        }
        pcl.m mVar = oVar.f234970b;
        String strK7 = null;
        if (mVar != null) {
            strK = zbl.a.a().k(mVar);
            Intrinsics.checkNotNullExpressionValue(strK, "toJson(...)");
        } else {
            strK = null;
        }
        if (strK == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindText(2, strK);
        }
        pcl.l lVar = oVar.f234971c;
        if (lVar != null) {
            strK2 = zbl.a.a().k(lVar);
            Intrinsics.checkNotNullExpressionValue(strK2, "toJson(...)");
        } else {
            strK2 = null;
        }
        if (strK2 == null) {
            sQLiteStatement.bindNull(3);
        } else {
            sQLiteStatement.bindText(3, strK2);
        }
        pcl.i iVar = oVar.d;
        if (iVar != null) {
            strK3 = zbl.a.a().k(iVar);
            Intrinsics.checkNotNullExpressionValue(strK3, "toJson(...)");
        } else {
            strK3 = null;
        }
        if (strK3 == null) {
            sQLiteStatement.bindNull(4);
        } else {
            sQLiteStatement.bindText(4, strK3);
        }
        pcl.j jVar = oVar.e;
        if (jVar != null) {
            strK4 = zbl.a.a().k(jVar);
            Intrinsics.checkNotNullExpressionValue(strK4, "toJson(...)");
        } else {
            strK4 = null;
        }
        if (strK4 == null) {
            sQLiteStatement.bindNull(5);
        } else {
            sQLiteStatement.bindText(5, strK4);
        }
        pcl.k kVar = oVar.f;
        if (kVar != null) {
            strK5 = zbl.a.a().k(kVar);
            Intrinsics.checkNotNullExpressionValue(strK5, "toJson(...)");
        } else {
            strK5 = null;
        }
        if (strK5 == null) {
            sQLiteStatement.bindNull(6);
        } else {
            sQLiteStatement.bindText(6, strK5);
        }
        h hVar = oVar.f234972g;
        if (hVar != null) {
            strK6 = zbl.a.a().k(hVar);
            Intrinsics.checkNotNullExpressionValue(strK6, "toJson(...)");
        } else {
            strK6 = null;
        }
        if (strK6 == null) {
            sQLiteStatement.bindNull(7);
        } else {
            sQLiteStatement.bindText(7, strK6);
        }
        pcl.n nVar = oVar.f234973h;
        if (nVar != null) {
            strK7 = zbl.a.a().k(nVar);
            Intrinsics.checkNotNullExpressionValue(strK7, "toJson(...)");
        }
        if (strK7 == null) {
            sQLiteStatement.bindNull(8);
        } else {
            sQLiteStatement.bindText(8, strK7);
        }
    }

    private final void c(SQLiteStatement sQLiteStatement, Object obj2) {
        String strK;
        String strK2;
        String strK3;
        String strK4;
        String strK5;
        String strK6;
        hcl.t tVar = (hcl.t) obj2;
        String str = tVar.f151153a;
        if (str == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, str);
        }
        String str2 = tVar.f151154b;
        if (str2 == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindText(2, str2);
        }
        String str3 = tVar.f151155c;
        if (str3 == null) {
            sQLiteStatement.bindNull(3);
        } else {
            sQLiteStatement.bindText(3, str3);
        }
        w wVar = tVar.d;
        String strK7 = null;
        if (wVar != null) {
            strK = zbl.a.a().k(wVar);
            Intrinsics.checkNotNullExpressionValue(strK, "toJson(...)");
        } else {
            strK = null;
        }
        if (strK == null) {
            sQLiteStatement.bindNull(4);
        } else {
            sQLiteStatement.bindText(4, strK);
        }
        y yVar = tVar.e;
        if (yVar != null) {
            strK2 = zbl.a.a().k(yVar);
            Intrinsics.checkNotNullExpressionValue(strK2, "toJson(...)");
        } else {
            strK2 = null;
        }
        if (strK2 == null) {
            sQLiteStatement.bindNull(5);
        } else {
            sQLiteStatement.bindText(5, strK2);
        }
        z zVar = tVar.f;
        if (zVar != null) {
            strK3 = zbl.a.a().k(zVar);
            Intrinsics.checkNotNullExpressionValue(strK3, "toJson(...)");
        } else {
            strK3 = null;
        }
        if (strK3 == null) {
            sQLiteStatement.bindNull(6);
        } else {
            sQLiteStatement.bindText(6, strK3);
        }
        hcl.u uVar = tVar.f151156g;
        if (uVar != null) {
            strK4 = zbl.a.a().k(uVar);
            Intrinsics.checkNotNullExpressionValue(strK4, "toJson(...)");
        } else {
            strK4 = null;
        }
        if (strK4 == null) {
            sQLiteStatement.bindNull(7);
        } else {
            sQLiteStatement.bindText(7, strK4);
        }
        hcl.x xVar = tVar.f151157h;
        if (xVar != null) {
            strK5 = zbl.a.a().k(xVar);
            Intrinsics.checkNotNullExpressionValue(strK5, "toJson(...)");
        } else {
            strK5 = null;
        }
        if (strK5 == null) {
            sQLiteStatement.bindNull(8);
        } else {
            sQLiteStatement.bindText(8, strK5);
        }
        v vVar = tVar.i;
        if (vVar != null) {
            strK6 = zbl.a.a().k(vVar);
            Intrinsics.checkNotNullExpressionValue(strK6, "toJson(...)");
        } else {
            strK6 = null;
        }
        if (strK6 == null) {
            sQLiteStatement.bindNull(9);
        } else {
            sQLiteStatement.bindText(9, strK6);
        }
        hcl.s sVar = tVar.f151158j;
        if (sVar != null) {
            strK7 = zbl.a.a().k(sVar);
            Intrinsics.checkNotNullExpressionValue(strK7, "toJson(...)");
        }
        if (strK7 == null) {
            sQLiteStatement.bindNull(10);
        } else {
            sQLiteStatement.bindText(10, strK7);
        }
    }

    private final void d(SQLiteStatement sQLiteStatement, Object obj2) {
        String strK;
        jcl.e eVar = (jcl.e) obj2;
        String str = eVar.f172887a;
        if (str == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, str);
        }
        String str2 = eVar.f172888b;
        if (str2 == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindText(2, str2);
        }
        Long l2 = eVar.f172889c;
        if (l2 == null) {
            sQLiteStatement.bindNull(3);
        } else {
            sQLiteStatement.bindLong(3, l2.longValue());
        }
        String str3 = eVar.d;
        if (str3 == null) {
            sQLiteStatement.bindNull(4);
        } else {
            sQLiteStatement.bindText(4, str3);
        }
        String str4 = eVar.e;
        if (str4 == null) {
            sQLiteStatement.bindNull(5);
        } else {
            sQLiteStatement.bindText(5, str4);
        }
        String str5 = eVar.f;
        if (str5 == null) {
            sQLiteStatement.bindNull(6);
        } else {
            sQLiteStatement.bindText(6, str5);
        }
        jcl.a aVar = eVar.f172890g;
        String strK2 = null;
        if (aVar != null) {
            strK = zbl.a.a().k(aVar);
            Intrinsics.checkNotNullExpressionValue(strK, "toJson(...)");
        } else {
            strK = null;
        }
        if (strK == null) {
            sQLiteStatement.bindNull(7);
        } else {
            sQLiteStatement.bindText(7, strK);
        }
        g gVar = eVar.f172891h;
        if (gVar != null) {
            strK2 = zbl.a.a().k(gVar);
            Intrinsics.checkNotNullExpressionValue(strK2, "toJson(...)");
        }
        if (strK2 == null) {
            sQLiteStatement.bindNull(8);
        } else {
            sQLiteStatement.bindText(8, strK2);
        }
    }

    private final void e(SQLiteStatement sQLiteStatement, Object obj2) {
        icl.b bVar = (icl.b) obj2;
        String str = bVar.f160299a;
        if (str == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, str);
        }
        String str2 = bVar.f160300b;
        if (str2 == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindText(2, str2);
        }
        String strA = qcl.d.a(bVar.f160301c);
        if (strA == null) {
            sQLiteStatement.bindNull(3);
        } else {
            sQLiteStatement.bindText(3, strA);
        }
        String strA2 = qcl.d.a(bVar.d);
        if (strA2 == null) {
            sQLiteStatement.bindNull(4);
        } else {
            sQLiteStatement.bindText(4, strA2);
        }
        String strA3 = qcl.d.a(bVar.e);
        if (strA3 == null) {
            sQLiteStatement.bindNull(5);
        } else {
            sQLiteStatement.bindText(5, strA3);
        }
        String strA4 = qcl.d.a(bVar.f);
        if (strA4 == null) {
            sQLiteStatement.bindNull(6);
        } else {
            sQLiteStatement.bindText(6, strA4);
        }
        sQLiteStatement.bindLong(7, bVar.f160302g);
        sQLiteStatement.bindLong(8, bVar.f160303h);
        sQLiteStatement.bindLong(9, bVar.i);
        String strA5 = qcl.d.a(bVar.f160304j);
        if (strA5 == null) {
            sQLiteStatement.bindNull(10);
        } else {
            sQLiteStatement.bindText(10, strA5);
        }
        String strA6 = qcl.d.a(bVar.k);
        if (strA6 == null) {
            sQLiteStatement.bindNull(11);
        } else {
            sQLiteStatement.bindText(11, strA6);
        }
        String strA7 = qcl.d.a(bVar.f160305l);
        if (strA7 == null) {
            sQLiteStatement.bindNull(12);
        } else {
            sQLiteStatement.bindText(12, strA7);
        }
    }

    private final void f(SQLiteStatement sQLiteStatement, Object obj2) {
        ((j0) obj2).getClass();
        sQLiteStatement.bindNull(1);
        sQLiteStatement.bindNull(2);
        sQLiteStatement.bindNull(3);
        sQLiteStatement.bindNull(4);
        sQLiteStatement.bindNull(5);
    }

    private final void g(SQLiteStatement sQLiteStatement, Object obj2) {
        q0 q0Var = (q0) obj2;
        String str = q0Var.f151112a;
        if (str == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, str);
        }
        String str2 = q0Var.f151113b;
        if (str2 == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindText(2, str2);
        }
    }

    private final void h(SQLiteStatement sQLiteStatement, Object obj2) {
        icl.c cVar = (icl.c) obj2;
        String str = cVar.f160306a;
        if (str == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, str);
        }
        String str2 = cVar.f160307b;
        if (str2 == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindText(2, str2);
        }
        sQLiteStatement.bindLong(3, cVar.f160308c);
        eel.i iVar = cVar.d;
        String strName = iVar != null ? iVar.name() : null;
        if (strName == null) {
            sQLiteStatement.bindNull(4);
        } else {
            sQLiteStatement.bindText(4, strName);
        }
        String strA = qcl.d.a(cVar.e);
        if (strA == null) {
            sQLiteStatement.bindNull(5);
        } else {
            sQLiteStatement.bindText(5, strA);
        }
        BigDecimal bigDecimal = cVar.f;
        String plainString = bigDecimal != null ? bigDecimal.toPlainString() : null;
        if (plainString == null) {
            sQLiteStatement.bindNull(6);
        } else {
            sQLiteStatement.bindText(6, plainString);
        }
    }

    private final void i(SQLiteStatement sQLiteStatement, Object obj2) {
        String strK;
        m0 m0Var = (m0) obj2;
        String str = m0Var.f151071a;
        if (str == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, str);
        }
        List list = m0Var.f151072b;
        if (list != null) {
            strK = zbl.a.a().k(list);
            Intrinsics.checkNotNullExpressionValue(strK, "toJson(...)");
        } else {
            strK = null;
        }
        if (strK == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindText(2, strK);
        }
    }

    private final void j(SQLiteStatement sQLiteStatement, Object obj2) {
        s0 s0Var = (s0) obj2;
        String str = s0Var.f151146a;
        if (str == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, str);
        }
        String strH = qcl.d.h(s0Var.f151147b);
        if (strH == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindText(2, strH);
        }
        Long l2 = s0Var.f151148c;
        if (l2 == null) {
            sQLiteStatement.bindNull(3);
        } else {
            sQLiteStatement.bindLong(3, l2.longValue());
        }
        String strH2 = qcl.k.h(s0Var.d);
        if (strH2 == null) {
            sQLiteStatement.bindNull(4);
        } else {
            sQLiteStatement.bindText(4, strH2);
        }
        String strH3 = qcl.k.h(s0Var.e);
        if (strH3 == null) {
            sQLiteStatement.bindNull(5);
        } else {
            sQLiteStatement.bindText(5, strH3);
        }
        String strH4 = qcl.k.h(s0Var.f);
        if (strH4 == null) {
            sQLiteStatement.bindNull(6);
        } else {
            sQLiteStatement.bindText(6, strH4);
        }
        Boolean bool = s0Var.f151149g;
        if ((bool == null ? null : Integer.valueOf(bool.booleanValue() ? 1 : 0)) == null) {
            sQLiteStatement.bindNull(7);
        } else {
            sQLiteStatement.bindLong(7, r6.intValue());
        }
    }

    private final void k(SQLiteStatement sQLiteStatement, Object obj2) {
        r0 r0Var = (r0) obj2;
        String str = r0Var.f151118a;
        if (str == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, str);
        }
        String str2 = r0Var.f151119b;
        if (str2 == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindText(2, str2);
        }
        String str3 = r0Var.f151120c;
        if (str3 == null) {
            sQLiteStatement.bindNull(3);
        } else {
            sQLiteStatement.bindText(3, str3);
        }
        String strH = qcl.d.h(r0Var.d);
        if (strH == null) {
            sQLiteStatement.bindNull(4);
        } else {
            sQLiteStatement.bindText(4, strH);
        }
        String strA = qcl.d.a(r0Var.e);
        if (strA == null) {
            sQLiteStatement.bindNull(5);
        } else {
            sQLiteStatement.bindText(5, strA);
        }
        String strA2 = qcl.d.a(r0Var.f);
        if (strA2 == null) {
            sQLiteStatement.bindNull(6);
        } else {
            sQLiteStatement.bindText(6, strA2);
        }
        sQLiteStatement.bindLong(7, r0Var.f151121g ? 1L : 0L);
        String str4 = r0Var.f151122h;
        if (str4 == null) {
            sQLiteStatement.bindNull(8);
        } else {
            sQLiteStatement.bindText(8, str4);
        }
        sQLiteStatement.bindLong(9, r0Var.i ? 1L : 0L);
        String strH2 = qcl.d.h(r0Var.f151123j);
        if (strH2 == null) {
            sQLiteStatement.bindNull(10);
        } else {
            sQLiteStatement.bindText(10, strH2);
        }
        String strA3 = qcl.d.a(r0Var.k);
        if (strA3 == null) {
            sQLiteStatement.bindNull(11);
        } else {
            sQLiteStatement.bindText(11, strA3);
        }
        Long l2 = r0Var.f151124l;
        if (l2 == null) {
            sQLiteStatement.bindNull(12);
        } else {
            sQLiteStatement.bindLong(12, l2.longValue());
        }
        sQLiteStatement.bindLong(13, r0Var.f151125m);
        String strH3 = qcl.d.h(r0Var.f151126n);
        if (strH3 == null) {
            sQLiteStatement.bindNull(14);
        } else {
            sQLiteStatement.bindText(14, strH3);
        }
        String strA4 = qcl.d.a(r0Var.o);
        if (strA4 == null) {
            sQLiteStatement.bindNull(15);
        } else {
            sQLiteStatement.bindText(15, strA4);
        }
        String strH4 = qcl.d.h(r0Var.f151127p);
        if (strH4 == null) {
            sQLiteStatement.bindNull(16);
        } else {
            sQLiteStatement.bindText(16, strH4);
        }
        String strH5 = qcl.d.h(r0Var.f151128q);
        if (strH5 == null) {
            sQLiteStatement.bindNull(17);
        } else {
            sQLiteStatement.bindText(17, strH5);
        }
        String strA5 = qcl.d.a(r0Var.f151129r);
        if (strA5 == null) {
            sQLiteStatement.bindNull(18);
        } else {
            sQLiteStatement.bindText(18, strA5);
        }
        String strA6 = qcl.d.a(r0Var.f151130s);
        if (strA6 == null) {
            sQLiteStatement.bindNull(19);
        } else {
            sQLiteStatement.bindText(19, strA6);
        }
        String strA7 = qcl.d.a(r0Var.f151131t);
        if (strA7 == null) {
            sQLiteStatement.bindNull(20);
        } else {
            sQLiteStatement.bindText(20, strA7);
        }
        String str5 = r0Var.u;
        if (str5 == null) {
            sQLiteStatement.bindNull(21);
        } else {
            sQLiteStatement.bindText(21, str5);
        }
        String str6 = r0Var.v;
        if (str6 == null) {
            sQLiteStatement.bindNull(22);
        } else {
            sQLiteStatement.bindText(22, str6);
        }
        String str7 = r0Var.f151132w;
        if (str7 == null) {
            sQLiteStatement.bindNull(23);
        } else {
            sQLiteStatement.bindText(23, str7);
        }
        String str8 = r0Var.f151133x;
        if (str8 == null) {
            sQLiteStatement.bindNull(24);
        } else {
            sQLiteStatement.bindText(24, str8);
        }
        String str9 = r0Var.f151134y;
        if (str9 == null) {
            sQLiteStatement.bindNull(25);
        } else {
            sQLiteStatement.bindText(25, str9);
        }
        String str10 = r0Var.z;
        if (str10 == null) {
            sQLiteStatement.bindNull(26);
        } else {
            sQLiteStatement.bindText(26, str10);
        }
        String strA8 = qcl.d.a(r0Var.A);
        if (strA8 == null) {
            sQLiteStatement.bindNull(27);
        } else {
            sQLiteStatement.bindText(27, strA8);
        }
        Long l3 = r0Var.B;
        if (l3 == null) {
            sQLiteStatement.bindNull(28);
        } else {
            sQLiteStatement.bindLong(28, l3.longValue());
        }
        String strA9 = qcl.d.a(r0Var.C);
        if (strA9 == null) {
            sQLiteStatement.bindNull(29);
        } else {
            sQLiteStatement.bindText(29, strA9);
        }
        if (r0Var.D == null) {
            sQLiteStatement.bindNull(30);
        } else {
            sQLiteStatement.bindLong(30, r0.intValue());
        }
        if (r0Var.E == null) {
            sQLiteStatement.bindNull(31);
        } else {
            sQLiteStatement.bindLong(31, r0.intValue());
        }
        if (r0Var.F == null) {
            sQLiteStatement.bindNull(32);
        } else {
            sQLiteStatement.bindLong(32, r0.intValue());
        }
        if (r0Var.G == null) {
            sQLiteStatement.bindNull(33);
        } else {
            sQLiteStatement.bindLong(33, r0.intValue());
        }
        String str11 = r0Var.H;
        if (str11 == null) {
            sQLiteStatement.bindNull(34);
        } else {
            sQLiteStatement.bindText(34, str11);
        }
        String str12 = r0Var.I;
        if (str12 == null) {
            sQLiteStatement.bindNull(35);
        } else {
            sQLiteStatement.bindText(35, str12);
        }
        String str13 = r0Var.J;
        if (str13 == null) {
            sQLiteStatement.bindNull(36);
        } else {
            sQLiteStatement.bindText(36, str13);
        }
        String str14 = r0Var.K;
        if (str14 == null) {
            sQLiteStatement.bindNull(37);
        } else {
            sQLiteStatement.bindText(37, str14);
        }
        String str15 = r0Var.L;
        if (str15 == null) {
            sQLiteStatement.bindNull(38);
        } else {
            sQLiteStatement.bindText(38, str15);
        }
        String str16 = r0Var.M;
        if (str16 == null) {
            sQLiteStatement.bindNull(39);
        } else {
            sQLiteStatement.bindText(39, str16);
        }
        String strA10 = qcl.d.a(r0Var.N);
        if (strA10 == null) {
            sQLiteStatement.bindNull(40);
        } else {
            sQLiteStatement.bindText(40, strA10);
        }
        String str17 = r0Var.O;
        if (str17 == null) {
            sQLiteStatement.bindNull(41);
        } else {
            sQLiteStatement.bindText(41, str17);
        }
        if (r0Var.P == null) {
            sQLiteStatement.bindNull(42);
        } else {
            sQLiteStatement.bindLong(42, r6.intValue());
        }
    }

    private final void l(SQLiteStatement sQLiteStatement, Object obj2) {
        k0 k0Var = (k0) obj2;
        String str = k0Var.f151029a;
        if (str == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, str);
        }
        String str2 = k0Var.f151030b;
        if (str2 == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindText(2, str2);
        }
        String str3 = k0Var.f151031c;
        if (str3 == null) {
            sQLiteStatement.bindNull(3);
        } else {
            sQLiteStatement.bindText(3, str3);
        }
        String str4 = k0Var.d;
        if (str4 == null) {
            sQLiteStatement.bindNull(4);
        } else {
            sQLiteStatement.bindText(4, str4);
        }
        String str5 = k0Var.e;
        if (str5 == null) {
            sQLiteStatement.bindNull(5);
        } else {
            sQLiteStatement.bindText(5, str5);
        }
        String strB = qcl.k.b(k0Var.f);
        if (strB == null) {
            sQLiteStatement.bindNull(6);
        } else {
            sQLiteStatement.bindText(6, strB);
        }
        String strI = qcl.k.i(k0Var.f151032g);
        if (strI == null) {
            sQLiteStatement.bindNull(7);
        } else {
            sQLiteStatement.bindText(7, strI);
        }
        String strJ = qcl.k.j(k0Var.f151033h);
        if (strJ == null) {
            sQLiteStatement.bindNull(8);
        } else {
            sQLiteStatement.bindText(8, strJ);
        }
        String str6 = k0Var.i;
        if (str6 == null) {
            sQLiteStatement.bindNull(9);
        } else {
            sQLiteStatement.bindText(9, str6);
        }
        if (k0Var.f151034j == null) {
            sQLiteStatement.bindNull(10);
        } else {
            sQLiteStatement.bindLong(10, r0.intValue());
        }
        String str7 = k0Var.k;
        if (str7 == null) {
            sQLiteStatement.bindNull(11);
        } else {
            sQLiteStatement.bindText(11, str7);
        }
        String str8 = k0Var.f151035l;
        if (str8 == null) {
            sQLiteStatement.bindNull(12);
        } else {
            sQLiteStatement.bindText(12, str8);
        }
        String str9 = k0Var.f151036m;
        if (str9 == null) {
            sQLiteStatement.bindNull(13);
        } else {
            sQLiteStatement.bindText(13, str9);
        }
        sQLiteStatement.bindLong(14, k0Var.f151037n);
        if (k0Var.o == null) {
            sQLiteStatement.bindNull(15);
        } else {
            sQLiteStatement.bindLong(15, r0.intValue());
        }
        String strG = qcl.d.g(k0Var.f151038p);
        if (strG == null) {
            sQLiteStatement.bindNull(16);
        } else {
            sQLiteStatement.bindText(16, strG);
        }
        String str10 = k0Var.f151039q;
        if (str10 == null) {
            sQLiteStatement.bindNull(17);
        } else {
            sQLiteStatement.bindText(17, str10);
        }
        String strG2 = qcl.d.g(k0Var.f151040r);
        if (strG2 == null) {
            sQLiteStatement.bindNull(18);
        } else {
            sQLiteStatement.bindText(18, strG2);
        }
        String strA = qcl.k.a(k0Var.f151041s);
        if (strA == null) {
            sQLiteStatement.bindNull(19);
        } else {
            sQLiteStatement.bindText(19, strA);
        }
        String str11 = k0Var.f151042t;
        if (str11 == null) {
            sQLiteStatement.bindNull(20);
        } else {
            sQLiteStatement.bindText(20, str11);
        }
        Long l2 = k0Var.u;
        if (l2 == null) {
            sQLiteStatement.bindNull(21);
        } else {
            sQLiteStatement.bindLong(21, l2.longValue());
        }
    }

    private final void m(SQLiteStatement sQLiteStatement, Object obj2) {
        x2 x2Var = (x2) obj2;
        String str = x2Var.f151218a;
        if (str == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, str);
        }
        sQLiteStatement.bindLong(2, x2Var.f151219b);
    }

    private final void n(SQLiteStatement sQLiteStatement, Object obj2) {
        k0 k0Var = (k0) obj2;
        String str = k0Var.f151029a;
        if (str == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, str);
        }
        String str2 = k0Var.f151030b;
        if (str2 == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindText(2, str2);
        }
        String str3 = k0Var.f151031c;
        if (str3 == null) {
            sQLiteStatement.bindNull(3);
        } else {
            sQLiteStatement.bindText(3, str3);
        }
        String str4 = k0Var.d;
        if (str4 == null) {
            sQLiteStatement.bindNull(4);
        } else {
            sQLiteStatement.bindText(4, str4);
        }
        String str5 = k0Var.e;
        if (str5 == null) {
            sQLiteStatement.bindNull(5);
        } else {
            sQLiteStatement.bindText(5, str5);
        }
        String strB = qcl.k.b(k0Var.f);
        if (strB == null) {
            sQLiteStatement.bindNull(6);
        } else {
            sQLiteStatement.bindText(6, strB);
        }
        String strI = qcl.k.i(k0Var.f151032g);
        if (strI == null) {
            sQLiteStatement.bindNull(7);
        } else {
            sQLiteStatement.bindText(7, strI);
        }
        String strJ = qcl.k.j(k0Var.f151033h);
        if (strJ == null) {
            sQLiteStatement.bindNull(8);
        } else {
            sQLiteStatement.bindText(8, strJ);
        }
        String str6 = k0Var.i;
        if (str6 == null) {
            sQLiteStatement.bindNull(9);
        } else {
            sQLiteStatement.bindText(9, str6);
        }
        if (k0Var.f151034j == null) {
            sQLiteStatement.bindNull(10);
        } else {
            sQLiteStatement.bindLong(10, r0.intValue());
        }
        String str7 = k0Var.k;
        if (str7 == null) {
            sQLiteStatement.bindNull(11);
        } else {
            sQLiteStatement.bindText(11, str7);
        }
        String str8 = k0Var.f151035l;
        if (str8 == null) {
            sQLiteStatement.bindNull(12);
        } else {
            sQLiteStatement.bindText(12, str8);
        }
        String str9 = k0Var.f151036m;
        if (str9 == null) {
            sQLiteStatement.bindNull(13);
        } else {
            sQLiteStatement.bindText(13, str9);
        }
        sQLiteStatement.bindLong(14, k0Var.f151037n);
        if (k0Var.o == null) {
            sQLiteStatement.bindNull(15);
        } else {
            sQLiteStatement.bindLong(15, r0.intValue());
        }
        String strG = qcl.d.g(k0Var.f151038p);
        if (strG == null) {
            sQLiteStatement.bindNull(16);
        } else {
            sQLiteStatement.bindText(16, strG);
        }
        String str10 = k0Var.f151039q;
        if (str10 == null) {
            sQLiteStatement.bindNull(17);
        } else {
            sQLiteStatement.bindText(17, str10);
        }
        String strG2 = qcl.d.g(k0Var.f151040r);
        if (strG2 == null) {
            sQLiteStatement.bindNull(18);
        } else {
            sQLiteStatement.bindText(18, strG2);
        }
        String strA = qcl.k.a(k0Var.f151041s);
        if (strA == null) {
            sQLiteStatement.bindNull(19);
        } else {
            sQLiteStatement.bindText(19, strA);
        }
        String str11 = k0Var.f151042t;
        if (str11 == null) {
            sQLiteStatement.bindNull(20);
        } else {
            sQLiteStatement.bindText(20, str11);
        }
        Long l2 = k0Var.u;
        if (l2 == null) {
            sQLiteStatement.bindNull(21);
        } else {
            sQLiteStatement.bindLong(21, l2.longValue());
        }
    }

    private final void o(SQLiteStatement sQLiteStatement, Object obj2) {
        String strK;
        String strK2;
        i0 i0Var = (i0) obj2;
        String str = i0Var.f151012a;
        if (str == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, str);
        }
        String str2 = i0Var.f151013b;
        if (str2 == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindText(2, str2);
        }
        String str3 = i0Var.f151014c;
        if (str3 == null) {
            sQLiteStatement.bindNull(3);
        } else {
            sQLiteStatement.bindText(3, str3);
        }
        String str4 = i0Var.d;
        if (str4 == null) {
            sQLiteStatement.bindNull(4);
        } else {
            sQLiteStatement.bindText(4, str4);
        }
        o0 o0Var = i0Var.e;
        String strK3 = null;
        if (o0Var != null) {
            strK = zbl.a.a().k(o0Var);
            Intrinsics.checkNotNullExpressionValue(strK, "toJson(...)");
        } else {
            strK = null;
        }
        if (strK == null) {
            sQLiteStatement.bindNull(5);
        } else {
            sQLiteStatement.bindText(5, strK);
        }
        String str5 = i0Var.f;
        if (str5 == null) {
            sQLiteStatement.bindNull(6);
        } else {
            sQLiteStatement.bindText(6, str5);
        }
        String str6 = i0Var.f151015g;
        if (str6 == null) {
            sQLiteStatement.bindNull(7);
        } else {
            sQLiteStatement.bindText(7, str6);
        }
        hcl.b bVar = i0Var.f151016h;
        if (bVar != null) {
            strK2 = zbl.a.a().k(bVar);
            Intrinsics.checkNotNullExpressionValue(strK2, "toJson(...)");
        } else {
            strK2 = null;
        }
        if (strK2 == null) {
            sQLiteStatement.bindNull(8);
        } else {
            sQLiteStatement.bindText(8, strK2);
        }
        List list = i0Var.i;
        if (list != null) {
            strK3 = zbl.a.a().k(list);
            Intrinsics.checkNotNullExpressionValue(strK3, "toJson(...)");
        }
        if (strK3 == null) {
            sQLiteStatement.bindNull(9);
        } else {
            sQLiteStatement.bindText(9, strK3);
        }
    }

    private final void p(SQLiteStatement sQLiteStatement, Object obj2) {
        String strK;
        pcl.y yVar = (pcl.y) obj2;
        String str = yVar.f235003a;
        if (str == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, str);
        }
        pcl.u stats = yVar.f235004b;
        Intrinsics.checkNotNullParameter(stats, "stats");
        String strK2 = zbl.a.a().k(stats);
        Intrinsics.checkNotNullExpressionValue(strK2, "toJson(...)");
        if (strK2 == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindText(2, strK2);
        }
        pcl.x stats2 = yVar.f235005c;
        Intrinsics.checkNotNullParameter(stats2, "stats");
        String strK3 = zbl.a.a().k(stats2);
        Intrinsics.checkNotNullExpressionValue(strK3, "toJson(...)");
        if (strK3 == null) {
            sQLiteStatement.bindNull(3);
        } else {
            sQLiteStatement.bindText(3, strK3);
        }
        pcl.s stats3 = yVar.d;
        Intrinsics.checkNotNullParameter(stats3, "stats");
        String strK4 = zbl.a.a().k(stats3);
        Intrinsics.checkNotNullExpressionValue(strK4, "toJson(...)");
        if (strK4 == null) {
            sQLiteStatement.bindNull(4);
        } else {
            sQLiteStatement.bindText(4, strK4);
        }
        pcl.t stats4 = yVar.e;
        Intrinsics.checkNotNullParameter(stats4, "stats");
        String strK5 = zbl.a.a().k(stats4);
        Intrinsics.checkNotNullExpressionValue(strK5, "toJson(...)");
        if (strK5 == null) {
            sQLiteStatement.bindNull(5);
        } else {
            sQLiteStatement.bindText(5, strK5);
        }
        pcl.p stats5 = yVar.f;
        Intrinsics.checkNotNullParameter(stats5, "stats");
        String strK6 = zbl.a.a().k(stats5);
        Intrinsics.checkNotNullExpressionValue(strK6, "toJson(...)");
        if (strK6 == null) {
            sQLiteStatement.bindNull(6);
        } else {
            sQLiteStatement.bindText(6, strK6);
        }
        pcl.w stats6 = yVar.f235006g;
        Intrinsics.checkNotNullParameter(stats6, "stats");
        String strK7 = zbl.a.a().k(stats6);
        Intrinsics.checkNotNullExpressionValue(strK7, "toJson(...)");
        if (strK7 == null) {
            sQLiteStatement.bindNull(7);
        } else {
            sQLiteStatement.bindText(7, strK7);
        }
        pcl.v stats7 = yVar.f235007h;
        Intrinsics.checkNotNullParameter(stats7, "stats");
        String strK8 = zbl.a.a().k(stats7);
        Intrinsics.checkNotNullExpressionValue(strK8, "toJson(...)");
        if (strK8 == null) {
            sQLiteStatement.bindNull(8);
        } else {
            sQLiteStatement.bindText(8, strK8);
        }
        pcl.r stats8 = yVar.i;
        Intrinsics.checkNotNullParameter(stats8, "stats");
        String strK9 = zbl.a.a().k(stats8);
        Intrinsics.checkNotNullExpressionValue(strK9, "toJson(...)");
        if (strK9 == null) {
            sQLiteStatement.bindNull(9);
        } else {
            sQLiteStatement.bindText(9, strK9);
        }
        q qVar = yVar.f235008j;
        if (qVar != null) {
            strK = zbl.a.a().k(qVar);
            Intrinsics.checkNotNullExpressionValue(strK, "toJson(...)");
        } else {
            strK = null;
        }
        if (strK == null) {
            sQLiteStatement.bindNull(10);
        } else {
            sQLiteStatement.bindText(10, strK);
        }
    }

    private final void q(SQLiteStatement sQLiteStatement, Object obj2) {
        String strC;
        l1 l1Var = (l1) obj2;
        String str = l1Var.f151055a;
        if (str == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, str);
        }
        Long lB = qcl.d.b(l1Var.f151056b);
        if (lB == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindLong(2, lB.longValue());
        }
        Long lB2 = qcl.d.b(l1Var.f151057c);
        if (lB2 == null) {
            sQLiteStatement.bindNull(3);
        } else {
            sQLiteStatement.bindLong(3, lB2.longValue());
        }
        String str2 = l1Var.d;
        if (str2 == null) {
            sQLiteStatement.bindNull(4);
        } else {
            sQLiteStatement.bindText(4, str2);
        }
        String str3 = l1Var.e;
        if (str3 == null) {
            sQLiteStatement.bindNull(5);
        } else {
            sQLiteStatement.bindText(5, str3);
        }
        String strH = qcl.d.h(l1Var.f);
        if (strH == null) {
            sQLiteStatement.bindNull(6);
        } else {
            sQLiteStatement.bindText(6, strH);
        }
        String strH2 = qcl.d.h(l1Var.f151058g);
        if (strH2 == null) {
            sQLiteStatement.bindNull(7);
        } else {
            sQLiteStatement.bindText(7, strH2);
        }
        sQLiteStatement.bindLong(8, l1Var.f151059h ? 1L : 0L);
        h1 entity = l1Var.i;
        Intrinsics.checkNotNullParameter(entity, "entity");
        Json jsonA = af0.b.a();
        jsonA.getClass();
        sQLiteStatement.bindText(9, jsonA.c(h1.Companion.serializer(), entity));
        b1 entity2 = l1Var.f151060j;
        Intrinsics.checkNotNullParameter(entity2, "entity");
        Json jsonA2 = af0.b.a();
        jsonA2.getClass();
        sQLiteStatement.bindText(10, jsonA2.c(b1.Companion.serializer(), entity2));
        List entities = l1Var.k;
        Intrinsics.checkNotNullParameter(entities, "entities");
        Json jsonA3 = af0.b.a();
        jsonA3.getClass();
        sQLiteStatement.bindText(11, jsonA3.c(new qlm.e(t1.Companion.serializer()), entities));
        Long lB3 = qcl.d.b(l1Var.f151061l);
        if (lB3 == null) {
            sQLiteStatement.bindNull(12);
        } else {
            sQLiteStatement.bindLong(12, lB3.longValue());
        }
        v0 v0Var = l1Var.f151062m;
        String strC2 = null;
        if (v0Var != null) {
            Json jsonA4 = af0.b.a();
            jsonA4.getClass();
            strC = jsonA4.c(v0.Companion.serializer(), v0Var);
        } else {
            strC = null;
        }
        if (strC == null) {
            sQLiteStatement.bindNull(13);
        } else {
            sQLiteStatement.bindText(13, strC);
        }
        v0 v0Var2 = l1Var.f151063n;
        if (v0Var2 != null) {
            Json jsonA5 = af0.b.a();
            jsonA5.getClass();
            strC2 = jsonA5.c(v0.Companion.serializer(), v0Var2);
        }
        if (strC2 == null) {
            sQLiteStatement.bindNull(14);
        } else {
            sQLiteStatement.bindText(14, strC2);
        }
    }

    private final void r(SQLiteStatement sQLiteStatement, Object obj2) {
        m1 m1Var = (m1) obj2;
        String str = m1Var.f151073a;
        if (str == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, str);
        }
        Long lB = qcl.d.b(m1Var.f151074b);
        if (lB == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindLong(2, lB.longValue());
        }
        Long lB2 = qcl.d.b(m1Var.f151075c);
        if (lB2 == null) {
            sQLiteStatement.bindNull(3);
        } else {
            sQLiteStatement.bindLong(3, lB2.longValue());
        }
        String str2 = m1Var.d;
        if (str2 == null) {
            sQLiteStatement.bindNull(4);
        } else {
            sQLiteStatement.bindText(4, str2);
        }
        String str3 = m1Var.e;
        if (str3 == null) {
            sQLiteStatement.bindNull(5);
        } else {
            sQLiteStatement.bindText(5, str3);
        }
        String strH = qcl.d.h(m1Var.f);
        if (strH == null) {
            sQLiteStatement.bindNull(6);
        } else {
            sQLiteStatement.bindText(6, strH);
        }
        String strH2 = qcl.d.h(m1Var.f151076g);
        if (strH2 == null) {
            sQLiteStatement.bindNull(7);
        } else {
            sQLiteStatement.bindText(7, strH2);
        }
        Long lB3 = qcl.d.b(m1Var.f151077h);
        if (lB3 == null) {
            sQLiteStatement.bindNull(8);
        } else {
            sQLiteStatement.bindLong(8, lB3.longValue());
        }
    }

    @Override // androidx.room.EntityInsertAdapter
    public final void bind(SQLiteStatement sQLiteStatement, Object obj2) {
        String strK;
        String strK2;
        String strK3;
        String strK4;
        String strK5;
        String strK6;
        String strK7;
        String strK8;
        String strK9;
        String strK10;
        String strK11;
        String strK12;
        String strK13;
        String strK14;
        switch (this.f8730a) {
            case 0:
                drk.d dVar = (drk.d) obj2;
                String str = dVar.f117159a;
                if (str == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str);
                }
                sQLiteStatement.bindLong(2, dVar.f117160b);
                if (dVar.f117161c == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindLong(3, r0.intValue());
                }
                String str2 = dVar.f117162g;
                if (str2 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, str2);
                }
                drk.c cVar = dVar.d;
                if (cVar != null) {
                    Double d = cVar.f117158c;
                    if (d == null) {
                        sQLiteStatement.bindNull(5);
                    } else {
                        sQLiteStatement.bindDouble(5, d.doubleValue());
                    }
                    jo3.b bVar = cVar.f117156a;
                    if (bVar == null) {
                        sQLiteStatement.bindNull(6);
                        sQLiteStatement.bindNull(7);
                    } else if (a10.b.v(bVar, sQLiteStatement, 6) == null) {
                        sQLiteStatement.bindNull(7);
                    } else {
                        sQLiteStatement.bindText(7, bVar.getCurrency());
                    }
                    jo3.b bVar2 = cVar.f117157b;
                    if (bVar2 == null) {
                        sQLiteStatement.bindNull(8);
                        sQLiteStatement.bindNull(9);
                    } else if (a10.b.v(bVar2, sQLiteStatement, 8) == null) {
                        sQLiteStatement.bindNull(9);
                    } else {
                        sQLiteStatement.bindText(9, bVar2.getCurrency());
                    }
                } else {
                    o.z(sQLiteStatement, 5, 6, 7, 8);
                    sQLiteStatement.bindNull(9);
                }
                drk.a aVar = dVar.e;
                if (aVar != null) {
                    Double d5 = aVar.f117152c;
                    if (d5 == null) {
                        sQLiteStatement.bindNull(10);
                    } else {
                        sQLiteStatement.bindDouble(10, d5.doubleValue());
                    }
                    jo3.b bVar3 = aVar.f117150a;
                    if (bVar3 == null) {
                        sQLiteStatement.bindNull(11);
                        sQLiteStatement.bindNull(12);
                    } else if (a10.b.v(bVar3, sQLiteStatement, 11) == null) {
                        sQLiteStatement.bindNull(12);
                    } else {
                        sQLiteStatement.bindText(12, bVar3.getCurrency());
                    }
                    jo3.b bVar4 = aVar.f117151b;
                    if (bVar4 == null) {
                        sQLiteStatement.bindNull(13);
                        sQLiteStatement.bindNull(14);
                    } else if (a10.b.v(bVar4, sQLiteStatement, 13) == null) {
                        sQLiteStatement.bindNull(14);
                    } else {
                        sQLiteStatement.bindText(14, bVar4.getCurrency());
                    }
                } else {
                    o.z(sQLiteStatement, 10, 11, 12, 13);
                    sQLiteStatement.bindNull(14);
                }
                drk.b bVar5 = dVar.f;
                if (bVar5 == null) {
                    o.z(sQLiteStatement, 15, 16, 17, 18);
                    o.z(sQLiteStatement, 19, 20, 21, 22);
                } else {
                    jo3.b bVar6 = bVar5.f117153a;
                    if (bVar6 == null) {
                        sQLiteStatement.bindNull(15);
                        sQLiteStatement.bindNull(16);
                    } else if (a10.b.v(bVar6, sQLiteStatement, 15) == null) {
                        sQLiteStatement.bindNull(16);
                    } else {
                        sQLiteStatement.bindText(16, bVar6.getCurrency());
                    }
                    jo3.b bVar7 = bVar5.f117154b;
                    if (bVar7 == null) {
                        sQLiteStatement.bindNull(17);
                        sQLiteStatement.bindNull(18);
                    } else if (a10.b.v(bVar7, sQLiteStatement, 17) == null) {
                        sQLiteStatement.bindNull(18);
                    } else {
                        sQLiteStatement.bindText(18, bVar7.getCurrency());
                    }
                    jo3.b bVar8 = bVar5.f117155c;
                    if (bVar8 == null) {
                        sQLiteStatement.bindNull(19);
                        sQLiteStatement.bindNull(20);
                    } else if (a10.b.v(bVar8, sQLiteStatement, 19) == null) {
                        sQLiteStatement.bindNull(20);
                    } else {
                        sQLiteStatement.bindText(20, bVar8.getCurrency());
                    }
                    jo3.b bVar9 = bVar5.d;
                    if (bVar9 == null) {
                        sQLiteStatement.bindNull(21);
                        sQLiteStatement.bindNull(22);
                    } else if (a10.b.v(bVar9, sQLiteStatement, 21) != null) {
                        sQLiteStatement.bindText(22, bVar9.getCurrency());
                    } else {
                        sQLiteStatement.bindNull(22);
                    }
                }
                break;
            case 1:
                drk.e eVar = (drk.e) obj2;
                String str3 = eVar.f117163a;
                if (str3 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str3);
                }
                String str4 = eVar.f117164b;
                if (str4 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str4);
                }
                sQLiteStatement.bindLong(3, eVar.f117165c);
                if (eVar.d == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindLong(4, r0.intValue());
                }
                drk.h hVar = eVar.e;
                if (hVar != null) {
                    strK = GsonHolder.a().k(hVar);
                    Intrinsics.checkNotNullExpressionValue(strK, "toJson(...)");
                } else {
                    strK = null;
                }
                if (strK == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, strK);
                }
                String str5 = eVar.f;
                if (str5 != null) {
                    sQLiteStatement.bindText(6, str5);
                } else {
                    sQLiteStatement.bindNull(6);
                }
                break;
            case 2:
                c1a.a aVar2 = (c1a.a) obj2;
                String str6 = aVar2.f20427a;
                if (str6 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str6);
                }
                String str7 = aVar2.f20429c;
                if (str7 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str7);
                }
                List participantsSplits = aVar2.d;
                Intrinsics.checkNotNullParameter(participantsSplits, "participantsSplits");
                String strK15 = GsonHolder.a().k(participantsSplits);
                Intrinsics.checkNotNullExpressionValue(strK15, "toJson(...)");
                if (strK15 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, strK15);
                }
                String str8 = aVar2.e;
                if (str8 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, str8);
                }
                sQLiteStatement.bindLong(5, aVar2.f);
                sQLiteStatement.bindLong(6, aVar2.f20430g);
                c1a.b bVar10 = aVar2.f20428b;
                String str9 = bVar10.f20431a;
                if (str9 == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindText(7, str9);
                }
                String str10 = bVar10.f20432b;
                if (str10 != null) {
                    sQLiteStatement.bindText(8, str10);
                } else {
                    sQLiteStatement.bindNull(8);
                }
                break;
            case 3:
                ehl.c cVar2 = (ehl.c) obj2;
                String str11 = cVar2.f126227a;
                if (str11 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str11);
                }
                j jVar = cVar2.f126228b;
                String id10 = jVar != null ? jVar.getId() : null;
                if (id10 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, id10);
                }
                String strE = fhl.a.e(cVar2.f126229c);
                if (strE == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, strE);
                }
                sQLiteStatement.bindLong(4, cVar2.d ? 1L : 0L);
                n nVar = cVar2.e;
                if (nVar != null) {
                    l lVar = nVar.f126268a;
                    String id11 = lVar != null ? lVar.getId() : null;
                    if (id11 == null) {
                        sQLiteStatement.bindNull(5);
                    } else {
                        sQLiteStatement.bindText(5, id11);
                    }
                    String str12 = nVar.f126269b;
                    if (str12 == null) {
                        sQLiteStatement.bindNull(6);
                    } else {
                        sQLiteStatement.bindText(6, str12);
                    }
                    sQLiteStatement.bindLong(7, nVar.f126270c ? 1L : 0L);
                    Long lA = fhl.a.a(nVar.d);
                    if (lA == null) {
                        sQLiteStatement.bindNull(8);
                    } else {
                        sQLiteStatement.bindLong(8, lA.longValue());
                    }
                    Long lA2 = fhl.a.a(nVar.e);
                    if (lA2 == null) {
                        sQLiteStatement.bindNull(9);
                    } else {
                        sQLiteStatement.bindLong(9, lA2.longValue());
                    }
                } else {
                    o.z(sQLiteStatement, 5, 6, 7, 8);
                    sQLiteStatement.bindNull(9);
                }
                e eVar2 = cVar2.f;
                if (eVar2 != null) {
                    String str13 = eVar2.f126242a;
                    if (str13 == null) {
                        sQLiteStatement.bindNull(10);
                    } else {
                        sQLiteStatement.bindText(10, str13);
                    }
                    String str14 = eVar2.f126243b;
                    if (str14 == null) {
                        sQLiteStatement.bindNull(11);
                    } else {
                        sQLiteStatement.bindText(11, str14);
                    }
                    String strE2 = fhl.a.e(eVar2.f126244c);
                    if (strE2 == null) {
                        sQLiteStatement.bindNull(12);
                    } else {
                        sQLiteStatement.bindText(12, strE2);
                    }
                    String strG = fhl.a.g(eVar2.d);
                    if (strG == null) {
                        sQLiteStatement.bindNull(13);
                    } else {
                        sQLiteStatement.bindText(13, strG);
                    }
                } else {
                    o.z(sQLiteStatement, 10, 11, 12, 13);
                }
                s sVar = cVar2.f126230g;
                if (sVar != null) {
                    String str15 = sVar.f126283a;
                    if (str15 == null) {
                        sQLiteStatement.bindNull(14);
                    } else {
                        sQLiteStatement.bindText(14, str15);
                    }
                    String str16 = sVar.f126284b;
                    if (str16 == null) {
                        sQLiteStatement.bindNull(15);
                    } else {
                        sQLiteStatement.bindText(15, str16);
                    }
                    String strE3 = fhl.a.e(sVar.f126285c);
                    if (strE3 == null) {
                        sQLiteStatement.bindNull(16);
                    } else {
                        sQLiteStatement.bindText(16, strE3);
                    }
                    sQLiteStatement.bindDouble(17, sVar.d);
                } else {
                    o.z(sQLiteStatement, 14, 15, 16, 17);
                }
                m mVar = cVar2.f126231h;
                if (mVar != null) {
                    String str17 = mVar.f126265a;
                    if (str17 == null) {
                        sQLiteStatement.bindNull(18);
                    } else {
                        sQLiteStatement.bindText(18, str17);
                    }
                    String str18 = mVar.f126266b;
                    if (str18 == null) {
                        sQLiteStatement.bindNull(19);
                    } else {
                        sQLiteStatement.bindText(19, str18);
                    }
                    iel.n nVar2 = mVar.f126267c;
                    String id12 = nVar2 != null ? nVar2.getId() : null;
                    if (id12 == null) {
                        sQLiteStatement.bindNull(20);
                    } else {
                        sQLiteStatement.bindText(20, id12);
                    }
                } else {
                    o.y(sQLiteStatement, 18, 19, 20);
                }
                u uVar = cVar2.i;
                if (uVar != null) {
                    String str19 = uVar.f126289a;
                    if (str19 == null) {
                        sQLiteStatement.bindNull(21);
                    } else {
                        sQLiteStatement.bindText(21, str19);
                    }
                    String str20 = uVar.f126290b;
                    if (str20 == null) {
                        sQLiteStatement.bindNull(22);
                    } else {
                        sQLiteStatement.bindText(22, str20);
                    }
                    String str21 = uVar.f126291c;
                    if (str21 == null) {
                        sQLiteStatement.bindNull(23);
                    } else {
                        sQLiteStatement.bindText(23, str21);
                    }
                    String str22 = uVar.d;
                    if (str22 == null) {
                        sQLiteStatement.bindNull(24);
                    } else {
                        sQLiteStatement.bindText(24, str22);
                    }
                } else {
                    o.z(sQLiteStatement, 21, 22, 23, 24);
                }
                t tVar = cVar2.f126232j;
                if (tVar != null) {
                    String str23 = tVar.f126286a;
                    if (str23 == null) {
                        sQLiteStatement.bindNull(25);
                    } else {
                        sQLiteStatement.bindText(25, str23);
                    }
                    String str24 = tVar.f126287b;
                    if (str24 == null) {
                        sQLiteStatement.bindNull(26);
                    } else {
                        sQLiteStatement.bindText(26, str24);
                    }
                    String strE4 = fhl.a.e(tVar.f126288c);
                    if (strE4 == null) {
                        sQLiteStatement.bindNull(27);
                    } else {
                        sQLiteStatement.bindText(27, strE4);
                    }
                    String strE5 = fhl.a.e(tVar.d);
                    if (strE5 == null) {
                        sQLiteStatement.bindNull(28);
                    } else {
                        sQLiteStatement.bindText(28, strE5);
                    }
                    sQLiteStatement.bindLong(29, tVar.e);
                    sQLiteStatement.bindLong(30, tVar.f);
                } else {
                    o.z(sQLiteStatement, 25, 26, 27, 28);
                    sQLiteStatement.bindNull(29);
                    sQLiteStatement.bindNull(30);
                }
                ehl.j jVar2 = cVar2.k;
                if (jVar2 != null) {
                    String str25 = jVar2.f126255a;
                    if (str25 == null) {
                        sQLiteStatement.bindNull(31);
                    } else {
                        sQLiteStatement.bindText(31, str25);
                    }
                    String str26 = jVar2.f126256b;
                    if (str26 == null) {
                        sQLiteStatement.bindNull(32);
                    } else {
                        sQLiteStatement.bindText(32, str26);
                    }
                    Long lA3 = fhl.a.a(jVar2.f126257c);
                    if (lA3 == null) {
                        sQLiteStatement.bindNull(33);
                    } else {
                        sQLiteStatement.bindLong(33, lA3.longValue());
                    }
                    Long lA4 = fhl.a.a(jVar2.d);
                    if (lA4 == null) {
                        sQLiteStatement.bindNull(34);
                    } else {
                        sQLiteStatement.bindLong(34, lA4.longValue());
                    }
                    String str27 = jVar2.e;
                    if (str27 == null) {
                        sQLiteStatement.bindNull(35);
                    } else {
                        sQLiteStatement.bindText(35, str27);
                    }
                    String str28 = jVar2.f;
                    if (str28 == null) {
                        sQLiteStatement.bindNull(36);
                    } else {
                        sQLiteStatement.bindText(36, str28);
                    }
                    String str29 = jVar2.f126258g;
                    if (str29 == null) {
                        sQLiteStatement.bindNull(37);
                    } else {
                        sQLiteStatement.bindText(37, str29);
                    }
                } else {
                    o.z(sQLiteStatement, 31, 32, 33, 34);
                    o.y(sQLiteStatement, 35, 36, 37);
                }
                k kVar = cVar2.f126233l;
                if (kVar != null) {
                    String str30 = kVar.f126259a;
                    if (str30 == null) {
                        sQLiteStatement.bindNull(38);
                    } else {
                        sQLiteStatement.bindText(38, str30);
                    }
                    String str31 = kVar.f126260b;
                    if (str31 == null) {
                        sQLiteStatement.bindNull(39);
                    } else {
                        sQLiteStatement.bindText(39, str31);
                    }
                    String strE6 = fhl.a.e(kVar.f126261c);
                    if (strE6 == null) {
                        sQLiteStatement.bindNull(40);
                    } else {
                        sQLiteStatement.bindText(40, strE6);
                    }
                    String strG2 = fhl.a.g(kVar.d);
                    if (strG2 == null) {
                        sQLiteStatement.bindNull(41);
                    } else {
                        sQLiteStatement.bindText(41, strG2);
                    }
                } else {
                    o.z(sQLiteStatement, 38, 39, 40, 41);
                }
                p pVar = cVar2.f126234m;
                if (pVar != null) {
                    String str32 = pVar.f126274a;
                    if (str32 == null) {
                        sQLiteStatement.bindNull(42);
                    } else {
                        sQLiteStatement.bindText(42, str32);
                    }
                    String str33 = pVar.f126275b;
                    if (str33 == null) {
                        sQLiteStatement.bindNull(43);
                    } else {
                        sQLiteStatement.bindText(43, str33);
                    }
                    String strA = fhl.b.a(pVar.f126276c);
                    if (strA == null) {
                        sQLiteStatement.bindNull(44);
                    } else {
                        sQLiteStatement.bindText(44, strA);
                    }
                } else {
                    o.y(sQLiteStatement, 42, 43, 44);
                }
                r rVar = cVar2.f126235n;
                if (rVar != null) {
                    String str34 = rVar.f126280a;
                    if (str34 == null) {
                        sQLiteStatement.bindNull(45);
                    } else {
                        sQLiteStatement.bindText(45, str34);
                    }
                    String str35 = rVar.f126281b;
                    if (str35 == null) {
                        sQLiteStatement.bindNull(46);
                    } else {
                        sQLiteStatement.bindText(46, str35);
                    }
                    String strA2 = fhl.b.a(rVar.f126282c);
                    if (strA2 == null) {
                        sQLiteStatement.bindNull(47);
                    } else {
                        sQLiteStatement.bindText(47, strA2);
                    }
                } else {
                    o.y(sQLiteStatement, 45, 46, 47);
                }
                ehl.a aVar3 = cVar2.o;
                if (aVar3 != null) {
                    String str36 = aVar3.f126222a;
                    if (str36 == null) {
                        sQLiteStatement.bindNull(48);
                    } else {
                        sQLiteStatement.bindText(48, str36);
                    }
                    String str37 = aVar3.f126223b;
                    if (str37 == null) {
                        sQLiteStatement.bindNull(49);
                    } else {
                        sQLiteStatement.bindText(49, str37);
                    }
                } else {
                    sQLiteStatement.bindNull(48);
                    sQLiteStatement.bindNull(49);
                }
                ehl.b bVar11 = cVar2.f126236p;
                if (bVar11 != null) {
                    String str38 = bVar11.f126224a;
                    if (str38 == null) {
                        sQLiteStatement.bindNull(50);
                    } else {
                        sQLiteStatement.bindText(50, str38);
                    }
                    String str39 = bVar11.f126225b;
                    if (str39 == null) {
                        sQLiteStatement.bindNull(51);
                    } else {
                        sQLiteStatement.bindText(51, str39);
                    }
                    String strE7 = fhl.a.e(bVar11.f126226c);
                    if (strE7 == null) {
                        sQLiteStatement.bindNull(52);
                    } else {
                        sQLiteStatement.bindText(52, strE7);
                    }
                    String strB = fhl.a.b(bVar11.d);
                    if (strB == null) {
                        sQLiteStatement.bindNull(53);
                    } else {
                        sQLiteStatement.bindText(53, strB);
                    }
                } else {
                    o.z(sQLiteStatement, 50, 51, 52, 53);
                }
                ehl.l lVar2 = cVar2.f126237q;
                if (lVar2 != null) {
                    String str40 = lVar2.f126262a;
                    if (str40 == null) {
                        sQLiteStatement.bindNull(54);
                    } else {
                        sQLiteStatement.bindText(54, str40);
                    }
                    String str41 = lVar2.f126263b;
                    if (str41 == null) {
                        sQLiteStatement.bindNull(55);
                    } else {
                        sQLiteStatement.bindText(55, str41);
                    }
                    String strE8 = fhl.a.e(lVar2.f126264c);
                    if (strE8 == null) {
                        sQLiteStatement.bindNull(56);
                    } else {
                        sQLiteStatement.bindText(56, strE8);
                    }
                    String strE9 = fhl.a.e(lVar2.d);
                    if (strE9 == null) {
                        sQLiteStatement.bindNull(57);
                    } else {
                        sQLiteStatement.bindText(57, strE9);
                    }
                    String strB2 = fhl.a.b(lVar2.e);
                    if (strB2 == null) {
                        sQLiteStatement.bindNull(58);
                    } else {
                        sQLiteStatement.bindText(58, strB2);
                    }
                    sQLiteStatement.bindLong(59, lVar2.f ? 1L : 0L);
                } else {
                    o.z(sQLiteStatement, 54, 55, 56, 57);
                    sQLiteStatement.bindNull(58);
                    sQLiteStatement.bindNull(59);
                }
                i iVar = cVar2.f126238r;
                if (iVar != null) {
                    String str42 = iVar.f126252a;
                    if (str42 == null) {
                        sQLiteStatement.bindNull(60);
                    } else {
                        sQLiteStatement.bindText(60, str42);
                    }
                    String str43 = iVar.f126253b;
                    if (str43 == null) {
                        sQLiteStatement.bindNull(61);
                    } else {
                        sQLiteStatement.bindText(61, str43);
                    }
                    String strE10 = fhl.a.e(iVar.f126254c);
                    if (strE10 == null) {
                        sQLiteStatement.bindNull(62);
                    } else {
                        sQLiteStatement.bindText(62, strE10);
                    }
                    String strE11 = fhl.a.e(iVar.d);
                    if (strE11 == null) {
                        sQLiteStatement.bindNull(63);
                    } else {
                        sQLiteStatement.bindText(63, strE11);
                    }
                    String strB3 = fhl.a.b(iVar.e);
                    if (strB3 == null) {
                        sQLiteStatement.bindNull(64);
                    } else {
                        sQLiteStatement.bindText(64, strB3);
                    }
                    sQLiteStatement.bindLong(65, iVar.f ? 1L : 0L);
                } else {
                    o.z(sQLiteStatement, 60, 61, 62, 63);
                    sQLiteStatement.bindNull(64);
                    sQLiteStatement.bindNull(65);
                }
                ehl.o oVar = cVar2.f126239s;
                if (oVar == null) {
                    o.z(sQLiteStatement, 66, 67, 68, 69);
                    sQLiteStatement.bindNull(70);
                    sQLiteStatement.bindNull(71);
                } else {
                    String str44 = oVar.f126271a;
                    if (str44 == null) {
                        sQLiteStatement.bindNull(66);
                    } else {
                        sQLiteStatement.bindText(66, str44);
                    }
                    String str45 = oVar.f126272b;
                    if (str45 == null) {
                        sQLiteStatement.bindNull(67);
                    } else {
                        sQLiteStatement.bindText(67, str45);
                    }
                    String strE12 = fhl.a.e(oVar.f126273c);
                    if (strE12 == null) {
                        sQLiteStatement.bindNull(68);
                    } else {
                        sQLiteStatement.bindText(68, strE12);
                    }
                    String strE13 = fhl.a.e(oVar.d);
                    if (strE13 == null) {
                        sQLiteStatement.bindNull(69);
                    } else {
                        sQLiteStatement.bindText(69, strE13);
                    }
                    String strB4 = fhl.a.b(oVar.e);
                    if (strB4 == null) {
                        sQLiteStatement.bindNull(70);
                    } else {
                        sQLiteStatement.bindText(70, strB4);
                    }
                    sQLiteStatement.bindLong(71, oVar.f ? 1L : 0L);
                }
                break;
            case 4:
                ehl.w wVar = (ehl.w) obj2;
                String str46 = wVar.f126297a;
                if (str46 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str46);
                }
                ZonedDateTime zonedDateTime = wVar.f126298b;
                String string = zonedDateTime != null ? zonedDateTime.toString() : null;
                if (string == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, string);
                }
                ZonedDateTime zonedDateTime2 = wVar.f126299c;
                String string2 = zonedDateTime2 != null ? zonedDateTime2.toString() : null;
                if (string2 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, string2);
                }
                ehl.v vVar = wVar.d;
                if (vVar != null) {
                    String str47 = vVar.f126292a;
                    if (str47 == null) {
                        sQLiteStatement.bindNull(4);
                    } else {
                        sQLiteStatement.bindText(4, str47);
                    }
                    String str48 = vVar.f126293b;
                    if (str48 == null) {
                        sQLiteStatement.bindNull(5);
                    } else {
                        sQLiteStatement.bindText(5, str48);
                    }
                    String strG3 = fhl.a.g(vVar.f126294c);
                    if (strG3 == null) {
                        sQLiteStatement.bindNull(6);
                    } else {
                        sQLiteStatement.bindText(6, strG3);
                    }
                    sQLiteStatement.bindDouble(7, vVar.d);
                    String strG4 = fhl.a.g(vVar.e);
                    if (strG4 == null) {
                        sQLiteStatement.bindNull(8);
                    } else {
                        sQLiteStatement.bindText(8, strG4);
                    }
                    String strG5 = fhl.a.g(vVar.f);
                    if (strG5 == null) {
                        sQLiteStatement.bindNull(9);
                    } else {
                        sQLiteStatement.bindText(9, strG5);
                    }
                    String strG6 = fhl.a.g(vVar.f126295g);
                    if (strG6 == null) {
                        sQLiteStatement.bindNull(10);
                    } else {
                        sQLiteStatement.bindText(10, strG6);
                    }
                    String str49 = vVar.f126296h;
                    if (str49 == null) {
                        sQLiteStatement.bindNull(11);
                    } else {
                        sQLiteStatement.bindText(11, str49);
                    }
                } else {
                    o.z(sQLiteStatement, 4, 5, 6, 7);
                    o.z(sQLiteStatement, 8, 9, 10, 11);
                }
                ehl.d dVar2 = wVar.e;
                if (dVar2 != null) {
                    String strG7 = fhl.a.g(dVar2.f126240a);
                    if (strG7 == null) {
                        sQLiteStatement.bindNull(12);
                    } else {
                        sQLiteStatement.bindText(12, strG7);
                    }
                    String str50 = dVar2.f126241b;
                    if (str50 == null) {
                        sQLiteStatement.bindNull(13);
                    } else {
                        sQLiteStatement.bindText(13, str50);
                    }
                } else {
                    sQLiteStatement.bindNull(12);
                    sQLiteStatement.bindNull(13);
                }
                ehl.g gVar = wVar.f;
                if (gVar != null) {
                    String str51 = gVar.f126246a;
                    if (str51 == null) {
                        sQLiteStatement.bindNull(14);
                    } else {
                        sQLiteStatement.bindText(14, str51);
                    }
                    String str52 = gVar.f126247b;
                    if (str52 == null) {
                        sQLiteStatement.bindNull(15);
                    } else {
                        sQLiteStatement.bindText(15, str52);
                    }
                    String strG8 = fhl.a.g(gVar.f126248c);
                    if (strG8 == null) {
                        sQLiteStatement.bindNull(16);
                    } else {
                        sQLiteStatement.bindText(16, strG8);
                    }
                } else {
                    o.y(sQLiteStatement, 14, 15, 16);
                }
                ehl.h hVar2 = wVar.f126300g;
                if (hVar2 != null) {
                    String str53 = hVar2.f126249a;
                    if (str53 == null) {
                        sQLiteStatement.bindNull(17);
                    } else {
                        sQLiteStatement.bindText(17, str53);
                    }
                    String str54 = hVar2.f126250b;
                    if (str54 == null) {
                        sQLiteStatement.bindNull(18);
                    } else {
                        sQLiteStatement.bindText(18, str54);
                    }
                    String strG9 = fhl.a.g(hVar2.f126251c);
                    if (strG9 == null) {
                        sQLiteStatement.bindNull(19);
                    } else {
                        sQLiteStatement.bindText(19, strG9);
                    }
                } else {
                    o.y(sQLiteStatement, 17, 18, 19);
                }
                f fVar = wVar.f126301h;
                if (fVar == null) {
                    sQLiteStatement.bindNull(20);
                } else {
                    String strG10 = fhl.a.g(fVar.f126245a);
                    if (strG10 != null) {
                        sQLiteStatement.bindText(20, strG10);
                    } else {
                        sQLiteStatement.bindNull(20);
                    }
                }
                break;
            case 5:
                a(sQLiteStatement, obj2);
                break;
            case 6:
                cek.b bVar12 = (cek.b) obj2;
                String str55 = bVar12.f23486a;
                if (str55 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str55);
                }
                String str56 = bVar12.f23487b;
                if (str56 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str56);
                }
                String str57 = bVar12.f23488c;
                if (str57 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, str57);
                }
                String str58 = bVar12.d;
                if (str58 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, str58);
                }
                String str59 = bVar12.e;
                if (str59 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, str59);
                }
                String str60 = bVar12.f;
                if (str60 == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, str60);
                }
                so3.c cVar3 = bVar12.f23489g;
                if (cVar3 != null) {
                    strK2 = GsonHolder.a().k(cVar3);
                    Intrinsics.checkNotNullExpressionValue(strK2, "toJson(...)");
                } else {
                    strK2 = null;
                }
                if (strK2 == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindText(7, strK2);
                }
                sQLiteStatement.bindDouble(8, bVar12.f23490h);
                break;
            case 7:
                dy9.b bVar13 = (dy9.b) obj2;
                String str61 = bVar13.f121078a;
                if (str61 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str61);
                }
                dy9.c cVar4 = bVar13.f121079b;
                String strK16 = null;
                if (cVar4 != null) {
                    strK3 = com.revolut.feature.payments.recipients.settings.impl.data.GsonHolder.a().k(cVar4);
                    Intrinsics.checkNotNullExpressionValue(strK3, "toJson(...)");
                } else {
                    strK3 = null;
                }
                if (strK3 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, strK3);
                }
                List list = bVar13.f121080c;
                if (list != null) {
                    strK16 = com.revolut.feature.payments.recipients.settings.impl.data.GsonHolder.a().k(list);
                    Intrinsics.checkNotNullExpressionValue(strK16, "toJson(...)");
                }
                if (strK16 != null) {
                    sQLiteStatement.bindText(3, strK16);
                } else {
                    sQLiteStatement.bindNull(3);
                }
                break;
            case 8:
                hcl.i iVar2 = (hcl.i) obj2;
                String str62 = iVar2.f151007a;
                if (str62 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str62);
                }
                String str63 = iVar2.f151008b;
                if (str63 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str63);
                }
                String str64 = iVar2.f151009c;
                if (str64 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, str64);
                }
                hcl.e eVar3 = iVar2.d;
                String strK17 = null;
                if (eVar3 != null) {
                    strK4 = zbl.a.a().k(eVar3);
                    Intrinsics.checkNotNullExpressionValue(strK4, "toJson(...)");
                } else {
                    strK4 = null;
                }
                if (strK4 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, strK4);
                }
                hcl.f fVar2 = iVar2.e;
                if (fVar2 != null) {
                    strK5 = zbl.a.a().k(fVar2);
                    Intrinsics.checkNotNullExpressionValue(strK5, "toJson(...)");
                } else {
                    strK5 = null;
                }
                if (strK5 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, strK5);
                }
                hcl.d dVar3 = iVar2.f;
                if (dVar3 != null) {
                    strK6 = zbl.a.a().k(dVar3);
                    Intrinsics.checkNotNullExpressionValue(strK6, "toJson(...)");
                } else {
                    strK6 = null;
                }
                if (strK6 == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, strK6);
                }
                hcl.g gVar2 = iVar2.f151010g;
                if (gVar2 != null) {
                    strK7 = zbl.a.a().k(gVar2);
                    Intrinsics.checkNotNullExpressionValue(strK7, "toJson(...)");
                } else {
                    strK7 = null;
                }
                if (strK7 == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindText(7, strK7);
                }
                hcl.h hVar3 = iVar2.f151011h;
                if (hVar3 != null) {
                    strK8 = zbl.a.a().k(hVar3);
                    Intrinsics.checkNotNullExpressionValue(strK8, "toJson(...)");
                } else {
                    strK8 = null;
                }
                if (strK8 == null) {
                    sQLiteStatement.bindNull(8);
                } else {
                    sQLiteStatement.bindText(8, strK8);
                }
                hcl.c cVar5 = iVar2.i;
                if (cVar5 != null) {
                    strK17 = zbl.a.a().k(cVar5);
                    Intrinsics.checkNotNullExpressionValue(strK17, "toJson(...)");
                }
                if (strK17 != null) {
                    sQLiteStatement.bindText(9, strK17);
                } else {
                    sQLiteStatement.bindNull(9);
                }
                break;
            case 9:
                pcl.e eVar4 = (pcl.e) obj2;
                String str65 = eVar4.f234945a;
                if (str65 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str65);
                }
                pcl.a aVar4 = eVar4.f234946b;
                String strK18 = null;
                if (aVar4 != null) {
                    strK9 = zbl.a.a().k(aVar4);
                    Intrinsics.checkNotNullExpressionValue(strK9, "toJson(...)");
                } else {
                    strK9 = null;
                }
                if (strK9 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, strK9);
                }
                pcl.b bVar14 = eVar4.f234947c;
                if (bVar14 != null) {
                    strK10 = zbl.a.a().k(bVar14);
                    Intrinsics.checkNotNullExpressionValue(strK10, "toJson(...)");
                } else {
                    strK10 = null;
                }
                if (strK10 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, strK10);
                }
                pcl.d dVar4 = eVar4.d;
                if (dVar4 != null) {
                    strK11 = zbl.a.a().k(dVar4);
                    Intrinsics.checkNotNullExpressionValue(strK11, "toJson(...)");
                } else {
                    strK11 = null;
                }
                if (strK11 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, strK11);
                }
                pcl.c cVar6 = eVar4.e;
                if (cVar6 != null) {
                    strK18 = zbl.a.a().k(cVar6);
                    Intrinsics.checkNotNullExpressionValue(strK18, "toJson(...)");
                }
                if (strK18 != null) {
                    sQLiteStatement.bindText(5, strK18);
                } else {
                    sQLiteStatement.bindNull(5);
                }
                break;
            case 10:
                hcl.k kVar2 = (hcl.k) obj2;
                String str66 = kVar2.f151026a;
                if (str66 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str66);
                }
                String str67 = kVar2.f151027b;
                if (str67 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str67);
                }
                String str68 = kVar2.f151028c;
                if (str68 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, str68);
                }
                String str69 = kVar2.d;
                if (str69 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, str69);
                }
                String str70 = kVar2.e;
                if (str70 != null) {
                    sQLiteStatement.bindText(5, str70);
                } else {
                    sQLiteStatement.bindNull(5);
                }
                break;
            case 11:
                hcl.m mVar2 = (hcl.m) obj2;
                String str71 = mVar2.f151066a;
                if (str71 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str71);
                }
                String str72 = mVar2.f151067b;
                if (str72 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str72);
                }
                String str73 = mVar2.f151068c;
                if (str73 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, str73);
                }
                String str74 = mVar2.d;
                if (str74 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, str74);
                }
                hcl.o oVar2 = mVar2.e;
                String strK19 = null;
                if (oVar2 != null) {
                    strK12 = zbl.a.a().k(oVar2);
                    Intrinsics.checkNotNullExpressionValue(strK12, "toJson(...)");
                } else {
                    strK12 = null;
                }
                if (strK12 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, strK12);
                }
                hcl.n nVar3 = mVar2.f;
                if (nVar3 != null) {
                    strK13 = zbl.a.a().k(nVar3);
                    Intrinsics.checkNotNullExpressionValue(strK13, "toJson(...)");
                } else {
                    strK13 = null;
                }
                if (strK13 == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, strK13);
                }
                String str75 = mVar2.f151069g;
                if (str75 == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindText(7, str75);
                }
                String str76 = mVar2.f151070h;
                if (str76 == null) {
                    sQLiteStatement.bindNull(8);
                } else {
                    sQLiteStatement.bindText(8, str76);
                }
                List list2 = mVar2.i;
                if (list2 != null) {
                    strK19 = zbl.a.a().k(list2);
                    Intrinsics.checkNotNullExpressionValue(strK19, "toJson(...)");
                }
                if (strK19 != null) {
                    sQLiteStatement.bindText(9, strK19);
                } else {
                    sQLiteStatement.bindNull(9);
                }
                break;
            case 12:
                b(sQLiteStatement, obj2);
                break;
            case 13:
                c(sQLiteStatement, obj2);
                break;
            case 14:
                d(sQLiteStatement, obj2);
                break;
            case 15:
                e(sQLiteStatement, obj2);
                break;
            case 16:
                f(sQLiteStatement, obj2);
                break;
            case 17:
                g(sQLiteStatement, obj2);
                break;
            case 18:
                h(sQLiteStatement, obj2);
                break;
            case 19:
                i(sQLiteStatement, obj2);
                break;
            case 20:
                j(sQLiteStatement, obj2);
                break;
            case 21:
                k(sQLiteStatement, obj2);
                break;
            case 22:
                l(sQLiteStatement, obj2);
                break;
            case 23:
                m(sQLiteStatement, obj2);
                break;
            case 24:
                n(sQLiteStatement, obj2);
                break;
            case 25:
                o(sQLiteStatement, obj2);
                break;
            case 26:
                p(sQLiteStatement, obj2);
                break;
            case 27:
                q(sQLiteStatement, obj2);
                break;
            case 28:
                r(sQLiteStatement, obj2);
                break;
            default:
                x1 x1Var = (x1) obj2;
                String str77 = x1Var.f151215a;
                if (str77 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str77);
                }
                String str78 = x1Var.f151216b;
                if (str78 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str78);
                }
                String str79 = x1Var.f151217c;
                if (str79 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, str79);
                }
                y1 y1Var = x1Var.d;
                if (y1Var != null) {
                    strK14 = zbl.a.a().k(y1Var);
                    Intrinsics.checkNotNullExpressionValue(strK14, "toJson(...)");
                } else {
                    strK14 = null;
                }
                if (strK14 != null) {
                    sQLiteStatement.bindText(4, strK14);
                } else {
                    sQLiteStatement.bindNull(4);
                }
                break;
        }
    }

    @Override // androidx.room.EntityInsertAdapter
    public final String createQuery() {
        switch (this.f8730a) {
            case 0:
                return "INSERT OR REPLACE INTO `stock_financials` (`ref`,`year`,`interimPeriod`,`identifier`,`margin`,`revenue_amount`,`revenue_currency`,`netIncome_amount`,`netIncome_currency`,`debtToAssets`,`assets_amount`,`assets_currency`,`liabilities_amount`,`liabilities_currency`,`operating_amount`,`operating_currency`,`investing_amount`,`investing_currency`,`financing_amount`,`financing_currency`,`freeCashFlow_amount`,`freeCashFlow_currency`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `stock_financials_statements` (`ref`,`type`,`year`,`quarter`,`statementItems`,`quarterId`) VALUES (?,?,?,?,?,?)";
            case 2:
                return "INSERT OR REPLACE INTO `recurring_split` (`id`,`state`,`participants_splits`,`comment`,`created_date`,`updated_date`,`source_type`,`source_reference_id`) VALUES (?,?,?,?,?,?,?,?)";
            case 3:
                return "INSERT OR REPLACE INTO `calendar_events` (`eventId`,`type`,`effective_date`,`is_my_event`,`market_holiday_holiday`,`market_holiday_name`,`market_holiday_marketClosed`,`market_holiday_marketOpenTime`,`market_holiday_marketCloseTime`,`cash_dividend_symbol`,`cash_dividend_ref`,`cash_dividend_exDividendDate`,`cash_dividend_amount`,`stock_dividend_symbol`,`stock_dividend_ref`,`stock_dividend_exDividendDate`,`stock_dividend_quantity`,`listing_status_symbol`,`listing_status_ref`,`listing_status_status`,`symbol_change_symbol`,`symbol_change_ref`,`symbol_change_oldSymbol`,`symbol_change_newSymbol`,`stock_split_symbol`,`stock_split_ref`,`stock_split_exDividendDate`,`stock_split_paymentDate`,`stock_split_before`,`stock_split_after`,`earnings_call_symbol`,`earnings_call_ref`,`earnings_call_webcastStartDate`,`earnings_call_webcastEndDate`,`earnings_call_webcastUri`,`earnings_call_replayWebcastUri`,`earnings_call_transcriptUri`,`ex_dividend_symbol`,`ex_dividend_ref`,`ex_dividend_paymentDate`,`ex_dividend_amount`,`merger_symbol`,`merger_ref`,`merger_details`,`spinoff_symbol`,`spinoff_ref`,`spinoff_details`,`bankruptcy_symbol`,`bankruptcy_ref`,`bond_coupon_symbol`,`bond_coupon_ref`,`bond_coupon_paymentDate`,`bond_coupon_couponAmount`,`interest_payment_symbol`,`interest_payment_ref`,`interest_payment_paymentDate`,`interest_payment_observationDate`,`interest_payment_amountPerNominal`,`interest_payment_isConfirmed`,`early_redemption_symbol`,`early_redemption_ref`,`early_redemption_paymentDate`,`early_redemption_observationDate`,`early_redemption_amountPerNominal`,`early_redemption_isConfirmed`,`maturity_redemption_symbol`,`maturity_redemption_ref`,`maturity_redemption_paymentDate`,`maturity_redemption_observationDate`,`maturity_redemption_amountPerNominal`,`maturity_redemption_isConfirmed`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 4:
                return "INSERT OR REPLACE INTO `entities_adt` (`id`,`completed_date`,`updated_date`,`trade_symbol`,`trade_ref`,`trade_amount`,`trade_quantity`,`trade_fees`,`trade_commission`,`trade_executed_price`,`trade_side`,`cash_amount`,`cash_side`,`dividend_symbol`,`dividend_ref`,`dividend_amount`,`dividend_tax_symbol`,`dividend_tax_ref`,`dividend_tax_fees`,`custody_fees`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 5:
                return "INSERT OR REPLACE INTO `upcoming_events` (`eventId`,`type`,`effective_date`,`market_holiday_holiday`,`market_holiday_name`,`market_holiday_marketClosed`,`market_holiday_marketOpenTime`,`market_holiday_marketCloseTime`,`cash_dividend_symbol`,`cash_dividend_ref`,`cash_dividend_exDividendDate`,`cash_dividend_amount`,`stock_dividend_symbol`,`stock_dividend_ref`,`stock_dividend_exDividendDate`,`stock_dividend_quantity`,`listing_status_symbol`,`listing_status_ref`,`listing_status_status`,`symbol_change_symbol`,`symbol_change_ref`,`symbol_change_oldSymbol`,`symbol_change_newSymbol`,`stock_split_symbol`,`stock_split_ref`,`stock_split_exDividendDate`,`stock_split_paymentDate`,`stock_split_before`,`stock_split_after`,`earnings_call_symbol`,`earnings_call_ref`,`earnings_call_webcastStartDate`,`earnings_call_webcastEndDate`,`earnings_call_webcastUri`,`earnings_call_replayWebcastUri`,`earnings_call_transcriptUri`,`ex_dividend_symbol`,`ex_dividend_ref`,`ex_dividend_paymentDate`,`ex_dividend_amount`,`merger_symbol`,`merger_ref`,`merger_details`,`spinoff_symbol`,`spinoff_ref`,`spinoff_details`,`bankruptcy_symbol`,`bankruptcy_ref`,`bond_coupon_symbol`,`bond_coupon_ref`,`bond_coupon_paymentDate`,`bond_coupon_couponAmount`,`interest_payment_symbol`,`interest_payment_ref`,`interest_payment_paymentDate`,`interest_payment_observationDate`,`interest_payment_amountPerNominal`,`interest_payment_isConfirmed`,`early_redemption_symbol`,`early_redemption_ref`,`early_redemption_paymentDate`,`early_redemption_observationDate`,`early_redemption_amountPerNominal`,`early_redemption_isConfirmed`,`maturity_redemption_symbol`,`maturity_redemption_ref`,`maturity_redemption_paymentDate`,`maturity_redemption_observationDate`,`maturity_redemption_amountPerNominal`,`maturity_redemption_isConfirmed`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 6:
                return "INSERT OR ABORT INTO `pod_nominees` (`id`,`firstName`,`lastName`,`displayName`,`dateOfBirth`,`email`,`address`,`percentage`) VALUES (?,?,?,?,?,?,?,?)";
            case 7:
                return "INSERT OR REPLACE INTO `recipient_settings` (`id`,`type`,`settings`) VALUES (?,?,?)";
            case 8:
                return "INSERT OR REPLACE INTO `bond_details` (`ref`,`symbol`,`stock_exchange_code`,`issue`,`issuer`,`coupon`,`primary_stats`,`ratings`,`callability`) VALUES (?,?,?,?,?,?,?,?,?)";
            case 9:
                return "INSERT OR REPLACE INTO `bond_stats` (`ref`,`price`,`primaryStats`,`yieldStats`,`riskStats`) VALUES (?,?,?,?,?)";
            case 10:
                return "INSERT OR REPLACE INTO `cfd_details` (`ref`,`symbol`,`stock_exchange_code`,`description`,`kidUrl`) VALUES (?,?,?,?,?)";
            case 11:
                return "INSERT OR REPLACE INTO `etf_details` (`ref`,`symbol`,`description`,`stockExchangeCode`,`stats`,`exposure`,`prospectusUrl`,`kidUrl`,`tags`) VALUES (?,?,?,?,?,?,?,?,?)";
            case 12:
                return "INSERT OR REPLACE INTO `etf_stats` (`ref`,`price`,`marketCapitalization`,`dividends`,`expenseRatios`,`managementFees`,`charges`,`riskRating`) VALUES (?,?,?,?,?,?,?,?)";
            case 13:
                return "INSERT OR REPLACE INTO `fund_details` (`ref`,`symbol`,`exchange`,`fundHouse`,`fundManager`,`performance`,`documents`,`keyDetails`,`exposure`,`concentration`) VALUES (?,?,?,?,?,?,?,?,?,?)";
            case 14:
                return "INSERT OR REPLACE INTO `holdings` (`id`,`portfolio_id`,`creation_date`,`holding_state`,`name`,`currency`,`cash_holding`,`stock_holding`) VALUES (?,?,?,?,?,?,?,?)";
            case 15:
                return "INSERT OR REPLACE INTO `candle_sticks` (`ref`,`period`,`open`,`close`,`high`,`low`,`volume`,`from`,`to`,`startClose`,`endClose`,`baseline`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
            case 16:
                return "INSERT OR REPLACE INTO `instrument_drawdown` (`ref`,`timespan`,`interval`,`drawdownMax`,`referenceDrawdownMax`) VALUES (?,?,?,?,?)";
            case 17:
                return "INSERT OR REPLACE INTO `instrument_governance` (`ref`,`targetMarket`) VALUES (?,?)";
            case 18:
                return "INSERT OR REPLACE INTO `stocks_historical_rates` (`ref`,`period`,`timestamp`,`valueType`,`price`,`percentageYtm`) VALUES (?,?,?,?,?,?)";
            case 19:
                return "INSERT OR REPLACE INTO `instrument_details_recommendations` (`ref`,`recommendations`) VALUES (?,?)";
            case 20:
                return "INSERT OR REPLACE INTO `instrument_tickers_summary` (`ref`,`volume`,`unitVolume`,`dailyRange`,`fiftyTwoWeekRange`,`fiveYearRange`,`highlyVolatile`) VALUES (?,?,?,?,?,?,?)";
            case 21:
                return "INSERT OR REPLACE INTO `instrument_tickers` (`ref`,`symbol`,`type`,`price`,`pricePrecise`,`lastClean`,`halted`,`status`,`delayed`,`previous`,`previousPrecise`,`next_open_utc_timestamp`,`updatedAt`,`previousClose`,`previousClosePrecise`,`baseline`,`lastClose`,`lastClosePrecise`,`lastBid`,`lastAsk`,`tradingSession`,`lastYtm`,`lastCloseYtm`,`previousYtm`,`previousCloseYtm`,`tickerType`,`lastFmv`,`fmvUpdatedAt`,`lastMid`,`lastBidSize`,`lastAskSize`,`dayVolume`,`openInterest`,`impliedVolatility`,`delta`,`gamma`,`theta`,`vega`,`probabilityOfProfit`,`breakEven`,`effectiveLeverage`,`contractSize`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 22:
                return "INSERT OR IGNORE INTO `instruments` (`id`,`ref`,`type`,`name`,`symbol`,`stateDetails`,`requiredProducts`,`typeSpecificProperties`,`currency`,`sortOrder`,`isin`,`exchange`,`shortOverview`,`quantityDecimalPlaces`,`priceDecimalPlaces`,`allSymbols`,`underlying_currency`,`promotion_campaigns`,`list_status`,`state_reason`,`delist_date`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 23:
                return "INSERT OR REPLACE INTO `recently_viewed_instrument` (`ref`,`last_seen`) VALUES (?,?)";
            case 24:
                return "INSERT INTO `instruments` (`id`,`ref`,`type`,`name`,`symbol`,`stateDetails`,`requiredProducts`,`typeSpecificProperties`,`currency`,`sortOrder`,`isin`,`exchange`,`shortOverview`,`quantityDecimalPlaces`,`priceDecimalPlaces`,`allSymbols`,`underlying_currency`,`promotion_campaigns`,`list_status`,`state_reason`,`delist_date`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 25:
                return "INSERT OR REPLACE INTO `instrument_details` (`ref`,`symbol`,`description`,`stockExchangeCode`,`stats`,`sector`,`type`,`analystsSummary`,`tags`) VALUES (?,?,?,?,?,?,?,?,?)";
            case 26:
                return "INSERT OR REPLACE INTO `instrument_stats` (`ref`,`price`,`volume`,`marketCap`,`perShare`,`dividend`,`valuation`,`profitability`,`managementEffectiveness`,`listingData`) VALUES (?,?,?,?,?,?,?,?,?,?)";
            case 27:
                return "INSERT OR REPLACE INTO `ipo_instrument_details` (`ref`,`launchDate`,`cancellationDeadline`,`disclaimerWorkflowId`,`acknowledgementWorkflowId`,`priceRangeLow`,`priceRangeHigh`,`bookBuildingAvailable`,`documents`,`details`,`sections`,`finalPriceDate`,`barChartDetails`,`lineChartDetails`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 28:
                return "INSERT OR REPLACE INTO `ipo_instrument_summary` (`ref`,`launchDate`,`cancellationDeadline`,`disclaimerWorkflowId`,`acknowledgementWorkflowId`,`priceRangeLow`,`priceRangeHigh`,`finalPriceDate`) VALUES (?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR REPLACE INTO `mutual_fund_details` (`ref`,`symbol`,`exchange`,`documents`) VALUES (?,?,?,?)";
        }
    }

    public /* synthetic */ c(Object obj2, int i) {
        this.f8730a = i;
    }
}
