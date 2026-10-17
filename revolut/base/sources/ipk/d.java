package ipk;

import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.sqlite.SQLiteStatement;
import com.revolut.feature.contacts.impl.GsonHolder;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ml3.i;

/* JADX INFO: loaded from: classes13.dex */
public final class d extends EntityDeleteOrUpdateAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f167756a;

    public /* synthetic */ d(int i) {
        this.f167756a = i;
    }

    @Override // androidx.room.EntityDeleteOrUpdateAdapter
    public final void bind(SQLiteStatement sQLiteStatement, Object obj2) {
        String strK;
        switch (this.f167756a) {
            case 0:
                f fVar = (f) obj2;
                if (fVar.a() == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, fVar.a());
                }
                if (fVar.b() == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, fVar.b());
                }
                String strA = kpk.a.a(fVar.c());
                if (strA != null) {
                    sQLiteStatement.bindText(3, strA);
                } else {
                    sQLiteStatement.bindNull(3);
                }
                break;
            case 1:
                f fVar2 = (f) obj2;
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
                String strA2 = kpk.a.a(fVar2.c());
                if (strA2 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, strA2);
                }
                List listD = fVar2.d();
                String strR = listD != null ? com.revolut.data.database.models.openbanking.d.r("toJson(...)", listD) : null;
                if (strR == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, strR);
                }
                if (fVar2.a() == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, fVar2.a());
                }
                if (fVar2.b() == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindText(7, fVar2.b());
                }
                String strA3 = kpk.a.a(fVar2.c());
                if (strA3 != null) {
                    sQLiteStatement.bindText(8, strA3);
                } else {
                    sQLiteStatement.bindNull(8);
                }
                break;
            case 2:
                sQLiteStatement.bindLong(1, ((i) obj2).i());
                break;
            case 3:
                i iVar = (i) obj2;
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
                sQLiteStatement.bindLong(21, iVar.i());
                break;
            case 4:
                ukd.a aVar = (ukd.a) obj2;
                if (aVar.c() != null) {
                    sQLiteStatement.bindText(1, aVar.c());
                } else {
                    sQLiteStatement.bindNull(1);
                }
                break;
            default:
                sra.b bVar = (sra.b) obj2;
                if (bVar.d() == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, bVar.d());
                }
                if (bVar.c() == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, bVar.c());
                }
                if (bVar.f() == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, bVar.f());
                }
                if (bVar.e() == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, bVar.e());
                }
                if (bVar.b() == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, bVar.b());
                }
                if (bVar.h() == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, bVar.h());
                }
                sra.a cardEntity = bVar.a();
                Intrinsics.checkNotNullParameter(cardEntity, "cardEntity");
                String strK2 = com.revolut.data.utils.gson.GsonHolder.a().k(cardEntity);
                Intrinsics.checkNotNullExpressionValue(strK2, "toJson(...)");
                if (strK2 == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindText(7, strK2);
                }
                sQLiteStatement.bindLong(8, bVar.g() ? 1L : 0L);
                if (bVar.d() != null) {
                    sQLiteStatement.bindText(9, bVar.d());
                } else {
                    sQLiteStatement.bindNull(9);
                }
                break;
        }
    }

    @Override // androidx.room.EntityDeleteOrUpdateAdapter
    public final String createQuery() {
        switch (this.f167756a) {
            case 0:
                return "DELETE FROM `mid_rates_plot` WHERE `currencyFrom` = ? AND `currencyTo` = ? AND `duration` = ?";
            case 1:
                return "UPDATE OR ABORT `mid_rates_plot` SET `previousRangeCloseRate` = ?,`currencyFrom` = ?,`currencyTo` = ?,`duration` = ?,`plot` = ? WHERE `currencyFrom` = ? AND `currencyTo` = ? AND `duration` = ?";
            case 2:
                return "DELETE FROM `contact` WHERE `id` = ?";
            case 3:
                return "UPDATE OR REPLACE `contact` SET `id` = ?,`point` = ?,`displayedName` = ?,`firstName` = ?,`lastName` = ?,`registeredAs` = ?,`username` = ?,`code` = ?,`isRevolut` = ?,`isNewlyJoined` = ?,`joinDate` = ?,`birthday` = ?,`transactionsCount` = ?,`timestamp` = ?,`pictureUri` = ?,`type` = ?,`country` = ?,`appMode` = ?,`paidPlan` = ?,`customerType` = ? WHERE `id` = ?";
            case 4:
                return "DELETE FROM `slot_actions` WHERE `id` = ?";
            default:
                return "UPDATE OR ABORT `card_owners` SET `id` = ?,`firstName` = ?,`lastName` = ?,`label` = ?,`email` = ?,`type` = ?,`card` = ?,`twoFaRequired` = ? WHERE `id` = ?";
        }
    }
}
