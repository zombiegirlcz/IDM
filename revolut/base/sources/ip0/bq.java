package ip0;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class bq extends koi.b {
    public final View f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f163654g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bq(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        ((ViewGroup) itemView).setLayoutTransition(new LayoutTransition());
        View viewFindViewById = itemView.findViewById(R$id.imageAttachment_deleteButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.imageAttachment_image);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f163654g = (ImageView) viewFindViewById2;
    }
}
