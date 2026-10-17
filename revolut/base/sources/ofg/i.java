package ofg;

import androidx.room.EntityInsertAdapter;
import androidx.sqlite.SQLiteStatement;
import com.revolut.data.utils.gson.GsonHolder;
import com.revolut.feature.cards_core.impl.data.network.CardsGsonHolder;
import com.revolut.feature.shared.vaults.domain.impl.data.database.models.VaultEntityGsonHolder;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.Period;
import qfg.m;
import rgc.k;
import u10.l;
import u10.n;
import u10.o;
import u10.p;
import u10.r;
import v30.s0;
import v30.u0;
import vxb.c0;
import vxb.d0;
import vxb.y;
import vxb.z;

/* JADX INFO: loaded from: classes9.dex */
public final class i extends EntityInsertAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f224852a;

    public /* synthetic */ i(int i) {
        this.f224852a = i;
    }

    private final void a(SQLiteStatement sQLiteStatement, Object obj2) {
        n nVar = (n) obj2;
        String strC = s10.a.c(nVar.f276309a);
        if (strC == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, strC);
        }
        String strC2 = s10.a.c(nVar.f276310b);
        if (strC2 == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindText(2, strC2);
        }
        String strC3 = s10.a.c(nVar.f276311c);
        if (strC3 == null) {
            sQLiteStatement.bindNull(3);
        } else {
            sQLiteStatement.bindText(3, strC3);
        }
        String strC4 = s10.a.c(nVar.d);
        if (strC4 == null) {
            sQLiteStatement.bindNull(4);
        } else {
            sQLiteStatement.bindText(4, strC4);
        }
        String str = nVar.e;
        if (str == null) {
            sQLiteStatement.bindNull(5);
        } else {
            sQLiteStatement.bindText(5, str);
        }
        String str2 = nVar.f;
        if (str2 == null) {
            sQLiteStatement.bindNull(6);
        } else {
            sQLiteStatement.bindText(6, str2);
        }
        o status = nVar.f276312g;
        Intrinsics.checkNotNullParameter(status, "status");
        String strName = status.name();
        if (strName == null) {
            sQLiteStatement.bindNull(7);
        } else {
            sQLiteStatement.bindText(7, strName);
        }
        sQLiteStatement.bindLong(8, nVar.f276313h);
    }

    private final void b(SQLiteStatement sQLiteStatement, Object obj2) {
        s93.b bVar = (s93.b) obj2;
        String str = bVar.f261101a;
        if (str == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, str);
        }
        aa3.a counter = bVar.f261102b;
        Intrinsics.checkNotNullParameter(counter, "counter");
        Object value = CardsGsonHolder.f65576a.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        String strK = ((kg.o) value).k(counter);
        Intrinsics.checkNotNullExpressionValue(strK, "toJson(...)");
        if (strK == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindText(2, strK);
        }
    }

    private final void c(SQLiteStatement sQLiteStatement, Object obj2) {
        vdd.f fVar = (vdd.f) obj2;
        String str = fVar.f287889a;
        if (str == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, str);
        }
        Long l2 = fVar.f287890b;
        if (l2 == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindLong(2, l2.longValue());
        }
        Long l3 = fVar.f287891c;
        if (l3 == null) {
            sQLiteStatement.bindNull(3);
        } else {
            sQLiteStatement.bindLong(3, l3.longValue());
        }
    }

    private final void d(SQLiteStatement sQLiteStatement, Object obj2) {
        String strK;
        String strK2;
        String strK3;
        String strK4;
        vdd.i iVar = (vdd.i) obj2;
        String str = iVar.f287894a;
        if (str == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, str);
        }
        String str2 = iVar.f287895b;
        if (str2 == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindText(2, str2);
        }
        String str3 = iVar.f287896c;
        if (str3 == null) {
            sQLiteStatement.bindNull(3);
        } else {
            sQLiteStatement.bindText(3, str3);
        }
        vdd.e eVar = iVar.d;
        String strK5 = null;
        if (eVar != null) {
            strK = VaultEntityGsonHolder.a().k(eVar);
            Intrinsics.checkNotNullExpressionValue(strK, "toJson(...)");
        } else {
            strK = null;
        }
        if (strK == null) {
            sQLiteStatement.bindNull(4);
        } else {
            sQLiteStatement.bindText(4, strK);
        }
        String str4 = iVar.e;
        if (str4 == null) {
            sQLiteStatement.bindNull(5);
        } else {
            sQLiteStatement.bindText(5, str4);
        }
        String str5 = iVar.f;
        if (str5 == null) {
            sQLiteStatement.bindNull(6);
        } else {
            sQLiteStatement.bindText(6, str5);
        }
        sQLiteStatement.bindLong(7, iVar.f287897g);
        String str6 = iVar.f287898h;
        if (str6 == null) {
            sQLiteStatement.bindNull(8);
        } else {
            sQLiteStatement.bindText(8, str6);
        }
        String str7 = iVar.i;
        if (str7 == null) {
            sQLiteStatement.bindNull(9);
        } else {
            sQLiteStatement.bindText(9, str7);
        }
        vdd.d dVar = iVar.f287899j;
        if (dVar != null) {
            strK2 = VaultEntityGsonHolder.a().k(dVar);
            Intrinsics.checkNotNullExpressionValue(strK2, "toJson(...)");
        } else {
            strK2 = null;
        }
        if (strK2 == null) {
            sQLiteStatement.bindNull(10);
        } else {
            sQLiteStatement.bindText(10, strK2);
        }
        vdd.a aVar = iVar.k;
        if (aVar != null) {
            strK3 = VaultEntityGsonHolder.a().k(aVar);
            Intrinsics.checkNotNullExpressionValue(strK3, "toJson(...)");
        } else {
            strK3 = null;
        }
        if (strK3 == null) {
            sQLiteStatement.bindNull(11);
        } else {
            sQLiteStatement.bindText(11, strK3);
        }
        List list = iVar.f287900l;
        if (list != null) {
            strK4 = VaultEntityGsonHolder.a().k(list);
            Intrinsics.checkNotNullExpressionValue(strK4, "toJson(...)");
        } else {
            strK4 = null;
        }
        if (strK4 == null) {
            sQLiteStatement.bindNull(12);
        } else {
            sQLiteStatement.bindText(12, strK4);
        }
        Long l2 = iVar.f287901m;
        if (l2 == null) {
            sQLiteStatement.bindNull(13);
        } else {
            sQLiteStatement.bindLong(13, l2.longValue());
        }
        Long l3 = iVar.f287902n;
        if (l3 == null) {
            sQLiteStatement.bindNull(14);
        } else {
            sQLiteStatement.bindLong(14, l3.longValue());
        }
        List list2 = iVar.o;
        if (list2 != null) {
            strK5 = VaultEntityGsonHolder.a().k(list2);
            Intrinsics.checkNotNullExpressionValue(strK5, "toJson(...)");
        }
        if (strK5 == null) {
            sQLiteStatement.bindNull(15);
        } else {
            sQLiteStatement.bindText(15, strK5);
        }
        String str8 = iVar.f287903p;
        if (str8 == null) {
            sQLiteStatement.bindNull(16);
        } else {
            sQLiteStatement.bindText(16, str8);
        }
        sQLiteStatement.bindLong(17, iVar.f287904q);
        Long l4 = iVar.f287905r;
        if (l4 == null) {
            sQLiteStatement.bindNull(18);
        } else {
            sQLiteStatement.bindLong(18, l4.longValue());
        }
        String str9 = iVar.f287906s;
        if (str9 == null) {
            sQLiteStatement.bindNull(19);
        } else {
            sQLiteStatement.bindText(19, str9);
        }
        String str10 = iVar.f287907t;
        if (str10 == null) {
            sQLiteStatement.bindNull(20);
        } else {
            sQLiteStatement.bindText(20, str10);
        }
    }

    private final void e(SQLiteStatement sQLiteStatement, Object obj2) {
        sxa.f fVar = (sxa.f) obj2;
        String str = fVar.f266390a;
        if (str == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, str);
        }
        sxa.b bVar = fVar.f266391b;
        String str2 = bVar.f266382a;
        if (str2 == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindText(2, str2);
        }
        String str3 = bVar.f266383b;
        if (str3 == null) {
            sQLiteStatement.bindNull(3);
        } else {
            sQLiteStatement.bindText(3, str3);
        }
        String str4 = bVar.f266384c;
        if (str4 == null) {
            sQLiteStatement.bindNull(4);
        } else {
            sQLiteStatement.bindText(4, str4);
        }
        String str5 = bVar.d;
        if (str5 == null) {
            sQLiteStatement.bindNull(5);
        } else {
            sQLiteStatement.bindText(5, str5);
        }
        String str6 = bVar.e;
        if (str6 == null) {
            sQLiteStatement.bindNull(6);
        } else {
            sQLiteStatement.bindText(6, str6);
        }
        sxa.a aVar = fVar.f266392c;
        String str7 = aVar.f266379a;
        if (str7 == null) {
            sQLiteStatement.bindNull(7);
        } else {
            sQLiteStatement.bindText(7, str7);
        }
        String str8 = aVar.f266380b;
        if (str8 == null) {
            sQLiteStatement.bindNull(8);
        } else {
            sQLiteStatement.bindText(8, str8);
        }
        String str9 = aVar.f266381c;
        if (str9 == null) {
            sQLiteStatement.bindNull(9);
        } else {
            sQLiteStatement.bindText(9, str9);
        }
        String str10 = aVar.d;
        if (str10 == null) {
            sQLiteStatement.bindNull(10);
        } else {
            sQLiteStatement.bindText(10, str10);
        }
        String str11 = aVar.e;
        if (str11 == null) {
            sQLiteStatement.bindNull(11);
        } else {
            sQLiteStatement.bindText(11, str11);
        }
        sxa.c cVar = fVar.d;
        String str12 = cVar.f266385a;
        if (str12 == null) {
            sQLiteStatement.bindNull(12);
        } else {
            sQLiteStatement.bindText(12, str12);
        }
        String str13 = cVar.f266386b;
        if (str13 == null) {
            sQLiteStatement.bindNull(13);
        } else {
            sQLiteStatement.bindText(13, str13);
        }
        sxa.c cVar2 = fVar.e;
        String str14 = cVar2.f266385a;
        if (str14 == null) {
            sQLiteStatement.bindNull(14);
        } else {
            sQLiteStatement.bindText(14, str14);
        }
        String str15 = cVar2.f266386b;
        if (str15 == null) {
            sQLiteStatement.bindNull(15);
        } else {
            sQLiteStatement.bindText(15, str15);
        }
        sxa.c cVar3 = fVar.f;
        String str16 = cVar3.f266385a;
        if (str16 == null) {
            sQLiteStatement.bindNull(16);
        } else {
            sQLiteStatement.bindText(16, str16);
        }
        String str17 = cVar3.f266386b;
        if (str17 == null) {
            sQLiteStatement.bindNull(17);
        } else {
            sQLiteStatement.bindText(17, str17);
        }
    }

    private final void f(SQLiteStatement sQLiteStatement, Object obj2) {
        String strK;
        y yVar = (y) obj2;
        String str = yVar.f293029a;
        if (str == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, str);
        }
        String str2 = yVar.f293030b;
        if (str2 == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindText(2, str2);
        }
        sQLiteStatement.bindDouble(3, yVar.f293031c);
        sQLiteStatement.bindLong(4, yVar.d);
        String str3 = yVar.e;
        if (str3 == null) {
            sQLiteStatement.bindNull(5);
        } else {
            sQLiteStatement.bindText(5, str3);
        }
        String str4 = yVar.f;
        if (str4 == null) {
            sQLiteStatement.bindNull(6);
        } else {
            sQLiteStatement.bindText(6, str4);
        }
        String str5 = yVar.f293032g;
        if (str5 == null) {
            sQLiteStatement.bindNull(7);
        } else {
            sQLiteStatement.bindText(7, str5);
        }
        String str6 = yVar.f293033h;
        if (str6 == null) {
            sQLiteStatement.bindNull(8);
        } else {
            sQLiteStatement.bindText(8, str6);
        }
        String str7 = yVar.i;
        if (str7 == null) {
            sQLiteStatement.bindNull(9);
        } else {
            sQLiteStatement.bindText(9, str7);
        }
        c0 c0Var = yVar.f293034j;
        String strK2 = null;
        if (c0Var != null) {
            strK = GsonHolder.a().k(c0Var);
            Intrinsics.checkNotNullExpressionValue(strK, "toJson(...)");
        } else {
            strK = null;
        }
        if (strK == null) {
            sQLiteStatement.bindNull(10);
        } else {
            sQLiteStatement.bindText(10, strK);
        }
        String strB = txb.b.b(yVar.k);
        if (strB == null) {
            sQLiteStatement.bindNull(11);
        } else {
            sQLiteStatement.bindText(11, strB);
        }
        z zVar = yVar.f293035l;
        if (zVar != null) {
            strK2 = GsonHolder.a().k(zVar);
            Intrinsics.checkNotNullExpressionValue(strK2, "toJson(...)");
        }
        if (strK2 == null) {
            sQLiteStatement.bindNull(12);
        } else {
            sQLiteStatement.bindText(12, strK2);
        }
        String str8 = yVar.f293036m;
        if (str8 == null) {
            sQLiteStatement.bindNull(13);
        } else {
            sQLiteStatement.bindText(13, str8);
        }
        String str9 = yVar.f293037n;
        if (str9 == null) {
            sQLiteStatement.bindNull(14);
        } else {
            sQLiteStatement.bindText(14, str9);
        }
        String strB2 = txb.b.b(yVar.o);
        if (strB2 == null) {
            sQLiteStatement.bindNull(15);
        } else {
            sQLiteStatement.bindText(15, strB2);
        }
        String strB3 = txb.b.b(yVar.f293038p);
        if (strB3 == null) {
            sQLiteStatement.bindNull(16);
        } else {
            sQLiteStatement.bindText(16, strB3);
        }
    }

    @Override // androidx.room.EntityInsertAdapter
    public final void bind(SQLiteStatement sQLiteStatement, Object obj2) {
        String strK;
        String strK2;
        switch (this.f224852a) {
            case 0:
                m mVar = (m) obj2;
                String str = mVar.f245343a;
                if (str == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str);
                }
                sQLiteStatement.bindLong(2, mVar.f245344b);
                sQLiteStatement.bindLong(3, mVar.f245345c);
                String str2 = mVar.d;
                if (str2 == null) {
                    sQLiteStatement.bindNull(4);
                    return;
                } else {
                    sQLiteStatement.bindText(4, str2);
                    return;
                }
            case 1:
                throw a10.b.m(obj2);
            case 2:
                ((pq2.b) obj2).getClass();
                sQLiteStatement.bindNull(1);
                return;
            case 3:
                ((pq2.a) obj2).getClass();
                sQLiteStatement.bindNull(1);
                sQLiteStatement.bindNull(2);
                prk.o.z(sQLiteStatement, 3, 4, 5, 6);
                prk.o.y(sQLiteStatement, 7, 8, 9);
                prk.o.z(sQLiteStatement, 10, 11, 12, 13);
                sQLiteStatement.bindNull(14);
                sQLiteStatement.bindNull(15);
                return;
            case 4:
                ((pq2.c) obj2).getClass();
                sQLiteStatement.bindNull(1);
                sQLiteStatement.bindNull(2);
                return;
            case 5:
                ps6.j jVar = (ps6.j) obj2;
                String str3 = jVar.f239411a;
                if (str3 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str3);
                }
                sQLiteStatement.bindLong(2, jVar.f239412b ? 1L : 0L);
                String str4 = jVar.f239413c;
                if (str4 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, str4);
                }
                if (jVar.d == null) {
                    sQLiteStatement.bindNull(4);
                    return;
                } else {
                    sQLiteStatement.bindLong(4, r2.intValue());
                    return;
                }
            case 6:
                rgc.d dVar = (rgc.d) obj2;
                String str5 = dVar.f254072a;
                if (str5 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str5);
                }
                String str6 = dVar.f254073b;
                if (str6 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str6);
                }
                String strM = b21.a.m(dVar.f254074c);
                if (strM == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, strM);
                }
                sQLiteStatement.bindLong(4, dVar.d);
                String str7 = dVar.e;
                if (str7 == null) {
                    sQLiteStatement.bindNull(5);
                    return;
                } else {
                    sQLiteStatement.bindText(5, str7);
                    return;
                }
            case 7:
                rgc.a aVar = (rgc.a) obj2;
                String str8 = aVar.f254066a;
                if (str8 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str8);
                }
                sQLiteStatement.bindLong(2, aVar.f254067b);
                String str9 = aVar.f254068c;
                if (str9 == null) {
                    sQLiteStatement.bindNull(3);
                    return;
                } else {
                    sQLiteStatement.bindText(3, str9);
                    return;
                }
            case 8:
                k kVar = (k) obj2;
                String str10 = kVar.f254102a;
                if (str10 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str10);
                }
                String str11 = kVar.f254103b;
                if (str11 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str11);
                }
                String str12 = kVar.f254104c;
                if (str12 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, str12);
                }
                Long l2 = kVar.d;
                if (l2 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindLong(4, l2.longValue());
                }
                Long l3 = kVar.e;
                if (l3 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindLong(5, l3.longValue());
                }
                sgc.a entity = kVar.f;
                Intrinsics.checkNotNullParameter(entity, "entity");
                String strK3 = xgc.a.a().k(entity);
                Intrinsics.checkNotNullExpressionValue(strK3, "toJson(...)");
                if (strK3 == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, strK3);
                }
                String strA = tgc.a.a(kVar.f254105g);
                if (strA == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindText(7, strA);
                }
                String str13 = kVar.f254106h;
                if (str13 == null) {
                    sQLiteStatement.bindNull(8);
                } else {
                    sQLiteStatement.bindText(8, str13);
                }
                String str14 = kVar.f254107j;
                if (str14 == null) {
                    sQLiteStatement.bindNull(9);
                } else {
                    sQLiteStatement.bindText(9, str14);
                }
                String str15 = kVar.k;
                if (str15 == null) {
                    sQLiteStatement.bindNull(10);
                } else {
                    sQLiteStatement.bindText(10, str15);
                }
                sQLiteStatement.bindLong(11, kVar.f254108l ? 1L : 0L);
                sQLiteStatement.bindLong(12, kVar.f254109m ? 1L : 0L);
                sQLiteStatement.bindLong(13, kVar.f254110n ? 1L : 0L);
                sQLiteStatement.bindLong(14, kVar.o ? 1L : 0L);
                if (kVar.i != null) {
                    sQLiteStatement.bindLong(15, r2.f254111a);
                    return;
                } else {
                    sQLiteStatement.bindNull(15);
                    return;
                }
            case 9:
                rgc.i iVar = (rgc.i) obj2;
                String str16 = iVar.f254086a;
                if (str16 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str16);
                }
                String str17 = iVar.f254087b;
                if (str17 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str17);
                }
                String str18 = iVar.f254088c;
                if (str18 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, str18);
                }
                String strA2 = tgc.a.a(iVar.d);
                if (strA2 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, strA2);
                }
                String strA3 = tgc.a.a(iVar.e);
                if (strA3 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, strA3);
                }
                rgc.g entity2 = iVar.f;
                Intrinsics.checkNotNullParameter(entity2, "entity");
                String strK4 = xgc.a.a().k(entity2);
                Intrinsics.checkNotNullExpressionValue(strK4, "toJson(...)");
                if (strK4 == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, strK4);
                }
                sgc.a entity3 = iVar.f254089g;
                Intrinsics.checkNotNullParameter(entity3, "entity");
                String strK5 = xgc.a.a().k(entity3);
                Intrinsics.checkNotNullExpressionValue(strK5, "toJson(...)");
                if (strK5 == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindText(7, strK5);
                }
                Long l4 = iVar.f254090h;
                if (l4 == null) {
                    sQLiteStatement.bindNull(8);
                } else {
                    sQLiteStatement.bindLong(8, l4.longValue());
                }
                Long l5 = iVar.i;
                if (l5 == null) {
                    sQLiteStatement.bindNull(9);
                } else {
                    sQLiteStatement.bindLong(9, l5.longValue());
                }
                String strM2 = b21.a.m(iVar.k);
                if (strM2 == null) {
                    sQLiteStatement.bindNull(10);
                } else {
                    sQLiteStatement.bindText(10, strM2);
                }
                String strM3 = b21.a.m(iVar.f254092l);
                if (strM3 == null) {
                    sQLiteStatement.bindNull(11);
                } else {
                    sQLiteStatement.bindText(11, strM3);
                }
                String str19 = iVar.f254094n;
                if (str19 == null) {
                    sQLiteStatement.bindNull(12);
                } else {
                    sQLiteStatement.bindText(12, str19);
                }
                String str20 = iVar.o;
                if (str20 == null) {
                    sQLiteStatement.bindNull(13);
                } else {
                    sQLiteStatement.bindText(13, str20);
                }
                if (iVar.f254095p == null) {
                    sQLiteStatement.bindNull(14);
                } else {
                    sQLiteStatement.bindLong(14, r3.intValue());
                }
                sQLiteStatement.bindLong(15, iVar.f254096q ? 1L : 0L);
                sQLiteStatement.bindLong(16, iVar.f254097r ? 1L : 0L);
                sQLiteStatement.bindLong(17, iVar.f254098s ? 1L : 0L);
                sQLiteStatement.bindLong(18, iVar.f254099t ? 1L : 0L);
                String str21 = iVar.u;
                if (str21 == null) {
                    sQLiteStatement.bindNull(19);
                } else {
                    sQLiteStatement.bindText(19, str21);
                }
                if (iVar.f254091j != null) {
                    sQLiteStatement.bindLong(20, r3.f254111a);
                } else {
                    sQLiteStatement.bindNull(20);
                }
                rgc.j jVar2 = iVar.f254093m;
                if (jVar2 == null) {
                    sQLiteStatement.bindNull(21);
                    sQLiteStatement.bindNull(22);
                    return;
                }
                sQLiteStatement.bindLong(21, jVar2.f254100a);
                String str22 = jVar2.f254101b;
                if (str22 == null) {
                    sQLiteStatement.bindNull(22);
                    return;
                } else {
                    sQLiteStatement.bindText(22, str22);
                    return;
                }
            case 10:
                stg.a aVar2 = (stg.a) obj2;
                sQLiteStatement.bindLong(1, aVar2.f265580a);
                String str23 = aVar2.f265581b;
                if (str23 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str23);
                }
                sQLiteStatement.bindLong(3, aVar2.f265582c ? 1L : 0L);
                String str24 = aVar2.d;
                if (str24 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, str24);
                }
                String str25 = aVar2.e;
                if (str25 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, str25);
                }
                String str26 = aVar2.f;
                if (str26 == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, str26);
                }
                sQLiteStatement.bindLong(7, aVar2.f265583g ? 1L : 0L);
                return;
            case 11:
                stg.b bVar = (stg.b) obj2;
                String str27 = bVar.f265584a;
                if (str27 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str27);
                }
                String str28 = bVar.f265585b;
                if (str28 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str28);
                }
                String str29 = bVar.f265586c;
                if (str29 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, str29);
                }
                Long lD = b21.a.d(bVar.d);
                if (lD == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindLong(4, lD.longValue());
                }
                Long lD2 = b21.a.d(bVar.e);
                if (lD2 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindLong(5, lD2.longValue());
                }
                String str30 = bVar.f;
                if (str30 == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, str30);
                }
                String str31 = bVar.f265587g;
                if (str31 == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindText(7, str31);
                }
                String str32 = bVar.f265588h;
                if (str32 == null) {
                    sQLiteStatement.bindNull(8);
                } else {
                    sQLiteStatement.bindText(8, str32);
                }
                stg.c cVar = bVar.i;
                if (cVar != null) {
                    strK = GsonHolder.a().k(cVar);
                    Intrinsics.checkNotNullExpressionValue(strK, "toJson(...)");
                } else {
                    strK = null;
                }
                if (strK == null) {
                    sQLiteStatement.bindNull(9);
                } else {
                    sQLiteStatement.bindText(9, strK);
                }
                String strA4 = ttg.a.a(bVar.f265589j);
                if (strA4 == null) {
                    sQLiteStatement.bindNull(10);
                } else {
                    sQLiteStatement.bindText(10, strA4);
                }
                String strA5 = ttg.a.a(bVar.k);
                if (strA5 == null) {
                    sQLiteStatement.bindNull(11);
                } else {
                    sQLiteStatement.bindText(11, strA5);
                }
                sQLiteStatement.bindLong(12, bVar.f265590l ? 1L : 0L);
                String strH = b21.a.h(bVar.f265591m);
                if (strH == null) {
                    sQLiteStatement.bindNull(13);
                    return;
                } else {
                    sQLiteStatement.bindText(13, strH);
                    return;
                }
            case 12:
                svj.f fVar = (svj.f) obj2;
                fVar.getClass();
                sQLiteStatement.bindLong(1, 0);
                sQLiteStatement.bindLong(2, fVar.f266029a);
                return;
            case 13:
                u10.b bVar2 = (u10.b) obj2;
                String strC = s10.a.c(bVar2.f276237a);
                if (strC == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, strC);
                }
                String str33 = bVar2.f276238b;
                if (str33 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str33);
                }
                String str34 = bVar2.f276239c;
                if (str34 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, str34);
                }
                String str35 = bVar2.d;
                if (str35 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, str35);
                }
                String str36 = bVar2.e;
                if (str36 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, str36);
                }
                String str37 = bVar2.f;
                if (str37 == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, str37);
                }
                String str38 = bVar2.f276240g;
                if (str38 == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindText(7, str38);
                }
                if (bVar2.f276241h == null) {
                    sQLiteStatement.bindNull(8);
                } else {
                    sQLiteStatement.bindDouble(8, r3.floatValue());
                }
                Long l22 = bVar2.i;
                if (l22 == null) {
                    sQLiteStatement.bindNull(9);
                } else {
                    sQLiteStatement.bindLong(9, l22.longValue());
                }
                String strB = s10.a.b(bVar2.f276242j);
                if (strB == null) {
                    sQLiteStatement.bindNull(10);
                } else {
                    sQLiteStatement.bindText(10, strB);
                }
                Period period = bVar2.k;
                String strK6 = null;
                String string = period != null ? period.toString() : null;
                if (string == null) {
                    sQLiteStatement.bindNull(11);
                } else {
                    sQLiteStatement.bindText(11, string);
                }
                Period period2 = bVar2.f276243l;
                String string2 = period2 != null ? period2.toString() : null;
                if (string2 == null) {
                    sQLiteStatement.bindNull(12);
                } else {
                    sQLiteStatement.bindText(12, string2);
                }
                if (bVar2.f276244m == null) {
                    sQLiteStatement.bindNull(13);
                } else {
                    sQLiteStatement.bindLong(13, r3.intValue());
                }
                if (bVar2.f276245n == null) {
                    sQLiteStatement.bindNull(14);
                } else {
                    sQLiteStatement.bindLong(14, r3.intValue());
                }
                Period period3 = bVar2.o;
                String string3 = period3 != null ? period3.toString() : null;
                if (string3 == null) {
                    sQLiteStatement.bindNull(15);
                } else {
                    sQLiteStatement.bindText(15, string3);
                }
                List list = bVar2.f276246p;
                if (list != null) {
                    strK6 = w10.j.a().k(list);
                    Intrinsics.checkNotNullExpressionValue(strK6, "toJson(...)");
                }
                if (strK6 == null) {
                    sQLiteStatement.bindNull(16);
                } else {
                    sQLiteStatement.bindText(16, strK6);
                }
                sQLiteStatement.bindLong(17, bVar2.f276247q ? 1L : 0L);
                String str39 = bVar2.f276248r;
                if (str39 == null) {
                    sQLiteStatement.bindNull(18);
                } else {
                    sQLiteStatement.bindText(18, str39);
                }
                String strB2 = s10.a.b(bVar2.f276249s);
                if (strB2 == null) {
                    sQLiteStatement.bindNull(19);
                    return;
                } else {
                    sQLiteStatement.bindText(19, strB2);
                    return;
                }
            case 14:
                u10.f fVar2 = (u10.f) obj2;
                String strC2 = s10.a.c(fVar2.f276264a);
                if (strC2 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, strC2);
                }
                sQLiteStatement.bindLong(2, fVar2.f276265b);
                String strC3 = s10.a.c(fVar2.f276266c);
                if (strC3 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, strC3);
                }
                String str40 = fVar2.d;
                if (str40 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, str40);
                }
                String str41 = fVar2.e;
                if (str41 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, str41);
                }
                s0 s0Var = fVar2.f;
                String strName = s0Var != null ? s0Var.name() : null;
                if (strName == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, strName);
                }
                String strB3 = s10.a.b(fVar2.f276267g);
                if (strB3 == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindText(7, strB3);
                }
                String strB4 = s10.a.b(fVar2.f276268h);
                if (strB4 == null) {
                    sQLiteStatement.bindNull(8);
                } else {
                    sQLiteStatement.bindText(8, strB4);
                }
                String strB5 = s10.a.b(fVar2.i);
                if (strB5 == null) {
                    sQLiteStatement.bindNull(9);
                } else {
                    sQLiteStatement.bindText(9, strB5);
                }
                String strB6 = s10.a.b(fVar2.f276269j);
                if (strB6 == null) {
                    sQLiteStatement.bindNull(10);
                } else {
                    sQLiteStatement.bindText(10, strB6);
                }
                Boolean bool = fVar2.k;
                if ((bool == null ? null : Integer.valueOf(bool.booleanValue() ? 1 : 0)) == null) {
                    sQLiteStatement.bindNull(11);
                } else {
                    sQLiteStatement.bindLong(11, r3.intValue());
                }
                String str42 = fVar2.f276270l;
                if (str42 == null) {
                    sQLiteStatement.bindNull(12);
                } else {
                    sQLiteStatement.bindText(12, str42);
                }
                sQLiteStatement.bindLong(13, fVar2.f276271m ? 1L : 0L);
                sQLiteStatement.bindLong(14, fVar2.f276272n ? 1L : 0L);
                sQLiteStatement.bindLong(15, fVar2.o ? 1L : 0L);
                sQLiteStatement.bindLong(16, fVar2.f276273p ? 1L : 0L);
                u0 u0Var = fVar2.f276274q;
                String strB7 = u0Var != null ? u0Var.b() : null;
                if (strB7 == null) {
                    sQLiteStatement.bindNull(17);
                } else {
                    sQLiteStatement.bindText(17, strB7);
                }
                String strA6 = s10.a.a(fVar2.f276275r);
                if (strA6 == null) {
                    sQLiteStatement.bindNull(18);
                } else {
                    sQLiteStatement.bindText(18, strA6);
                }
                String strC4 = s10.a.c(fVar2.f276278w);
                if (strC4 == null) {
                    sQLiteStatement.bindNull(19);
                } else {
                    sQLiteStatement.bindText(19, strC4);
                }
                p pVar = fVar2.f276276s;
                if (pVar != null) {
                    String str43 = pVar.f276314a;
                    if (str43 == null) {
                        sQLiteStatement.bindNull(20);
                    } else {
                        sQLiteStatement.bindText(20, str43);
                    }
                    String str44 = pVar.f276315b;
                    if (str44 == null) {
                        sQLiteStatement.bindNull(21);
                    } else {
                        sQLiteStatement.bindText(21, str44);
                    }
                    String str45 = pVar.f276316c;
                    if (str45 == null) {
                        sQLiteStatement.bindNull(22);
                    } else {
                        sQLiteStatement.bindText(22, str45);
                    }
                    String str46 = pVar.d;
                    if (str46 == null) {
                        sQLiteStatement.bindNull(23);
                    } else {
                        sQLiteStatement.bindText(23, str46);
                    }
                } else {
                    prk.o.z(sQLiteStatement, 20, 21, 22, 23);
                }
                r rVar = fVar2.f276277t;
                if (rVar != null) {
                    String str47 = rVar.f276323a;
                    if (str47 == null) {
                        sQLiteStatement.bindNull(24);
                    } else {
                        sQLiteStatement.bindText(24, str47);
                    }
                    String str48 = rVar.f276324b;
                    if (str48 == null) {
                        sQLiteStatement.bindNull(25);
                    } else {
                        sQLiteStatement.bindText(25, str48);
                    }
                } else {
                    sQLiteStatement.bindNull(24);
                    sQLiteStatement.bindNull(25);
                }
                u10.c cVar2 = fVar2.u;
                if (cVar2 != null) {
                    String strC5 = s10.a.c(cVar2.getCallId());
                    if (strC5 == null) {
                        sQLiteStatement.bindNull(26);
                    } else {
                        sQLiteStatement.bindText(26, strC5);
                    }
                    if (cVar2.getReferenceSID() == null) {
                        sQLiteStatement.bindNull(27);
                    } else {
                        sQLiteStatement.bindText(27, cVar2.getReferenceSID());
                    }
                    if (cVar2.getDirection() == null) {
                        sQLiteStatement.bindNull(28);
                    } else {
                        sQLiteStatement.bindText(28, cVar2.getDirection());
                    }
                    String strC6 = s10.a.c(cVar2.getAgentId());
                    if (strC6 == null) {
                        sQLiteStatement.bindNull(29);
                    } else {
                        sQLiteStatement.bindText(29, strC6);
                    }
                    String strB8 = s10.a.b(cVar2.getCreatedAt());
                    if (strB8 == null) {
                        sQLiteStatement.bindNull(30);
                    } else {
                        sQLiteStatement.bindText(30, strB8);
                    }
                    String strB9 = s10.a.b(cVar2.getStartedAt());
                    if (strB9 == null) {
                        sQLiteStatement.bindNull(31);
                    } else {
                        sQLiteStatement.bindText(31, strB9);
                    }
                    String strB10 = s10.a.b(cVar2.getCompletedAt());
                    if (strB10 == null) {
                        sQLiteStatement.bindNull(32);
                    } else {
                        sQLiteStatement.bindText(32, strB10);
                    }
                    if (cVar2.getState() == null) {
                        sQLiteStatement.bindNull(33);
                    } else {
                        sQLiteStatement.bindText(33, cVar2.getState());
                    }
                    if (cVar2.getCallType() == null) {
                        sQLiteStatement.bindNull(34);
                    } else {
                        sQLiteStatement.bindText(34, cVar2.getCallType());
                    }
                    if (cVar2.getCallCompletionReason() == null) {
                        sQLiteStatement.bindNull(35);
                    } else {
                        sQLiteStatement.bindText(35, cVar2.getCallCompletionReason());
                    }
                    Period duration = cVar2.getDuration();
                    String string4 = duration != null ? duration.toString() : null;
                    if (string4 == null) {
                        sQLiteStatement.bindNull(36);
                    } else {
                        sQLiteStatement.bindText(36, string4);
                    }
                } else {
                    prk.o.z(sQLiteStatement, 26, 27, 28, 29);
                    prk.o.z(sQLiteStatement, 30, 31, 32, 33);
                    prk.o.y(sQLiteStatement, 34, 35, 36);
                }
                u10.k kVar2 = fVar2.v;
                if (kVar2 == null) {
                    prk.o.z(sQLiteStatement, 37, 38, 39, 40);
                    prk.o.z(sQLiteStatement, 41, 42, 43, 44);
                    sQLiteStatement.bindNull(45);
                    sQLiteStatement.bindNull(46);
                    return;
                }
                String strC7 = s10.a.c(kVar2.f276297a);
                if (strC7 == null) {
                    sQLiteStatement.bindNull(37);
                } else {
                    sQLiteStatement.bindText(37, strC7);
                }
                String str49 = kVar2.f276298b;
                if (str49 == null) {
                    sQLiteStatement.bindNull(38);
                } else {
                    sQLiteStatement.bindText(38, str49);
                }
                String strB11 = s10.a.b(kVar2.f276299c);
                if (strB11 == null) {
                    sQLiteStatement.bindNull(39);
                } else {
                    sQLiteStatement.bindText(39, strB11);
                }
                String strB12 = s10.a.b(kVar2.d);
                if (strB12 == null) {
                    sQLiteStatement.bindNull(40);
                } else {
                    sQLiteStatement.bindText(40, strB12);
                }
                String strC8 = s10.a.c(kVar2.e);
                if (strC8 == null) {
                    sQLiteStatement.bindNull(41);
                } else {
                    sQLiteStatement.bindText(41, strC8);
                }
                String strB13 = s10.a.b(kVar2.f);
                if (strB13 == null) {
                    sQLiteStatement.bindNull(42);
                } else {
                    sQLiteStatement.bindText(42, strB13);
                }
                String str50 = kVar2.f276300g;
                if (str50 == null) {
                    sQLiteStatement.bindNull(43);
                } else {
                    sQLiteStatement.bindText(43, str50);
                }
                String str51 = kVar2.f276301h;
                if (str51 == null) {
                    sQLiteStatement.bindNull(44);
                } else {
                    sQLiteStatement.bindText(44, str51);
                }
                String str52 = kVar2.i;
                if (str52 == null) {
                    sQLiteStatement.bindNull(45);
                } else {
                    sQLiteStatement.bindText(45, str52);
                }
                String str53 = kVar2.f276302j;
                if (str53 == null) {
                    sQLiteStatement.bindNull(46);
                    return;
                } else {
                    sQLiteStatement.bindText(46, str53);
                    return;
                }
            case 15:
                u10.d dVar2 = (u10.d) obj2;
                String strC9 = s10.a.c(dVar2.f276256a);
                if (strC9 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, strC9);
                }
                String str54 = dVar2.f276257b;
                if (str54 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str54);
                }
                String str55 = dVar2.f276258c;
                if (str55 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, str55);
                }
                String str56 = dVar2.d;
                if (str56 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, str56);
                }
                sQLiteStatement.bindLong(5, dVar2.e);
                String strC10 = s10.a.c(dVar2.f);
                if (strC10 == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, strC10);
                }
                String str57 = dVar2.f276259g;
                if (str57 == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindText(7, str57);
                }
                List list2 = dVar2.f276260h;
                if (list2 != null) {
                    strK2 = w10.j.a().k(list2);
                    Intrinsics.checkNotNullExpressionValue(strK2, "toJson(...)");
                } else {
                    strK2 = null;
                }
                if (strK2 == null) {
                    sQLiteStatement.bindNull(8);
                } else {
                    sQLiteStatement.bindText(8, strK2);
                }
                String str58 = dVar2.i;
                if (str58 == null) {
                    sQLiteStatement.bindNull(9);
                } else {
                    sQLiteStatement.bindText(9, str58);
                }
                String strB14 = s10.a.b(dVar2.f276261j);
                if (strB14 == null) {
                    sQLiteStatement.bindNull(10);
                } else {
                    sQLiteStatement.bindText(10, strB14);
                }
                String strB15 = s10.a.b(dVar2.k);
                if (strB15 == null) {
                    sQLiteStatement.bindNull(11);
                    return;
                } else {
                    sQLiteStatement.bindText(11, strB15);
                    return;
                }
            case 16:
                u10.g gVar = (u10.g) obj2;
                sQLiteStatement.bindLong(1, gVar.f276279a);
                String strC11 = s10.a.c(gVar.f276280b);
                if (strC11 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, strC11);
                }
                String strA7 = s10.a.a(gVar.f276281c);
                if (strA7 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, strA7);
                }
                String strC12 = s10.a.c(gVar.d);
                if (strC12 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, strC12);
                }
                sQLiteStatement.bindLong(5, gVar.e ? 1L : 0L);
                return;
            case 17:
                u10.h hVar = (u10.h) obj2;
                String strC13 = s10.a.c(hVar.f276282a);
                if (strC13 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, strC13);
                }
                String strB16 = s10.a.b(hVar.f276283b);
                if (strB16 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, strB16);
                }
                String strC14 = s10.a.c(hVar.f276284c);
                if (strC14 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, strC14);
                }
                String str59 = hVar.d;
                if (str59 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, str59);
                }
                String strA8 = s10.a.a(hVar.e);
                if (strA8 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, strA8);
                }
                String strB17 = s10.a.b(hVar.f);
                if (strB17 == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, strB17);
                }
                String strC15 = s10.a.c(hVar.f276285g);
                if (strC15 == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindText(7, strC15);
                }
                String strC16 = s10.a.c(hVar.f276286h);
                if (strC16 == null) {
                    sQLiteStatement.bindNull(8);
                } else {
                    sQLiteStatement.bindText(8, strC16);
                }
                sQLiteStatement.bindLong(9, hVar.i);
                sQLiteStatement.bindLong(10, hVar.f276287j);
                sQLiteStatement.bindLong(11, hVar.k);
                return;
            case 18:
                u10.i iVar2 = (u10.i) obj2;
                String strC17 = s10.a.c(iVar2.f276288a);
                if (strC17 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, strC17);
                }
                String strB18 = s10.a.b(iVar2.f276289b);
                if (strB18 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, strB18);
                }
                String strC18 = s10.a.c(iVar2.f276290c);
                if (strC18 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, strC18);
                }
                String str60 = iVar2.d;
                if (str60 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, str60);
                }
                String strA9 = s10.a.a(iVar2.e);
                if (strA9 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, strA9);
                }
                String strB19 = s10.a.b(iVar2.f);
                if (strB19 == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, strB19);
                }
                String strC19 = s10.a.c(iVar2.f276291g);
                if (strC19 == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindText(7, strC19);
                }
                String strC20 = s10.a.c(iVar2.f276292h);
                if (strC20 == null) {
                    sQLiteStatement.bindNull(8);
                } else {
                    sQLiteStatement.bindText(8, strC20);
                }
                String str61 = iVar2.i;
                if (str61 == null) {
                    sQLiteStatement.bindNull(9);
                    return;
                } else {
                    sQLiteStatement.bindText(9, str61);
                    return;
                }
            case 19:
                u10.j jVar3 = (u10.j) obj2;
                String strC21 = s10.a.c(jVar3.f276293a);
                if (strC21 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, strC21);
                }
                String strA10 = s10.a.a(jVar3.f276294b);
                if (strA10 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, strA10);
                }
                String strC22 = s10.a.c(jVar3.f276295c);
                if (strC22 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, strC22);
                }
                sQLiteStatement.bindLong(4, jVar3.d ? 1L : 0L);
                sQLiteStatement.bindLong(5, jVar3.e ? 1L : 0L);
                sQLiteStatement.bindLong(6, jVar3.f ? 1L : 0L);
                sQLiteStatement.bindLong(7, jVar3.f276296g ? 1L : 0L);
                return;
            case 20:
                l lVar = (l) obj2;
                String strC23 = s10.a.c(lVar.f276303a);
                if (strC23 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, strC23);
                }
                String strC24 = s10.a.c(lVar.f276304b);
                if (strC24 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, strC24);
                }
                String strC25 = s10.a.c(lVar.f276305c);
                if (strC25 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, strC25);
                }
                String strA11 = s10.a.a(lVar.d);
                if (strA11 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, strA11);
                }
                String strB20 = s10.a.b(lVar.e);
                if (strB20 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, strB20);
                }
                String strB21 = s10.a.b(lVar.f);
                if (strB21 == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, strB21);
                }
                String str62 = lVar.f276306g;
                if (str62 == null) {
                    sQLiteStatement.bindNull(7);
                    return;
                } else {
                    sQLiteStatement.bindText(7, str62);
                    return;
                }
            case 21:
                u10.m mVar2 = (u10.m) obj2;
                String str63 = mVar2.f276307a;
                if (str63 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str63);
                }
                String str64 = mVar2.f276308b;
                if (str64 == null) {
                    sQLiteStatement.bindNull(2);
                    return;
                } else {
                    sQLiteStatement.bindText(2, str64);
                    return;
                }
            case 22:
                a(sQLiteStatement, obj2);
                return;
            case 23:
                b(sQLiteStatement, obj2);
                return;
            case 24:
                c(sQLiteStatement, obj2);
                return;
            case 25:
                d(sQLiteStatement, obj2);
                return;
            case 26:
                String str65 = ((vdd.o) obj2).f287916a;
                if (str65 == null) {
                    sQLiteStatement.bindNull(1);
                    return;
                } else {
                    sQLiteStatement.bindText(1, str65);
                    return;
                }
            case 27:
                e(sQLiteStatement, obj2);
                return;
            case 28:
                f(sQLiteStatement, obj2);
                return;
            default:
                d0 d0Var = (d0) obj2;
                String str66 = d0Var.f292933a;
                if (str66 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str66);
                }
                sQLiteStatement.bindLong(2, d0Var.f292934b ? 1L : 0L);
                return;
        }
    }

    @Override // androidx.room.EntityInsertAdapter
    public final String createQuery() {
        switch (this.f224852a) {
            case 0:
                return "INSERT OR REPLACE INTO `travel_miles_topup` (`id`,`createdDate`,`updatedDate`,`state`) VALUES (?,?,?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `banners_closed_ids` (`banner_id`) VALUES (?)";
            case 2:
                return "INSERT OR REPLACE INTO `banners_keys` (`id`) VALUES (?)";
            case 3:
                return "INSERT OR REPLACE INTO `banners` (`id`,`type`,`single_cta_id`,`single_cta_priority`,`single_cta_image`,`single_cta_title`,`single_cta_text`,`single_cta_closeable`,`single_cta_action`,`no_cta_id`,`no_cta_priority`,`no_cta_image`,`no_cta_title`,`no_cta_text`,`no_cta_closeable`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 4:
                return "INSERT OR REPLACE INTO `banners_keys_relations` (`key_id`,`banner_id`) VALUES (?,?)";
            case 5:
                return "INSERT OR REPLACE INTO `vat_reminder` (`id`,`enabled`,`assessment_period`,`closing_month`) VALUES (?,?,?,?)";
            case 6:
                return "INSERT OR REPLACE INTO `rewards_categories` (`id`,`name`,`perks`,`order`,`type`) VALUES (?,?,?,?,?)";
            case 7:
                return "INSERT OR REPLACE INTO `rewards_collections` (`id`,`order`,`imageUrl`) VALUES (?,?,?)";
            case 8:
                return "INSERT OR REPLACE INTO `rewards_short` (`id`,`perk_id`,`type`,`start`,`end`,`merchant`,`description`,`category`,`claimType`,`activation_state`,`recommended`,`homeFeed`,`partner`,`only_manual_activation`,`social_proof_likes`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 9:
                return "INSERT OR REPLACE INTO `rewards_details` (`id`,`type`,`primaryCategoryId`,`description`,`loyalty_description`,`details`,`merchant`,`start`,`end`,`steps`,`loyalty_steps`,`claim_type`,`activation_state`,`total_outlets_number`,`extra_cashback`,`only_manual_activation`,`requires_external_registration`,`can_redeem_via_email`,`activation_button_text`,`social_proof_likes`,`feedbackrating`,`feedbackcomment`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 10:
                return "INSERT OR REPLACE INTO `account_closure_backend_requested` (`id`,`portfolio_id`,`terminationRequested`,`title`,`subtitle`,`content`,`legacy`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
            case 11:
                return "INSERT OR REPLACE INTO `account_closure_progress` (`id`,`state`,`portfolioId`,`createdDate`,`updatedDate`,`source`,`tradingLegalEntityId`,`reason`,`currentStep`,`pendingSteps`,`completedSteps`,`blocked`,`estimatedCompletionDate`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 12:
                return "INSERT OR REPLACE INTO `trips_metadata` (`id`,`lastModified`) VALUES (?,?)";
            case 13:
                return "INSERT OR REPLACE INTO `agents` (`id`,`name`,`shortName`,`title`,`email`,`bio`,`avatarUrl`,`rating`,`chats`,`firstMessage`,`totalResolution`,`firstResponse`,`wowReviews`,`totalReviews`,`tenure`,`compliments`,`isBot`,`presenceStateValue`,`presenceStateAvailableAt`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 14:
                return "INSERT OR REPLACE INTO `chats` (`id`,`unreadCount`,`firstUnreadMessageId`,`lastMessage`,`title`,`ticketState`,`createdAt`,`updatedAt`,`dismissedAt`,`dismissedCallTileAt`,`isDismissed`,`agent`,`isReadOnly`,`isCloseable`,`isBot`,`isAnonymous`,`ticketType`,`feedType`,`feedId`,`rating_value`,`rating_title`,`rating_asset`,`rating_icon`,`category_title`,`category_tag`,`lastCall_callId`,`lastCall_referenceSID`,`lastCall_direction`,`lastCall_agentId`,`lastCall_createdAt`,`lastCall_startedAt`,`lastCall_completedAt`,`lastCall_state`,`lastCall_callType`,`lastCall_callCompletionReason`,`lastCall_duration`,`lastCallRequest_callRequestId`,`lastCallRequest_state`,`lastCallRequest_createdAt`,`lastCallRequest_scheduledAt`,`lastCallRequest_scheduledAgentId`,`lastCallRequest_updatedAt`,`lastCallRequest_category`,`lastCallRequest_language`,`lastCallRequest_callType`,`lastCallRequest_canceledBy`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 15:
                return "INSERT OR REPLACE INTO `chat_drafts` (`id`,`routingMode`,`routingKeyValue`,`text`,`inputMessageVersion`,`replyToMessageServerId`,`replyToSelectedText`,`pendingAttachments`,`voiceRecording`,`createdAt`,`expiresAt`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            case 16:
                return "INSERT OR REPLACE INTO `chat_history_load_state` (`id`,`chatId`,`feedType`,`feedId`,`historyFullyLoaded`) VALUES (nullif(?, 0),?,?,?,?)";
            case 17:
                return "INSERT OR REPLACE INTO `messages` (`id`,`createdAt`,`chatId`,`data`,`feedType`,`ticketCreatedAt`,`feedId`,`serverId`,`chatIdGroup`,`feedIdGroup`,`feedTypeGroup`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            case 18:
                return "INSERT OR REPLACE INTO `uploads` (`id`,`createdAt`,`chatId`,`data`,`feedType`,`ticketCreatedAt`,`feedId`,`serverId`,`uploadType`) VALUES (?,?,?,?,?,?,?,?,?)";
            case 19:
                return "INSERT OR REPLACE INTO `feeds` (`id`,`feedType`,`ticketId`,`isActive`,`allowOpeningTicket`,`allowArchiving`,`archived`) VALUES (?,?,?,?,?,?,?)";
            case 20:
                return "INSERT OR REPLACE INTO `message_search` (`messageId`,`chatId`,`feedId`,`feedType`,`ticketCreatedAt`,`createdAt`,`searchText`) VALUES (?,?,?,?,?,?,?)";
            case 21:
                return "INSERT OR REPLACE INTO `message_search_meta` (`key`,`value`) VALUES (?,?)";
            case 22:
                return "INSERT OR REPLACE INTO `pending_uploads` (`uploadCorrelationId`,`ticketId`,`messageId`,`messageCorrelationId`,`filePath`,`contentType`,`status`,`createdAt`) VALUES (?,?,?,?,?,?,?,?)";
            case 23:
                return "INSERT OR REPLACE INTO `revolut_card_sca_counters` (`cardId`,`contactlessCounter`) VALUES (?,?)";
            case 24:
                return "INSERT OR REPLACE INTO `moneybox_transactions` (`id`,`accruesInterestSince`,`executedDate`) VALUES (?,?,?)";
            case 25:
                return "INSERT OR REPLACE INTO `vaults` (`id`,`savingsAccountId`,`state`,`stateReason`,`type`,`ownerId`,`goal`,`banner`,`underlyingId`,`pocketInfo`,`depositInfo`,`members`,`estimate`,`deadline`,`recurringPayments`,`accountType`,`createdDate`,`updatedDate`,`workflowId`,`pendingActivationReason`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 26:
                return "INSERT OR REPLACE INTO `vaults_account_type_states` (`accountType`) VALUES (?)";
            case 27:
                return "INSERT OR REPLACE INTO `referrals_invitation` (`id`,`emptyChat_title`,`emptyChat_description`,`emptyChat_darkImage`,`emptyChat_lightImage`,`emptyChat_acceptButton`,`chat_description`,`chat_darkImage`,`chat_lightImage`,`chat_acceptButton`,`chat_declineButton`,`beneficiaryProfile_title`,`beneficiaryProfile_description`,`transactionDetails_title`,`transactionDetails_description`,`transactionFee_title`,`transactionFee_description`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 28:
                return "INSERT OR REPLACE INTO `rev_points_transaction` (`pointsTransactionId`,`type`,`points`,`createdDate`,`coreTransactionId`,`product`,`state`,`description`,`name`,`iconsUrl`,`exchangeDetails`,`exchangedAmount`,`originId`,`originResource`,`receivedExchangeDetails`,`earningDetails`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR REPLACE INTO `rev_points_transaction_metadata` (`metadataKey`,`metadataValue`) VALUES (?,?)";
        }
    }

    public /* synthetic */ i(Object obj2, int i) {
        this.f224852a = i;
    }
}
