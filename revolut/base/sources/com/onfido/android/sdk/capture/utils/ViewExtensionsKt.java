package com.onfido.android.sdk.capture.utils;

import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.internal.util.annotation.InternalOnfidoApi;
import com.onfido.android.sdk.capture.ui.BulletStepView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import vim.f;
import zhm.v;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u001d\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0007\u0010\u0005\u001a\u001b\u0010\n\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\f\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u000e\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u000e\u0010\r\u001a\u001b\u0010\u0010\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0010\u0010\u0005\u001a\u001b\u0010\u0011\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0011\u0010\u0005\u001a\u0013\u0010\u0012\u001a\u00020\u0003*\u00020\u0000H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0014\u001a\u00020\u0003*\u00020\u0000H\u0000¢\u0006\u0004\b\u0014\u0010\u0013\u001a\u001b\u0010\u0018\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a%\u0010\u001c\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a'\u0010\u001e\u001a\u00020\u0017*\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0000¢\u0006\u0004\b\u001e\u0010\u001d\u001a'\u0010\u001f\u001a\u00020\u0017*\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0000¢\u0006\u0004\b\u001f\u0010\u001d\u001a/\u0010!\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010 \u001a\u00020\u001aH\u0000¢\u0006\u0004\b!\u0010\"\u001a\u0013\u0010%\u001a\u00020$*\u00020#H\u0000¢\u0006\u0004\b%\u0010&\u001a/\u0010,\u001a\u00020)*\u00020'2\b\b\u0002\u0010(\u001a\u00020\u00152\u0006\u0010*\u001a\u00020)2\b\b\u0002\u0010+\u001a\u00020\u0015H\u0000¢\u0006\u0004\b,\u0010-\u001a\u001d\u0010.\u001a\u00020)*\u00020'2\b\b\u0002\u0010(\u001a\u00020\u0015H\u0000¢\u0006\u0004\b.\u0010/\u001a+\u00104\u001a\u0002002\u0006\u00101\u001a\u0002002\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u000302H\u0002¢\u0006\u0004\b4\u00105\u001a'\u00107\u001a\u00020\u0003*\u0002062\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u000302H\u0000¢\u0006\u0004\b7\u00108\u001a'\u00107\u001a\u00020\u0003*\u00020\u00002\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u000302H\u0000¢\u0006\u0004\b7\u00109\u001a\u0013\u0010:\u001a\u00020\u0003*\u00020'H\u0000¢\u0006\u0004\b:\u0010;\u001a!\u0010>\u001a\u00020\u0003*\u00020\u00002\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00030<H\u0000¢\u0006\u0004\b>\u0010?\u001a\u001b\u0010A\u001a\u00020\u0003*\u00020'2\u0006\u0010@\u001a\u00020)H\u0000¢\u0006\u0004\bA\u0010B\u001a\u001b\u0010E\u001a\u00020\u0001*\u00020C2\u0006\u0010D\u001a\u00020\u0000H\u0000¢\u0006\u0004\bE\u0010F\u001a\u001d\u0010I\u001a\u0004\u0018\u00010\u0000*\u00020\u00002\u0006\u0010H\u001a\u00020GH\u0000¢\u0006\u0004\bI\u0010J\u001a\u001d\u0010L\u001a\u00020\u0003*\u00020\u00002\b\b\u0001\u0010K\u001a\u00020)H\u0000¢\u0006\u0004\bL\u0010M\u001a!\u0010Q\u001a\u00020\u0003*\u00020N2\f\u0010P\u001a\b\u0012\u0004\u0012\u00020)0OH\u0000¢\u0006\u0004\bQ\u0010R\"\u001a\u0010V\u001a\u0004\u0018\u00010S*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bT\u0010U\"\u0018\u0010Y\u001a\u00020\u0015*\u00020'8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bW\u0010X\"\u0018\u0010\\\u001a\u00020)*\u00020'8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010[¨\u0006]"}, d2 = {"Landroid/view/View;", "", "withAnimation", "", "toVisible", "(Landroid/view/View;Z)V", "toInvisible", "toGone", "Lcom/onfido/android/sdk/capture/utils/Visibility;", "visibility", "instantlyChangeVisibility", "(Landroid/view/View;Lcom/onfido/android/sdk/capture/utils/Visibility;)V", "isVisible", "(Landroid/view/View;)Z", "isGone", "condition", "toVisibleOrGone", "toVisibleIf", "activate", "(Landroid/view/View;)V", "deactivate", "", "alpha", "Landroid/view/ViewPropertyAnimator;", "animateToAlphaFast", "(Landroid/view/View;F)Landroid/view/ViewPropertyAnimator;", "", "milliseconds", "animateToAlpha", "(Landroid/view/View;FJ)Landroid/view/ViewPropertyAnimator;", "showWithAlphaAnim", "hideWithAlphaAnim", "initialDelay", "alphaAnimator", "(Landroid/view/View;FJJ)Landroid/view/ViewPropertyAnimator;", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/Bitmap;", "toBitmap", "(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;", "Landroid/widget/TextView;", "textSizeSp", "", "width", "lineSpacingAdd", "getTextPixelsHeightForWidth", "(Landroid/widget/TextView;FIF)I", "getTextPixelsWidth", "(Landroid/widget/TextView;F)I", "Landroid/view/ViewGroup$LayoutParams;", "params", "Lkotlin/Function1;", "closure", "replaceParams", "(Landroid/view/ViewGroup$LayoutParams;Lkotlin/jvm/functions/Function1;)Landroid/view/ViewGroup$LayoutParams;", "Landroid/view/ViewGroup;", "changeLayoutParams", "(Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function1;)V", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "clearText", "(Landroid/widget/TextView;)V", "Lkotlin/Function0;", "body", "runOnMeasured", "(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V", "height", "setMaxLinesInHeight", "(Landroid/widget/TextView;I)V", "Landroid/view/MotionEvent;", "view", "isPressedAndContainedInView", "(Landroid/view/MotionEvent;Landroid/view/View;)Z", "", "text", "findChildWithText", "(Landroid/view/View;Ljava/lang/String;)Landroid/view/View;", "stringId", "setContentDescription", "(Landroid/view/View;I)V", "Landroid/widget/LinearLayout;", "", "instructions", "setInstructions", "(Landroid/widget/LinearLayout;Ljava/util/List;)V", "Landroid/animation/LayoutTransition;", "getLayoutTransition", "(Landroid/view/View;)Landroid/animation/LayoutTransition;", "layoutTransition", "getFontLineHeightFloat", "(Landroid/widget/TextView;)F", "fontLineHeightFloat", "getFontLineHeight", "(Landroid/widget/TextView;)I", "fontLineHeight", "onfido-capture-sdk-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ViewExtensionsKt {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Visibility.values().length];
            try {
                iArr[Visibility.VISIBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Visibility.INVISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Visibility.GONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void activate(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setActivated(true);
    }

    @NotNull
    public static final ViewPropertyAnimator alphaAnimator(@NotNull View view, float f, long j2, long j3) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewPropertyAnimator duration = view.animate().alpha(f).setStartDelay(j3).setDuration(j2);
        Intrinsics.checkNotNullExpressionValue(duration, "setDuration(...)");
        return duration;
    }

    public static /* synthetic */ ViewPropertyAnimator alphaAnimator$default(View view, float f, long j2, long j3, int i, Object obj2) {
        if ((i & 2) != 0) {
            j2 = 200;
        }
        long j5 = j2;
        if ((i & 4) != 0) {
            j3 = 0;
        }
        return alphaAnimator(view, f, j5, j3);
    }

    @NotNull
    public static final ViewPropertyAnimator animateToAlpha(@NotNull View view, float f, long j2) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return alphaAnimator$default(view, f, j2, 0L, 4, null);
    }

    public static /* synthetic */ ViewPropertyAnimator animateToAlpha$default(View view, float f, long j2, int i, Object obj2) {
        if ((i & 2) != 0) {
            j2 = 200;
        }
        return animateToAlpha(view, f, j2);
    }

    @NotNull
    public static final ViewPropertyAnimator animateToAlphaFast(@NotNull View view, float f) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return animateToAlpha(view, f, 100L);
    }

    public static final void changeLayoutParams(@NotNull View view, @NotNull Function1<? super ViewGroup.LayoutParams, Unit> closure) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(closure, "closure");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNullExpressionValue(layoutParams, "getLayoutParams(...)");
        view.setLayoutParams(replaceParams(layoutParams, closure));
    }

    public static final void clearText(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        textView.setText("");
    }

    public static final void deactivate(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setActivated(false);
    }

    public static final View findChildWithText(@NotNull View view, @NotNull String text) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            f fVarC = new IntRange(0, viewGroup.getChildCount(), 1).iterator();
            while (fVarC.f289625c) {
                View childAt = viewGroup.getChildAt(fVarC.nextInt());
                View viewFindChildWithText = childAt != null ? findChildWithText(childAt, text) : null;
                if (viewFindChildWithText != null) {
                    return viewFindChildWithText;
                }
            }
        } else if ((view instanceof TextView) && TextUtils.equals(((TextView) view).getText(), text)) {
            return view;
        }
        return null;
    }

    public static final int getFontLineHeight(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        return (int) Math.ceil(getFontLineHeightFloat(textView));
    }

    private static final float getFontLineHeightFloat(TextView textView) {
        return textView.getLineSpacingExtra() + (textView.getPaint().getFontMetrics().bottom - textView.getPaint().getFontMetrics().top);
    }

    private static final LayoutTransition getLayoutTransition(View view) {
        ViewParent parent = view.getParent();
        Intrinsics.i(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        return ((ViewGroup) parent).getLayoutTransition();
    }

    public static final int getTextPixelsHeightForWidth(@NotNull TextView textView, float f, int i, float f4) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        CharSequence text = textView.getText();
        TextPaint paint = textView.getPaint();
        textView.setTextSize(f);
        return new StaticLayout(text, paint, i, Layout.Alignment.ALIGN_NORMAL, 1.0f, f4, false).getHeight();
    }

    public static /* synthetic */ int getTextPixelsHeightForWidth$default(TextView textView, float f, int i, float f4, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            float textSize = textView.getTextSize();
            Context context = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            f = textSize / ContextUtilsKt.screenScaledDensity(context);
        }
        if ((i2 & 4) != 0) {
            f4 = textView.getLineSpacingExtra();
        }
        return getTextPixelsHeightForWidth(textView, f, i, f4);
    }

    public static final int getTextPixelsWidth(@NotNull TextView textView, float f) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        TextPaint paint = textView.getPaint();
        textView.setTextSize(f);
        return (int) paint.measureText(textView.getText().toString());
    }

    public static /* synthetic */ int getTextPixelsWidth$default(TextView textView, float f, int i, Object obj2) {
        if ((i & 1) != 0) {
            float textSize = textView.getTextSize();
            Context context = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            f = textSize / ContextUtilsKt.screenScaledDensity(context);
        }
        return getTextPixelsWidth(textView, f);
    }

    @NotNull
    public static final ViewPropertyAnimator hideWithAlphaAnim(@NotNull View view, float f, long j2) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return alphaAnimator$default(view, f, j2, 0L, 4, null);
    }

    public static /* synthetic */ ViewPropertyAnimator hideWithAlphaAnim$default(View view, float f, long j2, int i, Object obj2) {
        if ((i & 1) != 0) {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        if ((i & 2) != 0) {
            j2 = 200;
        }
        return hideWithAlphaAnim(view, f, j2);
    }

    private static final void instantlyChangeVisibility(View view, Visibility visibility) {
        LayoutTransition layoutTransition = getLayoutTransition(view);
        if (layoutTransition != null) {
            int i = visibility.getIsAppearing() ? 2 : 3;
            layoutTransition.disableTransitionType(i);
            int i2 = WhenMappings.$EnumSwitchMapping$0[visibility.ordinal()];
            if (i2 == 1) {
                toVisible$default(view, false, 1, null);
            } else if (i2 == 2) {
                toInvisible$default(view, false, 1, null);
            } else if (i2 == 3) {
                toGone$default(view, false, 1, null);
            }
            layoutTransition.enableTransitionType(i);
        }
    }

    public static final boolean isGone(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return view.getVisibility() == 8;
    }

    public static final boolean isPressedAndContainedInView(@NotNull MotionEvent motionEvent, @NotNull View view) {
        Intrinsics.checkNotNullParameter(motionEvent, "<this>");
        Intrinsics.checkNotNullParameter(view, "view");
        int action = motionEvent.getAction();
        return (action == 0 || action == 2) && motionEvent.getX() > view.getX() && motionEvent.getX() < view.getX() + ((float) view.getWidth()) && motionEvent.getY() > view.getY() && motionEvent.getY() < view.getY() + ((float) view.getHeight()) && view.isPressed();
    }

    public static final boolean isVisible(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return view.getVisibility() == 0;
    }

    private static final ViewGroup.LayoutParams replaceParams(ViewGroup.LayoutParams layoutParams, Function1<? super ViewGroup.LayoutParams, Unit> function1) {
        function1.invoke(layoutParams);
        return layoutParams;
    }

    public static final void runOnMeasured(@NotNull final View view, @NotNull final Function0<Unit> body) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(body, "body");
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.onfido.android.sdk.capture.utils.ViewExtensionsKt.runOnMeasured.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                body.invoke();
            }
        });
    }

    public static final void setContentDescription(@NotNull View view, int i) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setContentDescription(view.getContext().getString(i));
    }

    public static final void setInstructions(@NotNull LinearLayout linearLayout, @NotNull List<Integer> instructions) {
        Intrinsics.checkNotNullParameter(linearLayout, "<this>");
        Intrinsics.checkNotNullParameter(instructions, "instructions");
        linearLayout.removeAllViews();
        int i = 0;
        for (Object obj2 : instructions) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            int iIntValue = ((Number) obj2).intValue();
            Context context = linearLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            BulletStepView bulletStepView = new BulletStepView(context, null, 0, 6, null);
            bulletStepView.setPadding(0, 0, 0, bulletStepView.getContext().getResources().getDimensionPixelSize(R.dimen.onfido_nfc_scan_fail_step_margin_vertical));
            String string = bulletStepView.getResources().getString(iIntValue);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            bulletStepView.setStepInfo(i2, string);
            bulletStepView.hideSeparators();
            linearLayout.addView(bulletStepView);
            i = i2;
        }
    }

    public static final void setMaxLinesInHeight(@NotNull TextView textView, int i) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        textView.setMaxLines((int) ((textView.getLineSpacingExtra() + i) / getFontLineHeightFloat(textView)));
        textView.setEllipsize(TextUtils.TruncateAt.END);
    }

    @NotNull
    public static final ViewPropertyAnimator showWithAlphaAnim(@NotNull View view, float f, long j2) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return alphaAnimator$default(view, f, j2, 0L, 4, null);
    }

    public static /* synthetic */ ViewPropertyAnimator showWithAlphaAnim$default(View view, float f, long j2, int i, Object obj2) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            j2 = 200;
        }
        return showWithAlphaAnim(view, f, j2);
    }

    @NotNull
    public static final Bitmap toBitmap(@NotNull Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "<this>");
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            Intrinsics.checkNotNullExpressionValue(bitmap, "getBitmap(...)");
            return bitmap;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvasE = ch.qos.logback.core.util.a.e(bitmapCreateBitmap, "createBitmap(...)", bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvasE.getWidth(), canvasE.getHeight());
        drawable.draw(canvasE);
        return bitmapCreateBitmap;
    }

    @InternalOnfidoApi
    public static final void toGone(@NotNull View view, boolean z) {
        Unit unit;
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (z) {
            view.setVisibility(8);
            return;
        }
        if (getLayoutTransition(view) != null) {
            instantlyChangeVisibility(view, Visibility.GONE);
            unit = Unit.f186387a;
        } else {
            unit = null;
        }
        if (unit == null) {
            toGone$default(view, false, 1, null);
        }
    }

    public static /* synthetic */ void toGone$default(View view, boolean z, int i, Object obj2) {
        if ((i & 1) != 0) {
            z = true;
        }
        toGone(view, z);
    }

    @InternalOnfidoApi
    public static final void toInvisible(@NotNull View view, boolean z) {
        Unit unit;
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (z) {
            view.setVisibility(4);
            return;
        }
        if (getLayoutTransition(view) != null) {
            instantlyChangeVisibility(view, Visibility.INVISIBLE);
            unit = Unit.f186387a;
        } else {
            unit = null;
        }
        if (unit == null) {
            toInvisible$default(view, false, 1, null);
        }
    }

    public static /* synthetic */ void toInvisible$default(View view, boolean z, int i, Object obj2) {
        if ((i & 1) != 0) {
            z = true;
        }
        toInvisible(view, z);
    }

    @InternalOnfidoApi
    public static final void toVisible(@NotNull View view, boolean z) {
        Unit unit;
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (z) {
            view.setVisibility(0);
            return;
        }
        if (getLayoutTransition(view) != null) {
            instantlyChangeVisibility(view, Visibility.VISIBLE);
            unit = Unit.f186387a;
        } else {
            unit = null;
        }
        if (unit == null) {
            toVisible$default(view, false, 1, null);
        }
    }

    public static /* synthetic */ void toVisible$default(View view, boolean z, int i, Object obj2) {
        if ((i & 1) != 0) {
            z = true;
        }
        toVisible(view, z);
    }

    public static final void toVisibleIf(@NotNull View view, boolean z) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (z) {
            toVisible$default(view, false, 1, null);
        } else {
            toInvisible$default(view, false, 1, null);
        }
    }

    @InternalOnfidoApi
    public static final void toVisibleOrGone(@NotNull View view, boolean z) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (z) {
            toVisible$default(view, false, 1, null);
        } else {
            toGone$default(view, false, 1, null);
        }
    }

    public static final void changeLayoutParams(@NotNull ViewGroup viewGroup, @NotNull Function1<? super ViewGroup.LayoutParams, Unit> closure) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Intrinsics.checkNotNullParameter(closure, "closure");
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        Intrinsics.checkNotNullExpressionValue(layoutParams, "getLayoutParams(...)");
        viewGroup.setLayoutParams(replaceParams(layoutParams, closure));
    }
}
