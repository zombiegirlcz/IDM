package com.revolut.data.database.models.openbanking;

import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.RelationUtil;
import androidx.room.util.SQLiteConnectionUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class ExternalInstitutionsDao_Impl extends ExternalInstitutionsDao {
    private final RoomDatabase __db;
    private final ExternalInstitutionRequirementConverter __externalInstitutionRequirementConverter = new ExternalInstitutionRequirementConverter();
    private final ExternalInstitutionInstitutionTagsConverter __externalInstitutionInstitutionTagsConverter = new ExternalInstitutionInstitutionTagsConverter();
    private final EntityInsertAdapter<ExternalInstitutionEntity> __insertAdapterOfExternalInstitutionEntity = new EntityInsertAdapter<ExternalInstitutionEntity>() { // from class: com.revolut.data.database.models.openbanking.ExternalInstitutionsDao_Impl.1
        @Override // androidx.room.EntityInsertAdapter
        @NonNull
        public String createQuery() {
            return "INSERT OR REPLACE INTO `institutions` (`id`,`name`,`logo`,`logoType`,`paymentInitiation`,`infoProvider`,`requirements`,`mandateInitiation`,`tags`,`description`,`system`,`recurrenceSupported`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // androidx.room.EntityInsertAdapter
        public void bind(@NonNull SQLiteStatement sQLiteStatement, @NonNull ExternalInstitutionEntity externalInstitutionEntity) {
            if (externalInstitutionEntity.getId() == null) {
                sQLiteStatement.bindNull(1);
            } else {
                sQLiteStatement.bindText(1, externalInstitutionEntity.getId());
            }
            if (externalInstitutionEntity.getName() == null) {
                sQLiteStatement.bindNull(2);
            } else {
                sQLiteStatement.bindText(2, externalInstitutionEntity.getName());
            }
            if (externalInstitutionEntity.getLogo() == null) {
                sQLiteStatement.bindNull(3);
            } else {
                sQLiteStatement.bindText(3, externalInstitutionEntity.getLogo());
            }
            if (externalInstitutionEntity.getLogoType() == null) {
                sQLiteStatement.bindNull(4);
            } else {
                sQLiteStatement.bindText(4, externalInstitutionEntity.getLogoType());
            }
            sQLiteStatement.bindLong(5, externalInstitutionEntity.getPaymentInitiation() ? 1L : 0L);
            sQLiteStatement.bindLong(6, externalInstitutionEntity.getInfoProvider() ? 1L : 0L);
            String strFromArrayList = ExternalInstitutionsDao_Impl.this.__externalInstitutionRequirementConverter.fromArrayList(externalInstitutionEntity.getRequirements());
            if (strFromArrayList == null) {
                sQLiteStatement.bindNull(7);
            } else {
                sQLiteStatement.bindText(7, strFromArrayList);
            }
            sQLiteStatement.bindLong(8, externalInstitutionEntity.getMandateInitiation() ? 1L : 0L);
            String strFromArrayList2 = ExternalInstitutionsDao_Impl.this.__externalInstitutionInstitutionTagsConverter.fromArrayList(externalInstitutionEntity.getTags());
            if (strFromArrayList2 == null) {
                sQLiteStatement.bindNull(9);
            } else {
                sQLiteStatement.bindText(9, strFromArrayList2);
            }
            if (externalInstitutionEntity.getDescription() == null) {
                sQLiteStatement.bindNull(10);
            } else {
                sQLiteStatement.bindText(10, externalInstitutionEntity.getDescription());
            }
            TopupSettingsEntity topupSettings = externalInstitutionEntity.getTopupSettings();
            if (topupSettings.getSystem() == null) {
                sQLiteStatement.bindNull(11);
            } else {
                sQLiteStatement.bindText(11, topupSettings.getSystem());
            }
            sQLiteStatement.bindLong(12, topupSettings.getRecurrenceSupported() ? 1L : 0L);
        }
    };
    private final EntityInsertAdapter<ExternalInstitutionBranchEntity> __insertAdapterOfExternalInstitutionBranchEntity = new EntityInsertAdapter<ExternalInstitutionBranchEntity>() { // from class: com.revolut.data.database.models.openbanking.ExternalInstitutionsDao_Impl.2
        @Override // androidx.room.EntityInsertAdapter
        @NonNull
        public String createQuery() {
            return "INSERT OR REPLACE INTO `institution_branch` (`id`,`name`,`institution_id`) VALUES (?,?,?)";
        }

        @Override // androidx.room.EntityInsertAdapter
        public void bind(@NonNull SQLiteStatement sQLiteStatement, @NonNull ExternalInstitutionBranchEntity externalInstitutionBranchEntity) {
            if (externalInstitutionBranchEntity.getId() == null) {
                sQLiteStatement.bindNull(1);
            } else {
                sQLiteStatement.bindText(1, externalInstitutionBranchEntity.getId());
            }
            if (externalInstitutionBranchEntity.getName() == null) {
                sQLiteStatement.bindNull(2);
            } else {
                sQLiteStatement.bindText(2, externalInstitutionBranchEntity.getName());
            }
            if (externalInstitutionBranchEntity.getInstitutionId() == null) {
                sQLiteStatement.bindNull(3);
            } else {
                sQLiteStatement.bindText(3, externalInstitutionBranchEntity.getInstitutionId());
            }
        }
    };

    public ExternalInstitutionsDao_Impl(@NonNull RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
    }

    private void __fetchRelationshipinstitutionBranchAscomRevolutDataDatabaseModelsOpenbankingExternalInstitutionBranchEntity(@NonNull SQLiteConnection sQLiteConnection, @NonNull ArrayMap<String, ArrayList<ExternalInstitutionBranchEntity>> arrayMap) {
        ArrayList<ExternalInstitutionBranchEntity> arrayList;
        Set<String> setKeySet = arrayMap.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (arrayMap.getSize() > 999) {
            RelationUtil.recursiveFetchArrayMap(arrayMap, true, new cma.b(this, sQLiteConnection, 5));
            return;
        }
        StringBuilder sbS = p.a.s("SELECT `id`,`name`,`institution_id` FROM `institution_branch` WHERE `institution_id` IN (");
        StringUtil.appendPlaceholders(sbS, setKeySet.size());
        sbS.append(")");
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(sbS.toString());
        int i = 1;
        for (String str : setKeySet) {
            if (str == null) {
                sQLiteStatementPrepare.bindNull(i);
            } else {
                sQLiteStatementPrepare.bindText(i, str);
            }
            i++;
        }
        try {
            int columnIndex = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "institution_id");
            if (columnIndex == -1) {
                return;
            }
            while (sQLiteStatementPrepare.step()) {
                String text = null;
                String text2 = sQLiteStatementPrepare.isNull(columnIndex) ? null : sQLiteStatementPrepare.getText(columnIndex);
                if (text2 != null && (arrayList = arrayMap.get(text2)) != null) {
                    String text3 = sQLiteStatementPrepare.isNull(0) ? null : sQLiteStatementPrepare.getText(0);
                    String text4 = sQLiteStatementPrepare.isNull(1) ? null : sQLiteStatementPrepare.getText(1);
                    if (!sQLiteStatementPrepare.isNull(2)) {
                        text = sQLiteStatementPrepare.getText(2);
                    }
                    arrayList.add(new ExternalInstitutionBranchEntity(text3, text4, text));
                }
            }
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @NonNull
    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit lambda$__fetchRelationshipinstitutionBranchAscomRevolutDataDatabaseModelsOpenbankingExternalInstitutionBranchEntity$5(SQLiteConnection sQLiteConnection, ArrayMap arrayMap) {
        __fetchRelationshipinstitutionBranchAscomRevolutDataDatabaseModelsOpenbankingExternalInstitutionBranchEntity(sQLiteConnection, arrayMap);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$deleteAll$4(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM institutions");
        try {
            sQLiteStatementPrepare.step();
            return Integer.valueOf(SQLiteConnectionUtil.getTotalChangedRows(sQLiteConnection));
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List lambda$getAll$3(SQLiteConnection sQLiteConnection) {
        int i;
        ExternalInstitutionsDao_Impl externalInstitutionsDao_Impl = this;
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM institutions");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "logo");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "logoType");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "paymentInitiation");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "infoProvider");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "requirements");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mandateInitiation");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tags");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "description");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "system");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "recurrenceSupported");
            ArrayMap<String, ArrayList<ExternalInstitutionBranchEntity>> arrayMap = new ArrayMap<>();
            while (true) {
                if (!sQLiteStatementPrepare.step()) {
                    break;
                }
                int i2 = columnIndexOrThrow12;
                String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                if (text == null || arrayMap.containsKey(text)) {
                    i = columnIndexOrThrow11;
                } else {
                    i = columnIndexOrThrow11;
                    arrayMap.put(text, new ArrayList<>());
                }
                columnIndexOrThrow12 = i2;
                columnIndexOrThrow11 = i;
            }
            int i3 = columnIndexOrThrow11;
            int i5 = columnIndexOrThrow12;
            sQLiteStatementPrepare.reset();
            externalInstitutionsDao_Impl.__fetchRelationshipinstitutionBranchAscomRevolutDataDatabaseModelsOpenbankingExternalInstitutionBranchEntity(sQLiteConnection, arrayMap);
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                boolean z = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5)) != 0;
                ArrayMap<String, ArrayList<ExternalInstitutionBranchEntity>> arrayMap2 = arrayMap;
                boolean z3 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6)) != 0;
                List<String> listFromString = externalInstitutionsDao_Impl.__externalInstitutionRequirementConverter.fromString(sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7));
                boolean z4 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8)) != 0;
                List<String> listFromString2 = externalInstitutionsDao_Impl.__externalInstitutionInstitutionTagsConverter.fromString(sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9));
                int i6 = i3;
                int i21 = columnIndexOrThrow3;
                int i22 = i5;
                int i32 = columnIndexOrThrow2;
                ExternalInstitutionEntity externalInstitutionEntity = new ExternalInstitutionEntity(text2, text3, text4, text5, z, z3, new TopupSettingsEntity(sQLiteStatementPrepare.isNull(i6) ? null : sQLiteStatementPrepare.getText(i6), ((int) sQLiteStatementPrepare.getLong(i22)) != 0), listFromString, z4, listFromString2, sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10));
                String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                arrayList.add(new ExternalInstitutionsWithBranches(externalInstitutionEntity, text6 != null ? arrayMap2.get(text6) : new ArrayList<>()));
                arrayMap = arrayMap2;
                columnIndexOrThrow2 = i32;
                columnIndexOrThrow3 = i21;
                i5 = i22;
                i3 = i6;
                externalInstitutionsDao_Impl = this;
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th10) {
            sQLiteStatementPrepare.close();
            throw th10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$saveAllInstitutions$0(List list, SQLiteConnection sQLiteConnection) {
        this.__insertAdapterOfExternalInstitutionEntity.insert(sQLiteConnection, list);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$saveInstitutionBranches$1(List list, SQLiteConnection sQLiteConnection) {
        this.__insertAdapterOfExternalInstitutionBranchEntity.insert(sQLiteConnection, list);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit lambda$updateAll$2(List list, SQLiteConnection sQLiteConnection) {
        super.updateAll(list);
        return Unit.f186387a;
    }

    @Override // com.revolut.data.database.models.openbanking.ExternalInstitutionsDao
    public int deleteAll() {
        return ((Integer) DBUtil.performBlocking(this.__db, false, true, new cmc.c(26))).intValue();
    }

    @Override // com.revolut.data.database.models.openbanking.ExternalInstitutionsDao
    public List<ExternalInstitutionsWithBranches> getAll() {
        return (List) DBUtil.performBlocking(this.__db, true, true, new ce9.a(this, 26));
    }

    @Override // com.revolut.data.database.models.openbanking.ExternalInstitutionsDao
    public void saveAllInstitutions(List<ExternalInstitutionEntity> list) {
        list.getClass();
        DBUtil.performBlocking(this.__db, false, true, new c(this, list, 0));
    }

    @Override // com.revolut.data.database.models.openbanking.ExternalInstitutionsDao
    public void saveInstitutionBranches(List<ExternalInstitutionBranchEntity> list) {
        list.getClass();
        DBUtil.performBlocking(this.__db, false, true, new c(this, list, 2));
    }

    @Override // com.revolut.data.database.models.openbanking.ExternalInstitutionsDao
    public void updateAll(List<ExternalInstitutionsWithBranches> list) {
        DBUtil.performBlocking(this.__db, false, true, new c(this, list, 1));
    }
}
