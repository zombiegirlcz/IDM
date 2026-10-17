package h60;

import android.content.Context;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.onfido.android.sdk.capture.ui.camera.CapturePresenter;
import com.revolut.core.ui_kit_core.displayers.image.models.LottieImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LottieSource;
import com.revolut.core.ui_kit_core.displayers.image.models.SourceUrl;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import te0.w;

/* JADX INFO: loaded from: classes19.dex */
public final class f extends d {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f149579g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.revolut.kompot.navigable.a f149580c;
    public boolean d;
    public b e;
    public final Object f;

    static {
        Intrinsics.checkNotNullParameter(LottieImage.INSTANCE, "<this>");
        f149579g = CapturePresenter.PASSPORT_OVERLAY_DELAY_MS;
    }

    public f(com.revolut.kompot.navigable.a controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        this.f149580c = controller;
        this.f = w.y0(new h1g.a(this, 5));
    }

    public static LottieImage V(b bVar) {
        if (bVar instanceof a) {
            return dz0.a.b(LottieImage.INSTANCE);
        }
        if (!(bVar instanceof c)) {
            throw new NoWhenBranchMatchedException();
        }
        LottieImage.Companion companion = LottieImage.INSTANCE;
        LottieSource.Companion companion2 = LottieSource.INSTANCE;
        String url2 = ((c) bVar).f149578a;
        companion2.getClass();
        Intrinsics.checkNotNullParameter(url2, "url");
        return LottieImage.Companion.a(companion, new SourceUrl(url2, null), false, false, null, null, Constants.TAG_SUPPORTED_LOCALE_LIST);
    }

    @Override // h60.d
    public final void Q() {
        a animationType = a.f149577a;
        Intrinsics.checkNotNullParameter(animationType, "animationType");
        if (this.d) {
            return;
        }
        LottieImage lottieImageV = V(animationType);
        U().setVisibility(8);
        yy0.f.e(jh.d.f(this.f149580c.m2()).Q(), LottieImage.Companion.a(LottieImage.INSTANCE, lottieImageV.f59955a, false, false, null, null, Constants.TAG_FC_SPEED_MODE), U(), null, null, 12);
    }

    @Override // h60.d
    public final void R(b animationType) {
        Intrinsics.checkNotNullParameter(animationType, "animationType");
        if (this.d) {
            return;
        }
        this.e = animationType;
        LottieImage lottieImageV = V(animationType);
        this.d = true;
        this.f149580c.C2().h3().addView(U());
        LottieAnimationView lottieAnimationViewU = U();
        lottieAnimationViewU.setScaleType(ImageView.ScaleType.CENTER_CROP);
        lottieAnimationViewU.setVisibility(0);
        Context context = lottieAnimationViewU.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        yy0.f.e(jh.d.f(context).Q(), lottieImageV, lottieAnimationViewU, null, null, 12);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    @Override // h60.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S(java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "url"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            int r0 = r2.hashCode()
            switch(r0) {
                case -2127276156: goto L28;
                case -2098647005: goto L1f;
                case 198638570: goto L16;
                case 1108607757: goto Ld;
                default: goto Lc;
            }
        Lc:
            goto L30
        Ld:
            java.lang.String r0 = "https://assets.revolut.com/mobile/animations/core/tinted_confetti.json"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L36
            goto L30
        L16:
            java.lang.String r0 = "https://assets.revolut.com/mobile/animations/core/confetti.json"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L30
            goto L36
        L1f:
            java.lang.String r0 = "https://assets.revolut.com/mobile/animations/core/tinted_confetti_v3.json"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L36
            goto L30
        L28:
            java.lang.String r0 = "https://assets.revolut.com/mobile/animations/core/tinted_confetti_v2.json"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L36
        L30:
            h60.c r0 = new h60.c
            r0.<init>(r2)
            goto L38
        L36:
            h60.a r0 = h60.a.f149577a
        L38:
            r1.R(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h60.f.S(java.lang.String):void");
    }

    public final void T() {
        if (U().isAnimating()) {
            U().cancelAnimation();
        }
        if (U().getParent() != null) {
            this.f149580c.C2().h3().removeView(U());
        }
        this.d = false;
        this.e = null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final LottieAnimationView U() {
        return (LottieAnimationView) this.f.getValue();
    }

    @Override // yji.d
    public final void onDestroy() {
        long progress;
        b bVar = this.e;
        if (bVar != null ? bVar.a() : true) {
            T();
            return;
        }
        if (!U().isAnimating()) {
            T();
            return;
        }
        if (U().getRepeatCount() > 0) {
            progress = Long.MAX_VALUE;
        } else {
            progress = (long) ((1.0f - U().getProgress()) * U().getDuration());
        }
        if (progress <= 0 || progress >= f149579g) {
            T();
        }
    }
}
