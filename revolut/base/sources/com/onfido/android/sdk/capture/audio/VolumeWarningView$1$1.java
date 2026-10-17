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
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/ViewGroup$LayoutParams;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class VolumeWarningView$1$1 extends u implements Function1<ViewGroup.LayoutParams, Unit> {
    final /* synthetic */ VolumeWarningView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VolumeWarningView$1$1(VolumeWarningView volumeWarningView) {
        super(1);
        this.this$0 = volumeWarningView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
        invoke((ViewGroup.LayoutParams) obj2);
        return Unit.f186387a;
    }

    public final void invoke(@NotNull ViewGroup.LayoutParams it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) it8;
        VolumeWarningView volumeWarningView = this.this$0;
        layoutParams.topMargin = volumeWarningView.getTextTopMargin();
        layoutParams.bottomMargin = volumeWarningView.getTextTopMargin();
        layoutParams.rightMargin = volumeWarningView.getSpeakerSize() / 2;
    }
}
