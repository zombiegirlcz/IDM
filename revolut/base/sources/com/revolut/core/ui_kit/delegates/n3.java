package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.drawables.RoundedBackgroundDrawable;
import com.revolut.core.ui_kit.internal.views.chat.ChatBubbleAppearance;
import com.revolut.core.ui_kit.internal.views.chat.ChatBubbleStyle;
import com.revolut.core.ui_kit.internal.views.chat.ChatBubbleTitleStyle;
import com.revolut.core.ui_kit.internal.views.chat.ChatBubbleView;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class n3 extends koi.b {
    public final View f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f54492g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        ChatBubbleView chatBubbleView = (ChatBubbleView) itemView.findViewById(R$id.chatPreview_bubbleIncomingTop);
        ChatBubbleView chatBubbleView2 = (ChatBubbleView) itemView.findViewById(R$id.chatPreview_bubbleIncomingBottom);
        ChatBubbleView chatBubbleView3 = (ChatBubbleView) itemView.findViewById(R$id.chatPreview_bubbleOutgoingView);
        View viewFindViewById = itemView.findViewById(R$id.chatPreview_action2Overlay);
        this.f = viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.chatPreview_profileOverlay);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        View viewFindViewById3 = itemView.findViewById(R$id.chatPreview_cardsOverlay);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        View viewFindViewById4 = itemView.findViewById(R$id.chatPreview_actionOverlay);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        View viewFindViewById5 = itemView.findViewById(R$id.chatPreview_action1Overlay);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        View viewFindViewById6 = itemView.findViewById(R$id.chatPreview_buttonOverlay);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        List listK = zhm.v.k(viewFindViewById2, viewFindViewById3, viewFindViewById4, viewFindViewById5, viewFindViewById6);
        this.f54492g = listK;
        ShapeAppearanceModel shapeAppearanceModel = new ShapeAppearanceModel();
        Context context = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ShapeAppearanceModel shapeAppearanceModelWithCornerSize = shapeAppearanceModel.withCornerSize(kli.a.l(context, 20.0f));
        Intrinsics.checkNotNullExpressionValue(shapeAppearanceModelWithCornerSize, "withCornerSize(...)");
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(shapeAppearanceModelWithCornerSize);
        Context context2 = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        materialShapeDrawable.setFillColor(ColorStateList.valueOf(kli.a.s(R$attr.uikit_colorGroupedBackground, context2)));
        itemView.setBackground(materialShapeDrawable);
        MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable(shapeAppearanceModelWithCornerSize);
        Context context3 = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        materialShapeDrawable2.setStrokeWidth(kli.a.l(context3, 1.0f));
        Context context4 = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        ChatPreviewDelegate.INSTANCE.getClass();
        materialShapeDrawable2.setStrokeColor(ColorStateList.valueOf(kli.a.s(ChatPreviewDelegate.f52057c, context4)));
        materialShapeDrawable2.setFillColor(ColorStateList.valueOf(0));
        itemView.setForeground(materialShapeDrawable2);
        itemView.setClipToOutline(true);
        Context context5 = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        Context context6 = viewFindViewById.getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
        int i = 4;
        viewFindViewById.setBackground(new RoundedBackgroundDrawable(context5, kli.a.s(R$attr.uikit_colorAccentNeutral, context6), i));
        xo0.g gVar = xo0.g.INCOMING_FIRST;
        ChatBubbleStyle.Light light = ChatBubbleStyle.Light.f56809a;
        ChatBubbleTitleStyle.Foreground foreground = ChatBubbleTitleStyle.Foreground.f56816a;
        chatBubbleView.h0(new ChatBubbleAppearance(light, foreground, gVar));
        chatBubbleView2.h0(new ChatBubbleAppearance(light, foreground, xo0.g.INCOMING_LAST));
        chatBubbleView3.h0(new ChatBubbleAppearance(ChatBubbleStyle.Blue.f56805a, ChatBubbleTitleStyle.White.f56817a, xo0.g.OUTGOING_TAIL));
        int size = listK.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = (View) listK.get(i2);
            Context context7 = itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
            Context context8 = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context8, "getContext(...)");
            view.setBackground(new RoundedBackgroundDrawable(context7, kli.a.s(R$attr.uikit_colorGreyTone8, context8), i));
        }
    }
}
