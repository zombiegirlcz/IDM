package com.onfido.android.sdk.capture.ui;

import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.onfido.android.sdk.capture.databinding.OnfidoBulletStepViewBinding;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class BulletStepView$1$1 extends u implements Function0<Unit> {
    final /* synthetic */ OnfidoBulletStepViewBinding $this_apply;
    final /* synthetic */ BulletStepView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BulletStepView$1$1(OnfidoBulletStepViewBinding onfidoBulletStepViewBinding, BulletStepView bulletStepView) {
        super(0);
        this.$this_apply = onfidoBulletStepViewBinding;
        this.this$0 = bulletStepView;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m3710invoke();
        return Unit.f186387a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m3710invoke() {
        ViewGroup.LayoutParams layoutParams = this.$this_apply.bottomSeparator.getLayoutParams();
        Intrinsics.i(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        int height = this.$this_apply.bottomSeparator.getHeight();
        int i = layoutParams2.width;
        int i2 = this.$this_apply.topSeparator.getLayoutParams().height;
        int i3 = layoutParams2.topMargin;
        int i5 = layoutParams2.leftMargin;
        if (height < i2) {
            this.this$0.changeBottomSeparatorDimensions(i, i2, i3, i5);
        }
    }
}
