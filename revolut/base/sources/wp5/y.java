package wp5;

import androidx.sqlite.db.SupportSQLiteDatabase;
import ch.qos.logback.classic.db.names.ColumnName;
import ch.qos.logback.classic.db.names.DBNameResolver;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPorting;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import java.time.LocalDate;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;
import xf6.t1;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class y {
    public static void A(DBNameResolver dBNameResolver, ColumnName columnName, StringBuilder sb6, String str) {
        sb6.append(dBNameResolver.getColumnName(columnName));
        sb6.append(str);
    }

    public static void B(String str) throws Throwable {
        hx7.e.n(new IllegalArgumentException(str));
    }

    public static void C(Function1 function1, pfm.a aVar, t1i.n nVar, String str, ifm.b bVar) {
        ofm.h hVarW = aVar.w(new ly7.g(25, function1), nVar);
        Intrinsics.checkNotNullExpressionValue(hVarW, str);
        te0.w.j0(bVar, hVarW);
    }

    public static boolean D(jf0.c cVar, String str, int i, String str2) {
        Intrinsics.checkNotNullParameter(cVar, str);
        return Intrinsics.f(cVar.e(i), str2);
    }

    public static int a(int i, int i2, LocalDate localDate) {
        return (localDate.hashCode() + i) * i2;
    }

    public static int b(bfl.g gVar, int i, int i2) {
        return (gVar.hashCode() + i) * i2;
    }

    public static int c(EsimPhoneNumberPorting esimPhoneNumberPorting, int i, int i2) {
        return (esimPhoneNumberPorting.hashCode() + i) * i2;
    }

    public static int d(Amount amount, int i, int i2) {
        return (amount.hashCode() + i) * i2;
    }

    public static int e(jo3.b bVar, int i, int i2) {
        return (bVar.hashCode() + i) * i2;
    }

    public static int f(a3 a3Var, int i, int i2) {
        return (a3Var.hashCode() + i) * i2;
    }

    public static int g(wd6.e eVar, int i, int i2) {
        return (eVar.hashCode() + i) * i2;
    }

    public static LayeredImage h(Color.Solid solid, float f, LayeredImage.Companion aVar, int i, Color.Solid solid2) {
        return aVar.j(i, solid2, new Color.ModifiedColor(solid, f));
    }

    public static e4m.e i(x13.p pVar, x13.a0 a0Var, int i) {
        return e4m.b.b(new whc.t(pVar, a0Var, i, 23));
    }

    public static e4m.e j(xg4.d dVar, int i) {
        return e4m.b.b(new xf6.a1(dVar, i, 8));
    }

    public static e4m.e k(xg4.d dVar, xg4.c cVar, int i) {
        return e4m.b.b(new t1(dVar, cVar, i, 17));
    }

    public static e4m.e l(xsl.p pVar, xsl.f fVar, xsl.g gVar, int i) {
        return e4m.b.b(new wpg.g(pVar, fVar, gVar, i, 16));
    }

    public static e4m.e m(xz4.d dVar, int i) {
        return e4m.b.b(new xf6.a1(dVar, i, 12));
    }

    public static e4m.e n(xz4.d dVar, xz4.b bVar, int i) {
        return e4m.b.b(new xsl.q(dVar, bVar, i, 3));
    }

    public static e4m.e o(ytf.e eVar, ytf.b bVar, ytf.d dVar, int i) {
        return e4m.b.b(new wpg.g(eVar, bVar, dVar, i, 21));
    }

    public static e4m.e p(yyk.c cVar, int i) {
        return e4m.b.b(new yxj.c(cVar, i, 1));
    }

    public static e4m.e q(yyk.c cVar, yyk.b bVar, int i) {
        return e4m.b.b(new yre.a(cVar, bVar, i, 5));
    }

    public static j60.c r(com.revolut.kompot.navigable.a controller, rp0.m dialogDisplayer) {
        he2.b dialogHostFinder = kxa.j.o(new nji.b());
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(dialogDisplayer, "dialogDisplayer");
        Intrinsics.checkNotNullParameter(dialogHostFinder, "dialogHostFinder");
        return new j60.c(controller, dialogDisplayer, dialogHostFinder);
    }

    public static Boolean s(yoj.a aVar, String str, yoj.a aVar2) {
        Intrinsics.checkNotNullParameter(aVar, str);
        return Boolean.valueOf(yoj.b.k(aVar2));
    }

    public static Object t(Class cls, xe0.e eVar, String str) {
        return eVar.T2(str, wim.z.d(kotlin.jvm.internal.o0.b(cls)));
    }

    public static String u(i90.b bVar, String str) {
        String string = bVar.a().toString();
        Intrinsics.checkNotNullExpressionValue(string, str);
        return string;
    }

    public static StringBuilder v(StringBuilder sb6, String str, String str2, SupportSQLiteDatabase supportSQLiteDatabase, String str3) {
        sb6.append(str);
        sb6.append(str2);
        supportSQLiteDatabase.execSQL(sb6.toString());
        return new StringBuilder(str3);
    }

    public static List w() {
        return zhm.u.c(new CellDetailsDelegate());
    }

    public static vkm.d x(ihm.f fVar, ihm.f fVar2, String str) {
        efm.r rVarMergeWith = fVar.mergeWith(fVar2);
        Intrinsics.checkNotNullExpressionValue(rVarMergeWith, str);
        return rd0.e.b(rVarMergeWith);
    }

    public static void y(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        supportSQLiteDatabase.execSQL(str);
        supportSQLiteDatabase.setTransactionSuccessful();
        supportSQLiteDatabase.endTransaction();
    }

    public static void z(SupportSQLiteDatabase supportSQLiteDatabase, String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(supportSQLiteDatabase, str);
        supportSQLiteDatabase.beginTransaction();
        supportSQLiteDatabase.execSQL(str2);
        supportSQLiteDatabase.execSQL(str3);
        supportSQLiteDatabase.execSQL(str4);
    }
}
