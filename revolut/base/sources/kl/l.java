package kl;

import android.view.animation.Animation;
import android.widget.TextView;

/* JADX INFO: loaded from: classes17.dex */
public final class l implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextView f185192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f185193b;

    public l(TextView textView, int i) {
        this.f185192a = textView;
        this.f185193b = i;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        TextView textView = this.f185192a;
        textView.setText(textView.getContext().getString(this.f185193b));
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
