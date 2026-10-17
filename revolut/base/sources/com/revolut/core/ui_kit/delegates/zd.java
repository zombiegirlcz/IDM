package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.RateDelegate;
import com.revolut.core.ui_kit.internal.views.RatingBar;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import ip0.w70;
import ip0.x70;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class zd extends koi.b {
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f55691g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f55692h;
    public final RatingBar i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final SmallActionButton f55693j;
    public final ImageView k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zd(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.internalRateDelegate_root);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        View viewFindViewById2 = itemView.findViewById(R$id.rate_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.rate_label);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f55691g = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.rate_description);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f55692h = (TextView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.rate_fiveStarRating);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.i = (RatingBar) viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(R$id.rate_ActionButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.f55693j = (SmallActionButton) viewFindViewById6;
        View viewFindViewById7 = itemView.findViewById(R$id.rate_closeButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.k = (ImageView) viewFindViewById7;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void F(x70 content) {
        Intrinsics.checkNotNullParameter(content, "content");
        boolean z = content instanceof w70;
        TextView textView = this.f55691g;
        RatingBar ratingBar = this.i;
        SmallActionButton smallActionButton = this.f55693j;
        if (z) {
            smallActionButton.setText(((w70) content).f166948a);
            smallActionButton.setVisibility(0);
            ratingBar.setVisibility(8);
            textView.setVisibility(8);
            return;
        }
        if (content instanceof yd) {
            yd ydVar = (yd) content;
            ratingBar.setVisibility(0);
            kli.a.b(textView, null, ty0.f.f275450a);
            smallActionButton.setVisibility(8);
            Context context = ratingBar.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ratingBar.setIconSize(kli.a.k(context, 24.0f));
            Context context2 = ratingBar.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            ratingBar.setGap(kli.a.k(context2, 12.0f));
            ViewGroup.LayoutParams layoutParams = ratingBar.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.setMarginStart(textView.getVisibility() == 0 ? foh.i.j(10) : foh.i.j(0));
            ratingBar.setLayoutParams(layoutParams2);
            RateDelegate.b bVar = ydVar.f55648a;
            ratingBar.setRating$ui_kit_components_release(bVar.f53141a);
            ratingBar.setHalfIconStep$ui_kit_components_release(false);
            ratingBar.setMinRating$ui_kit_components_release(BitmapDescriptorFactory.HUE_RED);
            ratingBar.setMaxRating$ui_kit_components_release(bVar.f53142b);
            return;
        }
        if (!(content instanceof xd)) {
            throw new NoWhenBranchMatchedException();
        }
        xd xdVar = (xd) content;
        ratingBar.setVisibility(0);
        textView.setVisibility(8);
        smallActionButton.setVisibility(8);
        Context context3 = ratingBar.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        ratingBar.setIconSize(kli.a.k(context3, 26.0f));
        Context context4 = ratingBar.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        ratingBar.setGap(kli.a.k(context4, 22.0f));
        ViewGroup.LayoutParams layoutParams3 = ratingBar.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
        layoutParams4.startToStart = 0;
        layoutParams4.endToEnd = 0;
        ratingBar.setLayoutParams(layoutParams4);
        RateDelegate.b bVar2 = xdVar.f55601a;
        ratingBar.setRating$ui_kit_components_release(bVar2.f53141a);
        ratingBar.setHalfIconStep$ui_kit_components_release(false);
        ratingBar.setMinRating$ui_kit_components_release(BitmapDescriptorFactory.HUE_RED);
        ratingBar.setMaxRating$ui_kit_components_release(bVar2.f53142b);
    }
}
