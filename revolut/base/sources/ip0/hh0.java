package ip0;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class hh0 extends koi.b {
    public final z4l.j f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f164558g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f164559h;
    public final TextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f164560j;
    public final RecyclerView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f164561l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f164562m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hh0(View itemView, z4l.j adapter) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.f = adapter;
        View viewFindViewById = itemView.findViewById(R$id.SuggestionsBarCellDelegate_image);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f164558g = (ImageView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.SuggestionsBarCellDelegate_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f164559h = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.SuggestionsBarCellDelegate_subtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.i = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.SuggestionsBarCellDelegate_value);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f164560j = (TextView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.SuggestionsBarCellDelegate_recycler);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.k = (RecyclerView) viewFindViewById5;
        this.f164561l = te0.w.y0(new au0.z3(itemView, 12));
        this.f164562m = te0.w.y0(new au0.z3(itemView, 13));
    }
}
