package prk;

import android.os.Parcel;
import androidx.room.util.StringUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLiteStatement;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ql7.v1;
import vkm.q0;
import zhm.y0;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class o {
    public static void A(SupportSQLiteDatabase supportSQLiteDatabase, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(supportSQLiteDatabase, str);
        supportSQLiteDatabase.execSQL(str2);
        supportSQLiteDatabase.execSQL(str3);
    }

    public static void B(SupportSQLiteDatabase supportSQLiteDatabase, String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(supportSQLiteDatabase, str);
        supportSQLiteDatabase.execSQL(str2);
        supportSQLiteDatabase.execSQL(str3);
        supportSQLiteDatabase.execSQL(str4);
    }

    public static void C(SupportSQLiteDatabase supportSQLiteDatabase, String str, String str2, String str3) {
        supportSQLiteDatabase.execSQL(str);
        supportSQLiteDatabase.execSQL(str2);
        supportSQLiteDatabase.execSQL(str3);
    }

    public static void D(SupportSQLiteDatabase supportSQLiteDatabase, String str, String str2, String str3, String str4) {
        supportSQLiteDatabase.execSQL(str);
        supportSQLiteDatabase.execSQL(str2);
        supportSQLiteDatabase.execSQL(str3);
        supportSQLiteDatabase.execSQL(str4);
    }

    public static int a(Parcel parcel, LinkedHashSet linkedHashSet, int i, int i2) {
        linkedHashSet.add(parcel.readString());
        return i + i2;
    }

    public static int b(TradingAccount tradingAccount, int i, int i2) {
        return (tradingAccount.hashCode() + i) * i2;
    }

    public static int c(eel.c cVar, int i, int i2) {
        return (cVar.hashCode() + i) * i2;
    }

    public static int d(iwg.c cVar, int i, int i2) {
        return (cVar.hashCode() + i) * i2;
    }

    public static e4m.e e(ey.b bVar, ey.d dVar, int i) {
        return e4m.b.b(new v1(bVar, dVar, i, 24));
    }

    public static e4m.e f(g0 g0Var, p pVar, int i) {
        return e4m.b.b(new ppd.i0(g0Var, pVar, i, 23));
    }

    public static e4m.e g(g0 g0Var, e0 e0Var, f0 f0Var, int i) {
        return e4m.b.b(new ppd.j(g0Var, e0Var, f0Var, i, 6));
    }

    public static e4m.e h(px.g gVar, px.h hVar, int i) {
        return e4m.b.b(new k0(gVar, hVar, i, 3));
    }

    public static e4m.e i(q7k.j jVar, q7k.i iVar, int i) {
        return e4m.b.b(new k0(jVar, iVar, i, 8));
    }

    public static e4m.e j(q8j.c cVar, q8j.e eVar, int i) {
        return e4m.b.b(new k0(cVar, eVar, i, 11));
    }

    public static e4m.e k(r41.b bVar, r41.a aVar, int i) {
        return e4m.b.b(new qy7.f(bVar, aVar, i, 9));
    }

    public static efm.d0 l(efm.r rVar, Function2 function2, Function2 function22, int i, String str) {
        efm.d0 d0VarFirstOrError = m70.a.g(rVar, function2, function22, i).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, str);
        return d0VarFirstOrError;
    }

    public static Boolean m(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, str2);
        return Boolean.valueOf(Intrinsics.f(str3, str4));
    }

    public static Integer n(HashMap map, Integer num, String str, int i, String str2) {
        map.put(num, str);
        Integer numValueOf = Integer.valueOf(i);
        map.put(numValueOf, str2);
        return numValueOf;
    }

    public static String o(String str, TableInfo tableInfo, String str2, TableInfo tableInfo2) {
        return str + tableInfo + str2 + tableInfo2;
    }

    public static String p(String str, List list, StringBuilder sb6) {
        StringUtil.appendPlaceholders(sb6, list.size());
        sb6.append(str);
        return sb6.toString();
    }

    public static String q(String str, p97.b bVar) {
        return str + bVar;
    }

    public static String r(UUID uuid, String str) {
        return str + uuid;
    }

    public static HashSet s(HashMap map, String str, TableInfo.Column column, int i) {
        map.put(str, column);
        return new HashSet(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Iterator t(Object obj2, Parcel parcel) {
        parcel.writeInt(obj2.size());
        return obj2.entrySet().iterator();
    }

    public static List u() {
        return zhm.u.c(new o31.b());
    }

    public static List v(int i, int i2, Integer num, Object obj2, String str) {
        return zhm.u.c(new HtmlClause(i, i2, num, obj2, str));
    }

    public static q0 w(String str, String str2, wkm.l lVar) {
        return rd0.e.n(lVar, y0.b(new Pair(str, str2)));
    }

    public static void x(int i, float f, LinkedHashMap linkedHashMap, Integer num) {
        linkedHashMap.put(num, Integer.valueOf(vc.o.I(f, i)));
    }

    public static void y(SQLiteStatement sQLiteStatement, int i, int i2, int i3) {
        sQLiteStatement.bindNull(i);
        sQLiteStatement.bindNull(i2);
        sQLiteStatement.bindNull(i3);
    }

    public static void z(SQLiteStatement sQLiteStatement, int i, int i2, int i3, int i5) {
        sQLiteStatement.bindNull(i);
        sQLiteStatement.bindNull(i2);
        sQLiteStatement.bindNull(i3);
        sQLiteStatement.bindNull(i5);
    }
}
