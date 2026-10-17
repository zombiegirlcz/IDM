package com.revolut.core.ui_kit.delegates;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class j0 extends koi.b {
    public final AppCompatImageView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AppCompatTextView f54314g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AppCompatTextView f54315h;
    public final AppCompatTextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TagView f54316j;
    public final View k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.attributeSelectorIcon_icon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (AppCompatImageView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.attributeSelectorIcon_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f54314g = (AppCompatTextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.attributeSelectorIcon_subtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f54315h = (AppCompatTextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.attributeSelectorIcon_description);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = (AppCompatTextView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.attributeSelectorIcon_badge);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f54316j = (TagView) viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(R$id.attributeSelectorIcon_background);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.k = viewFindViewById6;
    }
}
