package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.models.Clause;
import ip0.au;
import ip0.bu;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class l8 extends koi.b {
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f54426g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ImageView f54427h;
    public final TextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f54428j;
    public final TextView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f54429l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l8(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.internalDelegateListCell_titleSmall);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.internalDelegateListCell_titleNormal);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f54426g = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.internalDelegateListCell_icon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f54427h = (ImageView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.internalDelegateListCell_description);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = (TextView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.internalDelegateListCell_bulletNumber);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f54428j = (TextView) viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(R$id.internalDelegateListCell_badge);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.k = (TextView) viewFindViewById6;
        View viewFindViewById7 = itemView.findViewById(R$id.internalDelegateListCell_action);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.f54429l = (TextView) viewFindViewById7;
    }

    public final void F(ListCellDelegate.Model data, Function1 click) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(click, "click");
        Clause clause = data.f52695c;
        au titleSize = data.d;
        int i = titleSize == au.SMALL ? 0 : 8;
        TextView textView = this.f;
        textView.setVisibility(i);
        int i2 = titleSize != au.NORMAL ? 8 : 0;
        TextView textView2 = this.f54426g;
        textView2.setVisibility(i2);
        Intrinsics.checkNotNullParameter(titleSize, "titleSize");
        int i3 = bu.f163656a[titleSize.ordinal()];
        if (i3 == 1) {
            textView = textView2;
        } else if (i3 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        kli.a.d(textView, clause, data, click, 8);
    }
}
