package v0;

import android.os.Parcel;
import c21.b;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.tracking.v3.IdContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p0;
import kotlin.jvm.internal.z;
import retrofit2.Retrofit;
import vc.s;
import wim.h;
import xe0.f;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static int a(int i, int i2, int i3, int i5) {
        return ((i - i2) * i3) + i5;
    }

    public static w0 b(String str, AnalyticsContext.Companion bVar) {
        IdContext.a aVarNewBuilder = IdContext.newBuilder();
        aVarNewBuilder.h(str);
        w0 w0VarA = aVarNewBuilder.a();
        bVar.getClass();
        return AnalyticsContext.Companion.a(w0VarA);
    }

    public static exa.a c(f fVar, String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(fVar, str);
        return new exa.a(i, i2, 5);
    }

    public static ihm.f d(String str) {
        ihm.f fVar = new ihm.f();
        Intrinsics.checkNotNullExpressionValue(fVar, str);
        return fVar;
    }

    public static ClassCastException e(Iterator it8) {
        it8.next().getClass();
        return new ClassCastException();
    }

    public static Object f(b bVar, String str, Class cls, String str2) {
        Retrofit retrofitI = bVar.i();
        s.j(retrofitI);
        Intrinsics.checkNotNullParameter(retrofitI, str);
        Object objCreate = retrofitI.create(cls);
        Intrinsics.checkNotNullExpressionValue(objCreate, str2);
        return objCreate;
    }

    public static String g(Object obj2, String str) {
        return str.concat(obj2.getClass().getName());
    }

    public static String h(Object obj2, String str, String str2) {
        return str + obj2 + str2;
    }

    public static String i(StringBuilder sb6, String str, String str2) {
        sb6.append(str);
        sb6.append(str2);
        return sb6.toString();
    }

    public static String j(Locale locale, String str, String str2, Locale locale2, String str3) {
        Intrinsics.checkNotNullExpressionValue(locale, str);
        String upperCase = str2.toUpperCase(locale2);
        Intrinsics.checkNotNullExpressionValue(upperCase, str3);
        return upperCase;
    }

    public static StringBuilder k(int i, String str, String str2, String str3, String str4) {
        StringBuilder sb6 = new StringBuilder(str);
        sb6.append(str2);
        sb6.append(str3);
        sb6.append(i);
        sb6.append(str4);
        return sb6;
    }

    public static StringBuilder l(String str, String str2) {
        StringBuilder sb6 = new StringBuilder();
        sb6.append(str);
        sb6.append(str2);
        return sb6;
    }

    public static StringBuilder m(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb6 = new StringBuilder(str);
        sb6.append(str2);
        sb6.append(str3);
        sb6.append(str4);
        sb6.append(str5);
        return sb6;
    }

    public static ArrayList n(int i, HashMap map, ArrayList arrayList, int i2, String str) {
        map.put(Integer.valueOf(i), arrayList);
        ArrayList arrayList2 = new ArrayList(i2);
        arrayList2.add(str);
        return arrayList2;
    }

    public static ArrayList o(LinkedHashMap linkedHashMap, String str) {
        ArrayList arrayList = new ArrayList();
        linkedHashMap.put(str, arrayList);
        return arrayList;
    }

    public static HashMap p(Class cls, ye.a aVar) {
        HashMap map = new HashMap();
        map.put(cls, aVar);
        return map;
    }

    public static Iterator q(Parcel parcel, int i, List list) {
        parcel.writeInt(i);
        parcel.writeInt(list.size());
        return list.iterator();
    }

    public static Map r(HashMap map) {
        return Collections.unmodifiableMap(new HashMap(map));
    }

    public static h s(Class cls, String str, String str2, int i, p0 p0Var) {
        return p0Var.f(new z(cls, str, str2, i));
    }

    public static void t(char c2, char c3, String str, String str2, StringBuilder sb6) {
        sb6.append(str);
        sb6.append(c2);
        sb6.append(str2);
        sb6.append(c3);
    }
}
