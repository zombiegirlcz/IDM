package hli;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.collection.MutableScatterSet;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.Lifecycle;
import com.revolut.kompot_ui.R$styleable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class h implements e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f153470j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f153471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f153472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f153473c;
    public String d;
    public g e;
    public final MutableScatterSet f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public WindowInsets f153474g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PointF f153475h;
    public boolean i;

    public h(@NotNull Context context, AttributeSet attributeSet) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f153471a = context;
        this.d = "NO_CONTAINER_ID";
        this.f = new MutableScatterSet(0, 1, null);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ControllerContainer);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f153472b = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ControllerContainer_fitStatusBar, this.f153472b);
        this.f153473c = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ControllerContainer_fitNavigationBar, this.f153473c);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // hli.e
    public final void J0() {
        this.e = null;
    }

    @Override // hli.e
    public final void N0() {
        this.e = null;
    }

    @Override // hli.e
    public final c W(Lifecycle controllerLifecycle) {
        Intrinsics.checkNotNullParameter(controllerLifecycle, "controllerLifecycle");
        return new c(this.f153471a, new f(this, 0), new f(this, 1), controllerLifecycle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WindowInsets a(e controllerContainer, WindowInsets insets) {
        WindowInsets windowInsets;
        Intrinsics.checkNotNullParameter(controllerContainer, "controllerContainer");
        Intrinsics.checkNotNullParameter(insets, "insets");
        WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(insets);
        Intrinsics.checkNotNullExpressionValue(windowInsetsCompat, "toWindowInsetsCompat(...)");
        int iSystemBars = WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.ime();
        Insets insets2 = windowInsetsCompat.getInsets(iSystemBars);
        Intrinsics.checkNotNullExpressionValue(insets2, "getInsets(...)");
        ViewGroup viewGroup = (ViewGroup) controllerContainer;
        if (controllerContainer.getFitNavigationBar() || controllerContainer.getFitStatusBar()) {
            viewGroup.setPadding(viewGroup.getPaddingLeft(), controllerContainer.getFitStatusBar() ? insets2.top : 0, viewGroup.getPaddingRight(), controllerContainer.getFitNavigationBar() ? insets2.bottom : 0);
            Insets insetsOf = Insets.of(insets2.left, controllerContainer.getFitStatusBar() ? 0 : insets2.top, insets2.right, controllerContainer.getFitNavigationBar() ? 0 : insets2.bottom);
            Intrinsics.checkNotNullExpressionValue(insetsOf, "of(...)");
            windowInsets = new WindowInsetsCompat.Builder(windowInsetsCompat).setInsets(iSystemBars, insetsOf).build().toWindowInsets();
        } else {
            windowInsets = insets;
        }
        if (windowInsets != null) {
            insets = windowInsets;
        }
        this.f153474g = insets;
        return insets;
    }

    public final boolean b(MotionEvent ev10, View containerView) {
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(ev10, "ev");
        if (ev10.getActionMasked() == 0) {
            PointF pointF = this.f153475h;
            if (pointF == null) {
                pointF = new PointF();
            }
            pointF.set(ev10.getRawX(), ev10.getRawY());
            this.f153475h = pointF;
        }
        g gVar = this.e;
        boolean z = !(gVar == null || gVar.b()) || this.f.isNotEmpty();
        if (z) {
            containerView.getParent().requestDisallowInterceptTouchEvent(true);
        }
        return z;
    }

    public final boolean c() {
        if (!this.i) {
            return false;
        }
        this.i = false;
        return true;
    }

    @Override // hli.e
    public final void c0(boolean z) {
        this.e = g.a(z);
    }

    @Override // hli.e
    public final String getContainerId() {
        return this.d;
    }

    @Override // hli.e
    public final boolean getControllersTransitionActive() {
        return this.e != null;
    }

    @Override // hli.e
    public final boolean getFitNavigationBar() {
        return this.f153473c;
    }

    @Override // hli.e
    public final boolean getFitStatusBar() {
        return this.f153472b;
    }

    @Override // hli.e
    public final WindowInsets getLatestAppliedInsets() {
        return this.f153474g;
    }

    @Override // hli.e
    public final PointF getLatestDispatchedDownEvent() {
        return this.f153475h;
    }

    @Override // hli.e
    public final void setContainerId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.d = str;
    }

    @Override // hli.e
    public final void setFitNavigationBar(boolean z) {
        this.f153473c = z;
    }

    @Override // hli.e
    public final void setFitStatusBar(boolean z) {
        this.f153472b = z;
    }
}
