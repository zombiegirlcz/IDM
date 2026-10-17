package ip0;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.LabelView;
import com.revolut.core.ui_kit.internal.views.box.ShadowLayout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class d8 extends koi.b implements rr0.d {

    @NotNull
    public static final c8 Companion = new c8();
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LabelView f163854g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ImageView f163855h;
    public final rr0.g i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d8(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.action);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f163854g = (LabelView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.image);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f163855h = (ImageView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.image_container);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = vc.s.c(this);
        ((ShadowLayout) viewFindViewById4).setCornersRadius(8.0f);
    }

    @Override // rr0.d
    public final void L(boolean z) {
        this.f163854g.setProgressVisible(z);
    }
}
