package mx0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.views.AvatarView;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class m4 extends FrameLayout {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e8.q f209825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e8.q f209826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e8.q f209827c;
    public final e8.q d;
    public final e8.q e;
    public final e8.q f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e8.q f209828g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AvatarView f209829h;
    public gw0.q i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f209830j;
    public final jq0.t k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f209831l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public n4 f209832m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Function0 f209833n;

    public static final class a {
        private a() {
        }

        public static RippleDrawable a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(kli.a.s(R$attr.uikit_colorGreyTone10, context));
            GradientDrawable gradientDrawableK = ip0.v7.k(0);
            gradientDrawableK.setColor(kli.a.s(R$attr.uikit_colorGreyTone5, context));
            gradientDrawableK.setCornerRadius(kli.a.k(context, 16.0f));
            return new RippleDrawable(colorStateListValueOf, gradientDrawableK, null);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m4(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final ImageView getCloseButton() {
        return (ImageView) this.f.f();
    }

    private final ShapeableImageView getImageEndView() {
        return (ShapeableImageView) this.f209826b.f();
    }

    private final TextView getPrimaryTextView() {
        return (TextView) this.f209827c.f();
    }

    private final ConstraintLayout getRootContainerView() {
        return (ConstraintLayout) this.f209828g.f();
    }

    private final TextView getSecondaryTextView() {
        return (TextView) this.d.f();
    }

    private final View getSeparatorView() {
        return this.f209825a.f();
    }

    private final TextView getValueTextView() {
        return (TextView) this.e.f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setContent$default(m4 m4Var, gw0.q qVar, Function0 function0, int i, Object obj2) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        m4Var.setContent(qVar, function0);
    }

    public static /* synthetic */ void setDeferredUpdatesMode$ui_kit_components_release$default(m4 m4Var, boolean z, long j2, int i, Object obj2) {
        if ((i & 2) != 0) {
            j2 = 200;
        }
        m4Var.setDeferredUpdatesMode$ui_kit_components_release(z, j2);
    }

    private final void setStyleBody2Foreground(TextView textView) {
        jb3.l.e(textView, R$attr.internal_textAppearanceBody2);
        Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        textView.setTextColor(kli.a.s(R$attr.uikit_colorForeground, context));
    }

    private final void setStyleEmphasis2GreyTone50(TextView textView) {
        jb3.l.e(textView, R$attr.internal_textAppearanceEmphasis2);
        Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        textView.setTextColor(kli.a.s(R$attr.uikit_colorGreyTone50, context));
    }

    public final void a(gw0.q qVar, long j2, Function0 function0) {
        if (Intrinsics.f(this.i, qVar)) {
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        gw0.q qVar2 = this.i;
        this.i = qVar;
        boolean z = qVar != null;
        boolean z3 = this.f209830j;
        jq0.t tVar = this.k;
        if (!z3) {
            c(qVar2, qVar);
            tVar.a(0L, new et0.q0(this, z, function0, 3), z);
        } else {
            if (z) {
                c(qVar2, qVar);
            }
            tVar.a(j2, function0, z);
        }
    }

    public final void b(View view) {
        TextView secondaryTextView = getSecondaryTextView();
        ViewGroup.LayoutParams layoutParams = secondaryTextView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        if (getPrimaryTextView().getVisibility() == 0) {
            layoutParams2.topToBottom = getPrimaryTextView().getId();
            layoutParams2.topToTop = -1;
        } else {
            layoutParams2.topToTop = 0;
            layoutParams2.topToBottom = -1;
        }
        layoutParams2.endToStart = view.getId();
        secondaryTextView.setLayoutParams(layoutParams2);
        TextView valueTextView = getValueTextView();
        ViewGroup.LayoutParams layoutParams3 = valueTextView.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
        layoutParams4.endToStart = view.getId();
        valueTextView.setLayoutParams(layoutParams4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c1  */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v0, types: [android.view.View, android.view.ViewGroup, mx0.m4] */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.util.AttributeSet] */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.widget.ImageView] */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r7v4, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(gw0.q r12, gw0.q r13) {
        /*
            Method dump skipped, instruction units count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mx0.m4.c(gw0.q, gw0.q):void");
    }

    public final boolean getAnimate() {
        return this.f209830j;
    }

    public final void setAnimate(boolean z) {
        this.f209830j = z;
    }

    public final void setCompensationTranslationY(float f) {
        jq0.t tVar = this.k;
        tVar.f177403g = f;
        tVar.d();
    }

    public final void setContent(gw0.q qVar, Function0<Unit> function0) {
        if (this.f209831l) {
            this.f209832m = new n4(qVar, function0);
        } else {
            a(qVar, 300L, function0);
        }
    }

    public final void setDeferredUpdatesMode$ui_kit_components_release(boolean z, long j2) {
        n4 n4Var;
        if (z == this.f209831l) {
            return;
        }
        this.f209831l = z;
        if (z || (n4Var = this.f209832m) == null) {
            return;
        }
        this.f209832m = null;
        a(n4Var.f209853a, j2, n4Var.f209854b);
    }

    public final void setHeightListener(@NotNull Function1<? super Integer, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        jq0.t tVar = this.k;
        tVar.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        tVar.d = listener;
    }

    public final void setOnCloseClickListener(Function0<Unit> function0) {
        this.f209833n = function0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m4(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f209825a = kli.a.J(R$id.replyToView_separator, this);
        this.f209826b = kli.a.J(R$id.replyToView_imageEnd, this);
        this.f209827c = kli.a.J(R$id.replyToView_primaryText, this);
        this.d = kli.a.J(R$id.replyToView_secondaryText, this);
        this.e = kli.a.J(R$id.replyToView_valueText, this);
        this.f = kli.a.J(R$id.replyToView_closeButton, this);
        this.f209828g = kli.a.J(R$id.replyToView_root, this);
        this.k = new jq0.t(this);
        View.inflate(context, R$layout.internal_view_chat_reply_to_layout, this);
        setClickable(true);
        setFocusable(true);
        getCloseButton().setOnClickListener(new ip0.g0(this, 25));
        View separatorView = getSeparatorView();
        GradientDrawable gradientDrawableK = ip0.v7.k(0);
        gradientDrawableK.setColor(kli.a.s(R$attr.uikit_colorGreyTone50, context));
        gradientDrawableK.setCornerRadius(kli.a.k(context, 16.0f));
        separatorView.setBackground(gradientDrawableK);
        getImageEndView().setShapeAppearanceModel(new ShapeAppearanceModel().withCornerSize(kli.a.k(context, 8.0f)));
        setVisibility(8);
    }

    public /* synthetic */ m4(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
