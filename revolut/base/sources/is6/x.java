package is6;

import androidx.room.EntityInsertAdapter;
import androidx.sqlite.SQLiteStatement;
import com.revolut.data.database.models.transaction.CryptoCounterpartyAddressEmbeddedEntity;
import com.revolut.data.database.models.transaction.CryptoCounterpartyDetailsEmbeddedEntity;
import com.revolut.data.database.models.transaction.CryptoCounterpartyEmbeddedEntity;
import com.revolut.data.utils.gson.GsonHolder;
import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ks6.a0;
import ks6.f0;
import ks6.h0;
import ks6.i0;
import ks6.j0;
import ks6.m0;
import ks6.n0;
import n3f.c0;
import nif.d1;
import nif.l2;
import nif.m2;
import o45.d2;
import o45.e2;
import org.joda.time.DateTime;
import zhm.d0;

/* JADX INFO: loaded from: classes3.dex */
public final class x extends EntityInsertAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f168145a;

    public /* synthetic */ x(int i) {
        this.f168145a = i;
    }

    private final void a(SQLiteStatement sQLiteStatement, Object obj2) {
        n91.b bVar = (n91.b) obj2;
        String str = bVar.f213528a;
        if (str == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, str);
        }
        String str2 = bVar.f213529b;
        if (str2 == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindText(2, str2);
        }
        sQLiteStatement.bindLong(3, bVar.f213530c);
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
        String str6 = bVar.f213531g;
        if (str6 == null) {
            sQLiteStatement.bindNull(7);
        } else {
            sQLiteStatement.bindText(7, str6);
        }
        String str7 = bVar.f213532h;
        if (str7 == null) {
            sQLiteStatement.bindNull(8);
        } else {
            sQLiteStatement.bindText(8, str7);
        }
        String str8 = bVar.i;
        if (str8 == null) {
            sQLiteStatement.bindNull(9);
        } else {
            sQLiteStatement.bindText(9, str8);
        }
    }

    private final void b(SQLiteStatement sQLiteStatement, Object obj2) {
        n91.c cVar = (n91.c) obj2;
        String str = cVar.f213533a;
        if (str == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, str);
        }
        String str2 = cVar.f213534b;
        if (str2 == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindText(2, str2);
        }
        String str3 = cVar.f213535c;
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
    }

    private final void c(SQLiteStatement sQLiteStatement, Object obj2) {
        n91.e eVar = (n91.e) obj2;
        String str = eVar.f213542a;
        if (str == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, str);
        }
        String str2 = eVar.f213543b;
        if (str2 == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindText(2, str2);
        }
        String str3 = eVar.f213544c;
        if (str3 == null) {
            sQLiteStatement.bindNull(3);
        } else {
            sQLiteStatement.bindText(3, str3);
        }
    }

    private final void d(SQLiteStatement sQLiteStatement, Object obj2) {
        l2 l2Var = (l2) obj2;
        String str = l2Var.f215927a;
        if (str == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, str);
        }
        String str2 = l2Var.f215928b;
        if (str2 == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindText(2, str2);
        }
    }

    private final void e(SQLiteStatement sQLiteStatement, Object obj2) {
        m2 m2Var = (m2) obj2;
        String str = m2Var.f215938a;
        if (str == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, str);
        }
        Long l2 = m2Var.f215939b;
        if (l2 == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindLong(2, l2.longValue());
        }
        String str2 = m2Var.f215940c;
        if (str2 == null) {
            sQLiteStatement.bindNull(3);
        } else {
            sQLiteStatement.bindText(3, str2);
        }
    }

    private final void f(SQLiteStatement sQLiteStatement, Object obj2) {
        d2 d2Var = (d2) obj2;
        String str = d2Var.f222038a;
        if (str == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, str);
        }
        String str2 = d2Var.f222039b;
        if (str2 == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindText(2, str2);
        }
        String str3 = d2Var.f222040c;
        if (str3 == null) {
            sQLiteStatement.bindNull(3);
        } else {
            sQLiteStatement.bindText(3, str3);
        }
        String str4 = d2Var.d;
        if (str4 == null) {
            sQLiteStatement.bindNull(4);
        } else {
            sQLiteStatement.bindText(4, str4);
        }
        String str5 = d2Var.e;
        if (str5 == null) {
            sQLiteStatement.bindNull(5);
        } else {
            sQLiteStatement.bindText(5, str5);
        }
        String str6 = d2Var.f;
        if (str6 == null) {
            sQLiteStatement.bindNull(6);
        } else {
            sQLiteStatement.bindText(6, str6);
        }
    }

    private final void g(SQLiteStatement sQLiteStatement, Object obj2) {
        e2 e2Var = (e2) obj2;
        String str = e2Var.f222043a;
        if (str == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, str);
        }
        sQLiteStatement.bindLong(2, e2Var.f222044b);
    }

    private final void h(SQLiteStatement sQLiteStatement, Object obj2) {
        o4d.c cVar = (o4d.c) obj2;
        String str = cVar.f222195a;
        if (str == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, str);
        }
        String str2 = cVar.f222196b;
        if (str2 == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindText(2, str2);
        }
        String str3 = cVar.f222197c;
        if (str3 == null) {
            sQLiteStatement.bindNull(3);
        } else {
            sQLiteStatement.bindText(3, str3);
        }
        DateTime dateTime = cVar.d;
        Long lValueOf = dateTime != null ? Long.valueOf(dateTime.getMillis()) : null;
        if (lValueOf == null) {
            sQLiteStatement.bindNull(4);
        } else {
            sQLiteStatement.bindLong(4, lValueOf.longValue());
        }
        String str4 = cVar.e;
        if (str4 == null) {
            sQLiteStatement.bindNull(5);
        } else {
            sQLiteStatement.bindText(5, str4);
        }
    }

    private final void i(SQLiteStatement sQLiteStatement, Object obj2) {
        o4d.c cVar = (o4d.c) obj2;
        String str = cVar.f222195a;
        if (str == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, str);
        }
        String str2 = cVar.f222196b;
        if (str2 == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindText(2, str2);
        }
        String str3 = cVar.f222197c;
        if (str3 == null) {
            sQLiteStatement.bindNull(3);
        } else {
            sQLiteStatement.bindText(3, str3);
        }
        DateTime dateTime = cVar.d;
        Long lValueOf = dateTime != null ? Long.valueOf(dateTime.getMillis()) : null;
        if (lValueOf == null) {
            sQLiteStatement.bindNull(4);
        } else {
            sQLiteStatement.bindLong(4, lValueOf.longValue());
        }
        String str4 = cVar.e;
        if (str4 == null) {
            sQLiteStatement.bindNull(5);
        } else {
            sQLiteStatement.bindText(5, str4);
        }
    }

    private final void j(SQLiteStatement sQLiteStatement, Object obj2) {
        o4d.e eVar = (o4d.e) obj2;
        String str = eVar.f222201a;
        if (str == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, str);
        }
        String str2 = eVar.f222202b;
        if (str2 == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindText(2, str2);
        }
        sQLiteStatement.bindLong(3, eVar.f222203c ? 1L : 0L);
        sQLiteStatement.bindLong(4, eVar.d);
    }

    private final void k(SQLiteStatement sQLiteStatement, Object obj2) {
        Instant instant;
        o4d.d dVar = (o4d.d) obj2;
        String str = dVar.f222198a;
        if (str == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, str);
        }
        String str2 = dVar.f222199b;
        if (str2 == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindText(2, str2);
        }
        String str3 = dVar.f222200c;
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
        ZonedDateTime zonedDateTime = dVar.e;
        Long lValueOf = (zonedDateTime == null || (instant = zonedDateTime.toInstant()) == null) ? null : Long.valueOf(instant.toEpochMilli());
        if (lValueOf == null) {
            sQLiteStatement.bindNull(5);
        } else {
            sQLiteStatement.bindLong(5, lValueOf.longValue());
        }
        String str5 = dVar.f;
        if (str5 == null) {
            sQLiteStatement.bindNull(6);
        } else {
            sQLiteStatement.bindText(6, str5);
        }
    }

    private final void l(SQLiteStatement sQLiteStatement, Object obj2) {
        Instant instant;
        o4d.d dVar = (o4d.d) obj2;
        String str = dVar.f222198a;
        if (str == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, str);
        }
        String str2 = dVar.f222199b;
        if (str2 == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindText(2, str2);
        }
        String str3 = dVar.f222200c;
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
        ZonedDateTime zonedDateTime = dVar.e;
        Long lValueOf = (zonedDateTime == null || (instant = zonedDateTime.toInstant()) == null) ? null : Long.valueOf(instant.toEpochMilli());
        if (lValueOf == null) {
            sQLiteStatement.bindNull(5);
        } else {
            sQLiteStatement.bindLong(5, lValueOf.longValue());
        }
        String str5 = dVar.f;
        if (str5 == null) {
            sQLiteStatement.bindNull(6);
        } else {
            sQLiteStatement.bindText(6, str5);
        }
    }

    private final void m(SQLiteStatement sQLiteStatement, Object obj2) {
        String strK;
        String strK2;
        lbj.b bVar = (lbj.b) obj2;
        String str = bVar.f193690a;
        if (str == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, str);
        }
        String str2 = bVar.f193691b;
        if (str2 == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindText(2, str2);
        }
        lbj.e eVar = bVar.f193692c;
        String strK3 = null;
        if (eVar != null) {
            strK = GsonHolder.a().k(eVar);
            Intrinsics.checkNotNullExpressionValue(strK, "toJson(...)");
        } else {
            strK = null;
        }
        if (strK == null) {
            sQLiteStatement.bindNull(3);
        } else {
            sQLiteStatement.bindText(3, strK);
        }
        List list = bVar.d;
        String strK0 = list != null ? d0.k0(list, ",", null, null, 0, null, 62) : null;
        if (strK0 == null) {
            sQLiteStatement.bindNull(4);
        } else {
            sQLiteStatement.bindText(4, strK0);
        }
        lbj.c cVar = bVar.e;
        if (cVar != null) {
            strK2 = GsonHolder.a().k(cVar);
            Intrinsics.checkNotNullExpressionValue(strK2, "toJson(...)");
        } else {
            strK2 = null;
        }
        if (strK2 == null) {
            sQLiteStatement.bindNull(5);
        } else {
            sQLiteStatement.bindText(5, strK2);
        }
        lbj.a aVar = bVar.f193693g;
        if (aVar != null) {
            strK3 = GsonHolder.a().k(aVar);
            Intrinsics.checkNotNullExpressionValue(strK3, "toJson(...)");
        }
        if (strK3 == null) {
            sQLiteStatement.bindNull(6);
        } else {
            sQLiteStatement.bindText(6, strK3);
        }
        CryptoCounterpartyEmbeddedEntity cryptoCounterpartyEmbeddedEntity = bVar.f;
        if (cryptoCounterpartyEmbeddedEntity == null) {
            prk.o.z(sQLiteStatement, 7, 8, 9, 10);
            prk.o.z(sQLiteStatement, 11, 12, 13, 14);
            prk.o.z(sQLiteStatement, 15, 16, 17, 18);
            prk.o.z(sQLiteStatement, 19, 20, 21, 22);
            sQLiteStatement.bindNull(23);
            sQLiteStatement.bindNull(24);
            return;
        }
        if (cryptoCounterpartyEmbeddedEntity.getId() == null) {
            sQLiteStatement.bindNull(7);
        } else {
            sQLiteStatement.bindText(7, cryptoCounterpartyEmbeddedEntity.getId());
        }
        if (cryptoCounterpartyEmbeddedEntity.getAddress() == null) {
            sQLiteStatement.bindNull(8);
        } else {
            sQLiteStatement.bindText(8, cryptoCounterpartyEmbeddedEntity.getAddress());
        }
        if (cryptoCounterpartyEmbeddedEntity.getState() == null) {
            sQLiteStatement.bindNull(9);
        } else {
            sQLiteStatement.bindText(9, cryptoCounterpartyEmbeddedEntity.getState());
        }
        if (cryptoCounterpartyEmbeddedEntity.getHostingType() == null) {
            sQLiteStatement.bindNull(10);
        } else {
            sQLiteStatement.bindText(10, cryptoCounterpartyEmbeddedEntity.getHostingType());
        }
        if (cryptoCounterpartyEmbeddedEntity.getHostingVerification() == null) {
            sQLiteStatement.bindNull(11);
        } else {
            sQLiteStatement.bindText(11, cryptoCounterpartyEmbeddedEntity.getHostingVerification());
        }
        if (cryptoCounterpartyEmbeddedEntity.getHostingPlatform() == null) {
            sQLiteStatement.bindNull(12);
        } else {
            sQLiteStatement.bindText(12, cryptoCounterpartyEmbeddedEntity.getHostingPlatform());
        }
        if (cryptoCounterpartyEmbeddedEntity.getOwnershipState() == null) {
            sQLiteStatement.bindNull(13);
        } else {
            sQLiteStatement.bindText(13, cryptoCounterpartyEmbeddedEntity.getOwnershipState());
        }
        if (cryptoCounterpartyEmbeddedEntity.getOwnershipMethod() == null) {
            sQLiteStatement.bindNull(14);
        } else {
            sQLiteStatement.bindText(14, cryptoCounterpartyEmbeddedEntity.getOwnershipMethod());
        }
        String strN = b21.a.n(cryptoCounterpartyEmbeddedEntity.getOwnershipPayload());
        if (strN == null) {
            sQLiteStatement.bindNull(15);
        } else {
            sQLiteStatement.bindText(15, strN);
        }
        if (cryptoCounterpartyEmbeddedEntity.getUpdatedDate() == null) {
            sQLiteStatement.bindNull(16);
        } else {
            sQLiteStatement.bindLong(16, cryptoCounterpartyEmbeddedEntity.getUpdatedDate().longValue());
        }
        CryptoCounterpartyDetailsEmbeddedEntity details = cryptoCounterpartyEmbeddedEntity.getDetails();
        if (details == null) {
            prk.o.z(sQLiteStatement, 17, 18, 19, 20);
            prk.o.z(sQLiteStatement, 21, 22, 23, 24);
            return;
        }
        if (details.getType() == null) {
            sQLiteStatement.bindNull(17);
        } else {
            sQLiteStatement.bindText(17, details.getType());
        }
        if (details.getName() == null) {
            sQLiteStatement.bindNull(18);
        } else {
            sQLiteStatement.bindText(18, details.getName());
        }
        if (details.getSurname() == null) {
            sQLiteStatement.bindNull(19);
        } else {
            sQLiteStatement.bindText(19, details.getSurname());
        }
        if (details.getBusinessRegistrationNumber() == null) {
            sQLiteStatement.bindNull(20);
        } else {
            sQLiteStatement.bindText(20, details.getBusinessRegistrationNumber());
        }
        CryptoCounterpartyAddressEmbeddedEntity address = details.getAddress();
        if (address == null) {
            prk.o.z(sQLiteStatement, 21, 22, 23, 24);
            return;
        }
        if (address.getCountry() == null) {
            sQLiteStatement.bindNull(21);
        } else {
            sQLiteStatement.bindText(21, address.getCountry());
        }
        if (address.getCity() == null) {
            sQLiteStatement.bindNull(22);
        } else {
            sQLiteStatement.bindText(22, address.getCity());
        }
        if (address.getAddressLine1() == null) {
            sQLiteStatement.bindNull(23);
        } else {
            sQLiteStatement.bindText(23, address.getAddressLine1());
        }
        if (address.getAddressLine2() == null) {
            sQLiteStatement.bindNull(24);
        } else {
            sQLiteStatement.bindText(24, address.getAddressLine2());
        }
    }

    private final void n(SQLiteStatement sQLiteStatement, Object obj2) {
        pvg.d dVar = (pvg.d) obj2;
        String strA = pvg.t.a(dVar.f240102a);
        if (strA == null) {
            sQLiteStatement.bindNull(1);
        } else {
            sQLiteStatement.bindText(1, strA);
        }
        sQLiteStatement.bindLong(2, dVar.f240103b ? 1L : 0L);
        String str = dVar.f240104c;
        if (str == null) {
            sQLiteStatement.bindNull(3);
        } else {
            sQLiteStatement.bindText(3, str);
        }
        sQLiteStatement.bindText(4, dVar.d);
        String strO = b21.a.o(dVar.e);
        if (strO == null) {
            sQLiteStatement.bindNull(5);
        } else {
            sQLiteStatement.bindText(5, strO);
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
        String strK15;
        String strK16;
        String strK17;
        String strK18;
        String strK19;
        String strK20;
        String strK21;
        String strK22;
        String strK23;
        String strK24;
        String strK25;
        String strK26;
        String strK27;
        String strK28;
        String strK29;
        String strK30;
        String strK31;
        String strK32;
        String strK33;
        String strK34;
        String strK35;
        switch (this.f168145a) {
            case 0:
                ks6.x xVar = (ks6.x) obj2;
                String str = xVar.f189277a;
                if (str == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str);
                }
                String str2 = xVar.f189278b;
                if (str2 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str2);
                }
                String str3 = xVar.f189279c;
                if (str3 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, str3);
                }
                String str4 = xVar.d;
                if (str4 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, str4);
                }
                String str5 = xVar.e;
                if (str5 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, str5);
                }
                Long l2 = xVar.f;
                if (l2 == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindLong(6, l2.longValue());
                }
                Long l3 = xVar.f189280g;
                if (l3 == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindLong(7, l3.longValue());
                }
                Long l4 = xVar.f189281h;
                if (l4 == null) {
                    sQLiteStatement.bindNull(8);
                } else {
                    sQLiteStatement.bindLong(8, l4.longValue());
                }
                String str6 = xVar.i;
                if (str6 == null) {
                    sQLiteStatement.bindNull(9);
                } else {
                    sQLiteStatement.bindText(9, str6);
                }
                String str7 = xVar.f189282j;
                if (str7 == null) {
                    sQLiteStatement.bindNull(10);
                } else {
                    sQLiteStatement.bindText(10, str7);
                }
                String strB = js6.q.b(xVar.k);
                if (strB == null) {
                    sQLiteStatement.bindNull(11);
                } else {
                    sQLiteStatement.bindText(11, strB);
                }
                String strB2 = js6.q.b(xVar.f189283l);
                if (strB2 == null) {
                    sQLiteStatement.bindNull(12);
                } else {
                    sQLiteStatement.bindText(12, strB2);
                }
                String strB3 = js6.q.b(xVar.f189284m);
                if (strB3 == null) {
                    sQLiteStatement.bindNull(13);
                } else {
                    sQLiteStatement.bindText(13, strB3);
                }
                String str8 = xVar.f189285n;
                if (str8 == null) {
                    sQLiteStatement.bindNull(14);
                } else {
                    sQLiteStatement.bindText(14, str8);
                }
                ks6.w wVar = xVar.o;
                String strK36 = null;
                if (wVar != null) {
                    strK = GsonHolder.a().k(wVar);
                    Intrinsics.checkNotNullExpressionValue(strK, "toJson(...)");
                } else {
                    strK = null;
                }
                if (strK == null) {
                    sQLiteStatement.bindNull(15);
                } else {
                    sQLiteStatement.bindText(15, strK);
                }
                a0 a0Var = xVar.f189286p;
                if (a0Var != null) {
                    strK2 = GsonHolder.a().k(a0Var);
                    Intrinsics.checkNotNullExpressionValue(strK2, "toJson(...)");
                } else {
                    strK2 = null;
                }
                if (strK2 == null) {
                    sQLiteStatement.bindNull(16);
                } else {
                    sQLiteStatement.bindText(16, strK2);
                }
                ks6.z zVar = xVar.f189287q;
                if (zVar != null) {
                    strK3 = GsonHolder.a().k(zVar);
                    Intrinsics.checkNotNullExpressionValue(strK3, "toJson(...)");
                } else {
                    strK3 = null;
                }
                if (strK3 == null) {
                    sQLiteStatement.bindNull(17);
                } else {
                    sQLiteStatement.bindText(17, strK3);
                }
                String strB4 = js6.p.b(xVar.f189288r);
                if (strB4 == null) {
                    sQLiteStatement.bindNull(18);
                } else {
                    sQLiteStatement.bindText(18, strB4);
                }
                String strB5 = js6.p.b(xVar.f189289s);
                if (strB5 == null) {
                    sQLiteStatement.bindNull(19);
                } else {
                    sQLiteStatement.bindText(19, strB5);
                }
                List list = xVar.f189290t;
                String strR = list != null ? com.revolut.data.database.models.openbanking.d.r("toJson(...)", list) : null;
                if (strR == null) {
                    sQLiteStatement.bindNull(20);
                } else {
                    sQLiteStatement.bindText(20, strR);
                }
                List list2 = xVar.u;
                String strR2 = list2 != null ? com.revolut.data.database.models.openbanking.d.r("toJson(...)", list2) : null;
                if (strR2 == null) {
                    sQLiteStatement.bindNull(21);
                } else {
                    sQLiteStatement.bindText(21, strR2);
                }
                String str9 = xVar.v;
                if (str9 == null) {
                    sQLiteStatement.bindNull(22);
                } else {
                    sQLiteStatement.bindText(22, str9);
                }
                String str10 = xVar.f189291w;
                if (str10 == null) {
                    sQLiteStatement.bindNull(23);
                } else {
                    sQLiteStatement.bindText(23, str10);
                }
                String str11 = xVar.f189292x;
                if (str11 == null) {
                    sQLiteStatement.bindNull(24);
                } else {
                    sQLiteStatement.bindText(24, str11);
                }
                n0 n0Var = xVar.f189293y;
                if (n0Var != null) {
                    strK4 = GsonHolder.a().k(n0Var);
                    Intrinsics.checkNotNullExpressionValue(strK4, "toJson(...)");
                } else {
                    strK4 = null;
                }
                if (strK4 == null) {
                    sQLiteStatement.bindNull(25);
                } else {
                    sQLiteStatement.bindText(25, strK4);
                }
                String str12 = xVar.z;
                if (str12 == null) {
                    sQLiteStatement.bindNull(26);
                } else {
                    sQLiteStatement.bindText(26, str12);
                }
                f0 f0Var = xVar.A;
                if (f0Var != null) {
                    strK36 = GsonHolder.a().k(f0Var);
                    Intrinsics.checkNotNullExpressionValue(strK36, "toJson(...)");
                }
                if (strK36 == null) {
                    sQLiteStatement.bindNull(27);
                    return;
                } else {
                    sQLiteStatement.bindText(27, strK36);
                    return;
                }
            case 1:
                i0 i0Var = (i0) obj2;
                String str13 = i0Var.f189161a;
                if (str13 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str13);
                }
                String str14 = i0Var.f189162b;
                if (str14 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str14);
                }
                String str15 = i0Var.f189163c;
                if (str15 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, str15);
                }
                String str16 = i0Var.d;
                if (str16 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, str16);
                }
                String str17 = i0Var.e;
                if (str17 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, str17);
                }
                String str18 = i0Var.f;
                if (str18 == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, str18);
                }
                j0 j0Var = i0Var.f189165h;
                if (j0Var != null) {
                    strK5 = GsonHolder.a().k(j0Var);
                    Intrinsics.checkNotNullExpressionValue(strK5, "toJson(...)");
                } else {
                    strK5 = null;
                }
                if (strK5 == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindText(7, strK5);
                }
                String str19 = i0Var.i;
                if (str19 == null) {
                    sQLiteStatement.bindNull(8);
                } else {
                    sQLiteStatement.bindText(8, str19);
                }
                sQLiteStatement.bindLong(9, i0Var.f189166j);
                String str20 = i0Var.k;
                if (str20 == null) {
                    sQLiteStatement.bindNull(10);
                } else {
                    sQLiteStatement.bindText(10, str20);
                }
                String str21 = i0Var.o;
                if (str21 == null) {
                    sQLiteStatement.bindNull(11);
                } else {
                    sQLiteStatement.bindText(11, str21);
                }
                String str22 = i0Var.f189170p;
                if (str22 == null) {
                    sQLiteStatement.bindNull(12);
                } else {
                    sQLiteStatement.bindText(12, str22);
                }
                List list3 = i0Var.f189171q;
                String strR3 = list3 != null ? com.revolut.data.database.models.openbanking.d.r("toJson(...)", list3) : null;
                if (strR3 == null) {
                    sQLiteStatement.bindNull(13);
                } else {
                    sQLiteStatement.bindText(13, strR3);
                }
                List list4 = i0Var.f189172r;
                String strR4 = list4 != null ? com.revolut.data.database.models.openbanking.d.r("toJson(...)", list4) : null;
                if (strR4 == null) {
                    sQLiteStatement.bindNull(14);
                } else {
                    sQLiteStatement.bindText(14, strR4);
                }
                m0 m0Var = i0Var.f189173s;
                if (m0Var != null) {
                    strK6 = GsonHolder.a().k(m0Var);
                    Intrinsics.checkNotNullExpressionValue(strK6, "toJson(...)");
                } else {
                    strK6 = null;
                }
                if (strK6 == null) {
                    sQLiteStatement.bindNull(15);
                } else {
                    sQLiteStatement.bindText(15, strK6);
                }
                List list5 = i0Var.f189174t;
                String strR5 = list5 != null ? com.revolut.data.database.models.openbanking.d.r("toJson(...)", list5) : null;
                if (strR5 == null) {
                    sQLiteStatement.bindNull(16);
                } else {
                    sQLiteStatement.bindText(16, strR5);
                }
                List list6 = i0Var.u;
                String strR6 = list6 != null ? com.revolut.data.database.models.openbanking.d.r("toJson(...)", list6) : null;
                if (strR6 == null) {
                    sQLiteStatement.bindNull(17);
                } else {
                    sQLiteStatement.bindText(17, strR6);
                }
                sQLiteStatement.bindLong(18, i0Var.v);
                sQLiteStatement.bindLong(19, i0Var.f189175w);
                sQLiteStatement.bindLong(20, i0Var.f189176x);
                String strB6 = js6.p.b(i0Var.f189177y);
                if (strB6 == null) {
                    sQLiteStatement.bindNull(21);
                } else {
                    sQLiteStatement.bindText(21, strB6);
                }
                h0 h0Var = i0Var.f189164g;
                if (h0Var != null) {
                    String str23 = h0Var.f189155a;
                    if (str23 == null) {
                        sQLiteStatement.bindNull(22);
                    } else {
                        sQLiteStatement.bindText(22, str23);
                    }
                    String str24 = h0Var.f189156b;
                    if (str24 == null) {
                        sQLiteStatement.bindNull(23);
                    } else {
                        sQLiteStatement.bindText(23, str24);
                    }
                    String str25 = h0Var.f189157c;
                    if (str25 == null) {
                        sQLiteStatement.bindNull(24);
                    } else {
                        sQLiteStatement.bindText(24, str25);
                    }
                } else {
                    prk.o.y(sQLiteStatement, 22, 23, 24);
                }
                jo3.b bVar = i0Var.f189167l;
                if (bVar == null) {
                    sQLiteStatement.bindNull(25);
                    sQLiteStatement.bindNull(26);
                } else if (a10.b.v(bVar, sQLiteStatement, 25) == null) {
                    sQLiteStatement.bindNull(26);
                } else {
                    sQLiteStatement.bindText(26, bVar.getCurrency());
                }
                jo3.b bVar2 = i0Var.f189168m;
                if (bVar2 == null) {
                    sQLiteStatement.bindNull(27);
                    sQLiteStatement.bindNull(28);
                } else if (a10.b.v(bVar2, sQLiteStatement, 27) == null) {
                    sQLiteStatement.bindNull(28);
                } else {
                    sQLiteStatement.bindText(28, bVar2.getCurrency());
                }
                jo3.b bVar3 = i0Var.f189169n;
                if (bVar3 == null) {
                    sQLiteStatement.bindNull(29);
                    sQLiteStatement.bindNull(30);
                    return;
                } else if (a10.b.v(bVar3, sQLiteStatement, 29) == null) {
                    sQLiteStatement.bindNull(30);
                    return;
                } else {
                    sQLiteStatement.bindText(30, bVar3.getCurrency());
                    return;
                }
            case 2:
                c0 c0Var = (c0) obj2;
                String str26 = c0Var.f212017a;
                if (str26 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str26);
                }
                String str27 = c0Var.f212018b;
                if (str27 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str27);
                }
                String str28 = c0Var.f212019c;
                if (str28 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, str28);
                }
                String str29 = c0Var.d;
                if (str29 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, str29);
                }
                String str30 = c0Var.e;
                if (str30 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, str30);
                }
                Long l5 = c0Var.f;
                if (l5 == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindLong(6, l5.longValue());
                }
                Long l22 = c0Var.f212020g;
                if (l22 == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindLong(7, l22.longValue());
                }
                sQLiteStatement.bindLong(8, c0Var.f212021h);
                n3f.y yVar = c0Var.i;
                if (yVar != null) {
                    strK7 = f3f.a.a().k(yVar);
                    Intrinsics.checkNotNullExpressionValue(strK7, "toJson(...)");
                } else {
                    strK7 = null;
                }
                if (strK7 == null) {
                    sQLiteStatement.bindNull(9);
                } else {
                    sQLiteStatement.bindText(9, strK7);
                }
                n3f.c cVar = c0Var.f212022j;
                if (cVar != null) {
                    strK8 = f3f.a.a().k(cVar);
                    Intrinsics.checkNotNullExpressionValue(strK8, "toJson(...)");
                } else {
                    strK8 = null;
                }
                if (strK8 == null) {
                    sQLiteStatement.bindNull(10);
                } else {
                    sQLiteStatement.bindText(10, strK8);
                }
                n3f.i iVar = c0Var.k;
                if (iVar != null) {
                    strK9 = f3f.a.a().k(iVar);
                    Intrinsics.checkNotNullExpressionValue(strK9, "toJson(...)");
                } else {
                    strK9 = null;
                }
                if (strK9 == null) {
                    sQLiteStatement.bindNull(11);
                } else {
                    sQLiteStatement.bindText(11, strK9);
                }
                n3f.f fVar = c0Var.f212023l;
                if (fVar != null) {
                    strK10 = f3f.a.a().k(fVar);
                    Intrinsics.checkNotNullExpressionValue(strK10, "toJson(...)");
                } else {
                    strK10 = null;
                }
                if (strK10 == null) {
                    sQLiteStatement.bindNull(12);
                } else {
                    sQLiteStatement.bindText(12, strK10);
                }
                n3f.u uVar = c0Var.f212024m;
                if (uVar != null) {
                    strK11 = f3f.a.a().k(uVar);
                    Intrinsics.checkNotNullExpressionValue(strK11, "toJson(...)");
                } else {
                    strK11 = null;
                }
                if (strK11 == null) {
                    sQLiteStatement.bindNull(13);
                } else {
                    sQLiteStatement.bindText(13, strK11);
                }
                n3f.h hVar = c0Var.f212025n;
                if (hVar != null) {
                    strK12 = f3f.a.a().k(hVar);
                    Intrinsics.checkNotNullExpressionValue(strK12, "toJson(...)");
                } else {
                    strK12 = null;
                }
                if (strK12 == null) {
                    sQLiteStatement.bindNull(14);
                } else {
                    sQLiteStatement.bindText(14, strK12);
                }
                n3f.q qVar = c0Var.o;
                if (qVar != null) {
                    strK13 = f3f.a.a().k(qVar);
                    Intrinsics.checkNotNullExpressionValue(strK13, "toJson(...)");
                } else {
                    strK13 = null;
                }
                if (strK13 == null) {
                    sQLiteStatement.bindNull(15);
                } else {
                    sQLiteStatement.bindText(15, strK13);
                }
                n3f.e eVar = c0Var.f212026p;
                if (eVar != null) {
                    strK14 = f3f.a.a().k(eVar);
                    Intrinsics.checkNotNullExpressionValue(strK14, "toJson(...)");
                } else {
                    strK14 = null;
                }
                if (strK14 == null) {
                    sQLiteStatement.bindNull(16);
                } else {
                    sQLiteStatement.bindText(16, strK14);
                }
                n3f.l lVar = c0Var.f212027q;
                if (lVar != null) {
                    strK15 = f3f.a.a().k(lVar);
                    Intrinsics.checkNotNullExpressionValue(strK15, "toJson(...)");
                } else {
                    strK15 = null;
                }
                if (strK15 == null) {
                    sQLiteStatement.bindNull(17);
                } else {
                    sQLiteStatement.bindText(17, strK15);
                }
                n3f.z zVar2 = c0Var.f212028r;
                if (zVar2 != null) {
                    strK16 = f3f.a.a().k(zVar2);
                    Intrinsics.checkNotNullExpressionValue(strK16, "toJson(...)");
                } else {
                    strK16 = null;
                }
                if (strK16 == null) {
                    sQLiteStatement.bindNull(18);
                } else {
                    sQLiteStatement.bindText(18, strK16);
                }
                n3f.d dVar = c0Var.f212029s;
                if (dVar != null) {
                    strK17 = f3f.a.a().k(dVar);
                    Intrinsics.checkNotNullExpressionValue(strK17, "toJson(...)");
                } else {
                    strK17 = null;
                }
                if (strK17 == null) {
                    sQLiteStatement.bindNull(19);
                } else {
                    sQLiteStatement.bindText(19, strK17);
                }
                n3f.m mVar = c0Var.f212030t;
                if (mVar != null) {
                    strK18 = f3f.a.a().k(mVar);
                    Intrinsics.checkNotNullExpressionValue(strK18, "toJson(...)");
                } else {
                    strK18 = null;
                }
                if (strK18 == null) {
                    sQLiteStatement.bindNull(20);
                } else {
                    sQLiteStatement.bindText(20, strK18);
                }
                n3f.o oVar = c0Var.u;
                if (oVar != null) {
                    strK19 = f3f.a.a().k(oVar);
                    Intrinsics.checkNotNullExpressionValue(strK19, "toJson(...)");
                } else {
                    strK19 = null;
                }
                if (strK19 == null) {
                    sQLiteStatement.bindNull(21);
                } else {
                    sQLiteStatement.bindText(21, strK19);
                }
                n3f.p pVar = c0Var.v;
                if (pVar != null) {
                    strK20 = f3f.a.a().k(pVar);
                    Intrinsics.checkNotNullExpressionValue(strK20, "toJson(...)");
                } else {
                    strK20 = null;
                }
                if (strK20 == null) {
                    sQLiteStatement.bindNull(22);
                } else {
                    sQLiteStatement.bindText(22, strK20);
                }
                Long lD = b21.a.d(c0Var.f212031w);
                if (lD == null) {
                    sQLiteStatement.bindNull(23);
                } else {
                    sQLiteStatement.bindLong(23, lD.longValue());
                }
                sQLiteStatement.bindLong(24, c0Var.f212032x ? 1L : 0L);
                sQLiteStatement.bindLong(25, c0Var.f212033y ? 1L : 0L);
                sQLiteStatement.bindLong(26, c0Var.z ? 1L : 0L);
                n3f.v vVar = c0Var.A;
                if (vVar != null) {
                    strK21 = f3f.a.a().k(vVar);
                    Intrinsics.checkNotNullExpressionValue(strK21, "toJson(...)");
                } else {
                    strK21 = null;
                }
                if (strK21 == null) {
                    sQLiteStatement.bindNull(27);
                } else {
                    sQLiteStatement.bindText(27, strK21);
                }
                n3f.s sVar = c0Var.B;
                if (sVar != null) {
                    strK22 = f3f.a.a().k(sVar);
                    Intrinsics.checkNotNullExpressionValue(strK22, "toJson(...)");
                } else {
                    strK22 = null;
                }
                if (strK22 == null) {
                    sQLiteStatement.bindNull(28);
                } else {
                    sQLiteStatement.bindText(28, strK22);
                }
                String str31 = c0Var.C;
                if (str31 == null) {
                    sQLiteStatement.bindNull(29);
                } else {
                    sQLiteStatement.bindText(29, str31);
                }
                String str32 = c0Var.D;
                if (str32 == null) {
                    sQLiteStatement.bindNull(30);
                } else {
                    sQLiteStatement.bindText(30, str32);
                }
                WealthAccountType accountType = c0Var.E;
                Intrinsics.checkNotNullParameter(accountType, "accountType");
                String rawValue = accountType.getRawValue();
                if (rawValue == null) {
                    sQLiteStatement.bindNull(31);
                } else {
                    sQLiteStatement.bindText(31, rawValue);
                }
                String str33 = c0Var.F;
                if (str33 == null) {
                    sQLiteStatement.bindNull(32);
                } else {
                    sQLiteStatement.bindText(32, str33);
                }
                n3f.t tVar = c0Var.G;
                if (tVar != null) {
                    strK23 = f3f.a.a().k(tVar);
                    Intrinsics.checkNotNullExpressionValue(strK23, "toJson(...)");
                } else {
                    strK23 = null;
                }
                if (strK23 == null) {
                    sQLiteStatement.bindNull(33);
                } else {
                    sQLiteStatement.bindText(33, strK23);
                }
                String str34 = c0Var.H;
                if (str34 == null) {
                    sQLiteStatement.bindNull(34);
                } else {
                    sQLiteStatement.bindText(34, str34);
                }
                String str35 = c0Var.I;
                if (str35 == null) {
                    sQLiteStatement.bindNull(35);
                } else {
                    sQLiteStatement.bindText(35, str35);
                }
                String str36 = c0Var.J;
                if (str36 == null) {
                    sQLiteStatement.bindNull(36);
                } else {
                    sQLiteStatement.bindText(36, str36);
                }
                sQLiteStatement.bindLong(37, c0Var.K ? 1L : 0L);
                sQLiteStatement.bindLong(38, c0Var.L ? 1L : 0L);
                String str37 = c0Var.M;
                if (str37 == null) {
                    sQLiteStatement.bindNull(39);
                } else {
                    sQLiteStatement.bindText(39, str37);
                }
                n3f.r rVar = c0Var.N;
                if (rVar != null) {
                    strK24 = f3f.a.a().k(rVar);
                    Intrinsics.checkNotNullExpressionValue(strK24, "toJson(...)");
                } else {
                    strK24 = null;
                }
                if (strK24 == null) {
                    sQLiteStatement.bindNull(40);
                } else {
                    sQLiteStatement.bindText(40, strK24);
                }
                n3f.w wVar2 = c0Var.O;
                if (wVar2 != null) {
                    strK25 = f3f.a.a().k(wVar2);
                    Intrinsics.checkNotNullExpressionValue(strK25, "toJson(...)");
                } else {
                    strK25 = null;
                }
                if (strK25 == null) {
                    sQLiteStatement.bindNull(41);
                } else {
                    sQLiteStatement.bindText(41, strK25);
                }
                n3f.x xVar2 = c0Var.P;
                if (xVar2 != null) {
                    strK26 = f3f.a.a().k(xVar2);
                    Intrinsics.checkNotNullExpressionValue(strK26, "toJson(...)");
                } else {
                    strK26 = null;
                }
                if (strK26 == null) {
                    sQLiteStatement.bindNull(42);
                } else {
                    sQLiteStatement.bindText(42, strK26);
                }
                n3f.n nVar = c0Var.Q;
                if (nVar != null) {
                    strK27 = f3f.a.a().k(nVar);
                    Intrinsics.checkNotNullExpressionValue(strK27, "toJson(...)");
                } else {
                    strK27 = null;
                }
                if (strK27 == null) {
                    sQLiteStatement.bindNull(43);
                } else {
                    sQLiteStatement.bindText(43, strK27);
                }
                String str38 = c0Var.R;
                if (str38 == null) {
                    sQLiteStatement.bindNull(44);
                } else {
                    sQLiteStatement.bindText(44, str38);
                }
                Boolean bool = c0Var.S;
                if ((bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null) == null) {
                    sQLiteStatement.bindNull(45);
                } else {
                    sQLiteStatement.bindLong(45, r2.intValue());
                }
                String str39 = c0Var.T;
                if (str39 == null) {
                    sQLiteStatement.bindNull(46);
                } else {
                    sQLiteStatement.bindText(46, str39);
                }
                String str40 = c0Var.U;
                if (str40 == null) {
                    sQLiteStatement.bindNull(47);
                    return;
                } else {
                    sQLiteStatement.bindText(47, str40);
                    return;
                }
            case 3:
                mud.b bVar4 = (mud.b) obj2;
                String str41 = bVar4.f209020a;
                if (str41 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str41);
                }
                String strO = b21.a.o(bVar4.f209021b);
                if (strO == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, strO);
                }
                if (bVar4.f209022c == null) {
                    sQLiteStatement.bindNull(3);
                    return;
                } else {
                    sQLiteStatement.bindLong(3, r8.intValue());
                    return;
                }
            case 4:
                nud.a aVar = (nud.a) obj2;
                String str42 = aVar.f219297a;
                if (str42 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str42);
                }
                sQLiteStatement.bindLong(2, aVar.f219298b);
                String str43 = aVar.f219299c;
                if (str43 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, str43);
                }
                String str44 = aVar.d;
                if (str44 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, str44);
                }
                Long l31 = aVar.e;
                if (l31 == null) {
                    sQLiteStatement.bindNull(5);
                    return;
                } else {
                    sQLiteStatement.bindLong(5, l31.longValue());
                    return;
                }
            case 5:
                krl.k kVar = (krl.k) obj2;
                String str45 = kVar.f188985a;
                if (str45 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str45);
                }
                String str46 = kVar.f188986b;
                if (str46 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str46);
                }
                String str47 = kVar.f188987c;
                if (str47 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, str47);
                }
                sQLiteStatement.bindLong(4, kVar.d);
                sQLiteStatement.bindLong(5, kVar.e);
                Long l37 = kVar.f;
                if (l37 == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindLong(6, l37.longValue());
                }
                String str48 = kVar.f188988g;
                if (str48 == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindText(7, str48);
                }
                String str49 = kVar.f188989h;
                if (str49 == null) {
                    sQLiteStatement.bindNull(8);
                } else {
                    sQLiteStatement.bindText(8, str49);
                }
                String str50 = kVar.i;
                if (str50 == null) {
                    sQLiteStatement.bindNull(9);
                } else {
                    sQLiteStatement.bindText(9, str50);
                }
                String str51 = kVar.f188990j;
                if (str51 == null) {
                    sQLiteStatement.bindNull(10);
                } else {
                    sQLiteStatement.bindText(10, str51);
                }
                String str52 = kVar.k;
                if (str52 == null) {
                    sQLiteStatement.bindNull(11);
                } else {
                    sQLiteStatement.bindText(11, str52);
                }
                String str53 = kVar.f188991l;
                if (str53 == null) {
                    sQLiteStatement.bindNull(12);
                } else {
                    sQLiteStatement.bindText(12, str53);
                }
                String str54 = kVar.f188992m;
                if (str54 == null) {
                    sQLiteStatement.bindNull(13);
                } else {
                    sQLiteStatement.bindText(13, str54);
                }
                krl.p pVar2 = kVar.f188993n;
                if (pVar2 != null) {
                    strK28 = nrl.d.a().k(pVar2);
                    Intrinsics.checkNotNullExpressionValue(strK28, "toJson(...)");
                } else {
                    strK28 = null;
                }
                if (strK28 == null) {
                    sQLiteStatement.bindNull(14);
                } else {
                    sQLiteStatement.bindText(14, strK28);
                }
                krl.q qVar2 = kVar.o;
                if (qVar2 != null) {
                    strK29 = nrl.d.a().k(qVar2);
                    Intrinsics.checkNotNullExpressionValue(strK29, "toJson(...)");
                } else {
                    strK29 = null;
                }
                if (strK29 == null) {
                    sQLiteStatement.bindNull(15);
                } else {
                    sQLiteStatement.bindText(15, strK29);
                }
                krl.b bVar5 = kVar.f188994p;
                if (bVar5 != null) {
                    strK30 = nrl.d.a().k(bVar5);
                    Intrinsics.checkNotNullExpressionValue(strK30, "toJson(...)");
                } else {
                    strK30 = null;
                }
                if (strK30 == null) {
                    sQLiteStatement.bindNull(16);
                } else {
                    sQLiteStatement.bindText(16, strK30);
                }
                krl.e eVar2 = kVar.f188995q;
                if (eVar2 != null) {
                    strK31 = nrl.d.a().k(eVar2);
                    Intrinsics.checkNotNullExpressionValue(strK31, "toJson(...)");
                } else {
                    strK31 = null;
                }
                if (strK31 == null) {
                    sQLiteStatement.bindNull(17);
                } else {
                    sQLiteStatement.bindText(17, strK31);
                }
                krl.d dVar2 = kVar.f188996r;
                if (dVar2 != null) {
                    strK32 = nrl.d.a().k(dVar2);
                    Intrinsics.checkNotNullExpressionValue(strK32, "toJson(...)");
                } else {
                    strK32 = null;
                }
                if (strK32 == null) {
                    sQLiteStatement.bindNull(18);
                } else {
                    sQLiteStatement.bindText(18, strK32);
                }
                krl.g gVar = kVar.f188997s;
                if (gVar != null) {
                    strK33 = nrl.d.a().k(gVar);
                    Intrinsics.checkNotNullExpressionValue(strK33, "toJson(...)");
                } else {
                    strK33 = null;
                }
                if (strK33 == null) {
                    sQLiteStatement.bindNull(19);
                } else {
                    sQLiteStatement.bindText(19, strK33);
                }
                krl.h hVar2 = kVar.f188998t;
                if (hVar2 != null) {
                    strK34 = nrl.d.a().k(hVar2);
                    Intrinsics.checkNotNullExpressionValue(strK34, "toJson(...)");
                } else {
                    strK34 = null;
                }
                if (strK34 == null) {
                    sQLiteStatement.bindNull(20);
                } else {
                    sQLiteStatement.bindText(20, strK34);
                }
                krl.a aVar2 = kVar.u;
                if (aVar2 != null) {
                    strK35 = nrl.d.a().k(aVar2);
                    Intrinsics.checkNotNullExpressionValue(strK35, "toJson(...)");
                } else {
                    strK35 = null;
                }
                if (strK35 == null) {
                    sQLiteStatement.bindNull(21);
                } else {
                    sQLiteStatement.bindText(21, strK35);
                }
                String str55 = kVar.v;
                if (str55 == null) {
                    sQLiteStatement.bindNull(22);
                } else {
                    sQLiteStatement.bindText(22, str55);
                }
                Boolean bool2 = kVar.f188999w;
                if ((bool2 != null ? Integer.valueOf(bool2.booleanValue() ? 1 : 0) : null) == null) {
                    sQLiteStatement.bindNull(23);
                } else {
                    sQLiteStatement.bindLong(23, r2.intValue());
                }
                String str56 = kVar.f189000x;
                if (str56 == null) {
                    sQLiteStatement.bindNull(24);
                    return;
                } else {
                    sQLiteStatement.bindText(24, str56);
                    return;
                }
            case 6:
                ma5.a aVar3 = (ma5.a) obj2;
                String str57 = aVar3.f203943a;
                if (str57 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str57);
                }
                String str58 = aVar3.f203944b;
                if (str58 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str58);
                }
                String str59 = aVar3.f203945c;
                if (str59 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, str59);
                }
                sQLiteStatement.bindLong(4, aVar3.d);
                Long l39 = aVar3.e;
                if (l39 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindLong(5, l39.longValue());
                }
                Long l51 = aVar3.f;
                if (l51 == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindLong(6, l51.longValue());
                }
                if (aVar3.f203946g == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindLong(7, r0.intValue());
                }
                sQLiteStatement.bindLong(8, aVar3.f203947h);
                String str60 = aVar3.i;
                if (str60 == null) {
                    sQLiteStatement.bindNull(9);
                } else {
                    sQLiteStatement.bindText(9, str60);
                }
                sQLiteStatement.bindLong(10, aVar3.f203948j);
                sQLiteStatement.bindLong(11, aVar3.k);
                Long l52 = aVar3.f203949l;
                if (l52 == null) {
                    sQLiteStatement.bindNull(12);
                    return;
                } else {
                    sQLiteStatement.bindLong(12, l52.longValue());
                    return;
                }
            case 7:
                mqj.a aVar4 = (mqj.a) obj2;
                sQLiteStatement.bindLong(1, aVar4.f208010a);
                String str61 = aVar4.f208011b;
                if (str61 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str61);
                }
                sQLiteStatement.bindLong(3, aVar4.f208012c);
                return;
            case 8:
                throw a10.b.m(obj2);
            case 9:
                throw a10.b.m(obj2);
            case 10:
                n91.a aVar5 = (n91.a) obj2;
                String str62 = aVar5.f213523a;
                if (str62 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str62);
                }
                String str63 = aVar5.f213524b;
                if (str63 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str63);
                }
                sQLiteStatement.bindLong(3, aVar5.f213525c);
                String str64 = aVar5.d;
                if (str64 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, str64);
                }
                String str65 = aVar5.e;
                if (str65 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, str65);
                }
                String str66 = aVar5.f;
                if (str66 == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, str66);
                }
                String str67 = aVar5.f213526g;
                if (str67 == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindText(7, str67);
                }
                String str68 = aVar5.f213527h;
                if (str68 == null) {
                    sQLiteStatement.bindNull(8);
                } else {
                    sQLiteStatement.bindText(8, str68);
                }
                String str69 = aVar5.i;
                if (str69 == null) {
                    sQLiteStatement.bindNull(9);
                    return;
                } else {
                    sQLiteStatement.bindText(9, str69);
                    return;
                }
            case 11:
                n91.d dVar3 = (n91.d) obj2;
                String str70 = dVar3.f213536a;
                if (str70 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str70);
                }
                String str71 = dVar3.f213537b;
                if (str71 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str71);
                }
                sQLiteStatement.bindLong(3, dVar3.f213538c);
                String str72 = dVar3.d;
                if (str72 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, str72);
                }
                String str73 = dVar3.e;
                if (str73 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, str73);
                }
                String str74 = dVar3.f;
                if (str74 == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, str74);
                }
                String str75 = dVar3.f213539g;
                if (str75 == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindText(7, str75);
                }
                String str76 = dVar3.f213540h;
                if (str76 == null) {
                    sQLiteStatement.bindNull(8);
                } else {
                    sQLiteStatement.bindText(8, str76);
                }
                String str77 = dVar3.i;
                if (str77 == null) {
                    sQLiteStatement.bindNull(9);
                } else {
                    sQLiteStatement.bindText(9, str77);
                }
                String str78 = dVar3.f213541j;
                if (str78 == null) {
                    sQLiteStatement.bindNull(10);
                } else {
                    sQLiteStatement.bindText(10, str78);
                }
                String str79 = dVar3.k;
                if (str79 == null) {
                    sQLiteStatement.bindNull(11);
                    return;
                } else {
                    sQLiteStatement.bindText(11, str79);
                    return;
                }
            case 12:
                a(sQLiteStatement, obj2);
                return;
            case 13:
                b(sQLiteStatement, obj2);
                return;
            case 14:
                throw a10.b.m(obj2);
            case 15:
                throw a10.b.m(obj2);
            case 16:
                c(sQLiteStatement, obj2);
                return;
            case 17:
                d1 d1Var = (d1) obj2;
                String str80 = d1Var.f215753a;
                if (str80 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str80);
                }
                sQLiteStatement.bindLong(2, d1Var.f215754b);
                return;
            case 18:
                d(sQLiteStatement, obj2);
                return;
            case 19:
                e(sQLiteStatement, obj2);
                return;
            case 20:
                f(sQLiteStatement, obj2);
                return;
            case 21:
                g(sQLiteStatement, obj2);
                return;
            case 22:
                h(sQLiteStatement, obj2);
                return;
            case 23:
                i(sQLiteStatement, obj2);
                return;
            case 24:
                j(sQLiteStatement, obj2);
                return;
            case 25:
                k(sQLiteStatement, obj2);
                return;
            case 26:
                l(sQLiteStatement, obj2);
                return;
            case 27:
                m(sQLiteStatement, obj2);
                return;
            case 28:
                n(sQLiteStatement, obj2);
                return;
            default:
                pvg.b bVar6 = (pvg.b) obj2;
                String strA = pvg.t.a(bVar6.f240077a);
                if (strA == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, strA);
                }
                sQLiteStatement.bindLong(2, bVar6.f240078b ? 1L : 0L);
                String str81 = bVar6.f240079c;
                if (str81 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, str81);
                }
                sQLiteStatement.bindText(4, bVar6.d);
                String str82 = bVar6.e;
                if (str82 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, str82);
                }
                String strO2 = b21.a.o(bVar6.f);
                if (strO2 == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, strO2);
                }
                sQLiteStatement.bindDouble(7, bVar6.f240080g);
                return;
        }
    }

    @Override // androidx.room.EntityInsertAdapter
    public final String createQuery() {
        switch (this.f168145a) {
            case 0:
                return "INSERT OR REPLACE INTO `invoices` (`id`,`parentInvoiceId`,`number`,`numberFormatted`,`numberPrefix`,`saleDate`,`issueDate`,`dueDate`,`currency`,`status`,`total`,`subtotal`,`totalTax`,`customerId`,`customerDetails`,`supplierDetails`,`statusDetails`,`enabledPaymentMethods`,`enabledReminders`,`taxes`,`items`,`additionalNote`,`customerMessage`,`recurringInvoiceId`,`recurringSchedule`,`templateId`,`templateOverride`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `orders` (`id`,`state`,`description`,`channel`,`channel_group`,`type`,`invoice`,`payment_link`,`amount`,`currency`,`merchant_order_ext_ref`,`initiation_page_id`,`related_orders`,`related_transactions`,`original_order_details`,`line_items`,`payments`,`created_at`,`updated_at`,`expires_at`,`allowed_payment_methods`,`customer_id`,`customer_email`,`customer_full_name`,`sub_total_amount_amount`,`sub_total_amount_currency`,`tax_total_amount_amount`,`tax_total_amount_currency`,`tip_amount_amount`,`tip_amount_currency`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 2:
                return "INSERT OR REPLACE INTO `trading_trades` (`trade_id`,`compound_id`,`ref`,`holding_id`,`state`,`completed_at`,`updated_at`,`created_at`,`stock_trade`,`cash_trade`,`dividend_trade`,`coupon`,`redemption`,`custody_fees`,`margin_trade`,`commodity_trade`,`exchange_trade`,`stock_transfer_trade`,`cash_transfer_trade`,`fee_trade`,`fund_trade`,`value`,`settlementDate`,`slip_transaction`,`stock_transfer_fee`,`commission_refund`,`refund`,`overnight_fee`,`standing_order_id`,`client_order_id`,`account_type`,`portfolio_id`,`price_adjustment`,`base_instrument_currency`,`counter_instrument_currency`,`badge`,`deficit_adjustment`,`stock_promotion_clawback`,`transfer_request_id`,`merger`,`spin_off`,`stock_split`,`initiated_by`,`account_holder_type`,`awaiting_settlement`,`currency_pair_first`,`currency_pair_second`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 3:
                return "INSERT OR REPLACE INTO `staking_rewards` (`pocketId`,`balance`,`daysTillFirstReward`) VALUES (?,?,?)";
            case 4:
                return "INSERT OR REPLACE INTO `unstaking_data` (`id`,`startDate`,`state`,`productId`,`estimatedEndDate`) VALUES (?,?,?,?,?)";
            case 5:
                return "INSERT OR REPLACE INTO `invest_orders` (`id`,`account_type`,`compound_id`,`created_at`,`updated_at`,`completed_at`,`side`,`state`,`order_type`,`currency_pair_first`,`currency_pair_second`,`symbol`,`instrument_type`,`stock_order`,`tax_advantaged_order`,`commodity_order`,`margin_order`,`fund_order`,`mutual_fund_order`,`option_order`,`initiated_by`,`account_holder_type`,`blocking`,`portfolio_id`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 6:
                return "INSERT OR REPLACE INTO `post_termination_plan` (`planId`,`type`,`currency`,`amountDue`,`discountedAmount`,`leftToRepay`,`repaymentDay`,`remainingRepayments`,`status`,`minimumRepayment`,`maximumRepayment`,`suggestedRepayment`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
            case 7:
                return "INSERT OR REPLACE INTO `balance_history` (`date`,`source`,`balance`) VALUES (?,?,?)";
            case 8:
                return "INSERT OR REPLACE INTO `pae_payment_address_table` (`id`,`postcode`,`street`,`city`,`country`) VALUES (?,?,?,?,?)";
            case 9:
                return "INSERT OR REPLACE INTO `pae_payment_overridden_names_table` (`id`,`overriddenName`) VALUES (?,?)";
            case 10:
                return "INSERT OR IGNORE INTO `pae_direct_debits_table` (`id`,`name`,`amount`,`currency`,`date`,`logoUrl`,`type`,`state`,`sentDate`) VALUES (?,?,?,?,?,?,?,?,?)";
            case 11:
                return "INSERT OR IGNORE INTO `pae_scheduled_payments_table` (`id`,`name`,`amount`,`currency`,`date`,`logoUrl`,`frequency`,`iban`,`reference`,`state`,`sentDate`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            case 12:
                return "INSERT OR REPLACE INTO `pae_incoming_payments_table` (`id`,`name`,`amount`,`currency`,`date`,`logoUrl`,`type`,`state`,`sentDate`) VALUES (?,?,?,?,?,?,?,?,?)";
            case 13:
                return "INSERT OR IGNORE INTO `pae_payment_required_attributes_table` (`id`,`paymentId`,`title`,`description`) VALUES (?,?,?,?)";
            case 14:
                return "INSERT OR REPLACE INTO `pae_payment_required_attribute_values_table` (`id`,`paymentId`,`value`) VALUES (?,?,?)";
            case 15:
                return "INSERT OR REPLACE INTO `pae_scheduled_payment_overridden_data_table` (`id`,`reference`,`frequency`,`startDate`,`beneficiaryId`) VALUES (?,?,?,?,?)";
            case 16:
                return "INSERT OR REPLACE INTO `pae_source_bank_details_table` (`id`,`name`,`logoUrl`) VALUES (?,?,?)";
            case 17:
                return "INSERT OR REPLACE INTO `loading_state` (`id`,`value`) VALUES (?,?)";
            case 18:
                return "INSERT OR ABORT INTO `search_indexes` (`leg_id`,`content_index`) VALUES (?,?)";
            case 19:
                return "INSERT OR REPLACE INTO `search_index_state` (`id`,`value`,`value_string`) VALUES (?,?,?)";
            case 20:
                return "INSERT OR REPLACE INTO `statement_documents` (`loanId`,`statementId`,`issueDate`,`statementPeriodFrom`,`statementPeriodTo`,`type`) VALUES (?,?,?,?,?,?)";
            case 21:
                return "INSERT OR REPLACE INTO `update_dates` (`key`,`updateDate`) VALUES (?,?)";
            case 22:
                return "INSERT OR IGNORE INTO `plain_watchlist_items` (`asset_type_key`,`fromCode`,`toCode`,`added_time`,`sync_state`) VALUES (?,?,?,?,?)";
            case 23:
                return "INSERT OR REPLACE INTO `plain_watchlist_items` (`asset_type_key`,`fromCode`,`toCode`,`added_time`,`sync_state`) VALUES (?,?,?,?,?)";
            case 24:
                return "INSERT OR REPLACE INTO `watchlists` (`watchlist_id`,`name`,`is_default`,`display_order`) VALUES (?,?,?,?)";
            case 25:
                return "INSERT OR REPLACE INTO `plain_multiple_watchlists_items` (`watchlist_id`,`asset_type_key`,`from_code`,`to_code`,`added_time`,`sync_state`) VALUES (?,?,?,?,?,?)";
            case 26:
                return "INSERT OR IGNORE INTO `plain_multiple_watchlists_items` (`watchlist_id`,`asset_type_key`,`from_code`,`to_code`,`added_time`,`sync_state`) VALUES (?,?,?,?,?,?)";
            case 27:
                return "INSERT OR REPLACE INTO `crypto_action_required_deposits` (`groupId`,`state`,`returnDetails`,`returnReasons`,`blockchainDetails`,`requiredFields`,`counterparty_id`,`counterparty_address`,`counterparty_state`,`counterparty_hostingType`,`counterparty_hostingVerification`,`counterparty_hostingPlatform`,`counterparty_ownershipState`,`counterparty_ownershipMethod`,`counterparty_ownershipPayload`,`counterparty_updatedDate`,`counterparty_details_type`,`counterparty_details_name`,`counterparty_details_surname`,`counterparty_details_business_registration_number`,`counterparty_details_address_country`,`counterparty_details_address_city`,`counterparty_details_address_line1`,`counterparty_details_address_line2`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 28:
                return "INSERT OR REPLACE INTO `complex_analytics_allocations` (`assetType`,`sector`,`currency`,`portfolio_id`,`total_value`) VALUES (?,?,?,?,?)";
            default:
                return "INSERT OR REPLACE INTO `complex_analytics_allocations_cash` (`assetType`,`sector`,`currency`,`portfolio_id`,`asset`,`value`,`allocation`) VALUES (?,?,?,?,?,?,?)";
        }
    }

    public /* synthetic */ x(Object obj2, int i) {
        this.f168145a = i;
    }
}
