package po0;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import com.revolut.core.ui_kit_core.displayers.image.models.LottieImage;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class v {

    @NotNull
    public static final com.revolut.core.ui_kit.background.c Companion = new com.revolut.core.ui_kit.background.c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f237865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LottieAnimationView f237866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AnimatedBackgroundType f237867c;

    public v(FrameLayout parentView) {
        Intrinsics.checkNotNullParameter(parentView, "parentView");
        this.f237865a = parentView;
        LottieAnimationView lottieAnimationView = new LottieAnimationView(parentView.getContext());
        lottieAnimationView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.f237866b = lottieAnimationView;
        parentView.addView(lottieAnimationView, new FrameLayout.LayoutParams(-1, -1));
    }

    public final l a(AnimatedBackgroundType animatedBackgroundType) {
        ColorDrawable colorDrawable = null;
        if (!Intrinsics.f(this.f237867c, animatedBackgroundType)) {
            this.f237867c = animatedBackgroundType;
            com.revolut.core.ui_kit.background.c cVar = Companion;
            FrameLayout frameLayout = this.f237865a;
            Context context = frameLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            u uVar = new u(context);
            cVar.getClass();
            l lVarA = com.revolut.core.ui_kit.background.c.a(animatedBackgroundType, uVar);
            if (lVarA != null) {
                LottieAnimationView lottieAnimationView = this.f237866b;
                Context context2 = lottieAnimationView.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                boolean zQ = kli.a.q(context2);
                Context context3 = frameLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                LottieImage lottieImageB = lVarA.b(zQ, ny0.i.d(context3));
                Integer numC = lVarA.c();
                if (numC != null) {
                    Context context4 = frameLayout.getContext();
                    Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                    colorDrawable = new ColorDrawable(kli.a.s(numC.intValue(), context4));
                }
                frameLayout.setBackground(colorDrawable);
                yy0.f.e(or0.u.k(lottieAnimationView).Q(), lottieImageB, lottieAnimationView, null, null, 12);
                return lVarA;
            }
        }
        return null;
    }
}
