package esi;

import android.graphics.drawable.ColorDrawable;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import kji.k;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements b, xji.a, DefaultLifecycleObserver, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f128952a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LifecycleOwner f128953b;

    public c(ViewController controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        this.f128953b = controller;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner owner) {
        switch (this.f128952a) {
            case 0:
                Intrinsics.checkNotNullParameter(owner, "owner");
                nhi.k.a(this);
                break;
            default:
                Intrinsics.checkNotNullParameter(owner, "owner");
                nhi.k.a(this);
                break;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner owner) {
        switch (this.f128952a) {
            case 0:
                Intrinsics.checkNotNullParameter(owner, "owner");
                nhi.k.b(this);
                break;
            default:
                Intrinsics.checkNotNullParameter(owner, "owner");
                nhi.k.b(this);
                break;
        }
    }

    @Override // xji.a
    public final void q1(com.revolut.kompot.navigable.a controller) {
        switch (this.f128952a) {
            case 0:
                Intrinsics.checkNotNullParameter(controller, "controller");
                Intrinsics.checkNotNullParameter(controller, "controller");
                if (Intrinsics.f(controller.m2(), (BaseDelegatesActivity) this.f128953b) && (controller.D2().getBackground() instanceof ColorDrawable) && !controller.q2().d()) {
                    controller.D2().setBackground(null);
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(controller, "controller");
                Intrinsics.checkNotNullParameter(controller, "controller");
                for (com.revolut.kompot.navigable.a aVar = controller.f98405m; aVar != null; aVar = aVar.f98405m) {
                    if (aVar.equals((ViewController) this.f128953b)) {
                        if (!controller.q2().d()) {
                            controller.D2().setBackground(null);
                        }
                    }
                    break;
                }
                break;
        }
    }

    public c(BaseDelegatesActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f128953b = activity;
    }
}
