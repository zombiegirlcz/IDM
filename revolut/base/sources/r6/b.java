package r6;

import android.content.Context;
import android.os.Parcel;
import android.view.View;
import androidx.compose.ui.text.TextStyle;
import androidx.room.util.TableInfo;
import com.google.protobuf.w0;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.domain.AnalyticsFlowStep;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.retail.core.navigation.CompositeCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import cp5.d;
import e4m.e;
import i4b.f;
import java.time.Instant;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import od0.i;
import s3a.k;
import s3a.n;
import sfm.q;
import skm.d1;
import skm.i1;
import skm.l;
import skm.r1;
import skm.t;
import skm.u0;
import skm.y1;
import vkm.j2;
import zhm.q0;

/* JADX INFO: loaded from: classes16.dex */
public abstract /* synthetic */ class b {
    public static /* synthetic */ boolean A(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, r1 r1Var, u0 u0Var, i1 i1Var) {
        while (!atomicReferenceFieldUpdater.compareAndSet(r1Var, u0Var, i1Var)) {
            if (atomicReferenceFieldUpdater.get(r1Var) != u0Var) {
                return false;
            }
        }
        return true;
    }

    public static boolean B(xi0.a aVar, String str) {
        aVar.getClass();
        return d.z(xi0.a.a(str));
    }

    public static e C(k kVar, n nVar, int i) {
        return e4m.b.b(new ryc.d(kVar, nVar, i, 10));
    }

    public static void D(String str) {
        hx7.e.n(new IllegalStateException(str));
    }

    public static float a(View view, String str, float f) {
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, str);
        return kli.a.l(context, f);
    }

    public static int b(int i, int i2, TextStyle textStyle) {
        return (textStyle.hashCode() + i) * i2;
    }

    public static int c(int i, int i2, Instant instant) {
        return (instant.hashCode() + i) * i2;
    }

    public static int d(LargeActionButton.ButtonStyle buttonStyle, int i, int i2) {
        return (buttonStyle.hashCode() + i) * i2;
    }

    public static int e(LinkedHashMap linkedHashMap, int i, int i2) {
        return (linkedHashMap.hashCode() + i) * i2;
    }

    public static int f(i iVar, int i, int i2) {
        return (iVar.hashCode() + i) * i2;
    }

    public static CompositeCommand g(Integer num, Map map, FinishCommand.Mode mode, int i, NaviCommand naviCommand) {
        return com.revolut.retail.core.navigation.a.c(new FinishCommand(num, map, mode, i), naviCommand);
    }

    public static e h(k kVar, n nVar, int i) {
        return e4m.b.b(new ryc.d(kVar, nVar, i, 9));
    }

    public static e i(ske.c cVar, ske.b bVar, int i) {
        return e4m.b.b(new ryc.d(cVar, bVar, i, 21));
    }

    public static e j(ske.c cVar, ske.d dVar, int i) {
        return e4m.b.b(new ryc.d(cVar, dVar, i, 22));
    }

    public static fd6.b k(zc6.a aVar, String str) {
        f fVarD = aVar.d();
        Intrinsics.checkNotNullParameter(fVarD, str);
        return fVarD.e();
    }

    public static HashSet l(HashSet hashSet, TableInfo.ForeignKey foreignKey, int i) {
        hashSet.add(foreignKey);
        return new HashSet(i);
    }

    public static Map m(String str, AnalyticsFlowStep analyticsFlowStep) {
        return q0.c(new Pair(str, analyticsFlowStep));
    }

    public static ne0.d n(rcl.a aVar) {
        aVar.getClass();
        return new ne0.d();
    }

    public static void o(char c2, char c3, String str, String str2, StringBuilder sb6) {
        sb6.append(c2);
        sb6.append(str);
        sb6.append(c3);
        sb6.append(str2);
    }

    public static void p(Parcel parcel, int i, Float f) {
        parcel.writeInt(i);
        parcel.writeFloat(f.floatValue());
    }

    public static void q(w0 w0Var, j2 j2Var, Object obj2) {
        AnalyticsContext analyticsContext = new AnalyticsContext(w0Var);
        j2Var.getClass();
        j2Var.g(obj2, analyticsContext);
    }

    public static void r(String str) {
        hx7.e.h(new IllegalStateException(str));
    }

    public static void s(String str, String str2, String str3) {
        rm0.b.l(str + str2 + str3);
    }

    public static /* synthetic */ void t(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, r1 r1Var, u0 u0Var, d1 d1Var) {
        while (!atomicReferenceFieldUpdater.compareAndSet(r1Var, u0Var, d1Var) && atomicReferenceFieldUpdater.get(r1Var) == u0Var) {
        }
    }

    public static /* synthetic */ boolean u(AtomicReference atomicReference, sfm.k kVar) {
        while (!atomicReference.compareAndSet(kVar, null)) {
            if (atomicReference.get() != kVar) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean v(AtomicReference atomicReference, q qVar) {
        while (!atomicReference.compareAndSet(qVar, null)) {
            if (atomicReference.get() != qVar) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean w(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, l lVar, Object obj2, t tVar) {
        while (!atomicReferenceFieldUpdater.compareAndSet(lVar, obj2, tVar)) {
            if (atomicReferenceFieldUpdater.get(lVar) != obj2) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean x(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, l lVar, skm.b bVar, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(lVar, bVar, obj2)) {
            if (atomicReferenceFieldUpdater.get(lVar) != bVar) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean y(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, l lVar, t tVar, t tVar2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(lVar, tVar, tVar2)) {
            if (atomicReferenceFieldUpdater.get(lVar) != tVar) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean z(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, l lVar, y1 y1Var, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(lVar, y1Var, obj2)) {
            if (atomicReferenceFieldUpdater.get(lVar) != y1Var) {
                return false;
            }
        }
        return true;
    }
}
