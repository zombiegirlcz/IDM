package pq0;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.views.AvatarView;
import kotlin.jvm.internal.Intrinsics;
import mx0.i1;

/* JADX INFO: loaded from: classes19.dex */
public final class k extends koi.b {
    public final AvatarView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AppCompatTextView f238654g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AppCompatTextView f238655h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = this.itemView.findViewById(R$id.spinnerSelector_avatar);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        AvatarView avatarView = (AvatarView) viewFindViewById;
        this.f = avatarView;
        View viewFindViewById2 = this.itemView.findViewById(R$id.spinnerSelector_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f238654g = (AppCompatTextView) viewFindViewById2;
        View viewFindViewById3 = this.itemView.findViewById(R$id.spinnerSelector_subtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f238655h = (AppCompatTextView) viewFindViewById3;
        avatarView.setDefaultAvatarStyle$ui_kit_components_release(i1.SIZE_80_80);
        View itemView = this.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        pd.b.q(itemView, true);
        View itemView2 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
        pd.b.h(itemView2, true);
    }
}
