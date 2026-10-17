package dok;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.revolut.core.ui_kit.delegates.BigTileDelegate;
import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.kompot.view.RootFrameLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import ip0.t4;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import zhm.a0;

/* JADX INFO: loaded from: classes11.dex */
public final class k implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f116585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f116586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f116587c;
    public Object d;

    public /* synthetic */ k(ViewGroup viewGroup, Object obj2, Object obj3, int i) {
        this.f116585a = i;
        this.f116586b = viewGroup;
        this.f116587c = obj2;
        this.d = obj3;
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    private final void d(View view) {
    }

    public void a(View controllerView) {
        hli.j jVar;
        Intrinsics.checkNotNullParameter(controllerView, "controllerView");
        com.revolut.kompot.navigable.a aVar = (com.revolut.kompot.navigable.a) this.f116586b;
        if ((!(aVar instanceof qji.c) || (aVar instanceof ali.g)) && (jVar = (hli.j) this.d) != null) {
            RootFrameLayout rootFrameLayout = (RootFrameLayout) this.f116587c;
            if (rootFrameLayout != null) {
                rootFrameLayout.a(jVar);
            }
            controllerView.removeOnAttachStateChangeListener(this);
        }
    }

    public void e(View controllerView) {
        Intrinsics.checkNotNullParameter(controllerView, "controllerView");
        com.revolut.kompot.navigable.a aVar = (com.revolut.kompot.navigable.a) this.f116586b;
        if ((!(aVar instanceof qji.c) || (aVar instanceof ali.g)) && ((hli.j) this.d) == null) {
            hli.j.Companion.getClass();
            this.d = hli.i.a();
            if (controllerView.isAttachedToWindow()) {
                onViewAttachedToWindow(controllerView);
            }
            controllerView.addOnAttachStateChangeListener(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        switch (this.f116585a) {
            case 1:
                Intrinsics.checkNotNullParameter(v, "v");
                hli.j target = (hli.j) this.d;
                if (target != null) {
                    RootFrameLayout rootFrameLayout = (RootFrameLayout) this.f116587c;
                    if (rootFrameLayout == null) {
                        while (true) {
                            rootFrameLayout = null;
                            if (v != null) {
                                if (v instanceof RootFrameLayout) {
                                    rootFrameLayout = (RootFrameLayout) v;
                                } else {
                                    Object parent = v.getParent();
                                    v = parent instanceof View ? (View) parent : null;
                                }
                            }
                        }
                    }
                    this.f116587c = rootFrameLayout;
                    if (rootFrameLayout != null) {
                        Intrinsics.checkNotNullParameter(target, "target");
                        ArrayList arrayList = rootFrameLayout.f98455a;
                        if (!arrayList.contains(target)) {
                            arrayList.add(target);
                        }
                    }
                    break;
                }
                break;
            case 2:
                ((View) this.f116586b).removeOnAttachStateChangeListener(this);
                t4 t4Var = (t4) this.f116587c;
                koi.j jVar = t4Var.e;
                BigTileDelegate.Model model = jVar instanceof BigTileDelegate.Model ? (BigTileDelegate.Model) jVar : null;
                AnimationRequest animationRequest = model != null ? model.f51741r : null;
                AnimationRequest animationRequest2 = (AnimationRequest) this.d;
                if (animationRequest == animationRequest2 && !animationRequest2.f57724a) {
                    animationRequest2.f57724a = true;
                    t4Var.F().c();
                    break;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        RootFrameLayout rootFrameLayout;
        switch (this.f116585a) {
            case 0:
                ((ScreenContentRecyclerView) this.f116586b).removeOnAttachStateChangeListener(this);
                ((ActionFooterView) this.f116587c).removeOnLayoutChangeListener((androidx.camera.viewfinder.a) this.d);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(v, "v");
                hli.j jVar = (hli.j) this.d;
                if (jVar != null && (rootFrameLayout = (RootFrameLayout) this.f116587c) != null) {
                    rootFrameLayout.a(jVar);
                }
                break;
            case 2:
                break;
            default:
                ((FrameLayout) this.f116586b).removeOnAttachStateChangeListener(this);
                a0.E(((sxl.f) this.f116587c).f266529a, new sx8.a((FrameLayout) this.d, 3));
                break;
        }
    }

    public k(com.revolut.kompot.navigable.a controller) {
        this.f116585a = 1;
        Intrinsics.checkNotNullParameter(controller, "controller");
        this.f116586b = controller;
    }

    public k(View view, BigTileDelegate bigTileDelegate, t4 t4Var, AnimationRequest animationRequest) {
        this.f116585a = 2;
        this.f116586b = view;
        this.f116587c = t4Var;
        this.d = animationRequest;
    }
}
