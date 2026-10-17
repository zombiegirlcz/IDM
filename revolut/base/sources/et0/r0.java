package et0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.widget.ImageViewCompat;
import com.revolut.core.ui_kit.R$string;
import com.revolut.core.ui_kit.internal.drawables.RoundedBackgroundDrawable;
import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class r0 extends FrameLayout {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f129102n = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f129103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f129104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UIKitTextView f129105c;
    public final AppCompatImageView d;
    public final AppCompatImageView e;
    public final LinearLayout f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final fp0.p f129106g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final fp0.p f129107h;
    public final ihm.f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ihm.f f129108j;
    public gw0.s k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f129109l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final jq0.t f129110m;

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r0(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setState$default(r0 r0Var, gw0.s sVar, Function0 function0, int i, Object obj2) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        r0Var.setState(sVar, function0);
    }

    public final AppCompatImageView a(int i) {
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
        appCompatImageView.setImageResource(i);
        ImageViewCompat.setImageTintList(appCompatImageView, ColorStateList.valueOf(this.f129103a));
        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        int i2 = this.f129104b;
        appCompatImageView.setLayoutParams(new LinearLayout.LayoutParams(i2, i2));
        return appCompatImageView;
    }

    public final boolean getAnimate() {
        return this.f129109l;
    }

    public final void setAnimate(boolean z) {
        this.f129109l = z;
    }

    public final void setHeightListener(@NotNull Function1<? super Integer, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        jq0.t tVar = this.f129110m;
        tVar.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        tVar.d = listener;
    }

    public final void setState(gw0.s sVar, Function0<Unit> function0) {
        if (Intrinsics.f(this.k, sVar)) {
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        this.k = sVar;
        boolean z = sVar != null;
        if (z) {
            Clause clause = sVar.f147255a;
            boolean z3 = sVar.f147257c;
            boolean z4 = sVar.f147256b;
            kli.a.b(this.f129105c, clause, ty0.f.f275450a);
            this.f.setVisibility(sVar.d ? 0 : 8);
            float f = z4 ? 1.0f : 0.4f;
            AppCompatImageView appCompatImageView = this.d;
            appCompatImageView.setAlpha(f);
            appCompatImageView.setEnabled(z4);
            float f4 = z3 ? 1.0f : 0.4f;
            AppCompatImageView appCompatImageView2 = this.e;
            appCompatImageView2.setAlpha(f4);
            appCompatImageView2.setEnabled(z3);
            fp0.p pVar = this.f129106g;
            fp0.p.b(pVar, z4);
            View view = pVar.f137029a;
            or0.m.a(view);
            if (z4) {
                view.setOnClickListener(new s0(this, 0));
            } else {
                or0.u.o(view);
            }
            fp0.p pVar2 = this.f129107h;
            fp0.p.b(pVar2, z3);
            View view2 = pVar2.f137029a;
            or0.m.a(view2);
            if (z3) {
                view2.setOnClickListener(new s0(this, 1));
            } else {
                or0.u.o(view2);
            }
        }
        boolean z6 = this.f129109l;
        jq0.t tVar = this.f129110m;
        if (z6) {
            tVar.a(300L, function0, z);
        } else {
            tVar.a(0L, new q0(this, z, function0, 0), z);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r0(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        int iS = kli.a.s(R$attr.uikit_colorForeground, context);
        this.f129103a = iS;
        int iS2 = kli.a.s(R$attr.uikit_colorAccentNeutral, context);
        int iK = kli.a.k(context, 48.0f);
        int iK2 = kli.a.k(context, 12.0f);
        int iK3 = kli.a.k(context, 24.0f);
        this.f129104b = iK3;
        int iK4 = kli.a.k(context, 8.0f);
        int iK5 = kli.a.k(context, 20.0f);
        int iK6 = kli.a.k(context, 16.0f);
        int iK7 = kli.a.k(context, 8.0f);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setImageResource(R$drawable.uikit_icn_24_calendar_week);
        ImageViewCompat.setImageTintList(appCompatImageView, ColorStateList.valueOf(iS2));
        appCompatImageView.setImportantForAccessibility(2);
        UIKitTextView uIKitTextView = new UIKitTextView(context, null, 6, 0);
        jb3.l.e(uIKitTextView, R$attr.internal_textAppearanceBody2);
        uIKitTextView.setTextColor(iS2);
        uIKitTextView.setMaxLines(1);
        uIKitTextView.setEllipsize(TextUtils.TruncateAt.END);
        this.f129105c = uIKitTextView;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        int iD = io0.a.d(0.1f, iS);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        RoundedBackgroundDrawable roundedBackgroundDrawable = new RoundedBackgroundDrawable(context2, iD, true);
        roundedBackgroundDrawable.d(iS, iD);
        linearLayout.setBackground(roundedBackgroundDrawable);
        linearLayout.setMinimumWidth(iK);
        linearLayout.setClickable(true);
        linearLayout.setPaddingRelative(iK2, 0, iK2, 0);
        linearLayout.addView(appCompatImageView, new LinearLayout.LayoutParams(iK3, iK3));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart(iK4);
        Unit unit = Unit.f186387a;
        linearLayout.addView(uIKitTextView, layoutParams);
        AppCompatImageView appCompatImageViewA = a(R$drawable.uikit_icn_24_chevron_up);
        appCompatImageViewA.setContentDescription(context.getString(R$string.uikit_chat_search_previous_match_accessibility_label));
        pd.b.h(appCompatImageViewA, true);
        this.d = appCompatImageViewA;
        AppCompatImageView appCompatImageViewA2 = a(R$drawable.uikit_icn_24_chevron_down);
        appCompatImageViewA2.setContentDescription(context.getString(R$string.uikit_chat_search_next_match_accessibility_label));
        pd.b.h(appCompatImageViewA2, true);
        ViewGroup.LayoutParams layoutParams2 = appCompatImageViewA2.getLayoutParams();
        Intrinsics.i(layoutParams2, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        ((LinearLayout.LayoutParams) layoutParams2).setMarginStart(iK5);
        this.e = appCompatImageViewA2;
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        int iD2 = io0.a.d(0.1f, iS);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        RoundedBackgroundDrawable roundedBackgroundDrawable2 = new RoundedBackgroundDrawable(context3, iD2, true);
        roundedBackgroundDrawable2.d(iS, iD2);
        linearLayout2.setBackground(roundedBackgroundDrawable2);
        linearLayout2.setMinimumWidth(iK);
        linearLayout2.setClickable(true);
        linearLayout2.setPaddingRelative(iK2, 0, iK2, 0);
        linearLayout2.addView(appCompatImageViewA);
        linearLayout2.addView(appCompatImageViewA2);
        this.f = linearLayout2;
        fp0.p.Companion.getClass();
        gp0.b bVar = gp0.b.f145198a;
        this.f129106g = fp0.m.a(appCompatImageViewA, bVar);
        this.f129107h = fp0.m.a(appCompatImageViewA2, bVar);
        this.i = v0.a.d("create(...)");
        this.f129108j = v0.a.d("create(...)");
        this.f129110m = new jq0.t(this);
        setClickable(true);
        setPaddingRelative(iK6, iK7, iK6, iK7);
        setVisibility(8);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, iK);
        layoutParams3.gravity = 8388627;
        addView(linearLayout, layoutParams3);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, iK);
        layoutParams4.gravity = 8388629;
        addView(linearLayout2, layoutParams4);
    }

    public /* synthetic */ r0(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
