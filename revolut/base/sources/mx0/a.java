package mx0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.revolut.core.ui_kit.internal.views.CircleActionView;
import com.revolut.core.ui_kit.models.ProfileCardModel;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends LinearLayout {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f209559j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Function1 f209560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Function1 f209561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FrameLayout f209562c;
    public final CircleActionView d;
    public final View e;
    public final z6 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final fp0.p f209563g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ifm.c f209564h;
    public ProfileCardModel.CircleActionButtonModel i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f209564h = this.d.f56119a.subscribe(new mv9.h(12, new mqi.a(this, 22)));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        te0.w.p0(this.f209564h);
    }

    public final void setOnActionClickListener(Function1<? super ProfileCardModel.CircleActionButtonModel, Unit> function1) {
        this.f209560a = function1;
    }

    public final void setOnLabelClickListener(Function1<? super com.revolut.core.ui_kit.models.b0, Unit> function1) {
        this.f209561b = function1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        setOrientation(0);
        setGravity(16);
        setMinimumHeight(kli.a.k(context, 74.0f));
        CircleActionView circleActionView = new CircleActionView(context, null, 6, 0);
        circleActionView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        this.d = circleActionView;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        frameLayout.addView(circleActionView);
        this.f209562c = frameLayout;
        View view = new View(context);
        view.setLayoutParams(new LinearLayout.LayoutParams(kli.a.k(context, 1.0f), -1));
        view.setBackgroundColor(kli.a.s(R$attr.uikit_colorElevatedSearchBackground, context));
        this.e = view;
        z6 z6Var = new z6(context);
        z6Var.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        this.f = z6Var;
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        frameLayout2.addView(z6Var);
        fp0.p.Companion.getClass();
        this.f209563g = fp0.m.a(frameLayout2, gp0.b.f145198a);
        addView(frameLayout);
        addView(view);
        addView(frameLayout2);
    }

    public /* synthetic */ a(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
