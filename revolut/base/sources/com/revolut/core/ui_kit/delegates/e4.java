package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.ComparisonCellDelegate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e4 extends koi.b {
    public final ihm.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f54079g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final View f54080h;
    public final TextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f54081j;
    public final TextView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ImageView f54082l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ImageView f54083m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Group f54084n;
    public final Group o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final View f54085p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ty0.c f54086q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(View itemView, ihm.f clauseClickListener) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(clauseClickListener, "clauseClickListener");
        this.f = clauseClickListener;
        View viewFindViewById = itemView.findViewById(R$id.comparisonCellDelegate_firstHighlightContainer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f54079g = viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.comparisonCellDelegate_secondHighlightContainer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f54080h = viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.comparisonCellDelegate_firstText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.i = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.comparisonCellDelegate_firstSubText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f54081j = (TextView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.comparisonCellDelegate_secondText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.k = (TextView) viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(R$id.comparisonCellDelegate_firstIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.f54082l = (ImageView) viewFindViewById6;
        View viewFindViewById7 = itemView.findViewById(R$id.comparisonCellDelegate_secondIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.f54083m = (ImageView) viewFindViewById7;
        View viewFindViewById8 = itemView.findViewById(R$id.comparisonCellDelegate_firstCardImage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        View viewFindViewById9 = itemView.findViewById(R$id.comparisonCellDelegate_firstCardText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        View viewFindViewById10 = itemView.findViewById(R$id.comparisonCellDelegate_firstCardBadge);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
        View viewFindViewById11 = itemView.findViewById(R$id.comparisonCellDelegate_firstCardGroup);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "findViewById(...)");
        this.f54084n = (Group) viewFindViewById11;
        View viewFindViewById12 = itemView.findViewById(R$id.comparisonCellDelegate_secondCardImage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById12, "findViewById(...)");
        View viewFindViewById13 = itemView.findViewById(R$id.comparisonCellDelegate_secondCardText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById13, "findViewById(...)");
        View viewFindViewById14 = itemView.findViewById(R$id.comparisonCellDelegate_secondCardBadge);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById14, "findViewById(...)");
        View viewFindViewById15 = itemView.findViewById(R$id.comparisonCellDelegate_secondCardGroup);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById15, "findViewById(...)");
        this.o = (Group) viewFindViewById15;
        View viewFindViewById16 = itemView.findViewById(R$id.comparisonCellDelegate_bottomDivider);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById16, "findViewById(...)");
        this.f54085p = viewFindViewById16;
        this.f54086q = or0.u.k(itemView).b0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    public final void F(ComparisonCellDelegate.Model model, c4 c4Var, TextView textView, ImageView imageView, Group group, TextView textView2) {
        if (c4Var == null) {
            throw new NoWhenBranchMatchedException();
        }
        ?? r3 = c4Var.f53742a;
        textView.setMovementMethod(((bp0.y) this.f54086q).g(r3) ? ix0.c0.f169220a : null);
        kli.a.d(textView, r3, model, new d4(1, 0, ihm.f.class, this.f, "onNext", "onNext(Ljava/lang/Object;)V"), 8);
        textView.setGravity(c4Var.f53743b.a());
        if (textView2 != null) {
            kli.a.d(textView2, null, model, null, 12);
        }
        imageView.setVisibility(8);
        group.setVisibility(8);
    }
}
