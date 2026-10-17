package com.revolut.data.database.models.statement;

import androidx.annotation.NonNull;
import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import avj.o;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class StatementTemplatesInfoDao_Impl extends StatementTemplatesInfoDao {
    private final RoomDatabase __db;
    private final EntityInsertAdapter<StatementTemplateInfoEntity> __insertAdapterOfStatementTemplateInfoEntity = new EntityInsertAdapter<StatementTemplateInfoEntity>() { // from class: com.revolut.data.database.models.statement.StatementTemplatesInfoDao_Impl.1
        @Override // androidx.room.EntityInsertAdapter
        @NonNull
        public String createQuery() {
            return "INSERT OR REPLACE INTO `statement_template_info` (`id`,`checkSum`,`url`,`accountId`) VALUES (?,?,?,?)";
        }

        @Override // androidx.room.EntityInsertAdapter
        public void bind(@NonNull SQLiteStatement sQLiteStatement, @NonNull StatementTemplateInfoEntity statementTemplateInfoEntity) {
            if (statementTemplateInfoEntity.getId() == null) {
                sQLiteStatement.bindNull(1);
            } else {
                sQLiteStatement.bindText(1, statementTemplateInfoEntity.getId());
            }
            if (statementTemplateInfoEntity.getCheckSum() == null) {
                sQLiteStatement.bindNull(2);
            } else {
                sQLiteStatement.bindText(2, statementTemplateInfoEntity.getCheckSum());
            }
            if (statementTemplateInfoEntity.getUrl() == null) {
                sQLiteStatement.bindNull(3);
            } else {
                sQLiteStatement.bindText(3, statementTemplateInfoEntity.getUrl());
            }
            if (statementTemplateInfoEntity.getAccountId() == null) {
                sQLiteStatement.bindNull(4);
            } else {
                sQLiteStatement.bindText(4, statementTemplateInfoEntity.getAccountId());
            }
        }
    };
    private final EntityDeleteOrUpdateAdapter<StatementTemplateInfoEntity> __deleteAdapterOfStatementTemplateInfoEntity = new EntityDeleteOrUpdateAdapter<StatementTemplateInfoEntity>() { // from class: com.revolut.data.database.models.statement.StatementTemplatesInfoDao_Impl.2
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        @NonNull
        public String createQuery() {
            return "DELETE FROM `statement_template_info` WHERE `id` = ?";
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public void bind(@NonNull SQLiteStatement sQLiteStatement, @NonNull StatementTemplateInfoEntity statementTemplateInfoEntity) {
            if (statementTemplateInfoEntity.getId() == null) {
                sQLiteStatement.bindNull(1);
            } else {
                sQLiteStatement.bindText(1, statementTemplateInfoEntity.getId());
            }
        }
    };
    private final EntityDeleteOrUpdateAdapter<StatementTemplateInfoEntity> __updateAdapterOfStatementTemplateInfoEntity = new EntityDeleteOrUpdateAdapter<StatementTemplateInfoEntity>() { // from class: com.revolut.data.database.models.statement.StatementTemplatesInfoDao_Impl.3
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        @NonNull
        public String createQuery() {
            return "UPDATE OR ABORT `statement_template_info` SET `id` = ?,`checkSum` = ?,`url` = ?,`accountId` = ? WHERE `id` = ?";
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public void bind(@NonNull SQLiteStatement sQLiteStatement, @NonNull StatementTemplateInfoEntity statementTemplateInfoEntity) {
            if (statementTemplateInfoEntity.getId() == null) {
                sQLiteStatement.bindNull(1);
            } else {
                sQLiteStatement.bindText(1, statementTemplateInfoEntity.getId());
            }
            if (statementTemplateInfoEntity.getCheckSum() == null) {
                sQLiteStatement.bindNull(2);
            } else {
                sQLiteStatement.bindText(2, statementTemplateInfoEntity.getCheckSum());
            }
            if (statementTemplateInfoEntity.getUrl() == null) {
                sQLiteStatement.bindNull(3);
            } else {
                sQLiteStatement.bindText(3, statementTemplateInfoEntity.getUrl());
            }
            if (statementTemplateInfoEntity.getAccountId() == null) {
                sQLiteStatement.bindNull(4);
            } else {
                sQLiteStatement.bindText(4, statementTemplateInfoEntity.getAccountId());
            }
            if (statementTemplateInfoEntity.getId() == null) {
                sQLiteStatement.bindNull(5);
            } else {
                sQLiteStatement.bindText(5, statementTemplateInfoEntity.getId());
            }
        }
    };

    public StatementTemplatesInfoDao_Impl(@NonNull RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
    }

    @NonNull
    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$delete$1(StatementTemplateInfoEntity statementTemplateInfoEntity, SQLiteConnection sQLiteConnection) {
        this.__deleteAdapterOfStatementTemplateInfoEntity.handle(sQLiteConnection, statementTemplateInfoEntity);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ StatementTemplateInfoEntity lambda$getById$3(String str, String str2, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM statement_template_info WHERE id = ? AND accountId = ?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.bindNull(1);
            } else {
                sQLiteStatementPrepare.bindText(1, str);
            }
            if (str2 == null) {
                sQLiteStatementPrepare.bindNull(2);
            } else {
                sQLiteStatementPrepare.bindText(2, str2);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "checkSum");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "url");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "accountId");
            StatementTemplateInfoEntity statementTemplateInfoEntity = null;
            String text = null;
            if (sQLiteStatementPrepare.step()) {
                String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow4)) {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                }
                statementTemplateInfoEntity = new StatementTemplateInfoEntity(text2, text3, text4, text);
            }
            sQLiteStatementPrepare.close();
            return statementTemplateInfoEntity;
        } catch (Throwable th10) {
            sQLiteStatementPrepare.close();
            throw th10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$insert$0(StatementTemplateInfoEntity statementTemplateInfoEntity, SQLiteConnection sQLiteConnection) {
        this.__insertAdapterOfStatementTemplateInfoEntity.insert(sQLiteConnection, statementTemplateInfoEntity);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer lambda$update$2(StatementTemplateInfoEntity statementTemplateInfoEntity, SQLiteConnection sQLiteConnection) {
        return Integer.valueOf(this.__updateAdapterOfStatementTemplateInfoEntity.handle(sQLiteConnection, statementTemplateInfoEntity));
    }

    @Override // com.revolut.data.database.models.statement.StatementTemplatesInfoDao
    public StatementTemplateInfoEntity getById(String str, String str2) {
        return (StatementTemplateInfoEntity) DBUtil.performBlocking(this.__db, true, false, new o(str, str2, 3));
    }

    @Override // com.revolut.data.database.models.statement.StatementTemplatesInfoDao
    public void insert(StatementTemplateInfoEntity statementTemplateInfoEntity) {
        statementTemplateInfoEntity.getClass();
        DBUtil.performBlocking(this.__db, false, true, new a(this, statementTemplateInfoEntity, 0));
    }

    @Override // t11.b2
    public void delete(StatementTemplateInfoEntity statementTemplateInfoEntity) {
        statementTemplateInfoEntity.getClass();
        DBUtil.performBlocking(this.__db, false, true, new a(this, statementTemplateInfoEntity, 2));
    }

    @Override // t11.b2
    public int update(StatementTemplateInfoEntity statementTemplateInfoEntity) {
        statementTemplateInfoEntity.getClass();
        return ((Integer) DBUtil.performBlocking(this.__db, false, true, new a(this, statementTemplateInfoEntity, 1))).intValue();
    }
}
