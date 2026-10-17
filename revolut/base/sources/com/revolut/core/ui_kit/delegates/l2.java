package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.LabelView;
import com.revolut.core.ui_kit.internal.views.badge.WarningBadgeView;
import com.revolut.core.ui_kit.views.OverlappedIconsView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class l2 extends koi.b {

    @NotNull
    private static final ip0.z6 Companion = new ip0.z6();
    public final ConstraintLayout f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public OverlappedIconsView f54410g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public h2 f54411h;
    public final LabelView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LabelView f54412j;
    public final TextView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final WarningBadgeView f54413l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Guideline f54414m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final fp0.p f54415n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.cellDetailsText_rootLayout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (ConstraintLayout) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.cellDetailsText_titleLabel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.i = (LabelView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.cellDetailsText_endLabel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f54412j = (LabelView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.cellDetailsText_endSecondaryLabel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.k = (TextView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.cellDetailsText_warningBadge);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f54413l = (WarningBadgeView) viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(R$id.cellDetailsText_contentDivider);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.f54414m = (Guideline) viewFindViewById6;
        fp0.m mVar = fp0.p.Companion;
        gp0.g gVar = new gp0.g(fp0.b.f137017a);
        mVar.getClass();
        this.f54415n = fp0.m.a(itemView, gVar);
    }
}
