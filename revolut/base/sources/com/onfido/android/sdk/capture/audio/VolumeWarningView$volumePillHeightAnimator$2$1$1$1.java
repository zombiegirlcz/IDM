package com.onfido.android.sdk.capture.audio;

import android.view.ViewGroup;
import android.widget.RelativeLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "params", "Landroid/view/ViewGroup$LayoutParams;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class VolumeWarningView$volumePillHeightAnimator$2$1$1$1 extends u implements Function1<ViewGroup.LayoutParams, Unit> {
    final /* synthetic */ int $value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VolumeWarningView$volumePillHeightAnimator$2$1$1$1(int i) {
        super(1);
        this.$value = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
        invoke((ViewGroup.LayoutParams) obj2);
        return Unit.f186387a;
    }

    public final void invoke(@NotNull ViewGroup.LayoutParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) params;
        int i = this.$value;
        layoutParams.width = i;
        layoutParams.height = i;
    }
}
