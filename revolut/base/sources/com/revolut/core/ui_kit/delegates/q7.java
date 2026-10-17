package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.views.slider.SliderTitledView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class q7 extends koi.b {
    public final SliderTitledView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AppCompatTextView f54621g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AppCompatTextView f54622h;
    public final AppCompatTextView i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q7(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.slider);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (SliderTitledView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.slider_valueText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f54621g = (AppCompatTextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f54622h = (AppCompatTextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.slider_description);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = (AppCompatTextView) viewFindViewById4;
    }

    public final void F(m7 gravity) {
        Intrinsics.checkNotNullParameter(gravity, "gravity");
        int i = p7.f54577a[gravity.ordinal()];
        AppCompatTextView appCompatTextView = this.f54621g;
        AppCompatTextView appCompatTextView2 = this.f54622h;
        AppCompatTextView appCompatTextView3 = this.i;
        if (i == 1) {
            appCompatTextView3.setGravity(8388611);
            ViewGroup.LayoutParams layoutParams = appCompatTextView2.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.startToStart = 0;
            layoutParams2.endToStart = -1;
            layoutParams2.horizontalChainStyle = -1;
            appCompatTextView2.setLayoutParams(layoutParams2);
            ViewGroup.LayoutParams layoutParams3 = appCompatTextView.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
            layoutParams4.startToEnd = -1;
            layoutParams4.endToEnd = 0;
            appCompatTextView.setLayoutParams(layoutParams4);
            return;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        appCompatTextView3.setGravity(17);
        ViewGroup.LayoutParams layoutParams5 = appCompatTextView2.getLayoutParams();
        if (layoutParams5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams6 = (ConstraintLayout.LayoutParams) layoutParams5;
        layoutParams6.startToStart = 0;
        layoutParams6.endToStart = R$id.slider_valueText;
        layoutParams6.horizontalChainStyle = 2;
        appCompatTextView2.setLayoutParams(layoutParams6);
        ViewGroup.LayoutParams layoutParams7 = appCompatTextView.getLayoutParams();
        if (layoutParams7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams8 = (ConstraintLayout.LayoutParams) layoutParams7;
        layoutParams8.startToEnd = R$id.title;
        layoutParams8.endToEnd = 0;
        appCompatTextView.setLayoutParams(layoutParams8);
    }
}
