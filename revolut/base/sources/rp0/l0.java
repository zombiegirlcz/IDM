package rp0;

import android.R;
import android.app.Activity;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.transition.Transition;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.core.graphics.ColorUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.transition.platform.MaterialElevationScale;
import com.revolut.core.ui_kit.utils.ListIdTarget;
import com.revolut.core.ui_kit.utils.ParcelableViewTarget;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class l0 {

    @NotNull
    public static final i0 Companion = new i0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f256111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public yr0.o f256112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f256113c;
    public final ihm.f d;

    public l0(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f256111a = activity;
        this.f256113c = v0.a.d("create(...)");
        this.d = v0.a.d("create(...)");
    }

    public static h0 b(ViewGroup viewGroup, View view, boolean z) {
        if (!z) {
            return new h0(knm.b.f(view, viewGroup), knm.b.h(view, viewGroup));
        }
        viewGroup.getLocationOnScreen(new int[2]);
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if (!(layoutParams instanceof WindowManager.LayoutParams)) {
            view.getLocationOnScreen(new int[2]);
            return new h0(r13[0] - r0[0], r13[1] - r0[1]);
        }
        Rect rect = new Rect();
        viewGroup.getWindowVisibleDisplayFrame(rect);
        Rect rect2 = new Rect();
        WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) layoutParams;
        Gravity.apply(layoutParams2.gravity, rootView.getWidth(), rootView.getHeight(), rect, (int) ((layoutParams2.horizontalMargin * rect.width()) + layoutParams2.x), (int) ((layoutParams2.verticalMargin * rect.height()) + layoutParams2.y), rect2);
        Gravity.applyDisplay(layoutParams2.gravity, rect, rect2);
        view.getLocationInWindow(new int[2]);
        return new h0((rect2.left + r13[0]) - r0[0], (rect2.top + r13[1]) - r0[1]);
    }

    public static /* synthetic */ void d(l0 l0Var, ParcelableViewTarget parcelableViewTarget, mw0.a aVar, mw0.o oVar, int i) {
        if ((i & 4) != 0) {
            oVar = mw0.o.VIEW_BOUNDS;
        }
        l0Var.c(parcelableViewTarget, aVar, oVar, null);
    }

    public static /* synthetic */ void f(l0 l0Var, String str, mw0.a aVar, mw0.o oVar, mw0.n nVar, int i) {
        if ((i & 4) != 0) {
            oVar = mw0.o.VIEW_BOUNDS;
        }
        if ((i & 8) != 0) {
            nVar = null;
        }
        l0Var.e(str, aVar, oVar, nVar);
    }

    public final void a() {
        yr0.o oVar = this.f256112b;
        if (oVar != null) {
            oVar.dismiss();
        }
        this.f256112b = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(ix0.b2 target, mw0.a model, mw0.o position, mw0.n nVar) {
        float width;
        float height;
        float width2;
        int absoluteGravity;
        m0 fVar;
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(position, "position");
        Activity activity = this.f256111a;
        View root = activity.findViewById(R.id.content);
        Intrinsics.checkNotNullExpressionValue(root, "findViewById(...)");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(root, "root");
        View parent = js0.d.a(target, root);
        if (parent == 0) {
            return;
        }
        if (this.f256112b != null) {
            a();
        }
        View decorView = activity.getWindow().getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup == null) {
            return;
        }
        boolean zF = Intrinsics.f(parent.getWindowId(), viewGroup.getWindowId());
        boolean z = !zF;
        int i = k0.f256107a[position.ordinal()];
        if (i == 1) {
            if (parent instanceof ms0.e1) {
                ms0.e1 e1Var = (ms0.e1) parent;
                width = e1Var.getLastRawTouchX();
                height = e1Var.getLastRawTouchY();
            } else {
                h0 h0VarB = b(viewGroup, parent, z);
                width = h0VarB.f256088a + (parent.getWidth() / 2);
                height = h0VarB.f256089b + (parent.getHeight() / 2);
            }
            width2 = width;
            absoluteGravity = Gravity.getAbsoluteGravity(53, viewGroup.getLayoutDirection());
        } else if (i == 2) {
            h0 h0VarB2 = b(viewGroup, parent, z);
            width2 = (parent.getWidth() / 2) + h0VarB2.f256088a;
            height = h0VarB2.f256089b + parent.getHeight();
            absoluteGravity = Gravity.getAbsoluteGravity(53, viewGroup.getLayoutDirection());
        } else if (i == 3) {
            h0 h0VarB3 = b(viewGroup, parent, z);
            width2 = h0VarB3.f256088a + (viewGroup.getLayoutDirection() == 1 ? parent.getWidth() : 0);
            height = h0VarB3.f256089b + parent.getHeight();
            absoluteGravity = Gravity.getAbsoluteGravity(8388661, viewGroup.getLayoutDirection());
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            WindowInsets rootWindowInsets = viewGroup.getRootWindowInsets();
            int iB = rootWindowInsets != null ? ix0.x0.b(rootWindowInsets) : 0;
            boolean z3 = iB > 0;
            h0 h0VarB4 = b(viewGroup, parent, z);
            float f = h0VarB4.f256088a;
            float f4 = h0VarB4.f256089b;
            if (z3 && zF) {
                float height2 = viewGroup.getHeight() - iB;
                if (height2 < BitmapDescriptorFactory.HUE_RED) {
                    height2 = 0.0f;
                }
                f4 = kotlin.ranges.f.f(f4, BitmapDescriptorFactory.HUE_RED, height2);
            }
            int i2 = (!(z3 && zF) && f4 <= (((float) viewGroup.getHeight()) - f4) - ((float) parent.getHeight())) ? 48 : 80;
            width2 = f + (parent.getWidth() / 2);
            height = i2 == 80 ? f4 - kli.a.k(activity, 4.0f) : f4 + parent.getHeight() + kli.a.k(activity, 4.0f);
            absoluteGravity = i2 | 1;
        }
        if (nVar == null) {
            fVar = null;
        } else if (nVar instanceof mw0.m) {
            fVar = new f2(activity, new ColorDrawable(ColorUtils.setAlphaComponent(-16777216, 51)), 200L);
        } else {
            if (!(nVar instanceof mw0.l)) {
                throw new NoWhenBranchMatchedException();
            }
            fVar = new f(parent, ((mw0.l) nVar).f209295a);
        }
        final yr0.o oVar = new yr0.o(activity, model.f209278a, model.f209279b);
        int i3 = 0;
        int i5 = 1;
        rnb.u listener = new rnb.u(i5, this.f256113c, ihm.f.class, "onNext", "onNext(Ljava/lang/Object;)V", i3, 2);
        Intrinsics.checkNotNullParameter(listener, "listener");
        oVar.d.setClickListener(listener);
        rnb.u listener2 = new rnb.u(i5, this.d, ihm.f.class, "onNext", "onNext(Ljava/lang/Object;)V", i3, 3);
        Intrinsics.checkNotNullParameter(listener2, "listener");
        yr0.a aVar = oVar.e;
        if (aVar != null) {
            aVar.setClickListener(new yj2.b(oVar, listener2, 24));
        }
        oVar.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: rp0.g0
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                l0 l0Var = this.f256086a;
                py0.f fVarN0 = jh.d.f(l0Var.f256111a).n0();
                View contentView = oVar.getContentView();
                Intrinsics.checkNotNullExpressionValue(contentView, "getContentView(...)");
                fVarN0.h(contentView);
                l0Var.f256112b = null;
            }
        });
        Transition materialElevationScale = new MaterialElevationScale(true);
        materialElevationScale.setDuration(200L);
        oVar.setEnterTransition(materialElevationScale);
        Transition materialElevationScale2 = new MaterialElevationScale(false);
        materialElevationScale2.setDuration(200L);
        oVar.setExitTransition(materialElevationScale2);
        if (fVar != null) {
            j0 j0Var = new j0(0, fVar);
            j0 j0Var2 = new j0(1, fVar);
            Transition enterTransition = oVar.getEnterTransition();
            if (enterTransition != null) {
                enterTransition.addListener(j0Var);
            }
            Transition exitTransition = oVar.getExitTransition();
            if (exitTransition != null) {
                exitTransition.addListener(j0Var2);
            }
            oVar.getContentView().addOnAttachStateChangeListener(j0Var);
            oVar.getContentView().addOnAttachStateChangeListener(j0Var2);
        }
        if (!zF) {
            parent = viewGroup;
        }
        int iC = rim.d.c(width2);
        int iC2 = rim.d.c(height);
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(position, "position");
        int i6 = yr0.n.f316075a[position.ordinal()];
        if (i6 == 1) {
            int i21 = absoluteGravity & 7;
            int i22 = oVar.f316076a;
            if (i21 == 5) {
                i22 = -i22;
            }
            iC += i22;
        } else if (i6 != 2 && i6 != 3 && i6 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        oVar.showAtLocation(parent, absoluteGravity, iC, iC2);
        this.f256112b = oVar;
    }

    public final void e(String id10, mw0.a model, mw0.o position, mw0.n nVar) {
        Intrinsics.checkNotNullParameter(id10, "anchorItemId");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(id10, "id");
        c(new ListIdTarget(id10), model, position, nVar);
    }
}
