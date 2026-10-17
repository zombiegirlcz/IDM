package dq0;

import android.view.View;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import cli.u;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c extends WindowInsetsAnimationCompat.Callback implements OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f116897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f116898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f116899c;
    public View d;
    public WindowInsetsCompat e;
    public WindowInsetsCompat f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f116900g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f116901h;
    public boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i, int i2, List delegates) {
        super(0);
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        this.f116897a = i;
        this.f116898b = i2;
        this.f116899c = delegates;
        if ((i & i2) != 0) {
            throw new IllegalArgumentException("persistentInsetTypes and deferredInsetTypes can not contain any of  same WindowInsetsCompat.Type values");
        }
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public final WindowInsetsCompat onApplyWindowInsets(View v, WindowInsetsCompat windowInsets) {
        Intrinsics.checkNotNullParameter(v, "v");
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        Iterator it8 = this.f116899c.iterator();
        while (it8.hasNext()) {
            ((b) it8.next()).onApplyWindowInsets(v, windowInsets);
        }
        this.d = v;
        this.e = windowInsets;
        int i = this.f116898b;
        this.f116900g = windowInsets.isVisible(i);
        boolean z = this.f116901h;
        if (!z) {
            this.f = windowInsets;
        }
        if (z) {
            windowInsets = new WindowInsetsCompat.Builder(windowInsets).setInsets(i, Insets.NONE).build();
        }
        Intrinsics.h(windowInsets);
        if (this.f116901h && !this.i) {
            v.requestLayout();
            v.addOnLayoutChangeListener(new u(this, 2));
        }
        return windowInsets;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public final void onEnd(WindowInsetsAnimationCompat animation) {
        View view;
        Intrinsics.checkNotNullParameter(animation, "animation");
        if (!this.f116901h || (animation.getTypeMask() & this.f116898b) == 0) {
            return;
        }
        this.f116901h = false;
        List list = this.f116899c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((b) list.get(i)).a();
        }
        WindowInsetsCompat windowInsetsCompat = this.e;
        if (windowInsetsCompat == null || (view = this.d) == null) {
            return;
        }
        Intrinsics.h(windowInsetsCompat);
        ViewCompat.dispatchApplyWindowInsets(view, windowInsetsCompat);
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public final void onPrepare(WindowInsetsAnimationCompat animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        if ((animation.getTypeMask() & this.f116898b) != 0) {
            this.f116901h = true;
            this.i = false;
            List list = this.f116899c;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((b) list.get(i)).b();
            }
        }
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public final WindowInsetsCompat onProgress(WindowInsetsCompat insets, List runningAnims) {
        Object next;
        Intrinsics.checkNotNullParameter(insets, "insets");
        Intrinsics.checkNotNullParameter(runningAnims, "runningAnims");
        this.i = true;
        int i = this.f116898b;
        Insets insets2 = insets.getInsets(i);
        Intrinsics.checkNotNullExpressionValue(insets2, "getInsets(...)");
        Insets insets3 = insets.getInsets(this.f116897a);
        Intrinsics.checkNotNullExpressionValue(insets3, "getInsets(...)");
        Insets insetsMax = Insets.max(Insets.subtract(insets2, insets3), Insets.NONE);
        Intrinsics.checkNotNullExpressionValue(insetsMax, "let(...)");
        Iterator it8 = runningAnims.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if ((((WindowInsetsAnimationCompat) next).getTypeMask() & i) != 0) {
                break;
            }
        }
        WindowInsetsAnimationCompat windowInsetsAnimationCompat = (WindowInsetsAnimationCompat) next;
        float interpolatedFraction = windowInsetsAnimationCompat != null ? windowInsetsAnimationCompat.getInterpolatedFraction() : 1.0f;
        if (!this.f116900g) {
            interpolatedFraction = 1.0f - interpolatedFraction;
        }
        List list = this.f116899c;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((b) list.get(i2)).c(insetsMax, interpolatedFraction);
        }
        return insets;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public final WindowInsetsAnimationCompat.BoundsCompat onStart(WindowInsetsAnimationCompat animation, WindowInsetsAnimationCompat.BoundsCompat bounds) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        List list = this.f116899c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((b) list.get(i)).d();
        }
        WindowInsetsAnimationCompat.BoundsCompat boundsCompatOnStart = super.onStart(animation, bounds);
        Intrinsics.checkNotNullExpressionValue(boundsCompatOnStart, "onStart(...)");
        return boundsCompatOnStart;
    }
}
