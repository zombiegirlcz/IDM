package dcl;

import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.sqlite.SQLiteStatement;
import com.revolut.data.utils.gson.GsonHolder;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g0 extends EntityDeleteOrUpdateAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f113019a;

    public /* synthetic */ g0(int i) {
        this.f113019a = i;
    }

    @Override // androidx.room.EntityDeleteOrUpdateAdapter
    public final void bind(SQLiteStatement sQLiteStatement, Object obj2) {
        String strK;
        switch (this.f113019a) {
            case 0:
                hcl.k0 k0Var = (hcl.k0) obj2;
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
                String str12 = k0Var.f151029a;
                if (str12 == null) {
                    sQLiteStatement.bindNull(22);
                    return;
                } else {
                    sQLiteStatement.bindText(22, str12);
                    return;
                }
            case 1:
                hcl.k0 k0Var2 = (hcl.k0) obj2;
                String str13 = k0Var2.f151029a;
                if (str13 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str13);
                }
                String str14 = k0Var2.f151030b;
                if (str14 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str14);
                }
                String str15 = k0Var2.f151031c;
                if (str15 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, str15);
                }
                String str16 = k0Var2.d;
                if (str16 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, str16);
                }
                String str17 = k0Var2.e;
                if (str17 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, str17);
                }
                String strB2 = qcl.k.b(k0Var2.f);
                if (strB2 == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, strB2);
                }
                String strI2 = qcl.k.i(k0Var2.f151032g);
                if (strI2 == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindText(7, strI2);
                }
                String strJ2 = qcl.k.j(k0Var2.f151033h);
                if (strJ2 == null) {
                    sQLiteStatement.bindNull(8);
                } else {
                    sQLiteStatement.bindText(8, strJ2);
                }
                String str18 = k0Var2.i;
                if (str18 == null) {
                    sQLiteStatement.bindNull(9);
                } else {
                    sQLiteStatement.bindText(9, str18);
                }
                if (k0Var2.f151034j == null) {
                    sQLiteStatement.bindNull(10);
                } else {
                    sQLiteStatement.bindLong(10, r0.intValue());
                }
                String str19 = k0Var2.k;
                if (str19 == null) {
                    sQLiteStatement.bindNull(11);
                } else {
                    sQLiteStatement.bindText(11, str19);
                }
                String str20 = k0Var2.f151035l;
                if (str20 == null) {
                    sQLiteStatement.bindNull(12);
                } else {
                    sQLiteStatement.bindText(12, str20);
                }
                String str21 = k0Var2.f151036m;
                if (str21 == null) {
                    sQLiteStatement.bindNull(13);
                } else {
                    sQLiteStatement.bindText(13, str21);
                }
                sQLiteStatement.bindLong(14, k0Var2.f151037n);
                if (k0Var2.o == null) {
                    sQLiteStatement.bindNull(15);
                } else {
                    sQLiteStatement.bindLong(15, r0.intValue());
                }
                String strG3 = qcl.d.g(k0Var2.f151038p);
                if (strG3 == null) {
                    sQLiteStatement.bindNull(16);
                } else {
                    sQLiteStatement.bindText(16, strG3);
                }
                String str22 = k0Var2.f151039q;
                if (str22 == null) {
                    sQLiteStatement.bindNull(17);
                } else {
                    sQLiteStatement.bindText(17, str22);
                }
                String strG4 = qcl.d.g(k0Var2.f151040r);
                if (strG4 == null) {
                    sQLiteStatement.bindNull(18);
                } else {
                    sQLiteStatement.bindText(18, strG4);
                }
                String strA2 = qcl.k.a(k0Var2.f151041s);
                if (strA2 == null) {
                    sQLiteStatement.bindNull(19);
                } else {
                    sQLiteStatement.bindText(19, strA2);
                }
                String str23 = k0Var2.f151042t;
                if (str23 == null) {
                    sQLiteStatement.bindNull(20);
                } else {
                    sQLiteStatement.bindText(20, str23);
                }
                Long l3 = k0Var2.u;
                if (l3 == null) {
                    sQLiteStatement.bindNull(21);
                } else {
                    sQLiteStatement.bindLong(21, l3.longValue());
                }
                String str24 = k0Var2.f151029a;
                if (str24 == null) {
                    sQLiteStatement.bindNull(22);
                    return;
                } else {
                    sQLiteStatement.bindText(22, str24);
                    return;
                }
            case 2:
                ocl.a aVar = (ocl.a) obj2;
                String str25 = aVar.f224249a;
                if (str25 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str25);
                }
                ocl.b entity = aVar.f224250b;
                Intrinsics.checkNotNullParameter(entity, "entity");
                String strK2 = zbl.a.a().k(entity);
                Intrinsics.checkNotNullExpressionValue(strK2, "toJson(...)");
                if (strK2 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, strK2);
                }
                Long l4 = aVar.f224251c;
                if (l4 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindLong(3, l4.longValue());
                }
                String str26 = aVar.f224249a;
                if (str26 == null) {
                    sQLiteStatement.bindNull(4);
                    return;
                } else {
                    sQLiteStatement.bindText(4, str26);
                    return;
                }
            case 3:
                gge.a aVar2 = (gge.a) obj2;
                String str27 = aVar2.f143676a;
                if (str27 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str27);
                }
                String str28 = aVar2.f143677b;
                if (str28 == null) {
                    sQLiteStatement.bindNull(2);
                    return;
                } else {
                    sQLiteStatement.bindText(2, str28);
                    return;
                }
            case 4:
                String str29 = ((hi9.k) obj2).f152550a;
                if (str29 == null) {
                    sQLiteStatement.bindNull(1);
                    return;
                } else {
                    sQLiteStatement.bindText(1, str29);
                    return;
                }
            case 5:
                String str30 = ((gpk.a) obj2).f145455a;
                if (str30 == null) {
                    sQLiteStatement.bindNull(1);
                    return;
                } else {
                    sQLiteStatement.bindText(1, str30);
                    return;
                }
            case 6:
                mqj.a aVar3 = (mqj.a) obj2;
                sQLiteStatement.bindLong(1, aVar3.f208010a);
                String str31 = aVar3.f208011b;
                if (str31 == null) {
                    sQLiteStatement.bindNull(2);
                    return;
                } else {
                    sQLiteStatement.bindText(2, str31);
                    return;
                }
            case 7:
                mqj.a aVar4 = (mqj.a) obj2;
                sQLiteStatement.bindLong(1, aVar4.f208010a);
                String str32 = aVar4.f208011b;
                if (str32 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str32);
                }
                sQLiteStatement.bindLong(3, aVar4.f208012c);
                sQLiteStatement.bindLong(4, aVar4.f208010a);
                if (str32 == null) {
                    sQLiteStatement.bindNull(5);
                    return;
                } else {
                    sQLiteStatement.bindText(5, str32);
                    return;
                }
            case 8:
                n91.c cVar = (n91.c) obj2;
                String str33 = cVar.f213533a;
                String str34 = cVar.f213534b;
                if (str33 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str33);
                }
                if (str34 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str34);
                }
                String str35 = cVar.f213535c;
                if (str35 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, str35);
                }
                String str36 = cVar.d;
                if (str36 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, str36);
                }
                String str37 = cVar.f213533a;
                if (str37 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, str37);
                }
                if (str34 == null) {
                    sQLiteStatement.bindNull(6);
                    return;
                } else {
                    sQLiteStatement.bindText(6, str34);
                    return;
                }
            case 9:
                String str38 = ((n91.a) obj2).f213523a;
                if (str38 == null) {
                    sQLiteStatement.bindNull(1);
                    return;
                } else {
                    sQLiteStatement.bindText(1, str38);
                    return;
                }
            case 10:
                String str39 = ((n91.d) obj2).f213536a;
                if (str39 == null) {
                    sQLiteStatement.bindNull(1);
                    return;
                } else {
                    sQLiteStatement.bindText(1, str39);
                    return;
                }
            case 11:
                n91.c cVar2 = (n91.c) obj2;
                String str40 = cVar2.f213533a;
                if (str40 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str40);
                }
                String str41 = cVar2.f213534b;
                if (str41 == null) {
                    sQLiteStatement.bindNull(2);
                    return;
                } else {
                    sQLiteStatement.bindText(2, str41);
                    return;
                }
            case 12:
                n91.a aVar5 = (n91.a) obj2;
                String str42 = aVar5.f213523a;
                if (str42 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str42);
                }
                String str43 = aVar5.f213524b;
                if (str43 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str43);
                }
                sQLiteStatement.bindLong(3, aVar5.f213525c);
                String str44 = aVar5.d;
                if (str44 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, str44);
                }
                String str45 = aVar5.e;
                if (str45 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, str45);
                }
                String str46 = aVar5.f;
                if (str46 == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, str46);
                }
                String str47 = aVar5.f213526g;
                if (str47 == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindText(7, str47);
                }
                String str48 = aVar5.f213527h;
                if (str48 == null) {
                    sQLiteStatement.bindNull(8);
                } else {
                    sQLiteStatement.bindText(8, str48);
                }
                String str49 = aVar5.i;
                if (str49 == null) {
                    sQLiteStatement.bindNull(9);
                } else {
                    sQLiteStatement.bindText(9, str49);
                }
                String str50 = aVar5.f213523a;
                if (str50 == null) {
                    sQLiteStatement.bindNull(10);
                    return;
                } else {
                    sQLiteStatement.bindText(10, str50);
                    return;
                }
            case 13:
                n91.d dVar = (n91.d) obj2;
                String str51 = dVar.f213536a;
                if (str51 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str51);
                }
                String str52 = dVar.f213537b;
                if (str52 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str52);
                }
                sQLiteStatement.bindLong(3, dVar.f213538c);
                String str53 = dVar.d;
                if (str53 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, str53);
                }
                String str54 = dVar.e;
                if (str54 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, str54);
                }
                String str55 = dVar.f;
                if (str55 == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, str55);
                }
                String str56 = dVar.f213539g;
                if (str56 == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindText(7, str56);
                }
                String str57 = dVar.f213540h;
                if (str57 == null) {
                    sQLiteStatement.bindNull(8);
                } else {
                    sQLiteStatement.bindText(8, str57);
                }
                String str58 = dVar.i;
                if (str58 == null) {
                    sQLiteStatement.bindNull(9);
                } else {
                    sQLiteStatement.bindText(9, str58);
                }
                String str59 = dVar.f213541j;
                if (str59 == null) {
                    sQLiteStatement.bindNull(10);
                } else {
                    sQLiteStatement.bindText(10, str59);
                }
                String str60 = dVar.k;
                if (str60 == null) {
                    sQLiteStatement.bindNull(11);
                } else {
                    sQLiteStatement.bindText(11, str60);
                }
                String str61 = dVar.f213536a;
                if (str61 == null) {
                    sQLiteStatement.bindNull(12);
                    return;
                } else {
                    sQLiteStatement.bindText(12, str61);
                    return;
                }
            case 14:
                String str62 = ((p1f.a) obj2).f231897a;
                if (str62 == null) {
                    sQLiteStatement.bindNull(1);
                    return;
                } else {
                    sQLiteStatement.bindText(1, str62);
                    return;
                }
            case 15:
                ((pq2.b) obj2).getClass();
                sQLiteStatement.bindNull(1);
                return;
            case 16:
                ((pq2.a) obj2).getClass();
                sQLiteStatement.bindNull(1);
                return;
            case 17:
                stg.b bVar = (stg.b) obj2;
                String str63 = bVar.f265584a;
                if (str63 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str63);
                }
                String str64 = bVar.f265585b;
                if (str64 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str64);
                }
                String str65 = bVar.f265586c;
                if (str65 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, str65);
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
                String str66 = bVar.f;
                if (str66 == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, str66);
                }
                String str67 = bVar.f265587g;
                if (str67 == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindText(7, str67);
                }
                String str68 = bVar.f265588h;
                if (str68 == null) {
                    sQLiteStatement.bindNull(8);
                } else {
                    sQLiteStatement.bindText(8, str68);
                }
                stg.c cVar3 = bVar.i;
                if (cVar3 != null) {
                    strK = GsonHolder.a().k(cVar3);
                    Intrinsics.checkNotNullExpressionValue(strK, "toJson(...)");
                } else {
                    strK = null;
                }
                if (strK == null) {
                    sQLiteStatement.bindNull(9);
                } else {
                    sQLiteStatement.bindText(9, strK);
                }
                String strA3 = ttg.a.a(bVar.f265589j);
                if (strA3 == null) {
                    sQLiteStatement.bindNull(10);
                } else {
                    sQLiteStatement.bindText(10, strA3);
                }
                String strA4 = ttg.a.a(bVar.k);
                if (strA4 == null) {
                    sQLiteStatement.bindNull(11);
                } else {
                    sQLiteStatement.bindText(11, strA4);
                }
                sQLiteStatement.bindLong(12, bVar.f265590l ? 1L : 0L);
                String strH = b21.a.h(bVar.f265591m);
                if (strH == null) {
                    sQLiteStatement.bindNull(13);
                } else {
                    sQLiteStatement.bindText(13, strH);
                }
                String str69 = bVar.f265584a;
                if (str69 == null) {
                    sQLiteStatement.bindNull(14);
                    return;
                } else {
                    sQLiteStatement.bindText(14, str69);
                    return;
                }
            case 18:
                String str70 = ((tx1.j) obj2).f275316b;
                if (str70 == null) {
                    sQLiteStatement.bindNull(1);
                    return;
                } else {
                    sQLiteStatement.bindText(1, str70);
                    return;
                }
            case 19:
                String str71 = ((v69.b) obj2).f286335a;
                if (str71 == null) {
                    sQLiteStatement.bindNull(1);
                    return;
                } else {
                    sQLiteStatement.bindText(1, str71);
                    return;
                }
            case 20:
                v69.b bVar2 = (v69.b) obj2;
                String str72 = bVar2.f286335a;
                if (str72 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str72);
                }
                String str73 = bVar2.f286336b;
                if (str73 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str73);
                }
                Long lB = b21.a.b(bVar2.f286337c);
                if (lB == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindLong(3, lB.longValue());
                }
                String str74 = bVar2.d;
                if (str74 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, str74);
                }
                String str75 = bVar2.e;
                if (str75 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, str75);
                }
                String str76 = bVar2.f;
                if (str76 == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, str76);
                }
                String str77 = bVar2.f286338g;
                if (str77 == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindText(7, str77);
                }
                String str78 = bVar2.f286339h;
                if (str78 == null) {
                    sQLiteStatement.bindNull(8);
                } else {
                    sQLiteStatement.bindText(8, str78);
                }
                if (bVar2.i == null) {
                    sQLiteStatement.bindNull(9);
                } else {
                    sQLiteStatement.bindLong(9, r0.intValue());
                }
                List items = bVar2.k;
                Intrinsics.checkNotNullParameter(items, "items");
                String strK3 = GsonHolder.a().k(items);
                Intrinsics.checkNotNullExpressionValue(strK3, "toJson(...)");
                if (strK3 == null) {
                    sQLiteStatement.bindNull(10);
                } else {
                    sQLiteStatement.bindText(10, strK3);
                }
                String str79 = bVar2.f286341l;
                if (str79 == null) {
                    sQLiteStatement.bindNull(11);
                } else {
                    sQLiteStatement.bindText(11, str79);
                }
                String str80 = bVar2.f286342m;
                if (str80 == null) {
                    sQLiteStatement.bindNull(12);
                } else {
                    sQLiteStatement.bindText(12, str80);
                }
                v69.c cVar4 = bVar2.f286340j;
                if (cVar4 != null) {
                    String str81 = cVar4.f286343a;
                    if (str81 == null) {
                        sQLiteStatement.bindNull(13);
                    } else {
                        sQLiteStatement.bindText(13, str81);
                    }
                    String str82 = cVar4.f286344b;
                    if (str82 == null) {
                        sQLiteStatement.bindNull(14);
                    } else {
                        sQLiteStatement.bindText(14, str82);
                    }
                    String str83 = cVar4.f286345c;
                    if (str83 == null) {
                        sQLiteStatement.bindNull(15);
                    } else {
                        sQLiteStatement.bindText(15, str83);
                    }
                    String str84 = cVar4.d;
                    if (str84 == null) {
                        sQLiteStatement.bindNull(16);
                    } else {
                        sQLiteStatement.bindText(16, str84);
                    }
                } else {
                    prk.o.z(sQLiteStatement, 13, 14, 15, 16);
                }
                String str85 = bVar2.f286335a;
                if (str85 == null) {
                    sQLiteStatement.bindNull(17);
                    return;
                } else {
                    sQLiteStatement.bindText(17, str85);
                    return;
                }
            case 21:
                String str86 = ((ysj.k) obj2).f316487a;
                if (str86 == null) {
                    sQLiteStatement.bindNull(1);
                    return;
                } else {
                    sQLiteStatement.bindText(1, str86);
                    return;
                }
            case 22:
                String str87 = ((ysj.g) obj2).f316477a;
                if (str87 == null) {
                    sQLiteStatement.bindNull(1);
                    return;
                } else {
                    sQLiteStatement.bindText(1, str87);
                    return;
                }
            case 23:
                String str88 = ((y8l.h) obj2).f311676a;
                if (str88 == null) {
                    sQLiteStatement.bindNull(1);
                    return;
                } else {
                    sQLiteStatement.bindText(1, str88);
                    return;
                }
            case 24:
                String str89 = ((arj.a) obj2).f8719a;
                if (str89 == null) {
                    sQLiteStatement.bindNull(1);
                    return;
                } else {
                    sQLiteStatement.bindText(1, str89);
                    return;
                }
            case 25:
                arj.a aVar6 = (arj.a) obj2;
                String str90 = aVar6.f8719a;
                if (str90 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str90);
                }
                String str91 = aVar6.f8720b;
                if (str91 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str91);
                }
                sQLiteStatement.bindLong(3, aVar6.f8721c);
                String str92 = aVar6.d;
                if (str92 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, str92);
                }
                String str93 = aVar6.e;
                if (str93 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, str93);
                }
                String str94 = aVar6.f;
                if (str94 == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, str94);
                }
                String str95 = aVar6.f8722g;
                if (str95 == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindText(7, str95);
                }
                String str96 = aVar6.f8723h;
                if (str96 == null) {
                    sQLiteStatement.bindNull(8);
                } else {
                    sQLiteStatement.bindText(8, str96);
                }
                String str97 = aVar6.f8719a;
                if (str97 == null) {
                    sQLiteStatement.bindNull(9);
                    return;
                } else {
                    sQLiteStatement.bindText(9, str97);
                    return;
                }
            case 26:
                throw a10.b.m(obj2);
            case 27:
                throw a10.b.m(obj2);
            default:
                String str98 = ((aid.a) obj2).f5231a;
                if (str98 == null) {
                    sQLiteStatement.bindNull(1);
                    return;
                } else {
                    sQLiteStatement.bindText(1, str98);
                    return;
                }
        }
    }

    @Override // androidx.room.EntityDeleteOrUpdateAdapter
    public final String createQuery() {
        switch (this.f113019a) {
            case 0:
                return "UPDATE OR REPLACE `instruments` SET `id` = ?,`ref` = ?,`type` = ?,`name` = ?,`symbol` = ?,`stateDetails` = ?,`requiredProducts` = ?,`typeSpecificProperties` = ?,`currency` = ?,`sortOrder` = ?,`isin` = ?,`exchange` = ?,`shortOverview` = ?,`quantityDecimalPlaces` = ?,`priceDecimalPlaces` = ?,`allSymbols` = ?,`underlying_currency` = ?,`promotion_campaigns` = ?,`list_status` = ?,`state_reason` = ?,`delist_date` = ? WHERE `id` = ?";
            case 1:
                return "UPDATE `instruments` SET `id` = ?,`ref` = ?,`type` = ?,`name` = ?,`symbol` = ?,`stateDetails` = ?,`requiredProducts` = ?,`typeSpecificProperties` = ?,`currency` = ?,`sortOrder` = ?,`isin` = ?,`exchange` = ?,`shortOverview` = ?,`quantityDecimalPlaces` = ?,`priceDecimalPlaces` = ?,`allSymbols` = ?,`underlying_currency` = ?,`promotion_campaigns` = ?,`list_status` = ?,`state_reason` = ?,`delist_date` = ? WHERE `id` = ?";
            case 2:
                return "UPDATE OR ABORT `portfolioSettings` SET `portfolioId` = ?,`stockBuyBlockState` = ?,`stockBuyBlockDeactivationTime` = ? WHERE `portfolioId` = ?";
            case 3:
                return "DELETE FROM `account_notification_info` WHERE `accountId` = ? AND `productId` = ?";
            case 4:
                return "DELETE FROM `plans` WHERE `id` = ?";
            case 5:
                return "DELETE FROM `rates_alerts` WHERE `id` = ?";
            case 6:
                return "DELETE FROM `balance_history` WHERE `date` = ? AND `source` = ?";
            case 7:
                return "UPDATE OR ABORT `balance_history` SET `date` = ?,`source` = ?,`balance` = ? WHERE `date` = ? AND `source` = ?";
            case 8:
                return "UPDATE OR ABORT `pae_payment_required_attributes_table` SET `id` = ?,`paymentId` = ?,`title` = ?,`description` = ? WHERE `id` = ? AND `paymentId` = ?";
            case 9:
                return "DELETE FROM `pae_direct_debits_table` WHERE `id` = ?";
            case 10:
                return "DELETE FROM `pae_scheduled_payments_table` WHERE `id` = ?";
            case 11:
                return "DELETE FROM `pae_payment_required_attributes_table` WHERE `id` = ? AND `paymentId` = ?";
            case 12:
                return "UPDATE OR ABORT `pae_direct_debits_table` SET `id` = ?,`name` = ?,`amount` = ?,`currency` = ?,`date` = ?,`logoUrl` = ?,`type` = ?,`state` = ?,`sentDate` = ? WHERE `id` = ?";
            case 13:
                return "UPDATE OR ABORT `pae_scheduled_payments_table` SET `id` = ?,`name` = ?,`amount` = ?,`currency` = ?,`date` = ?,`logoUrl` = ?,`frequency` = ?,`iban` = ?,`reference` = ?,`state` = ?,`sentDate` = ? WHERE `id` = ?";
            case 14:
                return "DELETE FROM `trade_rev_points_accounts` WHERE `id` = ?";
            case 15:
                return "DELETE FROM `banners_keys` WHERE `id` = ?";
            case 16:
                return "DELETE FROM `banners` WHERE `id` = ?";
            case 17:
                return "UPDATE OR ABORT `account_closure_progress` SET `id` = ?,`state` = ?,`portfolioId` = ?,`createdDate` = ?,`updatedDate` = ?,`source` = ?,`tradingLegalEntityId` = ?,`reason` = ?,`currentStep` = ?,`pendingSteps` = ?,`completedSteps` = ?,`blocked` = ?,`estimatedCompletionDate` = ? WHERE `id` = ?";
            case 18:
                return "DELETE FROM `bizum_contacts` WHERE `idValue` = ?";
            case 19:
                return "DELETE FROM `inbox_item` WHERE `id` = ?";
            case 20:
                return "UPDATE OR ABORT `inbox_item` SET `id` = ?,`type` = ?,`createdDate` = ?,`state` = ?,`title` = ?,`subtitle` = ?,`icon` = ?,`deeplink` = ?,`viewCount` = ?,`buttons` = ?,`asset` = ?,`body` = ?,`messageId` = ?,`campaignId` = ?,`pushId` = ?,`tileId` = ? WHERE `id` = ?";
            case 21:
                return "DELETE FROM `income_sorter_executions` WHERE `id` = ?";
            case 22:
                return "DELETE FROM `income_sorters` WHERE `id` = ?";
            case 23:
                return "DELETE FROM `money_requests` WHERE `id` = ?";
            case 24:
                return "DELETE FROM `budget_entity` WHERE `id` = ?";
            case 25:
                return "UPDATE OR ABORT `budget_entity` SET `id` = ?,`type` = ?,`amount` = ?,`walletId` = ?,`currency` = ?,`startDate` = ?,`endDate` = ?,`categoryTag` = ? WHERE `id` = ?";
            case 26:
                return "DELETE FROM `cached_budget` WHERE `categoryTag` = ?";
            case 27:
                return "UPDATE OR ABORT `cached_budget` SET `categoryTag` = ?,`amount` = ?,`currency` = ? WHERE `categoryTag` = ?";
            default:
                return "DELETE FROM `shops_brand_recent_search` WHERE `query` = ?";
        }
    }

    public /* synthetic */ g0(Object obj2, int i) {
        this.f113019a = i;
    }
}
