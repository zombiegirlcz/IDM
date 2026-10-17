package rp0;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class i1 extends BaseTransientBottomBar.BaseCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ShotDialogDisplayer$Configuration f256093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f256094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k1 f256095c;

    public i1(k1 k1Var, ShotDialogDisplayer$Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f256095c = k1Var;
        this.f256093a = configuration;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar.BaseCallback
    public final void onDismissed(Object obj2, int i) {
        k1 k1Var = this.f256095c;
        c1 c1Var = null;
        if (Intrinsics.f(k1Var.f256110c, (yr0.r) obj2)) {
            k1Var.f256110c = null;
        }
        ShotDialogDisplayer$Configuration shotDialogDisplayer$Configuration = this.f256093a;
        if (i == 0) {
            c1Var = new c1(shotDialogDisplayer$Configuration, y0.SWIPED);
        } else if (i == 2) {
            c1Var = new c1(shotDialogDisplayer$Configuration, y0.TIMEOUT);
        } else if (i == 3) {
            c1Var = this.f256094b ? new c1(shotDialogDisplayer$Configuration, y0.TRIGGERED_ACTION) : new c1(shotDialogDisplayer$Configuration, y0.MANUAL);
        } else if (i != 4) {
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "javaClass", a0.d.n("Transient bottom bar dismiss event is not handled: ", i), null, h0Var);
        } else {
            c1Var = new c1(shotDialogDisplayer$Configuration, y0.ANOTHER_SHOT);
        }
        if (c1Var != null) {
            k1Var.d.onNext(c1Var);
        }
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar.BaseCallback
    public final void onShown(Object obj2) {
        this.f256095c.d.onNext(new d1(this.f256093a));
    }
}
