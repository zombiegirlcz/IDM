package rp0;

import android.R;
import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.transition.Fade;
import android.view.View;
import com.revolut.core.ui_kit.internal.views.AppTipView;
import com.revolut.core.ui_kit.models.AppTipUIModel;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.utils.ParcelableViewTarget;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class z1 {

    @NotNull
    private static final t1 Companion = new t1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f256230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ihm.f f256231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f256232c;
    public final ihm.f d;
    public final ihm.f e;
    public final ihm.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public yr0.u f256233g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f2 f256234h;

    public z1(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f256230a = activity;
        this.f256231b = v0.a.d("create(...)");
        this.f256232c = v0.a.d("create(...)");
        this.d = v0.a.d("create(...)");
        this.e = v0.a.d("create(...)");
        this.f = v0.a.d("create(...)");
    }

    public static final void a(z1 z1Var, yr0.u uVar) {
        z1Var.getClass();
        Fade fade = new Fade(2);
        fade.setDuration(150L);
        uVar.setExitTransition(fade);
    }

    public static void b(z1 z1Var, ParcelableViewTarget target, AppTipUIModel appTipUIModel, aw0.b0 b0Var, aw0.a0 a0Var, int i) {
        ColorDrawable u1Var;
        int i2 = i & 4;
        aw0.w wVar = aw0.w.f10581a;
        aw0.y yVar = aw0.y.f10613a;
        aw0.z overlayStyle = i2 != 0 ? yVar : wVar;
        if ((i & 8) != 0) {
            b0Var = aw0.b0.ANCHOR_OFFSET;
        }
        aw0.b0 position = b0Var;
        if ((i & 16) != 0) {
            a0Var = aw0.a0.DEFAULT;
        }
        aw0.a0 popupSize = a0Var;
        Activity activity = z1Var.f256230a;
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(appTipUIModel, "appTipUIModel");
        Intrinsics.checkNotNullParameter(overlayStyle, "overlayStyle");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(popupSize, "popupSize");
        yr0.u uVar = z1Var.f256233g;
        f2 f2Var = null;
        if (uVar != null) {
            if (uVar != null) {
                uVar.dismiss();
            }
            z1Var.f256233g = null;
        }
        View viewFindViewById = activity.findViewById(R.id.content);
        Intrinsics.h(viewFindViewById);
        View viewA = js0.d.a(target, viewFindViewById);
        if (viewA == null) {
            return;
        }
        if (!viewA.isLaidOut() || viewA.isLayoutRequested()) {
            viewA.addOnLayoutChangeListener(new w1(z1Var, overlayStyle, viewA, popupSize, appTipUIModel, position));
            return;
        }
        if (overlayStyle.equals(yVar)) {
            u1Var = null;
        } else if (overlayStyle.equals(wVar)) {
            u1Var = new v1(z1Var, viewA, kli.a.s(R$attr.uikit_colorBlack_40, activity));
        } else {
            if (!(overlayStyle instanceof aw0.x)) {
                throw new NoWhenBranchMatchedException();
            }
            u1Var = new u1(z1Var, viewA, kli.a.s(R$attr.uikit_colorBlack_40, activity), null);
        }
        if (u1Var != null) {
            f2Var = new f2(activity, u1Var, 150L);
            f2Var.b();
        }
        z1Var.f256234h = f2Var;
        yr0.u uVar2 = new yr0.u(activity, popupSize);
        uVar2.setFocusable(!overlayStyle.equals(yVar));
        uVar2.setEnterTransition(new Fade(1));
        uVar2.setExitTransition(new Fade(2));
        uVar2.setOnDismissListener(new x1(z1Var, appTipUIModel, uVar2));
        uVar2.a().setCloseIconClickListener(new y1(z1Var, appTipUIModel, uVar2, 0));
        uVar2.a().setOnClickListener(new y1(z1Var, appTipUIModel, uVar2, 1));
        uVar2.a().setDetailsLinkClickListener(new y1(z1Var, appTipUIModel, uVar2, 2));
        uVar2.a().setActionClickListener(new y1(z1Var, appTipUIModel, uVar2, 3));
        uVar2.c(appTipUIModel);
        uVar2.d(viewA, position);
        py0.f fVarN0 = jh.d.f(activity).n0();
        AppTipView appTipViewA = uVar2.a();
        Clause clauseG = appTipUIModel.G();
        Intrinsics.checkNotNullExpressionValue("AppTipView", "getSimpleName(...)");
        fVarN0.d(appTipViewA, clauseG, "AppTipView", null, appTipUIModel.getO());
        z1Var.f256233g = uVar2;
    }
}
