package a10;

import aii.q;
import akf.t1;
import akf.u1;
import android.net.Uri;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.glance.appwidget.protobuf.CodedOutputStream;
import androidx.glance.unit.ColorProvider;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteStatement;
import b9.d3;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import org.xml.sax.Attributes;
import vc.s;

/* JADX INFO: loaded from: classes16.dex */
public abstract /* synthetic */ class b {
    public static /* synthetic */ void A(List list) {
        if (list != null) {
            throw new ClassCastException();
        }
    }

    public static boolean B(u1 u1Var, t1 t1Var, String str) {
        u1Var.getClass();
        return Intrinsics.f(str, u1.a(t1Var));
    }

    public static int C(int i, int i2, int i3, int i5) {
        return i + i2 + i3 + i5;
    }

    public static int D(int i, int i2, int i3, int i5) {
        return CodedOutputStream.computeUInt32SizeNoTag(i) + i2 + i3 + i5;
    }

    public static int a(int i, int i2, int i3, int i5) {
        return ((i - i2) / i3) + i5;
    }

    public static int b(ColorProvider colorProvider, int i, int i2) {
        return (colorProvider.hashCode() + i) * i2;
    }

    public static int c(Image image, int i, int i2) {
        return (image.hashCode() + i) * i2;
    }

    public static int d(nel.n nVar, int i, int i2) {
        return (nVar.hashCode() + i) * i2;
    }

    public static int e(Attributes attributes, int i) {
        return d3.a(attributes.getLocalName(i)).ordinal();
    }

    public static aah.h f(u8h.b bVar, String str) {
        aah.i iVarD = bVar.d();
        s.j(iVarD);
        Intrinsics.checkNotNullParameter(iVarD, str);
        return iVarD.a();
    }

    public static aah.m g(u8h.b bVar, String str) {
        aah.i iVarD = bVar.d();
        s.j(iVarD);
        Intrinsics.checkNotNullParameter(iVarD, str);
        return iVarD.b();
    }

    public static e4m.e h(afj.b bVar, int i) {
        return e4m.b.b(new a1j.a(bVar, i, 5));
    }

    public static e4m.e i(b05.e eVar, int i) {
        return e4m.b.b(new aq1.e(eVar, i, 4));
    }

    public static e4m.e j(b05.e eVar, b05.d dVar, int i) {
        return e4m.b.b(new ak5.f(eVar, dVar, i, 23));
    }

    public static e4m.e k(c21.b bVar, int i) {
        return e4m.b.b(new c21.a(bVar, i));
    }

    public static e4m.e l(cce.b bVar, cce.a aVar, int i) {
        return e4m.b.b(new bt7.e(bVar, aVar, i, 20));
    }

    public static ClassCastException m(Object obj2) {
        obj2.getClass();
        return new ClassCastException();
    }

    public static Object n(MatchResult matchResult, String str, int i) {
        Intrinsics.checkNotNullParameter(matchResult, str);
        return matchResult.c().get(i);
    }

    public static String o(int i, List list, Style style, int i2, f01.c cVar) {
        return cVar.b(new TextLocalisedClause(i, list, style, i2)).toString();
    }

    public static String p(Uri uri2, String str) {
        return str + uri2;
    }

    public static String q(Class cls, StringBuilder sb6) {
        sb6.append(cls.getCanonicalName());
        return sb6.toString();
    }

    public static String r(Exception exc2, StringBuilder sb6) {
        sb6.append(exc2.getMessage());
        return sb6.toString();
    }

    public static String s(String str, String str2, String str3) {
        return (str + str2 + str3).toString();
    }

    public static String t(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, str2);
        return str3 + str4;
    }

    public static String u(StringBuilder sb6, Throwable th10) {
        sb6.append(th10.getMessage());
        return sb6.toString();
    }

    public static String v(jo3.b bVar, SQLiteStatement sQLiteStatement, int i) {
        sQLiteStatement.bindLong(i, bVar.getAmount());
        return bVar.getCurrency();
    }

    public static KotlinNothingValueException w(int i, String str) {
        SQLite.throwSQLiteException(i, str);
        return new KotlinNothingValueException();
    }

    public static Function2 x(ComposeUiNode.Companion companion, Composer composer, Integer num, Composer composer2) {
        Updater.m1663initimpl(composer, num, companion.getSetCompositeKeyHash());
        Updater.m1664reconcileimpl(composer2, companion.getApplyOnDeactivatedNodeAssertion());
        return companion.getSetModifier();
    }

    public static void y(q qVar, String str, qii.b bVar, String str2) {
        Intrinsics.checkNotNullParameter(qVar, str);
        Intrinsics.checkNotNullParameter(bVar, str2);
        bVar.J2();
    }

    public static void z(StringBuilder sb6, String str, String str2, String str3) {
        sb6.append(str + str2 + str3);
    }
}
