package com.revolut.ui_kit.payments.send_message_transition;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate;
import com.revolut.core.ui_kit.views.ChatInputView;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.kompot.view.ControllerContainerFrameLayout;
import com.revolut.ui_kit.payments.send_message_transition.SendingMessageAnimationContainerLayout;
import cyl.c;
import cyl.d;
import koi.b;
import koi.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.m0;
import org.jetbrains.annotations.NotNull;
import xo0.g;
import xo0.l;
import xo0.m;
import z9h.n;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\n\u000bB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/revolut/ui_kit/payments/send_message_transition/SendingMessageAnimationContainerLayout;", "Lcom/revolut/kompot/view/ControllerContainerFrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "cyl/c", "a", "ui_kit_payments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SendingMessageAnimationContainerLayout extends ControllerContainerFrameLayout {
    public static final /* synthetic */ int i = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f107118c;
    public final int d;
    public final int e;
    public final m f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f107119g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c f107120h;

    public static final class a implements TimeInterpolator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f107121a = new a();

        private a() {
        }

        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            return (f * 0.5f) + 0.5f;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SendingMessageAnimationContainerLayout(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a(RecyclerView.ViewHolder textMessageHolder, ChatInputView inputView) {
        CharSequence text;
        TextPaint paint;
        Intrinsics.checkNotNullParameter(textMessageHolder, "textMessageHolder");
        Intrinsics.checkNotNullParameter(inputView, "inputView");
        b bVar = textMessageHolder instanceof b ? (b) textMessageHolder : null;
        if (bVar == null) {
            return;
        }
        j jVar = bVar.e;
        ChatBubbleDelegate.Model model = jVar instanceof ChatBubbleDelegate.Model ? (ChatBubbleDelegate.Model) jVar : null;
        if (model == null) {
            return;
        }
        View itemView = textMessageHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        View viewFindViewById = inputView.findViewById(R$id.chatInputView_inputContainer);
        final View viewFindViewById2 = itemView.findViewById(R$id.chatBubbleDelegate_bubbleView);
        TextView textView = (TextView) viewFindViewById2.findViewById(R$id.chatBubble_description);
        View viewFindViewById3 = viewFindViewById2.findViewById(R$id.chatBubble_bottomViewsContainer);
        TextView textView2 = (TextView) viewFindViewById2.findViewById(R$id.chatBubble_timestamp);
        g gVarB = xo0.j.b(model.f53831x);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        l shape = xo0.j.a(gVarB, context);
        m mVar = this.f;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(shape, "shape");
        mVar.f = shape;
        mVar.f307564j = true;
        final float width = viewFindViewById.getWidth();
        final float height = viewFindViewById.getHeight();
        final float width2 = viewFindViewById2.getWidth();
        final float height2 = viewFindViewById2.getHeight();
        int[] iArr = new int[2];
        viewFindViewById.getLocationInWindow(iArr);
        final float f = iArr[1];
        final int[] iArr2 = new int[2];
        final TextPaint textPaint = new TextPaint();
        if (textView2 != null && (paint = textView2.getPaint()) != null) {
            textPaint.set(paint);
        }
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        textPaint.setColor(kli.a.s(R$attr.uikit_colorGrey50, context2));
        TextPaint textPaint2 = new TextPaint();
        textPaint2.set(textView.getPaint());
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        textPaint2.setColor(kli.a.s(R$attr.uikit_colorForeground, context3));
        final StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(textView.getText(), 0, textView.getText().length(), textPaint2, textView.getWidth()).build();
        Intrinsics.checkNotNullExpressionValue(staticLayoutBuild, "build(...)");
        final Rect rect = new Rect();
        String string = (textView2 == null || (text = textView2.getText()) == null) ? null : text.toString();
        if (string == null) {
            string = "";
        }
        final String str = string;
        final float x3 = textView.getX();
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        final float f4 = marginLayoutParams != null ? marginLayoutParams.topMargin : 0;
        final float x5 = viewFindViewById3.getX();
        final float height3 = viewFindViewById2.getHeight() - this.f107119g;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.addListener(new d(this, itemView, 1));
        animatorSet.addListener(new d(this, itemView, 0));
        final m0 m0Var = new m0();
        final m0 m0Var2 = new m0();
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        valueAnimatorOfFloat.setDuration(120L);
        valueAnimatorOfFloat.setInterpolator(a.f107121a);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: cyl.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i2 = SendingMessageAnimationContainerLayout.i;
                float fFloatValue = ((Float) n.g(valueAnimator, "animator", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                float f5 = 1 - fFloatValue;
                m0Var.f186427a = (width2 * fFloatValue) + (width * f5);
                m0Var2.f186427a = (height2 * fFloatValue) + (f5 * height);
                ref$IntRef.f186408a = (int) (fFloatValue * this.e);
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        valueAnimatorOfFloat2.setDuration(150L);
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: cyl.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i2 = SendingMessageAnimationContainerLayout.i;
                float fFloatValue = ((Float) n.g(valueAnimator, "animator", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                View view = viewFindViewById2;
                int[] iArr3 = iArr2;
                view.getLocationInWindow(iArr3);
                float f5 = iArr3[0];
                float f6 = iArr3[1];
                float f32 = f5 + width2;
                m0 m0Var3 = m0Var;
                float f35 = m0Var3.f186427a;
                int i3 = (int) (f32 - f35);
                int i5 = (int) ((f6 * fFloatValue) + ((1 - fFloatValue) * f));
                int i6 = ((int) f35) + i3;
                m0 m0Var4 = m0Var2;
                int i21 = ((int) m0Var4.f186427a) + i5;
                Rect rect2 = rect;
                rect2.set(i3, i5, i6, i21);
                SendingMessageAnimationContainerLayout sendingMessageAnimationContainerLayout = this;
                m mVar2 = sendingMessageAnimationContainerLayout.f;
                int i22 = (int) m0Var3.f186427a;
                int i32 = (int) m0Var4.f186427a;
                mVar2.f307563h = i22;
                mVar2.i = i32;
                mVar2.f307564j = true;
                Path pathA = mVar2.a();
                pathA.setFillType(Path.FillType.INVERSE_WINDING);
                Unit unit = Unit.f186387a;
                Paint paint2 = sendingMessageAnimationContainerLayout.f107118c;
                paint2.setColor(ColorUtils.setAlphaComponent(sendingMessageAnimationContainerLayout.d, ref$IntRef.f186408a));
                sendingMessageAnimationContainerLayout.f107120h = new c(rect2, pathA, paint2, x3, f4, staticLayoutBuild, str, textPaint, x5, height3);
                sendingMessageAnimationContainerLayout.invalidate();
            }
        });
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        animatorSet.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.dispatchDraw(canvas);
        c cVar = this.f107120h;
        if (cVar != null) {
            Rect rect = cVar.f110120a;
            canvas.save();
            canvas.clipRect(rect);
            canvas.translate(rect.left, rect.top);
            canvas.drawPath(cVar.f110121b, cVar.f110122c);
            canvas.save();
            canvas.translate(cVar.d, cVar.e);
            cVar.f.draw(canvas);
            canvas.restore();
            canvas.drawText(cVar.f110123g, cVar.i, cVar.f110125j, cVar.f110124h);
            canvas.restore();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SendingMessageAnimationContainerLayout(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendingMessageAnimationContainerLayout(@NotNull Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paintC = com.google.android.gms.internal.mlkit_vision_face.a.c(true);
        paintC.setStyle(Paint.Style.FILL);
        this.f107118c = paintC;
        int iCompositeColors = ColorUtils.compositeColors(kli.a.s(R$attr.uikit_colorGreyTone8, context), kli.a.s(R$attr.uikit_colorWidgetBackground, context));
        this.d = iCompositeColors;
        this.e = Color.alpha(iCompositeColors);
        this.f = new m(kli.a.k(context, 5.0f), kli.a.k(context, 20.0f), kli.a.k(context, 2.0f), kli.a.k(context, 20.0f), kli.a.k(context, 20.0f));
        this.f107119g = kli.a.l(context, 12.0f);
    }

    public /* synthetic */ SendingMessageAnimationContainerLayout(Context context, AttributeSet attributeSet, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, 0);
    }
}
