package nvg;

import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f219607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f219608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f219609c;
    public final /* synthetic */ String d;

    public /* synthetic */ f(h hVar, String str, boolean z, String str2, int i) {
        this.f219607a = i;
        this.f219608b = str;
        this.f219609c = z;
        this.d = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f219607a) {
            case 0:
                boolean z = this.f219609c;
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM `complex_analytics_combined_allocations_assets` WHERE `account_types_combined` = ? AND `sector` = ? AND `currency` = ?");
                String str = this.f219608b;
                try {
                    if (str == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, str);
                    }
                    sQLiteStatementPrepare.bindLong(2, z ? 1L : 0L);
                    String str2 = this.d;
                    if (str2 == null) {
                        sQLiteStatementPrepare.bindNull(3);
                    } else {
                        sQLiteStatementPrepare.bindText(3, str2);
                    }
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "account_types_combined");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "asset_type");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sector");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "currency");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "asset");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "quantity");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "value");
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "allocation");
                    int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ref");
                    int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "opening_price");
                    int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "current_price");
                    int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "position_id");
                    int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "leverage");
                    ArrayList arrayList = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                        iwg.a aVarE = pvg.t.e(sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2));
                        int i = columnIndexOrThrow;
                        boolean z3 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3)) != 0;
                        arrayList.add(new pvg.e((float) sQLiteStatementPrepare.getDouble(columnIndexOrThrow8), aVarE, text, sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5), sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6), sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9), sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12), sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow13), b21.a.g(sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7)), b21.a.e(sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10)), b21.a.e(sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11)), z3));
                        columnIndexOrThrow = i;
                        break;
                    }
                    sQLiteStatementPrepare.close();
                    return arrayList;
                } finally {
                    sQLiteStatementPrepare.close();
                }
            case 1:
                boolean z4 = this.f219609c;
                SQLiteStatement sQLiteStatementPrepare2 = ((SQLiteConnection) obj2).prepare("SELECT * FROM `complex_analytics_combined_allocations_cash` WHERE `account_types_combined` = ? AND `sector` = ? AND `currency` = ?");
                String str3 = this.f219608b;
                try {
                    if (str3 == null) {
                        sQLiteStatementPrepare2.bindNull(1);
                    } else {
                        sQLiteStatementPrepare2.bindText(1, str3);
                    }
                    sQLiteStatementPrepare2.bindLong(2, z4 ? 1L : 0L);
                    String str4 = this.d;
                    if (str4 == null) {
                        sQLiteStatementPrepare2.bindNull(3);
                    } else {
                        sQLiteStatementPrepare2.bindText(3, str4);
                    }
                    int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "account_types_combined");
                    int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "asset_type");
                    int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "sector");
                    int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "currency");
                    int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "asset");
                    int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "value");
                    int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "allocation");
                    ArrayList arrayList2 = new ArrayList();
                    while (sQLiteStatementPrepare2.step()) {
                        String text2 = null;
                        String text3 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow14) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow14);
                        iwg.a aVarE2 = pvg.t.e(sQLiteStatementPrepare2.isNull(columnIndexOrThrow15) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow15));
                        boolean z6 = ((int) sQLiteStatementPrepare2.getLong(columnIndexOrThrow16)) != 0;
                        String text4 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow17) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow17);
                        String text5 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow18) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow18);
                        if (!sQLiteStatementPrepare2.isNull(columnIndexOrThrow19)) {
                            text2 = sQLiteStatementPrepare2.getText(columnIndexOrThrow19);
                        }
                        arrayList2.add(new pvg.f((float) sQLiteStatementPrepare2.getDouble(columnIndexOrThrow20), aVarE2, text3, text4, text5, b21.a.g(text2), z6));
                        break;
                    }
                    sQLiteStatementPrepare2.close();
                    return arrayList2;
                } finally {
                }
            default:
                boolean z11 = this.f219609c;
                SQLiteStatement sQLiteStatementPrepare3 = ((SQLiteConnection) obj2).prepare("SELECT * FROM `complex_analytics_combined_allocations` WHERE `account_types_combined` = ? AND `sector` = ? AND `currency` = ?");
                String str5 = this.f219608b;
                boolean z12 = true;
                try {
                    if (str5 == null) {
                        sQLiteStatementPrepare3.bindNull(1);
                    } else {
                        sQLiteStatementPrepare3.bindText(1, str5);
                    }
                    sQLiteStatementPrepare3.bindLong(2, z11 ? 1L : 0L);
                    String str6 = this.d;
                    if (str6 == null) {
                        sQLiteStatementPrepare3.bindNull(3);
                    } else {
                        sQLiteStatementPrepare3.bindText(3, str6);
                    }
                    int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "account_types_combined");
                    int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "sector");
                    int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "currency");
                    int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "total_value");
                    pvg.g gVar = null;
                    String text6 = null;
                    if (sQLiteStatementPrepare3.step()) {
                        String text7 = sQLiteStatementPrepare3.isNull(columnIndexOrThrow21) ? null : sQLiteStatementPrepare3.getText(columnIndexOrThrow21);
                        if (((int) sQLiteStatementPrepare3.getLong(columnIndexOrThrow22)) == 0) {
                            z12 = false;
                        }
                        String text8 = sQLiteStatementPrepare3.isNull(columnIndexOrThrow23) ? null : sQLiteStatementPrepare3.getText(columnIndexOrThrow23);
                        if (!sQLiteStatementPrepare3.isNull(columnIndexOrThrow24)) {
                            text6 = sQLiteStatementPrepare3.getText(columnIndexOrThrow24);
                        }
                        gVar = new pvg.g(text7, text8, b21.a.g(text6), z12);
                        break;
                    }
                    sQLiteStatementPrepare3.close();
                    return gVar;
                } finally {
                }
        }
    }
}
