package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewStub;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.NewRevolutCardDelegate;
import com.revolut.core.ui_kit.views.NewRevolutCardView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class o9 extends koi.b {
    public final ViewStub f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public NewRevolutCardView f54534g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final NewRevolutCardView f54535h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public NewRevolutCardDelegate.Model f54536j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o9(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.internalDelegateNewRevolutCard_designChangeOverlayStub);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (ViewStub) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.internalDelegateNewRevolutCard_cardView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f54535h = (NewRevolutCardView) viewFindViewById2;
    }

    public final NewRevolutCardView F() {
        NewRevolutCardView newRevolutCardView = this.f54534g;
        if (newRevolutCardView != null) {
            return newRevolutCardView;
        }
        View viewInflate = this.f.inflate();
        Intrinsics.i(viewInflate, "null cannot be cast to non-null type com.revolut.core.ui_kit.views.NewRevolutCardView");
        NewRevolutCardView newRevolutCardView2 = (NewRevolutCardView) viewInflate;
        this.f54534g = newRevolutCardView2;
        return newRevolutCardView2;
    }
}
