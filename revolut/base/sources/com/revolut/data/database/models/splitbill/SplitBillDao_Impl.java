package com.revolut.data.database.models.splitbill;

import amh.n;
import androidx.annotation.NonNull;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import cma.b;
import com.revolut.data.database.models.splitbill.typeconverter.SplitBillTypeConverter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import prk.o;

/* JADX INFO: loaded from: classes.dex */
public final class SplitBillDao_Impl extends SplitBillDao {
    private final RoomDatabase __db;
    private final SplitBillTypeConverter __splitBillTypeConverter = new SplitBillTypeConverter();
    private final EntityInsertAdapter<SplitBillEntity> __insertAdapterOfSplitBillEntity = new EntityInsertAdapter<SplitBillEntity>() { // from class: com.revolut.data.database.models.splitbill.SplitBillDao_Impl.1
        @Override // androidx.room.EntityInsertAdapter
        @NonNull
        public String createQuery() {
            return "INSERT OR REPLACE INTO `split_bill` (`id`,`state`,`currency`,`comment`,`owner_id`,`dateTime`,`splitted_items`,`money_requests`,`registered_identity_id`) VALUES (?,?,?,?,?,?,?,?,?)";
        }

        @Override // androidx.room.EntityInsertAdapter
        public void bind(@NonNull SQLiteStatement sQLiteStatement, @NonNull SplitBillEntity splitBillEntity) {
            if (splitBillEntity.getId() == null) {
                sQLiteStatement.bindNull(1);
            } else {
                sQLiteStatement.bindText(1, splitBillEntity.getId());
            }
            if (splitBillEntity.getState() == null) {
                sQLiteStatement.bindNull(2);
            } else {
                sQLiteStatement.bindText(2, splitBillEntity.getState());
            }
            if (splitBillEntity.getCurrency() == null) {
                sQLiteStatement.bindNull(3);
            } else {
                sQLiteStatement.bindText(3, splitBillEntity.getCurrency());
            }
            if (splitBillEntity.getComment() == null) {
                sQLiteStatement.bindNull(4);
            } else {
                sQLiteStatement.bindText(4, splitBillEntity.getComment());
            }
            if (splitBillEntity.getOwnerId() == null) {
                sQLiteStatement.bindNull(5);
            } else {
                sQLiteStatement.bindText(5, splitBillEntity.getOwnerId());
            }
            sQLiteStatement.bindLong(6, splitBillEntity.getDatetime());
            String strSplittedItemEntityToJson = SplitBillDao_Impl.this.__splitBillTypeConverter.splittedItemEntityToJson(splitBillEntity.getSplittedItems());
            if (strSplittedItemEntityToJson == null) {
                sQLiteStatement.bindNull(7);
            } else {
                sQLiteStatement.bindText(7, strSplittedItemEntityToJson);
            }
            String strMoneyRequestsToJson = SplitBillDao_Impl.this.__splitBillTypeConverter.moneyRequestsToJson(splitBillEntity.getMoneyRequests());
            if (strMoneyRequestsToJson == null) {
                sQLiteStatement.bindNull(8);
            } else {
                sQLiteStatement.bindText(8, strMoneyRequestsToJson);
            }
            if (splitBillEntity.getRegisteredIdentityId() == null) {
                sQLiteStatement.bindNull(9);
            } else {
                sQLiteStatement.bindText(9, splitBillEntity.getRegisteredIdentityId());
            }
        }
    };

    public SplitBillDao_Impl(@NonNull RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
    }

    @NonNull
    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$createOrUpdate$1(SplitBillEntity splitBillEntity, SQLiteConnection sQLiteConnection) {
        this.__insertAdapterOfSplitBillEntity.insert(sQLiteConnection, splitBillEntity);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$createOrUpdateSplitBills$0(List list, SQLiteConnection sQLiteConnection) {
        this.__insertAdapterOfSplitBillEntity.insert(sQLiteConnection, list);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$deleteAllById$5(String str, List list, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            Iterator it8 = list.iterator();
            int i = 1;
            while (it8.hasNext()) {
                String str2 = (String) it8.next();
                if (str2 == null) {
                    sQLiteStatementPrepare.bindNull(i);
                } else {
                    sQLiteStatementPrepare.bindText(i, str2);
                }
                i++;
            }
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return null;
        } catch (Throwable th10) {
            sQLiteStatementPrepare.close();
            throw th10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ SplitBillEntity lambda$getById$4(String str, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM split_bill WHERE id = ?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.bindNull(1);
            } else {
                sQLiteStatementPrepare.bindText(1, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "state");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "currency");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "comment");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "owner_id");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "dateTime");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "splitted_items");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "money_requests");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "registered_identity_id");
            SplitBillEntity splitBillEntity = null;
            if (sQLiteStatementPrepare.step()) {
                splitBillEntity = new SplitBillEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5), sQLiteStatementPrepare.getLong(columnIndexOrThrow6), this.__splitBillTypeConverter.jsonToSplittedItemEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7)), this.__splitBillTypeConverter.jsonToMoneyRequests(sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8)), sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9));
            }
            sQLiteStatementPrepare.close();
            return splitBillEntity;
        } catch (Throwable th10) {
            sQLiteStatementPrepare.close();
            throw th10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit lambda$replaceAll$2(List list, SQLiteConnection sQLiteConnection) {
        super.replaceAll(list);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List lambda$splitBills$3(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM split_bill");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "state");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "currency");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "comment");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "owner_id");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "dateTime");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "splitted_items");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "money_requests");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "registered_identity_id");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(new SplitBillEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5), sQLiteStatementPrepare.getLong(columnIndexOrThrow6), this.__splitBillTypeConverter.jsonToSplittedItemEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7)), this.__splitBillTypeConverter.jsonToMoneyRequests(sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8)), sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9)));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // com.revolut.data.database.models.splitbill.SplitBillDao
    public void createOrUpdate(SplitBillEntity splitBillEntity) {
        splitBillEntity.getClass();
        DBUtil.performBlocking(this.__db, false, true, new b(this, splitBillEntity, 8));
    }

    @Override // com.revolut.data.database.models.splitbill.SplitBillDao
    public void createOrUpdateSplitBills(List<SplitBillEntity> list) {
        list.getClass();
        DBUtil.performBlocking(this.__db, false, true, new a(this, list, 1));
    }

    @Override // com.revolut.data.database.models.splitbill.SplitBillDao
    public void deleteAllById(List<String> list) {
        DBUtil.performBlocking(this.__db, false, true, new n(o.p(")", list, p.a.s("DELETE FROM split_bill WHERE id in (")), list, 3));
    }

    @Override // com.revolut.data.database.models.splitbill.SplitBillDao
    public SplitBillEntity getById(String str) {
        return (SplitBillEntity) DBUtil.performBlocking(this.__db, true, false, new b(this, str, 9));
    }

    @Override // com.revolut.data.database.models.splitbill.SplitBillDao
    public void replaceAll(List<SplitBillEntity> list) {
        DBUtil.performBlocking(this.__db, false, true, new a(this, list, 0));
    }

    @Override // com.revolut.data.database.models.splitbill.SplitBillDao
    public List<SplitBillEntity> splitBills() {
        return (List) DBUtil.performBlocking(this.__db, true, false, new ce9.a(this, 28));
    }
}
