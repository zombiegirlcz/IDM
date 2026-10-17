package ml3;

import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f206576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f206577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f206578c;
    public final /* synthetic */ List d;

    public /* synthetic */ c(h hVar, String str, List list, int i) {
        this.f206576a = i;
        this.f206577b = hVar;
        this.f206578c = str;
        this.d = list;
    }

    /* JADX WARN: Finally extract failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String text;
        int i;
        int i2;
        String text2;
        int i3;
        int i5;
        String text3;
        int i6;
        int i21;
        switch (this.f206576a) {
            case 0:
                List<Long> list = this.d;
                this.f206577b.getClass();
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare(this.f206578c);
                try {
                    int i22 = 1;
                    for (Long l2 : list) {
                        if (l2 == null) {
                            sQLiteStatementPrepare.bindNull(i22);
                        } else {
                            sQLiteStatementPrepare.bindLong(i22, l2.longValue());
                        }
                        i22++;
                    }
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
                        String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                        String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                        String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                        String text7 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                        String text8 = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                        String text9 = sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                        if (sQLiteStatementPrepare.isNull(columnIndexOrThrow8)) {
                            text = null;
                            i2 = columnIndexOrThrow2;
                            i = columnIndexOrThrow3;
                        } else {
                            text = sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                            i = columnIndexOrThrow3;
                            i2 = columnIndexOrThrow2;
                        }
                        boolean z = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9)) != 0;
                        int i32 = columnIndexOrThrow4;
                        boolean z3 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10)) != 0;
                        Long lValueOf = sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow11));
                        String text10 = sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12);
                        int i33 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow13);
                        long j3 = sQLiteStatementPrepare.getLong(columnIndexOrThrow14);
                        int i43 = columnIndexOrThrow15;
                        String text11 = sQLiteStatementPrepare.isNull(i43) ? null : sQLiteStatementPrepare.getText(i43);
                        int i59 = columnIndexOrThrow;
                        int i66 = columnIndexOrThrow16;
                        ll3.a aVarA = pl3.a.a(sQLiteStatementPrepare.isNull(i66) ? null : sQLiteStatementPrepare.getText(i66));
                        columnIndexOrThrow16 = i66;
                        int i74 = columnIndexOrThrow17;
                        String text12 = sQLiteStatementPrepare.isNull(i74) ? null : sQLiteStatementPrepare.getText(i74);
                        columnIndexOrThrow17 = i74;
                        int i92 = columnIndexOrThrow18;
                        String text13 = sQLiteStatementPrepare.isNull(i92) ? null : sQLiteStatementPrepare.getText(i92);
                        columnIndexOrThrow18 = i92;
                        int i96 = columnIndexOrThrow19;
                        String text14 = sQLiteStatementPrepare.isNull(i96) ? null : sQLiteStatementPrepare.getText(i96);
                        columnIndexOrThrow19 = i96;
                        int i99 = columnIndexOrThrow20;
                        arrayList.add(new i(j2, text4, text5, text6, text7, text8, text9, text, z, z3, lValueOf, text10, i33, j3, text11, aVarA, text12, text13, text14, sQLiteStatementPrepare.isNull(i99) ? null : sQLiteStatementPrepare.getText(i99)));
                        columnIndexOrThrow20 = i99;
                        columnIndexOrThrow = i59;
                        columnIndexOrThrow3 = i;
                        columnIndexOrThrow15 = i43;
                        columnIndexOrThrow4 = i32;
                        columnIndexOrThrow2 = i2;
                        break;
                    }
                    sQLiteStatementPrepare.close();
                    return arrayList;
                } catch (Throwable th10) {
                    sQLiteStatementPrepare.close();
                    throw th10;
                }
            case 1:
                List<String> list2 = this.d;
                this.f206577b.getClass();
                SQLiteStatement sQLiteStatementPrepare2 = ((SQLiteConnection) obj2).prepare(this.f206578c);
                try {
                    int i100 = 1;
                    for (String str : list2) {
                        if (str == null) {
                            sQLiteStatementPrepare2.bindNull(i100);
                        } else {
                            sQLiteStatementPrepare2.bindText(i100, str);
                        }
                        i100++;
                    }
                    int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "id");
                    int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "point");
                    int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "displayedName");
                    int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "firstName");
                    int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "lastName");
                    int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "registeredAs");
                    int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "username");
                    int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "code");
                    int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "isRevolut");
                    int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "isNewlyJoined");
                    int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "joinDate");
                    int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "birthday");
                    int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "transactionsCount");
                    int columnIndexOrThrow34 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "timestamp");
                    int columnIndexOrThrow35 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "pictureUri");
                    int columnIndexOrThrow36 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "type");
                    int columnIndexOrThrow37 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "country");
                    int columnIndexOrThrow38 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "appMode");
                    int columnIndexOrThrow39 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "paidPlan");
                    int columnIndexOrThrow40 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "customerType");
                    ArrayList arrayList2 = new ArrayList();
                    while (sQLiteStatementPrepare2.step()) {
                        long j5 = sQLiteStatementPrepare2.getLong(columnIndexOrThrow21);
                        String text15 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow22) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow22);
                        String text16 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow23) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow23);
                        String text17 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow24) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow24);
                        String text18 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow25) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow25);
                        String text19 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow26) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow26);
                        String text20 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow27) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow27);
                        if (sQLiteStatementPrepare2.isNull(columnIndexOrThrow28)) {
                            text2 = null;
                            i5 = columnIndexOrThrow22;
                            i3 = columnIndexOrThrow23;
                        } else {
                            text2 = sQLiteStatementPrepare2.getText(columnIndexOrThrow28);
                            i3 = columnIndexOrThrow23;
                            i5 = columnIndexOrThrow22;
                        }
                        boolean z4 = ((int) sQLiteStatementPrepare2.getLong(columnIndexOrThrow29)) != 0;
                        int i101 = columnIndexOrThrow24;
                        boolean z6 = ((int) sQLiteStatementPrepare2.getLong(columnIndexOrThrow30)) != 0;
                        Long lValueOf2 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow31) ? null : Long.valueOf(sQLiteStatementPrepare2.getLong(columnIndexOrThrow31));
                        String text21 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow32) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow32);
                        int i102 = (int) sQLiteStatementPrepare2.getLong(columnIndexOrThrow33);
                        long j16 = sQLiteStatementPrepare2.getLong(columnIndexOrThrow34);
                        int i103 = columnIndexOrThrow35;
                        String text22 = sQLiteStatementPrepare2.isNull(i103) ? null : sQLiteStatementPrepare2.getText(i103);
                        int i104 = columnIndexOrThrow21;
                        int i105 = columnIndexOrThrow36;
                        ll3.a aVarA2 = pl3.a.a(sQLiteStatementPrepare2.isNull(i105) ? null : sQLiteStatementPrepare2.getText(i105));
                        columnIndexOrThrow36 = i105;
                        int i106 = columnIndexOrThrow37;
                        String text23 = sQLiteStatementPrepare2.isNull(i106) ? null : sQLiteStatementPrepare2.getText(i106);
                        columnIndexOrThrow37 = i106;
                        int i107 = columnIndexOrThrow38;
                        String text24 = sQLiteStatementPrepare2.isNull(i107) ? null : sQLiteStatementPrepare2.getText(i107);
                        columnIndexOrThrow38 = i107;
                        int i108 = columnIndexOrThrow39;
                        String text25 = sQLiteStatementPrepare2.isNull(i108) ? null : sQLiteStatementPrepare2.getText(i108);
                        columnIndexOrThrow39 = i108;
                        int i109 = columnIndexOrThrow40;
                        arrayList2.add(new i(j5, text15, text16, text17, text18, text19, text20, text2, z4, z6, lValueOf2, text21, i102, j16, text22, aVarA2, text23, text24, text25, sQLiteStatementPrepare2.isNull(i109) ? null : sQLiteStatementPrepare2.getText(i109)));
                        columnIndexOrThrow40 = i109;
                        columnIndexOrThrow21 = i104;
                        columnIndexOrThrow23 = i3;
                        columnIndexOrThrow35 = i103;
                        columnIndexOrThrow24 = i101;
                        columnIndexOrThrow22 = i5;
                        break;
                    }
                    sQLiteStatementPrepare2.close();
                    return arrayList2;
                } catch (Throwable th11) {
                    sQLiteStatementPrepare2.close();
                    throw th11;
                }
            default:
                List<Long> list3 = this.d;
                this.f206577b.getClass();
                SQLiteStatement sQLiteStatementPrepare3 = ((SQLiteConnection) obj2).prepare(this.f206578c);
                try {
                    int i110 = 1;
                    for (Long l3 : list3) {
                        if (l3 == null) {
                            sQLiteStatementPrepare3.bindNull(i110);
                        } else {
                            sQLiteStatementPrepare3.bindLong(i110, l3.longValue());
                        }
                        i110++;
                    }
                    int columnIndexOrThrow41 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "id");
                    int columnIndexOrThrow42 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "point");
                    int columnIndexOrThrow43 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "displayedName");
                    int columnIndexOrThrow44 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "firstName");
                    int columnIndexOrThrow45 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "lastName");
                    int columnIndexOrThrow46 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "registeredAs");
                    int columnIndexOrThrow47 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "username");
                    int columnIndexOrThrow48 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "code");
                    int columnIndexOrThrow49 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "isRevolut");
                    int columnIndexOrThrow50 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "isNewlyJoined");
                    int columnIndexOrThrow51 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "joinDate");
                    int columnIndexOrThrow52 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "birthday");
                    int columnIndexOrThrow53 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "transactionsCount");
                    int columnIndexOrThrow54 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "timestamp");
                    int columnIndexOrThrow55 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "pictureUri");
                    int columnIndexOrThrow56 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "type");
                    int columnIndexOrThrow57 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "country");
                    int columnIndexOrThrow58 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "appMode");
                    int columnIndexOrThrow59 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "paidPlan");
                    int columnIndexOrThrow60 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "customerType");
                    ArrayList arrayList3 = new ArrayList();
                    while (sQLiteStatementPrepare3.step()) {
                        long j22 = sQLiteStatementPrepare3.getLong(columnIndexOrThrow41);
                        String text26 = sQLiteStatementPrepare3.isNull(columnIndexOrThrow42) ? null : sQLiteStatementPrepare3.getText(columnIndexOrThrow42);
                        String text27 = sQLiteStatementPrepare3.isNull(columnIndexOrThrow43) ? null : sQLiteStatementPrepare3.getText(columnIndexOrThrow43);
                        String text28 = sQLiteStatementPrepare3.isNull(columnIndexOrThrow44) ? null : sQLiteStatementPrepare3.getText(columnIndexOrThrow44);
                        String text29 = sQLiteStatementPrepare3.isNull(columnIndexOrThrow45) ? null : sQLiteStatementPrepare3.getText(columnIndexOrThrow45);
                        String text30 = sQLiteStatementPrepare3.isNull(columnIndexOrThrow46) ? null : sQLiteStatementPrepare3.getText(columnIndexOrThrow46);
                        String text31 = sQLiteStatementPrepare3.isNull(columnIndexOrThrow47) ? null : sQLiteStatementPrepare3.getText(columnIndexOrThrow47);
                        if (sQLiteStatementPrepare3.isNull(columnIndexOrThrow48)) {
                            text3 = null;
                            i21 = columnIndexOrThrow42;
                            i6 = columnIndexOrThrow43;
                        } else {
                            text3 = sQLiteStatementPrepare3.getText(columnIndexOrThrow48);
                            i6 = columnIndexOrThrow43;
                            i21 = columnIndexOrThrow42;
                        }
                        boolean z11 = ((int) sQLiteStatementPrepare3.getLong(columnIndexOrThrow49)) != 0;
                        int i111 = columnIndexOrThrow44;
                        boolean z12 = ((int) sQLiteStatementPrepare3.getLong(columnIndexOrThrow50)) != 0;
                        Long lValueOf3 = sQLiteStatementPrepare3.isNull(columnIndexOrThrow51) ? null : Long.valueOf(sQLiteStatementPrepare3.getLong(columnIndexOrThrow51));
                        String text32 = sQLiteStatementPrepare3.isNull(columnIndexOrThrow52) ? null : sQLiteStatementPrepare3.getText(columnIndexOrThrow52);
                        int i112 = (int) sQLiteStatementPrepare3.getLong(columnIndexOrThrow53);
                        long j42 = sQLiteStatementPrepare3.getLong(columnIndexOrThrow54);
                        int i113 = columnIndexOrThrow55;
                        String text33 = sQLiteStatementPrepare3.isNull(i113) ? null : sQLiteStatementPrepare3.getText(i113);
                        int i114 = columnIndexOrThrow41;
                        int i115 = columnIndexOrThrow56;
                        ll3.a aVarA3 = pl3.a.a(sQLiteStatementPrepare3.isNull(i115) ? null : sQLiteStatementPrepare3.getText(i115));
                        columnIndexOrThrow56 = i115;
                        int i116 = columnIndexOrThrow57;
                        String text34 = sQLiteStatementPrepare3.isNull(i116) ? null : sQLiteStatementPrepare3.getText(i116);
                        columnIndexOrThrow57 = i116;
                        int i117 = columnIndexOrThrow58;
                        String text35 = sQLiteStatementPrepare3.isNull(i117) ? null : sQLiteStatementPrepare3.getText(i117);
                        columnIndexOrThrow58 = i117;
                        int i118 = columnIndexOrThrow59;
                        String text36 = sQLiteStatementPrepare3.isNull(i118) ? null : sQLiteStatementPrepare3.getText(i118);
                        columnIndexOrThrow59 = i118;
                        int i119 = columnIndexOrThrow60;
                        arrayList3.add(new i(j22, text26, text27, text28, text29, text30, text31, text3, z11, z12, lValueOf3, text32, i112, j42, text33, aVarA3, text34, text35, text36, sQLiteStatementPrepare3.isNull(i119) ? null : sQLiteStatementPrepare3.getText(i119)));
                        columnIndexOrThrow60 = i119;
                        columnIndexOrThrow41 = i114;
                        columnIndexOrThrow43 = i6;
                        columnIndexOrThrow55 = i113;
                        columnIndexOrThrow44 = i111;
                        columnIndexOrThrow42 = i21;
                        break;
                    }
                    sQLiteStatementPrepare3.close();
                    return arrayList3;
                } catch (Throwable th12) {
                    sQLiteStatementPrepare3.close();
                    throw th12;
                }
        }
    }
}
