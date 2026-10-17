package jr0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.transition.RevTransitionUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f177895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f177896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix f177897c;
    public ViewGroup d;
    public final com.onfido.android.sdk.capture.ui.camera.util.a e;
    public final androidx.camera.viewfinder.a f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(View target, g manager) {
        super(target.getContext());
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(manager, "manager");
        this.f177895a = target;
        this.f177896b = manager;
        this.f177897c = new Matrix();
        this.e = new com.onfido.android.sdk.capture.ui.camera.util.a(this, 2);
        this.f = new androidx.camera.viewfinder.a(this, 16);
    }

    private final View getDrawableHost() {
        return this.f177896b.d.f177901g;
    }

    public final void a() {
        ViewGroup viewGroup = this.d;
        if (viewGroup == null) {
            return;
        }
        this.d = null;
        viewGroup.removeOnLayoutChangeListener(this.f);
        viewGroup.getOverlay().remove(this);
        View view = this.f177895a;
        if (view.getViewTreeObserver().isAlive()) {
            view.getViewTreeObserver().removeOnPreDrawListener(this.e);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        b bVar;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        ViewGroup viewGroup = this.d;
        if (viewGroup == null || (bVar = this.f177896b.f177905b) == null) {
            return;
        }
        View drawableHost = getDrawableHost();
        ViewParent parent = drawableHost.getParent();
        ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup2 == null) {
            return;
        }
        Matrix matrix = this.f177897c;
        matrix.reset();
        RevTransitionUtils.transformMatrixToGlobal(viewGroup2, matrix);
        matrix.preTranslate(-viewGroup2.getScrollX(), -viewGroup2.getScrollY());
        RevTransitionUtils.transformMatrixToLocal(viewGroup, matrix);
        canvas.save();
        canvas.concat(matrix);
        canvas.translate(drawableHost.getLeft(), drawableHost.getTop());
        canvas.concat(drawableHost.getMatrix());
        bVar.a(canvas);
        canvas.restore();
    }
}
