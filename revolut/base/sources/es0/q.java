package es0;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import au0.b5;
import au0.s4;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class q {

    @NotNull
    private static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f128843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p f128844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m f128845c;
    public float d;
    public final ValueAnimator e;

    public q(ConstraintLayout container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.f128843a = container;
        this.f128844b = p.NOT_INITIALISED;
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(250L);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(new b5(this, 12));
        valueAnimator.addListener(new s4(this, 1));
        this.e = valueAnimator;
        container.addOnAttachStateChangeListener(new k(this, 0));
    }

    public final void b() {
        ConstraintLayout constraintLayout = this.f128843a;
        float width = constraintLayout.getWidth() * (constraintLayout.getLayoutDirection() == 1 ? -1 : 1);
        int childCount = constraintLayout.getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            View childAt = constraintLayout.getChildAt(i);
            if (childAt != this.f128845c && childAt.getVisibility() != 8) {
                childAt.setTranslationX((-this.d) * width);
                childAt.setVisibility(this.d == 1.0f ? 4 : 0);
                childAt.setImportantForAccessibility(this.f128844b.b() ? 4 : 0);
            }
            i++;
        }
        m mVar = this.f128845c;
        if (mVar != null) {
            mVar.setTranslationX((1.0f - this.d) * width);
            mVar.setVisibility(this.d > BitmapDescriptorFactory.HUE_RED ? 0 : 8);
            mVar.setImportantForAccessibility(this.f128844b.b() ? 0 : 4);
        }
    }

    public final void c() {
        p pVarA = this.f128844b.a();
        this.f128844b = pVarA;
        this.d = pVarA.b() ? 1.0f : BitmapDescriptorFactory.HUE_RED;
        b();
    }
}
