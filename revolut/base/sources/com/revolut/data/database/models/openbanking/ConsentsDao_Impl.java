package com.revolut.data.database.models.openbanking;

import androidx.annotation.NonNull;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteConnectionUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes.dex */
public final class ConsentsDao_Impl extends ConsentsDao {
    private final RoomDatabase __db;
    private final b21.a __commonTypeConverters = new b21.a();
    private final OpenBankingTypeConverters __openBankingTypeConverters = new OpenBankingTypeConverters();
    private final EntityInsertAdapter<ConsentEntity> __insertAdapterOfConsentEntity = new EntityInsertAdapter<ConsentEntity>() { // from class: com.revolut.data.database.models.openbanking.ConsentsDao_Impl.1
        @Override // androidx.room.EntityInsertAdapter
        @NonNull
        public String createQuery() {
            return "INSERT OR REPLACE INTO `consents` (`id`,`type`,`expiry_date`,`permissions`,`account_numbers`,`third_party_id`,`third_party_name`,`third_party_logo`,`is_active`) VALUES (?,?,?,?,?,?,?,?,?)";
        }

        @Override // androidx.room.EntityInsertAdapter
        public void bind(@NonNull SQLiteStatement sQLiteStatement, @NonNull ConsentEntity consentEntity) {
            if (consentEntity.getId() == null) {
                sQLiteStatement.bindNull(1);
            } else {
                sQLiteStatement.bindText(1, consentEntity.getId());
            }
            if (consentEntity.getType() == null) {
                sQLiteStatement.bindNull(2);
            } else {
                sQLiteStatement.bindText(2, consentEntity.getType());
            }
            b21.a aVar = ConsentsDao_Impl.this.__commonTypeConverters;
            DateTime expiryDate = consentEntity.getExpiryDate();
            aVar.getClass();
            Long lB = b21.a.b(expiryDate);
            if (lB == null) {
                sQLiteStatement.bindNull(3);
            } else {
                sQLiteStatement.bindLong(3, lB.longValue());
            }
            b21.a aVar2 = ConsentsDao_Impl.this.__commonTypeConverters;
            List<String> permissions = consentEntity.getPermissions();
            aVar2.getClass();
            String strM = b21.a.m(permissions);
            if (strM == null) {
                sQLiteStatement.bindNull(4);
            } else {
                sQLiteStatement.bindText(4, strM);
            }
            String strFromConsentAccountEntityToJson = ConsentsDao_Impl.this.__openBankingTypeConverters.fromConsentAccountEntityToJson(consentEntity.getAccountNumbers());
            if (strFromConsentAccountEntityToJson == null) {
                sQLiteStatement.bindNull(5);
            } else {
                sQLiteStatement.bindText(5, strFromConsentAccountEntityToJson);
            }
            if (consentEntity.getThirdPartyId() == null) {
                sQLiteStatement.bindNull(6);
            } else {
                sQLiteStatement.bindText(6, consentEntity.getThirdPartyId());
            }
            if (consentEntity.getThirdPartyName() == null) {
                sQLiteStatement.bindNull(7);
            } else {
                sQLiteStatement.bindText(7, consentEntity.getThirdPartyName());
            }
            if (consentEntity.getThirdPartyLogoUrl() == null) {
                sQLiteStatement.bindNull(8);
            } else {
                sQLiteStatement.bindText(8, consentEntity.getThirdPartyLogoUrl());
            }
            sQLiteStatement.bindLong(9, consentEntity.isActive() ? 1L : 0L);
        }
    };

    public ConsentsDao_Impl(@NonNull RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
    }

    @NonNull
    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$deleteAllActive$5(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM consents WHERE is_active is 1");
        try {
            sQLiteStatementPrepare.step();
            return Integer.valueOf(SQLiteConnectionUtil.getTotalChangedRows(sQLiteConnection));
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$deleteAllInactive$6(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM consents WHERE is_active is 0");
        try {
            sQLiteStatementPrepare.step();
            return Integer.valueOf(SQLiteConnectionUtil.getTotalChangedRows(sQLiteConnection));
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List lambda$getAllActive$3(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM consents WHERE is_active is 1");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "expiry_date");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "permissions");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "account_numbers");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "third_party_id");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "third_party_name");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "third_party_logo");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "is_active");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                Long lValueOf = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow3));
                this.__commonTypeConverters.getClass();
                DateTime dateTimeI = b21.a.i(lValueOf);
                String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                this.__commonTypeConverters.getClass();
                arrayList.add(new ConsentEntity(text, text2, dateTimeI, b21.a.k(text3), this.__openBankingTypeConverters.fromJsonToConsentAccountEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5)), sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6), sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7), sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8), ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9)) != 0));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List lambda$getAllInactive$4(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM consents WHERE is_active is 0");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "expiry_date");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "permissions");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "account_numbers");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "third_party_id");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "third_party_name");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "third_party_logo");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "is_active");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                Long lValueOf = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow3));
                this.__commonTypeConverters.getClass();
                DateTime dateTimeI = b21.a.i(lValueOf);
                String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                this.__commonTypeConverters.getClass();
                arrayList.add(new ConsentEntity(text, text2, dateTimeI, b21.a.k(text3), this.__openBankingTypeConverters.fromJsonToConsentAccountEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5)), sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6), sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7), sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8), ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9)) != 0));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$saveAll$0(List list, SQLiteConnection sQLiteConnection) {
        this.__insertAdapterOfConsentEntity.insert(sQLiteConnection, list);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit lambda$updateAll$1(List list, SQLiteConnection sQLiteConnection) {
        super.updateAll(list);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit lambda$updateAllInactive$2(List list, SQLiteConnection sQLiteConnection) {
        super.updateAllInactive(list);
        return Unit.f186387a;
    }

    @Override // com.revolut.data.database.models.openbanking.ConsentsDao
    public int deleteAllActive() {
        return ((Integer) DBUtil.performBlocking(this.__db, false, true, new cmc.c(25))).intValue();
    }

    @Override // com.revolut.data.database.models.openbanking.ConsentsDao
    public int deleteAllInactive() {
        return ((Integer) DBUtil.performBlocking(this.__db, false, true, new cmc.c(24))).intValue();
    }

    @Override // com.revolut.data.database.models.openbanking.ConsentsDao
    public List<ConsentEntity> getAllActive() {
        return (List) DBUtil.performBlocking(this.__db, true, true, new b(this, 0));
    }

    @Override // com.revolut.data.database.models.openbanking.ConsentsDao
    public List<ConsentEntity> getAllInactive() {
        return (List) DBUtil.performBlocking(this.__db, true, true, new b(this, 1));
    }

    @Override // com.revolut.data.database.models.openbanking.ConsentsDao
    public void saveAll(List<ConsentEntity> list) {
        list.getClass();
        DBUtil.performBlocking(this.__db, false, true, new a(this, list, 2));
    }

    @Override // com.revolut.data.database.models.openbanking.ConsentsDao
    public void updateAll(List<ConsentEntity> list) {
        DBUtil.performBlocking(this.__db, false, true, new a(this, list, 1));
    }

    @Override // com.revolut.data.database.models.openbanking.ConsentsDao
    public void updateAllInactive(List<ConsentEntity> list) {
        DBUtil.performBlocking(this.__db, false, true, new a(this, list, 0));
    }
}
