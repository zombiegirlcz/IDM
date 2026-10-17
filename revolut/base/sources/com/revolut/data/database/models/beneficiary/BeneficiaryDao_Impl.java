package com.revolut.data.database.models.beneficiary;

import abf.n;
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
import com.revolut.data.database.models.beneficiary.embeded.BeneficiaryExtraFieldsEmbeddedEntity;
import com.revolut.data.database.models.beneficiary.embeded.BeneficiaryIdentificationEmbeddedEntity;
import com.revolut.data.database.models.beneficiary.embeded.BeneficiaryStateEmbeddedEntity;
import com.revolut.data.database.models.beneficiary.embeded.BeneficiaryTypeEmbeddedEntity;
import com.revolut.data.database.models.beneficiary.embeded.PaymentTypeEmbeddedEntity;
import com.revolut.data.database.models.beneficiary.typeconverter.BeneficiaryExtraFieldsTypeConverter;
import com.revolut.data.database.models.beneficiary.typeconverter.BeneficiaryIdentificationConverter;
import com.revolut.data.database.models.beneficiary.typeconverter.BeneficiaryPaymentTypeTypeConverter;
import com.revolut.data.database.models.beneficiary.typeconverter.BeneficiaryStateTypeConverter;
import com.revolut.data.database.models.beneficiary.typeconverter.BeneficiaryTypeTypeConverter;
import com.revolut.data.database.models.beneficiary.typeconverter.InternationalAddressTypeConverter;
import com.revolut.data.database.models.payments.PaymentsSettingEmbeddedEntity;
import com.revolut.data.database.models.payments.typeconverter.PaymentsSettingTypeConverter;
import efm.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import so3.c;

/* JADX INFO: loaded from: classes.dex */
public final class BeneficiaryDao_Impl extends BeneficiaryDao {
    private final RoomDatabase __db;
    private final BeneficiaryTypeTypeConverter __beneficiaryTypeTypeConverter = new BeneficiaryTypeTypeConverter();
    private final BeneficiaryPaymentTypeTypeConverter __beneficiaryPaymentTypeTypeConverter = new BeneficiaryPaymentTypeTypeConverter();
    private final BeneficiaryExtraFieldsTypeConverter __beneficiaryExtraFieldsTypeConverter = new BeneficiaryExtraFieldsTypeConverter();
    private final PaymentsSettingTypeConverter __paymentsSettingTypeConverter = new PaymentsSettingTypeConverter();
    private final b21.a __commonTypeConverters = new b21.a();
    private final BeneficiaryStateTypeConverter __beneficiaryStateTypeConverter = new BeneficiaryStateTypeConverter();
    private final InternationalAddressTypeConverter __internationalAddressTypeConverter = new InternationalAddressTypeConverter();
    private final BeneficiaryIdentificationConverter __beneficiaryIdentificationConverter = new BeneficiaryIdentificationConverter();
    private final EntityInsertAdapter<BeneficiaryEntity> __insertAdapterOfBeneficiaryEntity = new EntityInsertAdapter<BeneficiaryEntity>() { // from class: com.revolut.data.database.models.beneficiary.BeneficiaryDao_Impl.1
        @Override // androidx.room.EntityInsertAdapter
        @NonNull
        public String createQuery() {
            return "INSERT OR REPLACE INTO `beneficiaries` (`id`,`rootId`,`ownerId`,`name`,`firstName`,`lastName`,`companyName`,`fullName`,`type`,`bankCountry`,`bankLogo`,`paymentType`,`extraFields`,`settings`,`accountFields`,`externalRef`,`externalAccount`,`state`,`address`,`email`,`phone`,`deprecated`,`country`,`currency`,`transactionsCount`,`timestamp`,`label`,`identification`,`createdDate`,`counterpartyDetailsGroup`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // androidx.room.EntityInsertAdapter
        public void bind(@NonNull SQLiteStatement sQLiteStatement, @NonNull BeneficiaryEntity beneficiaryEntity) {
            if (beneficiaryEntity.getId() == null) {
                sQLiteStatement.bindNull(1);
            } else {
                sQLiteStatement.bindText(1, beneficiaryEntity.getId());
            }
            if (beneficiaryEntity.getRootId() == null) {
                sQLiteStatement.bindNull(2);
            } else {
                sQLiteStatement.bindText(2, beneficiaryEntity.getRootId());
            }
            if (beneficiaryEntity.getOwnerId() == null) {
                sQLiteStatement.bindNull(3);
            } else {
                sQLiteStatement.bindText(3, beneficiaryEntity.getOwnerId());
            }
            if (beneficiaryEntity.getName() == null) {
                sQLiteStatement.bindNull(4);
            } else {
                sQLiteStatement.bindText(4, beneficiaryEntity.getName());
            }
            if (beneficiaryEntity.getFirstName() == null) {
                sQLiteStatement.bindNull(5);
            } else {
                sQLiteStatement.bindText(5, beneficiaryEntity.getFirstName());
            }
            if (beneficiaryEntity.getLastName() == null) {
                sQLiteStatement.bindNull(6);
            } else {
                sQLiteStatement.bindText(6, beneficiaryEntity.getLastName());
            }
            if (beneficiaryEntity.getCompanyName() == null) {
                sQLiteStatement.bindNull(7);
            } else {
                sQLiteStatement.bindText(7, beneficiaryEntity.getCompanyName());
            }
            if (beneficiaryEntity.getFullName() == null) {
                sQLiteStatement.bindNull(8);
            } else {
                sQLiteStatement.bindText(8, beneficiaryEntity.getFullName());
            }
            String strFromBeneficiaryTypeToJson = BeneficiaryDao_Impl.this.__beneficiaryTypeTypeConverter.fromBeneficiaryTypeToJson(beneficiaryEntity.getType());
            if (strFromBeneficiaryTypeToJson == null) {
                sQLiteStatement.bindNull(9);
            } else {
                sQLiteStatement.bindText(9, strFromBeneficiaryTypeToJson);
            }
            if (beneficiaryEntity.getBankCountry() == null) {
                sQLiteStatement.bindNull(10);
            } else {
                sQLiteStatement.bindText(10, beneficiaryEntity.getBankCountry());
            }
            if (beneficiaryEntity.getBankLogo() == null) {
                sQLiteStatement.bindNull(11);
            } else {
                sQLiteStatement.bindText(11, beneficiaryEntity.getBankLogo());
            }
            String strFromPaymentTypeToJson = BeneficiaryDao_Impl.this.__beneficiaryPaymentTypeTypeConverter.fromPaymentTypeToJson(beneficiaryEntity.getPaymentType());
            if (strFromPaymentTypeToJson == null) {
                sQLiteStatement.bindNull(12);
            } else {
                sQLiteStatement.bindText(12, strFromPaymentTypeToJson);
            }
            String strFromExternalFieldsToJson = BeneficiaryDao_Impl.this.__beneficiaryExtraFieldsTypeConverter.fromExternalFieldsToJson(beneficiaryEntity.getExtraFields());
            if (strFromExternalFieldsToJson == null) {
                sQLiteStatement.bindNull(13);
            } else {
                sQLiteStatement.bindText(13, strFromExternalFieldsToJson);
            }
            String json = BeneficiaryDao_Impl.this.__paymentsSettingTypeConverter.toJson(beneficiaryEntity.getSettings());
            if (json == null) {
                sQLiteStatement.bindNull(14);
            } else {
                sQLiteStatement.bindText(14, json);
            }
            b21.a aVar = BeneficiaryDao_Impl.this.__commonTypeConverters;
            Map<String, String> accountFields = beneficiaryEntity.getAccountFields();
            aVar.getClass();
            String strN = b21.a.n(accountFields);
            if (strN == null) {
                sQLiteStatement.bindNull(15);
            } else {
                sQLiteStatement.bindText(15, strN);
            }
            if (beneficiaryEntity.getExternalRef() == null) {
                sQLiteStatement.bindNull(16);
            } else {
                sQLiteStatement.bindText(16, beneficiaryEntity.getExternalRef());
            }
            if ((beneficiaryEntity.getExternalAccount() == null ? null : Integer.valueOf(beneficiaryEntity.getExternalAccount().booleanValue() ? 1 : 0)) == null) {
                sQLiteStatement.bindNull(17);
            } else {
                sQLiteStatement.bindLong(17, r0.intValue());
            }
            String strFromBeneficiaryStateToJson = BeneficiaryDao_Impl.this.__beneficiaryStateTypeConverter.fromBeneficiaryStateToJson(beneficiaryEntity.getState());
            if (strFromBeneficiaryStateToJson == null) {
                sQLiteStatement.bindNull(18);
            } else {
                sQLiteStatement.bindText(18, strFromBeneficiaryStateToJson);
            }
            String strAddressToJson = BeneficiaryDao_Impl.this.__internationalAddressTypeConverter.addressToJson(beneficiaryEntity.getAddress());
            if (strAddressToJson == null) {
                sQLiteStatement.bindNull(19);
            } else {
                sQLiteStatement.bindText(19, strAddressToJson);
            }
            if (beneficiaryEntity.getEmail() == null) {
                sQLiteStatement.bindNull(20);
            } else {
                sQLiteStatement.bindText(20, beneficiaryEntity.getEmail());
            }
            if (beneficiaryEntity.getPhone() == null) {
                sQLiteStatement.bindNull(21);
            } else {
                sQLiteStatement.bindText(21, beneficiaryEntity.getPhone());
            }
            sQLiteStatement.bindLong(22, beneficiaryEntity.getDeprecated() ? 1L : 0L);
            if (beneficiaryEntity.getCountry() == null) {
                sQLiteStatement.bindNull(23);
            } else {
                sQLiteStatement.bindText(23, beneficiaryEntity.getCountry());
            }
            if (beneficiaryEntity.getCurrency() == null) {
                sQLiteStatement.bindNull(24);
            } else {
                sQLiteStatement.bindText(24, beneficiaryEntity.getCurrency());
            }
            sQLiteStatement.bindLong(25, beneficiaryEntity.getTransactionsCount());
            sQLiteStatement.bindLong(26, beneficiaryEntity.getTimestamp());
            if (beneficiaryEntity.getLabel() == null) {
                sQLiteStatement.bindNull(27);
            } else {
                sQLiteStatement.bindText(27, beneficiaryEntity.getLabel());
            }
            String strFromBeneficiaryToJson = BeneficiaryDao_Impl.this.__beneficiaryIdentificationConverter.fromBeneficiaryToJson(beneficiaryEntity.getIdentification());
            if (strFromBeneficiaryToJson == null) {
                sQLiteStatement.bindNull(28);
            } else {
                sQLiteStatement.bindText(28, strFromBeneficiaryToJson);
            }
            if (beneficiaryEntity.getCreatedDate() == null) {
                sQLiteStatement.bindNull(29);
            } else {
                sQLiteStatement.bindLong(29, beneficiaryEntity.getCreatedDate().longValue());
            }
            if (beneficiaryEntity.getCounterpartyDetailsGroup() == null) {
                sQLiteStatement.bindNull(30);
            } else {
                sQLiteStatement.bindText(30, beneficiaryEntity.getCounterpartyDetailsGroup());
            }
        }
    };
    private final EntityDeleteOrUpdateAdapter<BeneficiaryEntity> __deleteAdapterOfBeneficiaryEntity = new EntityDeleteOrUpdateAdapter<BeneficiaryEntity>() { // from class: com.revolut.data.database.models.beneficiary.BeneficiaryDao_Impl.2
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        @NonNull
        public String createQuery() {
            return "DELETE FROM `beneficiaries` WHERE `id` = ?";
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public void bind(@NonNull SQLiteStatement sQLiteStatement, @NonNull BeneficiaryEntity beneficiaryEntity) {
            if (beneficiaryEntity.getId() == null) {
                sQLiteStatement.bindNull(1);
            } else {
                sQLiteStatement.bindText(1, beneficiaryEntity.getId());
            }
        }
    };
    private final EntityDeleteOrUpdateAdapter<BeneficiaryEntity> __updateAdapterOfBeneficiaryEntity = new EntityDeleteOrUpdateAdapter<BeneficiaryEntity>() { // from class: com.revolut.data.database.models.beneficiary.BeneficiaryDao_Impl.3
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        @NonNull
        public String createQuery() {
            return "UPDATE OR ABORT `beneficiaries` SET `id` = ?,`rootId` = ?,`ownerId` = ?,`name` = ?,`firstName` = ?,`lastName` = ?,`companyName` = ?,`fullName` = ?,`type` = ?,`bankCountry` = ?,`bankLogo` = ?,`paymentType` = ?,`extraFields` = ?,`settings` = ?,`accountFields` = ?,`externalRef` = ?,`externalAccount` = ?,`state` = ?,`address` = ?,`email` = ?,`phone` = ?,`deprecated` = ?,`country` = ?,`currency` = ?,`transactionsCount` = ?,`timestamp` = ?,`label` = ?,`identification` = ?,`createdDate` = ?,`counterpartyDetailsGroup` = ? WHERE `id` = ?";
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public void bind(@NonNull SQLiteStatement sQLiteStatement, @NonNull BeneficiaryEntity beneficiaryEntity) {
            if (beneficiaryEntity.getId() == null) {
                sQLiteStatement.bindNull(1);
            } else {
                sQLiteStatement.bindText(1, beneficiaryEntity.getId());
            }
            if (beneficiaryEntity.getRootId() == null) {
                sQLiteStatement.bindNull(2);
            } else {
                sQLiteStatement.bindText(2, beneficiaryEntity.getRootId());
            }
            if (beneficiaryEntity.getOwnerId() == null) {
                sQLiteStatement.bindNull(3);
            } else {
                sQLiteStatement.bindText(3, beneficiaryEntity.getOwnerId());
            }
            if (beneficiaryEntity.getName() == null) {
                sQLiteStatement.bindNull(4);
            } else {
                sQLiteStatement.bindText(4, beneficiaryEntity.getName());
            }
            if (beneficiaryEntity.getFirstName() == null) {
                sQLiteStatement.bindNull(5);
            } else {
                sQLiteStatement.bindText(5, beneficiaryEntity.getFirstName());
            }
            if (beneficiaryEntity.getLastName() == null) {
                sQLiteStatement.bindNull(6);
            } else {
                sQLiteStatement.bindText(6, beneficiaryEntity.getLastName());
            }
            if (beneficiaryEntity.getCompanyName() == null) {
                sQLiteStatement.bindNull(7);
            } else {
                sQLiteStatement.bindText(7, beneficiaryEntity.getCompanyName());
            }
            if (beneficiaryEntity.getFullName() == null) {
                sQLiteStatement.bindNull(8);
            } else {
                sQLiteStatement.bindText(8, beneficiaryEntity.getFullName());
            }
            String strFromBeneficiaryTypeToJson = BeneficiaryDao_Impl.this.__beneficiaryTypeTypeConverter.fromBeneficiaryTypeToJson(beneficiaryEntity.getType());
            if (strFromBeneficiaryTypeToJson == null) {
                sQLiteStatement.bindNull(9);
            } else {
                sQLiteStatement.bindText(9, strFromBeneficiaryTypeToJson);
            }
            if (beneficiaryEntity.getBankCountry() == null) {
                sQLiteStatement.bindNull(10);
            } else {
                sQLiteStatement.bindText(10, beneficiaryEntity.getBankCountry());
            }
            if (beneficiaryEntity.getBankLogo() == null) {
                sQLiteStatement.bindNull(11);
            } else {
                sQLiteStatement.bindText(11, beneficiaryEntity.getBankLogo());
            }
            String strFromPaymentTypeToJson = BeneficiaryDao_Impl.this.__beneficiaryPaymentTypeTypeConverter.fromPaymentTypeToJson(beneficiaryEntity.getPaymentType());
            if (strFromPaymentTypeToJson == null) {
                sQLiteStatement.bindNull(12);
            } else {
                sQLiteStatement.bindText(12, strFromPaymentTypeToJson);
            }
            String strFromExternalFieldsToJson = BeneficiaryDao_Impl.this.__beneficiaryExtraFieldsTypeConverter.fromExternalFieldsToJson(beneficiaryEntity.getExtraFields());
            if (strFromExternalFieldsToJson == null) {
                sQLiteStatement.bindNull(13);
            } else {
                sQLiteStatement.bindText(13, strFromExternalFieldsToJson);
            }
            String json = BeneficiaryDao_Impl.this.__paymentsSettingTypeConverter.toJson(beneficiaryEntity.getSettings());
            if (json == null) {
                sQLiteStatement.bindNull(14);
            } else {
                sQLiteStatement.bindText(14, json);
            }
            b21.a aVar = BeneficiaryDao_Impl.this.__commonTypeConverters;
            Map<String, String> accountFields = beneficiaryEntity.getAccountFields();
            aVar.getClass();
            String strN = b21.a.n(accountFields);
            if (strN == null) {
                sQLiteStatement.bindNull(15);
            } else {
                sQLiteStatement.bindText(15, strN);
            }
            if (beneficiaryEntity.getExternalRef() == null) {
                sQLiteStatement.bindNull(16);
            } else {
                sQLiteStatement.bindText(16, beneficiaryEntity.getExternalRef());
            }
            if ((beneficiaryEntity.getExternalAccount() == null ? null : Integer.valueOf(beneficiaryEntity.getExternalAccount().booleanValue() ? 1 : 0)) == null) {
                sQLiteStatement.bindNull(17);
            } else {
                sQLiteStatement.bindLong(17, r0.intValue());
            }
            String strFromBeneficiaryStateToJson = BeneficiaryDao_Impl.this.__beneficiaryStateTypeConverter.fromBeneficiaryStateToJson(beneficiaryEntity.getState());
            if (strFromBeneficiaryStateToJson == null) {
                sQLiteStatement.bindNull(18);
            } else {
                sQLiteStatement.bindText(18, strFromBeneficiaryStateToJson);
            }
            String strAddressToJson = BeneficiaryDao_Impl.this.__internationalAddressTypeConverter.addressToJson(beneficiaryEntity.getAddress());
            if (strAddressToJson == null) {
                sQLiteStatement.bindNull(19);
            } else {
                sQLiteStatement.bindText(19, strAddressToJson);
            }
            if (beneficiaryEntity.getEmail() == null) {
                sQLiteStatement.bindNull(20);
            } else {
                sQLiteStatement.bindText(20, beneficiaryEntity.getEmail());
            }
            if (beneficiaryEntity.getPhone() == null) {
                sQLiteStatement.bindNull(21);
            } else {
                sQLiteStatement.bindText(21, beneficiaryEntity.getPhone());
            }
            sQLiteStatement.bindLong(22, beneficiaryEntity.getDeprecated() ? 1L : 0L);
            if (beneficiaryEntity.getCountry() == null) {
                sQLiteStatement.bindNull(23);
            } else {
                sQLiteStatement.bindText(23, beneficiaryEntity.getCountry());
            }
            if (beneficiaryEntity.getCurrency() == null) {
                sQLiteStatement.bindNull(24);
            } else {
                sQLiteStatement.bindText(24, beneficiaryEntity.getCurrency());
            }
            sQLiteStatement.bindLong(25, beneficiaryEntity.getTransactionsCount());
            sQLiteStatement.bindLong(26, beneficiaryEntity.getTimestamp());
            if (beneficiaryEntity.getLabel() == null) {
                sQLiteStatement.bindNull(27);
            } else {
                sQLiteStatement.bindText(27, beneficiaryEntity.getLabel());
            }
            String strFromBeneficiaryToJson = BeneficiaryDao_Impl.this.__beneficiaryIdentificationConverter.fromBeneficiaryToJson(beneficiaryEntity.getIdentification());
            if (strFromBeneficiaryToJson == null) {
                sQLiteStatement.bindNull(28);
            } else {
                sQLiteStatement.bindText(28, strFromBeneficiaryToJson);
            }
            if (beneficiaryEntity.getCreatedDate() == null) {
                sQLiteStatement.bindNull(29);
            } else {
                sQLiteStatement.bindLong(29, beneficiaryEntity.getCreatedDate().longValue());
            }
            if (beneficiaryEntity.getCounterpartyDetailsGroup() == null) {
                sQLiteStatement.bindNull(30);
            } else {
                sQLiteStatement.bindText(30, beneficiaryEntity.getCounterpartyDetailsGroup());
            }
            if (beneficiaryEntity.getId() == null) {
                sQLiteStatement.bindNull(31);
            } else {
                sQLiteStatement.bindText(31, beneficiaryEntity.getId());
            }
        }
    };

    public BeneficiaryDao_Impl(@NonNull RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
    }

    @NonNull
    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$delete$2(BeneficiaryEntity beneficiaryEntity, SQLiteConnection sQLiteConnection) {
        this.__deleteAdapterOfBeneficiaryEntity.handle(sQLiteConnection, beneficiaryEntity);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$deleteAll$8(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM beneficiaries");
        try {
            sQLiteStatementPrepare.step();
            return Integer.valueOf(SQLiteConnectionUtil.getTotalChangedRows(sQLiteConnection));
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List lambda$getAllSync$4(SQLiteConnection sQLiteConnection) {
        int i;
        String text;
        int i2;
        int i3;
        Integer numValueOf;
        Boolean boolValueOf;
        BeneficiaryStateEmbeddedEntity beneficiaryStateEmbeddedEntity;
        String text2;
        String text3;
        int i5;
        String text4;
        int i6;
        int i21;
        int i22;
        String text5;
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM beneficiaries");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "rootId");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ownerId");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "firstName");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "lastName");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "companyName");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fullName");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "bankCountry");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "bankLogo");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "paymentType");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "extraFields");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "settings");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "accountFields");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "externalRef");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "externalAccount");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "state");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "address");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "email");
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "phone");
            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "deprecated");
            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "country");
            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "currency");
            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "transactionsCount");
            int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timestamp");
            int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "label");
            int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "identification");
            int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createdDate");
            int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "counterpartyDetailsGroup");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                String text7 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                String text8 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                String text9 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                String text10 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                String text11 = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                String text12 = sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                String text13 = sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow9)) {
                    i = columnIndexOrThrow;
                    text = null;
                } else {
                    i = columnIndexOrThrow;
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow9);
                }
                int i32 = columnIndexOrThrow2;
                BeneficiaryTypeEmbeddedEntity beneficiaryTypeEmbeddedEntityFromJsonToBeneficiaryType = this.__beneficiaryTypeTypeConverter.fromJsonToBeneficiaryType(text);
                String text14 = sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10);
                String text15 = sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11);
                PaymentTypeEmbeddedEntity paymentTypeEmbeddedEntityFromJsonToPaymentType = this.__beneficiaryPaymentTypeTypeConverter.fromJsonToPaymentType(sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12));
                BeneficiaryExtraFieldsEmbeddedEntity beneficiaryExtraFieldsEmbeddedEntityFromJsonToExternalFields = this.__beneficiaryExtraFieldsTypeConverter.fromJsonToExternalFields(sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow13));
                int i33 = columnIndexOrThrow14;
                columnIndexOrThrow14 = i33;
                List<PaymentsSettingEmbeddedEntity> listFromJson = this.__paymentsSettingTypeConverter.fromJson(sQLiteStatementPrepare.isNull(i33) ? null : sQLiteStatementPrepare.getText(i33));
                int i43 = columnIndexOrThrow15;
                String text16 = sQLiteStatementPrepare.isNull(i43) ? null : sQLiteStatementPrepare.getText(i43);
                columnIndexOrThrow15 = i43;
                this.__commonTypeConverters.getClass();
                Map mapF = b21.a.f(text16);
                int i59 = columnIndexOrThrow16;
                String text17 = sQLiteStatementPrepare.isNull(i59) ? null : sQLiteStatementPrepare.getText(i59);
                int i66 = columnIndexOrThrow17;
                if (sQLiteStatementPrepare.isNull(i66)) {
                    i2 = columnIndexOrThrow3;
                    i3 = columnIndexOrThrow4;
                    numValueOf = null;
                } else {
                    i2 = columnIndexOrThrow3;
                    i3 = columnIndexOrThrow4;
                    numValueOf = Integer.valueOf((int) sQLiteStatementPrepare.getLong(i66));
                }
                if (numValueOf == null) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                int i74 = columnIndexOrThrow18;
                BeneficiaryStateEmbeddedEntity beneficiaryStateEmbeddedEntityFromJsonToBeneficiaryState = this.__beneficiaryStateTypeConverter.fromJsonToBeneficiaryState(sQLiteStatementPrepare.isNull(i74) ? null : sQLiteStatementPrepare.getText(i74));
                int i92 = columnIndexOrThrow19;
                if (sQLiteStatementPrepare.isNull(i92)) {
                    beneficiaryStateEmbeddedEntity = beneficiaryStateEmbeddedEntityFromJsonToBeneficiaryState;
                    text2 = null;
                } else {
                    beneficiaryStateEmbeddedEntity = beneficiaryStateEmbeddedEntityFromJsonToBeneficiaryState;
                    text2 = sQLiteStatementPrepare.getText(i92);
                }
                c cVarJsonToAddress = this.__internationalAddressTypeConverter.jsonToAddress(text2);
                int i96 = columnIndexOrThrow20;
                String text18 = sQLiteStatementPrepare.isNull(i96) ? null : sQLiteStatementPrepare.getText(i96);
                int i99 = columnIndexOrThrow21;
                if (sQLiteStatementPrepare.isNull(i99)) {
                    text3 = null;
                    columnIndexOrThrow21 = i99;
                    i5 = i96;
                } else {
                    text3 = sQLiteStatementPrepare.getText(i99);
                    i5 = i96;
                    columnIndexOrThrow21 = i99;
                }
                int i100 = columnIndexOrThrow22;
                boolean z = ((int) sQLiteStatementPrepare.getLong(i100)) != 0;
                int i101 = columnIndexOrThrow23;
                String text19 = sQLiteStatementPrepare.isNull(i101) ? null : sQLiteStatementPrepare.getText(i101);
                int i102 = columnIndexOrThrow24;
                if (sQLiteStatementPrepare.isNull(i102)) {
                    text4 = null;
                    i21 = i100;
                    i6 = i101;
                } else {
                    text4 = sQLiteStatementPrepare.getText(i102);
                    i6 = i101;
                    i21 = i100;
                }
                int i103 = columnIndexOrThrow25;
                int i104 = (int) sQLiteStatementPrepare.getLong(i103);
                int i105 = columnIndexOrThrow26;
                long j2 = sQLiteStatementPrepare.getLong(i105);
                int i106 = columnIndexOrThrow27;
                String text20 = sQLiteStatementPrepare.isNull(i106) ? null : sQLiteStatementPrepare.getText(i106);
                columnIndexOrThrow27 = i106;
                int i107 = columnIndexOrThrow28;
                if (sQLiteStatementPrepare.isNull(i107)) {
                    i22 = i107;
                    text5 = null;
                } else {
                    i22 = i107;
                    text5 = sQLiteStatementPrepare.getText(i107);
                }
                BeneficiaryIdentificationEmbeddedEntity beneficiaryIdentificationEmbeddedEntityFromJsonToBeneficiary = this.__beneficiaryIdentificationConverter.fromJsonToBeneficiary(text5);
                int i108 = columnIndexOrThrow29;
                int i109 = columnIndexOrThrow30;
                columnIndexOrThrow29 = i108;
                arrayList.add(new BeneficiaryEntity(text6, text7, text8, text9, text10, text11, text12, text13, beneficiaryTypeEmbeddedEntityFromJsonToBeneficiaryType, text14, text15, paymentTypeEmbeddedEntityFromJsonToPaymentType, beneficiaryExtraFieldsEmbeddedEntityFromJsonToExternalFields, listFromJson, mapF, text17, boolValueOf, beneficiaryStateEmbeddedEntity, cVarJsonToAddress, text18, text3, z, text19, text4, i104, j2, text20, beneficiaryIdentificationEmbeddedEntityFromJsonToBeneficiary, sQLiteStatementPrepare.isNull(i108) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(i108)), sQLiteStatementPrepare.isNull(i109) ? null : sQLiteStatementPrepare.getText(i109)));
                columnIndexOrThrow26 = i105;
                columnIndexOrThrow3 = i2;
                columnIndexOrThrow16 = i59;
                columnIndexOrThrow18 = i74;
                columnIndexOrThrow22 = i21;
                columnIndexOrThrow23 = i6;
                columnIndexOrThrow24 = i102;
                columnIndexOrThrow25 = i103;
                columnIndexOrThrow19 = i92;
                columnIndexOrThrow4 = i3;
                columnIndexOrThrow17 = i66;
                columnIndexOrThrow30 = i109;
                columnIndexOrThrow2 = i32;
                columnIndexOrThrow = i;
                columnIndexOrThrow20 = i5;
                columnIndexOrThrow28 = i22;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ BeneficiaryEntity lambda$getByIdSync$5(String str, SQLiteConnection sQLiteConnection) {
        Boolean boolValueOf;
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM beneficiaries WHERE id = ?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.bindNull(1);
            } else {
                sQLiteStatementPrepare.bindText(1, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "rootId");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ownerId");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "firstName");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "lastName");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "companyName");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fullName");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "bankCountry");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "bankLogo");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "paymentType");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "extraFields");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "settings");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "accountFields");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "externalRef");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "externalAccount");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "state");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "address");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "email");
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "phone");
            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "deprecated");
            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "country");
            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "currency");
            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "transactionsCount");
            int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timestamp");
            int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "label");
            int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "identification");
            int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createdDate");
            int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "counterpartyDetailsGroup");
            BeneficiaryEntity beneficiaryEntity = null;
            if (sQLiteStatementPrepare.step()) {
                String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                String text7 = sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                String text8 = sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                BeneficiaryTypeEmbeddedEntity beneficiaryTypeEmbeddedEntityFromJsonToBeneficiaryType = this.__beneficiaryTypeTypeConverter.fromJsonToBeneficiaryType(sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9));
                String text9 = sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10);
                String text10 = sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11);
                PaymentTypeEmbeddedEntity paymentTypeEmbeddedEntityFromJsonToPaymentType = this.__beneficiaryPaymentTypeTypeConverter.fromJsonToPaymentType(sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12));
                BeneficiaryExtraFieldsEmbeddedEntity beneficiaryExtraFieldsEmbeddedEntityFromJsonToExternalFields = this.__beneficiaryExtraFieldsTypeConverter.fromJsonToExternalFields(sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow13));
                List<PaymentsSettingEmbeddedEntity> listFromJson = this.__paymentsSettingTypeConverter.fromJson(sQLiteStatementPrepare.isNull(columnIndexOrThrow14) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow14));
                String text11 = sQLiteStatementPrepare.isNull(columnIndexOrThrow15) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow15);
                this.__commonTypeConverters.getClass();
                Map mapF = b21.a.f(text11);
                String text12 = sQLiteStatementPrepare.isNull(columnIndexOrThrow16) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow16);
                Integer numValueOf = sQLiteStatementPrepare.isNull(columnIndexOrThrow17) ? null : Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow17));
                if (numValueOf == null) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                beneficiaryEntity = new BeneficiaryEntity(text, text2, text3, text4, text5, text6, text7, text8, beneficiaryTypeEmbeddedEntityFromJsonToBeneficiaryType, text9, text10, paymentTypeEmbeddedEntityFromJsonToPaymentType, beneficiaryExtraFieldsEmbeddedEntityFromJsonToExternalFields, listFromJson, mapF, text12, boolValueOf, this.__beneficiaryStateTypeConverter.fromJsonToBeneficiaryState(sQLiteStatementPrepare.isNull(columnIndexOrThrow18) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow18)), this.__internationalAddressTypeConverter.jsonToAddress(sQLiteStatementPrepare.isNull(columnIndexOrThrow19) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow19)), sQLiteStatementPrepare.isNull(columnIndexOrThrow20) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow20), sQLiteStatementPrepare.isNull(columnIndexOrThrow21) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow21), ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow22)) != 0, sQLiteStatementPrepare.isNull(columnIndexOrThrow23) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow23), sQLiteStatementPrepare.isNull(columnIndexOrThrow24) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow24), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow25), sQLiteStatementPrepare.getLong(columnIndexOrThrow26), sQLiteStatementPrepare.isNull(columnIndexOrThrow27) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow27), this.__beneficiaryIdentificationConverter.fromJsonToBeneficiary(sQLiteStatementPrepare.isNull(columnIndexOrThrow28) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow28)), sQLiteStatementPrepare.isNull(columnIndexOrThrow29) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow29)), sQLiteStatementPrepare.isNull(columnIndexOrThrow30) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow30));
            }
            sQLiteStatementPrepare.close();
            return beneficiaryEntity;
        } catch (Throwable th10) {
            sQLiteStatementPrepare.close();
            throw th10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$insert$1(BeneficiaryEntity beneficiaryEntity, SQLiteConnection sQLiteConnection) {
        this.__insertAdapterOfBeneficiaryEntity.insert(sQLiteConnection, beneficiaryEntity);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$insertAll$0(List list, SQLiteConnection sQLiteConnection) {
        this.__insertAdapterOfBeneficiaryEntity.insert(sQLiteConnection, list);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List lambda$observeFrequent$7(int i, SQLiteConnection sQLiteConnection) {
        int i2;
        String text;
        int i3;
        int i5;
        Integer numValueOf;
        Boolean boolValueOf;
        String text2;
        int i6;
        String text3;
        int i21;
        int i22;
        int i32;
        String text4;
        BeneficiaryDao_Impl beneficiaryDao_Impl = this;
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM beneficiaries WHERE transactionsCount IS NOT 0 ORDER BY transactionsCount DESC LIMIT ?");
        try {
            sQLiteStatementPrepare.bindLong(1, i);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "rootId");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ownerId");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "firstName");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "lastName");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "companyName");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fullName");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "bankCountry");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "bankLogo");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "paymentType");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "extraFields");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "settings");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "accountFields");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "externalRef");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "externalAccount");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "state");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "address");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "email");
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "phone");
            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "deprecated");
            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "country");
            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "currency");
            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "transactionsCount");
            int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timestamp");
            int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "label");
            int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "identification");
            int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createdDate");
            int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "counterpartyDetailsGroup");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                String text7 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                String text8 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                String text9 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                String text10 = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                String text11 = sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                String text12 = sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow9)) {
                    i2 = columnIndexOrThrow;
                    text = null;
                } else {
                    i2 = columnIndexOrThrow;
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow9);
                }
                int i33 = columnIndexOrThrow2;
                BeneficiaryTypeEmbeddedEntity beneficiaryTypeEmbeddedEntityFromJsonToBeneficiaryType = beneficiaryDao_Impl.__beneficiaryTypeTypeConverter.fromJsonToBeneficiaryType(text);
                String text13 = sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10);
                String text14 = sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11);
                PaymentTypeEmbeddedEntity paymentTypeEmbeddedEntityFromJsonToPaymentType = beneficiaryDao_Impl.__beneficiaryPaymentTypeTypeConverter.fromJsonToPaymentType(sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12));
                BeneficiaryExtraFieldsEmbeddedEntity beneficiaryExtraFieldsEmbeddedEntityFromJsonToExternalFields = beneficiaryDao_Impl.__beneficiaryExtraFieldsTypeConverter.fromJsonToExternalFields(sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow13));
                int i43 = columnIndexOrThrow14;
                columnIndexOrThrow14 = i43;
                List<PaymentsSettingEmbeddedEntity> listFromJson = beneficiaryDao_Impl.__paymentsSettingTypeConverter.fromJson(sQLiteStatementPrepare.isNull(i43) ? null : sQLiteStatementPrepare.getText(i43));
                int i59 = columnIndexOrThrow15;
                String text15 = sQLiteStatementPrepare.isNull(i59) ? null : sQLiteStatementPrepare.getText(i59);
                columnIndexOrThrow15 = i59;
                beneficiaryDao_Impl.__commonTypeConverters.getClass();
                Map mapF = b21.a.f(text15);
                int i66 = columnIndexOrThrow16;
                String text16 = sQLiteStatementPrepare.isNull(i66) ? null : sQLiteStatementPrepare.getText(i66);
                int i74 = columnIndexOrThrow17;
                if (sQLiteStatementPrepare.isNull(i74)) {
                    i3 = columnIndexOrThrow3;
                    i5 = columnIndexOrThrow4;
                    numValueOf = null;
                } else {
                    i3 = columnIndexOrThrow3;
                    i5 = columnIndexOrThrow4;
                    numValueOf = Integer.valueOf((int) sQLiteStatementPrepare.getLong(i74));
                }
                if (numValueOf == null) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                int i92 = columnIndexOrThrow18;
                BeneficiaryStateEmbeddedEntity beneficiaryStateEmbeddedEntityFromJsonToBeneficiaryState = beneficiaryDao_Impl.__beneficiaryStateTypeConverter.fromJsonToBeneficiaryState(sQLiteStatementPrepare.isNull(i92) ? null : sQLiteStatementPrepare.getText(i92));
                int i96 = columnIndexOrThrow19;
                columnIndexOrThrow19 = i96;
                c cVarJsonToAddress = beneficiaryDao_Impl.__internationalAddressTypeConverter.jsonToAddress(sQLiteStatementPrepare.isNull(i96) ? null : sQLiteStatementPrepare.getText(i96));
                int i99 = columnIndexOrThrow20;
                String text17 = sQLiteStatementPrepare.isNull(i99) ? null : sQLiteStatementPrepare.getText(i99);
                int i100 = columnIndexOrThrow21;
                if (sQLiteStatementPrepare.isNull(i100)) {
                    text2 = null;
                    columnIndexOrThrow20 = i99;
                    i6 = i74;
                } else {
                    text2 = sQLiteStatementPrepare.getText(i100);
                    i6 = i74;
                    columnIndexOrThrow20 = i99;
                }
                int i101 = columnIndexOrThrow22;
                boolean z = ((int) sQLiteStatementPrepare.getLong(i101)) != 0;
                int i102 = columnIndexOrThrow23;
                String text18 = sQLiteStatementPrepare.isNull(i102) ? null : sQLiteStatementPrepare.getText(i102);
                int i103 = columnIndexOrThrow24;
                if (sQLiteStatementPrepare.isNull(i103)) {
                    text3 = null;
                    i22 = i101;
                    i21 = i102;
                } else {
                    text3 = sQLiteStatementPrepare.getText(i103);
                    i21 = i102;
                    i22 = i101;
                }
                int i104 = columnIndexOrThrow25;
                int i105 = (int) sQLiteStatementPrepare.getLong(i104);
                int i106 = columnIndexOrThrow26;
                long j2 = sQLiteStatementPrepare.getLong(i106);
                int i107 = columnIndexOrThrow27;
                String text19 = sQLiteStatementPrepare.isNull(i107) ? null : sQLiteStatementPrepare.getText(i107);
                columnIndexOrThrow27 = i107;
                int i108 = columnIndexOrThrow28;
                if (sQLiteStatementPrepare.isNull(i108)) {
                    i32 = i108;
                    text4 = null;
                } else {
                    i32 = i108;
                    text4 = sQLiteStatementPrepare.getText(i108);
                }
                BeneficiaryIdentificationEmbeddedEntity beneficiaryIdentificationEmbeddedEntityFromJsonToBeneficiary = beneficiaryDao_Impl.__beneficiaryIdentificationConverter.fromJsonToBeneficiary(text4);
                int i109 = columnIndexOrThrow29;
                int i110 = columnIndexOrThrow30;
                arrayList.add(new BeneficiaryEntity(text5, text6, text7, text8, text9, text10, text11, text12, beneficiaryTypeEmbeddedEntityFromJsonToBeneficiaryType, text13, text14, paymentTypeEmbeddedEntityFromJsonToPaymentType, beneficiaryExtraFieldsEmbeddedEntityFromJsonToExternalFields, listFromJson, mapF, text16, boolValueOf, beneficiaryStateEmbeddedEntityFromJsonToBeneficiaryState, cVarJsonToAddress, text17, text2, z, text18, text3, i105, j2, text19, beneficiaryIdentificationEmbeddedEntityFromJsonToBeneficiary, sQLiteStatementPrepare.isNull(i109) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(i109)), sQLiteStatementPrepare.isNull(i110) ? null : sQLiteStatementPrepare.getText(i110)));
                columnIndexOrThrow26 = i106;
                columnIndexOrThrow3 = i3;
                columnIndexOrThrow16 = i66;
                columnIndexOrThrow18 = i92;
                columnIndexOrThrow22 = i22;
                columnIndexOrThrow23 = i21;
                columnIndexOrThrow24 = i103;
                columnIndexOrThrow25 = i104;
                int i111 = i6;
                columnIndexOrThrow21 = i100;
                columnIndexOrThrow4 = i5;
                columnIndexOrThrow17 = i111;
                beneficiaryDao_Impl = this;
                columnIndexOrThrow29 = i109;
                columnIndexOrThrow30 = i110;
                columnIndexOrThrow2 = i33;
                columnIndexOrThrow = i2;
                columnIndexOrThrow28 = i32;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List lambda$observeRecent$6(SQLiteConnection sQLiteConnection) {
        int i;
        String text;
        int i2;
        int i3;
        Integer numValueOf;
        Boolean boolValueOf;
        BeneficiaryStateEmbeddedEntity beneficiaryStateEmbeddedEntity;
        String text2;
        String text3;
        int i5;
        String text4;
        int i6;
        int i21;
        int i22;
        String text5;
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM beneficiaries WHERE timestamp IS NOT 0 ORDER BY timestamp DESC");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "rootId");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ownerId");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "firstName");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "lastName");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "companyName");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fullName");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "bankCountry");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "bankLogo");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "paymentType");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "extraFields");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "settings");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "accountFields");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "externalRef");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "externalAccount");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "state");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "address");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "email");
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "phone");
            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "deprecated");
            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "country");
            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "currency");
            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "transactionsCount");
            int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timestamp");
            int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "label");
            int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "identification");
            int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createdDate");
            int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "counterpartyDetailsGroup");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                String text7 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                String text8 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                String text9 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                String text10 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                String text11 = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                String text12 = sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                String text13 = sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow9)) {
                    i = columnIndexOrThrow;
                    text = null;
                } else {
                    i = columnIndexOrThrow;
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow9);
                }
                int i32 = columnIndexOrThrow2;
                BeneficiaryTypeEmbeddedEntity beneficiaryTypeEmbeddedEntityFromJsonToBeneficiaryType = this.__beneficiaryTypeTypeConverter.fromJsonToBeneficiaryType(text);
                String text14 = sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10);
                String text15 = sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11);
                PaymentTypeEmbeddedEntity paymentTypeEmbeddedEntityFromJsonToPaymentType = this.__beneficiaryPaymentTypeTypeConverter.fromJsonToPaymentType(sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12));
                BeneficiaryExtraFieldsEmbeddedEntity beneficiaryExtraFieldsEmbeddedEntityFromJsonToExternalFields = this.__beneficiaryExtraFieldsTypeConverter.fromJsonToExternalFields(sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow13));
                int i33 = columnIndexOrThrow14;
                columnIndexOrThrow14 = i33;
                List<PaymentsSettingEmbeddedEntity> listFromJson = this.__paymentsSettingTypeConverter.fromJson(sQLiteStatementPrepare.isNull(i33) ? null : sQLiteStatementPrepare.getText(i33));
                int i43 = columnIndexOrThrow15;
                String text16 = sQLiteStatementPrepare.isNull(i43) ? null : sQLiteStatementPrepare.getText(i43);
                columnIndexOrThrow15 = i43;
                this.__commonTypeConverters.getClass();
                Map mapF = b21.a.f(text16);
                int i59 = columnIndexOrThrow16;
                String text17 = sQLiteStatementPrepare.isNull(i59) ? null : sQLiteStatementPrepare.getText(i59);
                int i66 = columnIndexOrThrow17;
                if (sQLiteStatementPrepare.isNull(i66)) {
                    i2 = columnIndexOrThrow3;
                    i3 = columnIndexOrThrow4;
                    numValueOf = null;
                } else {
                    i2 = columnIndexOrThrow3;
                    i3 = columnIndexOrThrow4;
                    numValueOf = Integer.valueOf((int) sQLiteStatementPrepare.getLong(i66));
                }
                if (numValueOf == null) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                int i74 = columnIndexOrThrow18;
                BeneficiaryStateEmbeddedEntity beneficiaryStateEmbeddedEntityFromJsonToBeneficiaryState = this.__beneficiaryStateTypeConverter.fromJsonToBeneficiaryState(sQLiteStatementPrepare.isNull(i74) ? null : sQLiteStatementPrepare.getText(i74));
                int i92 = columnIndexOrThrow19;
                if (sQLiteStatementPrepare.isNull(i92)) {
                    beneficiaryStateEmbeddedEntity = beneficiaryStateEmbeddedEntityFromJsonToBeneficiaryState;
                    text2 = null;
                } else {
                    beneficiaryStateEmbeddedEntity = beneficiaryStateEmbeddedEntityFromJsonToBeneficiaryState;
                    text2 = sQLiteStatementPrepare.getText(i92);
                }
                c cVarJsonToAddress = this.__internationalAddressTypeConverter.jsonToAddress(text2);
                int i96 = columnIndexOrThrow20;
                String text18 = sQLiteStatementPrepare.isNull(i96) ? null : sQLiteStatementPrepare.getText(i96);
                int i99 = columnIndexOrThrow21;
                if (sQLiteStatementPrepare.isNull(i99)) {
                    text3 = null;
                    columnIndexOrThrow21 = i99;
                    i5 = i96;
                } else {
                    text3 = sQLiteStatementPrepare.getText(i99);
                    i5 = i96;
                    columnIndexOrThrow21 = i99;
                }
                int i100 = columnIndexOrThrow22;
                boolean z = ((int) sQLiteStatementPrepare.getLong(i100)) != 0;
                int i101 = columnIndexOrThrow23;
                String text19 = sQLiteStatementPrepare.isNull(i101) ? null : sQLiteStatementPrepare.getText(i101);
                int i102 = columnIndexOrThrow24;
                if (sQLiteStatementPrepare.isNull(i102)) {
                    text4 = null;
                    i21 = i100;
                    i6 = i101;
                } else {
                    text4 = sQLiteStatementPrepare.getText(i102);
                    i6 = i101;
                    i21 = i100;
                }
                int i103 = columnIndexOrThrow25;
                int i104 = (int) sQLiteStatementPrepare.getLong(i103);
                int i105 = columnIndexOrThrow26;
                long j2 = sQLiteStatementPrepare.getLong(i105);
                int i106 = columnIndexOrThrow27;
                String text20 = sQLiteStatementPrepare.isNull(i106) ? null : sQLiteStatementPrepare.getText(i106);
                columnIndexOrThrow27 = i106;
                int i107 = columnIndexOrThrow28;
                if (sQLiteStatementPrepare.isNull(i107)) {
                    i22 = i107;
                    text5 = null;
                } else {
                    i22 = i107;
                    text5 = sQLiteStatementPrepare.getText(i107);
                }
                BeneficiaryIdentificationEmbeddedEntity beneficiaryIdentificationEmbeddedEntityFromJsonToBeneficiary = this.__beneficiaryIdentificationConverter.fromJsonToBeneficiary(text5);
                int i108 = columnIndexOrThrow29;
                int i109 = columnIndexOrThrow30;
                columnIndexOrThrow29 = i108;
                arrayList.add(new BeneficiaryEntity(text6, text7, text8, text9, text10, text11, text12, text13, beneficiaryTypeEmbeddedEntityFromJsonToBeneficiaryType, text14, text15, paymentTypeEmbeddedEntityFromJsonToPaymentType, beneficiaryExtraFieldsEmbeddedEntityFromJsonToExternalFields, listFromJson, mapF, text17, boolValueOf, beneficiaryStateEmbeddedEntity, cVarJsonToAddress, text18, text3, z, text19, text4, i104, j2, text20, beneficiaryIdentificationEmbeddedEntityFromJsonToBeneficiary, sQLiteStatementPrepare.isNull(i108) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(i108)), sQLiteStatementPrepare.isNull(i109) ? null : sQLiteStatementPrepare.getText(i109)));
                columnIndexOrThrow26 = i105;
                columnIndexOrThrow3 = i2;
                columnIndexOrThrow16 = i59;
                columnIndexOrThrow18 = i74;
                columnIndexOrThrow22 = i21;
                columnIndexOrThrow23 = i6;
                columnIndexOrThrow24 = i102;
                columnIndexOrThrow25 = i103;
                columnIndexOrThrow19 = i92;
                columnIndexOrThrow4 = i3;
                columnIndexOrThrow17 = i66;
                columnIndexOrThrow30 = i109;
                columnIndexOrThrow2 = i32;
                columnIndexOrThrow = i;
                columnIndexOrThrow20 = i5;
                columnIndexOrThrow28 = i22;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer lambda$update$3(BeneficiaryEntity beneficiaryEntity, SQLiteConnection sQLiteConnection) {
        return Integer.valueOf(this.__updateAdapterOfBeneficiaryEntity.handle(sQLiteConnection, beneficiaryEntity));
    }

    @Override // com.revolut.data.database.models.beneficiary.BeneficiaryDao
    public int deleteAll() {
        return ((Integer) DBUtil.performBlocking(this.__db, false, true, new cmc.c(23))).intValue();
    }

    @Override // com.revolut.data.database.models.beneficiary.BeneficiaryDao
    public List<BeneficiaryEntity> getAllSync() {
        return (List) DBUtil.performBlocking(this.__db, true, false, new a(this, 0));
    }

    @Override // com.revolut.data.database.models.beneficiary.BeneficiaryDao
    public BeneficiaryEntity getByIdSync(String str) {
        return (BeneficiaryEntity) DBUtil.performBlocking(this.__db, true, false, new cma.b(this, str, 3));
    }

    @Override // com.revolut.data.database.models.beneficiary.BeneficiaryDao
    public void insert(BeneficiaryEntity beneficiaryEntity) {
        beneficiaryEntity.getClass();
        DBUtil.performBlocking(this.__db, false, true, new b(this, beneficiaryEntity, 2));
    }

    @Override // com.revolut.data.database.models.beneficiary.BeneficiaryDao
    public void insertAll(List<BeneficiaryEntity> list) {
        list.getClass();
        DBUtil.performBlocking(this.__db, false, true, new cma.b(this, list, 4));
    }

    @Override // com.revolut.data.database.models.beneficiary.BeneficiaryDao
    public r<List<BeneficiaryEntity>> observeFrequent(int i) {
        return RxRoom.createObservable(this.__db, false, new String[]{"beneficiaries"}, new n(this, i, 6));
    }

    @Override // com.revolut.data.database.models.beneficiary.BeneficiaryDao
    public r<List<BeneficiaryEntity>> observeRecent() {
        return RxRoom.createObservable(this.__db, false, new String[]{"beneficiaries"}, new a(this, 1));
    }

    @Override // t11.b2
    public void delete(BeneficiaryEntity beneficiaryEntity) {
        beneficiaryEntity.getClass();
        DBUtil.performBlocking(this.__db, false, true, new b(this, beneficiaryEntity, 0));
    }

    @Override // t11.b2
    public int update(BeneficiaryEntity beneficiaryEntity) {
        beneficiaryEntity.getClass();
        return ((Integer) DBUtil.performBlocking(this.__db, false, true, new b(this, beneficiaryEntity, 1))).intValue();
    }
}
