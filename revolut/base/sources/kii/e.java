package kii;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.os.Parcel;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.node.LayoutNode;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.data.model.Data;
import com.revolut.feature.identity.auth.domain.model.RegisteredIdentityId;
import com.revolut.tracking.v3.IdContext;
import com.revolut.tracking.v3.RevPointsGenericWidgetContext;
import efm.r;
import grl.t9;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import jqa.h;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import lp.p1;
import lp.q1;
import m2b.u;
import m2b.v;
import tji.l;
import vc.s;
import wim.z;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class e {
    public static /* synthetic */ void A(l lVar) {
        if (lVar != null) {
            throw new ClassCastException();
        }
    }

    public static void B(wi0.a aVar, String str, ArrayList arrayList) {
        aVar.getClass();
        arrayList.add(wi0.a.a(str));
    }

    public static boolean C(e4m.e eVar, String str, ArrayList arrayList) {
        Object obj2 = eVar.get();
        s.i(obj2, str);
        arrayList.add(obj2);
        return arrayList.isEmpty();
    }

    public static e4m.e D(q1 q1Var, int i) {
        return e4m.b.b(new p1(q1Var, i, 1));
    }

    public static float a(float f, float f4, float f5, float f6) {
        return (f5 - (f * f4)) * f6;
    }

    public static int b(LayoutNode layoutNode) {
        return layoutNode.getNodes().getHead().getAggregateChildKindSet();
    }

    public static int c(Data data, int i, int i2) {
        return (data.hashCode() + i) * i2;
    }

    public static w0 d(IdContext.a aVar, String str, AnalyticsContext.Companion companion) {
        aVar.h(str);
        w0 w0VarA = aVar.a();
        companion.getClass();
        return AnalyticsContext.Companion.a(w0VarA);
    }

    public static w0 e(RevPointsGenericWidgetContext.a aVar, t9 t9Var, AnalyticsContext.Companion companion) {
        aVar.h(t9Var);
        w0 w0VarA = aVar.a();
        companion.getClass();
        return AnalyticsContext.Companion.a(w0VarA);
    }

    public static e4m.e f(kr9.l lVar, kr9.a aVar, kr9.b bVar, int i) {
        return e4m.b.b(new il8.d(lVar, aVar, bVar, i, 19));
    }

    public static e4m.e g(kr9.l lVar, kr9.c cVar, int i) {
        return e4m.b.b(new h(lVar, cVar, i, 26));
    }

    public static e4m.e h(q1 q1Var, int i) {
        return e4m.b.b(new p1(q1Var, i, 0));
    }

    public static e4m.e i(v vVar, u uVar, int i) {
        return e4m.b.b(new lzk.b(vVar, uVar, i, 11));
    }

    public static gah.e j(u8h.b bVar, String str) {
        gah.f fVarA = bVar.a();
        s.j(fVarA);
        Intrinsics.checkNotNullParameter(fVarA, str);
        return fVarA.a();
    }

    public static gah.g k(u8h.b bVar) {
        gah.f factory = bVar.a();
        s.j(factory);
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new gah.g();
    }

    public static Object l(Context context, String str, Context context2, Class cls) {
        Intrinsics.checkNotNullParameter(context, str);
        return ue0.e.j(context2).a().get(cls);
    }

    public static Object m(MutableVector mutableVector, int i) {
        return mutableVector.removeAt(mutableVector.getSize() - i);
    }

    public static Object n(String str, mk0.a aVar) {
        return aVar.a(new tk0.e(str));
    }

    public static Type o(Class cls, KTypeProjection.Companion aVar, Class cls2) {
        KType kTypeB = o0.b(cls);
        aVar.getClass();
        return z.d(o0.c(cls2, KTypeProjection.Companion.a(kTypeB)));
    }

    public static ArrayList p(Function0 function0, String str, int i) {
        Intrinsics.checkNotNullParameter(function0, str);
        return new ArrayList(i);
    }

    public static Iterator q(Parcel parcel, int i, Set set) {
        parcel.writeInt(i);
        parcel.writeInt(set.size());
        return set.iterator();
    }

    public static Pair r(Map map, int i, int i2, String str) {
        return new Pair(str, new ho.s(i, i2, map));
    }

    public static p1 s(q1 q1Var, int i, e4m.a aVar, q1 q1Var2, int i2) {
        e4m.a.a(aVar, e4m.b.b(new p1(q1Var, i, 0)));
        return new p1(q1Var2, i2, 0);
    }

    public static vkm.d t(ihm.f fVar, String str) {
        r rVarHide = fVar.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, str);
        return rd0.e.b(rVarHide);
    }

    public static xi0.b u(pcd.s sVar, xi0.a aVar) {
        String currency = sVar.getCurrency();
        aVar.getClass();
        return xi0.a.a(currency);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void v(MediaMetadataRetriever mediaMetadataRetriever) throws Exception {
        boolean zIsTerminated;
        if (mediaMetadataRetriever instanceof AutoCloseable) {
            mediaMetadataRetriever.close();
            return;
        }
        if (!(mediaMetadataRetriever instanceof ExecutorService)) {
            mediaMetadataRetriever.release();
            return;
        }
        ExecutorService executorService = (ExecutorService) mediaMetadataRetriever;
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

    public static void w(e4m.e eVar, String str, ArrayList arrayList) {
        Object obj2 = eVar.get();
        s.i(obj2, str);
        arrayList.add(obj2);
    }

    public static void x(String str, Parcel parcel, int i) {
        parcel.writeParcelable(new RegisteredIdentityId(str), i);
    }

    public static void y(StringBuilder sb6, String str, int i) {
        sb6.append(Integer.toHexString(i));
        sb6.append(str);
    }

    public static /* synthetic */ void z(AtomicReference atomicReference, Object obj2) {
        while (!atomicReference.compareAndSet(null, obj2) && atomicReference.get() == null) {
        }
    }
}
