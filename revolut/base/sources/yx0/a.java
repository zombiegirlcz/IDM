package yx0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f317517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f317518b;

    public /* synthetic */ a(b bVar, int i) {
        this.f317517a = i;
        this.f317518b = bVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animation) {
        switch (this.f317517a) {
            case 2:
                Intrinsics.checkNotNullParameter(animation, "animation");
                this.f317518b.f317520b.setVisibility(8);
                break;
            default:
                super.onAnimationEnd(animation);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animation) {
        switch (this.f317517a) {
            case 0:
                Intrinsics.checkNotNullParameter(animation, "animation");
                b bVar = this.f317518b;
                bVar.f317519a.setAlpha(BitmapDescriptorFactory.HUE_RED);
                bVar.f317519a.setVisibility(0);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(animation, "animation");
                b bVar2 = this.f317518b;
                bVar2.f317520b.setAlpha(BitmapDescriptorFactory.HUE_RED);
                bVar2.f317520b.setVisibility(0);
                break;
            default:
                super.onAnimationStart(animation);
                break;
        }
    }
}
