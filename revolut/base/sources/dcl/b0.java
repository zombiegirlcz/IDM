package dcl;

import androidx.room.RoomRawQuery;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import nif.h2;
import nif.o3;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class b0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f113003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f113004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RoomRawQuery f113005c;

    public /* synthetic */ b0(String str, RoomRawQuery roomRawQuery, int i) {
        this.f113003a = i;
        this.f113004b = str;
        this.f113005c = roomRawQuery;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteStatement sQLiteStatementPrepare;
        int i;
        int i2;
        String text;
        switch (this.f113003a) {
            case 0:
                RoomRawQuery roomRawQuery = this.f113005c;
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare(this.f113004b);
                try {
                    roomRawQuery.getBindingFunction().invoke(sQLiteStatementPrepare);
                    return Integer.valueOf(sQLiteStatementPrepare.step() ? (int) sQLiteStatementPrepare.getLong(0) : 0);
                } finally {
                }
            case 1:
                RoomRawQuery roomRawQuery2 = this.f113005c;
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare(this.f113004b);
                try {
                    roomRawQuery2.getBindingFunction().invoke(sQLiteStatementPrepare);
                    return Integer.valueOf(sQLiteStatementPrepare.step() ? (int) sQLiteStatementPrepare.getLong(0) : 0);
                } finally {
                }
            case 2:
                RoomRawQuery roomRawQuery3 = this.f113005c;
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare(this.f113004b);
                try {
                    roomRawQuery3.getBindingFunction().invoke(sQLiteStatementPrepare);
                    ArrayList arrayList = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        arrayList.add(sQLiteStatementPrepare.isNull(0) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(0)));
                        break;
                    }
                    return arrayList;
                } finally {
                }
            case 3:
                RoomRawQuery roomRawQuery4 = this.f113005c;
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare(this.f113004b);
                try {
                    roomRawQuery4.getBindingFunction().invoke(sQLiteStatementPrepare);
                    return Integer.valueOf(sQLiteStatementPrepare.step() ? (int) sQLiteStatementPrepare.getLong(0) : 0);
                } finally {
                }
            case 4:
                RoomRawQuery roomRawQuery5 = this.f113005c;
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare(this.f113004b);
                try {
                    roomRawQuery5.getBindingFunction().invoke(sQLiteStatementPrepare);
                    return Integer.valueOf(sQLiteStatementPrepare.step() ? (int) sQLiteStatementPrepare.getLong(0) : 0);
                } finally {
                }
            case 5:
                RoomRawQuery roomRawQuery6 = this.f113005c;
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare(this.f113004b);
                try {
                    roomRawQuery6.getBindingFunction().invoke(sQLiteStatementPrepare);
                    return Integer.valueOf(sQLiteStatementPrepare.step() ? (int) sQLiteStatementPrepare.getLong(0) : 0);
                } finally {
                }
            case 6:
                RoomRawQuery roomRawQuery7 = this.f113005c;
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare(this.f113004b);
                try {
                    roomRawQuery7.getBindingFunction().invoke(sQLiteStatementPrepare);
                    return Integer.valueOf(sQLiteStatementPrepare.step() ? (int) sQLiteStatementPrepare.getLong(0) : 0);
                } finally {
                }
            case 7:
                RoomRawQuery roomRawQuery8 = this.f113005c;
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare(this.f113004b);
                try {
                    roomRawQuery8.getBindingFunction().invoke(sQLiteStatementPrepare);
                    int columnIndex = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "code");
                    int columnIndex2 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "phone");
                    int columnIndex3 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "beneficiary_id");
                    int columnIndex4 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "beneficiary_rootId");
                    int columnIndex5 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "beneficiary_email");
                    int columnIndex6 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "beneficiary_phone");
                    int columnIndex7 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "alias_beneficiary_id");
                    int columnIndex8 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "payment_counterparty_id");
                    int columnIndex9 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "apm_contact_id");
                    int columnIndex10 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "cardOwnerId");
                    int columnIndex11 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "leg_id");
                    int columnIndex12 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "timestamp");
                    int columnIndex13 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "counterparty_details_group");
                    int columnIndex14 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "crypto_withdraw_address_id");
                    int columnIndex15 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "crypto_deposit_source_address");
                    ArrayList arrayList2 = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        ArrayList arrayList3 = arrayList2;
                        String text2 = null;
                        String text3 = (columnIndex == -1 || sQLiteStatementPrepare.isNull(columnIndex)) ? null : sQLiteStatementPrepare.getText(columnIndex);
                        String text4 = (columnIndex2 == -1 || sQLiteStatementPrepare.isNull(columnIndex2)) ? null : sQLiteStatementPrepare.getText(columnIndex2);
                        String text5 = (columnIndex3 == -1 || sQLiteStatementPrepare.isNull(columnIndex3)) ? null : sQLiteStatementPrepare.getText(columnIndex3);
                        String text6 = (columnIndex4 == -1 || sQLiteStatementPrepare.isNull(columnIndex4)) ? null : sQLiteStatementPrepare.getText(columnIndex4);
                        String text7 = (columnIndex5 == -1 || sQLiteStatementPrepare.isNull(columnIndex5)) ? null : sQLiteStatementPrepare.getText(columnIndex5);
                        String text8 = (columnIndex6 == -1 || sQLiteStatementPrepare.isNull(columnIndex6)) ? null : sQLiteStatementPrepare.getText(columnIndex6);
                        String text9 = (columnIndex7 == -1 || sQLiteStatementPrepare.isNull(columnIndex7)) ? null : sQLiteStatementPrepare.getText(columnIndex7);
                        String text10 = (columnIndex8 == -1 || sQLiteStatementPrepare.isNull(columnIndex8)) ? null : sQLiteStatementPrepare.getText(columnIndex8);
                        String text11 = (columnIndex9 == -1 || sQLiteStatementPrepare.isNull(columnIndex9)) ? null : sQLiteStatementPrepare.getText(columnIndex9);
                        String text12 = (columnIndex10 == -1 || sQLiteStatementPrepare.isNull(columnIndex10)) ? null : sQLiteStatementPrepare.getText(columnIndex10);
                        String text13 = (columnIndex11 == -1 || sQLiteStatementPrepare.isNull(columnIndex11)) ? null : sQLiteStatementPrepare.getText(columnIndex11);
                        long j2 = columnIndex12 == -1 ? 0L : sQLiteStatementPrepare.getLong(columnIndex12);
                        String text14 = (columnIndex13 == -1 || sQLiteStatementPrepare.isNull(columnIndex13)) ? null : sQLiteStatementPrepare.getText(columnIndex13);
                        if (columnIndex14 == -1 || sQLiteStatementPrepare.isNull(columnIndex14)) {
                            int i3 = columnIndex;
                            i = columnIndex15;
                            i2 = i3;
                            text = null;
                        } else {
                            int i5 = columnIndex;
                            i = columnIndex15;
                            i2 = i5;
                            text = sQLiteStatementPrepare.getText(columnIndex14);
                        }
                        if (i != -1 && !sQLiteStatementPrepare.isNull(i)) {
                            text2 = sQLiteStatementPrepare.getText(i);
                        }
                        int i6 = i;
                        arrayList3.add(new o3(text3, text4, text5, text6, text7, text8, text9, text10, text11, text12, text13, j2, text14, text, text2));
                        arrayList2 = arrayList3;
                        columnIndex = i2;
                        columnIndex15 = i6;
                        break;
                    }
                    return arrayList2;
                } finally {
                }
            case 8:
                RoomRawQuery roomRawQuery9 = this.f113005c;
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare(this.f113004b);
                try {
                    roomRawQuery9.getBindingFunction().invoke(sQLiteStatementPrepare);
                    Long lValueOf = null;
                    if (sQLiteStatementPrepare.step() && !sQLiteStatementPrepare.isNull(0)) {
                        lValueOf = Long.valueOf(sQLiteStatementPrepare.getLong(0));
                        break;
                    }
                    return lValueOf;
                } finally {
                }
            case 9:
                RoomRawQuery roomRawQuery10 = this.f113005c;
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare(this.f113004b);
                try {
                    roomRawQuery10.getBindingFunction().invoke(sQLiteStatementPrepare);
                    ArrayList arrayList4 = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        arrayList4.add(sQLiteStatementPrepare.isNull(0) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(0)));
                        break;
                    }
                    return arrayList4;
                } finally {
                }
            case 10:
                RoomRawQuery roomRawQuery11 = this.f113005c;
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare(this.f113004b);
                try {
                    roomRawQuery11.getBindingFunction().invoke(sQLiteStatementPrepare);
                    Long lValueOf2 = null;
                    if (sQLiteStatementPrepare.step() && !sQLiteStatementPrepare.isNull(0)) {
                        lValueOf2 = Long.valueOf(sQLiteStatementPrepare.getLong(0));
                        break;
                    }
                    return lValueOf2;
                } finally {
                }
            default:
                RoomRawQuery roomRawQuery12 = this.f113005c;
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare(this.f113004b);
                try {
                    roomRawQuery12.getBindingFunction().invoke(sQLiteStatementPrepare);
                    int columnIndex16 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "related_transaction_identifier");
                    int columnIndex17 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "related_transaction_own_group_id");
                    int columnIndex18 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "related_transaction_type");
                    int columnIndex19 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "related_transaction_amount");
                    int columnIndex20 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "related_transaction_amount_with_fee");
                    int columnIndex21 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "related_transaction_amount_with_charges");
                    int columnIndex22 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "related_transaction_currency");
                    int columnIndex23 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "related_transaction_pocket_id");
                    int columnIndex24 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "related_transaction_vault_id");
                    int columnIndex25 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "related_transaction_cashback_pocket_id");
                    int columnIndex26 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "related_transaction_autoinvest_target_pocket_id");
                    int columnIndex27 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "related_transaction_autoinvest_target_type");
                    int columnIndex28 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "related_transaction_autoinvest_strategy");
                    int columnIndex29 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "related_transaction_calculated_balance");
                    ArrayList arrayList5 = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        ArrayList arrayList6 = arrayList5;
                        String text15 = null;
                        String text16 = (columnIndex16 == -1 || sQLiteStatementPrepare.isNull(columnIndex16)) ? null : sQLiteStatementPrepare.getText(columnIndex16);
                        String text17 = (columnIndex17 == -1 || sQLiteStatementPrepare.isNull(columnIndex17)) ? null : sQLiteStatementPrepare.getText(columnIndex17);
                        String text18 = (columnIndex18 == -1 || sQLiteStatementPrepare.isNull(columnIndex18)) ? null : sQLiteStatementPrepare.getText(columnIndex18);
                        String text19 = (columnIndex19 == -1 || sQLiteStatementPrepare.isNull(columnIndex19)) ? null : sQLiteStatementPrepare.getText(columnIndex19);
                        String text20 = (columnIndex20 == -1 || sQLiteStatementPrepare.isNull(columnIndex20)) ? null : sQLiteStatementPrepare.getText(columnIndex20);
                        String text21 = (columnIndex21 == -1 || sQLiteStatementPrepare.isNull(columnIndex21)) ? null : sQLiteStatementPrepare.getText(columnIndex21);
                        String text22 = (columnIndex22 == -1 || sQLiteStatementPrepare.isNull(columnIndex22)) ? null : sQLiteStatementPrepare.getText(columnIndex22);
                        String text23 = (columnIndex23 == -1 || sQLiteStatementPrepare.isNull(columnIndex23)) ? null : sQLiteStatementPrepare.getText(columnIndex23);
                        String text24 = (columnIndex24 == -1 || sQLiteStatementPrepare.isNull(columnIndex24)) ? null : sQLiteStatementPrepare.getText(columnIndex24);
                        String text25 = (columnIndex25 == -1 || sQLiteStatementPrepare.isNull(columnIndex25)) ? null : sQLiteStatementPrepare.getText(columnIndex25);
                        String text26 = (columnIndex26 == -1 || sQLiteStatementPrepare.isNull(columnIndex26)) ? null : sQLiteStatementPrepare.getText(columnIndex26);
                        String text27 = (columnIndex27 == -1 || sQLiteStatementPrepare.isNull(columnIndex27)) ? null : sQLiteStatementPrepare.getText(columnIndex27);
                        String text28 = (columnIndex28 == -1 || sQLiteStatementPrepare.isNull(columnIndex28)) ? null : sQLiteStatementPrepare.getText(columnIndex28);
                        if (columnIndex29 != -1 && !sQLiteStatementPrepare.isNull(columnIndex29)) {
                            text15 = sQLiteStatementPrepare.getText(columnIndex29);
                        }
                        int i21 = columnIndex16;
                        arrayList6.add(new h2(text16, text17, text18, text19, text20, text21, text22, text23, text24, text25, text26, text27, text28, text15));
                        arrayList5 = arrayList6;
                        columnIndex16 = i21;
                        break;
                    }
                    return arrayList5;
                } finally {
                }
        }
    }
}
