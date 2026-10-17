package rp0;

import android.widget.PopupWindow;
import com.revolut.core.ui_kit.models.AppTipUIModel;

/* JADX INFO: loaded from: classes19.dex */
public final class x1 implements PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z1 f256214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppTipUIModel f256215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yr0.u f256216c;

    public x1(z1 z1Var, AppTipUIModel appTipUIModel, yr0.u uVar) {
        this.f256214a = z1Var;
        this.f256215b = appTipUIModel;
        this.f256216c = uVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        z1 z1Var = this.f256214a;
        f2 f2Var = z1Var.f256234h;
        if (f2Var != null) {
            f2Var.a();
        }
        z1Var.f256234h = null;
        z1Var.f256233g = null;
        z1Var.e.onNext(this.f256215b);
        jh.d.f(z1Var.f256230a).n0().h(this.f256216c.f316100h);
    }
}
