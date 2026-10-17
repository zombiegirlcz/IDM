package ip0;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class lk0 extends koi.b {
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f165217g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f165218h;
    public final LinearLayout i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinearLayout f165219j;
    public final LinearLayout k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ImageView f165220l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ImageView f165221m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ImageView f165222n;
    public final View o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lk0(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.themeSwitcher_dayLabel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.themeSwitcher_nightLabel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f165217g = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.themeSwitcher_systemLabel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f165218h = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.themeSwitcher_day);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = (LinearLayout) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.themeSwitcher_night);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f165219j = (LinearLayout) viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(R$id.themeSwitcher_system);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.k = (LinearLayout) viewFindViewById6;
        View viewFindViewById7 = itemView.findViewById(R$id.themeSwitcher_dayCheck);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.f165220l = (ImageView) viewFindViewById7;
        View viewFindViewById8 = itemView.findViewById(R$id.themeSwitcher_nightCheck);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.f165221m = (ImageView) viewFindViewById8;
        View viewFindViewById9 = itemView.findViewById(R$id.themeSwitcher_systemCheck);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        this.f165222n = (ImageView) viewFindViewById9;
        View viewFindViewById10 = itemView.findViewById(R$id.themeSwitcher_space2);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
        this.o = viewFindViewById10;
    }
}
