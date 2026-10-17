package com.revolut.core.ui_kit.internal.views;

import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import au0.p2;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.SuggestionViewStyle;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import e8.q;
import fp0.p;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import or0.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 $2\u00020\u0001:\u0001%B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0018\u0010\u0016R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\"¨\u0006&"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/SuggestionView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/revolut/core/ui_kit/models/Clause;", "clause", "", "setText", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "image", "setIcon", "(Lcom/revolut/core/ui_kit_core/displayers/image/Image;)V", "", "applyColorFilterToIcon", "setApplyColorFilterToIcon", "(Z)V", "enabled", "setEnabled", "Landroid/widget/TextView;", "k", "Le8/q;", "getSuggestionText", "()Landroid/widget/TextView;", "suggestionText", "Landroid/widget/ImageView;", "l", "getSuggestionIcon", "()Landroid/widget/ImageView;", "suggestionIcon", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SuggestionView extends ConstraintLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ihm.f f56417b;
    public SuggestionViewStyle f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f56418g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f56419h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f56420j;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final q suggestionText;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final q suggestionIcon;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SuggestionView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final ImageView getSuggestionIcon() {
        return (ImageView) this.suggestionIcon.f();
    }

    private final TextView getSuggestionText() {
        return (TextView) this.suggestionText.f();
    }

    public final void f0() {
        float fB;
        if (this.f == null) {
            return;
        }
        if (isEnabled()) {
            fB = 1.0f;
        } else {
            SuggestionViewStyle suggestionViewStyle = this.f;
            if (suggestionViewStyle == null) {
                Intrinsics.r("style");
                throw null;
            }
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            fB = suggestionViewStyle.b(context);
        }
        getSuggestionText().setAlpha(fB);
        getSuggestionIcon().setAlpha(fB);
    }

    public final void g0(SuggestionViewStyle style) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.f = style;
        if (style != null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            SuggestionViewStyle suggestionViewStyle = this.f;
            if (suggestionViewStyle == null) {
                Intrinsics.r("style");
                throw null;
            }
            int iS = kli.a.s(suggestionViewStyle.f56422a, context);
            if (this.f56418g) {
                getSuggestionIcon().setColorFilter(iS, PorterDuff.Mode.SRC_IN);
            }
            getSuggestionText().setTextColor(iS);
            SuggestionViewStyle suggestionViewStyle2 = this.f;
            if (suggestionViewStyle2 == null) {
                Intrinsics.r("style");
                throw null;
            }
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            setBackground(suggestionViewStyle2.a(context2));
        }
        SuggestionViewStyle suggestionViewStyle3 = this.f;
        if (suggestionViewStyle3 != null) {
            jb3.l.e(getSuggestionText(), suggestionViewStyle3 instanceof SuggestionViewStyle.Transparent ? R$attr.internal_textAppearanceBody3 : R$attr.internal_textAppearanceEmphasis2);
        }
        if (this.f != null) {
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            SuggestionViewStyle suggestionViewStyle4 = this.f;
            if (suggestionViewStyle4 == null) {
                Intrinsics.r("style");
                throw null;
            }
            int iW = kli.a.w(suggestionViewStyle4.getF56427b(), context3);
            Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            SuggestionViewStyle suggestionViewStyle5 = this.f;
            if (suggestionViewStyle5 == null) {
                Intrinsics.r("style");
                throw null;
            }
            setPadding(iW, 0, kli.a.w(suggestionViewStyle5.getF56427b(), context4), 0);
        }
        f0();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.i;
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            int measuredWidth = getMeasuredWidth();
            int i5 = this.f56420j;
            if (measuredWidth < i5) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
            }
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Bundle bundle = parcelable instanceof Bundle ? (Bundle) parcelable : null;
        if (bundle == null) {
            return;
        }
        SuggestionViewStyle suggestionViewStyle = (SuggestionViewStyle) bundle.getParcelable("STATE_KEY_STYLE");
        if (suggestionViewStyle != null) {
            this.f = suggestionViewStyle;
        }
        this.f56419h = bundle.getBoolean("STATE_KEY_HIDDEN_ICON");
        super.onRestoreInstanceState(bundle.getParcelable("STATE_KEY_SUPER"));
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("STATE_KEY_SUPER", super.onSaveInstanceState());
        SuggestionViewStyle suggestionViewStyle = this.f;
        if (suggestionViewStyle != null) {
            if (suggestionViewStyle == null) {
                Intrinsics.r("style");
                throw null;
            }
            bundle.putParcelable("STATE_KEY_STYLE", suggestionViewStyle);
        }
        bundle.putBoolean("STATE_KEY_HIDDEN_ICON", this.f56419h);
        return bundle;
    }

    public final void setApplyColorFilterToIcon(boolean applyColorFilterToIcon) {
        this.f56418g = applyColorFilterToIcon;
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        if (isEnabled() == enabled) {
            return;
        }
        super.setEnabled(enabled);
        f0();
        getSuggestionText().setEnabled(enabled);
        getSuggestionIcon().setEnabled(enabled);
    }

    public final void setIcon(Image image) {
        if (image == null) {
            getSuggestionIcon().setImageDrawable(null);
            getSuggestionIcon().setVisibility(8);
            this.f56419h = true;
        } else {
            getSuggestionIcon().setVisibility(0);
            this.f56419h = false;
            yy0.f.e(u.k(this).Q(), image, getSuggestionIcon(), null, null, 12);
        }
    }

    public final void setText(@NotNull Clause clause) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        ty0.c.b(u.k(this).b0(), clause, getSuggestionText(), null, null, 12);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SuggestionView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuggestionView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f56417b = v0.a.d("create(...)");
        fp0.m mVar = p.Companion;
        gp0.g gVar = new gp0.g(0);
        mVar.getClass();
        p pVarA = fp0.m.a(this, gVar);
        this.suggestionText = kli.a.J(R$id.suggestionText, this);
        this.suggestionIcon = kli.a.J(R$id.suggestionIcon, this);
        View.inflate(context, R$layout.internal_view_suggestion, this);
        this.i = kli.a.k(context, 30.0f);
        this.f56420j = kli.a.k(context, 40.0f);
        setClipToPadding(false);
        setClickable(true);
        setFocusable(true);
        p.b(pVarA, true);
        View view = pVarA.f137029a;
        or0.m.a(view);
        view.setOnClickListener(new p2(this, 5));
    }

    public /* synthetic */ SuggestionView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
