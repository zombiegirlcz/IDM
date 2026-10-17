package ezl;

import android.view.View;
import com.google.android.material.chip.Chip;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends koi.b {
    public final Chip f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(View itemView) {
        super(itemView);
        Intrinsics.i(itemView, "null cannot be cast to non-null type com.google.android.material.chip.Chip");
        Chip chipView = (Chip) itemView;
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(chipView, "chipView");
        this.f = chipView;
        chipView.setStateListAnimator(null);
    }
}
