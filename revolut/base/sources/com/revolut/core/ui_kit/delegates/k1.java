package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import com.revolut.core.ui_kit.internal.views.layout.UIKitConstraintLayout;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import com.revolut.core.ui_kit.views.OverlappedIconsView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class k1 extends koi.b {
    public final UIKitConstraintLayout f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f54358g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final UIKitTextView f54359h;
    public final UIKitTextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinearLayout f54360j;
    public final TagView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final OverlappedIconsView f54361l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public j1 f54362m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(UIKitConstraintLayout itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f = itemView;
        View viewFindViewById = itemView.findViewById(R$id.basket_avatar);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f54358g = (ImageView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.basket_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f54359h = (UIKitTextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.basket_description);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.i = (UIKitTextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.basket_detailsContainer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f54360j = (LinearLayout) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.basket_badge);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.k = (TagView) viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(R$id.basket_avatarGroup);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.f54361l = (OverlappedIconsView) viewFindViewById6;
    }
}
