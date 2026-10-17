package c18;

import androidx.room.EntityInsertAdapter;
import androidx.sqlite.SQLiteStatement;
import e18.l;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import rlm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends EntityInsertAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f20423b;

    public /* synthetic */ e(f fVar, int i) {
        this.f20422a = i;
        this.f20423b = fVar;
    }

    @Override // androidx.room.EntityInsertAdapter
    public final void bind(SQLiteStatement sQLiteStatement, Object obj2) {
        String str;
        String strC;
        switch (this.f20422a) {
            case 0:
                e18.e eVar = (e18.e) obj2;
                String str2 = eVar.f121912a;
                if (str2 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str2);
                }
                f fVar = this.f20423b;
                f18.b bVar = fVar.f20426c;
                Long lD = b21.a.d(eVar.f121913b);
                if (lD == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindLong(2, lD.longValue());
                }
                e18.f type = eVar.f121914c;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(type, "type");
                int i = f18.a.f131178a[type.ordinal()];
                if (i == 1) {
                    str = "REV_INSIGHTS";
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "PRICE_ALERTS";
                }
                sQLiteStatement.bindText(3, str);
                String str3 = eVar.d;
                if (str3 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, str3);
                }
                String str4 = eVar.e;
                if (str4 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, str4);
                }
                String str5 = eVar.f;
                if (str5 == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, str5);
                }
                List assetFilters = eVar.f121915g;
                Intrinsics.checkNotNullParameter(assetFilters, "assetFilters");
                o oVar = bVar.f131179a;
                oVar.getClass();
                sQLiteStatement.bindText(7, oVar.c(new qlm.e(e18.b.Companion.serializer()), assetFilters));
                f18.c cVar = fVar.d;
                l lVar = eVar.f121916h;
                if (lVar != null) {
                    strC = cVar.f131180a.c(l.Companion.serializer(), lVar);
                } else {
                    cVar.getClass();
                    strC = null;
                }
                if (strC == null) {
                    sQLiteStatement.bindNull(8);
                    return;
                } else {
                    sQLiteStatement.bindText(8, strC);
                    return;
                }
            default:
                e18.c cVar2 = (e18.c) obj2;
                String str6 = cVar2.f121910a;
                if (str6 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str6);
                }
                f18.b bVar2 = this.f20423b.f20426c;
                e18.b assetFilter = cVar2.f121911b;
                bVar2.getClass();
                Intrinsics.checkNotNullParameter(assetFilter, "assetFilter");
                o oVar2 = bVar2.f131179a;
                oVar2.getClass();
                sQLiteStatement.bindText(2, oVar2.c(e18.b.Companion.serializer(), assetFilter));
                return;
        }
    }

    @Override // androidx.room.EntityInsertAdapter
    public final String createQuery() {
        switch (this.f20422a) {
            case 0:
                return "INSERT OR REPLACE INTO `smart_notification_feed` (`id`,`date`,`type`,`title`,`subtitle`,`ref`,`assetType`,`priceImpact`) VALUES (?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR REPLACE INTO `feed_asset_types` (`feedId`,`type`) VALUES (?,?)";
        }
    }
}
