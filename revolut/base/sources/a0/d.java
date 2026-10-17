package a0;

import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.l;
import com.bumptech.glide.n;
import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzfg;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import retrofit2.Retrofit;
import zhm.q0;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class d {
    public static void A(Class cls, StringBuilder sb6, String str) {
        sb6.append(cls.getName());
        sb6.append(str);
    }

    public static /* synthetic */ void B(Object obj2) {
        if (obj2 != null) {
            throw new ClassCastException();
        }
    }

    public static void C(StringBuilder sb6, String str, String str2, String str3) {
        sb6.append(str);
        sb6.append(str2);
        sb6.append(str3);
    }

    public static int D(int i, int i2, int i3, int i5) {
        return ((i * i2) / i3) + i5;
    }

    public static float a(float f, float f4, float f5, float f6) {
        return ((f * f4) + f5) * f6;
    }

    public static int b(int i, int i2, int i3, int i5) {
        return ((i / i2) * i3) + i5;
    }

    public static int c(int i, int i2, long j2) {
        return (Long.hashCode(j2) + i) * i2;
    }

    public static zzfg d(int i) {
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(i);
        return zzfcVar.zzb();
    }

    public static Object e(int i, List list) {
        return list.get(list.size() - i);
    }

    public static Object f(nj0.d dVar, String str, Class cls, String str2) {
        Retrofit retrofitF = dVar.f();
        Intrinsics.checkNotNullParameter(retrofitF, str);
        Object objCreate = retrofitF.create(cls);
        Intrinsics.checkNotNullExpressionValue(objCreate, str2);
        return objCreate;
    }

    public static String g(int i, int i2, String str, String str2) {
        return str + i + str2 + i2;
    }

    public static String h(int i, String str) {
        return i + str;
    }

    public static String i(int i, String str, int i2) {
        return i + str + i2;
    }

    public static String j(long j2, String str, StringBuilder sb6) {
        sb6.append(j2);
        sb6.append(str);
        return sb6.toString();
    }

    public static String k(RecyclerView recyclerView, StringBuilder sb6) {
        sb6.append(recyclerView.exceptionLabel());
        return sb6.toString();
    }

    public static String l(Class cls, String str) {
        return str + cls;
    }

    public static String m(Object obj2, String str) {
        return str + obj2;
    }

    public static String n(String str, int i) {
        return str + i;
    }

    public static String o(String str, int i, int i2) {
        return str.substring(i2, str.length() - i);
    }

    public static String p(String str, Fragment fragment, String str2) {
        return str + fragment + str2;
    }

    public static String q(String str, Class cls, String str2) {
        return str + cls + str2;
    }

    public static String r(String str, String str2) {
        return str + str2;
    }

    public static String s(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String t(StringBuilder sb6, long j2, char c2) {
        sb6.append(j2);
        sb6.append(c2);
        return sb6.toString();
    }

    public static String u(StringBuilder sb6, String str, String str2, String str3) {
        sb6.append(str);
        sb6.append(str2);
        sb6.append(str3);
        return sb6.toString();
    }

    public static String v(Object[] objArr, int i, String str, String str2) {
        String str3 = String.format(str, Arrays.copyOf(objArr, i));
        Intrinsics.checkNotNullExpressionValue(str3, str2);
        return str3;
    }

    public static StringBuilder w(int i, String str, String str2) {
        StringBuilder sb6 = new StringBuilder(str);
        sb6.append(i);
        sb6.append(str2);
        return sb6;
    }

    public static Map x(String str, String str2) {
        return q0.c(new Pair(str, str2));
    }

    public static FqName y(String str, String str2, FqName fqName) {
        Name nameIdentifier = Name.identifier(str);
        Intrinsics.checkNotNullExpressionValue(nameIdentifier, str2);
        return fqName.child(nameIdentifier);
    }

    public static void z(ImageView imageView, n nVar) {
        nVar.m(new l(imageView));
    }
}
