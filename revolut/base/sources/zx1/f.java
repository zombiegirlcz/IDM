package zx1;

import androidx.room.EntityInsertAdapter;
import androidx.sqlite.SQLiteStatement;
import kotlin.jvm.internal.Intrinsics;
import le.u1;

/* JADX INFO: loaded from: classes20.dex */
public final class f extends EntityInsertAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f326028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f326029b;

    public /* synthetic */ f(Object obj2, int i) {
        this.f326028a = i;
        this.f326029b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Map] */
    @Override // androidx.room.EntityInsertAdapter
    public final void bind(SQLiteStatement sQLiteStatement, Object obj2) {
        String str;
        switch (this.f326028a) {
            case 0:
                i iVar = (i) obj2;
                String str2 = iVar.f326033a;
                if (str2 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str2);
                }
                String str3 = iVar.f326034b;
                if (str3 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str3);
                }
                String str4 = iVar.f326035c;
                if (str4 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, str4);
                }
                String str5 = iVar.d;
                if (str5 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, str5);
                }
                String str6 = iVar.e;
                if (str6 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, str6);
                }
                String str7 = iVar.f;
                if (str7 == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, str7);
                }
                String str8 = iVar.f326036g;
                if (str8 == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindText(7, str8);
                }
                h hVar = (h) this.f326029b;
                wx1.b bVar = iVar.f326037h;
                hVar.getClass();
                int i = g.f326030a[bVar.ordinal()];
                if (i == 1) {
                    str = "ACTIVE";
                } else {
                    if (i != 2) {
                        throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: " + bVar);
                    }
                    str = "DELETED";
                }
                sQLiteStatement.bindText(8, str);
                return;
            default:
                zzj.a aVar = (zzj.a) obj2;
                yzj.a aVar2 = ((zzj.d) this.f326029b).f326762c;
                rzj.c symbolScope = aVar.f326754a;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(symbolScope, "symbolScope");
                sQLiteStatement.bindText(1, u1.g(symbolScope, aVar2.f318115b));
                rzj.d symbolType = aVar.f326755b;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(symbolType, "symbolType");
                sQLiteStatement.bindText(2, u1.g(symbolType, aVar2.f318114a));
                String str9 = aVar.f326756c;
                if (str9 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, str9);
                }
                String str10 = aVar.d;
                if (str10 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, str10);
                }
                String str11 = aVar.e;
                if (str11 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, str11);
                }
                String str12 = aVar.f;
                if (str12 == null) {
                    sQLiteStatement.bindNull(6);
                    return;
                } else {
                    sQLiteStatement.bindText(6, str12);
                    return;
                }
        }
    }

    @Override // androidx.room.EntityInsertAdapter
    public final String createQuery() {
        switch (this.f326028a) {
            case 0:
                return "INSERT OR REPLACE INTO `multibanco_contacts` (`id`,`idValue`,`descriptor`,`descriptorValue`,`contactName`,`alias`,`photoUri`,`state`) VALUES (?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR REPLACE INTO `scoped_symbols` (`scope`,`symbolType`,`symbol`,`ref`,`baseCurrency`,`name`) VALUES (?,?,?,?,?,?)";
        }
    }
}
