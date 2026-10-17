package ip0;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.internal.views.revpoints.RevPointsPriceView;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.flexbox.FlexboxLayout;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class av extends koi.b {
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f163493g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f163494h;
    public final ImageView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f163495j;
    public final SmallActionButton k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final SmallActionButton f163496l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final FlexboxLayout f163497m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ImageView f163498n;
    public final ImageView o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final RevPointsPriceView f163499p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final fp0.p f163500q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final fp0.p f163501r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public av(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.listingCardSmall_titleText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.listingCardSmall_subtitleText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f163493g = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.listingCardSmall_descriptionText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f163494h = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.listingCardSmall_subtitleImage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = (ImageView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.listingCardSmall_bottomText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f163495j = (TextView) viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(R$id.listingCardSmall_bottomButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.k = (SmallActionButton) viewFindViewById6;
        View viewFindViewById7 = itemView.findViewById(R$id.listingCardSmall_secondaryBottomButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.f163496l = (SmallActionButton) viewFindViewById7;
        View viewFindViewById8 = itemView.findViewById(R$id.listingCardSmall_tagsContainer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.f163497m = (FlexboxLayout) viewFindViewById8;
        View viewFindViewById9 = itemView.findViewById(R$id.listingCardSmall_image);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        this.f163498n = (ImageView) viewFindViewById9;
        View viewFindViewById10 = itemView.findViewById(R$id.listingCardSmall_topRightImage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById10;
        this.o = imageView;
        View viewFindViewById11 = itemView.findViewById(R$id.listingCardSmall_priceRevPoints);
        RevPointsPriceView revPointsPriceView = (RevPointsPriceView) viewFindViewById11;
        revPointsPriceView.setStyle(mu0.a.MEDIUM);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "apply(...)");
        this.f163499p = revPointsPriceView;
        fp0.m mVar = fp0.p.Companion;
        gp0.c cVar = gp0.c.FOREGROUND;
        gp0.h hVar = new gp0.h(new gp0.f(cVar, 2), fp0.j.f137025a);
        mVar.getClass();
        this.f163500q = fp0.m.a(itemView, hVar);
        Context context = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f163501r = fp0.m.a(imageView, new gp0.h(new hp0.c(null, dr0.l.c(context, new Color.Solid(R$attr.uikit_colorForeground)), 1), new gp0.f(cVar, 2), new fp0.g(new Color.Solid(R$attr.uikit_colorWhite))));
    }
}
