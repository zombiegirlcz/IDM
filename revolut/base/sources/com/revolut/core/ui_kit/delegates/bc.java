package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.LabelView;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.internal.views.UiKitMediaView;
import com.revolut.core.ui_kit.views.ActionsView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class bc extends koi.b {
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LabelView f53720g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LabelView f53721h;
    public final UiKitMediaView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final SmallActionButton f53722j;
    public final ActionsView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final fp0.p f53723l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bc(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.planWidget_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.planWidget_subtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f53720g = (LabelView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.planWidget_description);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f53721h = (LabelView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.planWidget_media);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = (UiKitMediaView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.planWidget_topEndButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f53722j = (SmallActionButton) viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(R$id.planWidget_actionsView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.k = (ActionsView) viewFindViewById6;
        fp0.m mVar = fp0.p.Companion;
        gp0.g gVar = new gp0.g(fp0.b.f137017a);
        mVar.getClass();
        this.f53723l = fp0.m.a(itemView, gVar);
    }
}
