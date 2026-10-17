package com.revolut.core.ui_kit.internal.views.floatingbottombar;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f extends koi.b implements tw0.d {
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f57067g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.floatingBottomTabExpanded_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.floatingBottomTabExpanded_image);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f57067g = (ImageView) viewFindViewById2;
        Context context = itemView.getContext();
        Intrinsics.h(context);
        itemView.setBackground(dr0.l.e(context, new Color.Solid(R$attr.uikit_colorSelectableItemBackground), dr0.l.j(dr0.l.f117054a, dr0.l.h(context, 24.0f, new Color.Solid(R$attr.uikit_colorTransparent), 0, null), null, dr0.l.h(context, 24.0f, new Color.Solid(R$attr.uikit_colorGreyTone8), 0, null), dr0.l.h(context, 24.0f, new Color.Solid(R$attr.uikit_colorGreyTone8), 0, null), 230), dr0.l.h(context, 24.0f, new Color.SolidInt(-16777216), 0, null), 8));
    }

    @Override // tw0.d
    public final void a() {
        this.itemView.setActivated(true);
    }

    @Override // tw0.d
    public final void t() {
        this.itemView.setActivated(false);
    }
}
