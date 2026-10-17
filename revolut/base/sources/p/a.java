package p;

import android.os.Parcel;
import com.revolut.core.ui_kit.models.Clause;
import ek.b;
import ihm.f;
import ihm.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlinx.serialization.json.Json;
import retrofit2.Retrofit;
import ulm.a1;
import v60.i;
import wim.p;
import wim.z;
import yhm.o;
import zfm.c;
import zfm.h;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static void A(Parcel parcel, int i, Boolean bool) {
        parcel.writeInt(i);
        parcel.writeInt(bool.booleanValue() ? 1 : 0);
    }

    public static void B(Parcel parcel, int i, Integer num) {
        parcel.writeInt(i);
        parcel.writeInt(num.intValue());
    }

    public static void C(c cVar, c cVar2, dom.a aVar) {
        cVar.getClass();
        aVar.onError(h.b(cVar2));
    }

    public static j D(String str) {
        j jVarD = new i().d();
        Intrinsics.checkNotNullExpressionValue(jVarD, str);
        return jVarD;
    }

    public static int a(int i, int i2, Clause clause) {
        return (clause.hashCode() + i) * i2;
    }

    public static int b(int i, int i2, Object obj2) {
        return (obj2.hashCode() + i) * i2;
    }

    public static int c(int i, int i2, String str) {
        return (str.hashCode() + i) * i2;
    }

    public static int d(int i, int i2, List list) {
        return (list.hashCode() + i) * i2;
    }

    public static int e(int i, int i2, Map map) {
        return (map.hashCode() + i) * i2;
    }

    public static int f(int i, int i2, Set set) {
        return (set.hashCode() + i) * i2;
    }

    public static ek.a g(a1 a1Var, String str, Json json) {
        a1Var.getClass();
        return b.a(json, a1.a(str));
    }

    public static j h(String str) {
        j jVarD = new f().d();
        Intrinsics.checkNotNullExpressionValue(jVarD, str);
        return jVarD;
    }

    public static Object i(int i, ArrayList arrayList) {
        return arrayList.get(arrayList.size() - i);
    }

    public static Object j(Class cls, KTypeProjection.Companion aVar, Class cls2, ue0.c cVar, String str) {
        KType kTypeB = o0.b(cls);
        aVar.getClass();
        return cVar.T2(str, z.d(o0.c(cls2, KTypeProjection.Companion.a(kTypeB))));
    }

    public static String k(char c2, String str, int i) {
        return str + i + c2;
    }

    public static String l(char c2, String str, String str2) {
        return str + str2 + c2;
    }

    public static String m(long j2, String str) {
        return str + j2;
    }

    public static String n(long j2, String str, String str2) {
        return str + j2 + str2;
    }

    public static String o(String str, int i) {
        return str + i;
    }

    public static String p(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String q(StringBuilder sb6, String str, char c2, String str2) {
        sb6.append(str);
        sb6.append(c2);
        sb6.append(str2);
        return sb6.toString();
    }

    public static String r(Locale locale, String str, String str2, Locale locale2, String str3) {
        Intrinsics.checkNotNullExpressionValue(locale, str);
        String lowerCase = str2.toLowerCase(locale2);
        Intrinsics.checkNotNullExpressionValue(lowerCase, str3);
        return lowerCase;
    }

    public static StringBuilder s(String str) {
        StringBuilder sb6 = new StringBuilder();
        sb6.append(str);
        return sb6;
    }

    public static StringBuilder t(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb6 = new StringBuilder();
        sb6.append(str);
        sb6.append(str2);
        sb6.append(str3);
        sb6.append(str4);
        sb6.append(str5);
        return sb6;
    }

    public static ArrayList u(Object obj2) {
        o.b(obj2);
        return new ArrayList();
    }

    public static Iterator v(List list, Parcel parcel) {
        parcel.writeInt(list.size());
        return list.iterator();
    }

    public static Ref$ObjectRef w(Object obj2) {
        o.b(obj2);
        return new Ref$ObjectRef();
    }

    public static Retrofit.Builder x(Retrofit retrofit, String str, kg.o oVar, String str2) {
        Intrinsics.checkNotNullParameter(retrofit, str);
        Intrinsics.checkNotNullParameter(oVar, str2);
        return retrofit.newBuilder();
    }

    public static p y(Class cls, String str, String str2, int i, p0 p0Var) {
        return p0Var.j(new h0(cls, str, str2, i));
    }

    public static void z(int i, String str, String str2) {
        String str3 = str + i;
    }
}
