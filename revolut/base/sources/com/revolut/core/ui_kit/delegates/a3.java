package com.revolut.core.ui_kit.delegates;

import android.R;
import android.content.Context;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a3 extends koi.b {
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AppCompatImageView f53658g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f53659h;
    public final TextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ProgressBar f53660j;
    public final r10.v k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final LayerDrawable f53661l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f53662m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(View itemView, ihm.f onTitleClickSubject) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(onTitleClickSubject, "onTitleClickSubject");
        View viewFindViewById = itemView.findViewById(R$id.cellDetailsTextProgress_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById;
        this.f = textView;
        View viewFindViewById2 = itemView.findViewById(R$id.cellDetailsTextProgress_titleEndImage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        AppCompatImageView appCompatImageView = (AppCompatImageView) viewFindViewById2;
        this.f53658g = appCompatImageView;
        View viewFindViewById3 = itemView.findViewById(R$id.cellDetailsTextProgress_endText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f53659h = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.cellDetailsTextProgress_description);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = (TextView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.cellDetailsTextProgress_progress);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f53660j = (ProgressBar) viewFindViewById5;
        this.k = new r10.v(new View[]{textView, appCompatImageView}, onTitleClickSubject);
        Context context = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{dr0.l.h(context, 2.0f, new Color.Solid(R$attr.uikit_colorGreyTone10), 0, null), new ClipDrawable(dr0.l.h(context, 2.0f, new Color.Solid(R$attr.uikit_colorAccent), 0, null), 8388611, 1)});
        layerDrawable.setId(0, R.id.background);
        layerDrawable.setId(1, R.id.progress);
        this.f53661l = layerDrawable;
    }
}
