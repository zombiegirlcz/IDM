package ip0;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.views.HorizontalStepsProgressView;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h60 extends koi.b {
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f164514g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f164515h;
    public final ImageView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final HorizontalStepsProgressView f164516j;
    public final ProgressBar k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h60(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        int i = R$attr.uikit_colorGreyTone20_50;
        int i2 = R$attr.uikit_colorBlue;
        float fA = com.google.android.gms.internal.mlkit_vision_face.a.a(itemView, "getContext(...)", 4.0f);
        View viewFindViewById = itemView.findViewById(R$id.progressionCount_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.progressionCount_description);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f164514g = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.progressionCount_caption);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f164515h = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.progressionCount_image);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = (ImageView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.progressionCount_progressSteps);
        HorizontalStepsProgressView horizontalStepsProgressView = (HorizontalStepsProgressView) viewFindViewById5;
        Context context = horizontalStepsProgressView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        horizontalStepsProgressView.setBaseColor(kli.a.s(i, context));
        Context context2 = horizontalStepsProgressView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        horizontalStepsProgressView.setProgressColor(kli.a.s(i2, context2));
        horizontalStepsProgressView.setProgressBarRadiusDp(fA);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "apply(...)");
        this.f164516j = horizontalStepsProgressView;
        View viewFindViewById6 = itemView.findViewById(R$id.progressionCount_progressLinear);
        ProgressBar progressBar = (ProgressBar) viewFindViewById6;
        GradientDrawable gradientDrawable = new GradientDrawable();
        Context context3 = progressBar.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        gradientDrawable.setColor(ColorStateList.valueOf(kli.a.s(i, context3)));
        gradientDrawable.setCornerRadius(fA);
        Unit unit = Unit.f186387a;
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        Context context4 = progressBar.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        gradientDrawable2.setColor(ColorStateList.valueOf(kli.a.s(i2, context4)));
        gradientDrawable2.setCornerRadius(fA);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, new ClipDrawable(gradientDrawable2, 8388611, 1)});
        layerDrawable.setId(0, R.id.background);
        layerDrawable.setId(1, R.id.progress);
        progressBar.setProgressDrawable(layerDrawable);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "apply(...)");
        this.k = progressBar;
    }
}
