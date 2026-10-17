package ip0;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.views.CircleStepsView;
import com.revolut.core.ui_kit.views.ProgressWithTextOnSidesView;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class va0 extends koi.b {
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f166800g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CircleStepsView f166801h;
    public final ProgressWithTextOnSidesView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f166802j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va0(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.rewardProgress_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.rewardProgress_amount);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f166800g = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.rewardProgress_circleSteps);
        CircleStepsView circleStepsView = (CircleStepsView) viewFindViewById3;
        Context context = circleStepsView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        circleStepsView.setCircleColor(kli.a.s(R$attr.uikit_colorForeground, context));
        Context context2 = circleStepsView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        circleStepsView.setFilledCircleTickColor(kli.a.s(R$attr.uikit_colorBackground, context2));
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "apply(...)");
        this.f166801h = circleStepsView;
        View viewFindViewById4 = itemView.findViewById(R$id.rewardProgress_progressWithTextOnSides);
        ProgressWithTextOnSidesView progressWithTextOnSidesView = (ProgressWithTextOnSidesView) viewFindViewById4;
        Context context3 = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        progressWithTextOnSidesView.setTextColor(kli.a.s(R$attr.uikit_colorForeground_60, context3));
        Context context4 = progressWithTextOnSidesView.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        int iS = kli.a.s(R$attr.uikit_colorForeground_10, context4);
        Context context5 = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        progressWithTextOnSidesView.setProgressColor(iS, kli.a.s(R$attr.uikit_colorForeground, context5));
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "apply(...)");
        this.i = progressWithTextOnSidesView;
        View viewFindViewById5 = itemView.findViewById(R$id.rewardProgress_action);
        TextView textView = (TextView) viewFindViewById5;
        j01.d dVar = j01.e.Companion;
        Intrinsics.h(textView);
        dVar.getClass();
        j01.d.a(textView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "apply(...)");
        this.f166802j = textView;
    }
}
