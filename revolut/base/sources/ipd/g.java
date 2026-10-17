package ipd;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.background.AnimatedBackgroundView;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function0 f167737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AnimatedBackgroundView f167738b;

    public g(Function0 isEnabled) {
        Intrinsics.checkNotNullParameter(isEnabled, "isEnabled");
        this.f167737a = isEnabled;
    }

    public final void a(View rootView) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        if (((Boolean) this.f167737a.invoke()).booleanValue()) {
            ViewGroup viewGroup = rootView instanceof ViewGroup ? (ViewGroup) rootView : null;
            if (viewGroup == null) {
                return;
            }
            AnimatedBackgroundView animatedBackgroundView = this.f167738b;
            if ((animatedBackgroundView != null ? animatedBackgroundView.getParent() : null) == viewGroup) {
                return;
            }
            AnimatedBackgroundView animatedBackgroundView2 = this.f167738b;
            if (animatedBackgroundView2 != null) {
                ViewParent parent = animatedBackgroundView2.getParent();
                ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup2 != null) {
                    viewGroup2.removeView(animatedBackgroundView2);
                }
            }
            Context context = ((ViewGroup) rootView).getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            AnimatedBackgroundView animatedBackgroundView3 = new AnimatedBackgroundView(context, null, 6, 0);
            viewGroup.addView(animatedBackgroundView3, 0, new ViewGroup.LayoutParams(-1, -1));
            this.f167738b = animatedBackgroundView3;
        }
    }

    public final void b() {
        AnimatedBackgroundView animatedBackgroundView = this.f167738b;
        if (animatedBackgroundView != null) {
            ViewParent parent = animatedBackgroundView.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(animatedBackgroundView);
            }
        }
        this.f167738b = null;
    }

    public final Integer c() {
        Integer numValueOf = Integer.valueOf(R$style.UiKitTheme_Transparent);
        if (((Boolean) this.f167737a.invoke()).booleanValue()) {
            return numValueOf;
        }
        return null;
    }

    public final void d(View rootView, f background) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(background, "background");
        if (Intrinsics.f(background, e.f167736a)) {
            Context context = rootView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            rootView.setBackgroundColor(kli.a.s(R$attr.uikit_colorBackground, context));
            AnimatedBackgroundView animatedBackgroundView = this.f167738b;
            if (animatedBackgroundView != null) {
                animatedBackgroundView.setVisibility(8);
                return;
            }
            return;
        }
        if (!(background instanceof d)) {
            throw new NoWhenBranchMatchedException();
        }
        Context context2 = rootView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        rootView.setBackgroundColor(kli.a.s(R$attr.uikit_colorTransparent, context2));
        AnimatedBackgroundView animatedBackgroundView2 = this.f167738b;
        if (animatedBackgroundView2 != null) {
            animatedBackgroundView2.setVisibility(0);
            animatedBackgroundView2.setBackgroundType(((d) background).f167735a);
        }
    }

    public g() {
        this(new lm.d(13));
    }
}
