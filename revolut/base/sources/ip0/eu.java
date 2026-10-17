package ip0;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.shimmer.ShimmerLinearLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.ListSubheaderContainerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class eu extends koi.b implements qq0.b {
    public final ListSubheaderContainerView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ShimmerLinearLayout f164152g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ImageView f164153h;
    public final TextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ImageView f164154j;
    public final TextView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f164155l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public qv0.c f164156m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f164157n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eu(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f = (ListSubheaderContainerView) itemView;
        View viewFindViewById = itemView.findViewById(R$id.listSubheader_startContainer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f164152g = (ShimmerLinearLayout) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.listSubheader_mainImage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f164153h = (ImageView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.listSubheader_startLabel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById3;
        this.i = textView;
        View viewFindViewById4 = itemView.findViewById(R$id.listSubheader_startImage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f164154j = (ImageView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.endLabel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.k = (TextView) viewFindViewById5;
        this.f164155l = -1;
        this.f164157n = textView;
    }

    @Override // qq0.b
    public final View k() {
        return this.f164157n;
    }
}
