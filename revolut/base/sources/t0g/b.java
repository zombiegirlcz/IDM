package t0g;

import a9g.a0;
import a9g.d0;
import a9g.d1;
import a9g.e0;
import a9g.f1;
import a9g.f2;
import a9g.h0;
import a9g.h1;
import a9g.o;
import a9g.r;
import a9g.r0;
import a9g.t;
import a9g.u0;
import a9g.v0;
import a9g.w;
import a9g.w0;
import androidx.room.EntityInsertAdapter;
import androidx.sqlite.SQLiteStatement;
import com.revolut.data.utils.gson.GsonHolder;
import java.time.Instant;
import java.time.LocalTime;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import vjl.i;
import vuf.j;
import vuf.l;
import vuf.m;
import vuf.n;
import vuf.s;
import zf0.h;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends EntityInsertAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f267024a;

    public /* synthetic */ b(int i) {
        this.f267024a = i;
    }

    private final void a(SQLiteStatement sQLiteStatement, Object obj2) {
        a9f.a aVar = (a9f.a) obj2;
        String str = aVar.f2431a;
        if (str == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, str);
        }
        String str2 = aVar.f2432b;
        if (str2 == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindText(2, str2);
        }
        String str3 = aVar.f2433c;
        if (str3 == null) {
            sQLiteStatement.bindNull(3);
        } else {
            sQLiteStatement.bindText(3, str3);
        }
        String str4 = aVar.d;
        if (str4 == null) {
            sQLiteStatement.bindNull(4);
        } else {
            sQLiteStatement.bindText(4, str4);
        }
        String str5 = aVar.e;
        if (str5 == null) {
            sQLiteStatement.bindNull(5);
        } else {
            sQLiteStatement.bindText(5, str5);
        }
        sQLiteStatement.bindText(6, x8f.c.f(aVar.f));
        String str6 = aVar.f2434g;
        if (str6 == null) {
            sQLiteStatement.bindNull(7);
        } else {
            sQLiteStatement.bindText(7, str6);
        }
        String strO = b21.a.o(aVar.f2435h);
        if (strO == null) {
            sQLiteStatement.bindNull(8);
        } else {
            sQLiteStatement.bindText(8, strO);
        }
    }

    private final void b(SQLiteStatement sQLiteStatement, Object obj2) {
        String strC;
        abd.d dVar = (abd.d) obj2;
        String str = dVar.f2938a;
        if (str == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, str);
        }
        sQLiteStatement.bindLong(2, dVar.f2939b);
        String str2 = dVar.f2940c;
        if (str2 == null) {
            sQLiteStatement.bindNull(3);
        } else {
            sQLiteStatement.bindText(3, str2);
        }
        String str3 = dVar.d;
        if (str3 == null) {
            sQLiteStatement.bindNull(4);
        } else {
            sQLiteStatement.bindText(4, str3);
        }
        String str4 = dVar.e;
        if (str4 == null) {
            sQLiteStatement.bindNull(5);
        } else {
            sQLiteStatement.bindText(5, str4);
        }
        Long l2 = dVar.f;
        if (l2 == null) {
            sQLiteStatement.bindNull(6);
        } else {
            sQLiteStatement.bindLong(6, l2.longValue());
        }
        String str5 = dVar.f2941g;
        if (str5 == null) {
            sQLiteStatement.bindNull(7);
        } else {
            sQLiteStatement.bindText(7, str5);
        }
        String str6 = dVar.f2942h;
        if (str6 == null) {
            sQLiteStatement.bindNull(8);
        } else {
            sQLiteStatement.bindText(8, str6);
        }
        String str7 = dVar.i;
        if (str7 == null) {
            sQLiteStatement.bindNull(9);
        } else {
            sQLiteStatement.bindText(9, str7);
        }
        if (dVar.f2943j == null) {
            sQLiteStatement.bindNull(10);
        } else {
            sQLiteStatement.bindLong(10, r0.intValue());
        }
        if (dVar.k == null) {
            sQLiteStatement.bindNull(11);
        } else {
            sQLiteStatement.bindLong(11, r0.intValue());
        }
        List list = dVar.f2944l;
        if (list != null) {
            Json jsonA = af0.b.a();
            jsonA.getClass();
            strC = jsonA.c(new qlm.e(abd.c.Companion.serializer()), list);
        } else {
            strC = null;
        }
        if (strC == null) {
            sQLiteStatement.bindNull(12);
        } else {
            sQLiteStatement.bindText(12, strC);
        }
    }

    private final void c(SQLiteStatement sQLiteStatement, Object obj2) {
        zf0.f fVar = (zf0.f) obj2;
        String str = fVar.f321840a;
        if (str == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, str);
        }
        String str2 = fVar.f321841b;
        if (str2 == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindText(2, str2);
        }
        String str3 = fVar.f321842c;
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
        String str7 = fVar.f321843g;
        if (str7 == null) {
            sQLiteStatement.bindNull(7);
        } else {
            sQLiteStatement.bindText(7, str7);
        }
        sQLiteStatement.bindLong(8, fVar.f321844h);
        String str8 = fVar.i;
        if (str8 == null) {
            sQLiteStatement.bindNull(9);
        } else {
            sQLiteStatement.bindText(9, str8);
        }
    }

    private final void d(SQLiteStatement sQLiteStatement, Object obj2) {
        h hVar = (h) obj2;
        String str = hVar.f321848a;
        if (str == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, str);
        }
        String str2 = hVar.f321849b;
        if (str2 == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindText(2, str2);
        }
        String str3 = hVar.f321850c;
        if (str3 == null) {
            sQLiteStatement.bindNull(3);
        } else {
            sQLiteStatement.bindText(3, str3);
        }
        String str4 = hVar.d;
        if (str4 == null) {
            sQLiteStatement.bindNull(4);
        } else {
            sQLiteStatement.bindText(4, str4);
        }
        sQLiteStatement.bindLong(5, hVar.e ? 1L : 0L);
        String str5 = hVar.f;
        if (str5 == null) {
            sQLiteStatement.bindNull(6);
        } else {
            sQLiteStatement.bindText(6, str5);
        }
        String str6 = hVar.f321851g;
        if (str6 == null) {
            sQLiteStatement.bindNull(7);
        } else {
            sQLiteStatement.bindText(7, str6);
        }
        String str7 = hVar.f321852h;
        if (str7 == null) {
            sQLiteStatement.bindNull(8);
        } else {
            sQLiteStatement.bindText(8, str7);
        }
    }

    private final void e(SQLiteStatement sQLiteStatement, Object obj2) {
        zf0.g gVar = (zf0.g) obj2;
        String str = gVar.f321845a;
        if (str == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, str);
        }
        String str2 = gVar.f321846b;
        if (str2 == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindText(2, str2);
        }
        String str3 = gVar.f321847c;
        if (str3 == null) {
            sQLiteStatement.bindNull(3);
        } else {
            sQLiteStatement.bindText(3, str3);
        }
    }

    private final void f(SQLiteStatement sQLiteStatement, Object obj2) {
        arj.a aVar = (arj.a) obj2;
        String str = aVar.f8719a;
        if (str == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, str);
        }
        String str2 = aVar.f8720b;
        if (str2 == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindText(2, str2);
        }
        sQLiteStatement.bindLong(3, aVar.f8721c);
        String str3 = aVar.d;
        if (str3 == null) {
            sQLiteStatement.bindNull(4);
        } else {
            sQLiteStatement.bindText(4, str3);
        }
        String str4 = aVar.e;
        if (str4 == null) {
            sQLiteStatement.bindNull(5);
        } else {
            sQLiteStatement.bindText(5, str4);
        }
        String str5 = aVar.f;
        if (str5 == null) {
            sQLiteStatement.bindNull(6);
        } else {
            sQLiteStatement.bindText(6, str5);
        }
        String str6 = aVar.f8722g;
        if (str6 == null) {
            sQLiteStatement.bindNull(7);
        } else {
            sQLiteStatement.bindText(7, str6);
        }
        String str7 = aVar.f8723h;
        if (str7 == null) {
            sQLiteStatement.bindNull(8);
        } else {
            sQLiteStatement.bindText(8, str7);
        }
    }

    private final void g(SQLiteStatement sQLiteStatement, Object obj2) {
        byk.b bVar = (byk.b) obj2;
        if (bVar.f19847a == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindLong(1, r0.intValue());
        }
        String strM = b21.a.m(bVar.f19848b);
        if (strM == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindText(2, strM);
        }
        Boolean bool = bVar.f19849c;
        if ((bool == null ? null : Integer.valueOf(bool.booleanValue() ? 1 : 0)) == null) {
            sQLiteStatement.bindNull(3);
        } else {
            sQLiteStatement.bindLong(3, r0.intValue());
        }
        Boolean bool2 = bVar.d;
        if ((bool2 == null ? null : Integer.valueOf(bool2.booleanValue() ? 1 : 0)) == null) {
            sQLiteStatement.bindNull(4);
        } else {
            sQLiteStatement.bindLong(4, r0.intValue());
        }
        List list = bVar.e;
        String strR = list != null ? com.revolut.data.database.models.openbanking.d.r("toJson(...)", list) : null;
        if (strR == null) {
            sQLiteStatement.bindNull(5);
        } else {
            sQLiteStatement.bindText(5, strR);
        }
    }

    private final void h(SQLiteStatement sQLiteStatement, Object obj2) {
        String strK;
        String strK2;
        String strK3;
        String strK4;
        String strK5;
        String strK6;
        String strK7;
        v0 v0Var = (v0) obj2;
        String str = v0Var.f2595a;
        if (str == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, str);
        }
        String str2 = v0Var.f2596b;
        if (str2 == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindText(2, str2);
        }
        String str3 = v0Var.f2597c;
        if (str3 == null) {
            sQLiteStatement.bindNull(3);
        } else {
            sQLiteStatement.bindText(3, str3);
        }
        d1 d1Var = v0Var.d;
        String strK8 = null;
        if (d1Var != null) {
            strK = GsonHolder.a().k(d1Var);
            Intrinsics.checkNotNullExpressionValue(strK, "toJson(...)");
        } else {
            strK = null;
        }
        if (strK == null) {
            sQLiteStatement.bindNull(4);
        } else {
            sQLiteStatement.bindText(4, strK);
        }
        u0 u0Var = v0Var.e;
        if (u0Var != null) {
            strK2 = GsonHolder.a().k(u0Var);
            Intrinsics.checkNotNullExpressionValue(strK2, "toJson(...)");
        } else {
            strK2 = null;
        }
        if (strK2 == null) {
            sQLiteStatement.bindNull(5);
        } else {
            sQLiteStatement.bindText(5, strK2);
        }
        f1 f1Var = v0Var.f;
        if (f1Var != null) {
            strK3 = GsonHolder.a().k(f1Var);
            Intrinsics.checkNotNullExpressionValue(strK3, "toJson(...)");
        } else {
            strK3 = null;
        }
        if (strK3 == null) {
            sQLiteStatement.bindNull(6);
        } else {
            sQLiteStatement.bindText(6, strK3);
        }
        f2 f2Var = v0Var.f2598g;
        if (f2Var != null) {
            strK4 = GsonHolder.a().k(f2Var);
            Intrinsics.checkNotNullExpressionValue(strK4, "toJson(...)");
        } else {
            strK4 = null;
        }
        if (strK4 == null) {
            sQLiteStatement.bindNull(7);
        } else {
            sQLiteStatement.bindText(7, strK4);
        }
        r rVar = v0Var.f2599h;
        if (rVar != null) {
            strK5 = GsonHolder.a().k(rVar);
            Intrinsics.checkNotNullExpressionValue(strK5, "toJson(...)");
        } else {
            strK5 = null;
        }
        if (strK5 == null) {
            sQLiteStatement.bindNull(8);
        } else {
            sQLiteStatement.bindText(8, strK5);
        }
        List list = v0Var.i;
        String strR = list != null ? com.revolut.data.database.models.openbanking.d.r("toJson(...)", list) : null;
        if (strR == null) {
            sQLiteStatement.bindNull(9);
        } else {
            sQLiteStatement.bindText(9, strR);
        }
        w0 w0Var = v0Var.f2600j;
        if (w0Var != null) {
            strK6 = GsonHolder.a().k(w0Var);
            Intrinsics.checkNotNullExpressionValue(strK6, "toJson(...)");
        } else {
            strK6 = null;
        }
        if (strK6 == null) {
            sQLiteStatement.bindNull(10);
        } else {
            sQLiteStatement.bindText(10, strK6);
        }
        h1 h1Var = v0Var.k;
        if (h1Var != null) {
            strK7 = GsonHolder.a().k(h1Var);
            Intrinsics.checkNotNullExpressionValue(strK7, "toJson(...)");
        } else {
            strK7 = null;
        }
        if (strK7 == null) {
            sQLiteStatement.bindNull(11);
        } else {
            sQLiteStatement.bindText(11, strK7);
        }
        String str4 = v0Var.f2601l;
        if (str4 == null) {
            sQLiteStatement.bindNull(12);
        } else {
            sQLiteStatement.bindText(12, str4);
        }
        List list2 = v0Var.f2602m;
        String strR2 = list2 != null ? com.revolut.data.database.models.openbanking.d.r("toJson(...)", list2) : null;
        if (strR2 == null) {
            sQLiteStatement.bindNull(13);
        } else {
            sQLiteStatement.bindText(13, strR2);
        }
        String str5 = v0Var.f2603n;
        if (str5 == null) {
            sQLiteStatement.bindNull(14);
        } else {
            sQLiteStatement.bindText(14, str5);
        }
        r0 r0Var = v0Var.o;
        if (r0Var != null) {
            strK8 = GsonHolder.a().k(r0Var);
            Intrinsics.checkNotNullExpressionValue(strK8, "toJson(...)");
        }
        if (strK8 == null) {
            sQLiteStatement.bindNull(15);
        } else {
            sQLiteStatement.bindText(15, strK8);
        }
    }

    private final void i(SQLiteStatement sQLiteStatement, Object obj2) {
        o oVar = (o) obj2;
        String str = oVar.f2546a;
        if (str == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, str);
        }
        String str2 = oVar.f2547b;
        if (str2 == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindText(2, str2);
        }
        String str3 = oVar.f2548c;
        if (str3 == null) {
            sQLiteStatement.bindNull(3);
        } else {
            sQLiteStatement.bindText(3, str3);
        }
        String str4 = oVar.d;
        if (str4 == null) {
            sQLiteStatement.bindNull(4);
        } else {
            sQLiteStatement.bindText(4, str4);
        }
        String str5 = oVar.e;
        if (str5 == null) {
            sQLiteStatement.bindNull(5);
        } else {
            sQLiteStatement.bindText(5, str5);
        }
        String str6 = oVar.f;
        if (str6 == null) {
            sQLiteStatement.bindNull(6);
        } else {
            sQLiteStatement.bindText(6, str6);
        }
        sQLiteStatement.bindLong(7, oVar.f2549g);
    }

    private final void j(SQLiteStatement sQLiteStatement, Object obj2) {
        t tVar = (t) obj2;
        String str = tVar.f2579a;
        if (str == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, str);
        }
        String str2 = tVar.f2580b;
        if (str2 == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindText(2, str2);
        }
        String str3 = tVar.f2581c;
        if (str3 == null) {
            sQLiteStatement.bindNull(3);
        } else {
            sQLiteStatement.bindText(3, str3);
        }
        String str4 = tVar.d;
        if (str4 == null) {
            sQLiteStatement.bindNull(4);
        } else {
            sQLiteStatement.bindText(4, str4);
        }
        String str5 = tVar.e;
        if (str5 == null) {
            sQLiteStatement.bindNull(5);
        } else {
            sQLiteStatement.bindText(5, str5);
        }
        String str6 = tVar.f;
        if (str6 == null) {
            sQLiteStatement.bindNull(6);
        } else {
            sQLiteStatement.bindText(6, str6);
        }
        String str7 = tVar.f2582g;
        if (str7 == null) {
            sQLiteStatement.bindNull(7);
        } else {
            sQLiteStatement.bindText(7, str7);
        }
        String str8 = tVar.f2583h;
        if (str8 == null) {
            sQLiteStatement.bindNull(8);
        } else {
            sQLiteStatement.bindText(8, str8);
        }
        List list = tVar.i;
        String strK = null;
        String strR = list != null ? com.revolut.data.database.models.openbanking.d.r("toJson(...)", list) : null;
        if (strR == null) {
            sQLiteStatement.bindNull(9);
        } else {
            sQLiteStatement.bindText(9, strR);
        }
        w wVar = tVar.f2584j;
        if (wVar != null) {
            strK = GsonHolder.a().k(wVar);
            Intrinsics.checkNotNullExpressionValue(strK, "toJson(...)");
        }
        if (strK == null) {
            sQLiteStatement.bindNull(10);
        } else {
            sQLiteStatement.bindText(10, strK);
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
        String str;
        String strK8;
        String strK9;
        String strK10;
        String strK11;
        switch (this.f267024a) {
            case 0:
                u0g.a aVar = (u0g.a) obj2;
                String str2 = aVar.f276170a;
                if (str2 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str2);
                }
                String str3 = aVar.f276171b;
                if (str3 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str3);
                }
                String str4 = aVar.f276172c;
                if (str4 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, str4);
                }
                String str5 = aVar.d;
                if (str5 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, str5);
                }
                String str6 = aVar.e;
                if (str6 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, str6);
                }
                rzf.g gVar = aVar.f;
                String strK12 = null;
                if (gVar != null) {
                    strK = GsonHolder.a().k(gVar);
                    Intrinsics.checkNotNullExpressionValue(strK, "toJson(...)");
                } else {
                    strK = null;
                }
                if (strK == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, strK);
                }
                List list = aVar.f276173g;
                String strR = list != null ? com.revolut.data.database.models.openbanking.d.r("toJson(...)", list) : null;
                if (strR == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindText(7, strR);
                }
                String str7 = aVar.f276174h;
                if (str7 == null) {
                    sQLiteStatement.bindNull(8);
                } else {
                    sQLiteStatement.bindText(8, str7);
                }
                hzf.b bVar = aVar.i;
                if (bVar != null) {
                    strK2 = GsonHolder.a().k(bVar);
                    Intrinsics.checkNotNullExpressionValue(strK2, "toJson(...)");
                } else {
                    strK2 = null;
                }
                if (strK2 == null) {
                    sQLiteStatement.bindNull(9);
                } else {
                    sQLiteStatement.bindText(9, strK2);
                }
                a0g.b bVar2 = aVar.f276175j;
                if (bVar2 != null) {
                    strK3 = GsonHolder.a().k(bVar2);
                    Intrinsics.checkNotNullExpressionValue(strK3, "toJson(...)");
                } else {
                    strK3 = null;
                }
                if (strK3 == null) {
                    sQLiteStatement.bindNull(10);
                } else {
                    sQLiteStatement.bindText(10, strK3);
                }
                String str8 = aVar.k;
                if (str8 == null) {
                    sQLiteStatement.bindNull(11);
                } else {
                    sQLiteStatement.bindText(11, str8);
                }
                lzf.a aVar2 = aVar.f276176l;
                if (aVar2 != null) {
                    strK4 = GsonHolder.a().k(aVar2);
                    Intrinsics.checkNotNullExpressionValue(strK4, "toJson(...)");
                } else {
                    strK4 = null;
                }
                if (strK4 == null) {
                    sQLiteStatement.bindNull(12);
                } else {
                    sQLiteStatement.bindText(12, strK4);
                }
                String str9 = aVar.f276177m;
                if (str9 == null) {
                    sQLiteStatement.bindNull(13);
                } else {
                    sQLiteStatement.bindText(13, str9);
                }
                hzf.a aVar3 = aVar.f276178n;
                if (aVar3 != null) {
                    strK5 = GsonHolder.a().k(aVar3);
                    Intrinsics.checkNotNullExpressionValue(strK5, "toJson(...)");
                } else {
                    strK5 = null;
                }
                if (strK5 == null) {
                    sQLiteStatement.bindNull(14);
                } else {
                    sQLiteStatement.bindText(14, strK5);
                }
                jzf.b bVar3 = aVar.o;
                if (bVar3 != null) {
                    strK6 = GsonHolder.a().k(bVar3);
                    Intrinsics.checkNotNullExpressionValue(strK6, "toJson(...)");
                } else {
                    strK6 = null;
                }
                if (strK6 == null) {
                    sQLiteStatement.bindNull(15);
                } else {
                    sQLiteStatement.bindText(15, strK6);
                }
                List list2 = aVar.f276179p;
                String strR2 = list2 != null ? com.revolut.data.database.models.openbanking.d.r("toJson(...)", list2) : null;
                if (strR2 == null) {
                    sQLiteStatement.bindNull(16);
                } else {
                    sQLiteStatement.bindText(16, strR2);
                }
                String str10 = aVar.f276180q;
                if (str10 == null) {
                    sQLiteStatement.bindNull(17);
                } else {
                    sQLiteStatement.bindText(17, str10);
                }
                wzf.a aVar4 = aVar.f276181r;
                if (aVar4 != null) {
                    strK12 = GsonHolder.a().k(aVar4);
                    Intrinsics.checkNotNullExpressionValue(strK12, "toJson(...)");
                }
                if (strK12 == null) {
                    sQLiteStatement.bindNull(18);
                    return;
                } else {
                    sQLiteStatement.bindText(18, strK12);
                    return;
                }
            case 1:
                pzf.b bVar4 = (pzf.b) obj2;
                String str11 = bVar4.f241004a;
                if (str11 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str11);
                }
                String str12 = bVar4.f241005b;
                if (str12 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str12);
                }
                String str13 = bVar4.f241006c;
                if (str13 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, str13);
                }
                String str14 = bVar4.d;
                if (str14 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, str14);
                }
                pzf.a aVar5 = bVar4.e;
                if (aVar5 != null) {
                    strK7 = GsonHolder.a().k(aVar5);
                    Intrinsics.checkNotNullExpressionValue(strK7, "toJson(...)");
                } else {
                    strK7 = null;
                }
                if (strK7 == null) {
                    sQLiteStatement.bindNull(5);
                    return;
                } else {
                    sQLiteStatement.bindText(5, strK7);
                    return;
                }
            case 2:
                u0g.f fVar = (u0g.f) obj2;
                String str15 = fVar.f276194a;
                if (str15 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str15);
                }
                sQLiteStatement.bindLong(2, fVar.f276195b);
                String str16 = fVar.f276196c;
                if (str16 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, str16);
                }
                Long l2 = fVar.d;
                if (l2 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindLong(4, l2.longValue());
                }
                Long l3 = fVar.e;
                if (l3 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindLong(5, l3.longValue());
                }
                String str17 = fVar.f;
                if (str17 == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, str17);
                }
                String str18 = fVar.f276197g;
                if (str18 == null) {
                    sQLiteStatement.bindNull(7);
                    return;
                } else {
                    sQLiteStatement.bindText(7, str18);
                    return;
                }
            case 3:
                u0g.b bVar5 = (u0g.b) obj2;
                sQLiteStatement.bindLong(1, bVar5.f276182a);
                String str19 = bVar5.f276183b;
                if (str19 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str19);
                }
                String str20 = bVar5.f276184c;
                if (str20 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, str20);
                }
                String str21 = bVar5.d;
                if (str21 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, str21);
                }
                if (bVar5.e == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindLong(5, r0.intValue());
                }
                String str22 = bVar5.f;
                if (str22 == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, str22);
                }
                String str23 = bVar5.f276185g;
                if (str23 == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindText(7, str23);
                }
                u0g.d dVar = bVar5.f276186h;
                String str24 = dVar.f276189a;
                if (str24 == null) {
                    sQLiteStatement.bindNull(8);
                } else {
                    sQLiteStatement.bindText(8, str24);
                }
                u0g.c cVar = dVar.f276190b;
                String str25 = cVar.f276187a;
                if (str25 == null) {
                    sQLiteStatement.bindNull(9);
                } else {
                    sQLiteStatement.bindText(9, str25);
                }
                String str26 = cVar.f276188b;
                if (str26 == null) {
                    sQLiteStatement.bindNull(10);
                    return;
                } else {
                    sQLiteStatement.bindText(10, str26);
                    return;
                }
            case 4:
                u0g.e eVar = (u0g.e) obj2;
                String str27 = eVar.f276191a;
                if (str27 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str27);
                }
                sQLiteStatement.bindLong(2, eVar.f276192b);
                sQLiteStatement.bindDouble(3, eVar.f276193c);
                return;
            case 5:
                i iVar = (i) obj2;
                String str28 = iVar.f289811a;
                if (str28 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str28);
                }
                String str29 = iVar.f289812b;
                if (str29 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str29);
                }
                List consents = iVar.f289813c;
                Intrinsics.checkNotNullParameter(consents, "consents");
                Json jsonA = af0.b.a();
                jsonA.getClass();
                sQLiteStatement.bindText(3, jsonA.c(new qlm.e(vjl.h.Companion.serializer()), consents));
                Instant instant = iVar.d;
                Long lValueOf = instant != null ? Long.valueOf(instant.toEpochMilli()) : null;
                if (lValueOf == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindLong(4, lValueOf.longValue());
                }
                Instant instant2 = iVar.e;
                Long lValueOf2 = instant2 != null ? Long.valueOf(instant2.toEpochMilli()) : null;
                if (lValueOf2 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindLong(5, lValueOf2.longValue());
                }
                String str30 = iVar.f;
                if (str30 == null) {
                    sQLiteStatement.bindNull(6);
                    return;
                } else {
                    sQLiteStatement.bindText(6, str30);
                    return;
                }
            case 6:
                v69.b bVar6 = (v69.b) obj2;
                String str31 = bVar6.f286335a;
                if (str31 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str31);
                }
                String str32 = bVar6.f286336b;
                if (str32 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str32);
                }
                Long lB = b21.a.b(bVar6.f286337c);
                if (lB == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindLong(3, lB.longValue());
                }
                String str33 = bVar6.d;
                if (str33 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, str33);
                }
                String str34 = bVar6.e;
                if (str34 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, str34);
                }
                String str35 = bVar6.f;
                if (str35 == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, str35);
                }
                String str36 = bVar6.f286338g;
                if (str36 == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindText(7, str36);
                }
                String str37 = bVar6.f286339h;
                if (str37 == null) {
                    sQLiteStatement.bindNull(8);
                } else {
                    sQLiteStatement.bindText(8, str37);
                }
                if (bVar6.i == null) {
                    sQLiteStatement.bindNull(9);
                } else {
                    sQLiteStatement.bindLong(9, r0.intValue());
                }
                List items = bVar6.k;
                Intrinsics.checkNotNullParameter(items, "items");
                String strK13 = GsonHolder.a().k(items);
                Intrinsics.checkNotNullExpressionValue(strK13, "toJson(...)");
                if (strK13 == null) {
                    sQLiteStatement.bindNull(10);
                } else {
                    sQLiteStatement.bindText(10, strK13);
                }
                String str38 = bVar6.f286341l;
                if (str38 == null) {
                    sQLiteStatement.bindNull(11);
                } else {
                    sQLiteStatement.bindText(11, str38);
                }
                String str39 = bVar6.f286342m;
                if (str39 == null) {
                    sQLiteStatement.bindNull(12);
                } else {
                    sQLiteStatement.bindText(12, str39);
                }
                v69.c cVar2 = bVar6.f286340j;
                if (cVar2 == null) {
                    prk.o.z(sQLiteStatement, 13, 14, 15, 16);
                    return;
                }
                String str40 = cVar2.f286343a;
                if (str40 == null) {
                    sQLiteStatement.bindNull(13);
                } else {
                    sQLiteStatement.bindText(13, str40);
                }
                String str41 = cVar2.f286344b;
                if (str41 == null) {
                    sQLiteStatement.bindNull(14);
                } else {
                    sQLiteStatement.bindText(14, str41);
                }
                String str42 = cVar2.f286345c;
                if (str42 == null) {
                    sQLiteStatement.bindNull(15);
                } else {
                    sQLiteStatement.bindText(15, str42);
                }
                String str43 = cVar2.d;
                if (str43 == null) {
                    sQLiteStatement.bindNull(16);
                    return;
                } else {
                    sQLiteStatement.bindText(16, str43);
                    return;
                }
            case 7:
                w46.b bVar7 = (w46.b) obj2;
                String str44 = bVar7.f294514a;
                if (str44 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str44);
                }
                String str45 = bVar7.f294515b;
                if (str45 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str45);
                }
                String str46 = bVar7.f294516c;
                if (str46 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, str46);
                }
                String str47 = bVar7.d;
                if (str47 == null) {
                    sQLiteStatement.bindNull(4);
                    return;
                } else {
                    sQLiteStatement.bindText(4, str47);
                    return;
                }
            case 8:
                w5d.a aVar6 = (w5d.a) obj2;
                String str48 = aVar6.f295100a;
                if (str48 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str48);
                }
                sQLiteStatement.bindLong(2, aVar6.f295101b ? 1L : 0L);
                String str49 = aVar6.f295102c;
                if (str49 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, str49);
                }
                String str50 = aVar6.d;
                if (str50 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, str50);
                }
                String str51 = aVar6.e;
                if (str51 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, str51);
                }
                Long l4 = aVar6.f;
                if (l4 == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindLong(6, l4.longValue());
                }
                String str52 = aVar6.f295103g;
                if (str52 == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindText(7, str52);
                }
                if (aVar6.f295104h == null) {
                    sQLiteStatement.bindNull(8);
                } else {
                    sQLiteStatement.bindDouble(8, r0.floatValue());
                }
                if (aVar6.i == null) {
                    sQLiteStatement.bindNull(9);
                } else {
                    sQLiteStatement.bindDouble(9, r0.floatValue());
                }
                String str53 = aVar6.f295105j;
                if (str53 == null) {
                    sQLiteStatement.bindNull(10);
                } else {
                    sQLiteStatement.bindText(10, str53);
                }
                String str54 = aVar6.k;
                if (str54 == null) {
                    sQLiteStatement.bindNull(11);
                } else {
                    sQLiteStatement.bindText(11, str54);
                }
                String str55 = aVar6.f295106l;
                if (str55 == null) {
                    sQLiteStatement.bindNull(12);
                } else {
                    sQLiteStatement.bindText(12, str55);
                }
                Long l5 = aVar6.f295107m;
                if (l5 == null) {
                    sQLiteStatement.bindNull(13);
                    return;
                } else {
                    sQLiteStatement.bindLong(13, l5.longValue());
                    return;
                }
            case 9:
                vuf.e eVar2 = (vuf.e) obj2;
                String str56 = eVar2.f292351a;
                if (str56 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str56);
                }
                String str57 = eVar2.f292352b;
                if (str57 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str57);
                }
                String str58 = eVar2.f292353c;
                if (str58 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, str58);
                }
                vuf.f fVar2 = eVar2.d;
                int i = j.f292372a[fVar2.ordinal()];
                if (i == 1) {
                    str = "ACTIVATED";
                } else if (i == 2) {
                    str = "TO_BE_ACTIVATED";
                } else if (i == 3) {
                    str = "EXPIRED";
                } else if (i == 4) {
                    str = "NOT_PURCHASED";
                } else {
                    if (i != 5) {
                        throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: " + fVar2);
                    }
                    str = "PENDING";
                }
                sQLiteStatement.bindText(4, str);
                String str59 = eVar2.e;
                if (str59 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, str59);
                }
                String strM = b21.a.m(eVar2.f292355h);
                if (strM == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, strM);
                }
                String strM2 = b21.a.m(eVar2.i);
                if (strM2 == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindText(7, strM2);
                }
                sQLiteStatement.bindLong(8, eVar2.f292356j);
                String str60 = eVar2.k;
                if (str60 == null) {
                    sQLiteStatement.bindNull(9);
                } else {
                    sQLiteStatement.bindText(9, str60);
                }
                String str61 = eVar2.f292357l;
                if (str61 == null) {
                    sQLiteStatement.bindNull(10);
                } else {
                    sQLiteStatement.bindText(10, str61);
                }
                String str62 = eVar2.o;
                if (str62 == null) {
                    sQLiteStatement.bindNull(11);
                } else {
                    sQLiteStatement.bindText(11, str62);
                }
                List list3 = eVar2.f292360p;
                String strR3 = list3 != null ? com.revolut.data.database.models.openbanking.d.r("toJson(...)", list3) : null;
                if (strR3 == null) {
                    sQLiteStatement.bindNull(12);
                } else {
                    sQLiteStatement.bindText(12, strR3);
                }
                List list4 = eVar2.f292361q;
                String strR4 = list4 != null ? com.revolut.data.database.models.openbanking.d.r("toJson(...)", list4) : null;
                if (strR4 == null) {
                    sQLiteStatement.bindNull(13);
                } else {
                    sQLiteStatement.bindText(13, strR4);
                }
                String str63 = eVar2.f292362r;
                if (str63 == null) {
                    sQLiteStatement.bindNull(14);
                } else {
                    sQLiteStatement.bindText(14, str63);
                }
                Boolean bool = eVar2.f292363s;
                if ((bool == null ? null : Integer.valueOf(bool.booleanValue() ? 1 : 0)) == null) {
                    sQLiteStatement.bindNull(15);
                } else {
                    sQLiteStatement.bindLong(15, r0.intValue());
                }
                List list5 = eVar2.v;
                String strR5 = list5 != null ? com.revolut.data.database.models.openbanking.d.r("toJson(...)", list5) : null;
                if (strR5 == null) {
                    sQLiteStatement.bindNull(16);
                } else {
                    sQLiteStatement.bindText(16, strR5);
                }
                Long l22 = eVar2.f292366x;
                if (l22 == null) {
                    sQLiteStatement.bindNull(17);
                } else {
                    sQLiteStatement.bindLong(17, l22.longValue());
                }
                Long l31 = eVar2.f292367y;
                if (l31 == null) {
                    sQLiteStatement.bindNull(18);
                } else {
                    sQLiteStatement.bindLong(18, l31.longValue());
                }
                Long l37 = eVar2.z;
                if (l37 == null) {
                    sQLiteStatement.bindNull(19);
                } else {
                    sQLiteStatement.bindLong(19, l37.longValue());
                }
                String str64 = eVar2.A;
                if (str64 == null) {
                    sQLiteStatement.bindNull(20);
                } else {
                    sQLiteStatement.bindText(20, str64);
                }
                Boolean bool2 = eVar2.B;
                if ((bool2 != null ? Integer.valueOf(bool2.booleanValue() ? 1 : 0) : null) == null) {
                    sQLiteStatement.bindNull(21);
                } else {
                    sQLiteStatement.bindLong(21, r2.intValue());
                }
                n nVar = eVar2.f;
                String str65 = nVar.f292382a;
                if (str65 == null) {
                    sQLiteStatement.bindNull(22);
                } else {
                    sQLiteStatement.bindText(22, str65);
                }
                String str66 = nVar.f292383b;
                if (str66 == null) {
                    sQLiteStatement.bindNull(23);
                } else {
                    sQLiteStatement.bindText(23, str66);
                }
                String str67 = nVar.f292384c;
                if (str67 == null) {
                    sQLiteStatement.bindNull(24);
                } else {
                    sQLiteStatement.bindText(24, str67);
                }
                sQLiteStatement.bindLong(25, nVar.d);
                m mVar = eVar2.f292354g;
                String str68 = mVar.f292379a;
                if (str68 == null) {
                    sQLiteStatement.bindNull(26);
                } else {
                    sQLiteStatement.bindText(26, str68);
                }
                String str69 = mVar.f292380b;
                if (str69 == null) {
                    sQLiteStatement.bindNull(27);
                } else {
                    sQLiteStatement.bindText(27, str69);
                }
                String str70 = mVar.f292381c;
                if (str70 == null) {
                    sQLiteStatement.bindNull(28);
                } else {
                    sQLiteStatement.bindText(28, str70);
                }
                s sVar = eVar2.f292358m;
                String str71 = sVar.f292392a;
                if (str71 == null) {
                    sQLiteStatement.bindNull(29);
                } else {
                    sQLiteStatement.bindText(29, str71);
                }
                vuf.r rVar = sVar.f292393b;
                String str72 = rVar.f292390a;
                if (str72 == null) {
                    sQLiteStatement.bindNull(30);
                } else {
                    sQLiteStatement.bindText(30, str72);
                }
                String str73 = rVar.f292391b;
                if (str73 == null) {
                    sQLiteStatement.bindNull(31);
                } else {
                    sQLiteStatement.bindText(31, str73);
                }
                jo3.b bVar8 = eVar2.f292359n;
                if (bVar8 == null) {
                    sQLiteStatement.bindNull(32);
                    sQLiteStatement.bindNull(33);
                } else if (a10.b.v(bVar8, sQLiteStatement, 32) == null) {
                    sQLiteStatement.bindNull(33);
                } else {
                    sQLiteStatement.bindText(33, bVar8.getCurrency());
                }
                vuf.t tVar = eVar2.f292364t;
                if (tVar != null) {
                    String str74 = tVar.f292394a;
                    if (str74 == null) {
                        sQLiteStatement.bindNull(34);
                    } else {
                        sQLiteStatement.bindText(34, str74);
                    }
                    String str75 = tVar.f292395b;
                    if (str75 == null) {
                        sQLiteStatement.bindNull(35);
                    } else {
                        sQLiteStatement.bindText(35, str75);
                    }
                } else {
                    sQLiteStatement.bindNull(34);
                    sQLiteStatement.bindNull(35);
                }
                vuf.g gVar2 = eVar2.u;
                if (gVar2 != null) {
                    sQLiteStatement.bindLong(36, gVar2.f292368a);
                    sQLiteStatement.bindLong(37, gVar2.f292369b);
                } else {
                    sQLiteStatement.bindNull(36);
                    sQLiteStatement.bindNull(37);
                }
                l lVar = eVar2.f292365w;
                if (lVar == null) {
                    prk.o.y(sQLiteStatement, 38, 39, 40);
                    return;
                }
                sQLiteStatement.bindLong(38, lVar.f292376a);
                sQLiteStatement.bindLong(39, lVar.f292377b);
                sQLiteStatement.bindLong(40, lVar.f292378c);
                return;
            case 10:
                x0e.a aVar7 = (x0e.a) obj2;
                String str76 = aVar7.f301574a;
                if (str76 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str76);
                }
                String strO = b21.a.o(aVar7.f301575b);
                if (strO == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, strO);
                }
                Long lB2 = b21.a.b(aVar7.f301576c);
                if (lB2 == null) {
                    sQLiteStatement.bindNull(3);
                    return;
                } else {
                    sQLiteStatement.bindLong(3, lB2.longValue());
                    return;
                }
            case 11:
                zcj.c cVar3 = (zcj.c) obj2;
                String str77 = cVar3.f321271a;
                if (str77 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str77);
                }
                String str78 = cVar3.f321272b;
                if (str78 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str78);
                }
                Long lD = b21.a.d(cVar3.f321273c);
                if (lD == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindLong(3, lD.longValue());
                }
                List list6 = cVar3.d;
                String strR6 = list6 != null ? com.revolut.data.database.models.openbanking.d.r("toJson(...)", list6) : null;
                if (strR6 == null) {
                    sQLiteStatement.bindNull(4);
                    return;
                } else {
                    sQLiteStatement.bindText(4, strR6);
                    return;
                }
            case 12:
                zcj.d dVar2 = (zcj.d) obj2;
                String str79 = dVar2.f321274a;
                if (str79 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str79);
                }
                String str80 = dVar2.f321275b;
                if (str80 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str80);
                }
                String str81 = dVar2.f321276c;
                if (str81 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, str81);
                }
                String str82 = dVar2.d;
                if (str82 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, str82);
                }
                zcj.g gVar3 = dVar2.e;
                if (gVar3 != null) {
                    strK8 = GsonHolder.a().k(gVar3);
                    Intrinsics.checkNotNullExpressionValue(strK8, "toJson(...)");
                } else {
                    strK8 = null;
                }
                if (strK8 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, strK8);
                }
                zcj.e eVar3 = dVar2.f;
                if (eVar3 != null) {
                    strK9 = GsonHolder.a().k(eVar3);
                    Intrinsics.checkNotNullExpressionValue(strK9, "toJson(...)");
                } else {
                    strK9 = null;
                }
                if (strK9 == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, strK9);
                }
                zcj.a aVar8 = dVar2.f321277g;
                if (aVar8 != null) {
                    strK10 = GsonHolder.a().k(aVar8);
                    Intrinsics.checkNotNullExpressionValue(strK10, "toJson(...)");
                } else {
                    strK10 = null;
                }
                if (strK10 == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindText(7, strK10);
                }
                List list7 = dVar2.f321278h;
                String strR7 = list7 != null ? com.revolut.data.database.models.openbanking.d.r("toJson(...)", list7) : null;
                if (strR7 == null) {
                    sQLiteStatement.bindNull(8);
                    return;
                } else {
                    sQLiteStatement.bindText(8, strR7);
                    return;
                }
            case 13:
                oxf.b bVar9 = (oxf.b) obj2;
                String str83 = bVar9.f230805a;
                if (str83 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str83);
                }
                String str84 = bVar9.f230806b;
                if (str84 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str84);
                }
                String str85 = bVar9.f230807c;
                if (str85 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, str85);
                }
                String str86 = bVar9.d;
                if (str86 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, str86);
                }
                String strH = b21.a.h(bVar9.e);
                if (strH == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, strH);
                }
                String str87 = bVar9.f;
                if (str87 == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, str87);
                }
                LocalTime localTime = bVar9.f230808g;
                String string = localTime != null ? localTime.toString() : null;
                if (string == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindText(7, string);
                }
                String strH2 = b21.a.h(bVar9.f230809h);
                if (strH2 == null) {
                    sQLiteStatement.bindNull(8);
                } else {
                    sQLiteStatement.bindText(8, strH2);
                }
                oxf.a aVar9 = bVar9.i;
                if (aVar9 == null) {
                    prk.o.z(sQLiteStatement, 9, 10, 11, 12);
                    sQLiteStatement.bindNull(13);
                    sQLiteStatement.bindNull(14);
                    return;
                }
                if (aVar9.getStreetLine1() == null) {
                    sQLiteStatement.bindNull(9);
                } else {
                    sQLiteStatement.bindText(9, aVar9.getStreetLine1());
                }
                if (aVar9.getStreetLine2() == null) {
                    sQLiteStatement.bindNull(10);
                } else {
                    sQLiteStatement.bindText(10, aVar9.getStreetLine2());
                }
                if (aVar9.getRegion() == null) {
                    sQLiteStatement.bindNull(11);
                } else {
                    sQLiteStatement.bindText(11, aVar9.getRegion());
                }
                if (aVar9.getCity() == null) {
                    sQLiteStatement.bindNull(12);
                } else {
                    sQLiteStatement.bindText(12, aVar9.getCity());
                }
                if (aVar9.getCountry() == null) {
                    sQLiteStatement.bindNull(13);
                } else {
                    sQLiteStatement.bindText(13, aVar9.getCountry());
                }
                if (aVar9.getPostcode() == null) {
                    sQLiteStatement.bindNull(14);
                    return;
                } else {
                    sQLiteStatement.bindText(14, aVar9.getPostcode());
                    return;
                }
            case 14:
                qxf.a aVar10 = (qxf.a) obj2;
                String str88 = aVar10.f250086a;
                if (str88 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str88);
                }
                String str89 = aVar10.f250087b;
                if (str89 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str89);
                }
                String str90 = aVar10.f250088c;
                if (str90 == null) {
                    sQLiteStatement.bindNull(3);
                    return;
                } else {
                    sQLiteStatement.bindText(3, str90);
                    return;
                }
            case 15:
                oxf.c cVar4 = (oxf.c) obj2;
                String str91 = cVar4.f230810a;
                if (str91 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str91);
                }
                String str92 = cVar4.f230811b;
                if (str92 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str92);
                }
                String str93 = cVar4.f230812c;
                if (str93 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, str93);
                }
                String str94 = cVar4.d;
                if (str94 == null) {
                    sQLiteStatement.bindNull(4);
                    return;
                } else {
                    sQLiteStatement.bindText(4, str94);
                    return;
                }
            case 16:
                sxf.b bVar10 = (sxf.b) obj2;
                String str95 = bVar10.f266479a;
                if (str95 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str95);
                }
                String str96 = bVar10.f266480b;
                if (str96 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str96);
                }
                String strH3 = b21.a.h(bVar10.f266481c);
                if (strH3 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, strH3);
                }
                String strH4 = b21.a.h(bVar10.d);
                if (strH4 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, strH4);
                }
                if (bVar10.e == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindLong(5, r0.intValue());
                }
                List properties = bVar10.f.getProperties();
                String strR8 = properties != null ? com.revolut.data.database.models.openbanking.d.r("toJson(...)", properties) : null;
                if (strR8 == null) {
                    sQLiteStatement.bindNull(6);
                    return;
                } else {
                    sQLiteStatement.bindText(6, strR8);
                    return;
                }
            case 17:
                sxf.a aVar11 = (sxf.a) obj2;
                String str97 = aVar11.f266476a;
                if (str97 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str97);
                }
                String str98 = aVar11.f266477b;
                if (str98 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str98);
                }
                String str99 = aVar11.f266478c;
                if (str99 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, str99);
                }
                String str100 = aVar11.d;
                if (str100 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, str100);
                }
                String str101 = aVar11.e;
                if (str101 == null) {
                    sQLiteStatement.bindNull(5);
                    return;
                } else {
                    sQLiteStatement.bindText(5, str101);
                    return;
                }
            case 18:
                a(sQLiteStatement, obj2);
                return;
            case 19:
                b(sQLiteStatement, obj2);
                return;
            case 20:
                c(sQLiteStatement, obj2);
                return;
            case 21:
                d(sQLiteStatement, obj2);
                return;
            case 22:
                e(sQLiteStatement, obj2);
                return;
            case 23:
                f(sQLiteStatement, obj2);
                return;
            case 24:
                throw a10.b.m(obj2);
            case 25:
                g(sQLiteStatement, obj2);
                return;
            case 26:
                h(sQLiteStatement, obj2);
                return;
            case 27:
                i(sQLiteStatement, obj2);
                return;
            case 28:
                j(sQLiteStatement, obj2);
                return;
            default:
                e0 e0Var = (e0) obj2;
                String str102 = e0Var.f2475a;
                if (str102 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str102);
                }
                String str103 = e0Var.f2476b;
                if (str103 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str103);
                }
                String str104 = e0Var.f2477c;
                if (str104 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, str104);
                }
                List list8 = e0Var.d;
                String strK14 = null;
                String strR9 = list8 != null ? com.revolut.data.database.models.openbanking.d.r("toJson(...)", list8) : null;
                if (strR9 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, strR9);
                }
                h0 h0Var = e0Var.e;
                if (h0Var != null) {
                    strK11 = GsonHolder.a().k(h0Var);
                    Intrinsics.checkNotNullExpressionValue(strK11, "toJson(...)");
                } else {
                    strK11 = null;
                }
                if (strK11 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, strK11);
                }
                String str105 = e0Var.f;
                if (str105 == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, str105);
                }
                a0 a0Var = e0Var.f2478g;
                if (a0Var != null) {
                    strK14 = GsonHolder.a().k(a0Var);
                    Intrinsics.checkNotNullExpressionValue(strK14, "toJson(...)");
                }
                if (strK14 == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindText(7, strK14);
                }
                String str106 = e0Var.i;
                if (str106 == null) {
                    sQLiteStatement.bindNull(8);
                } else {
                    sQLiteStatement.bindText(8, str106);
                }
                d0 d0Var = e0Var.f2479h;
                String str107 = d0Var.f2462a;
                if (str107 == null) {
                    sQLiteStatement.bindNull(9);
                } else {
                    sQLiteStatement.bindText(9, str107);
                }
                String str108 = d0Var.f2463b;
                if (str108 == null) {
                    sQLiteStatement.bindNull(10);
                    return;
                } else {
                    sQLiteStatement.bindText(10, str108);
                    return;
                }
        }
    }

    @Override // androidx.room.EntityInsertAdapter
    public final String createQuery() {
        switch (this.f267024a) {
            case 0:
                return "INSERT OR REPLACE INTO `travel_experiences_booking` (`id`,`status`,`createdDate`,`date`,`time`,`experience`,`visitors`,`failureReason`,`ticket`,`pricing`,`rewardType`,`cashback`,`cancellationToken`,`cancellationPolicy`,`cancellationRefund`,`transactions`,`pointsReward`,`pointsOption`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `travel_experiences_recently_viewed_dropoff` (`experienceId`,`name`,`subtitle`,`image`,`parameters`) VALUES (?,?,?,?,?)";
            case 2:
                return "INSERT OR REPLACE INTO `travel_experiences_recent_search_destination` (`id`,`searchTimestamp`,`name`,`startDate`,`endDate`,`locationType`,`destinationType`) VALUES (?,?,?,?,?,?,?)";
            case 3:
                return "INSERT OR REPLACE INTO `travel_experiences_reviews` (`id`,`experienceId`,`publishedDate`,`userName`,`rating`,`title`,`text`,`provider`,`light`,`dark`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?)";
            case 4:
                return "INSERT OR REPLACE INTO `travel_experiences_reviews_summary` (`experienceId`,`count`,`averageScore`) VALUES (?,?,?)";
            case 5:
                return "INSERT OR REPLACE INTO `consented_client` (`id`,`name`,`consents`,`createdAt`,`lastUsedAt`,`iconUri`) VALUES (?,?,?,?,?,?)";
            case 6:
                return "INSERT OR REPLACE INTO `inbox_item` (`id`,`type`,`createdDate`,`state`,`title`,`subtitle`,`icon`,`deeplink`,`viewCount`,`buttons`,`asset`,`body`,`messageId`,`campaignId`,`pushId`,`tileId`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 7:
                return "INSERT OR REPLACE INTO `defi_fiat_rates` (`assetId`,`toCurrency`,`rate`,`eodRate`) VALUES (?,?,?,?)";
            case 8:
                return "INSERT OR REPLACE INTO `auto_invests` (`id`,`isEnabled`,`targetId`,`targetType`,`targetName`,`dailySpendAmount`,`dailySpendCcy`,`percentage`,`multiplier`,`strategy`,`ownerId`,`scope`,`createdDate`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 9:
                return "INSERT OR REPLACE INTO `purchased_transit_tickets` (`id`,`ticketOfferId`,`ticketNumber`,`state`,`title`,`zones`,`tags`,`createdDate`,`locationName`,`countryCode`,`pocketId`,`generalInputs`,`passengerInputs`,`transactionId`,`isDiscounted`,`activationParams`,`activationTimeoutDate`,`activationAvailableDate`,`activatedAt`,`controlNumber`,`canBeUsedForExtension`,`ticketType_key`,`ticketType_name`,`ticketType_category`,`ticketType_displayOrder`,`description_default`,`description_short`,`description_extra`,`provider_name`,`provider_logo_type`,`provider_logo_value`,`price_amount`,`price_currency`,`qrCode_type`,`qrCode_value`,`validity_from`,`validity_to`,`activationProviderParams_maxAttempts`,`activationProviderParams_activationTimeout`,`activationProviderParams_activationBlockDuration`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 10:
                return "INSERT OR REPLACE INTO `slip_transactions` (`id`,`amount`,`completedAt`) VALUES (?,?,?)";
            case 11:
                return "INSERT OR REPLACE INTO `commodity_price_targets_info` (`fromCcy`,`toCcy`,`updatedAt`,`priceTargets`) VALUES (?,?,?,?)";
            case 12:
                return "INSERT OR REPLACE INTO `crypto_details_about` (`symbol`,`description`,`website`,`whitepaperLink`,`stats`,`sentimentIndicator`,`airTip`,`customLinks`) VALUES (?,?,?,?,?,?,?,?)";
            case 13:
                return "INSERT OR REPLACE INTO `travel_booking` (`id`,`name`,`image`,`type`,`date`,`state`,`time`,`endDate`,`address_streetLine1`,`address_streetLine2`,`address_region`,`address_city`,`address_country`,`address_postcode`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 14:
                return "INSERT OR REPLACE INTO `travel_document` (`product`,`type`,`uri`) VALUES (?,?,?)";
            case 15:
                return "INSERT OR REPLACE INTO `travel_favorite` (`id`,`name`,`image`,`type`) VALUES (?,?,?,?)";
            case 16:
                return "INSERT OR REPLACE INTO `travel_trip` (`id`,`currency`,`startDate`,`endDate`,`travellers`,`recommendation_properties`) VALUES (?,?,?,?,?,?)";
            case 17:
                return "INSERT OR REPLACE INTO `travel_trip_destination` (`id`,`tripId`,`name`,`type`,`product`) VALUES (?,?,?,?,?)";
            case 18:
                return "INSERT OR REPLACE INTO `transfer_instruments` (`account_id`,`ref`,`name`,`symbol`,`currency`,`direction`,`quantity`,`transfer_fee`) VALUES (?,?,?,?,?,?,?,?)";
            case 19:
                return "INSERT OR REPLACE INTO `order_initiation_pages` (`id`,`createdDate`,`state`,`product`,`title`,`amount`,`currency`,`defaultCurrency`,`paymentLink`,`limit`,`completedOrders`,`customFieldDefinitions`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
            case 20:
                return "INSERT OR REPLACE INTO `light_faq` (`type`,`key`,`title`,`parentKey`,`contentStyle`,`deeplink`,`language`,`index`,`iconUri`) VALUES (?,?,?,?,?,?,?,?,?)";
            case 21:
                return "INSERT OR REPLACE INTO `pigeon_tree_node` (`type`,`key`,`parentKey`,`title`,`hidden`,`deeplink`,`language`,`icon`) VALUES (?,?,?,?,?,?,?,?)";
            case 22:
                return "INSERT OR REPLACE INTO `pigeon_node_details` (`key`,`language`,`json`) VALUES (?,?,?)";
            case 23:
                return "INSERT OR REPLACE INTO `budget_entity` (`id`,`type`,`amount`,`walletId`,`currency`,`startDate`,`endDate`,`categoryTag`) VALUES (?,?,?,?,?,?,?,?)";
            case 24:
                return "INSERT OR REPLACE INTO `cached_budget` (`categoryTag`,`amount`,`currency`) VALUES (?,?,?)";
            case 25:
                return "INSERT OR REPLACE INTO `trading_onboarding_kyc` (`id`,`nationalities`,`usTaxPayer`,`rtlBrexitOptIn`,`documents`) VALUES (?,?,?,?,?)";
            case 26:
                return "INSERT OR REPLACE INTO `hotels_booking_details` (`id`,`status`,`bookingReference`,`traveller`,`dates`,`property`,`pricing`,`checkInInstruction`,`rooms`,`payment`,`cashback`,`createdDate`,`transactions`,`hardAmendmentEligibility`,`amendment`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 27:
                return "INSERT OR REPLACE INTO `hotels_campaign` (`id`,`image`,`startDate`,`endDate`,`name`,`discount`,`rank`) VALUES (?,?,?,?,?,?,?)";
            case 28:
                return "INSERT OR REPLACE INTO `hotels_dropoff` (`id`,`state`,`sessionId`,`name`,`imageUrl`,`locationId`,`locationType`,`propertyId`,`roomsInformation`,`searchParameters`) VALUES (?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR REPLACE INTO `hotels_experiences` (`id`,`bookingId`,`name`,`images`,`startingPrice`,`description`,`cancellationPolicy`,`currency`,`destination_id`,`destination_name`) VALUES (?,?,?,?,?,?,?,?,?,?)";
        }
    }

    public /* synthetic */ b(Object obj2, int i) {
        this.f267024a = i;
    }
}
