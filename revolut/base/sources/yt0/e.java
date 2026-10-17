package yt0;

import android.view.View;

/* JADX INFO: loaded from: classes19.dex */
public final class e implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f316532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f316533b;

    public /* synthetic */ e(h hVar, int i) {
        this.f316532a = i;
        this.f316533b = hVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i5, int i6, int i21, int i22, int i32) {
        switch (this.f316532a) {
            case 0:
                view.removeOnLayoutChangeListener(this);
                h hVar = this.f316533b;
                h.t(hVar, false);
                hVar.y();
                h.u(hVar);
                break;
            default:
                view.removeOnLayoutChangeListener(this);
                h hVar2 = this.f316533b;
                h.t(hVar2, true);
                h.u(hVar2);
                break;
        }
    }
}
