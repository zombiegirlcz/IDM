package mx0;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class xb extends LinearLayout implements ny0.h {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f210112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AppCompatTextView f210113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AppCompatImageView f210114c;
    public final ViewStub d;
    public LottieAnimationView e;
    public Integer f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Integer f210115g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final androidx.view.d f210116h;

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public xb(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a() {
        Window window;
        View decorView;
        Integer num;
        setVisibility(8);
        Context context = getContext();
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null) {
            Window window2 = activity.getWindow();
            Integer num2 = this.f;
            if (num2 != null) {
                window2.setStatusBarColor(num2.intValue());
            }
        }
        Context context2 = getContext();
        Activity activity2 = context2 instanceof Activity ? (Activity) context2 : null;
        if (activity2 != null && (window = activity2.getWindow()) != null && (decorView = window.getDecorView()) != null && (num = this.f210115g) != null) {
            decorView.setSystemUiVisibility(num.intValue());
        }
        clearAnimation();
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f210116h);
        }
    }

    public final void b() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.0f, 1.0f, BitmapDescriptorFactory.HUE_RED);
        scaleAnimation.setInterpolator(new AccelerateInterpolator());
        scaleAnimation.setDuration(200L);
        scaleAnimation.setAnimationListener(new xv0.a(null, new a7(this, 6), 5));
        startAnimation(scaleAnimation);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004e  */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(mx0.zb r21) {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mx0.xb.c(mx0.zb):void");
    }

    @Override // ny0.h
    /* JADX INFO: renamed from: getFitsReadableArea */
    public boolean getF51506a() {
        return false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public xb(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f210116h = new androidx.view.d(this, 20);
        View.inflate(context, R$layout.internal_view_status_bar_banner, this);
        setVisibility(8);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setOrientation(1);
        View viewFindViewById = findViewById(R$id.statusBarBanner_container);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ConstraintLayout constraintLayout = (ConstraintLayout) viewFindViewById;
        this.f210112a = constraintLayout;
        View viewFindViewById2 = findViewById(R$id.statusBarBanner_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f210113b = (AppCompatTextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R$id.statusBarBanner_icon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f210114c = (AppCompatImageView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R$id.statusBarBanner_animationStub);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.d = (ViewStub) viewFindViewById4;
        knm.b.y(kli.a.o(context), constraintLayout);
    }

    public /* synthetic */ xb(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
