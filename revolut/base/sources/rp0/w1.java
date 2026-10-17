package rp0;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.transition.Fade;
import android.view.View;
import com.revolut.core.ui_kit.internal.views.AppTipView;
import com.revolut.core.ui_kit.models.AppTipUIModel;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class w1 implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f256209a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f256210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f256211c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Enum f256212g;

    public w1(z1 z1Var, aw0.z zVar, View view, aw0.a0 a0Var, AppTipUIModel appTipUIModel, aw0.b0 b0Var) {
        this.f256211c = z1Var;
        this.d = zVar;
        this.f256210b = view;
        this.e = a0Var;
        this.f = appTipUIModel;
        this.f256212g = b0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i5, int i6, int i21, int i22, int i32) {
        ColorDrawable u1Var;
        switch (this.f256209a) {
            case 0:
                AppTipUIModel appTipUIModel = (AppTipUIModel) this.f;
                view.removeOnLayoutChangeListener(this);
                z1 z1Var = (z1) this.f256211c;
                aw0.z zVar = (aw0.z) this.d;
                boolean zF = Intrinsics.f(zVar, aw0.y.f10613a);
                f2 f2Var = null;
                View view2 = this.f256210b;
                if (zF) {
                    u1Var = null;
                } else if (Intrinsics.f(zVar, aw0.w.f10581a)) {
                    u1Var = new v1(z1Var, view2, kli.a.s(R$attr.uikit_colorBlack_40, z1Var.f256230a));
                } else {
                    if (!(zVar instanceof aw0.x)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    u1Var = new u1(z1Var, view2, kli.a.s(R$attr.uikit_colorBlack_40, z1Var.f256230a), null);
                }
                if (u1Var != null) {
                    f2 f2Var2 = new f2(z1Var.f256230a, u1Var, 150L);
                    f2Var2.b();
                    f2Var = f2Var2;
                }
                z1Var.f256234h = f2Var;
                Activity activity = z1Var.f256230a;
                yr0.u uVar = new yr0.u(activity, (aw0.a0) this.e);
                uVar.setFocusable(!Intrinsics.f(zVar, r10));
                uVar.setEnterTransition(new Fade(1));
                uVar.setExitTransition(new Fade(2));
                uVar.setOnDismissListener(new x1(z1Var, appTipUIModel, uVar));
                y1 y1Var = new y1(z1Var, appTipUIModel, uVar, 0);
                AppTipView appTipView = uVar.f316100h;
                appTipView.setCloseIconClickListener(y1Var);
                appTipView.setOnClickListener(new y1(z1Var, appTipUIModel, uVar, 1));
                appTipView.setDetailsLinkClickListener(new y1(z1Var, appTipUIModel, uVar, 2));
                appTipView.setActionClickListener(new y1(z1Var, appTipUIModel, uVar, 3));
                uVar.c(appTipUIModel);
                uVar.d(view2, (aw0.b0) this.f256212g);
                py0.f fVarN0 = jh.d.f(activity).n0();
                ?? r2 = appTipUIModel.f57727c;
                Intrinsics.checkNotNullExpressionValue("AppTipView", "getSimpleName(...)");
                fVarN0.d(uVar.f316100h, r2, "AppTipView", null, appTipUIModel.f57730j);
                z1Var.f256233g = uVar;
                return;
            default:
                view.removeOnLayoutChangeListener(this);
                ((xp0.b) this.f256211c).a(this.f256210b, (js0.b) this.d, (js0.b) this.e, (xp0.g) this.f, (xp0.a) this.f256212g);
                return;
        }
    }

    public w1(xp0.b bVar, View view, js0.b bVar2, js0.b bVar3, xp0.g gVar, xp0.a aVar) {
        this.f256211c = bVar;
        this.f256210b = view;
        this.d = bVar2;
        this.e = bVar3;
        this.f = gVar;
        this.f256212g = aVar;
    }
}
