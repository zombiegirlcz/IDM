package pq0;

import android.view.View;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class l extends koi.b {
    public final View f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f238656g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final View f238657h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = this.itemView.findViewById(R$id.spinnerSelectorLoading_avatar);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = viewFindViewById;
        View viewFindViewById2 = this.itemView.findViewById(R$id.spinnerSelectorLoading_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f238656g = viewFindViewById2;
        View viewFindViewById3 = this.itemView.findViewById(R$id.spinnerSelectorLoading_subtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f238657h = viewFindViewById3;
    }
}
