package ip0;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class zx extends koi.b {
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f167544g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f167545h;
    public final ImageView i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zx(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.internalDelegateNewProductSmall_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.internalDelegateNewProductSmall_subtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f167544g = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.internalDelegateNewProductSmall_badge);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f167545h = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.internalDelegateNewProductSmall_icon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = (ImageView) viewFindViewById4;
    }
}
