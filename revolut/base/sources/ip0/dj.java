package ip0;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.drawables.LineOfDotsDrawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class dj extends koi.b {
    public final ImageView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f163909g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f163910h;
    public final TextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f163911j;
    public final TextView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f163912l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TextView f163913m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f163914n;
    public final TextView o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f163915p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dj(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.flightDetails_root);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        View viewFindViewById2 = itemView.findViewById(R$id.flightDetails_airlineIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f = (ImageView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.flightDetails_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f163909g = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.flightDetails_timeDeparture);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f163910h = (TextView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.flightDetails_departureDayOffset);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.i = (TextView) viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(R$id.flightDetails_placeDeparture);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.f163911j = (TextView) viewFindViewById6;
        View viewFindViewById7 = itemView.findViewById(R$id.flightDetails_dotsView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        View viewFindViewById8 = itemView.findViewById(R$id.flightDetails_duration);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.k = (TextView) viewFindViewById8;
        View viewFindViewById9 = itemView.findViewById(R$id.flightDetails_timeArrival);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        this.f163912l = (TextView) viewFindViewById9;
        View viewFindViewById10 = itemView.findViewById(R$id.flightDetails_arrivalDayOffset);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
        this.f163913m = (TextView) viewFindViewById10;
        View viewFindViewById11 = itemView.findViewById(R$id.flightDetails_placeArrival);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "findViewById(...)");
        this.f163914n = (TextView) viewFindViewById11;
        View viewFindViewById12 = itemView.findViewById(R$id.flightDetails_connection);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById12, "findViewById(...)");
        this.o = (TextView) viewFindViewById12;
        View viewFindViewById13 = itemView.findViewById(R$id.flightDetails_dateArrival);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById13, "findViewById(...)");
        this.f163915p = (TextView) viewFindViewById13;
        Context context = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ((ImageView) viewFindViewById7).setImageDrawable(new LineOfDotsDrawable(context, 16, sp0.l.LIGHT_TO_DARK_TO_LIGHT, sp0.k.VERTICAL));
    }
}
