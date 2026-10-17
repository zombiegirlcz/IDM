package op0;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.LabelView;
import com.revolut.core.ui_kit.views.AvatarView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b extends p {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f227172j;
    public final TextView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final LabelView f227173l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AppCompatTextView f227174m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final LabelView f227175n;
    public final AppCompatTextView o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final LabelView f227176p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AppCompatTextView f227177q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final AvatarView f227178r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.accessPassWidget_container);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        View viewFindViewById2 = itemView.findViewById(R$id.accessPassWidget_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f227172j = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.accessPassWidget_content);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.k = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.accessPassWidget_primaryDescriptionLabel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f227173l = (LabelView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.accessPassWidget_primaryDescriptionValue);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f227174m = (AppCompatTextView) viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(R$id.accessPassWidget_secondaryDescriptionLabel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.f227175n = (LabelView) viewFindViewById6;
        View viewFindViewById7 = itemView.findViewById(R$id.accessPassWidget_secondaryDescriptionValue);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.o = (AppCompatTextView) viewFindViewById7;
        View viewFindViewById8 = itemView.findViewById(R$id.accessPassWidget_tertiaryDescriptionLabel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.f227176p = (LabelView) viewFindViewById8;
        View viewFindViewById9 = itemView.findViewById(R$id.accessPassWidget_tertiaryDescriptionValue);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        this.f227177q = (AppCompatTextView) viewFindViewById9;
        View viewFindViewById10 = itemView.findViewById(R$id.accessPassWidget_avatar);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
        this.f227178r = (AvatarView) viewFindViewById10;
    }
}
