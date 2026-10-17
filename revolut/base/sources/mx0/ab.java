package mx0;

import com.revolut.core.ui_kit.internal.views.CutoutImageView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class ab extends koi.b {
    public final CutoutImageView f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab(CutoutImageView itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "cutoutImageView");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f = itemView;
    }
}
