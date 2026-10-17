package com.onfido.android.sdk.capture.audio;

import android.widget.TextView;
import com.onfido.android.sdk.capture.utils.ViewExtensionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class VolumeWarningView$volumePillHeightAnimator$2$1$2$onAnimationEnd$2 extends u implements Function0<Unit> {
    final /* synthetic */ VolumeWarningView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VolumeWarningView$volumePillHeightAnimator$2$1$2$onAnimationEnd$2(VolumeWarningView volumeWarningView) {
        super(0);
        this.this$0 = volumeWarningView;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m3666invoke();
        return Unit.f186387a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m3666invoke() {
        TextView turnSoundOn = this.this$0.binding.turnSoundOn;
        Intrinsics.checkNotNullExpressionValue(turnSoundOn, "turnSoundOn");
        ViewExtensionsKt.animateToAlpha$default(turnSoundOn, 1.0f, 0L, 2, null).start();
    }
}
