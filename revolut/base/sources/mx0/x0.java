package mx0;

import android.view.View;
import mx0.p0;

/* JADX INFO: loaded from: classes20.dex */
public final class x0 implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f210099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p0 f210100b;

    public /* synthetic */ x0(p0 p0Var, int i) {
        this.f210099a = i;
        this.f210100b = p0Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i5, int i6, int i21, int i22, int i32) {
        int i33 = this.f210099a;
        p0 p0Var = this.f210100b;
        switch (i33) {
            case 0:
                view.removeOnLayoutChangeListener(this);
                p0.a aVar = p0.Companion;
                p0Var.f(true);
                break;
            default:
                view.removeOnLayoutChangeListener(this);
                p0.a aVar2 = p0.Companion;
                p0Var.g(true);
                break;
        }
    }
}
