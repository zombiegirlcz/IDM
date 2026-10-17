package nvg;

import androidx.room.EntityInsertAdapter;
import androidx.sqlite.SQLiteStatement;
import com.revolut.data.utils.gson.GsonHolder;
import java.time.ZonedDateTime;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends EntityInsertAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f219598a;

    private final void a(SQLiteStatement sQLiteStatement, Object obj2) {
        pvg.f0 f0Var = (pvg.f0) obj2;
        String strA = pvg.t.a(f0Var.f240125a);
        if (strA == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, strA);
        }
        String strC = pvg.t.c(f0Var.f240126b);
        if (strC == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindText(2, strC);
        }
        String strB = pvg.t.b(f0Var.f240127c);
        if (strB == null) {
            sQLiteStatement.bindNull(3);
        } else {
            sQLiteStatement.bindText(3, strB);
        }
        String strD = pvg.t.d(f0Var.d);
        if (strD == null) {
            sQLiteStatement.bindNull(4);
        } else {
            sQLiteStatement.bindText(4, strD);
        }
        String str = f0Var.e;
        if (str == null) {
            sQLiteStatement.bindNull(5);
        } else {
            sQLiteStatement.bindText(5, str);
        }
        String str2 = f0Var.f;
        if (str2 == null) {
            sQLiteStatement.bindNull(6);
        } else {
            sQLiteStatement.bindText(6, str2);
        }
        String str3 = f0Var.f240128g;
        if (str3 == null) {
            sQLiteStatement.bindNull(7);
        } else {
            sQLiteStatement.bindText(7, str3);
        }
        String strO = b21.a.o(f0Var.f240129h);
        if (strO == null) {
            sQLiteStatement.bindNull(8);
        } else {
            sQLiteStatement.bindText(8, strO);
        }
        sQLiteStatement.bindDouble(9, f0Var.i);
        LocalDate localDate = f0Var.f240130j;
        String string = localDate != null ? localDate.toString("yyyy-MM-dd") : null;
        if (string == null) {
            sQLiteStatement.bindNull(10);
        } else {
            sQLiteStatement.bindText(10, string);
        }
        String str4 = f0Var.k;
        if (str4 == null) {
            sQLiteStatement.bindNull(11);
        } else {
            sQLiteStatement.bindText(11, str4);
        }
    }

    private final void b(SQLiteStatement sQLiteStatement, Object obj2) {
        pvg.i0 i0Var = (pvg.i0) obj2;
        String strA = pvg.t.a(i0Var.f240162a);
        if (strA == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, strA);
        }
        String strC = pvg.t.c(i0Var.f240163b);
        if (strC == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindText(2, strC);
        }
        String str = i0Var.f240164c;
        if (str == null) {
            sQLiteStatement.bindNull(3);
        } else {
            sQLiteStatement.bindText(3, str);
        }
        sQLiteStatement.bindText(4, i0Var.d);
        Long lB = b21.a.b(i0Var.e);
        if (lB == null) {
            sQLiteStatement.bindNull(5);
        } else {
            sQLiteStatement.bindLong(5, lB.longValue());
        }
        Long lB2 = b21.a.b(i0Var.f);
        if (lB2 == null) {
            sQLiteStatement.bindNull(6);
        } else {
            sQLiteStatement.bindLong(6, lB2.longValue());
        }
        String strO = b21.a.o(i0Var.f240165g);
        if (strO == null) {
            sQLiteStatement.bindNull(7);
        } else {
            sQLiteStatement.bindText(7, strO);
        }
        String strO2 = b21.a.o(i0Var.f240166h);
        if (strO2 == null) {
            sQLiteStatement.bindNull(8);
        } else {
            sQLiteStatement.bindText(8, strO2);
        }
        sQLiteStatement.bindText(9, i0Var.i);
    }

    private final void c(SQLiteStatement sQLiteStatement, Object obj2) {
        pvg.g0 g0Var = (pvg.g0) obj2;
        String strA = pvg.t.a(g0Var.f240134a);
        if (strA == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, strA);
        }
        String strC = pvg.t.c(g0Var.f240135b);
        if (strC == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindText(2, strC);
        }
        String str = g0Var.f240136c;
        if (str == null) {
            sQLiteStatement.bindNull(3);
        } else {
            sQLiteStatement.bindText(3, str);
        }
        sQLiteStatement.bindText(4, g0Var.d);
        Long lB = b21.a.b(g0Var.e);
        if (lB == null) {
            sQLiteStatement.bindNull(5);
        } else {
            sQLiteStatement.bindLong(5, lB.longValue());
        }
        String strO = b21.a.o(g0Var.f);
        if (strO == null) {
            sQLiteStatement.bindNull(6);
        } else {
            sQLiteStatement.bindText(6, strO);
        }
        String strO2 = b21.a.o(g0Var.f240137g);
        if (strO2 == null) {
            sQLiteStatement.bindNull(7);
        } else {
            sQLiteStatement.bindText(7, strO2);
        }
        sQLiteStatement.bindText(8, g0Var.f240138h);
    }

    private final void d(SQLiteStatement sQLiteStatement, Object obj2) {
        qfg.c cVar = (qfg.c) obj2;
        String str = cVar.f245303a;
        if (str == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, str);
        }
        String str2 = cVar.f245304b;
        if (str2 == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindText(2, str2);
        }
        String str3 = cVar.f245305c;
        if (str3 == null) {
            sQLiteStatement.bindNull(3);
        } else {
            sQLiteStatement.bindText(3, str3);
        }
        String str4 = cVar.d;
        if (str4 == null) {
            sQLiteStatement.bindNull(4);
        } else {
            sQLiteStatement.bindText(4, str4);
        }
        String str5 = cVar.e;
        if (str5 == null) {
            sQLiteStatement.bindNull(5);
        } else {
            sQLiteStatement.bindText(5, str5);
        }
        String str6 = cVar.f;
        if (str6 == null) {
            sQLiteStatement.bindNull(6);
        } else {
            sQLiteStatement.bindText(6, str6);
        }
        String str7 = cVar.f245306g;
        if (str7 == null) {
            sQLiteStatement.bindNull(7);
        } else {
            sQLiteStatement.bindText(7, str7);
        }
        sQLiteStatement.bindLong(8, cVar.f245307h ? 1L : 0L);
        String str8 = cVar.i;
        if (str8 == null) {
            sQLiteStatement.bindNull(9);
        } else {
            sQLiteStatement.bindText(9, str8);
        }
        String strA = nfg.a.a(cVar.k);
        if (strA == null) {
            sQLiteStatement.bindNull(10);
        } else {
            sQLiteStatement.bindText(10, strA);
        }
        List list = cVar.f245309l;
        String strR = list != null ? com.revolut.data.database.models.openbanking.d.r("toJson(...)", list) : null;
        if (strR == null) {
            sQLiteStatement.bindNull(11);
        } else {
            sQLiteStatement.bindText(11, strR);
        }
        List list2 = cVar.f245310m;
        String strR2 = list2 != null ? com.revolut.data.database.models.openbanking.d.r("toJson(...)", list2) : null;
        if (strR2 == null) {
            sQLiteStatement.bindNull(12);
        } else {
            sQLiteStatement.bindText(12, strR2);
        }
        String str9 = cVar.f245311n;
        if (str9 == null) {
            sQLiteStatement.bindNull(13);
        } else {
            sQLiteStatement.bindText(13, str9);
        }
        qfg.f fVar = cVar.f245308j;
        String str10 = fVar.f245320a;
        if (str10 == null) {
            sQLiteStatement.bindNull(14);
        } else {
            sQLiteStatement.bindText(14, str10);
        }
        String str11 = fVar.f245321b;
        if (str11 == null) {
            sQLiteStatement.bindNull(15);
        } else {
            sQLiteStatement.bindText(15, str11);
        }
        String str12 = fVar.f245322c;
        if (str12 == null) {
            sQLiteStatement.bindNull(16);
        } else {
            sQLiteStatement.bindText(16, str12);
        }
        String str13 = fVar.d;
        if (str13 == null) {
            sQLiteStatement.bindNull(17);
        } else {
            sQLiteStatement.bindText(17, str13);
        }
        String str14 = fVar.e;
        if (str14 == null) {
            sQLiteStatement.bindNull(18);
        } else {
            sQLiteStatement.bindText(18, str14);
        }
        String strB = nfg.b.b(fVar.f);
        if (strB == null) {
            sQLiteStatement.bindNull(19);
        } else {
            sQLiteStatement.bindText(19, strB);
        }
        String strB2 = nfg.d.b(fVar.f245323g);
        if (strB2 == null) {
            sQLiteStatement.bindNull(20);
        } else {
            sQLiteStatement.bindText(20, strB2);
        }
        String str15 = fVar.f245324h;
        if (str15 == null) {
            sQLiteStatement.bindNull(21);
        } else {
            sQLiteStatement.bindText(21, str15);
        }
        String strB3 = nfg.c.b(fVar.i);
        if (strB3 == null) {
            sQLiteStatement.bindNull(22);
        } else {
            sQLiteStatement.bindText(22, strB3);
        }
        String str16 = fVar.f245325j;
        if (str16 == null) {
            sQLiteStatement.bindNull(23);
        } else {
            sQLiteStatement.bindText(23, str16);
        }
    }

    private final void e(SQLiteStatement sQLiteStatement, Object obj2) {
        qfg.d dVar = (qfg.d) obj2;
        String str = dVar.f245312a;
        if (str == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, str);
        }
        String str2 = dVar.f245313b;
        if (str2 == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindText(2, str2);
        }
        String str3 = dVar.f245314c;
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
        String str6 = dVar.f;
        if (str6 == null) {
            sQLiteStatement.bindNull(6);
        } else {
            sQLiteStatement.bindText(6, str6);
        }
        sQLiteStatement.bindLong(7, dVar.f245315g ? 1L : 0L);
        sQLiteStatement.bindLong(8, dVar.f245316h);
        String strA = nfg.a.a(dVar.i);
        if (strA == null) {
            sQLiteStatement.bindNull(9);
        } else {
            sQLiteStatement.bindText(9, strA);
        }
        String str7 = dVar.f245317j;
        if (str7 == null) {
            sQLiteStatement.bindNull(10);
        } else {
            sQLiteStatement.bindText(10, str7);
        }
        qfg.f fVar = dVar.k;
        String str8 = fVar.f245320a;
        if (str8 == null) {
            sQLiteStatement.bindNull(11);
        } else {
            sQLiteStatement.bindText(11, str8);
        }
        String str9 = fVar.f245321b;
        if (str9 == null) {
            sQLiteStatement.bindNull(12);
        } else {
            sQLiteStatement.bindText(12, str9);
        }
        String str10 = fVar.f245322c;
        if (str10 == null) {
            sQLiteStatement.bindNull(13);
        } else {
            sQLiteStatement.bindText(13, str10);
        }
        String str11 = fVar.d;
        if (str11 == null) {
            sQLiteStatement.bindNull(14);
        } else {
            sQLiteStatement.bindText(14, str11);
        }
        String str12 = fVar.e;
        if (str12 == null) {
            sQLiteStatement.bindNull(15);
        } else {
            sQLiteStatement.bindText(15, str12);
        }
        String strB = nfg.b.b(fVar.f);
        if (strB == null) {
            sQLiteStatement.bindNull(16);
        } else {
            sQLiteStatement.bindText(16, strB);
        }
        String strB2 = nfg.d.b(fVar.f245323g);
        if (strB2 == null) {
            sQLiteStatement.bindNull(17);
        } else {
            sQLiteStatement.bindText(17, strB2);
        }
        String str13 = fVar.f245324h;
        if (str13 == null) {
            sQLiteStatement.bindNull(18);
        } else {
            sQLiteStatement.bindText(18, str13);
        }
        String strB3 = nfg.c.b(fVar.i);
        if (strB3 == null) {
            sQLiteStatement.bindNull(19);
        } else {
            sQLiteStatement.bindText(19, strB3);
        }
        String str14 = fVar.f245325j;
        if (str14 == null) {
            sQLiteStatement.bindNull(20);
        } else {
            sQLiteStatement.bindText(20, str14);
        }
    }

    private final void f(SQLiteStatement sQLiteStatement, Object obj2) {
        qfg.f fVar = (qfg.f) obj2;
        String str = fVar.f245320a;
        if (str == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, str);
        }
        String str2 = fVar.f245321b;
        if (str2 == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindText(2, str2);
        }
        String str3 = fVar.f245322c;
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
        String strB = nfg.b.b(fVar.f);
        if (strB == null) {
            sQLiteStatement.bindNull(6);
        } else {
            sQLiteStatement.bindText(6, strB);
        }
        String strB2 = nfg.d.b(fVar.f245323g);
        if (strB2 == null) {
            sQLiteStatement.bindNull(7);
        } else {
            sQLiteStatement.bindText(7, strB2);
        }
        String str6 = fVar.f245324h;
        if (str6 == null) {
            sQLiteStatement.bindNull(8);
        } else {
            sQLiteStatement.bindText(8, str6);
        }
        String strB3 = nfg.c.b(fVar.i);
        if (strB3 == null) {
            sQLiteStatement.bindNull(9);
        } else {
            sQLiteStatement.bindText(9, strB3);
        }
        String str7 = fVar.f245325j;
        if (str7 == null) {
            sQLiteStatement.bindNull(10);
        } else {
            sQLiteStatement.bindText(10, str7);
        }
    }

    private final void g(SQLiteStatement sQLiteStatement, Object obj2) {
        qfg.b bVar = (qfg.b) obj2;
        String str = bVar.f245300a;
        if (str == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, str);
        }
        String str2 = bVar.f245301b;
        if (str2 == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindText(2, str2);
        }
        String strA = nfg.a.a(bVar.d);
        if (strA == null) {
            sQLiteStatement.bindNull(3);
        } else {
            sQLiteStatement.bindText(3, strA);
        }
        qfg.h hVar = bVar.f245302c;
        String str3 = hVar.f245329a;
        if (str3 == null) {
            sQLiteStatement.bindNull(4);
        } else {
            sQLiteStatement.bindText(4, str3);
        }
        String str4 = hVar.f245330b;
        if (str4 == null) {
            sQLiteStatement.bindNull(5);
        } else {
            sQLiteStatement.bindText(5, str4);
        }
        String str5 = hVar.f245331c;
        if (str5 == null) {
            sQLiteStatement.bindNull(6);
        } else {
            sQLiteStatement.bindText(6, str5);
        }
        String str6 = hVar.d;
        if (str6 == null) {
            sQLiteStatement.bindNull(7);
        } else {
            sQLiteStatement.bindText(7, str6);
        }
    }

    private final void h(SQLiteStatement sQLiteStatement, Object obj2) {
        String strK;
        qfg.j jVar = (qfg.j) obj2;
        String str = jVar.f245334a;
        if (str == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, str);
        }
        String str2 = jVar.f245335b;
        if (str2 == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindText(2, str2);
        }
        sQLiteStatement.bindDouble(3, jVar.f245336c);
        String strO = b21.a.o(jVar.d);
        if (strO == null) {
            sQLiteStatement.bindNull(4);
        } else {
            sQLiteStatement.bindText(4, strO);
        }
        qfg.i iVar = jVar.e;
        if (iVar != null) {
            strK = GsonHolder.a().k(iVar);
            Intrinsics.checkNotNullExpressionValue(strK, "toJson(...)");
        } else {
            strK = null;
        }
        if (strK == null) {
            sQLiteStatement.bindNull(5);
        } else {
            sQLiteStatement.bindText(5, strK);
        }
    }

    @Override // androidx.room.EntityInsertAdapter
    public final void bind(SQLiteStatement sQLiteStatement, Object obj2) {
        switch (this.f219598a) {
            case 0:
                pvg.a aVar = (pvg.a) obj2;
                String strA = pvg.t.a(aVar.f240063a);
                if (strA == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, strA);
                }
                sQLiteStatement.bindLong(2, aVar.f240064b ? 1L : 0L);
                String str = aVar.f240065c;
                if (str == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, str);
                }
                sQLiteStatement.bindText(4, aVar.d);
                String str2 = aVar.e;
                if (str2 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, str2);
                }
                String str3 = aVar.f;
                if (str3 == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, str3);
                }
                String strO = b21.a.o(aVar.f240066g);
                if (strO == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindText(7, strO);
                }
                sQLiteStatement.bindDouble(8, aVar.f240067h);
                String str4 = aVar.i;
                if (str4 == null) {
                    sQLiteStatement.bindNull(9);
                } else {
                    sQLiteStatement.bindText(9, str4);
                }
                String strC = b21.a.c(aVar.f240068j);
                if (strC == null) {
                    sQLiteStatement.bindNull(10);
                } else {
                    sQLiteStatement.bindText(10, strC);
                }
                String strC2 = b21.a.c(aVar.k);
                if (strC2 == null) {
                    sQLiteStatement.bindNull(11);
                } else {
                    sQLiteStatement.bindText(11, strC2);
                }
                String str5 = aVar.f240069l;
                if (str5 == null) {
                    sQLiteStatement.bindNull(12);
                } else {
                    sQLiteStatement.bindText(12, str5);
                }
                String str6 = aVar.f240070m;
                if (str6 != null) {
                    sQLiteStatement.bindText(13, str6);
                } else {
                    sQLiteStatement.bindNull(13);
                }
                break;
            case 1:
                pvg.g gVar = (pvg.g) obj2;
                String str7 = gVar.f240131a;
                if (str7 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str7);
                }
                sQLiteStatement.bindLong(2, gVar.f240132b ? 1L : 0L);
                String str8 = gVar.f240133c;
                if (str8 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, str8);
                }
                String strO2 = b21.a.o(gVar.d);
                if (strO2 != null) {
                    sQLiteStatement.bindText(4, strO2);
                } else {
                    sQLiteStatement.bindNull(4);
                }
                break;
            case 2:
                pvg.f fVar = (pvg.f) obj2;
                String str9 = fVar.f240121a;
                if (str9 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str9);
                }
                String strA2 = pvg.t.a(fVar.f240122b);
                if (strA2 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, strA2);
                }
                sQLiteStatement.bindLong(3, fVar.f240123c ? 1L : 0L);
                String str10 = fVar.d;
                if (str10 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, str10);
                }
                String str11 = fVar.e;
                if (str11 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, str11);
                }
                String strO3 = b21.a.o(fVar.f);
                if (strO3 == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, strO3);
                }
                sQLiteStatement.bindDouble(7, fVar.f240124g);
                break;
            case 3:
                pvg.e eVar = (pvg.e) obj2;
                String str12 = eVar.f240110a;
                if (str12 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str12);
                }
                String strA3 = pvg.t.a(eVar.f240111b);
                if (strA3 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, strA3);
                }
                sQLiteStatement.bindLong(3, eVar.f240112c ? 1L : 0L);
                String str13 = eVar.d;
                if (str13 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, str13);
                }
                String str14 = eVar.e;
                if (str14 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, str14);
                }
                String str15 = eVar.f;
                if (str15 == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, str15);
                }
                String strO4 = b21.a.o(eVar.f240113g);
                if (strO4 == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindText(7, strO4);
                }
                sQLiteStatement.bindDouble(8, eVar.f240114h);
                String str16 = eVar.i;
                if (str16 == null) {
                    sQLiteStatement.bindNull(9);
                } else {
                    sQLiteStatement.bindText(9, str16);
                }
                String strC3 = b21.a.c(eVar.f240115j);
                if (strC3 == null) {
                    sQLiteStatement.bindNull(10);
                } else {
                    sQLiteStatement.bindText(10, strC3);
                }
                String strC4 = b21.a.c(eVar.k);
                if (strC4 == null) {
                    sQLiteStatement.bindNull(11);
                } else {
                    sQLiteStatement.bindText(11, strC4);
                }
                String str17 = eVar.f240116l;
                if (str17 == null) {
                    sQLiteStatement.bindNull(12);
                } else {
                    sQLiteStatement.bindText(12, str17);
                }
                String str18 = eVar.f240117m;
                if (str18 != null) {
                    sQLiteStatement.bindText(13, str18);
                } else {
                    sQLiteStatement.bindNull(13);
                }
                break;
            case 4:
                pvg.h hVar = (pvg.h) obj2;
                String strA4 = pvg.t.a(hVar.f240139a);
                if (strA4 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, strA4);
                }
                String strC5 = pvg.t.c(hVar.f240140b);
                if (strC5 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, strC5);
                }
                String strB = pvg.t.b(hVar.f240141c);
                if (strB == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, strB);
                }
                sQLiteStatement.bindLong(4, hVar.d ? 1L : 0L);
                String str19 = hVar.e;
                if (str19 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, str19);
                }
                String str20 = hVar.f;
                if (str20 == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, str20);
                }
                String strO5 = b21.a.o(hVar.f240142g);
                if (strO5 == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindText(7, strO5);
                }
                sQLiteStatement.bindDouble(8, hVar.f240143h);
                if (hVar.i == null) {
                    sQLiteStatement.bindNull(9);
                } else {
                    sQLiteStatement.bindDouble(9, r0.floatValue());
                }
                LocalDate localDate = hVar.f240144j;
                String string = localDate != null ? localDate.toString("yyyy-MM-dd") : null;
                if (string == null) {
                    sQLiteStatement.bindNull(10);
                } else {
                    sQLiteStatement.bindText(10, string);
                }
                String str21 = hVar.k;
                if (str21 == null) {
                    sQLiteStatement.bindNull(11);
                } else {
                    sQLiteStatement.bindText(11, str21);
                }
                String strC6 = b21.a.c(hVar.f240145l);
                if (strC6 == null) {
                    sQLiteStatement.bindNull(12);
                } else {
                    sQLiteStatement.bindText(12, strC6);
                }
                String str22 = hVar.f240146m;
                if (str22 == null) {
                    sQLiteStatement.bindNull(13);
                } else {
                    sQLiteStatement.bindText(13, str22);
                }
                String str23 = hVar.f240147n;
                if (str23 != null) {
                    sQLiteStatement.bindText(14, str23);
                } else {
                    sQLiteStatement.bindNull(14);
                }
                break;
            case 5:
                pvg.j jVar = (pvg.j) obj2;
                String strC7 = pvg.t.c(jVar.f240167a);
                if (strC7 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, strC7);
                }
                Long lB = b21.a.b(jVar.f240168b);
                if (lB == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindLong(2, lB.longValue());
                }
                Long lB2 = b21.a.b(jVar.f240169c);
                if (lB2 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindLong(3, lB2.longValue());
                }
                Long lB3 = b21.a.b(jVar.d);
                if (lB3 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindLong(4, lB3.longValue());
                }
                String str24 = jVar.e;
                if (str24 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, str24);
                }
                String str25 = jVar.f;
                if (str25 == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, str25);
                }
                String strB2 = pvg.t.b(jVar.f240170g);
                if (strB2 == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindText(7, strB2);
                }
                sQLiteStatement.bindText(8, jVar.f240171h);
                break;
            case 6:
                pvg.k kVar = (pvg.k) obj2;
                String strC8 = pvg.t.c(kVar.f240172a);
                if (strC8 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, strC8);
                }
                Long lB4 = b21.a.b(kVar.f240173b);
                if (lB4 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindLong(2, lB4.longValue());
                }
                sQLiteStatement.bindDouble(3, kVar.f240174c);
                sQLiteStatement.bindDouble(4, kVar.d);
                if (kVar.e == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindDouble(5, r0.floatValue());
                }
                String strO6 = b21.a.o(kVar.f);
                if (strO6 == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, strO6);
                }
                String str26 = kVar.f240175g;
                if (str26 == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindText(7, str26);
                }
                String str27 = kVar.f240176h;
                if (str27 == null) {
                    sQLiteStatement.bindNull(8);
                } else {
                    sQLiteStatement.bindText(8, str27);
                }
                String strB3 = pvg.t.b(kVar.i);
                if (strB3 == null) {
                    sQLiteStatement.bindNull(9);
                } else {
                    sQLiteStatement.bindText(9, strB3);
                }
                sQLiteStatement.bindText(10, kVar.f240177j);
                break;
            case 7:
                pvg.m mVar = (pvg.m) obj2;
                String str28 = mVar.f240183a;
                if (str28 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str28);
                }
                String str29 = mVar.f240184b;
                if (str29 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str29);
                }
                String strC9 = pvg.t.c(mVar.f240185c);
                if (strC9 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, strC9);
                }
                String str30 = mVar.d;
                if (str30 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, str30);
                }
                Long lB5 = b21.a.b(mVar.e);
                if (lB5 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindLong(5, lB5.longValue());
                }
                Long lB6 = b21.a.b(mVar.f);
                if (lB6 != null) {
                    sQLiteStatement.bindLong(6, lB6.longValue());
                } else {
                    sQLiteStatement.bindNull(6);
                }
                break;
            case 8:
                pvg.n nVar = (pvg.n) obj2;
                String str31 = nVar.f240186a;
                if (str31 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str31);
                }
                String str32 = nVar.f240187b;
                if (str32 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str32);
                }
                String strC10 = pvg.t.c(nVar.f240188c);
                if (strC10 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, strC10);
                }
                String str33 = nVar.d;
                if (str33 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, str33);
                }
                Long lB7 = b21.a.b(nVar.e);
                if (lB7 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindLong(5, lB7.longValue());
                }
                Long lB8 = b21.a.b(nVar.f);
                if (lB8 == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindLong(6, lB8.longValue());
                }
                String strO7 = b21.a.o(nVar.f240189g);
                if (strO7 == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindText(7, strO7);
                }
                String strO8 = b21.a.o(nVar.f240190h);
                if (strO8 == null) {
                    sQLiteStatement.bindNull(8);
                } else {
                    sQLiteStatement.bindText(8, strO8);
                }
                String strO9 = b21.a.o(nVar.i);
                if (strO9 != null) {
                    sQLiteStatement.bindText(9, strO9);
                } else {
                    sQLiteStatement.bindNull(9);
                }
                break;
            case 9:
                pvg.o oVar = (pvg.o) obj2;
                String str34 = oVar.f240191a;
                if (str34 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str34);
                }
                String strA5 = pvg.t.a(oVar.f240192b);
                if (strA5 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, strA5);
                }
                String strC11 = pvg.t.c(oVar.f240193c);
                if (strC11 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, strC11);
                }
                String str35 = oVar.d;
                if (str35 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, str35);
                }
                String str36 = oVar.e;
                if (str36 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, str36);
                }
                LocalDate localDate2 = oVar.f;
                String string2 = localDate2 != null ? localDate2.toString("yyyy-MM-dd") : null;
                if (string2 == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, string2);
                }
                String strO10 = b21.a.o(oVar.f240194g);
                if (strO10 == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindText(7, strO10);
                }
                String strO11 = b21.a.o(oVar.f240195h);
                if (strO11 == null) {
                    sQLiteStatement.bindNull(8);
                } else {
                    sQLiteStatement.bindText(8, strO11);
                }
                String str37 = oVar.i;
                if (str37 == null) {
                    sQLiteStatement.bindNull(9);
                } else {
                    sQLiteStatement.bindText(9, str37);
                }
                String strC12 = b21.a.c(oVar.f240196j);
                if (strC12 == null) {
                    sQLiteStatement.bindNull(10);
                } else {
                    sQLiteStatement.bindText(10, strC12);
                }
                String str38 = oVar.k;
                if (str38 == null) {
                    sQLiteStatement.bindNull(11);
                } else {
                    sQLiteStatement.bindText(11, str38);
                }
                sQLiteStatement.bindLong(12, oVar.f240197l);
                break;
            case 10:
                pvg.q qVar = (pvg.q) obj2;
                String str39 = qVar.f240204a;
                if (str39 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str39);
                }
                String str40 = qVar.f240205b;
                if (str40 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str40);
                }
                String strC13 = pvg.t.c(qVar.f240206c);
                if (strC13 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, strC13);
                }
                String str41 = qVar.d;
                if (str41 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, str41);
                }
                Long lB9 = b21.a.b(qVar.e);
                if (lB9 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindLong(5, lB9.longValue());
                }
                Long lB10 = b21.a.b(qVar.f);
                if (lB10 == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindLong(6, lB10.longValue());
                }
                String strO12 = b21.a.o(qVar.f240207g);
                if (strO12 == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindText(7, strO12);
                }
                String strO13 = b21.a.o(qVar.f240208h);
                if (strO13 == null) {
                    sQLiteStatement.bindNull(8);
                } else {
                    sQLiteStatement.bindText(8, strO13);
                }
                sQLiteStatement.bindText(9, qVar.i);
                break;
            case 11:
                pvg.r rVar = (pvg.r) obj2;
                String str42 = rVar.f240209a;
                if (str42 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str42);
                }
                String str43 = rVar.f240210b;
                if (str43 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str43);
                }
                String strC14 = pvg.t.c(rVar.f240211c);
                if (strC14 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, strC14);
                }
                String str44 = rVar.d;
                if (str44 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, str44);
                }
                Long lB11 = b21.a.b(rVar.e);
                if (lB11 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindLong(5, lB11.longValue());
                }
                String strO14 = b21.a.o(rVar.f);
                if (strO14 == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, strO14);
                }
                String strO15 = b21.a.o(rVar.f240212g);
                if (strO15 == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindText(7, strO15);
                }
                sQLiteStatement.bindText(8, rVar.f240213h);
                break;
            case 12:
                pvg.s sVar = (pvg.s) obj2;
                String strA6 = pvg.t.a(sVar.f240214a);
                if (strA6 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, strA6);
                }
                String strC15 = pvg.t.c(sVar.f240215b);
                if (strC15 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, strC15);
                }
                String strB4 = pvg.t.b(sVar.f240216c);
                if (strB4 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, strB4);
                }
                sQLiteStatement.bindLong(4, sVar.d ? 1L : 0L);
                String str45 = sVar.e;
                if (str45 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, str45);
                }
                String str46 = sVar.f;
                if (str46 == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, str46);
                }
                String str47 = sVar.f240217g;
                if (str47 == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindText(7, str47);
                }
                String strO16 = b21.a.o(sVar.f240218h);
                if (strO16 == null) {
                    sQLiteStatement.bindNull(8);
                } else {
                    sQLiteStatement.bindText(8, strO16);
                }
                sQLiteStatement.bindDouble(9, sVar.i);
                if (sVar.f240219j == null) {
                    sQLiteStatement.bindNull(10);
                } else {
                    sQLiteStatement.bindDouble(10, r0.floatValue());
                }
                LocalDate localDate3 = sVar.k;
                String string3 = localDate3 != null ? localDate3.toString("yyyy-MM-dd") : null;
                if (string3 == null) {
                    sQLiteStatement.bindNull(11);
                } else {
                    sQLiteStatement.bindText(11, string3);
                }
                String str48 = sVar.f240220l;
                if (str48 == null) {
                    sQLiteStatement.bindNull(12);
                } else {
                    sQLiteStatement.bindText(12, str48);
                }
                String strC16 = b21.a.c(sVar.f240221m);
                if (strC16 == null) {
                    sQLiteStatement.bindNull(13);
                } else {
                    sQLiteStatement.bindText(13, strC16);
                }
                String str49 = sVar.f240222n;
                if (str49 == null) {
                    sQLiteStatement.bindNull(14);
                } else {
                    sQLiteStatement.bindText(14, str49);
                }
                String str50 = sVar.o;
                if (str50 != null) {
                    sQLiteStatement.bindText(15, str50);
                } else {
                    sQLiteStatement.bindNull(15);
                }
                break;
            case 13:
                pvg.u uVar = (pvg.u) obj2;
                String strC17 = pvg.t.c(uVar.f240223a);
                if (strC17 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, strC17);
                }
                String str51 = uVar.f240224b;
                if (str51 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str51);
                }
                String str52 = uVar.f240225c;
                if (str52 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, str52);
                }
                String str53 = uVar.d;
                if (str53 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, str53);
                }
                String strH = b21.a.h(uVar.e);
                if (strH == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, strH);
                }
                String str54 = uVar.f;
                if (str54 == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, str54);
                }
                String str55 = uVar.f240226g;
                if (str55 == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindText(7, str55);
                }
                String strO17 = b21.a.o(uVar.f240227h);
                if (strO17 == null) {
                    sQLiteStatement.bindNull(8);
                } else {
                    sQLiteStatement.bindText(8, strO17);
                }
                sQLiteStatement.bindLong(9, uVar.i);
                break;
            case 14:
                pvg.w wVar = (pvg.w) obj2;
                String strA7 = pvg.t.a(wVar.f240237a);
                if (strA7 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, strA7);
                }
                String strC18 = pvg.t.c(wVar.f240238b);
                if (strC18 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, strC18);
                }
                String str56 = wVar.f240239c;
                if (str56 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, str56);
                }
                String strB5 = pvg.t.b(wVar.d);
                if (strB5 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, strB5);
                }
                sQLiteStatement.bindText(5, wVar.e);
                sQLiteStatement.bindText(6, wVar.f);
                Long lB12 = b21.a.b(wVar.f240240g);
                if (lB12 == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindLong(7, lB12.longValue());
                }
                Long lB13 = b21.a.b(wVar.f240241h);
                if (lB13 == null) {
                    sQLiteStatement.bindNull(8);
                } else {
                    sQLiteStatement.bindLong(8, lB13.longValue());
                }
                Long lB14 = b21.a.b(wVar.i);
                if (lB14 != null) {
                    sQLiteStatement.bindLong(9, lB14.longValue());
                } else {
                    sQLiteStatement.bindNull(9);
                }
                break;
            case 15:
                pvg.x xVar = (pvg.x) obj2;
                String strA8 = pvg.t.a(xVar.f240242a);
                if (strA8 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, strA8);
                }
                String strC19 = pvg.t.c(xVar.f240243b);
                if (strC19 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, strC19);
                }
                String str57 = xVar.f240244c;
                if (str57 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, str57);
                }
                String strB6 = pvg.t.b(xVar.d);
                if (strB6 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, strB6);
                }
                sQLiteStatement.bindText(5, xVar.e);
                sQLiteStatement.bindText(6, xVar.f);
                Long lB15 = b21.a.b(xVar.f240245g);
                if (lB15 == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindLong(7, lB15.longValue());
                }
                sQLiteStatement.bindDouble(8, xVar.f240246h);
                sQLiteStatement.bindDouble(9, xVar.i);
                if (xVar.f240247j == null) {
                    sQLiteStatement.bindNull(10);
                } else {
                    sQLiteStatement.bindDouble(10, r0.floatValue());
                }
                String strO18 = b21.a.o(xVar.k);
                if (strO18 != null) {
                    sQLiteStatement.bindText(11, strO18);
                } else {
                    sQLiteStatement.bindNull(11);
                }
                break;
            case 16:
                pvg.z zVar = (pvg.z) obj2;
                String strA9 = pvg.t.a(zVar.f240256a);
                if (strA9 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, strA9);
                }
                String strC20 = pvg.t.c(zVar.f240257b);
                if (strC20 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, strC20);
                }
                String str58 = zVar.f240258c;
                if (str58 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, str58);
                }
                sQLiteStatement.bindText(4, zVar.d);
                String string4 = zVar.e.toString();
                if (string4 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, string4);
                }
                Long lB16 = b21.a.b(zVar.f);
                if (lB16 == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindLong(6, lB16.longValue());
                }
                Long lB17 = b21.a.b(zVar.f240259g);
                if (lB17 == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindLong(7, lB17.longValue());
                }
                ZonedDateTime zonedDateTime = zVar.f240260h;
                String string5 = zonedDateTime != null ? zonedDateTime.toString() : null;
                if (string5 != null) {
                    sQLiteStatement.bindText(8, string5);
                } else {
                    sQLiteStatement.bindNull(8);
                }
                break;
            case 17:
                pvg.a0 a0Var = (pvg.a0) obj2;
                String strA10 = pvg.t.a(a0Var.f240071a);
                if (strA10 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, strA10);
                }
                String strC21 = pvg.t.c(a0Var.f240072b);
                if (strC21 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, strC21);
                }
                String str59 = a0Var.f240073c;
                if (str59 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, str59);
                }
                sQLiteStatement.bindText(4, a0Var.d);
                String string6 = a0Var.e.toString();
                if (string6 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, string6);
                }
                Long lB18 = b21.a.b(a0Var.f);
                if (lB18 == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindLong(6, lB18.longValue());
                }
                Long lB19 = b21.a.b(a0Var.f240074g);
                if (lB19 == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindLong(7, lB19.longValue());
                }
                String strO19 = b21.a.o(a0Var.f240075h);
                if (strO19 == null) {
                    sQLiteStatement.bindNull(8);
                } else {
                    sQLiteStatement.bindText(8, strO19);
                }
                String strO20 = b21.a.o(a0Var.i);
                if (strO20 == null) {
                    sQLiteStatement.bindNull(9);
                } else {
                    sQLiteStatement.bindText(9, strO20);
                }
                String strO21 = b21.a.o(a0Var.f240076j);
                if (strO21 != null) {
                    sQLiteStatement.bindText(10, strO21);
                } else {
                    sQLiteStatement.bindNull(10);
                }
                break;
            case 18:
                pvg.b0 b0Var = (pvg.b0) obj2;
                String strA11 = pvg.t.a(b0Var.f240081a);
                if (strA11 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, strA11);
                }
                String strC22 = pvg.t.c(b0Var.f240082b);
                if (strC22 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, strC22);
                }
                String str60 = b0Var.f240083c;
                if (str60 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, str60);
                }
                String str61 = b0Var.d;
                if (str61 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, str61);
                }
                String str62 = b0Var.e;
                if (str62 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, str62);
                }
                LocalDate localDate4 = b0Var.f;
                String string7 = localDate4 != null ? localDate4.toString("yyyy-MM-dd") : null;
                if (string7 == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, string7);
                }
                String strO22 = b21.a.o(b0Var.f240084g);
                if (strO22 == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindText(7, strO22);
                }
                String strO23 = b21.a.o(b0Var.f240085h);
                if (strO23 == null) {
                    sQLiteStatement.bindNull(8);
                } else {
                    sQLiteStatement.bindText(8, strO23);
                }
                String str63 = b0Var.i;
                if (str63 == null) {
                    sQLiteStatement.bindNull(9);
                } else {
                    sQLiteStatement.bindText(9, str63);
                }
                String strC23 = b21.a.c(b0Var.f240086j);
                if (strC23 == null) {
                    sQLiteStatement.bindNull(10);
                } else {
                    sQLiteStatement.bindText(10, strC23);
                }
                String str64 = b0Var.k;
                if (str64 == null) {
                    sQLiteStatement.bindNull(11);
                } else {
                    sQLiteStatement.bindText(11, str64);
                }
                sQLiteStatement.bindLong(12, b0Var.f240087l);
                break;
            case 19:
                pvg.e0 e0Var = (pvg.e0) obj2;
                String strA12 = pvg.t.a(e0Var.f240118a);
                if (strA12 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, strA12);
                }
                String strD = pvg.t.d(e0Var.f240119b);
                if (strD == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, strD);
                }
                String str65 = e0Var.f240120c;
                if (str65 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, str65);
                }
                String strO24 = b21.a.o(e0Var.d);
                if (strO24 != null) {
                    sQLiteStatement.bindText(4, strO24);
                } else {
                    sQLiteStatement.bindNull(4);
                }
                break;
            case 20:
                pvg.c0 c0Var = (pvg.c0) obj2;
                String strA13 = pvg.t.a(c0Var.f240097a);
                if (strA13 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, strA13);
                }
                String strD2 = pvg.t.d(c0Var.f240098b);
                if (strD2 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, strD2);
                }
                String str66 = c0Var.f240099c;
                if (str66 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, str66);
                }
                String str67 = c0Var.d;
                if (str67 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, str67);
                }
                String str68 = c0Var.e;
                if (str68 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, str68);
                }
                String strO25 = b21.a.o(c0Var.f);
                if (strO25 == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, strO25);
                }
                sQLiteStatement.bindDouble(7, c0Var.f240100g);
                String str69 = c0Var.f240101h;
                if (str69 != null) {
                    sQLiteStatement.bindText(8, str69);
                } else {
                    sQLiteStatement.bindNull(8);
                }
                break;
            case 21:
                a(sQLiteStatement, obj2);
                break;
            case 22:
                b(sQLiteStatement, obj2);
                break;
            case 23:
                c(sQLiteStatement, obj2);
                break;
            case 24:
                d(sQLiteStatement, obj2);
                break;
            case 25:
                e(sQLiteStatement, obj2);
                break;
            case 26:
                f(sQLiteStatement, obj2);
                break;
            case 27:
                g(sQLiteStatement, obj2);
                break;
            case 28:
                h(sQLiteStatement, obj2);
                break;
            default:
                qfg.o oVar2 = (qfg.o) obj2;
                String str70 = oVar2.f245348a;
                if (str70 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str70);
                }
                String str71 = oVar2.f245349b;
                if (str71 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str71);
                }
                String str72 = oVar2.f245350c;
                if (str72 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, str72);
                }
                String str73 = oVar2.d;
                if (str73 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, str73);
                }
                String str74 = oVar2.e;
                if (str74 != null) {
                    sQLiteStatement.bindText(5, str74);
                } else {
                    sQLiteStatement.bindNull(5);
                }
                break;
        }
    }

    @Override // androidx.room.EntityInsertAdapter
    public final String createQuery() {
        switch (this.f219598a) {
            case 0:
                return "INSERT OR REPLACE INTO `complex_analytics_allocations_assets` (`assetType`,`sector`,`currency`,`portfolio_id`,`asset`,`quantity`,`value`,`allocation`,`ref`,`openingPrice`,`currentPrice`,`positionId`,`leverage`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `complex_analytics_combined_allocations` (`account_types_combined`,`sector`,`currency`,`total_value`) VALUES (?,?,?,?)";
            case 2:
                return "INSERT OR REPLACE INTO `complex_analytics_combined_allocations_cash` (`account_types_combined`,`asset_type`,`sector`,`currency`,`asset`,`value`,`allocation`) VALUES (?,?,?,?,?,?,?)";
            case 3:
                return "INSERT OR REPLACE INTO `complex_analytics_combined_allocations_assets` (`account_types_combined`,`asset_type`,`sector`,`currency`,`asset`,`quantity`,`value`,`allocation`,`ref`,`opening_price`,`current_price`,`position_id`,`leverage`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 4:
                return "INSERT OR REPLACE INTO `complex_analytics_combined_contributors` (`asset_type`,`time_span`,`method`,`sector`,`currency`,`asset`,`pnl`,`returns`,`returnOnInitialMargin`,`closedOn`,`ref`,`openingPrice`,`positionId`,`quantity`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 5:
                return "INSERT OR REPLACE INTO `complex_analytics_combined_performance_chart` (`time_span`,`start`,`end`,`last_modified`,`asset_types_id`,`currency`,`method`,`benchmark`) VALUES (?,?,?,?,?,?,?,?)";
            case 6:
                return "INSERT OR REPLACE INTO `complex_analytics_combined_performance_chart_point` (`time_span`,`timestamp`,`returns`,`totalReturns`,`benchmark`,`pnl`,`asset_types_id`,`currency`,`method`,`benchmark_ref`) VALUES (?,?,?,?,?,?,?,?,?,?)";
            case 7:
                return "INSERT OR REPLACE INTO `complex_analytics_combined_pnl_chart` (`user_id`,`asset_types_id`,`time_span`,`currency`,`start`,`end`) VALUES (?,?,?,?,?,?)";
            case 8:
                return "INSERT OR REPLACE INTO `complex_analytics_combined_pnl_chart_point` (`user_id`,`asset_types_id`,`time_span`,`currency`,`point_start`,`point_end`,`net_sell`,`dividends`,`cumulative`) VALUES (?,?,?,?,?,?,?,?,?)";
            case 9:
                return "INSERT OR REPLACE INTO `complex_analytics_combined_realised_pnl` (`request_product_types`,`item_product_type`,`time_span`,`currency`,`asset`,`sell_date`,`pnl_fifo`,`pnl_average`,`ref`,`opening_price`,`quantity`,`id`) VALUES (?,?,?,?,?,?,?,?,?,?,?,nullif(?, 0))";
            case 10:
                return "INSERT OR REPLACE INTO `complex_analytics_combined_total_value_chart` (`user_id`,`asset_types_id`,`time_span`,`currency`,`start`,`end`,`net_top_up`,`total_return`,`chart_details_type`) VALUES (?,?,?,?,?,?,?,?,?)";
            case 11:
                return "INSERT OR REPLACE INTO `complex_analytics_combined_total_value_chart_point` (`user_id`,`asset_types_id`,`time_span`,`currency`,`timestamp`,`amount`,`cumulative_net_top_up`,`chart_details_type`) VALUES (?,?,?,?,?,?,?,?)";
            case 12:
                return "INSERT OR REPLACE INTO `complex_analytics_contributors` (`asset_type`,`time_span`,`method`,`sector`,`portfolio_id`,`currency`,`asset`,`pnl`,`returns`,`returnOnInitialMargin`,`closedOn`,`ref`,`openingPrice`,`positionId`,`quantity`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 13:
                return "INSERT OR REPLACE INTO `complex_analytics_dividends` (`time_span`,`currency`,`portfolio_id`,`account_types`,`date`,`symbol`,`ref`,`amount`,`id`) VALUES (?,?,?,?,?,?,?,?,nullif(?, 0))";
            case 14:
                return "INSERT OR REPLACE INTO `complex_analytics_performance_chart` (`asset_type`,`time_span`,`currency`,`method`,`benchmark`,`portfolio_id`,`start`,`end`,`last_modified`) VALUES (?,?,?,?,?,?,?,?,?)";
            case 15:
                return "INSERT OR REPLACE INTO `complex_analytics_performance_chart_point` (`asset_type`,`time_span`,`currency`,`method`,`benchmark_ref`,`portfolio_id`,`timestamp`,`returns`,`totalReturns`,`benchmark`,`pnl`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            case 16:
                return "INSERT OR REPLACE INTO `complex_analytics_pnl` (`asset_type`,`time_span`,`currency`,`portfolio_id`,`interval`,`start`,`end`,`last_modified`) VALUES (?,?,?,?,?,?,?,?)";
            case 17:
                return "INSERT OR REPLACE INTO `complex_analytics_pnl_point` (`asset_type`,`time_span`,`currency`,`portfolio_id`,`interval`,`point_start`,`point_end`,`net_sell`,`dividends`,`cumulative`) VALUES (?,?,?,?,?,?,?,?,?,?)";
            case 18:
                return "INSERT OR REPLACE INTO `complex_analytics_realised_pnl` (`asset_type`,`time_span`,`currency`,`portfolio_id`,`asset`,`sell_date`,`pnl_fifo`,`pnl_average`,`ref`,`openingPrice`,`quantity`,`id`) VALUES (?,?,?,?,?,?,?,?,?,?,?,nullif(?, 0))";
            case 19:
                return "INSERT OR REPLACE INTO `complex_analytics_sector_allocations` (`assetType`,`sector`,`currency`,`total_value`) VALUES (?,?,?,?)";
            case 20:
                return "INSERT OR REPLACE INTO `complex_analytics_sector_allocations_assets` (`assetType`,`sector`,`currency`,`asset`,`quantity`,`value`,`allocation`,`ref`) VALUES (?,?,?,?,?,?,?,?)";
            case 21:
                return "INSERT OR REPLACE INTO `complex_analytics_sector_contributors` (`asset_type`,`time_span`,`method`,`sector`,`portfolio_id`,`currency`,`asset`,`pnl`,`returns`,`closedOn`,`ref`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            case 22:
                return "INSERT OR REPLACE INTO `complex_analytics_total_value_chart` (`asset_type`,`time_span`,`currency`,`portfolio_id`,`start`,`end`,`net_top_up`,`total_return`,`chart_details_type`) VALUES (?,?,?,?,?,?,?,?,?)";
            case 23:
                return "INSERT OR REPLACE INTO `complex_analytics_total_value_chart_point` (`asset_type`,`time_span`,`currency`,`portfolio_id`,`timestamp`,`amount`,`cumulative_net_top_up`,`chart_details_type`) VALUES (?,?,?,?,?,?,?,?)";
            case 24:
                return "INSERT OR REPLACE INTO `travel_miles_airline_details` (`ref`,`name`,`programmeName`,`description`,`logoUrl`,`learnMoreUrl`,`websiteUrl`,`suggested`,`backgroundUrl`,`redeemTypes`,`redeemOptions`,`extraRedeemOptions`,`voucherProductGroupId`,`provider_id`,`provider_name`,`provider_description`,`provider_logoUrl`,`provider_signupUrl`,`provider_account`,`provider_rate`,`provider_unit`,`provider_campaign`,`provider_accountLinkType`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 25:
                return "INSERT OR REPLACE INTO `travel_miles_airlines` (`ref`,`name`,`programmeName`,`description`,`logoUrl`,`learnMoreUrl`,`suggested`,`order`,`redeemTypes`,`voucherProductGroupId`,`provider_id`,`provider_name`,`provider_description`,`provider_logoUrl`,`provider_signupUrl`,`provider_account`,`provider_rate`,`provider_unit`,`provider_campaign`,`provider_accountLinkType`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 26:
                return "INSERT OR REPLACE INTO `travel_miles_provider` (`id`,`name`,`description`,`logoUrl`,`signupUrl`,`account`,`rate`,`unit`,`campaign`,`accountLinkType`) VALUES (?,?,?,?,?,?,?,?,?,?)";
            case 27:
                return "INSERT OR REPLACE INTO `travel_miles_accounts` (`id`,`externalId`,`primaryAirlines`,`provider_id`,`provider_name`,`provider_logoUrl`,`provider_unit`) VALUES (?,?,?,?,?,?,?)";
            case 28:
                return "INSERT OR REPLACE INTO `travel_miles_rates` (`accountId`,`currency`,`pointsToMilesRate`,`fee`,`display`) VALUES (?,?,?,?,?)";
            default:
                return "INSERT OR REPLACE INTO `travel_miles_transactions` (`id`,`type`,`idType`,`source`,`topUpId`) VALUES (?,?,?,?,?)";
        }
    }

    public /* synthetic */ c(Object obj2, int i) {
        this.f219598a = i;
    }
}
