package ip0;

import android.widget.ImageView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class nf extends koi.b {
    public final ImageView f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nf(ImageView itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "imageView");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f = itemView;
    }
}
