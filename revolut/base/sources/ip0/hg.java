package ip0;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.CutoutImageView;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import com.revolut.core.ui_kit.views.AvatarView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class hg extends koi.b {
    public final TagView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AvatarView f164547g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AppCompatTextView f164548h;
    public final CutoutImageView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinearLayout f164549j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hg(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.esimDetails_tagView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (TagView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.esimDetails_avatar);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f164547g = (AvatarView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.esimDetails_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f164548h = (AppCompatTextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.esimDetails_titleImage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        CutoutImageView cutoutImageView = (CutoutImageView) viewFindViewById4;
        this.i = cutoutImageView;
        View viewFindViewById5 = itemView.findViewById(R$id.esimDetails_additionalDescriptionsContainer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f164549j = (LinearLayout) viewFindViewById5;
        Object obj2 = or0.u.f228038a;
        Intrinsics.checkNotNullParameter(cutoutImageView, "<this>");
        or0.k kVarJ = or0.u.j(cutoutImageView);
        kVarJ.c(null);
        kVarJ.a();
    }
}
