package ip0;

import android.view.View;
import com.facebook.shimmer.ShimmerLinearLayout;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class kj extends koi.b {
    public final ShimmerLinearLayout f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f165025g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final View f165026h;
    public final View i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kj(View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(R$id.footerTextLoading_content);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (ShimmerLinearLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R$id.footerTextLoading_image);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f165025g = viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R$id.footerTextLoading_description);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f165026h = viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R$id.footerTextLoading_description_short);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = viewFindViewById4;
    }
}
