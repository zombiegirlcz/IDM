package com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view.headturn;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.onfido.android.sdk.capture.utils.ViewExtensionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class HeadTurnGuidanceVideoView$show$1$1 extends u implements Function0<Unit> {
    final /* synthetic */ HeadTurnGuidanceVideoView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeadTurnGuidanceVideoView$show$1$1(HeadTurnGuidanceVideoView headTurnGuidanceVideoView) {
        super(0);
        this.this$0 = headTurnGuidanceVideoView;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m3683invoke();
        return Unit.f186387a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m3683invoke() {
        ViewExtensionsKt.showWithAlphaAnim$default(this.this$0, BitmapDescriptorFactory.HUE_RED, 0L, 3, null);
    }
}
