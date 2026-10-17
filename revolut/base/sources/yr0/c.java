package yr0;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.NewBadgeView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c extends koi.b {
    public final ImageView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f316052g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f316053h;
    public final TextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinearLayout f316054j;
    public final NewBadgeView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ImageView f316055l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final fp0.p f316056m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ViewGroup parent) {
        super(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_popup_menu_item));
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewFindViewById = this.itemView.findViewById(R$id.popupMenuItemDelegate_selectedIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (ImageView) viewFindViewById;
        View viewFindViewById2 = this.itemView.findViewById(R$id.popupMenuItemDelegate_icon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f316052g = (ImageView) viewFindViewById2;
        View viewFindViewById3 = this.itemView.findViewById(R$id.popupMenuItemDelegate_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f316053h = (TextView) viewFindViewById3;
        View viewFindViewById4 = this.itemView.findViewById(R$id.popupMenuItemDelegate_subtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = (TextView) viewFindViewById4;
        View viewFindViewById5 = this.itemView.findViewById(R$id.popupMenuItemDelegate_textContainer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f316054j = (LinearLayout) viewFindViewById5;
        View viewFindViewById6 = this.itemView.findViewById(R$id.popupMenuItemDelegate_badge);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.k = (NewBadgeView) viewFindViewById6;
        View viewFindViewById7 = this.itemView.findViewById(R$id.popupMenuItemDelegate_endIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.f316055l = (ImageView) viewFindViewById7;
        fp0.m mVar = fp0.p.Companion;
        View itemView = this.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        gp0.g gVar = new gp0.g(fp0.b.f137017a);
        mVar.getClass();
        this.f316056m = fp0.m.a(itemView, gVar);
    }

    public final void F(Image image) {
        zi0.c.g(this.f316055l, image);
        LinearLayout linearLayout = this.f316054j;
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.weight = image != null ? 1.0f : BitmapDescriptorFactory.HUE_RED;
        linearLayout.setLayoutParams(layoutParams2);
    }
}
