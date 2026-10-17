package btb;

import a83.j0;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import ba4.x;
import com.revolut.shared.feature.workflow.engine.api.WorkflowEngineApi$Toggles$WorkflowRefreshOnForeground;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class q extends til.h implements h80.d, DefaultLifecycleObserver {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Lifecycle f18551l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final z70.a f18552m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final gte.a f18553n;
    public final ArrayList o;

    public q(Lifecycle appLifecycle, z70.a contextProvider, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(appLifecycle, "appLifecycle");
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f18551l = appLifecycle;
        this.f18552m = contextProvider;
        this.f18553n = featureToggleInteractor;
        this.o = new ArrayList();
    }

    @Override // yji.n
    public final void D2() {
        if (((jte.d) this.f18553n).c(WorkflowEngineApi$Toggles$WorkflowRefreshOnForeground.f105374c)) {
            Context applicationContext = this.f18552m.getContext().getApplicationContext();
            Intrinsics.i(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
        }
    }

    @Override // yji.n
    public final void E2() {
        Context applicationContext = this.f18552m.getContext().getApplicationContext();
        Intrinsics.i(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // til.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(gim.c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof btb.n
            if (r0 == 0) goto L13
            r0 = r9
            btb.n r0 = (btb.n) r0
            int r1 = r0.f18548y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18548y = r1
            goto L18
        L13:
            btb.n r0 = new btb.n
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f18546w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f18548y
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            int r2 = r0.v
            java.util.Iterator r4 = r0.u
            yhm.o.b(r9)
            goto L42
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L33:
            yhm.o.b(r9)
            java.util.ArrayList r9 = r8.o
            zhm.v0 r9 = zhm.b0.M(r9)
            java.util.Iterator r9 = r9.iterator()
            r2 = 0
            r4 = r9
        L42:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L8f
            java.lang.Object r9 = r4.next()
            java.lang.ref.WeakReference r9 = (java.lang.ref.WeakReference) r9
            java.lang.Object r9 = r9.get()
            android.app.Activity r9 = (android.app.Activity) r9
            if (r9 == 0) goto L42
            r9.finish()
            r0.getClass()
            r0.u = r4
            r0.v = r2
            r0.f18548y = r3
            eim.c r5 = new eim.c
            kotlin.coroutines.Continuation r6 = fim.h.b(r0)
            r5.<init>(r6)
            androidx.appcompat.app.AppCompatActivity r9 = (androidx.appcompat.app.AppCompatActivity) r9
            androidx.lifecycle.Lifecycle r9 = r9.getLifecycle()
            a70.b r6 = new a70.b
            r7 = 1
            r6.<init>(r5, r7)
            r9.addObserver(r6)
            java.lang.Object r9 = r5.b()
            fim.a r5 = fim.a.COROUTINE_SUSPENDED
            if (r9 != r5) goto L87
            java.lang.String r6 = "frame"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r6)
        L87:
            if (r9 != r5) goto L8a
            goto L8c
        L8a:
            kotlin.Unit r9 = kotlin.Unit.f186387a
        L8c:
            if (r9 != r1) goto L42
            return r1
        L8f:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: btb.q.Z2(gim.c):java.lang.Object");
    }

    @Override // til.h
    public final j0 b3() {
        return new j0(new x(this.f18551l.getCurrentStateFlow(), this, 8), 13);
    }

    @Override // h80.d, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        super.onActivityCreated(activity, bundle);
        this.o.add(new WeakReference(activity));
    }

    @Override // h80.d, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        super.onActivityDestroyed(activity);
        this.o.removeIf(new akl.p(new m(activity, 0), 2));
    }
}
