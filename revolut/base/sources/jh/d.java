package jh;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.util.TypedValue;
import androidx.core.text.TextUtilsCompat;
import com.google.android.gms.tasks.Task;
import com.revolut.core.android.R$string;
import com.revolut.core.ui_kit_resources.R$attr;
import fim.h;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.text.d0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import lim.q;
import qlm.g1;
import qlm.h0;
import qlm.h1;
import qlm.i0;
import qlm.o1;
import qlm.p1;
import qlm.w0;
import skm.l;
import skm.p0;
import ukm.j0;
import ukm.y;
import ukm.z;
import yhm.r;
import zhm.w;
import zkm.o;
import zkm.u;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Boolean f174105a;

    public static final zkm.d a(CoroutineContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        p0 p0Var = p0.f264001a;
        return ue0.e.a(o.f323119a.e.plus(context));
    }

    public static final Object b(Task task, gim.c frame) {
        if (!task.isComplete()) {
            l lVar = new l(1, h.b(frame));
            lVar.u();
            task.addOnCompleteListener(ilm.a.f162269a, new clm.b(lVar));
            Object objT = lVar.t();
            if (objT == fim.a.COROUTINE_SUSPENDED) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
            return objT;
        }
        Exception exception = task.getException();
        if (exception != null) {
            throw exception;
        }
        if (!task.isCanceled()) {
            return task.getResult();
        }
        throw new CancellationException("Task " + task + " was cancelled normally.");
    }

    public static final void c(BufferedReader bufferedReader, Function1 action) {
        Intrinsics.checkNotNullParameter(bufferedReader, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        try {
            Iterator it8 = m(bufferedReader).iterator();
            while (it8.hasNext()) {
                action.invoke(it8.next());
            }
            Unit unit = Unit.f186387a;
            bufferedReader.close();
        } finally {
        }
    }

    public static final Locale d(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Locale locale = context.getResources().getConfiguration().getLocales().get(0);
        Intrinsics.checkNotNullExpressionValue(locale, "get(...)");
        return locale;
    }

    public static final Locale e(Context context) {
        String country;
        Intrinsics.checkNotNullParameter(context, "<this>");
        String string = context.getString(R$string.current_language);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        List listN0 = d0.n0(string, new String[]{"-"}, 0, 6);
        String str = (String) zhm.d0.e0(0, listN0);
        if (str == null) {
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
            return locale;
        }
        String country2 = d(context).getCountry();
        Intrinsics.checkNotNullExpressionValue(country2, "getCountry(...)");
        if (country2.length() > 0) {
            country = d(context).getCountry();
        } else {
            country = (String) zhm.d0.e0(1, listN0);
            if (country == null) {
                throw new IllegalStateException("Default country must be defined for the locale: " + listN0);
            }
        }
        Locale locale2 = new Locale(str, country);
        return j(locale2) ? l(locale2) : locale2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final wy0.a f(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Context context2 = context;
        while (context2 instanceof ContextWrapper) {
            if (context2 instanceof wy0.a) {
                return (wy0.a) context2;
            }
            Context baseContext = ((ContextWrapper) context2).getBaseContext();
            Intrinsics.checkNotNullExpressionValue(baseContext, "getBaseContext(...)");
            context2 = baseContext;
        }
        Object applicationContext = context2.getApplicationContext();
        if (applicationContext instanceof wy0.a) {
            return (wy0.a) applicationContext;
        }
        throw new IllegalStateException("View context must extend UIKitContext for UIKit view to be used");
    }

    public static final boolean g(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        int i = R$attr.internal_monoTheme;
        Intrinsics.checkNotNullParameter(context, "<this>");
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.data != 0;
    }

    public static final boolean h(asi.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        int i = asi.e.f8933a[cVar.ordinal()];
        if (i == 1 || i == 2) {
            return true;
        }
        if (i == 3 || i == 4 || i == 5) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static boolean i(Context context) {
        Boolean bool = f174105a;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Boolean boolValueOf = Boolean.valueOf(context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("firebase_performance_logcat_enabled", false));
            f174105a = boolValueOf;
            return boolValueOf.booleanValue();
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            qf.a.d().a("No perf logcat meta data found " + e.getMessage());
            return false;
        }
    }

    public static final boolean j(Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "<this>");
        return TextUtilsCompat.getLayoutDirectionFromLocale(locale) == 1;
    }

    public static final boolean k(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return context.getResources().getConfiguration().getLayoutDirection() == 1 && j(e(context));
    }

    public static final Locale l(Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "<this>");
        Locale localeBuild = new Locale.Builder().setLocale(locale).setUnicodeLocaleKeyword("nu", "latn").build();
        Intrinsics.checkNotNullExpressionValue(localeBuild, "build(...)");
        return localeBuild;
    }

    public static final nkm.a m(BufferedReader bufferedReader) {
        Intrinsics.checkNotNullParameter(bufferedReader, "<this>");
        q qVar = new q(bufferedReader);
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        return new nkm.a(qVar);
    }

    public static boolean n(j0 j0Var, Object obj2) throws Throwable {
        Object objMo3647trySendJP2dKIU = j0Var.mo3647trySendJP2dKIU(obj2);
        if (!(objMo3647trySendJP2dKIU instanceof y)) {
            return true;
        }
        Throwable thA = z.a(objMo3647trySendJP2dKIU);
        if (thA == null) {
            return false;
        }
        int i = u.f323124a;
        throw thA;
    }

    public static void o(efm.y yVar, AtomicInteger atomicInteger, zfm.c cVar) {
        if (atomicInteger.getAndIncrement() == 0) {
            cVar.getClass();
            Throwable thB = zfm.h.b(cVar);
            if (thB != null) {
                yVar.onError(thB);
            } else {
                yVar.onComplete();
            }
        }
    }

    public static void p(efm.y yVar, Throwable th10, AtomicInteger atomicInteger, zfm.c cVar) {
        cVar.getClass();
        if (!zfm.h.a(cVar, th10)) {
            mo3.a.m(th10);
        } else if (atomicInteger.getAndIncrement() == 0) {
            yVar.onError(zfm.h.b(cVar));
        }
    }

    public static void q(efm.y yVar, Object obj2, AtomicInteger atomicInteger, zfm.c cVar) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            yVar.onNext(obj2);
            if (atomicInteger.decrementAndGet() != 0) {
                cVar.getClass();
                Throwable thB = zfm.h.b(cVar);
                if (thB != null) {
                    yVar.onError(thB);
                } else {
                    yVar.onComplete();
                }
            }
        }
    }

    public static final KSerializer r(KClass rootClass, ArrayList serializers, Function0 elementClassifierIfArray) {
        KSerializer eVar;
        KSerializer p1Var;
        Intrinsics.checkNotNullParameter(rootClass, "<this>");
        Intrinsics.checkNotNullParameter(serializers, "serializers");
        Intrinsics.checkNotNullParameter(elementClassifierIfArray, "elementClassifierIfArray");
        kotlin.jvm.internal.p0 p0Var = o0.f186429a;
        if (Intrinsics.f(rootClass, p0Var.b(Collection.class)) || Intrinsics.f(rootClass, p0Var.b(List.class)) || Intrinsics.f(rootClass, p0Var.b(List.class)) || Intrinsics.f(rootClass, p0Var.b(ArrayList.class))) {
            eVar = new qlm.e((KSerializer) serializers.get(0));
        } else if (Intrinsics.f(rootClass, p0Var.b(HashSet.class))) {
            eVar = new i0((KSerializer) serializers.get(0), 0);
        } else if (Intrinsics.f(rootClass, p0Var.b(Set.class)) || Intrinsics.f(rootClass, p0Var.b(Set.class)) || Intrinsics.f(rootClass, p0Var.b(LinkedHashSet.class))) {
            eVar = new i0((KSerializer) serializers.get(0), 1);
        } else if (Intrinsics.f(rootClass, p0Var.b(HashMap.class))) {
            eVar = new h0((KSerializer) serializers.get(0), (KSerializer) serializers.get(1), 0);
        } else if (Intrinsics.f(rootClass, p0Var.b(Map.class)) || Intrinsics.f(rootClass, p0Var.b(Map.class)) || Intrinsics.f(rootClass, p0Var.b(LinkedHashMap.class))) {
            eVar = new h0((KSerializer) serializers.get(0), (KSerializer) serializers.get(1), 1);
        } else {
            if (Intrinsics.f(rootClass, p0Var.b(Map.Entry.class))) {
                KSerializer keySerializer = (KSerializer) serializers.get(0);
                KSerializer valueSerializer = (KSerializer) serializers.get(1);
                Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
                Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
                p1Var = new w0(keySerializer, valueSerializer, 0);
            } else if (Intrinsics.f(rootClass, p0Var.b(Pair.class))) {
                KSerializer keySerializer2 = (KSerializer) serializers.get(0);
                KSerializer valueSerializer2 = (KSerializer) serializers.get(1);
                Intrinsics.checkNotNullParameter(keySerializer2, "keySerializer");
                Intrinsics.checkNotNullParameter(valueSerializer2, "valueSerializer");
                p1Var = new w0(keySerializer2, valueSerializer2, 1);
            } else if (Intrinsics.f(rootClass, p0Var.b(r.class))) {
                KSerializer aSerializer = (KSerializer) serializers.get(0);
                KSerializer bSerializer = (KSerializer) serializers.get(1);
                KSerializer cSerializer = (KSerializer) serializers.get(2);
                Intrinsics.checkNotNullParameter(aSerializer, "aSerializer");
                Intrinsics.checkNotNullParameter(bSerializer, "bSerializer");
                Intrinsics.checkNotNullParameter(cSerializer, "cSerializer");
                eVar = new mlm.a(aSerializer, bSerializer, cSerializer);
            } else {
                Intrinsics.checkNotNullParameter(rootClass, "rootClass");
                if (nim.a.o(rootClass).isArray()) {
                    Object objInvoke = elementClassifierIfArray.invoke();
                    Intrinsics.i(objInvoke, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                    KClass kClass = (KClass) objInvoke;
                    KSerializer elementSerializer = (KSerializer) serializers.get(0);
                    Intrinsics.checkNotNullParameter(kClass, "kClass");
                    Intrinsics.checkNotNullParameter(elementSerializer, "elementSerializer");
                    p1Var = new p1(kClass, elementSerializer);
                } else {
                    eVar = null;
                }
            }
            eVar = p1Var;
        }
        if (eVar != null) {
            return eVar;
        }
        KSerializer[] kSerializerArr = (KSerializer[]) serializers.toArray(new KSerializer[0]);
        KSerializer[] args = (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length);
        Intrinsics.checkNotNullParameter(rootClass, "<this>");
        Intrinsics.checkNotNullParameter(args, "args");
        return g1.a(nim.a.o(rootClass), (KSerializer[]) Arrays.copyOf(args, args.length));
    }

    public static final String s(Reader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "<this>");
        StringWriter out = new StringWriter();
        Intrinsics.checkNotNullParameter(reader, "<this>");
        Intrinsics.checkNotNullParameter(out, "out");
        char[] cArr = new char[8192];
        int i = reader.read(cArr);
        while (i >= 0) {
            out.write(cArr, 0, i);
            i = reader.read(cArr);
        }
        String string = out.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static int t(long j2) {
        if (j2 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j2 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j2;
    }

    public static final KSerializer u(KClass kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        KSerializer kSerializerW = w(kClass);
        if (kSerializerW != null) {
            return kSerializerW;
        }
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        throw new SerializationException(h1.e(kClass));
    }

    public static final KSerializer v(tlm.e eVar, KType type) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        KSerializer kSerializerA = kli.a.A(eVar, type, true);
        if (kSerializerA != null) {
            return kSerializerA;
        }
        KClass kClassD = h1.d(type);
        Intrinsics.checkNotNullParameter(kClassD, "<this>");
        Intrinsics.checkNotNullParameter(kClassD, "<this>");
        throw new SerializationException(h1.e(kClassD));
    }

    public static final KSerializer w(KClass kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        KSerializer[] args = new KSerializer[0];
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Intrinsics.checkNotNullParameter(args, "args");
        KSerializer kSerializerA = g1.a(nim.a.o(kClass), (KSerializer[]) Arrays.copyOf(args, 0));
        if (kSerializerA != null) {
            return kSerializerA;
        }
        aim.f fVar = o1.f247687a;
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        return (KSerializer) o1.f247687a.get(kClass);
    }

    public static final ArrayList x(tlm.e eVar, List typeArguments, boolean z) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(typeArguments, "typeArguments");
        if (z) {
            List list = typeArguments;
            ArrayList arrayList = new ArrayList(w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList.add(v(eVar, (KType) it8.next()));
            }
            return arrayList;
        }
        List<KType> list2 = typeArguments;
        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
        for (KType type : list2) {
            Intrinsics.checkNotNullParameter(eVar, "<this>");
            Intrinsics.checkNotNullParameter(type, "type");
            KSerializer kSerializerA = kli.a.A(eVar, type, false);
            if (kSerializerA == null) {
                return null;
            }
            arrayList2.add(kSerializerA);
        }
        return arrayList2;
    }
}
