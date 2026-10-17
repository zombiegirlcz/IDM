package ml3;

import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f206579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f206580b;

    public /* synthetic */ d(h hVar, int i) {
        this.f206579a = i;
        this.f206580b = hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteStatement sQLiteStatementPrepare;
        String text;
        int i;
        int i2;
        String text2;
        int i3;
        int i5;
        switch (this.f206579a) {
            case 0:
                this.f206580b.getClass();
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM contact WHERE isRevolut = 1 AND paidPlan IS NOT NULL ORDER BY displayedName COLLATE NOCASE ASC");
                try {
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "point");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "displayedName");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "firstName");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "lastName");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "registeredAs");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "username");
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "code");
                    int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isRevolut");
                    int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isNewlyJoined");
                    int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "joinDate");
                    int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "birthday");
                    int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "transactionsCount");
                    int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timestamp");
                    int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "pictureUri");
                    int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
                    int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "country");
                    int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "appMode");
                    int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "paidPlan");
                    int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customerType");
                    ArrayList arrayList = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        long j2 = sQLiteStatementPrepare.getLong(columnIndexOrThrow);
                        String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                        String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                        String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                        String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                        String text7 = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                        String text8 = sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                        if (sQLiteStatementPrepare.isNull(columnIndexOrThrow8)) {
                            text = null;
                            i2 = columnIndexOrThrow2;
                            i = columnIndexOrThrow3;
                        } else {
                            text = sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                            i = columnIndexOrThrow3;
                            i2 = columnIndexOrThrow2;
                        }
                        boolean z = true;
                        if (((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9)) == 0) {
                            z = false;
                        }
                        boolean z3 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10)) != 0;
                        Long lValueOf = sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow11));
                        String text9 = sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12);
                        int i6 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow13);
                        long j3 = sQLiteStatementPrepare.getLong(columnIndexOrThrow14);
                        int i21 = columnIndexOrThrow15;
                        String text10 = sQLiteStatementPrepare.isNull(i21) ? null : sQLiteStatementPrepare.getText(i21);
                        int i22 = columnIndexOrThrow;
                        int i32 = columnIndexOrThrow16;
                        ll3.a aVarA = pl3.a.a(sQLiteStatementPrepare.isNull(i32) ? null : sQLiteStatementPrepare.getText(i32));
                        columnIndexOrThrow16 = i32;
                        int i33 = columnIndexOrThrow17;
                        String text11 = sQLiteStatementPrepare.isNull(i33) ? null : sQLiteStatementPrepare.getText(i33);
                        columnIndexOrThrow17 = i33;
                        int i43 = columnIndexOrThrow18;
                        String text12 = sQLiteStatementPrepare.isNull(i43) ? null : sQLiteStatementPrepare.getText(i43);
                        columnIndexOrThrow18 = i43;
                        int i59 = columnIndexOrThrow19;
                        String text13 = sQLiteStatementPrepare.isNull(i59) ? null : sQLiteStatementPrepare.getText(i59);
                        columnIndexOrThrow19 = i59;
                        int i66 = columnIndexOrThrow20;
                        arrayList.add(new i(j2, text3, text4, text5, text6, text7, text8, text, z, z3, lValueOf, text9, i6, j3, text10, aVarA, text11, text12, text13, sQLiteStatementPrepare.isNull(i66) ? null : sQLiteStatementPrepare.getText(i66)));
                        columnIndexOrThrow20 = i66;
                        columnIndexOrThrow2 = i2;
                        columnIndexOrThrow = i22;
                        columnIndexOrThrow15 = i21;
                        columnIndexOrThrow3 = i;
                        break;
                    }
                    return arrayList;
                } finally {
                }
            default:
                this.f206580b.getClass();
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM contact ORDER BY isRevolut DESC, displayedName COLLATE NOCASE ASC LIMIT ?");
                try {
                    sQLiteStatementPrepare.bindLong(1, Integer.MAX_VALUE);
                    int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "point");
                    int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "displayedName");
                    int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "firstName");
                    int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "lastName");
                    int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "registeredAs");
                    int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "username");
                    int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "code");
                    int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isRevolut");
                    int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isNewlyJoined");
                    int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "joinDate");
                    int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "birthday");
                    int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "transactionsCount");
                    int columnIndexOrThrow34 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timestamp");
                    int columnIndexOrThrow35 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "pictureUri");
                    int columnIndexOrThrow36 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
                    int columnIndexOrThrow37 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "country");
                    int columnIndexOrThrow38 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "appMode");
                    int columnIndexOrThrow39 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "paidPlan");
                    int columnIndexOrThrow40 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customerType");
                    ArrayList arrayList2 = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        long j5 = sQLiteStatementPrepare.getLong(columnIndexOrThrow21);
                        String text14 = sQLiteStatementPrepare.isNull(columnIndexOrThrow22) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow22);
                        String text15 = sQLiteStatementPrepare.isNull(columnIndexOrThrow23) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow23);
                        String text16 = sQLiteStatementPrepare.isNull(columnIndexOrThrow24) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow24);
                        String text17 = sQLiteStatementPrepare.isNull(columnIndexOrThrow25) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow25);
                        String text18 = sQLiteStatementPrepare.isNull(columnIndexOrThrow26) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow26);
                        String text19 = sQLiteStatementPrepare.isNull(columnIndexOrThrow27) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow27);
                        if (sQLiteStatementPrepare.isNull(columnIndexOrThrow28)) {
                            text2 = null;
                            i5 = columnIndexOrThrow21;
                            i3 = columnIndexOrThrow22;
                        } else {
                            text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow28);
                            i3 = columnIndexOrThrow22;
                            i5 = columnIndexOrThrow21;
                        }
                        boolean z4 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow29)) != 0;
                        int i74 = columnIndexOrThrow23;
                        boolean z6 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow30)) != 0;
                        Long lValueOf2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow31) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow31));
                        String text20 = sQLiteStatementPrepare.isNull(columnIndexOrThrow32) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow32);
                        int i92 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow33);
                        long j16 = sQLiteStatementPrepare.getLong(columnIndexOrThrow34);
                        int i96 = columnIndexOrThrow35;
                        String text21 = sQLiteStatementPrepare.isNull(i96) ? null : sQLiteStatementPrepare.getText(i96);
                        int i99 = columnIndexOrThrow34;
                        int i100 = columnIndexOrThrow36;
                        ll3.a aVarA2 = pl3.a.a(sQLiteStatementPrepare.isNull(i100) ? null : sQLiteStatementPrepare.getText(i100));
                        columnIndexOrThrow36 = i100;
                        int i101 = columnIndexOrThrow37;
                        String text22 = sQLiteStatementPrepare.isNull(i101) ? null : sQLiteStatementPrepare.getText(i101);
                        columnIndexOrThrow37 = i101;
                        int i102 = columnIndexOrThrow38;
                        String text23 = sQLiteStatementPrepare.isNull(i102) ? null : sQLiteStatementPrepare.getText(i102);
                        columnIndexOrThrow38 = i102;
                        int i103 = columnIndexOrThrow39;
                        String text24 = sQLiteStatementPrepare.isNull(i103) ? null : sQLiteStatementPrepare.getText(i103);
                        columnIndexOrThrow39 = i103;
                        int i104 = columnIndexOrThrow40;
                        arrayList2.add(new i(j5, text14, text15, text16, text17, text18, text19, text2, z4, z6, lValueOf2, text20, i92, j16, text21, aVarA2, text22, text23, text24, sQLiteStatementPrepare.isNull(i104) ? null : sQLiteStatementPrepare.getText(i104)));
                        columnIndexOrThrow40 = i104;
                        columnIndexOrThrow34 = i99;
                        columnIndexOrThrow22 = i3;
                        columnIndexOrThrow35 = i96;
                        columnIndexOrThrow23 = i74;
                        columnIndexOrThrow21 = i5;
                        break;
                    }
                    return arrayList2;
                } finally {
                }
        }
    }
}
