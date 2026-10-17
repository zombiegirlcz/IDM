package kz0;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.Window;
import aw0.y9;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.color.MaterialColors;
import com.revolut.core.ui_kit_core.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class e implements DialogInterface.OnDismissListener, DialogInterface.OnShowListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f191031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f191032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ObjectAnimator f191033c;
    public boolean d;

    public e(g dialog, long j2) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        this.f191031a = dialog;
        this.f191032b = j2;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        ObjectAnimator objectAnimator = this.f191033c;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            objectAnimator.cancel();
        }
        this.f191033c = null;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        View viewFindViewById = this.f191031a.findViewById(R$id.dialog_loading);
        Drawable background = viewFindViewById.getBackground();
        ColorDrawable colorDrawable = background instanceof ColorDrawable ? (ColorDrawable) background : null;
        final int color = colorDrawable != null ? colorDrawable.getColor() : 0;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewFindViewById, (Property<View, Float>) View.ALPHA, BitmapDescriptorFactory.HUE_RED, 1.0f);
        objectAnimatorOfFloat.setDuration(this.f191032b);
        objectAnimatorOfFloat.setInterpolator(new c());
        objectAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: kz0.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator value) {
                Intrinsics.checkNotNullParameter(value, "value");
                e eVar = this.f191029a;
                g gVar = eVar.f191031a;
                Window window = gVar.getWindow();
                if (window == null || window.getDecorView().getParent() == null || !gVar.f191036b) {
                    return;
                }
                Object animatedValue = value.getAnimatedValue();
                int i = color;
                Intrinsics.i(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                int iD = io0.a.d(((Float) animatedValue).floatValue() * (Color.alpha(i) / 255.0f), i);
                window.setStatusBarColor(iD);
                window.setNavigationBarDividerColor(iD);
                if (eVar.d || ((Number) animatedValue).floatValue() <= BitmapDescriptorFactory.HUE_RED) {
                    return;
                }
                (MaterialColors.isColorLight(i) ? y9.DARK : y9.LIGHT).a(window);
                eVar.d = true;
            }
        });
        objectAnimatorOfFloat.start();
        this.f191033c = objectAnimatorOfFloat;
    }
}
