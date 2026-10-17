package qra;

import androidx.room.EntityInsertAdapter;
import androidx.sqlite.SQLiteStatement;
import ar9.j;
import ar9.m;
import ar9.n;
import ar9.p;
import ar9.q;
import ar9.r;
import ar9.s;
import ar9.t;
import ar9.u;
import ar9.v;
import ar9.w;
import ar9.x;
import com.revolut.data.utils.gson.GsonHolder;
import kotlin.jvm.internal.Intrinsics;
import prk.o;

/* JADX INFO: loaded from: classes13.dex */
public final class g extends EntityInsertAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f248678a;

    public /* synthetic */ g(int i) {
        this.f248678a = i;
    }

    @Override // androidx.room.EntityInsertAdapter
    public final void bind(SQLiteStatement sQLiteStatement, Object obj2) {
        String strK;
        String strK2;
        String str;
        String strK3;
        String strK4;
        String strK5;
        String strK6;
        String str2;
        String strK7;
        switch (this.f248678a) {
            case 0:
                sra.c cVar = (sra.c) obj2;
                if (cVar.b() == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, cVar.b());
                }
                sQLiteStatement.bindLong(2, cVar.d());
                sQLiteStatement.bindLong(3, cVar.c());
                return;
            case 1:
                zf0.e eVar = (zf0.e) obj2;
                if (eVar.a() == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, eVar.a());
                }
                if (eVar.b() == null) {
                    sQLiteStatement.bindNull(2);
                    return;
                } else {
                    sQLiteStatement.bindText(2, eVar.b());
                    return;
                }
            case 2:
                j jVar = (j) obj2;
                if (jVar.g() == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, jVar.g());
                }
                if (jVar.f() == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, jVar.f());
                }
                if (jVar.i() == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, jVar.i());
                }
                if (jVar.b() == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, jVar.b());
                }
                n nVarO = jVar.o();
                if (nVarO != null) {
                    strK = GsonHolder.a().k(nVarO);
                    Intrinsics.checkNotNullExpressionValue(strK, "toJson(...)");
                } else {
                    strK = null;
                }
                if (strK == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, strK);
                }
                if (jVar.k() == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, jVar.k());
                }
                sQLiteStatement.bindLong(7, jVar.a());
                if (jVar.d() == null) {
                    sQLiteStatement.bindNull(8);
                } else {
                    sQLiteStatement.bindText(8, jVar.d());
                }
                String strO = b21.a.o(jVar.e());
                if (strO == null) {
                    sQLiteStatement.bindNull(9);
                } else {
                    sQLiteStatement.bindText(9, strO);
                }
                sQLiteStatement.bindLong(10, jVar.c());
                if (jVar.m() == null) {
                    sQLiteStatement.bindNull(11);
                } else {
                    sQLiteStatement.bindText(11, jVar.m());
                }
                if (jVar.l() == null) {
                    sQLiteStatement.bindNull(12);
                } else {
                    sQLiteStatement.bindText(12, jVar.l());
                }
                if (jVar.n() == null) {
                    sQLiteStatement.bindNull(13);
                } else {
                    sQLiteStatement.bindText(13, jVar.n());
                }
                String strB = xq9.c.b(jVar.h());
                if (strB == null) {
                    sQLiteStatement.bindNull(14);
                } else {
                    sQLiteStatement.bindText(14, strB);
                }
                if (jVar.j() == null) {
                    sQLiteStatement.bindNull(15);
                    return;
                } else {
                    sQLiteStatement.bindText(15, jVar.j());
                    return;
                }
            case 3:
                m mVar = (m) obj2;
                if (mVar.f() == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, mVar.f());
                }
                if (mVar.b() == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, mVar.b());
                }
                if (mVar.e() == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, mVar.e());
                }
                if (mVar.g() == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, mVar.g());
                }
                sQLiteStatement.bindLong(5, mVar.a());
                if (mVar.c() == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, mVar.c());
                }
                String strO2 = b21.a.o(mVar.d());
                if (strO2 == null) {
                    sQLiteStatement.bindNull(7);
                    return;
                } else {
                    sQLiteStatement.bindText(7, strO2);
                    return;
                }
            case 4:
                r rVar = (r) obj2;
                if (rVar.d() == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, rVar.d());
                }
                if (rVar.g() == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, rVar.g());
                }
                if (rVar.e() == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, rVar.e());
                }
                if (rVar.c() == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, rVar.c());
                }
                ar9.e eVarB = rVar.b();
                if (eVarB != null) {
                    strK2 = GsonHolder.a().k(eVarB);
                    Intrinsics.checkNotNullExpressionValue(strK2, "toJson(...)");
                } else {
                    strK2 = null;
                }
                if (strK2 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, strK2);
                }
                sQLiteStatement.bindLong(6, rVar.j() ? 1L : 0L);
                sQLiteStatement.bindLong(7, rVar.i());
                if (rVar.f() == null) {
                    sQLiteStatement.bindNull(8);
                } else {
                    sQLiteStatement.bindLong(8, rVar.f().longValue());
                }
                ar9.d dVarH = rVar.h();
                ar9.c calculationType = dVarH.getCalculationType();
                int i = yq9.g.f316004a[calculationType.ordinal()];
                if (i == 1) {
                    str = "DUMB";
                } else {
                    if (i != 2) {
                        throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: " + calculationType);
                    }
                    str = "SMART";
                }
                sQLiteStatement.bindText(9, str);
                if (dVarH.getBaseCurrency() == null) {
                    sQLiteStatement.bindNull(10);
                } else {
                    sQLiteStatement.bindText(10, dVarH.getBaseCurrency());
                }
                ar9.a aVarA = rVar.a();
                if (aVarA == null) {
                    o.z(sQLiteStatement, 11, 12, 13, 14);
                    sQLiteStatement.bindNull(15);
                    return;
                }
                sQLiteStatement.bindLong(11, aVarA.getTotalSpentByGroup());
                sQLiteStatement.bindLong(12, aVarA.getTotalSpentByCurrentMember());
                if (aVarA.getCurrency() == null) {
                    sQLiteStatement.bindNull(13);
                } else {
                    sQLiteStatement.bindText(13, aVarA.getCurrency());
                }
                String strB2 = xq9.a.b(aVarA.getTotalSpentByGroupByCurrency());
                if (strB2 == null) {
                    sQLiteStatement.bindNull(14);
                } else {
                    sQLiteStatement.bindText(14, strB2);
                }
                String strB3 = xq9.a.b(aVarA.getTotalSpentByCurrentMemberByCurrency());
                if (strB3 == null) {
                    sQLiteStatement.bindNull(15);
                    return;
                } else {
                    sQLiteStatement.bindText(15, strB3);
                    return;
                }
            case 5:
                ar9.o oVar = (ar9.o) obj2;
                if (oVar.f() == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, oVar.f());
                }
                if (oVar.e() == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, oVar.e());
                }
                q qVarK = oVar.k();
                String strK8 = null;
                if (qVarK != null) {
                    strK3 = GsonHolder.a().k(qVarK);
                    Intrinsics.checkNotNullExpressionValue(strK3, "toJson(...)");
                } else {
                    strK3 = null;
                }
                if (strK3 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, strK3);
                }
                p pVarI = oVar.i();
                if (pVarI != null) {
                    strK8 = GsonHolder.a().k(pVarI);
                    Intrinsics.checkNotNullExpressionValue(strK8, "toJson(...)");
                }
                if (strK8 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, strK8);
                }
                sQLiteStatement.bindLong(5, oVar.a());
                if (oVar.b() == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, oVar.b());
                }
                sQLiteStatement.bindLong(7, oVar.c());
                if (oVar.d() == null) {
                    sQLiteStatement.bindNull(8);
                } else {
                    sQLiteStatement.bindText(8, oVar.d());
                }
                if (oVar.h() == null) {
                    sQLiteStatement.bindNull(9);
                } else {
                    sQLiteStatement.bindText(9, oVar.h());
                }
                if (oVar.g() == null) {
                    sQLiteStatement.bindNull(10);
                } else {
                    sQLiteStatement.bindText(10, oVar.g());
                }
                sQLiteStatement.bindLong(11, oVar.j() ? 1L : 0L);
                return;
            case 6:
                t tVar = (t) obj2;
                if (tVar.g() == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, tVar.g());
                }
                if (tVar.d() == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, tVar.d());
                }
                s sVarE = tVar.e();
                if (sVarE != null) {
                    strK4 = GsonHolder.a().k(sVarE);
                    Intrinsics.checkNotNullExpressionValue(strK4, "toJson(...)");
                } else {
                    strK4 = null;
                }
                if (strK4 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, strK4);
                }
                s sVarA = tVar.a();
                if (sVarA != null) {
                    strK5 = GsonHolder.a().k(sVarA);
                    Intrinsics.checkNotNullExpressionValue(strK5, "toJson(...)");
                } else {
                    strK5 = null;
                }
                if (strK5 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, strK5);
                }
                u uVarH = tVar.h();
                if (uVarH != null) {
                    strK6 = GsonHolder.a().k(uVarH);
                    Intrinsics.checkNotNullExpressionValue(strK6, "toJson(...)");
                } else {
                    strK6 = null;
                }
                if (strK6 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, strK6);
                }
                if (tVar.c() == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, tVar.c());
                }
                if (tVar.f() == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindText(7, tVar.f());
                }
                if (tVar.b() == null) {
                    sQLiteStatement.bindNull(8);
                } else {
                    sQLiteStatement.bindText(8, tVar.b());
                }
                if ((tVar.i() != null ? Integer.valueOf(tVar.i().booleanValue() ? 1 : 0) : null) == null) {
                    sQLiteStatement.bindNull(9);
                    return;
                } else {
                    sQLiteStatement.bindLong(9, r2.intValue());
                    return;
                }
            default:
                v vVar = (v) obj2;
                if (vVar.g() == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, vVar.g());
                }
                if (vVar.f() == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, vVar.f());
                }
                x xVarM = vVar.m();
                int i2 = yq9.n.f316022a[xVarM.ordinal()];
                if (i2 == 1) {
                    str2 = "MARK_AS_PAID";
                } else {
                    if (i2 != 2) {
                        throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: " + xVarM);
                    }
                    str2 = "TRANSFER";
                }
                sQLiteStatement.bindText(3, str2);
                w wVarK = vVar.k();
                if (wVarK != null) {
                    strK7 = GsonHolder.a().k(wVarK);
                    Intrinsics.checkNotNullExpressionValue(strK7, "toJson(...)");
                } else {
                    strK7 = null;
                }
                if (strK7 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, strK7);
                }
                if (vVar.l() == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, vVar.l());
                }
                if (vVar.j() == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, vVar.j());
                }
                if (vVar.i() == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindText(7, vVar.i());
                }
                if (vVar.h() == null) {
                    sQLiteStatement.bindNull(8);
                } else {
                    sQLiteStatement.bindText(8, vVar.h());
                }
                if (vVar.b() == null) {
                    sQLiteStatement.bindNull(9);
                } else {
                    sQLiteStatement.bindText(9, vVar.b());
                }
                sQLiteStatement.bindLong(10, vVar.a());
                if (vVar.d() == null) {
                    sQLiteStatement.bindNull(11);
                } else {
                    sQLiteStatement.bindText(11, vVar.d());
                }
                String strO3 = b21.a.o(vVar.e());
                if (strO3 == null) {
                    sQLiteStatement.bindNull(12);
                } else {
                    sQLiteStatement.bindText(12, strO3);
                }
                sQLiteStatement.bindLong(13, vVar.c());
                return;
        }
    }

    @Override // androidx.room.EntityInsertAdapter
    public final String createQuery() {
        switch (this.f248678a) {
            case 0:
                return "INSERT OR REPLACE INTO `card_owners_stats` (`id`,`transactionsNumber`,`latestTransactionTimestamp`) VALUES (?,?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `settings` (`key`,`value`) VALUES (?,?)";
            case 2:
                return "INSERT OR REPLACE INTO `payments_groups_bills` (`id`,`groupId`,`ownerId`,`createdBy`,`type`,`title`,`amount`,`currencyCode`,`exchangedAmount`,`createdDate`,`transactionId`,`transactionCategory`,`transactionLogo`,`lineItems`,`receiptImageUri`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 3:
                return "INSERT OR REPLACE INTO `payments_groups_bills_splits` (`id`,`billId`,`groupId`,`ownerId`,`amount`,`currencyCode`,`exchangedAmount`) VALUES (?,?,?,?,?,?,?)";
            case 4:
                return "INSERT OR REPLACE INTO `payments_groups` (`id`,`name`,`imageUrl`,`currencyCode`,`balance`,`isTrusted`,`updatedDate`,`lastFullSettlementDate`,`settings_calculationType`,`settings_baseCurrency`,`analytics_totalSpentByGroup`,`analytics_totalSpentByCurrentMember`,`analytics_currency`,`analytics_totalSpentByGroupByCurrency`,`analytics_totalSpentByCurrentMemberByCurrency`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 5:
                return "INSERT OR REPLACE INTO `payments_groups_debts` (`id`,`groupId`,`type`,`state`,`amount`,`currencyCode`,`displayAmount`,`displayCurrencyCode`,`payerId`,`payeeId`,`transferReasonRequired`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            case 6:
                return "INSERT OR REPLACE INTO `payments_groups_members` (`memberId`,`groupId`,`inviterId`,`contactId`,`type`,`firstName`,`lastName`,`countryCode`,`isRevolut`) VALUES (?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR REPLACE INTO `payments_groups_settlements` (`id`,`groupId`,`type`,`state`,`transactionId`,`paymentLinkId`,`payerId`,`payeeId`,`createdBy`,`amount`,`currencyCode`,`exchangedAmount`,`createdDate`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    public /* synthetic */ g(Object obj2, int i) {
        this.f248678a = i;
    }
}
