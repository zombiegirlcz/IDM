package fs0;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.widget.PopupWindow;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class e {

    @NotNull
    private static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f137519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f137520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PopupWindow f137521c;
    public ObjectAnimator d;
    public ObjectAnimator e;

    public e(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f137519a = context;
        d dVar = new d(context);
        this.f137520b = dVar;
        PopupWindow popupWindow = new PopupWindow((View) dVar, 0, 0, false);
        popupWindow.setTouchable(false);
        popupWindow.setOutsideTouchable(false);
        popupWindow.setClippingEnabled(false);
        this.f137521c = popupWindow;
    }

    public final void a() {
        if (this.f137521c.isShowing() && this.e == null) {
            ObjectAnimator objectAnimator = this.d;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            this.d = null;
            ObjectAnimator objectAnimator2 = this.e;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
            }
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f137520b, (Property<d, Float>) View.ALPHA, 1.0f, BitmapDescriptorFactory.HUE_RED);
            objectAnimatorOfFloat.setDuration(200L);
            objectAnimatorOfFloat.setStartDelay(150L);
            objectAnimatorOfFloat.addListener(new aq0.k(this, 3));
            objectAnimatorOfFloat.start();
            this.e = objectAnimatorOfFloat;
        }
    }

    public final void b() {
        Activity activityM = kli.a.m(this.f137519a);
        PopupWindow popupWindow = this.f137521c;
        if (!popupWindow.isShowing() || activityM == null || activityM.isDestroyed() || activityM.isFinishing()) {
            return;
        }
        popupWindow.dismiss();
    }

    public final void c(Drawable drawable, View parent, int i, int i2) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        ObjectAnimator objectAnimator = this.e;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.e = null;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        d dVar = this.f137520b;
        dVar.setDrawable(drawable);
        PopupWindow popupWindow = this.f137521c;
        if (popupWindow.isShowing()) {
            dVar.setAlpha(1.0f);
            popupWindow.update(i, i2, intrinsicWidth, intrinsicHeight);
            return;
        }
        popupWindow.setWidth(intrinsicWidth);
        popupWindow.setHeight(intrinsicHeight);
        dVar.setAlpha(BitmapDescriptorFactory.HUE_RED);
        Activity activityM = kli.a.m(this.f137519a);
        if (parent.isAttachedToWindow() && activityM != null && !activityM.isDestroyed() && !activityM.isFinishing()) {
            popupWindow.showAtLocation(parent, 0, i, i2);
        }
        ObjectAnimator objectAnimator2 = this.d;
        if (objectAnimator2 != null) {
            objectAnimator2.cancel();
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(dVar, (Property<d, Float>) View.ALPHA, BitmapDescriptorFactory.HUE_RED, 1.0f);
        objectAnimatorOfFloat.setDuration(200L);
        objectAnimatorOfFloat.start();
        this.d = objectAnimatorOfFloat;
    }
}
