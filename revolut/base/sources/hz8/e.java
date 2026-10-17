package hz8;

import androidx.collection.ArrayMap;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.util.ArrayList;
import java.util.List;
import jz8.m;
import jz8.z0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import u09.v;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f157064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f157065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f157066c;

    public /* synthetic */ e(h hVar, v vVar, int i) {
        this.f157064a = i;
        this.f157065b = hVar;
        this.f157066c = vVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteStatement sQLiteStatementPrepare;
        int i;
        int i2;
        Integer numValueOf;
        Boolean boolValueOf;
        int i3;
        switch (this.f157064a) {
            case 0:
                v vVar = this.f157066c;
                this.f157065b.getClass();
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("DELETE FROM `courses` WHERE `domain` = ?");
                try {
                    sQLiteStatementPrepare.bindText(1, h.a(vVar));
                    sQLiteStatementPrepare.step();
                    sQLiteStatementPrepare.close();
                    return null;
                } finally {
                    sQLiteStatementPrepare.close();
                }
            default:
                v domain = this.f157066c;
                SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
                h hVar = this.f157065b;
                gz8.g gVar = hVar.f157073c;
                sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM `courses` WHERE `domain` = ?");
                try {
                    Intrinsics.checkNotNullParameter(domain, "domain");
                    String strName = domain.name();
                    if (strName == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, strName);
                    }
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "title");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "reward");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "thumbnail");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "state");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mode");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "domain");
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "description");
                    int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "courseIndex");
                    int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "lessonsProgress");
                    int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "incentiveEnded");
                    int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tags");
                    int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "coverImage");
                    int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "totalEarnedReward");
                    int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "badges");
                    int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hasLessonsWithAbuseRewardStatus");
                    ArrayMap arrayMap = new ArrayMap();
                    while (true) {
                        if (!sQLiteStatementPrepare.step()) {
                            int i5 = columnIndexOrThrow12;
                            int i6 = columnIndexOrThrow11;
                            sQLiteStatementPrepare.reset();
                            hVar.c(sQLiteConnection, arrayMap);
                            ArrayList arrayList = new ArrayList();
                            while (sQLiteStatementPrepare.step()) {
                                String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                                String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                                z0 z0VarA = gz8.g.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3));
                                String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                                String value = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                                Intrinsics.checkNotNullParameter(value, "value");
                                u09.l lVarValueOf = u09.l.valueOf(value);
                                String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                                u09.k kVarValueOf = text4 != null ? u09.k.valueOf(text4) : null;
                                v vVarB = gz8.c.b(sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7));
                                String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                                int i21 = columnIndexOrThrow2;
                                int i22 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9);
                                ArrayList arrayListA = gz8.e.a(gz8.c.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10)));
                                int i32 = columnIndexOrThrow3;
                                int i33 = i6;
                                int i43 = columnIndexOrThrow4;
                                boolean z = ((int) sQLiteStatementPrepare.getLong(i33)) != 0;
                                int i59 = i5;
                                List listA = gz8.c.a(sQLiteStatementPrepare.isNull(i59) ? null : sQLiteStatementPrepare.getText(i59));
                                int i66 = columnIndexOrThrow13;
                                String text6 = sQLiteStatementPrepare.isNull(i66) ? null : sQLiteStatementPrepare.getText(i66);
                                int i74 = columnIndexOrThrow7;
                                int i92 = columnIndexOrThrow14;
                                jz8.l lVarB = gz8.g.b(sQLiteStatementPrepare.isNull(i92) ? null : sQLiteStatementPrepare.getText(i92));
                                columnIndexOrThrow14 = i92;
                                int i96 = columnIndexOrThrow15;
                                List listA2 = gz8.a.a(sQLiteStatementPrepare.isNull(i96) ? null : sQLiteStatementPrepare.getText(i96));
                                columnIndexOrThrow15 = i96;
                                int i99 = columnIndexOrThrow16;
                                if (sQLiteStatementPrepare.isNull(i99)) {
                                    i = i22;
                                    i2 = i33;
                                    numValueOf = null;
                                } else {
                                    i = i22;
                                    i2 = i33;
                                    numValueOf = Integer.valueOf((int) sQLiteStatementPrepare.getLong(i99));
                                }
                                if (numValueOf == null) {
                                    boolValueOf = null;
                                } else {
                                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                                }
                                jz8.i iVar = new jz8.i(text, text2, z0VarA, text3, lVarValueOf, kVarValueOf, vVarB, text5, i, arrayListA, z, listA, text6, lVarB, listA2, boolValueOf);
                                String text7 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                                arrayList.add(new m(iVar, text7 != null ? (ArrayList) arrayMap.get(text7) : new ArrayList()));
                                columnIndexOrThrow2 = i21;
                                columnIndexOrThrow7 = i74;
                                columnIndexOrThrow13 = i66;
                                columnIndexOrThrow4 = i43;
                                i6 = i2;
                                columnIndexOrThrow16 = i99;
                                i5 = i59;
                                columnIndexOrThrow3 = i32;
                                break;
                            }
                            return arrayList;
                        }
                        int i100 = columnIndexOrThrow12;
                        String text8 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                        if (text8 == null || arrayMap.containsKey(text8)) {
                            i3 = columnIndexOrThrow11;
                        } else {
                            i3 = columnIndexOrThrow11;
                            arrayMap.put(text8, new ArrayList());
                        }
                        columnIndexOrThrow12 = i100;
                        columnIndexOrThrow11 = i3;
                    }
                } catch (Throwable th10) {
                    throw th10;
                }
                break;
        }
    }
}
