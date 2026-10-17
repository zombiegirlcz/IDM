package z9h;

import android.animation.ValueAnimator;
import com.revolut.data.model.Data;
import com.revolut.retail.core.navigation.NaviCommand;
import efm.r;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import wim.z;
import zu8.t0;
import zu8.u0;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class n {
    public static int a(NaviCommand naviCommand, int i, int i2) {
        return (naviCommand.hashCode() + i) * i2;
    }

    public static e4m.e b(d dVar, a aVar, o oVar, int i) {
        return e4m.b.b(new z52.q(dVar, aVar, oVar, i, 3));
    }

    public static e4m.e c(d dVar, b bVar, o oVar, int i) {
        return e4m.b.b(new z52.q(dVar, bVar, oVar, i, 2));
    }

    public static e4m.e d(zdl.c cVar, int i) {
        return e4m.b.b(new yxj.c(cVar, i, 21));
    }

    public static e4m.e e(u0 u0Var, t0 t0Var, int i) {
        return e4m.b.b(new zpc.m(u0Var, t0Var, i, 25));
    }

    public static r f(Object obj2, Throwable th10, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        return r.just(new Data(obj2, th10, z, i, defaultConstructorMarker));
    }

    public static Object g(ValueAnimator valueAnimator, String str, String str2) {
        Intrinsics.checkNotNullParameter(valueAnimator, str);
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.i(animatedValue, str2);
        return animatedValue;
    }

    public static Object h(Class cls, ue0.c cVar, String str, Boolean bool) {
        return cVar.v0(bool, str, z.d(o0.b(cls)));
    }

    public static StringBuilder i(String str, char c2, String str2, char c3, String str3) {
        StringBuilder sb6 = new StringBuilder(str);
        sb6.append(c2);
        sb6.append(str2);
        sb6.append(c3);
        sb6.append(str3);
        return sb6;
    }

    public static StringBuilder j(String str, String str2, char c2, String str3, char c3) {
        StringBuilder sb6 = new StringBuilder();
        sb6.append(str);
        sb6.append(str2);
        sb6.append(c2);
        sb6.append(str3);
        sb6.append(c3);
        return sb6;
    }

    public static ofm.h k(Function1 function1, pfm.a aVar, yzc.p pVar, String str) {
        ofm.h hVarW = aVar.w(new twl.o(13, function1), pVar);
        Intrinsics.checkNotNullExpressionValue(hVarW, str);
        return hVarW;
    }

    public static void l(Class cls, ue0.c cVar, String str, String str2) {
        cVar.G(str2, str, z.d(o0.b(cls)));
    }

    public static /* synthetic */ void m(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, zkm.k kVar, zkm.n nVar, zkm.n nVar2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(kVar, nVar, nVar2) && atomicReferenceFieldUpdater.get(kVar) == nVar) {
        }
    }

    public static /* synthetic */ void n(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, zkm.n nVar, zkm.n nVar2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(nVar, null, nVar2) && atomicReferenceFieldUpdater.get(nVar) == null) {
        }
    }

    public static /* synthetic */ boolean o(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj2, Object obj3) {
        while (!atomicReferenceFieldUpdater.compareAndSet(obj2, obj3, null)) {
            if (atomicReferenceFieldUpdater.get(obj2) != obj3) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean p(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj2, Throwable th10) {
        cfm.c cVar;
        do {
            cVar = zkm.g.f323105b;
            if (atomicReferenceFieldUpdater.compareAndSet(obj2, cVar, th10)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(obj2) == cVar);
        return false;
    }

    public static /* synthetic */ boolean q(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, zkm.f fVar, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj2, zkm.g.f323105b)) {
            if (atomicReferenceFieldUpdater.get(fVar) != obj2) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean r(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, zkm.f fVar, Throwable th10) {
        while (!atomicReferenceFieldUpdater.compareAndSet(fVar, th10, null)) {
            if (atomicReferenceFieldUpdater.get(fVar) != th10) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean s(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, zkm.f fVar, skm.l lVar) {
        cfm.c cVar;
        do {
            cVar = zkm.g.f323105b;
            if (atomicReferenceFieldUpdater.compareAndSet(fVar, cVar, lVar)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(fVar) == cVar);
        return false;
    }

    public static /* synthetic */ boolean t(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, zkm.j jVar, zkm.j jVar2, zkm.j jVar3) {
        while (!atomicReferenceFieldUpdater.compareAndSet(jVar, jVar2, jVar3)) {
            if (atomicReferenceFieldUpdater.get(jVar) != jVar2) {
                return false;
            }
        }
        return true;
    }
}
