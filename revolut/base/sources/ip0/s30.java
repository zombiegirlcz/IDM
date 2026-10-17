package ip0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.ProfileItemDelegate;
import com.revolut.core.ui_kit.internal.views.CutoutImageView;
import com.revolut.core.ui_kit.internal.views.badge.CircleBadgeView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class s30 extends koi.b {
    public final CutoutImageView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CircleBadgeView f166285g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f166286h;
    public final TextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f166287j;
    public final RecyclerView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final z4l.j f166288l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ix0.l0 f166289m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s30(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.profile_headerImageView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        CutoutImageView cutoutImageView = (CutoutImageView) viewFindViewById;
        this.f = cutoutImageView;
        View viewFindViewById2 = itemView.findViewById(R$id.profile_imageBadge);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f166285g = (CircleBadgeView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.profile_headerTitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f166286h = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.profile_headerSubtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = (TextView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.profile_headerDescription);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById5;
        this.f166287j = textView;
        View viewFindViewById6 = itemView.findViewById(R$id.profile_recyclerView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        RecyclerView recyclerView = (RecyclerView) viewFindViewById6;
        this.k = recyclerView;
        z4l.j jVar = new z4l.j(7, zhm.u.c(new ProfileItemDelegate()), false);
        this.f166288l = jVar;
        this.f166289m = new ix0.l0((ViewGroup) itemView, zhm.u.c(cutoutImageView));
        recyclerView.setAdapter(jVar);
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        recyclerView.addItemDecoration(new q30(context));
        textView.setMovementMethod(ix0.c0.f169220a);
    }
}
