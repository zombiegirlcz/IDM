package com.google.android.material.snackbar;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.snackbar.BaseShot;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.animator.ShotAnimator;
import com.google.android.material.snackbar.animator.Toast2ShotAnimator;
import jo0.m;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b \u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00002\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\u001eB#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\u0010\u0007\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0015\u001a\u00020\rH\u0014J\b\u0010\u0016\u001a\u00020\u0017H\u0014J\b\u0010\u0018\u001a\u00020\u0017H\u0002J\u0010\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001bH\u0014J\u0010\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001d\u001a\u00020\u0017H\u0014R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/google/android/material/snackbar/BaseShot;", "B", "Lcom/google/android/material/snackbar/BaseTransientBottomBar;", "parent", "Landroid/view/ViewGroup;", "content", "Landroid/view/View;", "contentViewCallback", "Lcom/google/android/material/snackbar/ContentViewCallback;", "Lcom/revolut/core/ui_kit/internal/popups/SnackBarCallback;", "<init>", "(Landroid/view/ViewGroup;Landroid/view/View;Lcom/google/android/material/snackbar/ContentViewCallback;)V", "systemAnimationEnabled", "", "shouldApplyCustomAnimation", "animator", "Lcom/google/android/material/snackbar/animator/ShotAnimator;", "animateInRunnable", "Ljava/lang/Runnable;", "state", "Lcom/google/android/material/snackbar/BaseShot$State;", "shouldAnimate", "onViewShown", "", "animateContentIn", "onViewHidden", "event", "", "animateContentOut", "onDetachedFromWindow", "State", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class BaseShot<B extends BaseShot<B>> extends BaseTransientBottomBar<B> {

    @NotNull
    private final Runnable animateInRunnable;
    private final ShotAnimator animator;
    private final boolean shouldApplyCustomAnimation;

    @NotNull
    private State state;
    private final boolean systemAnimationEnabled;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/google/android/material/snackbar/BaseShot$State;", "", "<init>", "(Ljava/lang/String;I)V", "HIDDEN", "APPEARING", "VISIBLE", "DISAPPEARING", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class State {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State HIDDEN = new State("HIDDEN", 0);
        public static final State APPEARING = new State("APPEARING", 1);
        public static final State VISIBLE = new State("VISIBLE", 2);
        public static final State DISAPPEARING = new State("DISAPPEARING", 3);

        private static final /* synthetic */ State[] $values() {
            return new State[]{HIDDEN, APPEARING, VISIBLE, DISAPPEARING};
        }

        static {
            State[] stateArr$values = $values();
            $VALUES = stateArr$values;
            $ENTRIES = s.n(stateArr$values);
        }

        private State(String str, int i) {
        }

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[State.values().length];
            try {
                iArr[State.VISIBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[State.APPEARING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[State.DISAPPEARING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[State.HIDDEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseShot(@NotNull ViewGroup parent, @NotNull View content, @NotNull ContentViewCallback contentViewCallback) {
        Toast2ShotAnimator toast2ShotAnimator;
        super(parent, content, contentViewCallback);
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(contentViewCallback, "contentViewCallback");
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        boolean zA = jq0.a.a(context);
        this.systemAnimationEnabled = zA;
        boolean z = m.f176851h && zA && super.shouldAnimate();
        this.shouldApplyCustomAnimation = z;
        if (z) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            toast2ShotAnimator = new Toast2ShotAnimator(context2);
        } else {
            toast2ShotAnimator = null;
        }
        this.animator = toast2ShotAnimator;
        this.animateInRunnable = new a(this, 1);
        this.state = State.HIDDEN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void animateContentIn() {
        this.state = State.APPEARING;
        ShotAnimator shotAnimator = this.animator;
        if (shotAnimator != null) {
            BaseTransientBottomBar.SnackbarBaseLayout view = this.view;
            Intrinsics.checkNotNullExpressionValue(view, "view");
            shotAnimator.animateIn(view, new co7.a(this, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit animateContentIn$lambda$0(BaseShot baseShot) {
        baseShot.state = State.VISIBLE;
        super.onViewShown();
        return Unit.f186387a;
    }

    private final void animateContentOut(int event) {
        int i = WhenMappings.$EnumSwitchMapping$0[this.state.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                super.onViewHidden(event);
                return;
            }
            return;
        }
        this.state = State.DISAPPEARING;
        ShotAnimator shotAnimator = this.animator;
        if (shotAnimator != null) {
            BaseTransientBottomBar.SnackbarBaseLayout view = this.view;
            Intrinsics.checkNotNullExpressionValue(view, "view");
            shotAnimator.animateOut(view, event, new ce9.a(this, 25));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit animateContentOut$lambda$0(BaseShot baseShot, int i) {
        baseShot.state = State.HIDDEN;
        super.onViewHidden(i);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onDetachedFromWindow$lambda$0(BaseShot baseShot) {
        ShotAnimator shotAnimator = baseShot.animator;
        if (shotAnimator != null) {
            shotAnimator.cancel();
        }
        baseShot.state = State.HIDDEN;
        super.onViewHidden(3);
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void onDetachedFromWindow() {
        if (isShownOrQueued()) {
            BaseTransientBottomBar.handler.post(new a(this, 0));
        }
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void onViewHidden(int event) {
        if (this.animator != null) {
            BaseTransientBottomBar.SnackbarBaseLayout view = this.view;
            Intrinsics.checkNotNullExpressionValue(view, "view");
            if (view.getVisibility() == 0) {
                BaseTransientBottomBar.handler.removeCallbacks(this.animateInRunnable);
                animateContentOut(event);
                return;
            }
        }
        super.onViewHidden(event);
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void onViewShown() {
        if (this.animator == null) {
            super.onViewShown();
        } else {
            this.view.setAlpha(BitmapDescriptorFactory.HUE_RED);
            BaseTransientBottomBar.handler.post(this.animateInRunnable);
        }
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public boolean shouldAnimate() {
        return false;
    }
}
