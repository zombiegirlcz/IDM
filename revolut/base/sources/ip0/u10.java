package ip0;

import android.view.View;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class u10 extends koi.b {
    public final View f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f166576g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final View f166577h;
    public final View i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u10(View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = this.itemView.findViewById(R$id.plainTextLoading_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = viewFindViewById;
        View viewFindViewById2 = this.itemView.findViewById(R$id.plainTextLoading_description);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f166576g = viewFindViewById2;
        View viewFindViewById3 = this.itemView.findViewById(R$id.plainTextLoading_image);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f166577h = viewFindViewById3;
        View viewFindViewById4 = this.itemView.findViewById(R$id.plainTextLoading_action);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = viewFindViewById4;
    }
}
