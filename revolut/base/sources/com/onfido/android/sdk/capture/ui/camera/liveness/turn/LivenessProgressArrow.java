package com.onfido.android.sdk.capture.ui.camera.liveness.turn;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.ContextCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.ui.camera.liveness.challenges.MovementType;
import com.onfido.android.sdk.capture.utils.listeners.AnimatorListener;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;
import yhm.j;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0014J\u000e\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u0013J\u001e\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\n2\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001c0#R&\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8\u0000@BX\u0081\u000e¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.¢\u0006\u0002\n\u0000R#\u0010\u0014\u001a\n \u0016*\u0004\u0018\u00010\u00150\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018¨\u0006$"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/liveness/turn/LivenessProgressArrow;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "<set-?>", "", "currentProgress", "getCurrentProgress$onfido_capture_sdk_core_release$annotations", "()V", "getCurrentProgress$onfido_capture_sdk_core_release", "()F", "fullArrowPaint", "Landroid/graphics/Paint;", "movementType", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/MovementType;", "progressAnimator", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "getProgressAnimator", "()Landroid/animation/ValueAnimator;", "progressAnimator$delegate", "Lkotlin/Lazy;", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "setMovementType", "setProgress", "progress", "onFinish", "Lkotlin/Function0;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LivenessProgressArrow extends View {
    private float currentProgress;

    @NotNull
    private final Paint fullArrowPaint;
    private MovementType movementType;

    /* JADX INFO: renamed from: progressAnimator$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy progressAnimator;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MovementType.values().length];
            try {
                iArr[MovementType.TURN_RIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MovementType.TURN_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.liveness.turn.LivenessProgressArrow$setProgress$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends u implements Function0<Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m3730invoke() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m3730invoke();
            return Unit.f186387a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LivenessProgressArrow(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void getCurrentProgress$onfido_capture_sdk_core_release$annotations() {
    }

    private final ValueAnimator getProgressAnimator() {
        return (ValueAnimator) this.progressAnimator.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setProgress$default(LivenessProgressArrow livenessProgressArrow, float f, Function0 function0, int i, Object obj2) {
        if ((i & 2) != 0) {
            function0 = AnonymousClass1.INSTANCE;
        }
        livenessProgressArrow.setProgress(f, function0);
    }

    /* JADX INFO: renamed from: getCurrentProgress$onfido_capture_sdk_core_release, reason: from getter */
    public final float getCurrentProgress() {
        return this.currentProgress;
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        MovementType movementType = this.movementType;
        if (movementType == null) {
            Intrinsics.r("movementType");
            throw null;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[movementType.ordinal()];
        if (i == 1) {
            canvas.drawRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, getWidth() * this.currentProgress, getHeight(), this.fullArrowPaint);
        } else {
            if (i != 2) {
                return;
            }
            canvas.drawRect(getWidth() - (getWidth() * this.currentProgress), BitmapDescriptorFactory.HUE_RED, getWidth(), getHeight(), this.fullArrowPaint);
        }
    }

    public final void setMovementType(@NotNull MovementType movementType) {
        int i;
        Intrinsics.checkNotNullParameter(movementType, "movementType");
        this.movementType = movementType;
        int i2 = WhenMappings.$EnumSwitchMapping$0[movementType.ordinal()];
        if (i2 == 1) {
            i = R.drawable.onfido_liveness_arrow_right;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.drawable.onfido_liveness_arrow_left;
        }
        setBackground(AppCompatResources.getDrawable(getContext(), i));
    }

    public final void setProgress(float progress, @NotNull final Function0<Unit> onFinish) {
        Intrinsics.checkNotNullParameter(onFinish, "onFinish");
        if (getProgressAnimator().isRunning()) {
            return;
        }
        ValueAnimator progressAnimator = getProgressAnimator();
        progressAnimator.setFloatValues(this.currentProgress, progress);
        progressAnimator.start();
        progressAnimator.addListener(new AnimatorListener() { // from class: com.onfido.android.sdk.capture.ui.camera.liveness.turn.LivenessProgressArrow$setProgress$2$1
            @Override // com.onfido.android.sdk.capture.utils.listeners.AnimatorListener, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animator) {
                AnimatorListener.DefaultImpls.onAnimationCancel(this, animator);
            }

            @Override // com.onfido.android.sdk.capture.utils.listeners.AnimatorListener, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                onFinish.invoke();
            }

            @Override // com.onfido.android.sdk.capture.utils.listeners.AnimatorListener, android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animator) {
                AnimatorListener.DefaultImpls.onAnimationRepeat(this, animator);
            }

            @Override // com.onfido.android.sdk.capture.utils.listeners.AnimatorListener, android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animator) {
                AnimatorListener.DefaultImpls.onAnimationStart(this, animator);
            }
        });
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LivenessProgressArrow(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LivenessProgressArrow(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint();
        paint.setColor(ContextCompat.getColor(context, R.color.onfido_primary_500));
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        this.fullArrowPaint = paint;
        setLayerType(1, null);
        this.progressAnimator = j.b(new LivenessProgressArrow$progressAnimator$2(this));
    }

    public /* synthetic */ LivenessProgressArrow(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
