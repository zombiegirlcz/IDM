package hx0;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.transition.Transition;
import android.view.Window;
import androidx.view.ComponentActivity;
import com.revolut.core.ui_kit.internal.drawables.LockableAlphaDrawable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes19.dex */
public final class g implements Transition.TransitionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f156308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref$ObjectRef f156309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f156310c;
    public final /* synthetic */ Ref$ObjectRef d;
    public final /* synthetic */ Activity e;

    public g(Activity activity, Ref$ObjectRef ref$ObjectRef, d dVar, Ref$ObjectRef ref$ObjectRef2, Activity activity2) {
        this.f156308a = activity;
        this.f156309b = ref$ObjectRef;
        this.f156310c = dVar;
        this.d = ref$ObjectRef2;
        this.e = activity2;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        ComponentActivity componentActivity = (ComponentActivity) this.f156308a;
        Drawable background = componentActivity.getWindow().getDecorView().getBackground();
        Ref$ObjectRef ref$ObjectRef = this.f156309b;
        if (Intrinsics.f(background, ref$ObjectRef.f186409a)) {
            Window window = componentActivity.getWindow();
            LockableAlphaDrawable lockableAlphaDrawable = (LockableAlphaDrawable) ref$ObjectRef.f186409a;
            window.setBackgroundDrawable(lockableAlphaDrawable != null ? lockableAlphaDrawable.getDrawable() : null);
        }
        ref$ObjectRef.f186409a = null;
        e eVar = (e) this.f156310c;
        d.Companion.getClass();
        Window window2 = eVar.f156304a.getWindow();
        if (window2 != null) {
            window2.setTransitionBackgroundFadeDuration(0L);
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        ComponentActivity componentActivity = (ComponentActivity) this.e;
        Drawable background = componentActivity.getWindow().getDecorView().getBackground();
        LockableAlphaDrawable lockableAlphaDrawable = new LockableAlphaDrawable(background);
        lockableAlphaDrawable.f55993b = background != null ? background.getAlpha() : 255;
        Ref$ObjectRef ref$ObjectRef = this.d;
        ref$ObjectRef.f186409a = lockableAlphaDrawable;
        componentActivity.getWindow().setBackgroundDrawable((Drawable) ref$ObjectRef.f186409a);
        LockableAlphaDrawable lockableAlphaDrawable2 = (LockableAlphaDrawable) ref$ObjectRef.f186409a;
        if (lockableAlphaDrawable2 == null || lockableAlphaDrawable2.f55992a) {
            return;
        }
        lockableAlphaDrawable2.f55992a = true;
        Drawable drawable = lockableAlphaDrawable2.getDrawable();
        lockableAlphaDrawable2.f55993b = drawable != null ? drawable.getAlpha() : lockableAlphaDrawable2.f55993b;
        lockableAlphaDrawable2.invalidateSelf();
    }
}
