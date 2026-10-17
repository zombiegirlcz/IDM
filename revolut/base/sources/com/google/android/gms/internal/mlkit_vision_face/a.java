package com.google.android.gms.internal.mlkit_vision_face;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import androidx.media3.common.util.Log;
import androidx.room.util.StringUtil;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.retail.core.navigation.FinishCommand;
import grl.k9;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import mm.f;
import retrofit2.Retrofit;
import sri.m;
import ue0.c;
import wim.z;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static void A(int i, HashMap map, String str, int i2, String str2) {
        map.put(str, Integer.valueOf(i));
        map.put(str2, Integer.valueOf(i2));
    }

    public static void B(Class cls, c cVar, String str, Long l2) {
        cVar.G(l2, str, z.d(o0.b(cls)));
    }

    public static void C(Integer num, Map map, FinishCommand.Mode mode, int i, m mVar) {
        mVar.c(new FinishCommand(num, map, mode, i));
    }

    public static void D(String str, String str2, String str3) {
        Log.w(str3, str + str2);
    }

    public static int a(View view, String str, float f) {
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, str);
        return kli.a.k(context, f);
    }

    public static int b(ArrayList arrayList, int i, int i2) {
        return (arrayList.hashCode() + i) * i2;
    }

    public static Paint c(boolean z) {
        Paint paint = new Paint();
        paint.setAntiAlias(z);
        return paint;
    }

    public static zzcu d(int i) {
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(i);
        return zzcqVar.zzb();
    }

    public static ImmutableMap e(Class cls) {
        return ImmutableMap.of(cls, new f());
    }

    public static ImmutableSet f() {
        return ImmutableSet.of(new in.c());
    }

    public static AnalyticsProduct.Retail g(AnalyticsProduct.Companion aVar, k9 k9Var, k9 k9Var2) {
        aVar.getClass();
        AnalyticsProduct.Companion.a(k9Var);
        return new AnalyticsProduct.Retail(k9Var2);
    }

    public static AnalyticsProduct.Retail h(k9 k9Var, String str, k9 k9Var2) {
        Intrinsics.checkNotNullParameter(k9Var, str);
        return new AnalyticsProduct.Retail(k9Var2);
    }

    public static Object i(Retrofit retrofit, String str, Class cls, String str2) {
        Intrinsics.checkNotNullParameter(retrofit, str);
        Object objCreate = retrofit.create(cls);
        Intrinsics.checkNotNullExpressionValue(objCreate, str2);
        return objCreate;
    }

    public static String j(char c2, String str) {
        return str + c2;
    }

    public static String k(int i, String str, String str2) {
        return str + str2 + i;
    }

    public static String l(Object obj2, String str) {
        return (str + obj2).toString();
    }

    public static String m(String str, int i, int i2, String str2, String str3) {
        return str + i + str2 + i2 + str3;
    }

    public static String n(String str, Exception exc2) {
        return str + exc2;
    }

    public static String o(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String p(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static String q(String str, StringBuilder sb6) {
        return str + ((Object) sb6);
    }

    public static String r(String str, boolean z) {
        return str + z;
    }

    public static String s(StringBuilder sb6, String str, int i) {
        sb6.append(str);
        sb6.append(i);
        return sb6.toString();
    }

    public static String t(StringBuilder sb6, boolean z, String str) {
        sb6.append(z);
        sb6.append(str);
        return sb6.toString();
    }

    public static String u(ArrayList arrayList, StringBuilder sb6, String str) {
        StringUtil.appendPlaceholders(sb6, arrayList.size());
        sb6.append(str);
        return sb6.toString();
    }

    public static StringBuilder v(long j2, String str, String str2) {
        StringBuilder sb6 = new StringBuilder(str);
        sb6.append(j2);
        sb6.append(str2);
        return sb6;
    }

    public static StringBuilder w(String str, int i, int i2, String str2, String str3) {
        StringBuilder sb6 = new StringBuilder(str);
        sb6.append(i);
        sb6.append(str2);
        sb6.append(i2);
        sb6.append(str3);
        return sb6;
    }

    public static StringBuilder x(String str, String str2, String str3) {
        StringBuilder sb6 = new StringBuilder(str);
        sb6.append(str2);
        sb6.append(str3);
        return sb6;
    }

    public static ArrayList y(String str, List list) {
        Intrinsics.checkNotNullParameter(list, str);
        return new ArrayList();
    }

    public static void z(int i, String str, String str2) {
        Log.w(str2, str + i);
    }
}
