package kp0;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class x0 extends koi.b {
    public final ImageView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f188113g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.chatReactionDelegate_imageView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (ImageView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.chatReactionDelegate_statusText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f188113g = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.chatReactionDelegate_statusImage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
    }
}
