package zxl;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.FrameLayout;
import androidx.core.view.OneShotPreDrawListener;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q2k.b;
import sgm.j1;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends FrameLayout {

    @NotNull
    private static final C1807a Companion = new C1807a();
    public static final /* synthetic */ int d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ValueAnimator f326350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f326351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f326352c;

    /* JADX INFO: renamed from: zxl.a$a, reason: collision with other inner class name */
    public static final class C1807a {
        private C1807a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        setImportantForAccessibility(2);
        setClickable(true);
        setFocusable(true);
        setVisibility(8);
        setOnClickListener(new wk.a(this, 6));
    }

    public final void a(boolean z) {
        if (getVisibility() != 0 && this.f326350a == null && this.f326351b == null) {
            return;
        }
        animate().cancel();
        setAlpha(1.0f);
        setVisibility(8);
        removeAllViews();
        b bVar = this.f326351b;
        this.f326351b = null;
        ValueAnimator valueAnimator = this.f326350a;
        this.f326350a = null;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
        }
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
        }
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (bVar != null) {
            bVar.invoke(Boolean.valueOf(z));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f326352c = false;
        a(true);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onVisibilityAggregated(boolean z) {
        ValueAnimator valueAnimator;
        super.onVisibilityAggregated(z);
        this.f326352c = z;
        if (!z) {
            ValueAnimator valueAnimator2 = this.f326350a;
            if (valueAnimator2 != null) {
                if (!valueAnimator2.isStarted() || valueAnimator2.isPaused()) {
                    valueAnimator2 = null;
                }
                if (valueAnimator2 != null) {
                    valueAnimator2.pause();
                    return;
                }
                return;
            }
            return;
        }
        if (!isAttachedToWindow() || !isLaidOut()) {
            OneShotPreDrawListener.add(this, new j1(this, this));
            return;
        }
        if (this.f326352c && (valueAnimator = this.f326350a) != null) {
            if (!valueAnimator.isStarted()) {
                valueAnimator.start();
            } else if (valueAnimator.isPaused()) {
                valueAnimator.resume();
            }
        }
    }
}
