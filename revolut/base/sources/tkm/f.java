package tkm;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import fim.h;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.Intrinsics;
import sgm.j1;
import skm.l;
import skm.p0;
import yhm.m;
import yhm.n;
import yhm.o;

/* JADX INFO: loaded from: classes13.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f271977a = 0;
    private static volatile Choreographer choreographer;

    static {
        Object objA;
        try {
            m.Companion companion = m.INSTANCE;
            objA = new e(b(Looper.getMainLooper()));
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            objA = o.a(th10);
        }
        if (objA instanceof n) {
            objA = null;
        }
    }

    public static final void a(l lVar) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            choreographer2 = Choreographer.getInstance();
            Intrinsics.h(choreographer2);
            choreographer = choreographer2;
        }
        choreographer2.postFrameCallback(new a3.c(lVar, 1));
    }

    public static final Handler b(Looper looper) throws IllegalAccessException, InvocationTargetException {
        Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        Intrinsics.i(objInvoke, "null cannot be cast to non-null type android.os.Handler");
        return (Handler) objInvoke;
    }

    public static final Object c(iid.f frame) {
        Choreographer choreographer2 = choreographer;
        int i = 1;
        if (choreographer2 != null) {
            l lVar = new l(1, h.b(frame));
            lVar.u();
            choreographer2.postFrameCallback(new a3.c(lVar, i));
            Object objT = lVar.t();
            if (objT == fim.a.COROUTINE_SUSPENDED) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
            return objT;
        }
        l lVar2 = new l(1, h.b(frame));
        lVar2.u();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            a(lVar2);
        } else {
            p0 p0Var = p0.f264001a;
            zkm.o.f323119a.dispatch(lVar2.e, new j1(lVar2, 5));
        }
        Object objT2 = lVar2.t();
        if (objT2 == fim.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objT2;
    }
}
