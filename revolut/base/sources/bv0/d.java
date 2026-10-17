package bv0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.transition.ChangeBounds;
import androidx.transition.Fade;
import aw0.v1;
import bp0.y;
import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import efm.r;
import foh.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import or0.u;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes19.dex */
public final class d extends ViewGroup implements c, ur0.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f18927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f18928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f18929c;
    public final ImageView d;
    public final int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f18930g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f18931h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f18932j;
    public bv0.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public v1 f18933l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f18934m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f18935n;
    public final boolean o;

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static int c(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        return view.getMeasuredWidth() + (marginLayoutParams != null ? marginLayoutParams.leftMargin : 0) + (marginLayoutParams != null ? marginLayoutParams.rightMargin : 0);
    }

    @Override // mx0.z4
    public final r a() {
        r rVarEmpty = r.empty();
        Intrinsics.checkNotNullExpressionValue(rVarEmpty, "empty(...)");
        return rVarEmpty;
    }

    public final void b() {
        boolean z;
        switch (e.f18936a[this.k.ordinal()]) {
            case 1:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                z = true;
                break;
            case 2:
            case 3:
                z = false;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        bv0.a aVar = this.k;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iM = c6d.b.m(aVar, context, this.f18933l);
        int i = z ? 0 : 8;
        TextView textView = this.f18927a;
        textView.setVisibility(i);
        int i2 = z ? 0 : 8;
        TextView textView2 = this.f18928b;
        textView2.setVisibility(i2);
        int i3 = z && this.f18934m ? 0 : 8;
        ImageView imageView = this.d;
        imageView.setVisibility(i3);
        this.f18929c.setVisibility(z && this.f18935n ? 0 : 8);
        textView.setTextColor(iM);
        textView2.setTextColor(iM);
        rd0.e.q(imageView, Integer.valueOf(iM));
    }

    public final void d() {
        boolean z = this.f18935n;
        int i = z ? this.f : this.f18934m ? this.i : this.f18931h;
        int i2 = (z && this.f18934m) ? this.f18930g : this.f18932j;
        if (getPaddingLeft() == i && getPaddingTop() == 0 && getPaddingRight() == i2 && getPaddingBottom() == 0) {
            return;
        }
        setPadding(i, 0, i2, 0);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(super.generateDefaultLayoutParams());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(super.generateLayoutParams(attributeSet));
    }

    @NotNull
    public final bv0.a getCurrentState() {
        return this.k;
    }

    public final Clause getLeftText$ui_kit_components_release() {
        return ((y) u.k(this).b0()).o(this.f18927a);
    }

    public final Clause getRightText$ui_kit_components_release() {
        return ((y) u.k(this).b0()).o(this.f18928b);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
        int paddingLeft;
        int i6 = i5 - i2;
        ImageView imageView = this.f18929c;
        if (imageView.getVisibility() == 0) {
            int i21 = i6 / 2;
            imageView.layout(getPaddingLeft(), i21 - (imageView.getMeasuredHeight() / 2), imageView.getMeasuredWidth() + getPaddingLeft(), (imageView.getMeasuredHeight() / 2) + i21);
            int right = imageView.getRight();
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            paddingLeft = right + (marginLayoutParams != null ? marginLayoutParams.rightMargin : 0);
        } else {
            paddingLeft = getPaddingLeft();
        }
        TextView textView = this.f18927a;
        if (textView.getVisibility() == 0) {
            textView.layout(paddingLeft, 0, textView.getMeasuredWidth() + paddingLeft, i6);
            paddingLeft += textView.getMeasuredWidth();
        }
        TextView textView2 = this.f18928b;
        if (textView2.getVisibility() == 0) {
            textView2.layout(paddingLeft, 0, textView2.getMeasuredWidth() + paddingLeft, i6);
            paddingLeft += textView2.getMeasuredWidth();
        }
        ImageView imageView2 = this.d;
        if (imageView2.getVisibility() == 0) {
            ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            int i22 = (marginLayoutParams2 != null ? marginLayoutParams2.leftMargin : 0) + paddingLeft;
            int i32 = i6 / 2;
            int measuredHeight = i32 - (imageView2.getMeasuredHeight() / 2);
            ViewGroup.LayoutParams layoutParams3 = imageView2.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
            imageView2.layout(i22, measuredHeight, imageView2.getMeasuredWidth() + paddingLeft + (marginLayoutParams3 != null ? marginLayoutParams3.leftMargin : 0), (imageView2.getMeasuredHeight() / 2) + i32);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE && mode != 1073741824) {
            size = Integer.MAX_VALUE;
        }
        ImageView imageView = this.d;
        imageView.measure(View.MeasureSpec.makeMeasureSpec(imageView.getLayoutParams().width, 1073741824), View.MeasureSpec.makeMeasureSpec(imageView.getLayoutParams().height, 1073741824));
        ImageView imageView2 = this.f18929c;
        imageView2.measure(View.MeasureSpec.makeMeasureSpec(imageView2.getLayoutParams().width, 1073741824), View.MeasureSpec.makeMeasureSpec(imageView2.getLayoutParams().height, 1073741824));
        int paddingRight = getPaddingRight() + getPaddingLeft();
        if (imageView.getVisibility() == 0) {
            paddingRight += c(imageView);
        }
        if (imageView2.getVisibility() == 0) {
            paddingRight += c(imageView2);
        }
        int i3 = size - paddingRight;
        TextView textView = this.f18928b;
        int visibility = textView.getVisibility();
        int i5 = this.e;
        if (visibility == 0) {
            textView.measure(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, 1073741824));
            paddingRight += textView.getMeasuredWidth();
        }
        TextView textView2 = this.f18927a;
        if (textView2.getVisibility() == 0) {
            textView2.measure(View.MeasureSpec.makeMeasureSpec(i3 - textView.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, 1073741824));
            paddingRight += textView2.getMeasuredWidth();
        }
        if (paddingRight <= getMinimumWidth()) {
            paddingRight = getMinimumWidth();
        }
        setMeasuredDimension(paddingRight, i5);
    }

    @Override // ur0.a
    public final void r(v1 colorScheme, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        this.f18933l = colorScheme;
        b();
    }

    @yhm.d
    public void setChevronVisible(boolean z) {
        if (this.f18934m != z) {
            this.f18934m = z;
            this.d.setVisibility(z ? 0 : 8);
            d();
        }
    }

    @yhm.d
    public void setLeftImage(Image image) {
        this.f18935n = image != null;
        ImageView imageView = this.f18929c;
        if (image != null) {
            imageView.setVisibility(0);
            yy0.f.e(u.k(this).Q(), image, this.f18929c, null, null, 12);
        } else {
            imageView.setVisibility(8);
        }
        d();
    }

    @Override // mx0.z4
    public void setModel(@NotNull b model) {
        Intrinsics.checkNotNullParameter(model, "model");
        setLeftImage(model.f18924a);
        setText(model.f18925b, null);
        setChevronVisible(model.f18926c);
        setState(model.d);
    }

    @yhm.d
    public void setState(@NotNull bv0.a state) {
        int iJ;
        Intrinsics.checkNotNullParameter(state, "state");
        if (this.k != state) {
            this.k = state;
            b();
            switch (e.f18936a[this.k.ordinal()]) {
                case 1:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    iJ = 0;
                    break;
                case 2:
                    iJ = i.j(80);
                    break;
                case 3:
                    iJ = i.j(SyslogConstants.LOG_CLOCK);
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            setMinimumWidth(iJ);
        }
    }

    @Override // bv0.c
    @yhm.d
    public void setText(Clause clause, Clause clause2) {
        TextView textView = this.f18928b;
        TextView textView2 = this.f18927a;
        boolean z = this.o;
        if (clause2 != null) {
            ty0.c.b(u.k(this).b0(), clause, this.f18927a, null, null, 12);
            textView2.setVisibility((clause == null || !z) ? 8 : 0);
            ty0.c.b(u.k(this).b0(), new CompositeClause(v.k(new DotDividerClause((Integer) null), clause2), null, null, null, 14), this.f18928b, null, null, 12);
            textView.setVisibility(z ? 0 : 8);
            return;
        }
        ty0.c.b(u.k(this).b0(), null, this.f18927a, null, null, 12);
        textView2.setVisibility(8);
        ty0.c.b(u.k(this).b0(), clause, this.f18928b, null, null, 12);
        if (clause != null && z) {
            i = 0;
        }
        textView.setVisibility(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        this.e = kli.a.k(context, 40.0f);
        this.f = kli.a.k(context, 8.0f);
        this.f18930g = kli.a.k(context, 8.0f);
        this.f18931h = kli.a.k(context, 12.0f);
        this.i = kli.a.k(context, 16.0f);
        this.f18932j = kli.a.k(context, 12.0f);
        this.k = bv0.a.ACTIVE_CONTEXTUAL_THEME;
        this.f18933l = v1.LIGHT;
        this.o = true;
        new Fade().setDuration(100L);
        new ChangeBounds().setDuration(200L);
        View.inflate(context, R$layout.internal_view_switcher_button, this);
        View viewFindViewById = findViewById(R$id.switcherButton_textLeft);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f18927a = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.switcherButton_textRight);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f18928b = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R$id.switcherButton_leftImage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById3;
        this.f18929c = imageView;
        View viewFindViewById4 = findViewById(R$id.switcherButton_chevron);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        ImageView imageView2 = (ImageView) viewFindViewById4;
        this.d = imageView2;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.rightMargin = kli.a.k(context, 8.0f);
        }
        ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        if (marginLayoutParams2 != null) {
            marginLayoutParams2.leftMargin = kli.a.k(context, 4.0f);
        }
        d();
        hx7.b.v(imageView2, "SwitcherButton.Chevron");
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p2) {
        Intrinsics.checkNotNullParameter(p2, "p");
        return new ViewGroup.MarginLayoutParams(super.generateLayoutParams(p2));
    }
}
