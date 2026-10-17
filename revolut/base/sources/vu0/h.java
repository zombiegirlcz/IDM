package vu0;

import android.view.View;
import com.revolut.core.ui_kit.internal.views.swipelayout.SwipeToActionLayout;
import ip0.zh0;

/* JADX INFO: loaded from: classes19.dex */
public final class h implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f292151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f292152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zh0 f292153c;
    public final /* synthetic */ SwipeToActionLayout d;

    public h(e eVar, int i, zh0 zh0Var, SwipeToActionLayout swipeToActionLayout) {
        this.f292151a = eVar;
        this.f292152b = i;
        this.f292153c = zh0Var;
        this.d = swipeToActionLayout;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i5, int i6, int i21, int i22, int i32) {
        view.removeOnLayoutChangeListener(this);
        int i33 = this.f292151a.f292146a;
        int i43 = this.f292152b;
        if (i33 == i43 && this.f292153c.getBindingAdapterPosition() == i43) {
            this.d.c(false, s.FROM_END_TO_START);
        }
    }
}
