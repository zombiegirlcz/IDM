package com.revolut.core.ui_kit.views.slider_layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.transition.revolut.RevGhostViewFacade;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\b\b\u0007\u0018\u0000 ,2\u00020\u00012\u00020\u0002:\u0001\u001cB'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\r2\b\b\u0001\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u001e\u0010 \u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b\u001e\u0010\u001fR\u001a\u0010!\u001a\u00020\u00108\u0016X\u0096D¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R$\u0010+\u001a\u00020%2\u0006\u0010&\u001a\u00020%8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lcom/revolut/core/ui_kit/views/slider_layout/SlidingDimmerView;", "Landroid/widget/FrameLayout;", "Lny0/h;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "type", "", "setBackgroundType", "(J)V", "", "lightDimmer", "setDimmerBackground", "(Z)V", "color", "setCustomDimmerBackground", "(I)V", "Landroid/view/View;", "view", "setHighlightTarget", "(Landroid/view/View;)V", "Landroidx/transition/revolut/RevGhostViewFacade;", "a", "Landroidx/transition/revolut/RevGhostViewFacade;", "getHighlightTarget$annotations", "()V", "highlightTarget", "fitsReadableArea", "Z", "getFitsReadableArea", "()Z", "", "value", "getDimmingAlpha$ui_kit_components_release", "()F", "setDimmingAlpha$ui_kit_components_release", "(F)V", "dimmingAlpha", "Companion", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SlidingDimmerView extends FrameLayout implements ny0.h {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public RevGhostViewFacade highlightTarget;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FrameLayout f59677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f59678c;

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SlidingDimmerView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private static /* synthetic */ void getHighlightTarget$annotations() {
    }

    private final void setBackgroundType(long type) {
        int iS;
        if (type == this.f59678c) {
            return;
        }
        this.f59678c = type;
        if (type == 2) {
            iS = kli.a.s(R$attr.uikit_colorSliderOverlay, new ContextThemeWrapper(getContext(), R$style.UiKitTheme_TransparentDayNight));
        } else if (type == 1) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            iS = kli.a.s(com.revolut.core.ui_kit.R$attr.internal_colorSwipeableOverlayDimmer, context);
        } else {
            iS = (int) type;
        }
        this.f59677b.setBackgroundColor(iS);
    }

    public final float getDimmingAlpha$ui_kit_components_release() {
        return this.f59677b.getAlpha();
    }

    @Override // ny0.h
    public boolean getFitsReadableArea() {
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
        super.onLayout(z, i, i2, i3, i5);
        if (this.f59678c == 0) {
            setBackgroundType(2L);
        }
    }

    public final void setCustomDimmerBackground(int color) {
        setBackgroundType(color);
    }

    public final void setDimmerBackground(boolean lightDimmer) {
        setBackgroundType(lightDimmer ? 1L : 2L);
    }

    public final void setDimmingAlpha$ui_kit_components_release(float f) {
        this.f59677b.setAlpha(f);
    }

    public final void setHighlightTarget(View view) {
        RevGhostViewFacade revGhostViewFacade = this.highlightTarget;
        RevGhostViewFacade revGhostViewFacade2 = null;
        if ((revGhostViewFacade != null ? revGhostViewFacade.view : null) == view) {
            return;
        }
        if (revGhostViewFacade != null) {
            revGhostViewFacade.detach();
        }
        if (view != null) {
            revGhostViewFacade2 = new RevGhostViewFacade(view);
            revGhostViewFacade2.attach(this);
        }
        this.highlightTarget = revGhostViewFacade2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SlidingDimmerView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlidingDimmerView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        FrameLayout frameLayout = new FrameLayout(context);
        this.f59677b = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setBackgroundColor(0);
    }

    public /* synthetic */ SlidingDimmerView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
