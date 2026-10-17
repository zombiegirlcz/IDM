package ro5;

import androidx.room.EntityInsertAdapter;
import androidx.sqlite.SQLiteStatement;
import java.util.List;
import qlm.e;
import qlm.v1;
import qo5.j;
import qo5.n;

/* JADX INFO: loaded from: classes13.dex */
public final class c extends EntityInsertAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f255880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f255881b;

    public /* synthetic */ c(d dVar, int i) {
        this.f255880a = i;
        this.f255881b = dVar;
    }

    @Override // androidx.room.EntityInsertAdapter
    public final void bind(SQLiteStatement sQLiteStatement, Object obj2) {
        String strC;
        String strC2;
        String strC3;
        String strC4;
        String strC5;
        switch (this.f255880a) {
            case 0:
                qo5.d dVar = (qo5.d) obj2;
                if (dVar.j() == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, dVar.j());
                }
                if (dVar.f() == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, dVar.f());
                }
                if (dVar.e() == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, dVar.e());
                }
                if (dVar.a() == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, dVar.a());
                }
                if (dVar.g() == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, dVar.g());
                }
                sQLiteStatement.bindLong(6, dVar.i() ? 1L : 0L);
                if (dVar.m() == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindText(7, dVar.m());
                }
                if (dVar.b() == null) {
                    sQLiteStatement.bindNull(8);
                } else {
                    sQLiteStatement.bindText(8, dVar.b());
                }
                d dVar2 = this.f255881b;
                to5.d dVarD = dVar2.d();
                List listH = dVar.h();
                String strC6 = null;
                if (listH != null) {
                    strC = dVarD.f272513a.c(new e(v1.f247718a), listH);
                } else {
                    dVarD.getClass();
                    strC = null;
                }
                if (strC == null) {
                    sQLiteStatement.bindNull(9);
                } else {
                    sQLiteStatement.bindText(9, strC);
                }
                sQLiteStatement.bindLong(10, dVar.n() ? 1L : 0L);
                to5.b bVarB = dVar2.b();
                j jVarL = dVar.l();
                if (jVarL != null) {
                    strC2 = bVarB.f272511a.c(j.Companion.serializer(), jVarL);
                } else {
                    bVarB.getClass();
                    strC2 = null;
                }
                if (strC2 == null) {
                    sQLiteStatement.bindNull(11);
                } else {
                    sQLiteStatement.bindText(11, strC2);
                }
                sQLiteStatement.bindLong(12, dVar.o() ? 1L : 0L);
                to5.c cVarC = dVar2.c();
                ep5.c cVarK = dVar.k();
                if (cVarK != null) {
                    strC3 = cVarC.f272512a.c(ep5.c.Companion.serializer(), cVarK);
                } else {
                    cVarC.getClass();
                    strC3 = null;
                }
                if (strC3 == null) {
                    sQLiteStatement.bindNull(13);
                } else {
                    sQLiteStatement.bindText(13, strC3);
                }
                sQLiteStatement.bindLong(14, dVar.d());
                to5.a aVarA = dVar2.a();
                qo5.c cVarC2 = dVar.c();
                if (cVarC2 != null) {
                    strC6 = aVarA.f272510a.c(qo5.c.Companion.serializer(), cVarC2);
                } else {
                    aVarA.getClass();
                }
                if (strC6 != null) {
                    sQLiteStatement.bindText(15, strC6);
                } else {
                    sQLiteStatement.bindNull(15);
                }
                break;
            default:
                n nVar = (n) obj2;
                if (nVar.c() == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, nVar.c());
                }
                if (nVar.a() == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, nVar.a());
                }
                if (nVar.b() == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, nVar.b());
                }
                d dVar3 = this.f255881b;
                to5.b bVarB2 = dVar3.b();
                j jVarG = nVar.g();
                String strC7 = null;
                if (jVarG != null) {
                    strC4 = bVarB2.f272511a.c(j.Companion.serializer(), jVarG);
                } else {
                    bVarB2.getClass();
                    strC4 = null;
                }
                if (strC4 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, strC4);
                }
                to5.d dVarD2 = dVar3.d();
                List listF = nVar.f();
                if (listF != null) {
                    strC5 = dVarD2.f272513a.c(new e(v1.f247718a), listF);
                } else {
                    dVarD2.getClass();
                    strC5 = null;
                }
                if (strC5 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, strC5);
                }
                sQLiteStatement.bindLong(6, nVar.i() ? 1L : 0L);
                if (nVar.h() == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindText(7, nVar.h());
                }
                to5.c cVarC3 = dVar3.c();
                ep5.c cVarE = nVar.e();
                if (cVarE != null) {
                    strC7 = cVarC3.f272512a.c(ep5.c.Companion.serializer(), cVarE);
                } else {
                    cVarC3.getClass();
                }
                if (strC7 == null) {
                    sQLiteStatement.bindNull(8);
                } else {
                    sQLiteStatement.bindText(8, strC7);
                }
                if (nVar.d() != null) {
                    sQLiteStatement.bindText(9, nVar.d());
                } else {
                    sQLiteStatement.bindNull(9);
                }
                break;
        }
    }

    @Override // androidx.room.EntityInsertAdapter
    public final String createQuery() {
        switch (this.f255880a) {
            case 0:
                return "INSERT OR REPLACE INTO `crypto_addresses` (`id`,`description`,`currency`,`address`,`destinationTag`,`hasTransactions`,`status`,`blockchain`,`flags`,`isHidden`,`recipientDetails`,`isRevolutAddress`,`limits`,`createdDate`,`counterparty`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR REPLACE INTO `crypto_wallets` (`id`,`address`,`addressType`,`recipientDetails`,`linkedBeneficiaries`,`isHidden`,`status`,`limits`,`label`) VALUES (?,?,?,?,?,?,?,?,?)";
        }
    }
}
