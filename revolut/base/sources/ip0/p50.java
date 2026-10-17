package ip0;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class p50 extends koi.b {
    public final ImageView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f165766g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ImageView f165767h;
    public final TextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f165768j;
    public final TextView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f165769l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TextView f165770m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f165771n;
    public final TextView o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f165772p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p50(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.progressSteps_step1);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (ImageView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.progressSteps_step2);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f165766g = (ImageView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.progressSteps_step3);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f165767h = (ImageView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.progressSteps_step1Title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = (TextView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.progressSteps_step2Title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f165768j = (TextView) viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(R$id.progressSteps_step3Title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.k = (TextView) viewFindViewById6;
        View viewFindViewById7 = itemView.findViewById(R$id.progressSteps_step1Subtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.f165769l = (TextView) viewFindViewById7;
        View viewFindViewById8 = itemView.findViewById(R$id.progressSteps_step2Subtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.f165770m = (TextView) viewFindViewById8;
        View viewFindViewById9 = itemView.findViewById(R$id.progressSteps_step3Subtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        this.f165771n = (TextView) viewFindViewById9;
        View viewFindViewById10 = itemView.findViewById(R$id.progressSteps_caption);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
        this.o = (TextView) viewFindViewById10;
        View viewFindViewById11 = itemView.findViewById(R$id.progressSteps_counter);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "findViewById(...)");
        this.f165772p = (TextView) viewFindViewById11;
    }
}
