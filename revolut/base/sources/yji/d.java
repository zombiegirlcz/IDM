package yji;

import aii.s;
import android.content.Intent;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import wf0.r0;

/* JADX INFO: loaded from: classes10.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CoroutineScope f314510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s f314511b;

    public static void H(d dVar, Flow flow, Function2 onEach, int i) {
        int i2 = 2;
        Continuation continuation = null;
        xsd.a onError = new xsd.a(i2, 8, continuation);
        a27.d onSuccessCompletion = new a27.d(1, 16, continuation);
        if ((i & 4) != 0) {
            onEach = new r0(i2, 16, continuation);
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Intrinsics.checkNotNullParameter(onSuccessCompletion, "onSuccessCompletion");
        Intrinsics.checkNotNullParameter(onEach, "onEach");
        s sVar = dVar.f314511b;
        int i3 = sVar == null ? -1 : c.f314509a[sVar.ordinal()];
        if (i3 != -1 && i3 != 1 && i3 != 2 && i3 != 3 && i3 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        int i5 = sVar == null ? -1 : c.f314509a[sVar.ordinal()];
        if (i5 != -1 && i5 != 1 && i5 != 2 && i5 != 3 && i5 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        CoroutineScope coroutineScope = dVar.f314510a;
        if (coroutineScope != null) {
            ue0.e.d(flow, coroutineScope, onError, onSuccessCompletion, onEach);
        } else {
            Intrinsics.r("attachedScope");
            throw null;
        }
    }

    public boolean I() {
        return this instanceof eq.a;
    }

    public final void L(zkm.d attachedScope) {
        Intrinsics.checkNotNullParameter(attachedScope, "attachedScope");
        this.f314510a = attachedScope;
    }

    public void M() {
    }

    public void N() {
    }

    public final void O() {
        s sVar = this.f314511b;
        if (sVar == null) {
            throw new IllegalArgumentException("onParentLifecycleChanged() must be called after update of parentLastLifecycleEvent");
        }
        int i = c.f314509a[sVar.ordinal()];
        if (i == 1) {
            onCreate();
            return;
        }
        if (i == 2) {
            M();
        } else if (i == 3) {
            N();
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            onDestroy();
        }
    }

    public final void P(s sVar) {
        this.f314511b = sVar;
    }

    public final void o(int i, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onCreate() {
    }

    public void onDestroy() {
    }
}
