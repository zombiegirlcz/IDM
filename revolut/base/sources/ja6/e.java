package ja6;

import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import la6.h;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f172452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f172453b;

    public /* synthetic */ e(f fVar, int i) {
        this.f172452a = i;
        this.f172453b = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws Throwable {
        SQLiteStatement sQLiteStatement;
        int i;
        String text;
        switch (this.f172452a) {
            case 0:
                this.f172453b.getClass();
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM charity");
                try {
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "pocket_id");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "brief");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "description");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "icon");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "banner");
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "campaign");
                    int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "shareable");
                    int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "code");
                    int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "availability_area");
                    int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "donors_count");
                    int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "rank");
                    int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "featured");
                    int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "availability");
                    int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "pointsRedemptionAvailable");
                    int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "total_donation_amount");
                    int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "total_donation_currency");
                    int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "my_donation_amount");
                    int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "my_donation_currency");
                    ArrayList arrayList = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                        String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                        String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                        String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                        String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                        String text7 = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                        String text8 = sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                        la6.a aVarA = ia6.a.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8));
                        int i2 = columnIndexOrThrow2;
                        int i3 = columnIndexOrThrow3;
                        boolean z = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9)) != 0;
                        String text9 = sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10);
                        String text10 = sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11);
                        long j2 = sQLiteStatementPrepare.getLong(columnIndexOrThrow12);
                        int i5 = columnIndexOrThrow4;
                        int i6 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow13);
                        boolean z3 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow14)) != 0;
                        int i21 = columnIndexOrThrow15;
                        String text11 = sQLiteStatementPrepare.isNull(i21) ? null : sQLiteStatementPrepare.getText(i21);
                        int i22 = columnIndexOrThrow5;
                        int i32 = columnIndexOrThrow16;
                        boolean z4 = ((int) sQLiteStatementPrepare.getLong(i32)) != 0;
                        int i33 = columnIndexOrThrow17;
                        long j3 = sQLiteStatementPrepare.getLong(i33);
                        int i43 = columnIndexOrThrow;
                        int i59 = columnIndexOrThrow18;
                        if (sQLiteStatementPrepare.isNull(i59)) {
                            i = i59;
                            text = null;
                        } else {
                            i = i59;
                            text = sQLiteStatementPrepare.getText(i59);
                        }
                        jo3.b bVar = new jo3.b(j3, text);
                        int i66 = columnIndexOrThrow19;
                        long j5 = sQLiteStatementPrepare.getLong(i66);
                        columnIndexOrThrow19 = i66;
                        int i74 = columnIndexOrThrow20;
                        columnIndexOrThrow20 = i74;
                        sQLiteStatement = sQLiteStatementPrepare;
                        try {
                            arrayList.add(new h(text2, text3, text4, text5, text6, text7, text8, bVar, new jo3.b(j5, sQLiteStatementPrepare.isNull(i74) ? null : sQLiteStatementPrepare.getText(i74)), aVarA, z, text9, text10, j2, i6, z3, text11, z4));
                            columnIndexOrThrow5 = i22;
                            columnIndexOrThrow15 = i21;
                            columnIndexOrThrow4 = i5;
                            columnIndexOrThrow16 = i32;
                            columnIndexOrThrow17 = i33;
                            columnIndexOrThrow2 = i2;
                            sQLiteStatementPrepare = sQLiteStatement;
                            columnIndexOrThrow3 = i3;
                            columnIndexOrThrow = i43;
                            columnIndexOrThrow18 = i;
                        } catch (Throwable th10) {
                            th = th10;
                            sQLiteStatement.close();
                            throw th;
                        }
                        break;
                    }
                    sQLiteStatementPrepare.close();
                    return arrayList;
                } catch (Throwable th11) {
                    th = th11;
                    sQLiteStatement = sQLiteStatementPrepare;
                }
                break;
            default:
                this.f172453b.getClass();
                SQLiteStatement sQLiteStatementPrepare2 = ((SQLiteConnection) obj2).prepare("SELECT * FROM charity_collections");
                try {
                    int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "id");
                    int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "title");
                    int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "description");
                    int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "banner_url");
                    int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "charities");
                    int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "featured");
                    ArrayList arrayList2 = new ArrayList();
                    while (sQLiteStatementPrepare2.step()) {
                        String text12 = null;
                        String text13 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow21) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow21);
                        String text14 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow22) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow22);
                        String text15 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow23) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow23);
                        String text16 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow24) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow24);
                        if (!sQLiteStatementPrepare2.isNull(columnIndexOrThrow25)) {
                            text12 = sQLiteStatementPrepare2.getText(columnIndexOrThrow25);
                        }
                        arrayList2.add(new la6.c(text13, text14, ia6.b.a(text12), text15, text16, ((int) sQLiteStatementPrepare2.getLong(columnIndexOrThrow26)) != 0));
                        break;
                    }
                    return arrayList2;
                } finally {
                    sQLiteStatementPrepare2.close();
                }
        }
    }
}
