package com.revolut.core.ui_kit.delegates;

import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.revolut.core.ui_kit.R$drawable;
import com.revolut.core.ui_kit.delegates.RewardLoadingDelegate;
import ip0.ta0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class qe extends koi.b {
    public final AppCompatImageView f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qe(LinearLayout itemView, AppCompatImageView loadingIconView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(loadingIconView, "loadingIconView");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f = loadingIconView;
        loadingIconView.setClipToOutline(true);
        loadingIconView.setOutlineProvider(new ta0());
    }

    public final void F(RewardLoadingDelegate.b backgroundType) {
        Intrinsics.checkNotNullParameter(backgroundType, "backgroundType");
        int i = backgroundType instanceof RewardLoadingDelegate.b.C0421b ? R$drawable.internal_purple_gradient_background : backgroundType instanceof RewardLoadingDelegate.b.c ? R$drawable.internal_teal_gradient_background : backgroundType instanceof RewardLoadingDelegate.b.a ? R$drawable.internal_accent_gradient_background : R$drawable.internal_box_background_transparent;
        AppCompatImageView appCompatImageView = this.f;
        appCompatImageView.setAlpha(0.3f);
        appCompatImageView.setImageResource(i);
    }
}
