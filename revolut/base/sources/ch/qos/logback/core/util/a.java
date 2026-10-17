package ch.qos.logback.core.util;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Parcel;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelStore;
import com.android.billingclient.api.BillingResult;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.measurement.zzbl;
import com.google.android.gms.internal.measurement.zzh;
import com.google.android.gms.internal.measurement.zzlk;
import com.google.android.gms.internal.mlkit_common.zzay;
import com.google.android.gms.internal.mlkit_common.zzbc;
import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzai;
import com.google.android.gms.internal.mlkit_vision_text_common.zzct;
import com.google.android.gms.internal.mlkit_vision_text_common.zzcx;
import com.google.android.gms.internal.play_billing.zzfc;
import com.google.android.gms.measurement.internal.zzio;
import com.google.crypto.tink.shaded.protobuf.n;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlin.text.Regex;
import ve.b;

/* JADX INFO: loaded from: classes16.dex */
public abstract /* synthetic */ class a {
    public static int A(int i, int i2, int i3, int i5) {
        return n.U(i) + i2 + i3 + i5;
    }

    public static b B(int i, u0a.a aVar) {
        zzct zzctVar = new zzct();
        zzctVar.zza(i);
        aVar.f(zzctVar.zzb());
        return aVar.c();
    }

    public static void C(zzio zzioVar, String str) {
        zzioVar.zzaW().zzk().zza(str);
    }

    public static int D(int i, int i2, int i3) {
        return n.T(i) + i2 + i3;
    }

    public static int a(int i, int i2, int i3) {
        return zzlk.zzz(i) + i2 + i3;
    }

    public static int b(int i, int i2, int i3, int i5) {
        return zzfc.zzy(i) + i2 + i3 + i5;
    }

    public static int c(Parcel parcel, ArrayList arrayList, int i, int i2) {
        arrayList.add(parcel.readSerializable());
        return i + i2;
    }

    public static long d(long j2, long j3, long j5, long j16) {
        return (j2 * j3) + j5 + j16;
    }

    public static Canvas e(Bitmap bitmap, String str, Bitmap bitmap2) {
        Intrinsics.checkNotNullExpressionValue(bitmap, str);
        return new Canvas(bitmap2);
    }

    public static ViewModelStore f(Lazy lazy, String str) {
        ViewModelStore viewModelStore = FragmentViewModelLazyKt.m3478viewModels$lambda1(lazy).getViewModelStore();
        Intrinsics.checkNotNullExpressionValue(viewModelStore, str);
        return viewModelStore;
    }

    public static BillingResult g(int i, String str) {
        BillingResult.Builder builderNewBuilder = BillingResult.newBuilder();
        builderNewBuilder.setResponseCode(i);
        builderNewBuilder.setDebugMessage(str);
        return builderNewBuilder.build();
    }

    public static IObjectWrapper h(Parcel parcel) {
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
        parcel.recycle();
        return iObjectWrapperAsInterface;
    }

    public static zzbc i(int i) {
        zzay zzayVar = new zzay();
        zzayVar.zza(i);
        return zzayVar.zzb();
    }

    public static zzbc j(zzbc zzbcVar, HashMap map, zzbc zzbcVar2, HashMap map2, int i) {
        map.put(zzbcVar.annotationType(), zzbcVar2);
        Collections.unmodifiableMap(new HashMap(map2));
        zzay zzayVar = new zzay();
        zzayVar.zza(i);
        return zzayVar.zzb();
    }

    public static zzai k(int i) {
        zzae zzaeVar = new zzae();
        zzaeVar.zza(i);
        return zzaeVar.zzb();
    }

    public static zzcx l(int i) {
        zzct zzctVar = new zzct();
        zzctVar.zza(i);
        return zzctVar.zzb();
    }

    public static zzcx m(zzcx zzcxVar, HashMap map, zzcx zzcxVar2, HashMap map2, int i) {
        map.put(zzcxVar.annotationType(), zzcxVar2);
        Collections.unmodifiableMap(new HashMap(map2));
        zzct zzctVar = new zzct();
        zzctVar.zza(i);
        return zzctVar.zzb();
    }

    public static PublishSubject n(String str) {
        PublishSubject publishSubject = new PublishSubject();
        Intrinsics.checkNotNullExpressionValue(publishSubject, str);
        return publishSubject;
    }

    public static Object o(zzbl zzblVar, int i, List list, int i2) {
        zzh.zzh(zzblVar.name(), i, list);
        return list.get(i2);
    }

    public static String p(long j2, String str) {
        return j2 + str;
    }

    public static String q(IllegalArgumentException illegalArgumentException, StringBuilder sb6) {
        sb6.append(illegalArgumentException.getMessage());
        return sb6.toString();
    }

    public static String r(String str, IOException iOException) {
        return str + iOException;
    }

    public static KTypeProjection s(Class cls, KTypeProjection.Companion aVar) {
        KType kTypeB = o0.b(cls);
        aVar.getClass();
        return KTypeProjection.Companion.a(kTypeB);
    }

    public static b t(int i, u0a.a aVar) {
        zzay zzayVar = new zzay();
        zzayVar.zza(i);
        aVar.f(zzayVar.zzb());
        return aVar.c();
    }

    public static void u(zzbc zzbcVar, HashMap map, zzbc zzbcVar2, HashMap map2) {
        map.put(zzbcVar.annotationType(), zzbcVar2);
        Collections.unmodifiableMap(new HashMap(map2));
    }

    public static void v(zzcx zzcxVar, HashMap map, zzcx zzcxVar2, HashMap map2) {
        map.put(zzcxVar.annotationType(), zzcxVar2);
        Collections.unmodifiableMap(new HashMap(map2));
    }

    public static void w(zzio zzioVar, String str) {
        zzioVar.zzaW().zze().zza(str);
    }

    public static boolean x(String str, String str2) {
        return new Regex(str).f(str2);
    }

    public static /* synthetic */ boolean y(AtomicReference atomicReference, Object obj2) {
        while (!atomicReference.compareAndSet(null, obj2)) {
            if (atomicReference.get() != null) {
                return false;
            }
        }
        return true;
    }

    public static int z(int i, int i2, int i3) {
        return zzfc.zzy(i) + i2 + i3;
    }
}
