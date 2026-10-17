package com.revolut.core.ui_kit.delegates.widgets;

import android.graphics.Rect;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.card_design.CardsEmptyStateView;
import com.revolut.core.ui_kit.models.AnimationRequest;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class v extends op0.p {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final CardsEmptyStateView f55524j;
    public final TextView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f55525l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public u f55526m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Rect f55527n;
    public final op0.h0 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.cardWidget_emptyStateView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f55524j = (CardsEmptyStateView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.cardWidget_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.k = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.cardWidget_description);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f55525l = (TextView) viewFindViewById3;
        this.f55526m = t.f55509a;
        this.f55527n = new Rect();
        this.o = new op0.h0(itemView, this);
        itemView.addOnAttachStateChangeListener(new op0.g0(itemView, this));
    }

    public static final void H(View view, v vVar) {
        CardsEmptyStateView cardsEmptyStateView = vVar.f55524j;
        u uVar = vVar.f55526m;
        if (uVar instanceof r) {
            AnimationRequest animationRequest = ((r) uVar).f55486a;
            if (animationRequest.f57724a) {
                return;
            }
            Rect rect = vVar.f55527n;
            boolean globalVisibleRect = view.getGlobalVisibleRect(rect);
            float height = view.getHeight();
            float fHeight = rect.height();
            float f = BitmapDescriptorFactory.HUE_RED;
            if (globalVisibleRect && height > BitmapDescriptorFactory.HUE_RED) {
                f = fHeight / height;
            }
            if (f > 0.5f && !cardsEmptyStateView.e.isRunning()) {
                cardsEmptyStateView.e.start();
                animationRequest.f57724a = true;
            } else if (f < 0.1f) {
                cardsEmptyStateView.f();
            }
        }
    }
}
