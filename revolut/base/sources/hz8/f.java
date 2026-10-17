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
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f157067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f157068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f157069c;

    public /* synthetic */ f(h hVar, String str, int i) {
        this.f157067a = i;
        this.f157068b = hVar;
        this.f157069c = str;
    }

    /* JADX WARN: Finally extract failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteStatement sQLiteStatementPrepare;
        Boolean boolValueOf;
        int i;
        switch (this.f157067a) {
            case 0:
                SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
                h hVar = this.f157068b;
                gz8.g gVar = hVar.f157073c;
                sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM `courses` WHERE `id` = ?");
                String str = this.f157069c;
                try {
                    if (str == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, str);
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
                            int i2 = columnIndexOrThrow12;
                            int i3 = columnIndexOrThrow11;
                            sQLiteStatementPrepare.reset();
                            hVar.c(sQLiteConnection, arrayMap);
                            if (sQLiteStatementPrepare.step()) {
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
                                int i5 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9);
                                ArrayList arrayListA = gz8.e.a(gz8.c.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10)));
                                boolean z = ((int) sQLiteStatementPrepare.getLong(i3)) != 0;
                                List listA = gz8.c.a(sQLiteStatementPrepare.isNull(i2) ? null : sQLiteStatementPrepare.getText(i2));
                                String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow13);
                                jz8.l lVarB = gz8.g.b(sQLiteStatementPrepare.isNull(columnIndexOrThrow14) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow14));
                                List listA2 = gz8.a.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow15) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow15));
                                Integer numValueOf = sQLiteStatementPrepare.isNull(columnIndexOrThrow16) ? null : Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow16));
                                if (numValueOf == null) {
                                    boolValueOf = null;
                                } else {
                                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                                }
                                jz8.i iVar = new jz8.i(text, text2, z0VarA, text3, lVarValueOf, kVarValueOf, vVarB, text5, i5, arrayListA, z, listA, text6, lVarB, listA2, boolValueOf);
                                Object text7 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                                mVar = new m(iVar, text7 != null ? (ArrayList) arrayMap.get(text7) : new ArrayList());
                            }
                            sQLiteStatementPrepare.close();
                            return mVar;
                        }
                        int i6 = columnIndexOrThrow12;
                        Object text8 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                        if (text8 == null || arrayMap.containsKey(text8)) {
                            i = columnIndexOrThrow11;
                        } else {
                            i = columnIndexOrThrow11;
                            arrayMap.put(text8, new ArrayList());
                        }
                        columnIndexOrThrow12 = i6;
                        columnIndexOrThrow11 = i;
                    }
                } finally {
                    sQLiteStatementPrepare.close();
                }
                break;
            default:
                SQLiteConnection sQLiteConnection2 = (SQLiteConnection) obj2;
                h hVar2 = this.f157068b;
                hVar2.getClass();
                sQLiteStatementPrepare = sQLiteConnection2.prepare("SELECT * FROM course_categories WHERE productDomains LIKE '%' || ? || '%'");
                String str2 = this.f157069c;
                try {
                    if (str2 == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, str2);
                    }
                    int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "category");
                    int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "title");
                    int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "variant");
                    int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "productDomains");
                    ArrayMap arrayMap2 = new ArrayMap();
                    while (true) {
                        String text9 = null;
                        if (!sQLiteStatementPrepare.step()) {
                            sQLiteStatementPrepare.reset();
                            hVar2.b(sQLiteConnection2, arrayMap2);
                            ArrayList arrayList = new ArrayList();
                            while (sQLiteStatementPrepare.step()) {
                                jz8.f fVar = new jz8.f(sQLiteStatementPrepare.isNull(columnIndexOrThrow17) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow17), sQLiteStatementPrepare.isNull(columnIndexOrThrow18) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow18), sQLiteStatementPrepare.isNull(columnIndexOrThrow19) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow19), gz8.c.c(sQLiteStatementPrepare.isNull(columnIndexOrThrow20) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow20)));
                                String text10 = sQLiteStatementPrepare.isNull(columnIndexOrThrow17) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow17);
                                arrayList.add(new jz8.h(fVar, text10 != null ? (ArrayList) arrayMap2.get(text10) : new ArrayList()));
                                break;
                            }
                            sQLiteStatementPrepare.close();
                            return arrayList;
                        }
                        if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow17)) {
                            text9 = sQLiteStatementPrepare.getText(columnIndexOrThrow17);
                        }
                        if (text9 != null && !arrayMap2.containsKey(text9)) {
                            arrayMap2.put(text9, new ArrayList());
                        }
                    }
                } catch (Throwable th10) {
                    throw th10;
                }
                break;
        }
    }
}
