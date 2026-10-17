package hz8;

import androidx.collection.ArrayMap;
import androidx.room.RoomDatabase;
import androidx.room.util.RelationUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.revolut.feature.learn.shared.impl.data.database.LearnDatabase;
import dcl.s0;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import jz8.e0;
import jz8.t0;
import jz8.z0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import u09.i0;
import u09.v;
import u09.y;

/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f157071a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gz8.g f157073c = new gz8.g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s0 f157072b = new s0(this, 20);
    public final s0 d = new s0(this, 21);
    public final s0 e = new s0(this, 22);
    public final s0 f = new s0(23);

    public h(LearnDatabase learnDatabase) {
        this.f157071a = learnDatabase;
    }

    public static String a(v vVar) {
        switch (g.f157070a[vVar.ordinal()]) {
            case 1:
                return "CRYPTO";
            case 2:
                return "TRADING";
            case 3:
                return "FRAUD";
            case 4:
                return "APP_TIPS";
            case 5:
                return "PRO";
            case 6:
                return "YOUTH_TRADING";
            default:
                throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: " + vVar);
        }
    }

    public final void b(SQLiteConnection sQLiteConnection, ArrayMap arrayMap) {
        ArrayList arrayList;
        Set<String> setKeySet = arrayMap.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        int i = 1;
        if (arrayMap.getSize() > 999) {
            RelationUtil.recursiveFetchArrayMap(arrayMap, true, new c(this, sQLiteConnection, 1));
            return;
        }
        StringBuilder sbS = p.a.s("SELECT `courses`.`id` AS `id`,`courses`.`title` AS `title`,`courses`.`reward` AS `reward`,`courses`.`thumbnail` AS `thumbnail`,`courses`.`state` AS `state`,`courses`.`mode` AS `mode`,`courses`.`domain` AS `domain`,`courses`.`description` AS `description`,`courses`.`courseIndex` AS `courseIndex`,`courses`.`lessonsProgress` AS `lessonsProgress`,`courses`.`incentiveEnded` AS `incentiveEnded`,`courses`.`tags` AS `tags`,`courses`.`coverImage` AS `coverImage`,`courses`.`totalEarnedReward` AS `totalEarnedReward`,`courses`.`badges` AS `badges`,`courses`.`hasLessonsWithAbuseRewardStatus` AS `hasLessonsWithAbuseRewardStatus`,_junction.`categoryId` FROM `course_category_join` AS _junction INNER JOIN `courses` ON (_junction.`courseId` = `courses`.`id`) WHERE _junction.`categoryId` IN (");
        StringUtil.appendPlaceholders(sbS, setKeySet.size());
        sbS.append(")");
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(sbS.toString());
        int i2 = 1;
        for (String str : setKeySet) {
            if (str == null) {
                sQLiteStatementPrepare.bindNull(i2);
            } else {
                sQLiteStatementPrepare.bindText(i2, str);
            }
            i2++;
        }
        while (sQLiteStatementPrepare.step()) {
            try {
                String text = sQLiteStatementPrepare.isNull(16) ? null : sQLiteStatementPrepare.getText(16);
                if (text != null && (arrayList = (ArrayList) arrayMap.get(text)) != null) {
                    String text2 = sQLiteStatementPrepare.isNull(0) ? null : sQLiteStatementPrepare.getText(0);
                    String text3 = sQLiteStatementPrepare.isNull(i) ? null : sQLiteStatementPrepare.getText(i);
                    z0 z0VarA = gz8.g.a(sQLiteStatementPrepare.isNull(2) ? null : sQLiteStatementPrepare.getText(2));
                    String text4 = sQLiteStatementPrepare.isNull(3) ? null : sQLiteStatementPrepare.getText(3);
                    String value = sQLiteStatementPrepare.isNull(4) ? null : sQLiteStatementPrepare.getText(4);
                    Intrinsics.checkNotNullParameter(value, "value");
                    u09.l lVarValueOf = u09.l.valueOf(value);
                    String text5 = sQLiteStatementPrepare.isNull(5) ? null : sQLiteStatementPrepare.getText(5);
                    u09.k kVarValueOf = text5 != null ? u09.k.valueOf(text5) : null;
                    v vVarB = gz8.c.b(sQLiteStatementPrepare.isNull(6) ? null : sQLiteStatementPrepare.getText(6));
                    String text6 = sQLiteStatementPrepare.isNull(7) ? null : sQLiteStatementPrepare.getText(7);
                    int i3 = (int) sQLiteStatementPrepare.getLong(8);
                    ArrayList arrayListA = gz8.e.a(gz8.c.a(sQLiteStatementPrepare.isNull(9) ? null : sQLiteStatementPrepare.getText(9)));
                    boolean z = ((int) sQLiteStatementPrepare.getLong(10)) != 0;
                    List listA = gz8.c.a(sQLiteStatementPrepare.isNull(11) ? null : sQLiteStatementPrepare.getText(11));
                    String text7 = sQLiteStatementPrepare.isNull(12) ? null : sQLiteStatementPrepare.getText(12);
                    jz8.l lVarB = gz8.g.b(sQLiteStatementPrepare.isNull(13) ? null : sQLiteStatementPrepare.getText(13));
                    List listA2 = gz8.a.a(sQLiteStatementPrepare.isNull(14) ? null : sQLiteStatementPrepare.getText(14));
                    Integer numValueOf = sQLiteStatementPrepare.isNull(15) ? null : Integer.valueOf((int) sQLiteStatementPrepare.getLong(15));
                    arrayList.add(new jz8.i(text2, text3, z0VarA, text4, lVarValueOf, kVarValueOf, vVarB, text6, i3, arrayListA, z, listA, text7, lVarB, listA2, numValueOf == null ? null : Boolean.valueOf(numValueOf.intValue() != 0)));
                }
                i = 1;
            } catch (Throwable th10) {
                sQLiteStatementPrepare.close();
                throw th10;
            }
        }
        sQLiteStatementPrepare.close();
    }

    public final void c(SQLiteConnection sQLiteConnection, ArrayMap arrayMap) {
        ArrayList arrayList;
        jz8.s0 s0Var;
        Set<String> setKeySet = arrayMap.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        int i = 1;
        if (arrayMap.getSize() > 999) {
            RelationUtil.recursiveFetchArrayMap(arrayMap, true, new c(this, sQLiteConnection, 0));
            return;
        }
        StringBuilder sbS = p.a.s("SELECT `id`,`title`,`courseId`,`thumbnail`,`contentCards`,`quiz`,`reward`,`progress`,`coverImage`,`content`,`rewardStatus`,`lessonIndex`,`totalLessons`,`preconditions` FROM `lessons` WHERE `courseId` IN (");
        StringUtil.appendPlaceholders(sbS, setKeySet.size());
        sbS.append(")");
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(sbS.toString());
        int i2 = 1;
        for (String str : setKeySet) {
            if (str == null) {
                sQLiteStatementPrepare.bindNull(i2);
            } else {
                sQLiteStatementPrepare.bindText(i2, str);
            }
            i2++;
        }
        try {
            int columnIndex = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "courseId");
            if (columnIndex == -1) {
                return;
            }
            while (sQLiteStatementPrepare.step()) {
                String text = null;
                String text2 = sQLiteStatementPrepare.isNull(columnIndex) ? null : sQLiteStatementPrepare.getText(columnIndex);
                if (text2 != null && (arrayList = (ArrayList) arrayMap.get(text2)) != null) {
                    String text3 = sQLiteStatementPrepare.isNull(0) ? null : sQLiteStatementPrepare.getText(0);
                    String text4 = sQLiteStatementPrepare.isNull(i) ? null : sQLiteStatementPrepare.getText(i);
                    String text5 = sQLiteStatementPrepare.isNull(2) ? null : sQLiteStatementPrepare.getText(2);
                    String text6 = sQLiteStatementPrepare.isNull(3) ? null : sQLiteStatementPrepare.getText(3);
                    List listA = gz8.d.a(sQLiteStatementPrepare.isNull(4) ? null : sQLiteStatementPrepare.getText(4));
                    String text7 = sQLiteStatementPrepare.isNull(5) ? null : sQLiteStatementPrepare.getText(5);
                    if (text7 != null) {
                        Json jsonA = mz8.a.a();
                        jsonA.getClass();
                        s0Var = (jz8.s0) jsonA.b(jz8.s0.Companion.serializer(), text7);
                    } else {
                        s0Var = null;
                    }
                    z0 z0VarA = gz8.g.a(sQLiteStatementPrepare.isNull(6) ? null : sQLiteStatementPrepare.getText(6));
                    String value = sQLiteStatementPrepare.isNull(7) ? null : sQLiteStatementPrepare.getText(7);
                    Intrinsics.checkNotNullParameter(value, "value");
                    y yVarValueOf = y.valueOf(value);
                    String text8 = sQLiteStatementPrepare.isNull(8) ? null : sQLiteStatementPrepare.getText(8);
                    String json = sQLiteStatementPrepare.isNull(9) ? null : sQLiteStatementPrepare.getText(9);
                    Intrinsics.checkNotNullParameter(json, "json");
                    Json jsonA2 = mz8.a.a();
                    jsonA2.getClass();
                    e0 e0Var = (e0) jsonA2.b(e0.Companion.serializer(), json);
                    String value2 = sQLiteStatementPrepare.isNull(10) ? null : sQLiteStatementPrepare.getText(10);
                    Intrinsics.checkNotNullParameter(value2, "value");
                    i0 i0VarValueOf = i0.valueOf(value2);
                    int i3 = (int) sQLiteStatementPrepare.getLong(11);
                    int i5 = (int) sQLiteStatementPrepare.getLong(12);
                    if (!sQLiteStatementPrepare.isNull(13)) {
                        text = sQLiteStatementPrepare.getText(13);
                    }
                    arrayList.add(new t0(text3, text4, text5, text6, listA, s0Var, z0VarA, yVarValueOf, text8, e0Var, i0VarValueOf, i3, i5, gz8.c.a(text)));
                }
                i = 1;
            }
        } finally {
            sQLiteStatementPrepare.close();
        }
    }
}
