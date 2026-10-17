package ox0;

import android.view.View;

/* JADX INFO: loaded from: classes20.dex */
public final class j implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n f230482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final es0.k f230483b = new es0.k(this, 7);

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i5, int i6, int i21, int i22, int i32) {
        n nVar = this.f230482a;
        if (nVar != null) {
            nVar.e();
        }
    }
}
