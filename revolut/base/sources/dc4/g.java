package dc4;

import androidx.collection.ArrayMap;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.google.gson.reflect.TypeToken;
import dcl.c0;
import dcl.h0;
import dcl.j0;
import dcl.l0;
import dcl.n;
import dcl.p;
import dcl.s;
import dcl.v;
import dcl.x;
import dcl.z;
import hcl.i0;
import hcl.m0;
import hcl.o0;
import hcl.q0;
import hcl.s0;
import hcl.v2;
import hcl.z2;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kg.o;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pcl.q;
import pcl.r;
import pcl.t;
import pcl.u;
import pcl.w;
import pcl.y;
import qcl.m;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f112792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f112793c;

    public /* synthetic */ g(Object obj2, Object obj3, int i) {
        this.f112791a = i;
        this.f112792b = obj2;
        this.f112793c = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0098 A[Catch: all -> 0x001d, TRY_LEAVE, TryCatch #5 {all -> 0x001d, blocks: (B:4:0x0019, B:8:0x0023, B:10:0x005a, B:14:0x0067, B:20:0x0077, B:23:0x008d, B:28:0x009e, B:31:0x00b4, B:36:0x00c5, B:39:0x00db, B:44:0x00ed, B:47:0x0103, B:52:0x0115, B:55:0x012b, B:60:0x013d, B:63:0x0153, B:68:0x0165, B:69:0x0179, B:66:0x015f, B:58:0x0137, B:50:0x010f, B:42:0x00e7, B:34:0x00bf, B:26:0x0098, B:17:0x006f, B:13:0x0062, B:7:0x0020), top: B:92:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bf A[Catch: all -> 0x001d, TRY_LEAVE, TryCatch #5 {all -> 0x001d, blocks: (B:4:0x0019, B:8:0x0023, B:10:0x005a, B:14:0x0067, B:20:0x0077, B:23:0x008d, B:28:0x009e, B:31:0x00b4, B:36:0x00c5, B:39:0x00db, B:44:0x00ed, B:47:0x0103, B:52:0x0115, B:55:0x012b, B:60:0x013d, B:63:0x0153, B:68:0x0165, B:69:0x0179, B:66:0x015f, B:58:0x0137, B:50:0x010f, B:42:0x00e7, B:34:0x00bf, B:26:0x0098, B:17:0x006f, B:13:0x0062, B:7:0x0020), top: B:92:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e7 A[Catch: all -> 0x001d, TRY_LEAVE, TryCatch #5 {all -> 0x001d, blocks: (B:4:0x0019, B:8:0x0023, B:10:0x005a, B:14:0x0067, B:20:0x0077, B:23:0x008d, B:28:0x009e, B:31:0x00b4, B:36:0x00c5, B:39:0x00db, B:44:0x00ed, B:47:0x0103, B:52:0x0115, B:55:0x012b, B:60:0x013d, B:63:0x0153, B:68:0x0165, B:69:0x0179, B:66:0x015f, B:58:0x0137, B:50:0x010f, B:42:0x00e7, B:34:0x00bf, B:26:0x0098, B:17:0x006f, B:13:0x0062, B:7:0x0020), top: B:92:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010f A[Catch: all -> 0x001d, TRY_LEAVE, TryCatch #5 {all -> 0x001d, blocks: (B:4:0x0019, B:8:0x0023, B:10:0x005a, B:14:0x0067, B:20:0x0077, B:23:0x008d, B:28:0x009e, B:31:0x00b4, B:36:0x00c5, B:39:0x00db, B:44:0x00ed, B:47:0x0103, B:52:0x0115, B:55:0x012b, B:60:0x013d, B:63:0x0153, B:68:0x0165, B:69:0x0179, B:66:0x015f, B:58:0x0137, B:50:0x010f, B:42:0x00e7, B:34:0x00bf, B:26:0x0098, B:17:0x006f, B:13:0x0062, B:7:0x0020), top: B:92:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0137 A[Catch: all -> 0x001d, TRY_LEAVE, TryCatch #5 {all -> 0x001d, blocks: (B:4:0x0019, B:8:0x0023, B:10:0x005a, B:14:0x0067, B:20:0x0077, B:23:0x008d, B:28:0x009e, B:31:0x00b4, B:36:0x00c5, B:39:0x00db, B:44:0x00ed, B:47:0x0103, B:52:0x0115, B:55:0x012b, B:60:0x013d, B:63:0x0153, B:68:0x0165, B:69:0x0179, B:66:0x015f, B:58:0x0137, B:50:0x010f, B:42:0x00e7, B:34:0x00bf, B:26:0x0098, B:17:0x006f, B:13:0x0062, B:7:0x0020), top: B:92:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015f A[Catch: all -> 0x001d, TRY_LEAVE, TryCatch #5 {all -> 0x001d, blocks: (B:4:0x0019, B:8:0x0023, B:10:0x005a, B:14:0x0067, B:20:0x0077, B:23:0x008d, B:28:0x009e, B:31:0x00b4, B:36:0x00c5, B:39:0x00db, B:44:0x00ed, B:47:0x0103, B:52:0x0115, B:55:0x012b, B:60:0x013d, B:63:0x0153, B:68:0x0165, B:69:0x0179, B:66:0x015f, B:58:0x0137, B:50:0x010f, B:42:0x00e7, B:34:0x00bf, B:26:0x0098, B:17:0x006f, B:13:0x0062, B:7:0x0020), top: B:92:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0115 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0165 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x009e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x013d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00ed A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object a(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dc4.g.a(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0191 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c3 A[Catch: all -> 0x001d, TRY_LEAVE, TryCatch #7 {all -> 0x001d, blocks: (B:4:0x0019, B:8:0x0023, B:10:0x0066, B:14:0x0073, B:18:0x0082, B:22:0x0091, B:28:0x00a1, B:31:0x00b7, B:36:0x00c9, B:39:0x00df, B:44:0x00f1, B:47:0x0107, B:52:0x0119, B:55:0x012f, B:60:0x0141, B:63:0x0157, B:68:0x0169, B:71:0x017f, B:76:0x0191, B:77:0x01a5, B:74:0x018b, B:66:0x0163, B:58:0x013b, B:50:0x0113, B:42:0x00eb, B:34:0x00c3, B:25:0x0099, B:21:0x008b, B:17:0x007c, B:13:0x006e, B:7:0x0020), top: B:104:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00eb A[Catch: all -> 0x001d, TRY_LEAVE, TryCatch #7 {all -> 0x001d, blocks: (B:4:0x0019, B:8:0x0023, B:10:0x0066, B:14:0x0073, B:18:0x0082, B:22:0x0091, B:28:0x00a1, B:31:0x00b7, B:36:0x00c9, B:39:0x00df, B:44:0x00f1, B:47:0x0107, B:52:0x0119, B:55:0x012f, B:60:0x0141, B:63:0x0157, B:68:0x0169, B:71:0x017f, B:76:0x0191, B:77:0x01a5, B:74:0x018b, B:66:0x0163, B:58:0x013b, B:50:0x0113, B:42:0x00eb, B:34:0x00c3, B:25:0x0099, B:21:0x008b, B:17:0x007c, B:13:0x006e, B:7:0x0020), top: B:104:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0113 A[Catch: all -> 0x001d, TRY_LEAVE, TryCatch #7 {all -> 0x001d, blocks: (B:4:0x0019, B:8:0x0023, B:10:0x0066, B:14:0x0073, B:18:0x0082, B:22:0x0091, B:28:0x00a1, B:31:0x00b7, B:36:0x00c9, B:39:0x00df, B:44:0x00f1, B:47:0x0107, B:52:0x0119, B:55:0x012f, B:60:0x0141, B:63:0x0157, B:68:0x0169, B:71:0x017f, B:76:0x0191, B:77:0x01a5, B:74:0x018b, B:66:0x0163, B:58:0x013b, B:50:0x0113, B:42:0x00eb, B:34:0x00c3, B:25:0x0099, B:21:0x008b, B:17:0x007c, B:13:0x006e, B:7:0x0020), top: B:104:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013b A[Catch: all -> 0x001d, TRY_LEAVE, TryCatch #7 {all -> 0x001d, blocks: (B:4:0x0019, B:8:0x0023, B:10:0x0066, B:14:0x0073, B:18:0x0082, B:22:0x0091, B:28:0x00a1, B:31:0x00b7, B:36:0x00c9, B:39:0x00df, B:44:0x00f1, B:47:0x0107, B:52:0x0119, B:55:0x012f, B:60:0x0141, B:63:0x0157, B:68:0x0169, B:71:0x017f, B:76:0x0191, B:77:0x01a5, B:74:0x018b, B:66:0x0163, B:58:0x013b, B:50:0x0113, B:42:0x00eb, B:34:0x00c3, B:25:0x0099, B:21:0x008b, B:17:0x007c, B:13:0x006e, B:7:0x0020), top: B:104:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0163 A[Catch: all -> 0x001d, TRY_LEAVE, TryCatch #7 {all -> 0x001d, blocks: (B:4:0x0019, B:8:0x0023, B:10:0x0066, B:14:0x0073, B:18:0x0082, B:22:0x0091, B:28:0x00a1, B:31:0x00b7, B:36:0x00c9, B:39:0x00df, B:44:0x00f1, B:47:0x0107, B:52:0x0119, B:55:0x012f, B:60:0x0141, B:63:0x0157, B:68:0x0169, B:71:0x017f, B:76:0x0191, B:77:0x01a5, B:74:0x018b, B:66:0x0163, B:58:0x013b, B:50:0x0113, B:42:0x00eb, B:34:0x00c3, B:25:0x0099, B:21:0x008b, B:17:0x007c, B:13:0x006e, B:7:0x0020), top: B:104:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x018b A[Catch: all -> 0x001d, TRY_LEAVE, TryCatch #7 {all -> 0x001d, blocks: (B:4:0x0019, B:8:0x0023, B:10:0x0066, B:14:0x0073, B:18:0x0082, B:22:0x0091, B:28:0x00a1, B:31:0x00b7, B:36:0x00c9, B:39:0x00df, B:44:0x00f1, B:47:0x0107, B:52:0x0119, B:55:0x012f, B:60:0x0141, B:63:0x0157, B:68:0x0169, B:71:0x017f, B:76:0x0191, B:77:0x01a5, B:74:0x018b, B:66:0x0163, B:58:0x013b, B:50:0x0113, B:42:0x00eb, B:34:0x00c3, B:25:0x0099, B:21:0x008b, B:17:0x007c, B:13:0x006e, B:7:0x0020), top: B:104:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0169 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0119 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00c9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0141 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object b(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dc4.g.b(java.lang.Object):java.lang.Object");
    }

    private final Object c(Object obj2) {
        n nVar = (n) this.f112792b;
        jcl.e eVar = (jcl.e) this.f112793c;
        nVar.f113040b.insert((SQLiteConnection) obj2, eVar);
        return null;
    }

    private final Object d(Object obj2) {
        p pVar = (p) this.f112792b;
        ArrayList arrayList = (ArrayList) this.f112793c;
        pVar.f113048b.insert((SQLiteConnection) obj2, (Iterable) arrayList);
        return null;
    }

    private final Object e(Object obj2) {
        s sVar = (s) this.f112792b;
        q0 q0Var = (q0) this.f112793c;
        sVar.f113053b.insert((SQLiteConnection) obj2, q0Var);
        return null;
    }

    private final Object g(Object obj2) {
        v vVar = (v) this.f112792b;
        ArrayList arrayList = (ArrayList) this.f112793c;
        vVar.f113060b.insert((SQLiteConnection) obj2, (Iterable) arrayList);
        return null;
    }

    private final Object h(Object obj2) {
        x xVar = (x) this.f112792b;
        String str = (String) this.f112793c;
        xVar.getClass();
        SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM instrument_details_recommendations WHERE ref = ?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.bindNull(1);
            } else {
                sQLiteStatementPrepare.bindText(1, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ref");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "recommendations");
            m0 m0Var = null;
            List list = null;
            if (sQLiteStatementPrepare.step()) {
                String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                if (text2 != null) {
                    o oVarA = zbl.a.a();
                    Type type = new TypeToken<List<? extends z2>>() { // from class: com.revolut.shared.feature.wealth.domain.impl.data.database.typeconverters.RecommendationsConsensusTypeConverter$fromJsonToRecommendationConsensusEmbeddedEntity$lambda$0$$inlined$fromJson$1
                    }.getType();
                    Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                    Object objD = oVarA.d(text2, type);
                    Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
                    list = (List) objD;
                }
                m0Var = new m0(text, list);
            }
            sQLiteStatementPrepare.close();
            return m0Var;
        } catch (Throwable th10) {
            sQLiteStatementPrepare.close();
            throw th10;
        }
    }

    private final Object i(Object obj2) {
        x xVar = (x) this.f112792b;
        m0 m0Var = (m0) this.f112793c;
        xVar.f113066b.insert((SQLiteConnection) obj2, m0Var);
        return null;
    }

    private final Object j(Object obj2) {
        z zVar = (z) this.f112792b;
        s0 s0Var = (s0) this.f112793c;
        zVar.f113073b.insert((SQLiteConnection) obj2, s0Var);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object k(Object obj2) {
        z zVar = (z) this.f112792b;
        String str = (String) this.f112793c;
        qcl.k kVar = zVar.f113074c;
        SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM instrument_tickers_summary WHERE ref = ?");
        boolean z = true;
        try {
            if (str == null) {
                sQLiteStatementPrepare.bindNull(1);
            } else {
                sQLiteStatementPrepare.bindText(1, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ref");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "volume");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "unitVolume");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "dailyRange");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fiftyTwoWeekRange");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fiveYearRange");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "highlyVolatile");
            Object objValueOf = null;
            if (sQLiteStatementPrepare.step()) {
                String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                jo3.b bVarD = qcl.d.d(sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2));
                Long lValueOf = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow3));
                v2 v2VarE = qcl.k.e(sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4));
                v2 v2VarE2 = qcl.k.e(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
                v2 v2VarE3 = qcl.k.e(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                Integer numValueOf = sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7));
                if (numValueOf != null) {
                    if (numValueOf.intValue() == 0) {
                        z = false;
                    }
                    objValueOf = Boolean.valueOf(z);
                }
                objValueOf = new s0(text, bVarD, lValueOf, v2VarE, v2VarE2, v2VarE3, objValueOf);
            }
            sQLiteStatementPrepare.close();
            return objValueOf;
        } catch (Throwable th10) {
            sQLiteStatementPrepare.close();
            throw th10;
        }
    }

    private final Object l(Object obj2) {
        c0 c0Var = (c0) this.f112792b;
        ArrayList arrayList = (ArrayList) this.f112793c;
        c0Var.f113007b.insert((SQLiteConnection) obj2, (Iterable) arrayList);
        return null;
    }

    private final Object m(Object obj2) {
        h0 h0Var = (h0) this.f112792b;
        ArrayList arrayList = (ArrayList) this.f112793c;
        h0Var.d.upsert((SQLiteConnection) obj2, arrayList);
        return null;
    }

    private final Object n(Object obj2) {
        ((h0) this.f112792b).i((SQLiteConnection) this.f112793c, (ArrayMap) obj2);
        return Unit.f186387a;
    }

    private final Object o(Object obj2) {
        j0 j0Var = (j0) this.f112792b;
        i0 i0Var = (i0) this.f112793c;
        j0Var.f113029b.insert((SQLiteConnection) obj2, i0Var);
        return null;
    }

    private final Object p(Object obj2) {
        o0 o0Var;
        hcl.b bVar;
        j0 j0Var = (j0) this.f112792b;
        String str = (String) this.f112793c;
        j0Var.getClass();
        SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM instrument_details WHERE ref = ?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.bindNull(1);
            } else {
                sQLiteStatementPrepare.bindText(1, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ref");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "symbol");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "description");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "stockExchangeCode");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "stats");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sector");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "analystsSummary");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tags");
            i0 i0Var = null;
            String text = null;
            if (sQLiteStatementPrepare.step()) {
                String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                if (text6 != null) {
                    o oVarA = zbl.a.a();
                    Type type = new TypeToken<o0>() { // from class: com.revolut.shared.feature.wealth.domain.impl.data.database.typeconverters.InstrumentStatsOverviewTypeConverter$fromJsonToInstrumentStatsEmbeddedEntity$lambda$0$$inlined$fromJson$1
                    }.getType();
                    Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                    Object objD = oVarA.d(text6, type);
                    Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
                    o0Var = (o0) objD;
                } else {
                    o0Var = null;
                }
                String text7 = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                String text8 = sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                String text9 = sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                if (text9 != null) {
                    o oVarA2 = zbl.a.a();
                    Type type2 = new TypeToken<hcl.b>() { // from class: com.revolut.shared.feature.wealth.domain.impl.data.database.typeconverters.AnalystsSummaryTypeConverter$fromJsonToAnalystsSummaryEmbeddedEntity$lambda$0$$inlined$fromJson$1
                    }.getType();
                    Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
                    Object objD2 = oVarA2.d(text9, type2);
                    Intrinsics.checkNotNullExpressionValue(objD2, "fromJson(...)");
                    bVar = (hcl.b) objD2;
                } else {
                    bVar = null;
                }
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow9)) {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow9);
                }
                i0Var = new i0(text2, text3, text4, text5, o0Var, text7, text8, bVar, qcl.n.a(text));
            }
            sQLiteStatementPrepare.close();
            return i0Var;
        } catch (Throwable th10) {
            sQLiteStatementPrepare.close();
            throw th10;
        }
    }

    private final Object q(Object obj2) {
        l0 l0Var = (l0) this.f112792b;
        ArrayList arrayList = (ArrayList) this.f112793c;
        l0Var.f113034b.insert((SQLiteConnection) obj2, (Iterable) arrayList);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object r(Object obj2) {
        l0 l0Var = (l0) this.f112792b;
        String str = (String) this.f112793c;
        m mVar = l0Var.f113035c;
        SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM instrument_stats WHERE ref = ?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.bindNull(1);
            } else {
                sQLiteStatementPrepare.bindText(1, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ref");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "price");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "volume");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "marketCap");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "perShare");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "dividend");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "valuation");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "profitability");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "managementEffectiveness");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "listingData");
            Object yVar = null;
            if (sQLiteStatementPrepare.step()) {
                String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                String json = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                Intrinsics.checkNotNullParameter(json, "json");
                o oVarA = zbl.a.a();
                Type type = new TypeToken<u>() { // from class: com.revolut.shared.feature.wealth.domain.impl.data.database.typeconverters.InstrumentStatsTypeConverter$fromJsonToPriceEmbeddedEntity$$inlined$fromJson$1
                }.getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                Object objD = oVarA.d(json, type);
                Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
                u uVar = (u) objD;
                String json2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                Intrinsics.checkNotNullParameter(json2, "json");
                o oVarA2 = zbl.a.a();
                Type type2 = new TypeToken<pcl.x>() { // from class: com.revolut.shared.feature.wealth.domain.impl.data.database.typeconverters.InstrumentStatsTypeConverter$fromJsonToVolumeEmbeddedEntity$$inlined$fromJson$1
                }.getType();
                Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
                Object objD2 = oVarA2.d(json2, type2);
                Intrinsics.checkNotNullExpressionValue(objD2, "fromJson(...)");
                pcl.x xVar = (pcl.x) objD2;
                String json3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                Intrinsics.checkNotNullParameter(json3, "json");
                o oVarA3 = zbl.a.a();
                Type type3 = new TypeToken<pcl.s>() { // from class: com.revolut.shared.feature.wealth.domain.impl.data.database.typeconverters.InstrumentStatsTypeConverter$fromJsonToMarketCapEmbeddedEntity$$inlined$fromJson$1
                }.getType();
                Intrinsics.checkNotNullExpressionValue(type3, "getType(...)");
                Object objD3 = oVarA3.d(json3, type3);
                Intrinsics.checkNotNullExpressionValue(objD3, "fromJson(...)");
                pcl.s sVar = (pcl.s) objD3;
                String json4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                Intrinsics.checkNotNullParameter(json4, "json");
                o oVarA4 = zbl.a.a();
                Type type4 = new TypeToken<t>() { // from class: com.revolut.shared.feature.wealth.domain.impl.data.database.typeconverters.InstrumentStatsTypeConverter$fromJsonToPerShareEmbeddedEntity$$inlined$fromJson$1
                }.getType();
                Intrinsics.checkNotNullExpressionValue(type4, "getType(...)");
                Object objD4 = oVarA4.d(json4, type4);
                Intrinsics.checkNotNullExpressionValue(objD4, "fromJson(...)");
                t tVar = (t) objD4;
                String json5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                Intrinsics.checkNotNullParameter(json5, "json");
                o oVarA5 = zbl.a.a();
                Type type5 = new TypeToken<pcl.p>() { // from class: com.revolut.shared.feature.wealth.domain.impl.data.database.typeconverters.InstrumentStatsTypeConverter$fromJsonToDividendEmbeddedEntity$$inlined$fromJson$1
                }.getType();
                Intrinsics.checkNotNullExpressionValue(type5, "getType(...)");
                Object objD5 = oVarA5.d(json5, type5);
                Intrinsics.checkNotNullExpressionValue(objD5, "fromJson(...)");
                pcl.p pVar = (pcl.p) objD5;
                String json6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                Intrinsics.checkNotNullParameter(json6, "json");
                o oVarA6 = zbl.a.a();
                Type type6 = new TypeToken<w>() { // from class: com.revolut.shared.feature.wealth.domain.impl.data.database.typeconverters.InstrumentStatsTypeConverter$fromJsonToValuationEmbeddedEntity$$inlined$fromJson$1
                }.getType();
                Intrinsics.checkNotNullExpressionValue(type6, "getType(...)");
                Object objD6 = oVarA6.d(json6, type6);
                Intrinsics.checkNotNullExpressionValue(objD6, "fromJson(...)");
                w wVar = (w) objD6;
                String json7 = sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                Intrinsics.checkNotNullParameter(json7, "json");
                o oVarA7 = zbl.a.a();
                Type type7 = new TypeToken<pcl.v>() { // from class: com.revolut.shared.feature.wealth.domain.impl.data.database.typeconverters.InstrumentStatsTypeConverter$fromJsonToProfitabilityEmbeddedEntity$$inlined$fromJson$1
                }.getType();
                Intrinsics.checkNotNullExpressionValue(type7, "getType(...)");
                Object objD7 = oVarA7.d(json7, type7);
                Intrinsics.checkNotNullExpressionValue(objD7, "fromJson(...)");
                pcl.v vVar = (pcl.v) objD7;
                String json8 = sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9);
                Intrinsics.checkNotNullParameter(json8, "json");
                o oVarA8 = zbl.a.a();
                Type type8 = new TypeToken<r>() { // from class: com.revolut.shared.feature.wealth.domain.impl.data.database.typeconverters.InstrumentStatsTypeConverter$fromJsonToManagementEffectivenessEmbeddedEntity$$inlined$fromJson$1
                }.getType();
                Intrinsics.checkNotNullExpressionValue(type8, "getType(...)");
                Object objD8 = oVarA8.d(json8, type8);
                Intrinsics.checkNotNullExpressionValue(objD8, "fromJson(...)");
                r rVar = (r) objD8;
                String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10);
                if (text2 != null) {
                    o oVarA9 = zbl.a.a();
                    Type type9 = new TypeToken<q>() { // from class: com.revolut.shared.feature.wealth.domain.impl.data.database.typeconverters.InstrumentStatsTypeConverter$fromJsonToListingDataEmbeddedEntity$lambda$0$$inlined$fromJson$1
                    }.getType();
                    Intrinsics.checkNotNullExpressionValue(type9, "getType(...)");
                    Object objD9 = oVarA9.d(text2, type9);
                    Intrinsics.checkNotNullExpressionValue(objD9, "fromJson(...)");
                    yVar = (q) objD9;
                }
                yVar = new y(text, uVar, xVar, sVar, tVar, pVar, wVar, vVar, rVar, yVar);
            }
            sQLiteStatementPrepare.close();
            return yVar;
        } catch (Throwable th10) {
            sQLiteStatementPrepare.close();
            throw th10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:207:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0462 A[Catch: all -> 0x03f9, TRY_LEAVE, TryCatch #11 {all -> 0x03f9, blocks: (B:187:0x03f5, B:191:0x0400, B:193:0x0422, B:197:0x0430, B:202:0x043f, B:205:0x0456, B:210:0x0468, B:213:0x047f, B:218:0x0491, B:221:0x04a8, B:226:0x04ba, B:229:0x04d1, B:224:0x04b4, B:216:0x048b, B:208:0x0462, B:200:0x0439, B:196:0x042b, B:190:0x03fc), top: B:378:0x03f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x048b A[Catch: all -> 0x03f9, TRY_LEAVE, TryCatch #11 {all -> 0x03f9, blocks: (B:187:0x03f5, B:191:0x0400, B:193:0x0422, B:197:0x0430, B:202:0x043f, B:205:0x0456, B:210:0x0468, B:213:0x047f, B:218:0x0491, B:221:0x04a8, B:226:0x04ba, B:229:0x04d1, B:224:0x04b4, B:216:0x048b, B:208:0x0462, B:200:0x0439, B:196:0x042b, B:190:0x03fc), top: B:378:0x03f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04b4 A[Catch: all -> 0x03f9, TRY_LEAVE, TryCatch #11 {all -> 0x03f9, blocks: (B:187:0x03f5, B:191:0x0400, B:193:0x0422, B:197:0x0430, B:202:0x043f, B:205:0x0456, B:210:0x0468, B:213:0x047f, B:218:0x0491, B:221:0x04a8, B:226:0x04ba, B:229:0x04d1, B:224:0x04b4, B:216:0x048b, B:208:0x0462, B:200:0x0439, B:196:0x042b, B:190:0x03fc), top: B:378:0x03f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x05a9  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x05ac A[Catch: all -> 0x050d, TRY_LEAVE, TryCatch #5 {all -> 0x050d, blocks: (B:241:0x0509, B:245:0x0514, B:247:0x054c, B:251:0x055b, B:255:0x056a, B:259:0x0579, B:264:0x0588, B:267:0x059f, B:272:0x05b2, B:275:0x05c9, B:280:0x05dc, B:283:0x05f3, B:288:0x0606, B:291:0x061d, B:296:0x0630, B:299:0x0647, B:304:0x065a, B:307:0x0671, B:302:0x0654, B:294:0x062a, B:286:0x0600, B:278:0x05d6, B:270:0x05ac, B:262:0x0582, B:258:0x0573, B:254:0x0564, B:250:0x0555, B:244:0x0510), top: B:366:0x0506 }] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x05d6 A[Catch: all -> 0x050d, TRY_LEAVE, TryCatch #5 {all -> 0x050d, blocks: (B:241:0x0509, B:245:0x0514, B:247:0x054c, B:251:0x055b, B:255:0x056a, B:259:0x0579, B:264:0x0588, B:267:0x059f, B:272:0x05b2, B:275:0x05c9, B:280:0x05dc, B:283:0x05f3, B:288:0x0606, B:291:0x061d, B:296:0x0630, B:299:0x0647, B:304:0x065a, B:307:0x0671, B:302:0x0654, B:294:0x062a, B:286:0x0600, B:278:0x05d6, B:270:0x05ac, B:262:0x0582, B:258:0x0573, B:254:0x0564, B:250:0x0555, B:244:0x0510), top: B:366:0x0506 }] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x05f1  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x05fd  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0600 A[Catch: all -> 0x050d, TRY_LEAVE, TryCatch #5 {all -> 0x050d, blocks: (B:241:0x0509, B:245:0x0514, B:247:0x054c, B:251:0x055b, B:255:0x056a, B:259:0x0579, B:264:0x0588, B:267:0x059f, B:272:0x05b2, B:275:0x05c9, B:280:0x05dc, B:283:0x05f3, B:288:0x0606, B:291:0x061d, B:296:0x0630, B:299:0x0647, B:304:0x065a, B:307:0x0671, B:302:0x0654, B:294:0x062a, B:286:0x0600, B:278:0x05d6, B:270:0x05ac, B:262:0x0582, B:258:0x0573, B:254:0x0564, B:250:0x0555, B:244:0x0510), top: B:366:0x0506 }] */
    /* JADX WARN: Removed duplicated region for block: B:290:0x061b  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x062a A[Catch: all -> 0x050d, TRY_LEAVE, TryCatch #5 {all -> 0x050d, blocks: (B:241:0x0509, B:245:0x0514, B:247:0x054c, B:251:0x055b, B:255:0x056a, B:259:0x0579, B:264:0x0588, B:267:0x059f, B:272:0x05b2, B:275:0x05c9, B:280:0x05dc, B:283:0x05f3, B:288:0x0606, B:291:0x061d, B:296:0x0630, B:299:0x0647, B:304:0x065a, B:307:0x0671, B:302:0x0654, B:294:0x062a, B:286:0x0600, B:278:0x05d6, B:270:0x05ac, B:262:0x0582, B:258:0x0573, B:254:0x0564, B:250:0x0555, B:244:0x0510), top: B:366:0x0506 }] */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0645  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0654 A[Catch: all -> 0x050d, TRY_LEAVE, TryCatch #5 {all -> 0x050d, blocks: (B:241:0x0509, B:245:0x0514, B:247:0x054c, B:251:0x055b, B:255:0x056a, B:259:0x0579, B:264:0x0588, B:267:0x059f, B:272:0x05b2, B:275:0x05c9, B:280:0x05dc, B:283:0x05f3, B:288:0x0606, B:291:0x061d, B:296:0x0630, B:299:0x0647, B:304:0x065a, B:307:0x0671, B:302:0x0654, B:294:0x062a, B:286:0x0600, B:278:0x05d6, B:270:0x05ac, B:262:0x0582, B:258:0x0573, B:254:0x0564, B:250:0x0555, B:244:0x0510), top: B:366:0x0506 }] */
    /* JADX WARN: Removed duplicated region for block: B:306:0x066f  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x065a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:358:0x04ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:368:0x05dc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0468 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0606 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:376:0x05b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0491 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0630 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r34) {
        /*
            Method dump skipped, instruction units count: 1888
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dc4.g.invoke(java.lang.Object):java.lang.Object");
    }
}
