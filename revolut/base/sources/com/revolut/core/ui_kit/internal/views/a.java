package com.revolut.core.ui_kit.internal.views;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.ContextualSegmentedBarView;
import com.revolut.core.ui_kit_resources.R$attr;
import iv0.s;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a extends koi.b {
    public final View f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AppCompatTextView f56493g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AppCompatTextView f56494h;
    public final /* synthetic */ ContextualSegmentedBarView.ItemDelegate i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ContextualSegmentedBarView.ItemDelegate itemDelegate, ConstraintLayout itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.i = itemDelegate;
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Context context = itemView.getContext();
        Intrinsics.h(context);
        int iK = kli.a.k(context, 4.0f);
        int iK2 = kli.a.k(context, 8.0f);
        View view = new View(context);
        view.setId(R$id.internal_contextualSegmentedBar_item_colorIndicator);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(iK2, iK2);
        layoutParams.topToTop = 0;
        layoutParams.bottomToBottom = 0;
        layoutParams.startToStart = 0;
        layoutParams.setMargins(iK, iK, iK, iK);
        view.setLayoutParams(layoutParams);
        view.setOutlineProvider(new s(kli.a.l(context, 2.0f), true));
        view.setClipToOutline(true);
        this.f = view;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, null, R$attr.internal_textAppearanceBody2);
        appCompatTextView.setId(R$id.internal_contextualSegmentedBar_item_label);
        appCompatTextView.setTextColor(kli.a.u(R$attr.uikit_colorGreyTone50, context));
        appCompatTextView.setTextAlignment(5);
        appCompatTextView.setMaxLines(3);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(0, -2);
        layoutParams2.topToTop = 0;
        layoutParams2.startToEnd = view.getId();
        layoutParams2.endToStart = R$id.internal_contextualSegmentedBar_item_value;
        layoutParams2.setMarginStart(iK2);
        layoutParams2.setMarginEnd(kli.a.k(context, 10.0f));
        appCompatTextView.setLayoutParams(layoutParams2);
        this.f56493g = appCompatTextView;
        View guideline = new Guideline(context);
        guideline.setId(R$id.internal_contextualSegmentedBar_item_guideline);
        ConstraintLayout.LayoutParams layoutParams3 = new ConstraintLayout.LayoutParams(-2, -2);
        layoutParams3.orientation = 1;
        layoutParams3.guidePercent = 0.45f;
        guideline.setLayoutParams(layoutParams3);
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, null, R$attr.internal_textAppearanceEmphasis2);
        appCompatTextView2.setId(R$id.internal_contextualSegmentedBar_item_value);
        appCompatTextView2.setTextColor(kli.a.u(R$attr.uikit_colorForeground, context));
        appCompatTextView2.setSingleLine(true);
        appCompatTextView2.setTextAlignment(5);
        ConstraintLayout.LayoutParams layoutParams4 = new ConstraintLayout.LayoutParams(-2, -2);
        layoutParams4.topToTop = 0;
        layoutParams4.endToEnd = 0;
        layoutParams4.startToEnd = guideline.getId();
        layoutParams4.constrainedWidth = true;
        layoutParams4.horizontalBias = 1.0f;
        appCompatTextView2.setLayoutParams(layoutParams4);
        this.f56494h = appCompatTextView2;
        itemView.addView(view);
        itemView.addView(appCompatTextView);
        itemView.addView(guideline);
        itemView.addView(appCompatTextView2);
    }
}
