package m72;

import android.content.res.TypedArray;
import android.media.MediaMetadataRetriever;
import android.os.Parcel;
import android.text.InputFilter;
import android.view.ViewGroup;
import androidx.camera.core.impl.SurfaceCombination;
import androidx.camera.core.impl.SurfaceConfig;
import com.google.protobuf.h3;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.data.model.Data;
import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import com.revolut.tracking.v3.DiagnosticContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Stream;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.text.t;
import mkh.o;
import mkh.s;
import o4e.l;
import org.joda.time.DateTime;
import te0.w;
import vkm.j2;
import vkm.q;
import zhm.d0;
import zhm.u;
import zhm.y0;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class b {
    public static void A(Parcel parcel, int i, Long l2) {
        parcel.writeInt(i);
        parcel.writeLong(l2.longValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void B(Stream stream) throws Exception {
        boolean zIsTerminated;
        if (stream instanceof AutoCloseable) {
            stream.close();
            return;
        }
        if (!(stream instanceof ExecutorService)) {
            if (stream instanceof TypedArray) {
                ((TypedArray) stream).recycle();
                return;
            } else {
                if (!(stream instanceof MediaMetadataRetriever)) {
                    throw new IllegalArgumentException();
                }
                ((MediaMetadataRetriever) stream).release();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) stream;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static /* synthetic */ boolean C(AtomicReference atomicReference, od0.b bVar, od0.b bVar2) {
        while (!atomicReference.compareAndSet(bVar, bVar2)) {
            if (atomicReference.get() != bVar) {
                return false;
            }
        }
        return true;
    }

    public static float a(float f, float f4, float f5, float f6) {
        return (f5 - (f * f4)) / f6;
    }

    public static int b(float f, int i, int i2) {
        return (Float.hashCode(f) + i) * i2;
    }

    public static int c(int i, double d, int i2) {
        return (Double.hashCode(d) + i) * i2;
    }

    public static int d(ViewGroup viewGroup, int i, float f, int i2, int i3) {
        viewGroup.getChildAt(i).setAlpha(f);
        return i2 + i3;
    }

    public static int e(WealthAccountType wealthAccountType, int i, int i2) {
        return (wealthAccountType.hashCode() + i) * i2;
    }

    public static int f(DateTime dateTime, int i, int i2) {
        return (dateTime.hashCode() + i) * i2;
    }

    public static SurfaceCombination g(SurfaceCombination surfaceCombination, SurfaceConfig surfaceConfig, ArrayList arrayList, SurfaceCombination surfaceCombination2) {
        surfaceCombination.addSurfaceConfig(surfaceConfig);
        arrayList.add(surfaceCombination2);
        return new SurfaceCombination();
    }

    public static w0 h(String str, h3 h3Var, AnalyticsContext.Companion bVar) {
        DiagnosticContext.a aVarNewBuilder = DiagnosticContext.newBuilder();
        aVarNewBuilder.h(str);
        aVarNewBuilder.i(h3Var);
        w0 w0VarA = aVarNewBuilder.a();
        bVar.getClass();
        return AnalyticsContext.Companion.a(w0VarA);
    }

    public static e4m.e i(s sVar, mkh.a aVar, int i) {
        return e4m.b.b(new mjl.b(sVar, aVar, i, 2));
    }

    public static e4m.e j(s sVar, o oVar, int i) {
        return e4m.b.b(new mjl.b(sVar, oVar, i, 10));
    }

    public static e4m.e k(mlf.d dVar, mlf.e eVar, int i) {
        return e4m.b.b(new mjl.b(dVar, eVar, i, 16));
    }

    public static e4m.e l(mz.b bVar, ey.d dVar, int i) {
        return e4m.b.b(new ms1.s(bVar, dVar, i, 6));
    }

    public static e4m.e m(na4.e eVar, int i) {
        return e4m.b.b(new mil.a(eVar, i, 19));
    }

    public static e4m.e n(na4.e eVar, na4.d dVar, int i) {
        return e4m.b.b(new ms1.s(eVar, dVar, i, 12));
    }

    public static e4m.e o(l lVar, o4e.e eVar, int i) {
        return e4m.b.b(new o41.b(lVar, eVar, i, 3));
    }

    public static String p(char c2, List list, StringBuilder sb6) {
        sb6.append(list);
        sb6.append(c2);
        return sb6.toString();
    }

    public static String q(String str, StringBuilder sb6) {
        sb6.append(str);
        return t.e(sb6.toString());
    }

    public static String r(String str, KClass kClass) {
        return str + kClass;
    }

    public static String s(StringBuilder sb6, float f, char c2) {
        sb6.append(f);
        sb6.append(c2);
        return sb6.toString();
    }

    public static String t(Object[] objArr, int i, Locale locale, String str, String str2) {
        String str3 = String.format(locale, str, Arrays.copyOf(objArr, i));
        Intrinsics.checkNotNullExpressionValue(str3, str2);
        return str3;
    }

    public static List u(int i) {
        return u.c(new InputFilter.LengthFilter(i));
    }

    public static List v(Function2 function2, Function2 function22, int i) {
        return u.c(new RowDelegate(function2, function22, i));
    }

    public static Set w(String str, String str2) {
        return y0.b(new Pair(str, str2));
    }

    public static od0.i x(List list, od0.h hVar) {
        Object objD0 = d0.d0(list);
        hVar.getClass();
        return od0.h.a(objD0);
    }

    public static j2 y(Object obj2, Throwable th10, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        return q.c(new Data(obj2, th10, z, i, defaultConstructorMarker));
    }

    public static void z(akl.s sVar, pfm.a aVar, j7a.j jVar, String str, ifm.b bVar) {
        ofm.h hVarW = aVar.w(new n1i.b(1, sVar), jVar);
        Intrinsics.checkNotNullExpressionValue(hVarW, str);
        w.j0(bVar, hVarW);
    }
}
