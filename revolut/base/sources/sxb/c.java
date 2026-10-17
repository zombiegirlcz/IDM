package sxb;

import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import vxb.a0;
import vxb.c0;
import vxb.y;
import vxb.z;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f266394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f266395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f266396c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f266397g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ List f266398h;
    public final /* synthetic */ int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f266399j;
    public final /* synthetic */ List k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f266400l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f266401m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f266402n;

    public /* synthetic */ c(e eVar, String str, String str2, String str3, String str4, String str5, boolean z, List list, int i, boolean z3, List list2, int i2, long j2, int i3, int i5) {
        this.f266394a = i5;
        this.f266395b = str;
        this.f266396c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.f266397g = z;
        this.f266398h = list;
        this.i = i;
        this.f266399j = z3;
        this.k = list2;
        this.f266400l = i2;
        this.f266401m = j2;
        this.f266402n = i3;
    }

    /* JADX WARN: Finally extract failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i;
        int i2;
        String text;
        int i3;
        int i5;
        String text2;
        switch (this.f266394a) {
            case 0:
                boolean z = this.f266397g;
                List<String> list = this.f266398h;
                int i6 = this.i;
                boolean z3 = this.f266399j;
                List<String> list2 = this.k;
                int i21 = this.f266400l;
                long j2 = this.f266401m;
                int i22 = this.f266402n;
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare(this.f266395b);
                String str = this.f266396c;
                try {
                    if (str == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, str);
                    }
                    if (str == null) {
                        sQLiteStatementPrepare.bindNull(2);
                    } else {
                        sQLiteStatementPrepare.bindText(2, str);
                    }
                    String str2 = this.d;
                    if (str2 == null) {
                        sQLiteStatementPrepare.bindNull(3);
                    } else {
                        sQLiteStatementPrepare.bindText(3, str2);
                    }
                    if (str2 == null) {
                        sQLiteStatementPrepare.bindNull(4);
                    } else {
                        sQLiteStatementPrepare.bindText(4, str2);
                    }
                    String str3 = this.e;
                    if (str3 == null) {
                        sQLiteStatementPrepare.bindNull(5);
                    } else {
                        sQLiteStatementPrepare.bindText(5, str3);
                    }
                    if (str3 == null) {
                        sQLiteStatementPrepare.bindNull(6);
                    } else {
                        sQLiteStatementPrepare.bindText(6, str3);
                    }
                    String str4 = this.f;
                    if (str4 == null) {
                        sQLiteStatementPrepare.bindNull(7);
                    } else {
                        sQLiteStatementPrepare.bindText(7, str4);
                    }
                    if (str4 == null) {
                        sQLiteStatementPrepare.bindNull(8);
                    } else {
                        sQLiteStatementPrepare.bindText(8, str4);
                    }
                    sQLiteStatementPrepare.bindLong(9, z ? 1L : 0L);
                    int i32 = 10;
                    for (String str5 : list) {
                        if (str5 == null) {
                            sQLiteStatementPrepare.bindNull(i32);
                        } else {
                            sQLiteStatementPrepare.bindText(i32, str5);
                        }
                        i32++;
                    }
                    sQLiteStatementPrepare.bindLong(i6 + 10, z3 ? 1L : 0L);
                    int i33 = i6 + 11;
                    int i43 = i33;
                    for (String str6 : list2) {
                        if (str6 == null) {
                            sQLiteStatementPrepare.bindNull(i43);
                        } else {
                            sQLiteStatementPrepare.bindText(i43, str6);
                        }
                        i43++;
                    }
                    sQLiteStatementPrepare.bindLong(i33 + i21, j2);
                    sQLiteStatementPrepare.bindLong(i6 + 12 + i21, i22);
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "pointsTransactionId");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "points");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createdDate");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "coreTransactionId");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "product");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "state");
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "description");
                    int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
                    int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "iconsUrl");
                    int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "exchangeDetails");
                    int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "exchangedAmount");
                    int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "originId");
                    int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "originResource");
                    int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "receivedExchangeDetails");
                    int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "earningDetails");
                    ArrayList arrayList = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        String text3 = null;
                        String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                        String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                        double d = sQLiteStatementPrepare.getDouble(columnIndexOrThrow3);
                        long j3 = sQLiteStatementPrepare.getLong(columnIndexOrThrow4);
                        String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                        String text7 = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                        String text8 = sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                        String text9 = sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                        String text10 = sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9);
                        c0 c0VarA = txb.c.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10));
                        a0 a0VarA = txb.b.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11));
                        z zVarA = txb.a.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12));
                        String text11 = sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow13);
                        if (sQLiteStatementPrepare.isNull(columnIndexOrThrow14)) {
                            int i59 = columnIndexOrThrow;
                            i = columnIndexOrThrow15;
                            i2 = i59;
                            text = null;
                        } else {
                            int i66 = columnIndexOrThrow;
                            i = columnIndexOrThrow15;
                            i2 = i66;
                            text = sQLiteStatementPrepare.getText(columnIndexOrThrow14);
                        }
                        a0 a0VarA2 = txb.b.a(sQLiteStatementPrepare.isNull(i) ? null : sQLiteStatementPrepare.getText(i));
                        int i74 = i;
                        int i92 = columnIndexOrThrow16;
                        if (!sQLiteStatementPrepare.isNull(i92)) {
                            text3 = sQLiteStatementPrepare.getText(i92);
                        }
                        columnIndexOrThrow16 = i92;
                        arrayList.add(new y(text4, text5, d, j3, text6, text7, text8, text9, text10, c0VarA, a0VarA, zVarA, text11, text, a0VarA2, txb.b.a(text3)));
                        columnIndexOrThrow = i2;
                        columnIndexOrThrow15 = i74;
                        break;
                    }
                    sQLiteStatementPrepare.close();
                    return arrayList;
                } catch (Throwable th10) {
                    sQLiteStatementPrepare.close();
                    throw th10;
                }
            default:
                boolean z4 = this.f266397g;
                List<String> list3 = this.f266398h;
                int i96 = this.i;
                boolean z6 = this.f266399j;
                List<String> list4 = this.k;
                int i99 = this.f266400l;
                long j5 = this.f266401m;
                int i100 = this.f266402n;
                SQLiteStatement sQLiteStatementPrepare2 = ((SQLiteConnection) obj2).prepare(this.f266395b);
                String str7 = this.f266396c;
                try {
                    if (str7 == null) {
                        sQLiteStatementPrepare2.bindNull(1);
                    } else {
                        sQLiteStatementPrepare2.bindText(1, str7);
                    }
                    if (str7 == null) {
                        sQLiteStatementPrepare2.bindNull(2);
                    } else {
                        sQLiteStatementPrepare2.bindText(2, str7);
                    }
                    String str8 = this.d;
                    if (str8 == null) {
                        sQLiteStatementPrepare2.bindNull(3);
                    } else {
                        sQLiteStatementPrepare2.bindText(3, str8);
                    }
                    if (str8 == null) {
                        sQLiteStatementPrepare2.bindNull(4);
                    } else {
                        sQLiteStatementPrepare2.bindText(4, str8);
                    }
                    String str9 = this.e;
                    if (str9 == null) {
                        sQLiteStatementPrepare2.bindNull(5);
                    } else {
                        sQLiteStatementPrepare2.bindText(5, str9);
                    }
                    if (str9 == null) {
                        sQLiteStatementPrepare2.bindNull(6);
                    } else {
                        sQLiteStatementPrepare2.bindText(6, str9);
                    }
                    String str10 = this.f;
                    if (str10 == null) {
                        sQLiteStatementPrepare2.bindNull(7);
                    } else {
                        sQLiteStatementPrepare2.bindText(7, str10);
                    }
                    if (str10 == null) {
                        sQLiteStatementPrepare2.bindNull(8);
                    } else {
                        sQLiteStatementPrepare2.bindText(8, str10);
                    }
                    sQLiteStatementPrepare2.bindLong(9, z4 ? 1L : 0L);
                    int i101 = 10;
                    for (String str11 : list3) {
                        if (str11 == null) {
                            sQLiteStatementPrepare2.bindNull(i101);
                        } else {
                            sQLiteStatementPrepare2.bindText(i101, str11);
                        }
                        i101++;
                    }
                    sQLiteStatementPrepare2.bindLong(i96 + 10, z6 ? 1L : 0L);
                    int i102 = i96 + 11;
                    int i103 = i102;
                    for (String str12 : list4) {
                        if (str12 == null) {
                            sQLiteStatementPrepare2.bindNull(i103);
                        } else {
                            sQLiteStatementPrepare2.bindText(i103, str12);
                        }
                        i103++;
                    }
                    sQLiteStatementPrepare2.bindLong(i102 + i99, j5);
                    sQLiteStatementPrepare2.bindLong(i96 + 12 + i99, i100);
                    int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "pointsTransactionId");
                    int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "type");
                    int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "points");
                    int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "createdDate");
                    int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "coreTransactionId");
                    int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "product");
                    int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "state");
                    int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "description");
                    int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "name");
                    int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "iconsUrl");
                    int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "exchangeDetails");
                    int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "exchangedAmount");
                    int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "originId");
                    int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "originResource");
                    int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "receivedExchangeDetails");
                    int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "earningDetails");
                    ArrayList arrayList2 = new ArrayList();
                    while (sQLiteStatementPrepare2.step()) {
                        String text12 = null;
                        String text13 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow17) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow17);
                        String text14 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow18) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow18);
                        double d5 = sQLiteStatementPrepare2.getDouble(columnIndexOrThrow19);
                        long j16 = sQLiteStatementPrepare2.getLong(columnIndexOrThrow20);
                        String text15 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow21) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow21);
                        String text16 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow22) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow22);
                        String text17 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow23) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow23);
                        String text18 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow24) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow24);
                        String text19 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow25) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow25);
                        c0 c0VarA2 = txb.c.a(sQLiteStatementPrepare2.isNull(columnIndexOrThrow26) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow26));
                        a0 a0VarA3 = txb.b.a(sQLiteStatementPrepare2.isNull(columnIndexOrThrow27) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow27));
                        z zVarA2 = txb.a.a(sQLiteStatementPrepare2.isNull(columnIndexOrThrow28) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow28));
                        String text20 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow29) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow29);
                        if (sQLiteStatementPrepare2.isNull(columnIndexOrThrow30)) {
                            int i104 = columnIndexOrThrow17;
                            i3 = columnIndexOrThrow31;
                            i5 = i104;
                            text2 = null;
                        } else {
                            int i105 = columnIndexOrThrow17;
                            i3 = columnIndexOrThrow31;
                            i5 = i105;
                            text2 = sQLiteStatementPrepare2.getText(columnIndexOrThrow30);
                        }
                        a0 a0VarA4 = txb.b.a(sQLiteStatementPrepare2.isNull(i3) ? null : sQLiteStatementPrepare2.getText(i3));
                        int i106 = i3;
                        int i107 = columnIndexOrThrow32;
                        if (!sQLiteStatementPrepare2.isNull(i107)) {
                            text12 = sQLiteStatementPrepare2.getText(i107);
                        }
                        columnIndexOrThrow32 = i107;
                        arrayList2.add(new y(text13, text14, d5, j16, text15, text16, text17, text18, text19, c0VarA2, a0VarA3, zVarA2, text20, text2, a0VarA4, txb.b.a(text12)));
                        columnIndexOrThrow17 = i5;
                        columnIndexOrThrow31 = i106;
                        break;
                    }
                    sQLiteStatementPrepare2.close();
                    return arrayList2;
                } catch (Throwable th11) {
                    sQLiteStatementPrepare2.close();
                    throw th11;
                }
        }
    }
}
