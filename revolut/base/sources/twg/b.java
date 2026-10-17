package twg;

import androidx.room.EntityInsertAdapter;
import androidx.sqlite.SQLiteStatement;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import vwg.d0;
import vwg.f;
import vwg.o;
import vwg.r;
import vwg.x;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends EntityInsertAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f275015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f275016b;

    public /* synthetic */ b(c cVar, int i) {
        this.f275015a = i;
        this.f275016b = cVar;
    }

    @Override // androidx.room.EntityInsertAdapter
    public final void bind(SQLiteStatement sQLiteStatement, Object obj2) {
        String strC;
        switch (this.f275015a) {
            case 0:
                f fVar = (f) obj2;
                String str = fVar.f292733a;
                if (str == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str);
                }
                c cVar = this.f275016b;
                e eVarA = cVar.a();
                d0 entity = fVar.f292734b;
                eVarA.getClass();
                Intrinsics.checkNotNullParameter(entity, "entity");
                sQLiteStatement.bindText(2, eVarA.f275021a.c(d0.Companion.serializer(), entity));
                e eVarA2 = cVar.a();
                x xVar = fVar.f292735c;
                if (xVar != null) {
                    strC = eVarA2.f275021a.c(x.Companion.serializer(), xVar);
                } else {
                    eVarA2.getClass();
                    strC = null;
                }
                if (strC == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, strC);
                }
                e eVarA3 = cVar.a();
                List entity2 = fVar.d;
                eVarA3.getClass();
                Intrinsics.checkNotNullParameter(entity2, "entity");
                sQLiteStatement.bindText(4, eVarA3.f275021a.c(nlm.a.a(o.Companion.serializer()), entity2));
                break;
            case 1:
                vwg.d dVar = (vwg.d) obj2;
                String str2 = dVar.f292725a;
                if (str2 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str2);
                }
                String str3 = dVar.f292726b;
                if (str3 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str3);
                }
                String str4 = dVar.f292727c;
                if (str4 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, str4);
                }
                String str5 = dVar.d;
                if (str5 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, str5);
                }
                String str6 = dVar.e;
                if (str6 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, str6);
                }
                String str7 = dVar.f;
                if (str7 == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, str7);
                }
                c cVar2 = this.f275016b;
                e eVarA4 = cVar2.a();
                r entity3 = dVar.f292728g;
                eVarA4.getClass();
                Intrinsics.checkNotNullParameter(entity3, "entity");
                sQLiteStatement.bindText(7, eVarA4.f275021a.c(r.Companion.serializer(), entity3));
                e eVarA5 = cVar2.a();
                List entity4 = dVar.f292729h;
                eVarA5.getClass();
                Intrinsics.checkNotNullParameter(entity4, "entity");
                sQLiteStatement.bindText(8, eVarA5.f275021a.c(nlm.a.a(vwg.c.Companion.serializer()), entity4));
                break;
            default:
                ((vwg.e) obj2).getClass();
                sQLiteStatement.bindNull(1);
                sQLiteStatement.bindNull(2);
                sQLiteStatement.bindNull(3);
                sQLiteStatement.bindNull(4);
                e eVarA6 = this.f275016b.a();
                eVarA6.getClass();
                Intrinsics.checkNotNullParameter(null, "entity");
                sQLiteStatement.bindText(5, eVarA6.f275021a.c(r.Companion.serializer(), null));
                String strM = b21.a.m(null);
                if (strM != null) {
                    sQLiteStatement.bindText(6, strM);
                } else {
                    sQLiteStatement.bindNull(6);
                }
                break;
        }
    }

    @Override // androidx.room.EntityInsertAdapter
    public final String createQuery() {
        switch (this.f275015a) {
            case 0:
                return "INSERT OR REPLACE INTO `portfolio_insights` (`portfolio_id`,`usage_requirements`,`summary`,`indicators`) VALUES (?,?,?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `portfolio_insights_asset_indicator` (`portfolio_id`,`key`,`title`,`description`,`sort_order_label`,`sort_order`,`info`,`assets`) VALUES (?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR REPLACE INTO `portfolio_insights_collection_indicator` (`portfolio_id`,`key`,`title`,`description`,`info`,`collections`) VALUES (?,?,?,?,?,?)";
        }
    }
}
