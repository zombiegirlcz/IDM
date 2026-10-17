package com.revolut.data.database.models.transactioncategory;

import androidx.annotation.NonNull;
import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RxRoom;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteConnectionUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import c86.c;
import cma.b;
import efm.d0;
import efm.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class TransactionCustomCategoryDao_Impl extends TransactionCustomCategoryDao {
    private final RoomDatabase __db;
    private final EntityInsertAdapter<TransactionCustomCategoryEntity> __insertAdapterOfTransactionCustomCategoryEntity = new EntityInsertAdapter<TransactionCustomCategoryEntity>() { // from class: com.revolut.data.database.models.transactioncategory.TransactionCustomCategoryDao_Impl.1
        @Override // androidx.room.EntityInsertAdapter
        @NonNull
        public String createQuery() {
            return "INSERT OR REPLACE INTO `transaction_custom_category` (`id`,`walletId`,`title`,`image`,`color`) VALUES (?,?,?,?,?)";
        }

        @Override // androidx.room.EntityInsertAdapter
        public void bind(@NonNull SQLiteStatement sQLiteStatement, @NonNull TransactionCustomCategoryEntity transactionCustomCategoryEntity) {
            if (transactionCustomCategoryEntity.getId() == null) {
                sQLiteStatement.bindNull(1);
            } else {
                sQLiteStatement.bindText(1, transactionCustomCategoryEntity.getId());
            }
            if (transactionCustomCategoryEntity.getWalletId() == null) {
                sQLiteStatement.bindNull(2);
            } else {
                sQLiteStatement.bindText(2, transactionCustomCategoryEntity.getWalletId());
            }
            if (transactionCustomCategoryEntity.getTitle() == null) {
                sQLiteStatement.bindNull(3);
            } else {
                sQLiteStatement.bindText(3, transactionCustomCategoryEntity.getTitle());
            }
            if (transactionCustomCategoryEntity.getImage() == null) {
                sQLiteStatement.bindNull(4);
            } else {
                sQLiteStatement.bindText(4, transactionCustomCategoryEntity.getImage());
            }
            if (transactionCustomCategoryEntity.getColor() == null) {
                sQLiteStatement.bindNull(5);
            } else {
                sQLiteStatement.bindText(5, transactionCustomCategoryEntity.getColor());
            }
        }
    };
    private final EntityDeleteOrUpdateAdapter<TransactionCustomCategoryEntity> __deleteAdapterOfTransactionCustomCategoryEntity = new EntityDeleteOrUpdateAdapter<TransactionCustomCategoryEntity>() { // from class: com.revolut.data.database.models.transactioncategory.TransactionCustomCategoryDao_Impl.2
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        @NonNull
        public String createQuery() {
            return "DELETE FROM `transaction_custom_category` WHERE `id` = ?";
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public void bind(@NonNull SQLiteStatement sQLiteStatement, @NonNull TransactionCustomCategoryEntity transactionCustomCategoryEntity) {
            if (transactionCustomCategoryEntity.getId() == null) {
                sQLiteStatement.bindNull(1);
            } else {
                sQLiteStatement.bindText(1, transactionCustomCategoryEntity.getId());
            }
        }
    };
    private final EntityDeleteOrUpdateAdapter<TransactionCustomCategoryEntity> __updateAdapterOfTransactionCustomCategoryEntity = new EntityDeleteOrUpdateAdapter<TransactionCustomCategoryEntity>() { // from class: com.revolut.data.database.models.transactioncategory.TransactionCustomCategoryDao_Impl.3
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        @NonNull
        public String createQuery() {
            return "UPDATE OR ABORT `transaction_custom_category` SET `id` = ?,`walletId` = ?,`title` = ?,`image` = ?,`color` = ? WHERE `id` = ?";
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public void bind(@NonNull SQLiteStatement sQLiteStatement, @NonNull TransactionCustomCategoryEntity transactionCustomCategoryEntity) {
            if (transactionCustomCategoryEntity.getId() == null) {
                sQLiteStatement.bindNull(1);
            } else {
                sQLiteStatement.bindText(1, transactionCustomCategoryEntity.getId());
            }
            if (transactionCustomCategoryEntity.getWalletId() == null) {
                sQLiteStatement.bindNull(2);
            } else {
                sQLiteStatement.bindText(2, transactionCustomCategoryEntity.getWalletId());
            }
            if (transactionCustomCategoryEntity.getTitle() == null) {
                sQLiteStatement.bindNull(3);
            } else {
                sQLiteStatement.bindText(3, transactionCustomCategoryEntity.getTitle());
            }
            if (transactionCustomCategoryEntity.getImage() == null) {
                sQLiteStatement.bindNull(4);
            } else {
                sQLiteStatement.bindText(4, transactionCustomCategoryEntity.getImage());
            }
            if (transactionCustomCategoryEntity.getColor() == null) {
                sQLiteStatement.bindNull(5);
            } else {
                sQLiteStatement.bindText(5, transactionCustomCategoryEntity.getColor());
            }
            if (transactionCustomCategoryEntity.getId() == null) {
                sQLiteStatement.bindNull(6);
            } else {
                sQLiteStatement.bindText(6, transactionCustomCategoryEntity.getId());
            }
        }
    };

    public TransactionCustomCategoryDao_Impl(@NonNull RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
    }

    @NonNull
    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$delete$2(TransactionCustomCategoryEntity transactionCustomCategoryEntity, SQLiteConnection sQLiteConnection) {
        this.__deleteAdapterOfTransactionCustomCategoryEntity.handle(sQLiteConnection, transactionCustomCategoryEntity);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$delete$8(String str, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM transaction_custom_category WHERE ( id == ? )");
        try {
            if (str == null) {
                sQLiteStatementPrepare.bindNull(1);
            } else {
                sQLiteStatementPrepare.bindText(1, str);
            }
            sQLiteStatementPrepare.step();
            Integer numValueOf = Integer.valueOf(SQLiteConnectionUtil.getTotalChangedRows(sQLiteConnection));
            sQLiteStatementPrepare.close();
            return numValueOf;
        } catch (Throwable th10) {
            sQLiteStatementPrepare.close();
            throw th10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$getAll$5(String str, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM transaction_custom_category WHERE walletId = ?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.bindNull(1);
            } else {
                sQLiteStatementPrepare.bindText(1, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "walletId");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "title");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "image");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "color");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(new TransactionCustomCategoryEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5)));
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th10) {
            sQLiteStatementPrepare.close();
            throw th10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ TransactionCustomCategoryEntity lambda$getById$6(String str, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM transaction_custom_category WHERE id = ?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.bindNull(1);
            } else {
                sQLiteStatementPrepare.bindText(1, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "walletId");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "title");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "image");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "color");
            TransactionCustomCategoryEntity transactionCustomCategoryEntity = null;
            if (sQLiteStatementPrepare.step()) {
                transactionCustomCategoryEntity = new TransactionCustomCategoryEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
            }
            sQLiteStatementPrepare.close();
            return transactionCustomCategoryEntity;
        } catch (Throwable th10) {
            sQLiteStatementPrepare.close();
            throw th10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ TransactionCustomCategoryEntity lambda$getIfExistById$7(String str, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM transaction_custom_category WHERE id = ?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.bindNull(1);
            } else {
                sQLiteStatementPrepare.bindText(1, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "walletId");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "title");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "image");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "color");
            TransactionCustomCategoryEntity transactionCustomCategoryEntity = null;
            if (sQLiteStatementPrepare.step()) {
                transactionCustomCategoryEntity = new TransactionCustomCategoryEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
            }
            sQLiteStatementPrepare.close();
            return transactionCustomCategoryEntity;
        } catch (Throwable th10) {
            sQLiteStatementPrepare.close();
            throw th10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$insert$0(TransactionCustomCategoryEntity transactionCustomCategoryEntity, SQLiteConnection sQLiteConnection) {
        this.__insertAdapterOfTransactionCustomCategoryEntity.insert(sQLiteConnection, transactionCustomCategoryEntity);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$insertAll$1(List list, SQLiteConnection sQLiteConnection) {
        this.__insertAdapterOfTransactionCustomCategoryEntity.insert(sQLiteConnection, list);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$observeAll$4(String str, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM transaction_custom_category WHERE walletId = ?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.bindNull(1);
            } else {
                sQLiteStatementPrepare.bindText(1, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "walletId");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "title");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "image");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "color");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(new TransactionCustomCategoryEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5)));
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th10) {
            sQLiteStatementPrepare.close();
            throw th10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer lambda$update$3(TransactionCustomCategoryEntity transactionCustomCategoryEntity, SQLiteConnection sQLiteConnection) {
        return Integer.valueOf(this.__updateAdapterOfTransactionCustomCategoryEntity.handle(sQLiteConnection, transactionCustomCategoryEntity));
    }

    @Override // com.revolut.data.database.models.transactioncategory.TransactionCustomCategoryDao
    public List<TransactionCustomCategoryEntity> getAll(String str) {
        return (List) DBUtil.performBlocking(this.__db, true, false, new c(str, 13));
    }

    @Override // com.revolut.data.database.models.transactioncategory.TransactionCustomCategoryDao
    public d0<TransactionCustomCategoryEntity> getById(String str) {
        return RxRoom.createSingle(this.__db, true, false, new c(str, 12));
    }

    @Override // com.revolut.data.database.models.transactioncategory.TransactionCustomCategoryDao
    public TransactionCustomCategoryEntity getIfExistById(String str) {
        return (TransactionCustomCategoryEntity) DBUtil.performBlocking(this.__db, true, false, new c(str, 15));
    }

    @Override // com.revolut.data.database.models.transactioncategory.TransactionCustomCategoryDao
    public void insert(TransactionCustomCategoryEntity transactionCustomCategoryEntity) {
        transactionCustomCategoryEntity.getClass();
        DBUtil.performBlocking(this.__db, false, true, new a(this, transactionCustomCategoryEntity, 0));
    }

    @Override // com.revolut.data.database.models.transactioncategory.TransactionCustomCategoryDao
    public void insertAll(List<TransactionCustomCategoryEntity> list) {
        list.getClass();
        DBUtil.performBlocking(this.__db, false, true, new b(this, list, 10));
    }

    @Override // com.revolut.data.database.models.transactioncategory.TransactionCustomCategoryDao
    public r<List<TransactionCustomCategoryEntity>> observeAll(String str) {
        return RxRoom.createObservable(this.__db, false, new String[]{"transaction_custom_category"}, new c(str, 16));
    }

    @Override // t11.b2
    public void delete(TransactionCustomCategoryEntity transactionCustomCategoryEntity) {
        transactionCustomCategoryEntity.getClass();
        DBUtil.performBlocking(this.__db, false, true, new a(this, transactionCustomCategoryEntity, 2));
    }

    @Override // t11.b2
    public int update(TransactionCustomCategoryEntity transactionCustomCategoryEntity) {
        transactionCustomCategoryEntity.getClass();
        return ((Integer) DBUtil.performBlocking(this.__db, false, true, new a(this, transactionCustomCategoryEntity, 1))).intValue();
    }

    @Override // com.revolut.data.database.models.transactioncategory.TransactionCustomCategoryDao
    public int delete(String str) {
        return ((Integer) DBUtil.performBlocking(this.__db, false, true, new c(str, 14))).intValue();
    }
}
