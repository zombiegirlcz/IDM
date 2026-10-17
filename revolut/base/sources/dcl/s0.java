package dcl;

import androidx.room.EntityInsertAdapter;
import androidx.sqlite.SQLiteStatement;
import com.revolut.data.utils.gson.GsonHolder;
import hcl.a2;
import hcl.b2;
import hcl.c2;
import hcl.d2;
import hcl.h2;
import hcl.i2;
import hcl.k2;
import hcl.o2;
import hcl.t2;
import hcl.z1;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import jz8.c1;
import jz8.z0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import org.joda.time.DateTime;
import u09.v;

/* JADX INFO: loaded from: classes12.dex */
public final class s0 extends EntityInsertAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f113054a;

    public /* synthetic */ s0(int i) {
        this.f113054a = i;
    }

    private final void a(SQLiteStatement sQLiteStatement, Object obj2) {
        jz8.n nVar = (jz8.n) obj2;
        String str = nVar.f179641a;
        if (str == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, str);
        }
        String str2 = nVar.f179642b;
        if (str2 == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindText(2, str2);
        }
        String str3 = nVar.f179643c;
        if (str3 == null) {
            sQLiteStatement.bindNull(3);
        } else {
            sQLiteStatement.bindText(3, str3);
        }
        u09.v domain = nVar.d;
        Intrinsics.checkNotNullParameter(domain, "domain");
        String strName = domain.name();
        if (strName == null) {
            sQLiteStatement.bindNull(4);
        } else {
            sQLiteStatement.bindText(4, strName);
        }
        sQLiteStatement.bindLong(5, nVar.e);
    }

    private final void b(SQLiteStatement sQLiteStatement, Object obj2) {
        i7h.d dVar = (i7h.d) obj2;
        String str = dVar.f159305a;
        if (str == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, str);
        }
        String str2 = dVar.f159306b;
        if (str2 == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindText(2, str2);
        }
        String str3 = dVar.f159307c;
        if (str3 == null) {
            sQLiteStatement.bindNull(3);
        } else {
            sQLiteStatement.bindText(3, str3);
        }
        String str4 = dVar.d;
        if (str4 == null) {
            sQLiteStatement.bindNull(4);
        } else {
            sQLiteStatement.bindText(4, str4);
        }
        String str5 = dVar.e;
        if (str5 == null) {
            sQLiteStatement.bindNull(5);
        } else {
            sQLiteStatement.bindText(5, str5);
        }
        LocalDate localDate = dVar.f;
        Intrinsics.checkNotNullParameter(localDate, "localDate");
        String string = localDate.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        if (string == null) {
            sQLiteStatement.bindNull(6);
        } else {
            sQLiteStatement.bindText(6, string);
        }
        LocalDate localDate2 = dVar.f159308g;
        Intrinsics.checkNotNullParameter(localDate2, "localDate");
        String string2 = localDate2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        if (string2 == null) {
            sQLiteStatement.bindNull(7);
        } else {
            sQLiteStatement.bindText(7, string2);
        }
        Instant instant = dVar.f159309h;
        Intrinsics.checkNotNullParameter(instant, "instant");
        sQLiteStatement.bindLong(8, instant.toEpochMilli());
        jo3.b bVar = dVar.i;
        if (a10.b.v(bVar, sQLiteStatement, 9) == null) {
            sQLiteStatement.bindNull(10);
        } else {
            sQLiteStatement.bindText(10, bVar.getCurrency());
        }
    }

    private final void c(SQLiteStatement sQLiteStatement, Object obj2) {
        ks6.t tVar = (ks6.t) obj2;
        String str = tVar.f189256a;
        if (str == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, str);
        }
        String str2 = tVar.f189257b;
        if (str2 == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindText(2, str2);
        }
        sQLiteStatement.bindLong(3, tVar.f189258c ? 1L : 0L);
        String str3 = tVar.d;
        if (str3 == null) {
            sQLiteStatement.bindNull(4);
        } else {
            sQLiteStatement.bindText(4, str3);
        }
        String str4 = tVar.e;
        if (str4 == null) {
            sQLiteStatement.bindNull(5);
        } else {
            sQLiteStatement.bindText(5, str4);
        }
        String str5 = tVar.f;
        if (str5 == null) {
            sQLiteStatement.bindNull(6);
        } else {
            sQLiteStatement.bindText(6, str5);
        }
    }

    private final void d(SQLiteStatement sQLiteStatement, Object obj2) {
        String strK;
        ks6.v vVar = (ks6.v) obj2;
        String str = vVar.f189270a;
        if (str == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, str);
        }
        String str2 = vVar.f189271b;
        if (str2 == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindText(2, str2);
        }
        String str3 = vVar.f189272c;
        if (str3 == null) {
            sQLiteStatement.bindNull(3);
        } else {
            sQLiteStatement.bindText(3, str3);
        }
        String str4 = vVar.d;
        if (str4 == null) {
            sQLiteStatement.bindNull(4);
        } else {
            sQLiteStatement.bindText(4, str4);
        }
        String str5 = vVar.e;
        if (str5 == null) {
            sQLiteStatement.bindNull(5);
        } else {
            sQLiteStatement.bindText(5, str5);
        }
        so3.c cVar = vVar.f;
        if (cVar != null) {
            strK = GsonHolder.a().k(cVar);
            Intrinsics.checkNotNullExpressionValue(strK, "toJson(...)");
        } else {
            strK = null;
        }
        if (strK == null) {
            sQLiteStatement.bindNull(6);
        } else {
            sQLiteStatement.bindText(6, strK);
        }
        sQLiteStatement.bindLong(7, vVar.f189273g);
        sQLiteStatement.bindLong(8, vVar.f189274h);
    }

    @Override // androidx.room.EntityInsertAdapter
    public final void bind(SQLiteStatement sQLiteStatement, Object obj2) throws IOException {
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
        String strK15;
        String strK16;
        String strC;
        String strC2;
        String strC3;
        String strC4;
        switch (this.f113054a) {
            case 0:
                t2 t2Var = (t2) obj2;
                String str = t2Var.f151163a;
                if (str == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str);
                }
                String str2 = t2Var.f151164b;
                if (str2 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str2);
                }
                String str3 = t2Var.f151165c;
                if (str3 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, str3);
                }
                String str4 = t2Var.d;
                if (str4 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, str4);
                }
                h2 h2Var = t2Var.e;
                String strK17 = null;
                if (h2Var != null) {
                    strK = zbl.a.a().k(h2Var);
                    Intrinsics.checkNotNullExpressionValue(strK, "toJson(...)");
                } else {
                    strK = null;
                }
                if (strK == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, strK);
                }
                b2 b2Var = t2Var.f;
                if (b2Var != null) {
                    strK2 = zbl.a.a().k(b2Var);
                    Intrinsics.checkNotNullExpressionValue(strK2, "toJson(...)");
                } else {
                    strK2 = null;
                }
                if (strK2 == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, strK2);
                }
                z1 z1Var = t2Var.f151166g;
                if (z1Var != null) {
                    strK3 = zbl.a.a().k(z1Var);
                    Intrinsics.checkNotNullExpressionValue(strK3, "toJson(...)");
                } else {
                    strK3 = null;
                }
                if (strK3 == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindText(7, strK3);
                }
                a2 a2Var = t2Var.f151167h;
                if (a2Var != null) {
                    strK4 = zbl.a.a().k(a2Var);
                    Intrinsics.checkNotNullExpressionValue(strK4, "toJson(...)");
                } else {
                    strK4 = null;
                }
                if (strK4 == null) {
                    sQLiteStatement.bindNull(8);
                } else {
                    sQLiteStatement.bindText(8, strK4);
                }
                c2 c2Var = t2Var.i;
                if (c2Var != null) {
                    strK5 = zbl.a.a().k(c2Var);
                    Intrinsics.checkNotNullExpressionValue(strK5, "toJson(...)");
                } else {
                    strK5 = null;
                }
                if (strK5 == null) {
                    sQLiteStatement.bindNull(9);
                } else {
                    sQLiteStatement.bindText(9, strK5);
                }
                List list = t2Var.f151168j;
                if (list != null) {
                    strK6 = zbl.a.a().k(list);
                    Intrinsics.checkNotNullExpressionValue(strK6, "toJson(...)");
                } else {
                    strK6 = null;
                }
                if (strK6 == null) {
                    sQLiteStatement.bindNull(10);
                } else {
                    sQLiteStatement.bindText(10, strK6);
                }
                List list2 = t2Var.k;
                if (list2 != null) {
                    strK7 = zbl.a.a().k(list2);
                    Intrinsics.checkNotNullExpressionValue(strK7, "toJson(...)");
                } else {
                    strK7 = null;
                }
                if (strK7 == null) {
                    sQLiteStatement.bindNull(11);
                } else {
                    sQLiteStatement.bindText(11, strK7);
                }
                d2 d2Var = t2Var.f151169l;
                if (d2Var != null) {
                    strK8 = zbl.a.a().k(d2Var);
                    Intrinsics.checkNotNullExpressionValue(strK8, "toJson(...)");
                } else {
                    strK8 = null;
                }
                if (strK8 == null) {
                    sQLiteStatement.bindNull(12);
                } else {
                    sQLiteStatement.bindText(12, strK8);
                }
                String strG = qcl.d.g(t2Var.f151170m);
                if (strG == null) {
                    sQLiteStatement.bindNull(13);
                } else {
                    sQLiteStatement.bindText(13, strG);
                }
                List list3 = t2Var.f151171n;
                if (list3 != null) {
                    strK9 = zbl.a.a().k(list3);
                    Intrinsics.checkNotNullExpressionValue(strK9, "toJson(...)");
                } else {
                    strK9 = null;
                }
                if (strK9 == null) {
                    sQLiteStatement.bindNull(14);
                } else {
                    sQLiteStatement.bindText(14, strK9);
                }
                k2 k2Var = t2Var.o;
                if (k2Var != null) {
                    strK10 = zbl.a.a().k(k2Var);
                    Intrinsics.checkNotNullExpressionValue(strK10, "toJson(...)");
                } else {
                    strK10 = null;
                }
                if (strK10 == null) {
                    sQLiteStatement.bindNull(15);
                } else {
                    sQLiteStatement.bindText(15, strK10);
                }
                List list4 = t2Var.f151172p;
                if (list4 != null) {
                    strK11 = zbl.a.a().k(list4);
                    Intrinsics.checkNotNullExpressionValue(strK11, "toJson(...)");
                } else {
                    strK11 = null;
                }
                if (strK11 == null) {
                    sQLiteStatement.bindNull(16);
                } else {
                    sQLiteStatement.bindText(16, strK11);
                }
                i2 i2Var = t2Var.f151173q;
                if (i2Var != null) {
                    strK12 = zbl.a.a().k(i2Var);
                    Intrinsics.checkNotNullExpressionValue(strK12, "toJson(...)");
                } else {
                    strK12 = null;
                }
                if (strK12 == null) {
                    sQLiteStatement.bindNull(17);
                } else {
                    sQLiteStatement.bindText(17, strK12);
                }
                o2 o2Var = t2Var.f151174r;
                if (o2Var != null) {
                    strK17 = zbl.a.a().k(o2Var);
                    Intrinsics.checkNotNullExpressionValue(strK17, "toJson(...)");
                }
                if (strK17 == null) {
                    sQLiteStatement.bindNull(18);
                } else {
                    sQLiteStatement.bindText(18, strK17);
                }
                break;
            case 1:
                kcl.b bVar = (kcl.b) obj2;
                String str5 = bVar.f182740a;
                if (str5 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str5);
                }
                String str6 = bVar.f182741b;
                if (str6 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str6);
                }
                List list5 = bVar.f182742c;
                if (list5 != null) {
                    strK13 = zbl.a.a().k(list5);
                    Intrinsics.checkNotNullExpressionValue(strK13, "toJson(...)");
                } else {
                    strK13 = null;
                }
                if (strK13 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, strK13);
                }
                String strH = qcl.d.h(bVar.d);
                if (strH == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, strH);
                }
                lcl.b bVar2 = bVar.e;
                if (bVar2 != null) {
                    strK14 = zbl.a.a().k(bVar2);
                    Intrinsics.checkNotNullExpressionValue(strK14, "toJson(...)");
                } else {
                    strK14 = null;
                }
                if (strK14 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, strK14);
                }
                kcl.a aVar = bVar.f;
                if (aVar != null) {
                    strK15 = zbl.a.a().k(aVar);
                    Intrinsics.checkNotNullExpressionValue(strK15, "toJson(...)");
                } else {
                    strK15 = null;
                }
                if (strK15 == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, strK15);
                }
                kcl.c cVar = bVar.f182743g;
                if (cVar != null) {
                    strK16 = zbl.a.a().k(cVar);
                    Intrinsics.checkNotNullExpressionValue(strK16, "toJson(...)");
                } else {
                    strK16 = null;
                }
                if (strK16 == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindText(7, strK16);
                }
                DateTime dateTime = bVar.f182744h;
                Long lValueOf = dateTime != null ? Long.valueOf(dateTime.getMillis()) : null;
                if (lValueOf == null) {
                    sQLiteStatement.bindNull(8);
                } else {
                    sQLiteStatement.bindLong(8, lValueOf.longValue());
                }
                DateTime dateTime2 = bVar.i;
                Long lValueOf2 = dateTime2 != null ? Long.valueOf(dateTime2.getMillis()) : null;
                if (lValueOf2 == null) {
                    sQLiteStatement.bindNull(9);
                } else {
                    sQLiteStatement.bindLong(9, lValueOf2.longValue());
                }
                break;
            case 2:
                ocl.a aVar2 = (ocl.a) obj2;
                String str7 = aVar2.f224249a;
                if (str7 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str7);
                }
                ocl.b entity = aVar2.f224250b;
                Intrinsics.checkNotNullParameter(entity, "entity");
                String strK18 = zbl.a.a().k(entity);
                Intrinsics.checkNotNullExpressionValue(strK18, "toJson(...)");
                if (strK18 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, strK18);
                }
                Long l2 = aVar2.f224251c;
                if (l2 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindLong(3, l2.longValue());
                }
                break;
            case 3:
                gge.a aVar3 = (gge.a) obj2;
                String str8 = aVar3.f143676a;
                if (str8 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str8);
                }
                String str9 = aVar3.f143677b;
                if (str9 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str9);
                }
                sQLiteStatement.bindLong(3, aVar3.f143678c);
                sQLiteStatement.bindLong(4, aVar3.d);
                sQLiteStatement.bindLong(5, aVar3.e);
                sQLiteStatement.bindLong(6, aVar3.f);
                break;
            case 4:
                ncl.a aVar4 = (ncl.a) obj2;
                String str10 = aVar4.f214235a;
                if (str10 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str10);
                }
                sQLiteStatement.bindLong(2, aVar4.f214236b);
                sQLiteStatement.bindLong(3, aVar4.f214237c);
                break;
            case 5:
                ncl.b bVar3 = (ncl.b) obj2;
                String str11 = bVar3.f214238a;
                if (str11 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str11);
                }
                sQLiteStatement.bindLong(2, bVar3.f214239b);
                sQLiteStatement.bindLong(3, bVar3.f214240c);
                break;
            case 6:
                f7h.a aVar5 = (f7h.a) obj2;
                String str12 = aVar5.f132611a;
                if (str12 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str12);
                }
                xzg.o collectionsAssetType = aVar5.f132612b;
                Intrinsics.checkNotNullParameter(collectionsAssetType, "collectionsAssetType");
                sQLiteStatement.bindText(2, zh9.u0.J(collectionsAssetType));
                String str13 = aVar5.f132613c;
                if (str13 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, str13);
                }
                String str14 = aVar5.d;
                if (str14 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, str14);
                }
                String str15 = aVar5.e;
                if (str15 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, str15);
                }
                String str16 = aVar5.f;
                if (str16 == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, str16);
                }
                String str17 = aVar5.f132614g;
                if (str17 == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindText(7, str17);
                }
                String str18 = aVar5.f132615h;
                if (str18 == null) {
                    sQLiteStatement.bindNull(8);
                } else {
                    sQLiteStatement.bindText(8, str18);
                }
                String str19 = aVar5.i;
                if (str19 == null) {
                    sQLiteStatement.bindNull(9);
                } else {
                    sQLiteStatement.bindText(9, str19);
                }
                String strM = b21.a.m(aVar5.f132616j);
                if (strM == null) {
                    sQLiteStatement.bindNull(10);
                } else {
                    sQLiteStatement.bindText(10, strM);
                }
                List list6 = aVar5.k;
                String strR = list6 != null ? com.revolut.data.database.models.openbanking.d.r("toJson(...)", list6) : null;
                if (strR == null) {
                    sQLiteStatement.bindNull(11);
                } else {
                    sQLiteStatement.bindText(11, strR);
                }
                String str20 = aVar5.f132617l;
                if (str20 == null) {
                    sQLiteStatement.bindNull(12);
                } else {
                    sQLiteStatement.bindText(12, str20);
                }
                break;
            case 7:
                f9l.e eVar = (f9l.e) obj2;
                String str21 = eVar.f132995a;
                if (str21 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str21);
                }
                String str22 = eVar.f132996b;
                if (str22 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str22);
                }
                sQLiteStatement.bindDouble(3, eVar.f132997c);
                Double d = eVar.d;
                if (d == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindDouble(4, d.doubleValue());
                }
                sQLiteStatement.bindLong(5, eVar.e);
                Boolean bool = eVar.f;
                if ((bool == null ? null : Integer.valueOf(bool.booleanValue() ? 1 : 0)) == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindLong(6, r0.intValue());
                }
                DateTime dateTime3 = eVar.f132998g;
                Long lValueOf3 = dateTime3 != null ? Long.valueOf(dateTime3.getMillis()) : null;
                if (lValueOf3 == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindLong(7, lValueOf3.longValue());
                }
                DateTime dateTime4 = eVar.f132999h;
                Long lValueOf4 = dateTime4 != null ? Long.valueOf(dateTime4.getMillis()) : null;
                if (lValueOf4 == null) {
                    sQLiteStatement.bindNull(8);
                } else {
                    sQLiteStatement.bindLong(8, lValueOf4.longValue());
                }
                break;
            case 8:
                g36.d dVar = (g36.d) obj2;
                String str23 = dVar.f140210a;
                if (str23 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str23);
                }
                String str24 = dVar.f140211b;
                if (str24 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str24);
                }
                sQLiteStatement.bindLong(3, dVar.f140212c);
                if (dVar.d == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindLong(4, r0.intValue());
                }
                String str25 = dVar.e;
                if (str25 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, str25);
                }
                String str26 = dVar.f;
                if (str26 == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, str26);
                }
                break;
            case 9:
                g5d.j jVar = (g5d.j) obj2;
                String str27 = jVar.f140766a;
                if (str27 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str27);
                }
                String str28 = jVar.f140767b;
                if (str28 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str28);
                }
                sQLiteStatement.bindLong(3, jVar.f140768c ? 1L : 0L);
                sQLiteStatement.bindLong(4, jVar.d ? 1L : 0L);
                sQLiteStatement.bindLong(5, jVar.e);
                break;
            case 10:
                hi9.k kVar = (hi9.k) obj2;
                String str29 = kVar.f152550a;
                if (str29 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str29);
                }
                String str30 = kVar.f152551b;
                if (str30 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str30);
                }
                String str31 = kVar.f152552c;
                if (str31 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, str31);
                }
                String str32 = kVar.d;
                if (str32 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, str32);
                }
                String str33 = kVar.e;
                if (str33 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, str33);
                }
                String str34 = kVar.f;
                if (str34 == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, str34);
                }
                String str35 = kVar.f152553g;
                if (str35 == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindText(7, str35);
                }
                sQLiteStatement.bindLong(8, kVar.f152554h);
                sQLiteStatement.bindLong(9, kVar.i);
                sQLiteStatement.bindLong(10, kVar.f152555j);
                sQLiteStatement.bindLong(11, kVar.k);
                sQLiteStatement.bindLong(12, kVar.f152556l);
                Long l3 = kVar.f152557m;
                if (l3 == null) {
                    sQLiteStatement.bindNull(13);
                } else {
                    sQLiteStatement.bindLong(13, l3.longValue());
                }
                sQLiteStatement.bindLong(14, kVar.f152558n);
                String str36 = kVar.o;
                if (str36 == null) {
                    sQLiteStatement.bindNull(15);
                } else {
                    sQLiteStatement.bindText(15, str36);
                }
                String str37 = kVar.f152559p;
                if (str37 == null) {
                    sQLiteStatement.bindNull(16);
                } else {
                    sQLiteStatement.bindText(16, str37);
                }
                sQLiteStatement.bindLong(17, kVar.f152560q ? 1L : 0L);
                String str38 = kVar.f152561r;
                if (str38 == null) {
                    sQLiteStatement.bindNull(18);
                } else {
                    sQLiteStatement.bindText(18, str38);
                }
                String str39 = kVar.f152562s;
                if (str39 == null) {
                    sQLiteStatement.bindNull(19);
                } else {
                    sQLiteStatement.bindText(19, str39);
                }
                String str40 = kVar.f152563t;
                if (str40 == null) {
                    sQLiteStatement.bindNull(20);
                } else {
                    sQLiteStatement.bindText(20, str40);
                }
                String str41 = kVar.u;
                if (str41 == null) {
                    sQLiteStatement.bindNull(21);
                } else {
                    sQLiteStatement.bindText(21, str41);
                }
                String str42 = kVar.v;
                if (str42 == null) {
                    sQLiteStatement.bindNull(22);
                } else {
                    sQLiteStatement.bindText(22, str42);
                }
                sQLiteStatement.bindLong(23, kVar.f152564w);
                String str43 = kVar.f152565x;
                if (str43 == null) {
                    sQLiteStatement.bindNull(24);
                } else {
                    sQLiteStatement.bindText(24, str43);
                }
                if (kVar.f152566y == null) {
                    sQLiteStatement.bindNull(25);
                } else {
                    sQLiteStatement.bindLong(25, r0.intValue());
                }
                String str44 = kVar.z;
                if (str44 == null) {
                    sQLiteStatement.bindNull(26);
                } else {
                    sQLiteStatement.bindText(26, str44);
                }
                hi9.c cVar2 = kVar.A;
                if (cVar2 != null) {
                    Json json = (Json) bj9.a.f15588a.getValue();
                    json.getClass();
                    strC = json.c(hi9.c.INSTANCE.serializer(), cVar2);
                } else {
                    strC = null;
                }
                if (strC == null) {
                    sQLiteStatement.bindNull(27);
                } else {
                    sQLiteStatement.bindText(27, strC);
                }
                break;
            case 11:
                hi9.a aVar6 = (hi9.a) obj2;
                String str45 = aVar6.f152532a;
                if (str45 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str45);
                }
                sQLiteStatement.bindLong(2, aVar6.f152533b);
                sQLiteStatement.bindLong(3, aVar6.f152534c);
                String str46 = aVar6.d;
                if (str46 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, str46);
                }
                String str47 = aVar6.e;
                if (str47 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, str47);
                }
                Long l4 = aVar6.f;
                if (l4 == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindLong(6, l4.longValue());
                }
                List list7 = aVar6.f152535g;
                String strR2 = list7 != null ? com.revolut.data.database.models.openbanking.d.r("toJson(...)", list7) : null;
                if (strR2 == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindText(7, strR2);
                }
                sQLiteStatement.bindLong(8, aVar6.f152536h);
                sQLiteStatement.bindLong(9, aVar6.i);
                sQLiteStatement.bindLong(10, aVar6.f152537j);
                sQLiteStatement.bindLong(11, aVar6.k);
                sQLiteStatement.bindLong(12, aVar6.f152538l);
                sQLiteStatement.bindLong(13, aVar6.f152539m);
                sQLiteStatement.bindLong(14, aVar6.f152540n ? 1L : 0L);
                break;
            case 12:
                hi9.l lVar = (hi9.l) obj2;
                String str48 = lVar.f152567a;
                if (str48 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str48);
                }
                if (lVar.f152568b == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindLong(2, r10.intValue());
                }
                break;
            case 13:
                hi9.n nVar = (hi9.n) obj2;
                String str49 = nVar.f152569a;
                if (str49 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str49);
                }
                sQLiteStatement.bindLong(2, nVar.f152570b);
                break;
            case 14:
                hi9.o oVar = (hi9.o) obj2;
                String str50 = oVar.f152571a;
                if (str50 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str50);
                }
                String str51 = oVar.f152572b;
                if (str51 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str51);
                }
                sQLiteStatement.bindLong(3, oVar.f152573c);
                sQLiteStatement.bindLong(4, oVar.d);
                sQLiteStatement.bindLong(5, oVar.e);
                sQLiteStatement.bindLong(6, oVar.f);
                break;
            case 15:
                hi9.b bVar4 = (hi9.b) obj2;
                String str52 = bVar4.f152541a;
                if (str52 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str52);
                }
                sQLiteStatement.bindLong(2, bVar4.f152542b ? 1L : 0L);
                break;
            case 16:
                gpk.a aVar7 = (gpk.a) obj2;
                String str53 = aVar7.f145455a;
                if (str53 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str53);
                }
                String str54 = aVar7.f145456b;
                if (str54 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str54);
                }
                String str55 = aVar7.f145457c;
                if (str55 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, str55);
                }
                String str56 = aVar7.d;
                if (str56 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, str56);
                }
                String str57 = aVar7.e;
                if (str57 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, str57);
                }
                String str58 = aVar7.f;
                if (str58 == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, str58);
                }
                sQLiteStatement.bindLong(7, aVar7.f145458g);
                sQLiteStatement.bindLong(8, aVar7.f145459h);
                break;
            case 17:
                i4d.a aVar8 = (i4d.a) obj2;
                String str59 = aVar8.f158414a;
                if (str59 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str59);
                }
                String str60 = aVar8.f158415b;
                if (str60 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str60);
                }
                sQLiteStatement.bindLong(3, aVar8.f158416c);
                sQLiteStatement.bindLong(4, aVar8.d);
                break;
            case 18:
                i4d.a aVar9 = (i4d.a) obj2;
                String str61 = aVar9.f158414a;
                if (str61 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str61);
                }
                String str62 = aVar9.f158415b;
                if (str62 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str62);
                }
                sQLiteStatement.bindLong(3, aVar9.f158416c);
                sQLiteStatement.bindLong(4, aVar9.d);
                break;
            case 19:
                jz8.o oVar2 = (jz8.o) obj2;
                String str63 = oVar2.f179644a;
                if (str63 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str63);
                }
                String str64 = oVar2.f179645b;
                if (str64 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str64);
                }
                String str65 = oVar2.f179646c;
                if (str65 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, str65);
                }
                u09.v domain = oVar2.d;
                Intrinsics.checkNotNullParameter(domain, "domain");
                String strName = domain.name();
                if (strName == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, strName);
                }
                DateTime dateTime5 = oVar2.e;
                Long lValueOf5 = dateTime5 != null ? Long.valueOf(dateTime5.getMillis()) : null;
                if (lValueOf5 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindLong(5, lValueOf5.longValue());
                }
                String str66 = oVar2.f;
                if (str66 == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, str66);
                }
                String str67 = oVar2.f179647g;
                if (str67 == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindText(7, str67);
                }
                String str68 = oVar2.f179648h;
                if (str68 == null) {
                    sQLiteStatement.bindNull(8);
                } else {
                    sQLiteStatement.bindText(8, str68);
                }
                String str69 = oVar2.i;
                if (str69 == null) {
                    sQLiteStatement.bindNull(9);
                } else {
                    sQLiteStatement.bindText(9, str69);
                }
                if (oVar2.f179649j == null) {
                    sQLiteStatement.bindNull(10);
                } else {
                    sQLiteStatement.bindLong(10, r10.intValue());
                }
                break;
            case 20:
                jz8.t0 t0Var = (jz8.t0) obj2;
                String str70 = t0Var.f179663a;
                if (str70 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str70);
                }
                String str71 = t0Var.f179664b;
                if (str71 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str71);
                }
                String str72 = t0Var.f179665c;
                if (str72 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, str72);
                }
                String str73 = t0Var.d;
                if (str73 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, str73);
                }
                List entity2 = t0Var.e;
                Intrinsics.checkNotNullParameter(entity2, "entity");
                Json jsonA = mz8.a.a();
                jsonA.getClass();
                sQLiteStatement.bindText(5, jsonA.c(new qlm.e(jz8.r.Companion.serializer()), entity2));
                jz8.s0 s0Var = t0Var.f;
                if (s0Var != null) {
                    Json jsonA2 = mz8.a.a();
                    jsonA2.getClass();
                    strC2 = jsonA2.c(jz8.s0.Companion.serializer(), s0Var);
                } else {
                    strC2 = null;
                }
                if (strC2 == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, strC2);
                }
                z0 entity3 = t0Var.f179666g;
                Intrinsics.checkNotNullParameter(entity3, "entity");
                Json jsonA3 = mz8.a.a();
                jsonA3.getClass();
                sQLiteStatement.bindText(7, jsonA3.c(z0.Companion.serializer(), entity3));
                u09.y progress = t0Var.f179667h;
                Intrinsics.checkNotNullParameter(progress, "progress");
                String strName2 = progress.name();
                if (strName2 == null) {
                    sQLiteStatement.bindNull(8);
                } else {
                    sQLiteStatement.bindText(8, strName2);
                }
                String str74 = t0Var.i;
                if (str74 == null) {
                    sQLiteStatement.bindNull(9);
                } else {
                    sQLiteStatement.bindText(9, str74);
                }
                jz8.e0 entity4 = t0Var.f179668j;
                Intrinsics.checkNotNullParameter(entity4, "entity");
                Json jsonA4 = mz8.a.a();
                jsonA4.getClass();
                sQLiteStatement.bindText(10, jsonA4.c(jz8.e0.Companion.serializer(), entity4));
                u09.i0 rewardStatus = t0Var.k;
                Intrinsics.checkNotNullParameter(rewardStatus, "rewardStatus");
                String strName3 = rewardStatus.name();
                if (strName3 == null) {
                    sQLiteStatement.bindNull(11);
                } else {
                    sQLiteStatement.bindText(11, strName3);
                }
                sQLiteStatement.bindLong(12, t0Var.f179669l);
                sQLiteStatement.bindLong(13, t0Var.f179670m);
                String strD = gz8.c.d(t0Var.f179671n);
                if (strD == null) {
                    sQLiteStatement.bindNull(14);
                } else {
                    sQLiteStatement.bindText(14, strD);
                }
                break;
            case 21:
                jz8.i iVar = (jz8.i) obj2;
                String str75 = iVar.f179623a;
                if (str75 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str75);
                }
                String str76 = iVar.f179624b;
                if (str76 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str76);
                }
                z0 entity5 = iVar.f179625c;
                Intrinsics.checkNotNullParameter(entity5, "entity");
                Json jsonA5 = mz8.a.a();
                jsonA5.getClass();
                sQLiteStatement.bindText(3, jsonA5.c(z0.Companion.serializer(), entity5));
                String str77 = iVar.d;
                if (str77 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, str77);
                }
                u09.l state = iVar.e;
                Intrinsics.checkNotNullParameter(state, "state");
                String strName4 = state.name();
                if (strName4 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, strName4);
                }
                u09.k kVar2 = iVar.f;
                String strName5 = kVar2 != null ? kVar2.name() : null;
                if (strName5 == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, strName5);
                }
                u09.v domain2 = iVar.f179626g;
                Intrinsics.checkNotNullParameter(domain2, "domain");
                String strName6 = domain2.name();
                if (strName6 == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindText(7, strName6);
                }
                String str78 = iVar.f179627h;
                if (str78 == null) {
                    sQLiteStatement.bindNull(8);
                } else {
                    sQLiteStatement.bindText(8, str78);
                }
                sQLiteStatement.bindLong(9, iVar.i);
                List progress2 = iVar.f179628j;
                Intrinsics.checkNotNullParameter(progress2, "progress");
                List<u09.y> list8 = progress2;
                ArrayList arrayList = new ArrayList(zhm.w.t(list8, 10));
                for (u09.y progress3 : list8) {
                    Intrinsics.checkNotNullParameter(progress3, "progress");
                    arrayList.add(progress3.name());
                }
                String strD2 = gz8.c.d(arrayList);
                if (strD2 == null) {
                    sQLiteStatement.bindNull(10);
                } else {
                    sQLiteStatement.bindText(10, strD2);
                }
                sQLiteStatement.bindLong(11, iVar.k ? 1L : 0L);
                String strD3 = gz8.c.d(iVar.f179629l);
                if (strD3 == null) {
                    sQLiteStatement.bindNull(12);
                } else {
                    sQLiteStatement.bindText(12, strD3);
                }
                String str79 = iVar.f179630m;
                if (str79 == null) {
                    sQLiteStatement.bindNull(13);
                } else {
                    sQLiteStatement.bindText(13, str79);
                }
                jz8.l lVar2 = iVar.f179631n;
                if (lVar2 != null) {
                    Json jsonA6 = mz8.a.a();
                    jsonA6.getClass();
                    strC3 = jsonA6.c(jz8.l.Companion.serializer(), lVar2);
                } else {
                    strC3 = null;
                }
                if (strC3 == null) {
                    sQLiteStatement.bindNull(14);
                } else {
                    sQLiteStatement.bindText(14, strC3);
                }
                List list9 = iVar.o;
                if (list9 != null) {
                    Json jsonA7 = mz8.a.a();
                    jsonA7.getClass();
                    strC4 = jsonA7.c(new qlm.e(jz8.e.Companion.serializer()), list9);
                } else {
                    strC4 = null;
                }
                if (strC4 == null) {
                    sQLiteStatement.bindNull(15);
                } else {
                    sQLiteStatement.bindText(15, strC4);
                }
                Boolean bool2 = iVar.f179632p;
                if ((bool2 != null ? Integer.valueOf(bool2.booleanValue() ? 1 : 0) : null) == null) {
                    sQLiteStatement.bindNull(16);
                } else {
                    sQLiteStatement.bindLong(16, r1.intValue());
                }
                break;
            case 22:
                jz8.f fVar = (jz8.f) obj2;
                String str80 = fVar.f179612a;
                if (str80 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str80);
                }
                String str81 = fVar.f179613b;
                if (str81 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str81);
                }
                String str82 = fVar.f179614c;
                if (str82 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, str82);
                }
                List domains = fVar.d;
                Intrinsics.checkNotNullParameter(domains, "domains");
                String strK0 = zhm.d0.k0(domains, ",", null, null, 0, new kotlin.jvm.internal.h0() { // from class: gz8.b
                    @Override // kotlin.jvm.internal.h0, wim.p
                    public final Object get(Object obj3) {
                        return ((v) obj3).name();
                    }
                }, 30);
                if (strK0 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, strK0);
                }
                break;
            case 23:
                jz8.g gVar = (jz8.g) obj2;
                String str83 = gVar.f179616a;
                if (str83 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str83);
                }
                String str84 = gVar.f179617b;
                if (str84 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str84);
                }
                break;
            case 24:
                a(sQLiteStatement, obj2);
                break;
            case 25:
                c1 c1Var = (c1) obj2;
                String str85 = c1Var.f179607a;
                if (str85 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str85);
                }
                jz8.u0 u0Var = c1Var.f179608b;
                if (u0Var != null) {
                    sQLiteStatement.bindLong(2, u0Var.f179672a);
                    String str86 = u0Var.f179673b;
                    if (str86 == null) {
                        sQLiteStatement.bindNull(3);
                    } else {
                        sQLiteStatement.bindText(3, str86);
                    }
                } else {
                    sQLiteStatement.bindNull(2);
                    sQLiteStatement.bindNull(3);
                }
                break;
            case 26:
                b(sQLiteStatement, obj2);
                break;
            case 27:
                c(sQLiteStatement, obj2);
                break;
            case 28:
                d(sQLiteStatement, obj2);
                break;
            default:
                ks6.d0 d0Var = (ks6.d0) obj2;
                String str87 = d0Var.f189138a;
                if (str87 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str87);
                }
                String str88 = d0Var.f189139b;
                if (str88 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str88);
                }
                sQLiteStatement.bindDouble(3, d0Var.f189140c);
                break;
        }
    }

    @Override // androidx.room.EntityInsertAdapter
    public final String createQuery() {
        switch (this.f113054a) {
            case 0:
                return "INSERT OR REPLACE INTO `note_details` (`ref`,`symbol`,`stock_exchange_code`,`description`,`lifecycle`,`coupon`,`call`,`capital_protection`,`final_payout`,`key_drivers`,`underlying_assets`,`issuer`,`main_indicators`,`payout_scenarios`,`payout_scenarios_graph`,`performance_trackers`,`loss_probability`,`reference_asset`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `portfolios` (`id`,`state`,`asset_types`,`balance`,`kyc`,`disclosures`,`info`,`onboardedDate`,`offboardedDate`) VALUES (?,?,?,?,?,?,?,?,?)";
            case 2:
                return "INSERT OR REPLACE INTO `portfolioSettings` (`portfolioId`,`stockBuyBlockState`,`stockBuyBlockDeactivationTime`) VALUES (?,?,?)";
            case 3:
                return "INSERT OR REPLACE INTO `account_notification_info` (`accountId`,`productId`,`lastSeenTimestamp`,`lastActionTimestamp`,`lastTransactionTimestamp`,`unreadCounter`) VALUES (?,?,?,?,?,?)";
            case 4:
                return "INSERT OR REPLACE INTO `reports` (`portfolioId`,`fromEpochDay`,`toEpochDay`) VALUES (?,?,?)";
            case 5:
                return "INSERT OR REPLACE INTO `us_reports` (`portfolioId`,`fromEpochDay`,`toEpochDay`) VALUES (?,?,?)";
            case 6:
                return "INSERT OR REPLACE INTO `collections` (`id`,`assetType`,`title`,`description`,`emoji`,`backgroundImageLink`,`avatarImageLink`,`icon`,`additionalInfoLink`,`collections`,`entries`,`category`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
            case 7:
                return "INSERT OR REPLACE INTO `rates_cache` (`from`,`to`,`rate`,`last_available_rate`,`time_stamp`,`isWeekend`,`weekendStartTime`,`weekendEndTime`) VALUES (?,?,?,?,?,?,?,?)";
            case 8:
                return "INSERT OR REPLACE INTO `defi_currencies` (`external_asset_id`,`display_name`,`fractional_digits`,`display_fractional_digits`,`ticker`,`icon_url`) VALUES (?,?,?,?,?,?)";
            case 9:
                return "INSERT OR IGNORE INTO `air_tip_state` (`air_tip_id`,`air_tip_type`,`was_clicked`,`has_animated`,`expiration_date`) VALUES (?,?,?,?,?)";
            case 10:
                return "INSERT OR REPLACE INTO `plans` (`id`,`facilityId`,`transactionId`,`merchantName`,`merchantLogoUrl`,`merchantLogoName`,`merchantCategory`,`startDateTime`,`updateDateTime`,`amount`,`paidAmount`,`remainingAmount`,`revPoints`,`fee`,`currency`,`state`,`isLimitWithdrawn`,`feeType`,`origin`,`countryCode`,`instalmentType`,`termFeeRate`,`minFeeAmount`,`cancellationOrigin`,`rescheduleCount`,`withdrawalTransactionId`,`feeDetails`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 11:
                return "INSERT OR REPLACE INTO `repayments` (`planId`,`index`,`dueDate`,`state`,`currency`,`paidDateTime`,`transactionIds`,`amount`,`repaidAmount`,`fee`,`repaidFee`,`lateInterest`,`repaidLateInterest`,`isOverLimit`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 12:
                return "INSERT OR IGNORE INTO `plan_preferences` (`planId`,`seenRescheduleVersion`) VALUES (?,?)";
            case 13:
                return "INSERT OR REPLACE INTO `plan_updates` (`id`,`updateDateTime`) VALUES (?,?)";
            case 14:
                return "INSERT OR REPLACE INTO `repayment_parts` (`transactionId`,`planId`,`instalmentIndex`,`amount`,`fee`,`lateInterest`) VALUES (?,?,?,?,?,?)";
            case 15:
                return "INSERT OR REPLACE INTO `plan_details` (`id`,`cancellable`) VALUES (?,?)";
            case 16:
                return "INSERT OR REPLACE INTO `rates_alerts` (`id`,`state`,`targetRate`,`placementRate`,`currencyFrom`,`currencyTo`,`createdDate`,`executedDate`) VALUES (?,?,?,?,?,?,?,?)";
            case 17:
                return "INSERT OR IGNORE INTO `converter_items` (`asset_type_key`,`asset_code`,`amount`,`weight`) VALUES (?,?,?,?)";
            case 18:
                return "INSERT OR REPLACE INTO `converter_items` (`asset_type_key`,`asset_code`,`amount`,`weight`) VALUES (?,?,?,?)";
            case 19:
                return "INSERT OR REPLACE INTO `blogs` (`blogId`,`title`,`content`,`productDomain`,`createdDate`,`author`,`description`,`previewImageUrl`,`imageUrl`,`lengthInMins`) VALUES (?,?,?,?,?,?,?,?,?,?)";
            case 20:
                return "INSERT OR REPLACE INTO `lessons` (`id`,`title`,`courseId`,`thumbnail`,`contentCards`,`quiz`,`reward`,`progress`,`coverImage`,`content`,`rewardStatus`,`lessonIndex`,`totalLessons`,`preconditions`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 21:
                return "INSERT OR REPLACE INTO `courses` (`id`,`title`,`reward`,`thumbnail`,`state`,`mode`,`domain`,`description`,`courseIndex`,`lessonsProgress`,`incentiveEnded`,`tags`,`coverImage`,`totalEarnedReward`,`badges`,`hasLessonsWithAbuseRewardStatus`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 22:
                return "INSERT OR REPLACE INTO `course_categories` (`category`,`title`,`variant`,`productDomains`) VALUES (?,?,?,?)";
            case 23:
                return "INSERT OR REPLACE INTO `course_category_join` (`categoryId`,`courseId`) VALUES (?,?)";
            case 24:
                return "INSERT OR REPLACE INTO `glossary_terms` (`glossaryItemId`,`term`,`definition`,`productDomain`,`index`) VALUES (?,?,?,?,?)";
            case 25:
                return "INSERT OR REPLACE INTO `total_earned_reward` (`id`,`total_amount`,`total_currency`) VALUES (?,?,?)";
            case 26:
                return "INSERT OR REPLACE INTO `recurring_orders` (`orderId`,`portfolioId`,`sourcePocketId`,`state`,`period`,`startDate`,`nextDate`,`updatedDate`,`orderAmount_amount`,`orderAmount_currency`) VALUES (?,?,?,?,?,?,?,?,?,?)";
            case 27:
                return "INSERT OR REPLACE INTO `business_category` (`id`,`name`,`isPopular`,`description`,`keywords`,`logo_ref`) VALUES (?,?,?,?,?,?)";
            case 28:
                return "INSERT OR REPLACE INTO `customers` (`id`,`full_name`,`email`,`phone`,`vat_number`,`address`,`created_date`,`updated_date`) VALUES (?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR REPLACE INTO `invoice_tax_rates` (`id`,`name`,`percentage`) VALUES (?,?,?)";
        }
    }

    public /* synthetic */ s0(Object obj2, int i) {
        this.f113054a = i;
    }
}
