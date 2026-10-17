package kji;

import android.app.Activity;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.ViewKt;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.revolut.feature.rev10_main_screen.impl.ui.MainContainerLauncherActivity;
import fnc.s;
import hx0.d0;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements d0, DefaultLifecycleObserver, xji.a {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MainContainerLauncherActivity f184410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d0 f184411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WeakReference f184412c;

    public d(MainContainerLauncherActivity mainContainerLauncherActivity) {
        this.f184410a = mainContainerLauncherActivity;
    }

    public final com.revolut.kompot.navigable.a a() {
        WeakReference weakReference = this.f184412c;
        if (weakReference != null) {
            return (com.revolut.kompot.navigable.a) weakReference.get();
        }
        return null;
    }

    @Override // hx0.d0
    public final s k1() {
        d0 d0Var = this.f184411b;
        if (d0Var != null) {
            return d0Var.k1();
        }
        return null;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        nhi.k.b(this);
    }

    @Override // xji.a
    public final void q(com.revolut.kompot.navigable.a controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        if (controller.equals(this.f184411b)) {
            this.f184411b = null;
        }
    }

    @Override // xji.a
    public final void w1(com.revolut.kompot.navigable.a controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        if (controller.equals(this.f184411b)) {
            this.f184411b = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xji.a
    public final void z2(com.revolut.kompot.navigable.a controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Activity activityM2 = controller.m2();
        MainContainerLauncherActivity mainContainerLauncherActivity = this.f184410a;
        if (Intrinsics.f(activityM2, mainContainerLauncherActivity) && (controller instanceof d0)) {
            this.f184411b = (d0) controller;
            s sVarK1 = k1();
            ViewGroup viewGroupJ = sVarK1 != null ? sVarK1.j() : null;
            if (viewGroupJ != null) {
                viewGroupJ.setTransitionGroup(true);
                for (ViewParent viewParent : ViewKt.getAncestors(viewGroupJ)) {
                    ViewGroup viewGroup = viewParent instanceof ViewGroup ? (ViewGroup) viewParent : null;
                    if (viewGroup != null) {
                        viewGroup.setTransitionGroup(false);
                    }
                }
            }
        }
        Intrinsics.f(controller.m2(), mainContainerLauncherActivity);
    }
}
