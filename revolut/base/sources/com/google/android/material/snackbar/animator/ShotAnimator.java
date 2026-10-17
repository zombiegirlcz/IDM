package com.google.android.material.snackbar.animator;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b`\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H&J,\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u000bH&J\b\u0010\f\u001a\u00020\u0003H&J\f\u0010\r\u001a\u00020\u000e*\u00020\u0005H\u0016¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lcom/google/android/material/snackbar/animator/ShotAnimator;", "", "animateIn", "", "view", "Landroid/view/View;", "onAnimationEnd", "Lkotlin/Function0;", "animateOut", "event", "", "Lkotlin/Function1;", "cancel", "getTranslationYBottom", "", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ShotAnimator {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static float getTranslationYBottom(@NotNull ShotAnimator shotAnimator, @NotNull View receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return ShotAnimator.super.getTranslationYBottom(receiver);
        }
    }

    void animateIn(@NotNull View view, @NotNull Function0<Unit> onAnimationEnd);

    void animateOut(@NotNull View view, int event, @NotNull Function1<? super Integer, Unit> onAnimationEnd);

    void cancel();

    default float getTranslationYBottom(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        int height = view.getHeight();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            height += ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        return height;
    }
}
