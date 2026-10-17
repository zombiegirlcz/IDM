package oi0;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import elm.f;
import elm.g;
import et0.a0;
import fim.h;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import rd0.e;
import skm.e0;
import skm.l;
import skm.p0;
import ukm.j0;
import vkm.z1;
import xg0.k;
import xg0.m;
import xg0.n;
import xg0.o;
import xg0.p;
import xg0.q;
import xg0.r;
import xg0.s;
import xg0.t;
import zhm.a1;
import zhm.d0;

/* JADX INFO: loaded from: classes19.dex */
public final class b implements xg0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uh0.c f225409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f225410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CoroutineScope f225411c;
    public final z1 d;

    public b(uh0.c installManagerFactory, a0 nativeLibraryPathPatcher) {
        g cleanupDispatcher = p0.f264002b;
        Intrinsics.checkNotNullParameter(installManagerFactory, "installManagerFactory");
        Intrinsics.checkNotNullParameter(nativeLibraryPathPatcher, "nativeLibraryPathPatcher");
        Intrinsics.checkNotNullParameter(cleanupDispatcher, "cleanupDispatcher");
        this.f225409a = installManagerFactory;
        this.f225410b = nativeLibraryPathPatcher;
        this.f225411c = e.a(cleanupDispatcher);
        this.d = ta6.a.a(0);
    }

    public static final void a(b bVar, j0 j0Var, p pVar) {
        j0Var.mo3647trySendJP2dKIU(pVar);
        if (pVar.equals(s.f305478a) || (pVar instanceof n) || pVar.equals(m.f305471a) || pVar.equals(r.f305477a) || (pVar instanceof t)) {
            return;
        }
        if (!pVar.equals(k.f305469a) && !(pVar instanceof o) && !pVar.equals(q.f305476a)) {
            throw new NoWhenBranchMatchedException();
        }
        j0Var.close(null);
    }

    public final Object b(Context context, Set modules, gim.c frame) {
        this.f225409a.getClass();
        vc.b bVar = (vc.b) uh0.c.a(context).f258289a;
        Set setF = bVar.f();
        Intrinsics.checkNotNullExpressionValue(setF, "getInstalledModules(...)");
        Set setK = a1.k(modules, setF);
        if (setK.isEmpty()) {
            q qVar = q.f305476a;
            this.d.k(new xg0.e(modules, qVar));
            return qVar;
        }
        l lVar = new l(1, h.b(frame));
        lVar.u();
        Intrinsics.checkNotNullParameter(modules, "modules");
        Task task = bVar.c(d0.d1(modules));
        Intrinsics.checkNotNullExpressionValue(task, "deferredInstall(...)");
        Intrinsics.checkNotNullParameter(task, "task");
        a9j.n onSuccess = new a9j.n(this, 12, setK, lVar);
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        task.addOnSuccessListener(new ubj.c(22, new js7.c(28, onSuccess)));
        o9k.d0 onFailure = new o9k.d0(this, setK, lVar);
        Intrinsics.checkNotNullParameter(onFailure, "onFailure");
        task.addOnFailureListener(new com.onfido.android.sdk.capture.internal.util.a(onFailure));
        Object objT = lVar.t();
        if (objT == fim.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objT;
    }

    public final Object c(Context context, Set set, gim.c cVar) {
        o4a.b bVar = new o4a.b(this, context, set, null, 7);
        p0 p0Var = p0.f264001a;
        return e0.J(f.f127540b, bVar, cVar);
    }

    public final xg0.h d(Context context, Set modules) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(modules, "modules");
        this.f225409a.getClass();
        Set setF = ((vc.b) uh0.c.a(context).f258289a).f();
        Intrinsics.checkNotNullExpressionValue(setF, "getInstalledModules(...)");
        Set setK = a1.k(modules, setF);
        if (!modules.isEmpty()) {
            boolean zIsEmpty = setK.isEmpty();
            z1 z1Var = this.d;
            if (zIsEmpty) {
                z1Var.k(new xg0.b(modules, xg0.c.Available));
            } else {
                z1Var.k(new xg0.b(setK, xg0.c.Unavailable));
            }
        }
        return new xg0.h(setK, setF);
    }

    public final vkm.d e(Context context, Set modules) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(modules, "modules");
        return vkm.q.k(new of6.d(this, context, modules, (Continuation) null, 3));
    }

    public final void f(Context context, Set modules) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(modules, "modules");
        this.f225409a.getClass();
        ryc.a aVarA = uh0.c.a(context);
        Intrinsics.checkNotNullParameter(modules, "modules");
        Task task = ((vc.b) aVarA.f258289a).b(d0.d1(modules));
        Intrinsics.checkNotNullExpressionValue(task, "deferredUninstall(...)");
        Intrinsics.checkNotNullParameter(task, "task");
        oa2.b onSuccess = new oa2.b(this, modules, 10);
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        task.addOnSuccessListener(new ubj.c(23, new ud3.n(onSuccess, 20)));
        ofg.a onFailure = new ofg.a(this, modules, 7);
        Intrinsics.checkNotNullParameter(onFailure, "onFailure");
        task.addOnFailureListener(new ubj.c(24, onFailure));
    }
}
