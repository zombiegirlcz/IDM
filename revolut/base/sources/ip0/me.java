package ip0;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class me extends wn {
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f165362g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f165363h;
    public final float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f165364j;
    public final float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f165365l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        LinearLayout linearLayout = (LinearLayout) itemView.findViewById(R$id.displayAmountToggle_optionsContainer);
        View viewFindViewById = linearLayout.findViewById(R$id.displayAmountToggle_primaryOption);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (TextView) viewFindViewById;
        View viewFindViewById2 = linearLayout.findViewById(R$id.displayAmountToggle_secondaryOption);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f165362g = (TextView) viewFindViewById2;
        this.f165363h = com.google.android.gms.internal.mlkit_vision_face.a.a(itemView, "getContext(...)", 24.0f);
        this.i = 0.875f;
        this.f165364j = 1.0f;
        this.k = 1.0f;
        this.f165365l = 0.55f;
    }

    @Override // ip0.wn
    public final void F(aw0.x8 picturePalette) {
        Intrinsics.checkNotNullParameter(picturePalette, "picturePalette");
        Context context = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f.setTextColor(kli.a.s(picturePalette.f10609a.a(), context));
        Context context2 = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.f165362g.setTextColor(kli.a.s(picturePalette.f10609a.a(), context2));
    }
}
