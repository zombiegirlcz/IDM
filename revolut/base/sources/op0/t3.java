package op0;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class t3 extends p {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ImageView f227426j;
    public final ImageView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ImageView f227427l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TextView f227428m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ImageView f227429n;
    public final ImageView o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ImageView f227430p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final fp0.p f227431q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final fp0.p f227432r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final fp0.p f227433s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TagView f227434t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.quickActionWidget_image);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f227426j = (ImageView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.quickActionWidget_badge);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.k = (ImageView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.quickActionWidget_badgeTop);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f227427l = (ImageView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.quickActionWidget_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f227428m = (TextView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.quickActionWidget_mainAction);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById5;
        this.f227429n = imageView;
        View viewFindViewById6 = itemView.findViewById(R$id.quickActionWidget_rightAction);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        ImageView imageView2 = (ImageView) viewFindViewById6;
        this.o = imageView2;
        View viewFindViewById7 = itemView.findViewById(R$id.quickActionWidget_leftAction);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        ImageView imageView3 = (ImageView) viewFindViewById7;
        this.f227430p = imageView3;
        fp0.m mVar = fp0.p.Companion;
        Context context = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        gp0.h hVar = new gp0.h(new hp0.c(null, dr0.l.c(context, new Color.Solid(R$attr.uikit_colorForeground)), 1), new gp0.f(gp0.c.FOREGROUND, 2), new fp0.d(new Color.Solid(R$attr.uikit_colorAccentNeutral), new Color.Solid(R$attr.uikit_colorAccentNeutral_10), false));
        mVar.getClass();
        this.f227431q = fp0.m.a(imageView, hVar);
        gp0.b bVar = gp0.b.f145198a;
        this.f227432r = fp0.m.a(imageView2, bVar);
        this.f227433s = fp0.m.a(imageView3, bVar);
        View viewFindViewById8 = itemView.findViewById(R$id.quickActionWidget_tag);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.f227434t = (TagView) viewFindViewById8;
    }
}
