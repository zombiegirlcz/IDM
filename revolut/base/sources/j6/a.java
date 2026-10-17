package j6;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableSet;
import e4m.e;
import ihm.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kg.o;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import ue0.c;
import vc.s;
import wim.z;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static Set A(ArrayList arrayList) {
        return Collections.unmodifiableSet(new HashSet(arrayList));
    }

    public static Retrofit B(Retrofit.Builder builder, o oVar, String str) {
        builder.converterFactories().clear();
        builder.addConverterFactory(GsonConverterFactory.create(oVar));
        Retrofit retrofitBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(retrofitBuild, str);
        s.k(retrofitBuild);
        return retrofitBuild;
    }

    public static void C(StringBuilder sb6, String str, String str2) {
        sb6.append(str);
        sb6.toString();
    }

    public static void D(StringBuilder sb6, String str, String str2, String str3, String str4) {
        sb6.append(str);
        sb6.append(str2);
        sb6.append(str3);
        sb6.append(str4);
    }

    public static float a(float f, float f4, float f5, float f6) {
        return ((f - f4) * f5) + f6;
    }

    public static int b(int i, int i2, int i3) {
        return (Integer.hashCode(i) + i2) * i3;
    }

    public static int c(int i, int i2, boolean z) {
        return (Boolean.hashCode(z) + i) * i2;
    }

    public static int d(Parcel parcel, LinkedHashMap linkedHashMap, String str, int i, int i2) {
        linkedHashMap.put(str, parcel.readString());
        return i + i2;
    }

    public static int e(Class cls, Parcel parcel, ArrayList arrayList, int i, int i2) {
        arrayList.add(parcel.readParcelable(cls.getClassLoader()));
        return i + i2;
    }

    public static Parcelable f(Parcel parcel, String str, Class cls) {
        Intrinsics.checkNotNullParameter(parcel, str);
        return parcel.readParcelable(cls.getClassLoader());
    }

    public static ImmutableSet g(e eVar, ImmutableSet.Builder builder) {
        builder.add(eVar.get());
        return builder.build();
    }

    public static b h(String str) {
        b bVar = new b();
        Intrinsics.checkNotNullExpressionValue(bVar, str);
        return bVar;
    }

    public static Object i(Context context, Class cls) {
        return ue0.e.j(context).a().get(cls);
    }

    public static Object j(hf0.b bVar, Class cls) {
        return bVar.g().a().get(cls);
    }

    public static Object k(Class cls, c cVar, String str) {
        return cVar.T2(str, z.d(o0.b(cls)));
    }

    public static String l(int i, String str, String str2) {
        return str + i + str2;
    }

    public static String m(int i, String str, String str2, String str3) {
        return str + i + str2 + str3;
    }

    public static String n(int i, StringBuilder sb6) {
        sb6.append(Integer.toHexString(i));
        return sb6.toString();
    }

    public static String o(Class cls, StringBuilder sb6, String str) {
        sb6.append(cls.getName());
        sb6.append(str);
        return sb6.toString();
    }

    public static String p(String str) {
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, str);
        return string;
    }

    public static String q(String str, String str2) {
        return str + str2;
    }

    public static String r(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String s(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static String t(StringBuilder sb6, int i, char c2) {
        sb6.append(i);
        sb6.append(c2);
        return sb6.toString();
    }

    public static String u(StringBuilder sb6, String str, char c2) {
        sb6.append(str);
        sb6.append(c2);
        return sb6.toString();
    }

    public static String v(StringBuilder sb6, String str, int i) {
        sb6.append(i);
        sb6.append(str);
        return sb6.toString();
    }

    public static String w(StringBuilder sb6, String str, String str2, String str3, String str4) {
        sb6.append(str);
        sb6.append(str2);
        sb6.append(str3);
        sb6.append(str4);
        return sb6.toString();
    }

    public static String x(StringBuilder sb6, boolean z, char c2) {
        sb6.append(z);
        sb6.append(c2);
        return sb6.toString();
    }

    public static Iterator y(ArrayList arrayList, Parcel parcel) {
        parcel.writeInt(arrayList.size());
        return arrayList.iterator();
    }

    public static Iterator z(Map map, Parcel parcel) {
        parcel.writeInt(map.size());
        return map.entrySet().iterator();
    }
}
