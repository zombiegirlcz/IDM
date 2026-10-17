package ov0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.chat.ChatBubbleAppearance;
import com.revolut.core.ui_kit.internal.views.chat.ChatBubbleStyle;
import com.revolut.core.ui_kit.internal.views.chat.ChatBubbleTitleStyle;
import com.revolut.core.ui_kit.internal.views.chat.ChatBubbleView;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;
import org.jetbrains.annotations.NotNull;
import rr0.i;
import xo0.g;

/* JADX INFO: loaded from: classes19.dex */
public final class a extends ConstraintLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f229933b;
    public final ChatBubbleView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f229934g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ImageView f229935h;
    public View i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f229936j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f229937l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f229938m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f229939n;
    public final int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f229940p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f229941q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final RectF f229942r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Paint f229943s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f229944t;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSetPressed(boolean z) {
        if (z) {
            return;
        }
        super.dispatchSetPressed(false);
    }

    @NotNull
    public final ChatBubbleView getBubbleView$ui_kit_components_release() {
        return this.f;
    }

    @NotNull
    public final ImageView getIconView$ui_kit_components_release() {
        return this.f229935h;
    }

    @NotNull
    public final TextView getSuggestionView$ui_kit_components_release() {
        return this.f229934g;
    }

    @NotNull
    public final TextView getTitleView$ui_kit_components_release() {
        return this.f229933b;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        float f = this.f229941q;
        canvas.drawRoundRect(this.f229942r, f, f, this.f229943s);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
        super.onLayout(z, i, i2, i3, i5);
        View view = this.f;
        if (view.getVisibility() != 0) {
            view = this.f229933b;
        }
        int bottom = view.getBottom() + this.o;
        int height = getHeight() - this.f229940p;
        int i6 = height - bottom;
        double d = i6;
        int i21 = this.f229939n;
        double d5 = ((double) i21) * 1.4d;
        ImageView imageView = this.f229935h;
        TextView textView = this.f229934g;
        if (d < d5) {
            if (i21 < i6) {
                int i22 = i6 - i21;
                i6 -= i22;
                bottom += i22;
            }
            textView.offsetTopAndBottom(((i6 - textView.getHeight()) / 2) + bottom);
            imageView.offsetTopAndBottom(((i6 - imageView.getHeight()) / 2) + bottom);
            this.f229941q = i6 / 2.0f;
        } else {
            textView.offsetTopAndBottom(this.f229937l + bottom);
            imageView.offsetTopAndBottom((height - imageView.getHeight()) - this.k);
            this.f229941q = this.f229938m;
        }
        int i32 = this.f229936j;
        this.f229942r.set(i32, bottom, getWidth() - i32, height);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int iC = i.c(i2, getLayoutParams().height, Integer.MAX_VALUE);
        if (iC != this.f229944t) {
            this.f229944t = iC;
            int iG = 3;
            ChatBubbleView chatBubbleView = this.f;
            if (iC > 0) {
                int descriptionLineHeight = chatBubbleView.getDescriptionLineHeight();
                TextView textView = this.f229933b;
                int lineHeight = textView.getLineHeight();
                ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                int i3 = lineHeight + (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0);
                ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                int i5 = iC - (i3 + (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0));
                ViewGroup.LayoutParams layoutParams3 = chatBubbleView.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                int i6 = marginLayoutParams3 != null ? marginLayoutParams3.topMargin : 0;
                ViewGroup.LayoutParams layoutParams4 = chatBubbleView.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                iG = f.g(((i5 - ((this.f229936j * 2) + (i6 + (marginLayoutParams4 != null ? marginLayoutParams4.bottomMargin : 0)))) - ((this.o + this.f229940p) + this.f229939n)) / descriptionLineHeight, 1, 3);
            }
            chatBubbleView.setDescriptionMaxLines(iG);
        }
        super.onMeasure(i, i2);
    }

    public final void setNotificationDot(boolean z) {
        if (z || this.i != null) {
            View view = this.i;
            if (view == null) {
                view = new View(getContext());
                GradientDrawable gradientDrawableK = v7.k(1);
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                gradientDrawableK.setColor(kli.a.s(R$attr.uikit_colorRed, context));
                view.setBackground(gradientDrawableK);
                Context context2 = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                int iK = kli.a.k(context2, 5.0f);
                int id10 = this.f229933b.getId();
                ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(iK, iK);
                Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                layoutParams.setMarginStart(kli.a.k(context3, 6.0f));
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = iK / 2;
                layoutParams.startToEnd = id10;
                layoutParams.topToTop = id10;
                addView(view, layoutParams);
                this.i = view;
            }
            view.setVisibility(z ? 0 : 4);
        }
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
        View.inflate(context, R$layout.internal_view_widget_input, this);
        View viewFindViewById = findViewById(R$id.inputWidgetView_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f229933b = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.inputWidgetView_chatBubbleView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        ChatBubbleView chatBubbleView = (ChatBubbleView) viewFindViewById2;
        this.f = chatBubbleView;
        View viewFindViewById3 = findViewById(R$id.inputWidgetView_suggestionView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById3;
        this.f229934g = textView;
        View viewFindViewById4 = findViewById(R$id.inputWidgetView_inputIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f229935h = (ImageView) viewFindViewById4;
        int iK = kli.a.k(context, 8.0f);
        this.f229936j = iK;
        int iK2 = kli.a.k(context, 12.0f);
        this.k = iK2;
        this.f229937l = kli.a.k(context, 10.0f);
        float fK = kli.a.k(context, 16.0f);
        this.f229938m = fK;
        this.f229939n = (iK * 2) + textView.getLineHeight();
        this.o = iK2;
        this.f229940p = iK;
        this.f229941q = fK;
        this.f229942r = new RectF();
        Paint paint = new Paint(1);
        paint.setColor(kli.a.s(R$attr.uikit_colorSearchBackground, context));
        this.f229943s = paint;
        this.f229944t = Integer.MIN_VALUE;
        setWillNotDraw(false);
        chatBubbleView.h0(new ChatBubbleAppearance(ChatBubbleStyle.Search.f56810a, ChatBubbleTitleStyle.Foreground.f56816a, g.INCOMING_TAIL));
        chatBubbleView.setClickable(false);
        chatBubbleView.setFocusable(false);
        chatBubbleView.setTitle(null);
        chatBubbleView.setInternalWidthConstraints(true);
        chatBubbleView.setDescriptionTextAppearance(R$attr.internal_textAppearanceBody2);
    }

    public /* synthetic */ a(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
