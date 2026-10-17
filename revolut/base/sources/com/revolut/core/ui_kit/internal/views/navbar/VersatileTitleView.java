package com.revolut.core.ui_kit.internal.views.navbar;

import a5g.i;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.TextViewCompat;
import au0.i5;
import au0.j5;
import au0.k5;
import aw0.i3;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.ImageClauseTint;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import jb3.l;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import or0.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0003\u0018\u0019\u001aB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0011J\u0017\u0010\u0016\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/navbar/VersatileTitleView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/revolut/core/ui_kit/internal/views/navbar/VersatileTitleView$a;", "layoutType", "", "setLayoutType", "(Lcom/revolut/core/ui_kit/internal/views/navbar/VersatileTitleView$a;)V", "gravity", "setGravity", "(I)V", "color", "setTextColor", "Law0/i3;", "customFont", "setCustomFont", "(Law0/i3;)V", "a", "au0/i5", "au0/j5", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class VersatileTitleView extends FrameLayout {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f57360l = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f57361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i5 f57362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AppCompatTextView f57363c;
    public j5 d;
    public int e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public i3 f57364g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f57365h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f57366j;
    public final int k;

    public static abstract class a {
        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VersatileTitleView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a(Function1 function1) {
        AppCompatTextView appCompatTextView = this.f57363c;
        if (appCompatTextView != null) {
            function1.invoke(appCompatTextView);
        }
        j5 j5Var = this.d;
        if (j5Var != null) {
            function1.invoke(j5Var.f9242a);
        }
        j5 j5Var2 = this.d;
        if (j5Var2 != null) {
            function1.invoke(j5Var2.f9244c);
        }
    }

    public final AppCompatTextView b(int i, int i2, Clause clause) {
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        appCompatTextView.setLayoutParams(new FrameLayout.LayoutParams(i, -2));
        appCompatTextView.setTextColor(this.f);
        appCompatTextView.setIncludeFontPadding(false);
        l.e(appCompatTextView, this.e);
        appCompatTextView.setGravity(this.f57365h);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        appCompatTextView.setMaxLines(i2);
        ty0.c.b(u.k(appCompatTextView).b0(), clause, appCompatTextView, null, null, 12);
        g4i.a.j(appCompatTextView).a(this.f57364g);
        addView(appCompatTextView);
        return appCompatTextView;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
        a aVar = this.f57361a;
        if (aVar instanceof h) {
            super.onLayout(z, i, i2, i3, i5);
            return;
        }
        if (!(aVar instanceof e)) {
            if (aVar instanceof f) {
                super.onLayout(z, i, i2, i3, i5);
                return;
            } else {
                if (aVar != null) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
        }
        j5 j5Var = this.d;
        if (j5Var != null) {
            AppCompatTextView appCompatTextView = j5Var.f9242a;
            AppCompatTextView appCompatTextView2 = j5Var.f9243b;
            AppCompatTextView appCompatTextView3 = j5Var.f9244c;
            i5 i5Var = this.f57362b;
            int i6 = i5Var == null ? -1 : k5.f9255a[i5Var.ordinal()];
            if (i6 != -1) {
                if (i6 == 1) {
                    int iMax = (Math.max(appCompatTextView2.getMeasuredHeight(), appCompatTextView.getMeasuredHeight()) - appCompatTextView2.getMeasuredHeight()) / 2;
                    Rect rect = rr0.c.f256608a;
                    rr0.c.a(appCompatTextView, this, this, 1280, 0, getPaddingStart(), getPaddingTop(), 0, 0, 408);
                    rr0.c.a(appCompatTextView2, appCompatTextView, this, 1026, 0, this.f57366j, getPaddingTop() + iMax, 0, 0, 408);
                    rr0.c.a(appCompatTextView3, appCompatTextView2, this, 1026, 0, this.f57366j, getPaddingTop(), getPaddingEnd(), 0, 280);
                    return;
                }
                if (i6 == 2) {
                    int iMax2 = (Math.max(appCompatTextView2.getMeasuredHeight(), appCompatTextView.getMeasuredHeight()) - appCompatTextView2.getMeasuredHeight()) / 2;
                    Rect rect2 = rr0.c.f256608a;
                    rr0.c.a(appCompatTextView, this, this, 1280, 0, getPaddingStart(), getPaddingTop(), 0, 0, 408);
                    rr0.c.a(appCompatTextView2, appCompatTextView, this, 1026, 0, this.f57366j, getPaddingTop() + iMax2, getPaddingEnd(), 0, 280);
                    rr0.c.a(appCompatTextView3, this, appCompatTextView, 288, 0, getPaddingStart(), this.k, getPaddingEnd(), 0, 280);
                    return;
                }
                if (i6 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                int iMax3 = (Math.max(appCompatTextView2.getMeasuredHeight(), appCompatTextView3.getMeasuredHeight()) - appCompatTextView2.getMeasuredHeight()) / 2;
                Rect rect3 = rr0.c.f256608a;
                rr0.c.a(appCompatTextView, this, this, 1280, 0, getPaddingStart(), getPaddingTop(), getPaddingEnd(), 0, 280);
                rr0.c.a(appCompatTextView2, this, appCompatTextView, 288, 0, getPaddingStart(), this.k + iMax3, 0, 0, 408);
                rr0.c.a(appCompatTextView3, appCompatTextView2, appCompatTextView, 34, 0, this.f57366j, this.k, getPaddingEnd(), 0, 280);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int paddingBottom;
        a aVar = this.f57361a;
        if (aVar instanceof h) {
            super.onMeasure(i, i2);
            return;
        }
        if (!(aVar instanceof e)) {
            if (aVar instanceof f) {
                super.onMeasure(i, i2);
                return;
            } else {
                if (aVar != null) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
        }
        j5 j5Var = this.d;
        if (j5Var != null) {
            AppCompatTextView appCompatTextView = j5Var.f9242a;
            AppCompatTextView appCompatTextView2 = j5Var.f9243b;
            AppCompatTextView appCompatTextView3 = j5Var.f9244c;
            int iMakeMeasureSpec = View.MeasureSpec.getMode(i2) == 0 ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), Integer.MIN_VALUE);
            measureChild(appCompatTextView, i, iMakeMeasureSpec);
            measureChild(appCompatTextView2, i, iMakeMeasureSpec);
            measureChild(appCompatTextView3, i, iMakeMeasureSpec);
            int size = View.MeasureSpec.getSize(i);
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int measuredWidth = appCompatTextView.getMeasuredWidth();
            int i3 = this.f57366j;
            int measuredWidth2 = appCompatTextView2.getMeasuredWidth() + measuredWidth + i3;
            if (appCompatTextView3.getMeasuredWidth() + measuredWidth2 + i3 <= paddingLeft) {
                paddingBottom = getPaddingBottom() + getPaddingTop() + Math.max(appCompatTextView.getMeasuredHeight(), Math.max(appCompatTextView2.getMeasuredHeight(), appCompatTextView3.getMeasuredHeight()));
                this.f57362b = i5.ONE_LINE;
            } else {
                int i5 = this.k;
                if (measuredWidth2 <= paddingLeft) {
                    paddingBottom = getPaddingBottom() + getPaddingTop() + appCompatTextView3.getMeasuredHeight() + Math.max(appCompatTextView.getMeasuredHeight(), appCompatTextView2.getMeasuredHeight()) + i5;
                    this.f57362b = i5.TWO_LINES_ICON_IN_FIRST_LINE;
                } else {
                    int paddingTop = getPaddingTop() + Math.max(appCompatTextView2.getMeasuredHeight(), appCompatTextView3.getMeasuredHeight()) + appCompatTextView.getMeasuredHeight() + i5 + getPaddingBottom();
                    measureChild(appCompatTextView3, View.MeasureSpec.makeMeasureSpec((size - i3) - appCompatTextView2.getMeasuredWidth(), Integer.MIN_VALUE), i2);
                    this.f57362b = i5.TWO_LINES_ICON_IN_SECOND_LINE;
                    paddingBottom = paddingTop;
                }
            }
            setMeasuredDimension(View.resolveSize(size, i), View.resolveSize(paddingBottom, i2));
        }
    }

    public final void setCustomFont(i3 customFont) {
        this.f57364g = customFont;
        a(new ar1.c(customFont, 15));
    }

    public final void setGravity(int gravity) {
        this.f57365h = gravity;
        a(new i(gravity, 4));
    }

    public final void setLayoutType(@NotNull a layoutType) {
        Intrinsics.checkNotNullParameter(layoutType, "layoutType");
        if (Intrinsics.f(this.f57361a, layoutType)) {
            return;
        }
        this.f57361a = layoutType;
        removeAllViews();
        this.f57363c = null;
        this.d = null;
        a aVar = this.f57361a;
        if (aVar instanceof h) {
            h hVar = (h) aVar;
            boolean z = hVar.f57414b;
            AppCompatTextView appCompatTextViewB = b(-1, z ? 1 : 3, hVar.f57413a);
            TextViewCompat.setAutoSizeTextTypeWithDefaults(appCompatTextViewB, z ? 1 : 0);
            appCompatTextViewB.setBreakStrategy(!z ? 1 : 0);
            this.f57363c = appCompatTextViewB;
        } else if (aVar instanceof e) {
            e eVar = (e) aVar;
            AppCompatTextView appCompatTextViewB2 = b(-2, 1, eVar.f57407a);
            ImageClause imageClause = eVar.f57408b;
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            appCompatTextView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            ty0.c.b(u.k(appCompatTextView).b0(), imageClause, appCompatTextView, null, null, 12);
            if (Intrinsics.f(imageClause.f57786b, ImageClauseTint.TextColor.f57790a)) {
                this.i = true;
                appCompatTextView.setTextColor(this.f);
            }
            addView(appCompatTextView);
            this.d = new j5(appCompatTextViewB2, appCompatTextView, b(-2, 1, eVar.f57409c));
        } else if (aVar instanceof f) {
            f fVar = (f) aVar;
            Image image = fVar.f57410a;
            float f = fVar.f57411b;
            float f4 = fVar.f57412c;
            AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
            Context context = appCompatImageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int iK = kli.a.k(context, f);
            Context context2 = appCompatImageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iK, kli.a.k(context2, f4));
            Context context3 = appCompatImageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            int iW = kli.a.w(R$attr.uikit_dp8, context3);
            layoutParams.setMargins(iW, iW, iW, iW);
            appCompatImageView.setLayoutParams(layoutParams);
            yy0.f.e(u.k(appCompatImageView).Q(), image, appCompatImageView, null, null, 12);
            addView(appCompatImageView);
        } else if (aVar != null) {
            throw new NoWhenBranchMatchedException();
        }
        requestLayout();
    }

    public final void setTextColor(int color) {
        j5 j5Var;
        this.f = color;
        a(new i(color, 6));
        if (!this.i || (j5Var = this.d) == null) {
            return;
        }
        j5Var.f9243b.setTextColor(this.f);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VersatileTitleView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VersatileTitleView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.e = R$attr.internal_textAppearanceHeading1;
        this.f = kli.a.s(R$attr.uikit_colorWhite, context);
        this.f57365h = 8388611;
        int iK = kli.a.k(context, 8.0f);
        this.f57366j = iK;
        this.k = iK;
    }

    public /* synthetic */ VersatileTitleView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
