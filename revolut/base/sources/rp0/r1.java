package rp0;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.views.status.StatusView;

/* JADX INFO: loaded from: classes19.dex */
public final class r1 implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s1 f256158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f256159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.n0 f256160c;

    public r1(s1 s1Var, long j2, kotlin.jvm.internal.n0 n0Var) {
        this.f256158a = s1Var;
        this.f256159b = j2;
        this.f256160c = n0Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i5, int i6, int i21, int i22, int i32) {
        view.removeOnLayoutChangeListener(this);
        StatusView statusView = this.f256158a.f256166b;
        float height = statusView.getHeight();
        statusView.setTranslationY((height * 0.5f) + Math.abs(height - statusView.getTranslationY()));
        statusView.animate().translationY(BitmapDescriptorFactory.HUE_RED).setInterpolator(new DecelerateInterpolator()).setDuration(this.f256159b).setStartDelay(this.f256160c.f186428a).start();
    }
}
